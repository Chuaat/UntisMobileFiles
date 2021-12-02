// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.screencast;

import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import java.io.OutputStream;
import android.util.Base64OutputStream;
import android.graphics.Bitmap$CompressFormat;
import android.view.View;
import android.app.Activity;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Bitmap$Config;
import com.facebook.stetho.common.LogUtil;
import android.os.Looper;
import android.graphics.RectF;
import java.io.ByteArrayOutputStream;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import android.os.HandlerThread;
import com.facebook.stetho.inspector.protocol.module.Page;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.os.Handler;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;

public final class ScreencastDispatcher
{
    private static final long FRAME_DELAY = 200L;
    private final ActivityTracker mActivityTracker;
    private Handler mBackgroundHandler;
    private Bitmap mBitmap;
    private final BitmapFetchRunnable mBitmapFetchRunnable;
    private Canvas mCanvas;
    private Page.ScreencastFrameEvent mEvent;
    private final EventDispatchRunnable mEventDispatchRunnable;
    private HandlerThread mHandlerThread;
    private boolean mIsRunning;
    private final Handler mMainHandler;
    private Page.ScreencastFrameEventMetadata mMetadata;
    private JsonRpcPeer mPeer;
    private Page.StartScreencastRequest mRequest;
    private ByteArrayOutputStream mStream;
    private final RectF mTempDst;
    private final RectF mTempSrc;
    
    public ScreencastDispatcher() {
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mBitmapFetchRunnable = new BitmapFetchRunnable();
        this.mActivityTracker = ActivityTracker.get();
        this.mEventDispatchRunnable = new EventDispatchRunnable();
        this.mTempSrc = new RectF();
        this.mTempDst = new RectF();
        this.mEvent = new Page.ScreencastFrameEvent();
        this.mMetadata = new Page.ScreencastFrameEventMetadata();
    }
    
    public void startScreencast(final JsonRpcPeer mPeer, final Page.StartScreencastRequest mRequest) {
        LogUtil.d("Starting screencast");
        this.mRequest = mRequest;
        (this.mHandlerThread = new HandlerThread("Screencast Thread")).start();
        this.mPeer = mPeer;
        this.mIsRunning = true;
        this.mStream = new ByteArrayOutputStream();
        this.mBackgroundHandler = new Handler(this.mHandlerThread.getLooper());
        this.mMainHandler.postDelayed((Runnable)this.mBitmapFetchRunnable, 200L);
    }
    
    public void stopScreencast() {
        LogUtil.d("Stopping screencast");
        this.mBackgroundHandler.post((Runnable)new CancellationRunnable());
    }
    
    private class BitmapFetchRunnable implements Runnable
    {
        private void updateScreenBitmap() {
            if (!ScreencastDispatcher.this.mIsRunning) {
                return;
            }
            final Activity tryGetTopActivity = ScreencastDispatcher.this.mActivityTracker.tryGetTopActivity();
            if (tryGetTopActivity == null) {
                return;
            }
            final View decorView = tryGetTopActivity.getWindow().getDecorView();
            try {
                if (ScreencastDispatcher.this.mBitmap == null) {
                    final int width = decorView.getWidth();
                    final int height = decorView.getHeight();
                    final float n = (float)ScreencastDispatcher.this.mRequest.maxWidth;
                    final float n2 = (float)width;
                    final float a = n / n2;
                    final float n3 = (float)ScreencastDispatcher.this.mRequest.maxHeight;
                    final float n4 = (float)height;
                    final float min = Math.min(a, n3 / n4);
                    final int n5 = (int)(n2 * min);
                    final int n6 = (int)(min * n4);
                    ScreencastDispatcher.this.mBitmap = Bitmap.createBitmap(n5, n6, Bitmap$Config.RGB_565);
                    ScreencastDispatcher.this.mCanvas = new Canvas(ScreencastDispatcher.this.mBitmap);
                    final Matrix matrix = new Matrix();
                    ScreencastDispatcher.this.mTempSrc.set(0.0f, 0.0f, n2, n4);
                    ScreencastDispatcher.this.mTempDst.set(0.0f, 0.0f, (float)n5, (float)n6);
                    matrix.setRectToRect(ScreencastDispatcher.this.mTempSrc, ScreencastDispatcher.this.mTempDst, Matrix$ScaleToFit.CENTER);
                    ScreencastDispatcher.this.mCanvas.setMatrix(matrix);
                }
                decorView.draw(ScreencastDispatcher.this.mCanvas);
            }
            catch (OutOfMemoryError outOfMemoryError) {
                LogUtil.w("Out of memory trying to allocate screencast Bitmap.");
            }
        }
        
        @Override
        public void run() {
            this.updateScreenBitmap();
            ScreencastDispatcher.this.mBackgroundHandler.post((Runnable)ScreencastDispatcher.this.mEventDispatchRunnable.withEndAction(this));
        }
    }
    
    private class CancellationRunnable implements Runnable
    {
        @Override
        public void run() {
            ScreencastDispatcher.this.mHandlerThread.interrupt();
            ScreencastDispatcher.this.mMainHandler.removeCallbacks((Runnable)ScreencastDispatcher.this.mBitmapFetchRunnable);
            ScreencastDispatcher.this.mBackgroundHandler.removeCallbacks((Runnable)ScreencastDispatcher.this.mEventDispatchRunnable);
            ScreencastDispatcher.this.mIsRunning = false;
            ScreencastDispatcher.this.mHandlerThread = null;
            ScreencastDispatcher.this.mBitmap = null;
            ScreencastDispatcher.this.mCanvas = null;
            ScreencastDispatcher.this.mStream = null;
        }
    }
    
    private class EventDispatchRunnable implements Runnable
    {
        private Runnable mEndAction;
        
        private EventDispatchRunnable withEndAction(final Runnable mEndAction) {
            this.mEndAction = mEndAction;
            return this;
        }
        
        @Override
        public void run() {
            if (ScreencastDispatcher.this.mIsRunning) {
                if (ScreencastDispatcher.this.mBitmap != null) {
                    final int width = ScreencastDispatcher.this.mBitmap.getWidth();
                    final int height = ScreencastDispatcher.this.mBitmap.getHeight();
                    ScreencastDispatcher.this.mStream.reset();
                    ScreencastDispatcher.this.mBitmap.compress(Bitmap$CompressFormat.valueOf(ScreencastDispatcher.this.mRequest.format.toUpperCase()), ScreencastDispatcher.this.mRequest.quality, (OutputStream)new Base64OutputStream((OutputStream)ScreencastDispatcher.this.mStream, 0));
                    ScreencastDispatcher.this.mEvent.data = ScreencastDispatcher.this.mStream.toString();
                    ScreencastDispatcher.this.mMetadata.pageScaleFactor = 1;
                    ScreencastDispatcher.this.mMetadata.deviceWidth = width;
                    ScreencastDispatcher.this.mMetadata.deviceHeight = height;
                    ScreencastDispatcher.this.mEvent.metadata = ScreencastDispatcher.this.mMetadata;
                    ScreencastDispatcher.this.mPeer.invokeMethod("Page.screencastFrame", ScreencastDispatcher.this.mEvent, null);
                    ScreencastDispatcher.this.mMainHandler.postDelayed(this.mEndAction, 200L);
                }
            }
        }
    }
}
