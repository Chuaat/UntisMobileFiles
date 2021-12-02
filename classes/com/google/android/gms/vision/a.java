// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision;

import com.google.android.gms.common.util.d0;
import android.os.SystemClock;
import android.hardware.Camera$PictureCallback;
import android.hardware.Camera$ShutterCallback;
import android.view.SurfaceHolder;
import androidx.annotation.s0;
import androidx.annotation.RecentlyNonNull;
import android.graphics.ImageFormat;
import java.util.Iterator;
import java.util.List;
import android.hardware.Camera$Parameters;
import android.hardware.Camera$PreviewCallback;
import android.view.WindowManager;
import com.google.android.gms.common.internal.x;
import android.util.Log;
import android.hardware.Camera$Size;
import java.util.ArrayList;
import java.io.IOException;
import android.hardware.Camera$CameraInfo;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;
import android.graphics.SurfaceTexture;
import c6.h;
import android.hardware.Camera;
import android.content.Context;
import android.annotation.SuppressLint;

public class a
{
    @SuppressLint({ "InlinedApi" })
    public static final int p = 0;
    @SuppressLint({ "InlinedApi" })
    public static final int q = 1;
    private Context a;
    private final Object b;
    @c6.h
    @a("cameraLock")
    private Camera c;
    private int d;
    private int e;
    private com.google.android.gms.common.images.a f;
    private float g;
    private int h;
    private int i;
    private boolean j;
    @c6.h
    private String k;
    @c6.h
    private SurfaceTexture l;
    @c6.h
    private Thread m;
    private d n;
    private final IdentityHashMap<byte[], ByteBuffer> o;
    
    private a() {
        this.b = new Object();
        this.d = 0;
        this.g = 30.0f;
        this.h = 1024;
        this.i = 768;
        this.j = false;
        this.o = new IdentityHashMap<byte[], ByteBuffer>();
    }
    
