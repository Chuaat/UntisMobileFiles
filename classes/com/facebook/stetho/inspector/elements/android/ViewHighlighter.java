// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.Util;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import android.annotation.TargetApi;
import c6.h;
import android.graphics.Rect;
import android.view.View;
import com.facebook.stetho.common.LogUtil;
import android.os.Build$VERSION;

abstract class ViewHighlighter
{
    protected ViewHighlighter() {
    }
    
    public static ViewHighlighter newInstance() {
        if (Build$VERSION.SDK_INT >= 18) {
            return new OverlayHighlighter();
        }
        LogUtil.w("Running on pre-JBMR2: View highlighting is not supported");
        return new NoopHighlighter();
    }
    
    public abstract void clearHighlight();
    
    public abstract void setHighlightedView(final View p0, @h final Rect p1, final int p2);
    
    private static final class NoopHighlighter extends ViewHighlighter
    {
        @Override
        public void clearHighlight() {
        }
        
        @Override
        public void setHighlightedView(final View view, @h final Rect rect, final int n) {
        }
    }
    
    @TargetApi(18)
    private static final class OverlayHighlighter extends ViewHighlighter
    {
        private AtomicReference<Rect> mBoundsToHighlight;
        private AtomicInteger mContentColor;
        private final Rect mEmptyRect;
        private final Handler mHandler;
        private final ViewHighlightOverlays mHighlightOverlays;
        private final Runnable mHighlightViewOnUiThreadRunnable;
        private final Rect mHighlightedBounds;
        private View mHighlightedView;
        private AtomicReference<View> mViewToHighlight;
        
        public OverlayHighlighter() {
            this.mHighlightOverlays = ViewHighlightOverlays.newInstance();
            this.mHighlightedBounds = new Rect();
            this.mEmptyRect = new Rect();
            this.mViewToHighlight = new AtomicReference<View>();
            this.mBoundsToHighlight = new AtomicReference<Rect>();
            this.mContentColor = new AtomicInteger();
            this.mHighlightViewOnUiThreadRunnable = new Runnable() {
                @Override
                public void run() {
                    OverlayHighlighter.this.highlightViewOnUiThread();
                }
            };
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        
        private void highlightViewOnUiThread() {
            final View mHighlightedView = this.mViewToHighlight.getAndSet(null);
            Rect mEmptyRect;
            if ((mEmptyRect = this.mBoundsToHighlight.getAndSet(null)) == null) {
                mEmptyRect = this.mEmptyRect;
            }
            if (mHighlightedView == this.mHighlightedView && this.mHighlightedBounds.equals((Object)mEmptyRect)) {
                return;
            }
            final View mHighlightedView2 = this.mHighlightedView;
            if (mHighlightedView2 != null) {
                this.mHighlightOverlays.removeHighlight(mHighlightedView2);
            }
            if (mHighlightedView != null) {
                this.mHighlightOverlays.highlightView(mHighlightedView, mEmptyRect, this.mContentColor.get());
            }
            this.mHighlightedView = mHighlightedView;
            final Rect mHighlightedBounds = this.mHighlightedBounds;
            if (mEmptyRect == null) {
                mHighlightedBounds.setEmpty();
            }
            else {
                mHighlightedBounds.set(mEmptyRect);
            }
        }
        
        private void setHighlightedViewImpl(@h final View newValue, @h final Rect newValue2, final int newValue3) {
            this.mHandler.removeCallbacks(this.mHighlightViewOnUiThreadRunnable);
            this.mViewToHighlight.set(newValue);
            this.mBoundsToHighlight.set(newValue2);
            this.mContentColor.set(newValue3);
            this.mHandler.postDelayed(this.mHighlightViewOnUiThreadRunnable, 100L);
        }
        
        @Override
        public void clearHighlight() {
            this.setHighlightedViewImpl(null, null, 0);
        }
        
        @Override
        public void setHighlightedView(final View view, @h final Rect rect, final int n) {
            this.setHighlightedViewImpl(Util.throwIfNull(view), rect, n);
        }
    }
}