    @SuppressLint({ "InlinedApi" })
    private final Camera k() throws IOException {
        final int d = this.d;
        final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
        int i = 0;
        while (true) {
            while (i < Camera.getNumberOfCameras()) {
                Camera.getCameraInfo(i, camera$CameraInfo);
                if (camera$CameraInfo.facing == d) {
                    final int n = i;
                    if (n == -1) {
                        throw new IOException("Could not find requested camera.");
                    }
                    final Camera open = Camera.open(n);
                    final int h = this.h;
                    final int j = this.i;
                    final Camera$Parameters parameters = open.getParameters();
                    final List supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                    final List supportedPictureSizes = parameters.getSupportedPictureSizes();
                    final ArrayList<h> list = new ArrayList<h>();
                    for (final Camera$Size camera$Size : supportedPreviewSizes) {
                        final float n2 = camera$Size.width / (float)camera$Size.height;
                        for (final Camera$Size camera$Size2 : supportedPictureSizes) {
                            if (Math.abs(n2 - camera$Size2.width / (float)camera$Size2.height) < 0.01f) {
                                list.add(new h(camera$Size, camera$Size2));
                                break;
                            }
                        }
                    }
                    if (list.size() == 0) {
                        Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
                        final Iterator<Camera$Size> iterator3 = supportedPreviewSizes.iterator();
                        while (iterator3.hasNext()) {
                            list.add(new h(iterator3.next(), null));
                        }
                    }
                    final int size = list.size();
                    final int n3 = Integer.MAX_VALUE;
                    h h2 = null;
                    int k = 0;
                    int n4 = Integer.MAX_VALUE;
                    while (k < size) {
                        final h value = list.get(k);
                        final int n5 = k + 1;
                        final h h3 = value;
                        final com.google.android.gms.common.images.a a = h3.a();
                        final int n6 = Math.abs(a.b() - h) + Math.abs(a.a() - j);
                        k = n5;
                        if (n6 < n4) {
                            h2 = h3;
                            n4 = n6;
                            k = n5;
                        }
                    }
                    final h h4 = x.k(h2);
                    if (h4 == null) {
                        throw new IOException("Could not find suitable preview size.");
                    }
                    final com.google.android.gms.common.images.a b = h4.b();
                    this.f = h4.a();
                    final int n7 = (int)(this.g * 1000.0f);
                    final Iterator iterator4 = open.getParameters().getSupportedPreviewFpsRange().iterator();
                    int[] array = null;
                    int n8 = n3;
                    while (iterator4.hasNext()) {
                        final int[] array2 = iterator4.next();
                        final int n9 = Math.abs(n7 - array2[0]) + Math.abs(n7 - array2[1]);
                        if (n9 < n8) {
                            array = array2;
                            n8 = n9;
                        }
                    }
                    final int[] array3 = x.k(array);
                    if (array3 != null) {
                        final Camera$Parameters parameters2 = open.getParameters();
                        if (b != null) {
                            parameters2.setPictureSize(b.b(), b.a());
                        }
                        parameters2.setPreviewSize(this.f.b(), this.f.a());
                        parameters2.setPreviewFpsRange(array3[0], array3[1]);
                        parameters2.setPreviewFormat(17);
                        final int rotation = x.k(this.a.getSystemService("window")).getDefaultDisplay().getRotation();
                        int n10 = 0;
                        Label_0695: {
                            if (rotation != 0) {
                                if (rotation == 1) {
                                    n10 = 90;
                                    break Label_0695;
                                }
                                if (rotation == 2) {
                                    n10 = 180;
                                    break Label_0695;
                                }
                                if (rotation == 3) {
                                    n10 = 270;
                                    break Label_0695;
                                }
                                final StringBuilder sb = new StringBuilder(31);
                                sb.append("Bad rotation value: ");
                                sb.append(rotation);
                                Log.e("CameraSource", sb.toString());
                            }
                            n10 = 0;
                        }
                        final Camera$CameraInfo camera$CameraInfo2 = new Camera$CameraInfo();
                        Camera.getCameraInfo(n, camera$CameraInfo2);
                        int rotation2;
                        int displayOrientation;
                        if (camera$CameraInfo2.facing == 1) {
                            rotation2 = (camera$CameraInfo2.orientation + n10) % 360;
                            displayOrientation = (360 - rotation2) % 360;
                        }
                        else {
                            rotation2 = (displayOrientation = (camera$CameraInfo2.orientation - n10 + 360) % 360);
                        }
                        this.e = rotation2 / 90;
                        open.setDisplayOrientation(displayOrientation);
                        parameters2.setRotation(rotation2);
                        if (this.k != null) {
                            if (parameters2.getSupportedFocusModes().contains(this.k)) {
                                parameters2.setFocusMode((String)x.k(this.k));
                            }
                            else {
                                Log.w("CameraSource", String.format("FocusMode %s is not supported on this device.", this.k));
                                this.k = null;
                            }
                        }
                        if (this.k == null && this.j) {
                            if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                                parameters2.setFocusMode("continuous-video");
                                this.k = "continuous-video";
                            }
                            else {
                                Log.i("CameraSource", "Camera auto focus is not supported on this device.");
                            }
                        }
                        open.setParameters(parameters2);
                        open.setPreviewCallbackWithBuffer((Camera$PreviewCallback)new e((j)null));
                        open.addCallbackBuffer(this.p(this.f));
                        open.addCallbackBuffer(this.p(this.f));
                        open.addCallbackBuffer(this.p(this.f));
                        open.addCallbackBuffer(this.p(this.f));
                        return open;
                    }
                    throw new IOException("Could not find suitable preview frames per second range.");
                }
                else {
                    ++i;
                }
            }
            final int n = -1;
            continue;
        }
    }
    
    @SuppressLint({ "InlinedApi" })
    private final byte[] p(final com.google.android.gms.common.images.a a) {
        final byte[] array = new byte[(int)Math.ceil(a.a() * (long)a.b() * ImageFormat.getBitsPerPixel(17) / 8.0) + 1];
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        if (wrap.hasArray() && wrap.array() == array) {
            this.o.put(array, wrap);
            return array;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }
    
    public int a() {
        return this.d;
    }
    
    @RecentlyNonNull
    public com.google.android.gms.common.images.a b() {
        return this.f;
    }
    
    public void c() {
        synchronized (this.b) {
            this.f();
            this.n.a();
        }
    }
    
    @RecentlyNonNull
    @s0("android.permission.CAMERA")
    public a d() throws IOException {
        synchronized (this.b) {
            if (this.c != null) {
                return this;
            }
            this.c = this.k();
            final SurfaceTexture surfaceTexture = new SurfaceTexture(100);
            this.l = surfaceTexture;
            this.c.setPreviewTexture(surfaceTexture);
            this.c.startPreview();
            (this.m = new Thread(this.n)).setName("gms.vision.CameraSource");
            this.n.b(true);
            final Thread m = this.m;
            if (m != null) {
                m.start();
            }
            return this;
        }
    }
    
    @RecentlyNonNull
    @s0("android.permission.CAMERA")
    public a e(@RecentlyNonNull final SurfaceHolder previewDisplay) throws IOException {
        synchronized (this.b) {
            if (this.c != null) {
                return this;
            }
            (this.c = this.k()).setPreviewDisplay(previewDisplay);
            this.c.startPreview();
            this.m = new Thread(this.n);
            this.n.b(true);
            final Thread m = this.m;
            if (m != null) {
                m.start();
            }
            return this;
        }
    }
    
    public void f() {
        synchronized (this.b) {
            this.n.b(false);
            final Thread m = this.m;
            if (m != null) {
                try {
                    m.join();
                }
                catch (InterruptedException ex) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.m = null;
            }
            final Camera c = this.c;
            if (c != null) {
                c.stopPreview();
                this.c.setPreviewCallbackWithBuffer((Camera$PreviewCallback)null);
                try {
                    this.c.setPreviewTexture((SurfaceTexture)null);
                    this.l = null;
                    this.c.setPreviewDisplay((SurfaceHolder)null);
                }
                catch (Exception obj) {
                    final String value = String.valueOf(obj);
                    final StringBuilder sb = new StringBuilder(value.length() + 32);
                    sb.append("Failed to clear camera preview: ");
                    sb.append(value);
                    Log.e("CameraSource", sb.toString());
                }
                x.k(this.c).release();
                this.c = null;
            }
            this.o.clear();
        }
    }
    
    public void g(@c6.h final c c, @c6.h final b b) {
        synchronized (this.b) {
            if (this.c != null) {
                final g g = new g(null);
                g.a = c;
                final f f = new f((j)null);
                f.a = b;
                this.c.takePicture((Camera$ShutterCallback)g, (Camera$PictureCallback)null, (Camera$PictureCallback)null, (Camera$PictureCallback)f);
            }
        }
    }
    
    public static class a
    {
        private final com.google.android.gms.vision.b<?> a;
        private com.google.android.gms.vision.a b;
        
        public a(@RecentlyNonNull final Context context, @RecentlyNonNull final com.google.android.gms.vision.b<?> a) {
            final com.google.android.gms.vision.a b = new com.google.android.gms.vision.a(null);
            this.b = b;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            if (a != null) {
                this.a = a;
                b.a = context;
                return;
            }
            throw new IllegalArgumentException("No detector supplied.");
        }
        
        @RecentlyNonNull
        public com.google.android.gms.vision.a a() {
            final com.google.android.gms.vision.a b = this.b;
            b.getClass();
            b.n = new d(this.a);
            return this.b;
        }
        
        @RecentlyNonNull
        public a b(final boolean b) {
            this.b.j = b;
            return this;
        }
        
        @RecentlyNonNull
        public a c(final int i) {
            if (i != 0 && i != 1) {
                final StringBuilder sb = new StringBuilder(27);
                sb.append("Invalid camera: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.b.d = i;
            return this;
        }
        
        @RecentlyNonNull
        public a d(@RecentlyNonNull final String s) {
            if (!s.equals("continuous-video") && !s.equals("continuous-picture")) {
                Log.w("CameraSource", String.format("FocusMode %s is not supported for now.", s));
                this.b.k = null;
            }
            else {
                this.b.k = s;
            }
            return this;
        }
        
        @RecentlyNonNull
        public a e(final float f) {
            if (f > 0.0f) {
                this.b.g = f;
                return this;
            }
            final StringBuilder sb = new StringBuilder(28);
            sb.append("Invalid fps: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @RecentlyNonNull
        public a f(final int i, final int j) {
            if (i > 0 && i <= 1000000 && j > 0 && j <= 1000000) {
                this.b.h = i;
                this.b.i = j;
                return this;
            }
            final StringBuilder sb = new StringBuilder(45);
            sb.append("Invalid preview size: ");
            sb.append(i);
            sb.append("x");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    public interface b
    {
        void a(@RecentlyNonNull final byte[] p0);
    }
    
    public interface c
    {
        void onShutter();
    }
    
    private final class d implements Runnable
    {
        @c6.h
        private com.google.android.gms.vision.b<?> G;
        private long H;
        private final Object I;
        private boolean J;
        private long K;
        private int L;
        @c6.h
        private ByteBuffer M;
        
        d(final com.google.android.gms.vision.b<?> g) {
            this.H = SystemClock.elapsedRealtime();
            this.I = new Object();
            this.J = true;
            this.L = 0;
            this.G = g;
        }
        
        @SuppressLint({ "Assert" })
        final void a() {
            final com.google.android.gms.vision.b<?> g = this.G;
            if (g != null) {
                g.d();
                this.G = null;
            }
        }
        
        final void b(final boolean j) {
            synchronized (this.I) {
                this.J = j;
                this.I.notifyAll();
            }
        }
        
        final void c(final byte[] array, final Camera camera) {
            synchronized (this.I) {
                final ByteBuffer m = this.M;
                if (m != null) {
                    camera.addCallbackBuffer(m.array());
                    this.M = null;
                }
                if (!com.google.android.gms.vision.a.this.o.containsKey(array)) {
                    Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                this.K = SystemClock.elapsedRealtime() - this.H;
                ++this.L;
                this.M = com.google.android.gms.vision.a.this.o.get(array);
                this.I.notifyAll();
            }
        }
        
        @SuppressLint({ "InlinedApi" })
        @Override
        public final void run() {
            while (true) {
                final Object i = this.I;
                synchronized (i) {
                    boolean j;
                    while (true) {
                        j = this.J;
                        if (j && this.M == null) {
                            try {
                                this.I.wait();
                                continue;
                            }
                            catch (InterruptedException ex) {
                                Log.d("CameraSource", "Frame processing loop terminated.", (Throwable)ex);
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    if (!j) {
                        return;
                    }
                    final com.google.android.gms.vision.d a = new com.google.android.gms.vision.d.a().d(x.k(this.M), com.google.android.gms.vision.a.this.f.b(), com.google.android.gms.vision.a.this.f.a(), 17).c(this.L).g(this.K).f(com.google.android.gms.vision.a.this.e).a();
                    final ByteBuffer m = this.M;
                    this.M = null;
                    // monitorexit(i)
                    try {
                        try {
                            x.k(this.G).c(a);
                            x.k(com.google.android.gms.vision.a.this.c).addCallbackBuffer(x.k(m).array());
                        }
                        finally {}
                    }
                    catch (Exception i) {
                        Log.e("CameraSource", "Exception thrown from receiver.", (Throwable)i);
                        x.k(com.google.android.gms.vision.a.this.c).addCallbackBuffer(x.k(m).array());
                        continue;
                    }
                    x.k(com.google.android.gms.vision.a.this.c).addCallbackBuffer(x.k(m).array());
                }
            }
        }
    }
    
    private final class e implements Camera$PreviewCallback
    {
        public final void onPreviewFrame(final byte[] array, final Camera camera) {
            com.google.android.gms.vision.a.this.n.c(array, camera);
        }
    }
    
    private final class f implements Camera$PictureCallback
    {
        @c6.h
        private b a;
        
        public final void onPictureTaken(final byte[] array, final Camera camera) {
            final b a = this.a;
            if (a != null) {
                a.a(array);
            }
            synchronized (com.google.android.gms.vision.a.this.b) {
                if (com.google.android.gms.vision.a.this.c != null) {
                    com.google.android.gms.vision.a.this.c.startPreview();
                }
            }
        }
    }
    
    private static final class g implements Camera$ShutterCallback
    {
        @c6.h
        private c a;
        
        public final void onShutter() {
            final c a = this.a;
            if (a != null) {
                a.onShutter();
            }
        }
    }
    
    @d0
    static final class h
    {
        private com.google.android.gms.common.images.a a;
        private com.google.android.gms.common.images.a b;
        
        public h(final Camera$Size camera$Size, @c6.h final Camera$Size camera$Size2) {
            this.a = new com.google.android.gms.common.images.a(camera$Size.width, camera$Size.height);
            if (camera$Size2 != null) {
                this.b = new com.google.android.gms.common.images.a(camera$Size2.width, camera$Size2.height);
            }
        }
        
        public final com.google.android.gms.common.images.a a() {
            return this.a;
        }
        
        @c6.h
        public final com.google.android.gms.common.images.a b() {
            return this.b;
        }
    }
}
