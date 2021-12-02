// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.images;

import java.util.concurrent.CountDownLatch;
import java.io.IOException;
import android.util.Log;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.graphics.drawable.Drawable;
import android.os.ParcelFileDescriptor;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Intent;
import java.util.ArrayList;
import com.google.android.gms.common.annotation.KeepName;
import android.os.ResultReceiver;
import android.widget.ImageView;
import android.graphics.Bitmap;
import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import com.google.android.gms.internal.base.q;
import com.google.android.gms.internal.base.l;
import com.google.android.gms.internal.base.p;
import android.os.Looper;
import java.util.Map;
import com.google.android.gms.internal.base.j;
import androidx.annotation.k0;
import java.util.concurrent.ExecutorService;
import android.os.Handler;
import android.content.Context;
import android.net.Uri;
import java.util.HashSet;

public final class ImageManager
{
    private static final Object i;
    private static HashSet<Uri> j;
    private static ImageManager k;
    private final Context a;
    private final Handler b;
    private final ExecutorService c;
    @k0
    private final b d;
    private final j e;
    private final Map<com.google.android.gms.common.images.d, ImageReceiver> f;
    private final Map<Uri, ImageReceiver> g;
    private final Map<Uri, Long> h;
    
    static {
        i = new Object();
        ImageManager.j = new HashSet<Uri>();
    }
    
    private ImageManager(final Context context, final boolean b) {
        this.a = context.getApplicationContext();
        this.b = new p(Looper.getMainLooper());
        this.c = l.a().a(4, q.b);
        this.d = null;
        this.e = new j();
        this.f = new HashMap<com.google.android.gms.common.images.d, ImageReceiver>();
        this.g = new HashMap<Uri, ImageReceiver>();
        this.h = new HashMap<Uri, Long>();
    }
    
    @RecentlyNonNull
    public static ImageManager a(@RecentlyNonNull final Context context) {
        if (ImageManager.k == null) {
            ImageManager.k = new ImageManager(context, false);
        }
        return ImageManager.k;
    }
    
    @k0
    private final Bitmap h(final com.google.android.gms.common.images.c c) {
        return null;
    }
    
    private final void k(final com.google.android.gms.common.images.d d) {
        com.google.android.gms.common.internal.d.a("ImageManager.loadImage() must be called in the main thread");
        new c(d).run();
    }
    
    public final void b(@RecentlyNonNull final ImageView imageView, @RecentlyNonNull final int n) {
        this.k(new f(imageView, n));
    }
    
    public final void c(@RecentlyNonNull final ImageView imageView, @RecentlyNonNull final Uri uri) {
        this.k(new f(imageView, uri));
    }
    
    public final void d(@RecentlyNonNull final ImageView imageView, @RecentlyNonNull final Uri uri, @RecentlyNonNull final int c) {
        final f f = new f(imageView, uri);
        f.c = c;
        this.k(f);
    }
    
    public final void e(@RecentlyNonNull final a a, @RecentlyNonNull final Uri uri) {
        this.k(new com.google.android.gms.common.images.e(a, uri));
    }
    
    public final void f(@RecentlyNonNull final a a, @RecentlyNonNull final Uri uri, @RecentlyNonNull final int c) {
        final com.google.android.gms.common.images.e e = new com.google.android.gms.common.images.e(a, uri);
        e.c = c;
        this.k(e);
    }
    
    @KeepName
    private final class ImageReceiver extends ResultReceiver
    {
        private final Uri G;
        private final ArrayList<com.google.android.gms.common.images.d> H;
        
        ImageReceiver(final Uri g) {
            super((Handler)new p(Looper.getMainLooper()));
            this.G = g;
            this.H = new ArrayList<com.google.android.gms.common.images.d>();
        }
        
        public final void b() {
            final Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("com.google.android.gms.extras.uri", (Parcelable)this.G);
            intent.putExtra("com.google.android.gms.extras.resultReceiver", (Parcelable)this);
            intent.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.a.sendBroadcast(intent);
        }
        
        public final void c(final com.google.android.gms.common.images.d e) {
            com.google.android.gms.common.internal.d.a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.H.add(e);
        }
        
        public final void d(final com.google.android.gms.common.images.d o) {
            com.google.android.gms.common.internal.d.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.H.remove(o);
        }
        
        public final void onReceiveResult(final int n, final Bundle bundle) {
            ImageManager.this.c.execute(new d(this.G, (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
    
    public interface a
    {
        void a(@RecentlyNonNull final Uri p0, @k0 final Drawable p1, @RecentlyNonNull final boolean p2);
    }
    
    private static final class b extends j<com.google.android.gms.common.images.c, Bitmap>
    {
    }
    
    private final class c implements Runnable
    {
        private final com.google.android.gms.common.images.d G;
        
        public c(final com.google.android.gms.common.images.d g) {
            this.G = g;
        }
        
        @Override
        public final void run() {
            com.google.android.gms.common.internal.d.a("LoadImageRunnable must be executed on the main thread");
            final ImageReceiver imageReceiver = ImageManager.this.f.get(this.G);
            if (imageReceiver != null) {
                ImageManager.this.f.remove(this.G);
                imageReceiver.d(this.G);
            }
            final com.google.android.gms.common.images.d g = this.G;
            final com.google.android.gms.common.images.c a = g.a;
            if (a.a == null) {
                g.c(ImageManager.this.a, ImageManager.this.e, true);
                return;
            }
            final Bitmap g2 = ImageManager.this.h(a);
            if (g2 != null) {
                this.G.a(ImageManager.this.a, g2, true);
                return;
            }
            final Long n = ImageManager.this.h.get(a.a);
            if (n != null) {
                if (SystemClock.elapsedRealtime() - n < 3600000L) {
                    this.G.c(ImageManager.this.a, ImageManager.this.e, true);
                    return;
                }
                ImageManager.this.h.remove(a.a);
            }
            this.G.b(ImageManager.this.a, ImageManager.this.e);
            ResultReceiver resultReceiver;
            if ((resultReceiver = ImageManager.this.g.get(a.a)) == null) {
                resultReceiver = new ImageReceiver(a.a);
                ImageManager.this.g.put(a.a, resultReceiver);
            }
            ((ImageReceiver)resultReceiver).c(this.G);
            if (!(this.G instanceof com.google.android.gms.common.images.e)) {
                ImageManager.this.f.put(this.G, resultReceiver);
            }
            synchronized (ImageManager.i) {
                if (!ImageManager.j.contains(a.a)) {
                    ImageManager.j.add(a.a);
                    ((ImageReceiver)resultReceiver).b();
                }
            }
        }
    }
    
    private final class d implements Runnable
    {
        private final Uri G;
        @k0
        private final ParcelFileDescriptor H;
        
        public d(@k0 final Uri g, final ParcelFileDescriptor h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public final void run() {
            com.google.android.gms.common.internal.d.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            final ParcelFileDescriptor h = this.H;
            boolean b = false;
            Bitmap decodeFileDescriptor = null;
            if (h != null) {
                try {
                    decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(h.getFileDescriptor());
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    final String value = String.valueOf(this.G);
                    final StringBuilder sb = new StringBuilder(value.length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(value);
                    Log.e("ImageManager", sb.toString(), (Throwable)outOfMemoryError);
                    b = true;
                }
                try {
                    this.H.close();
                }
                catch (IOException ex) {
                    Log.e("ImageManager", "closed failed", (Throwable)ex);
                }
            }
            else {
                decodeFileDescriptor = null;
                b = false;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.b.post((Runnable)new e(this.G, decodeFileDescriptor, b, countDownLatch));
            try {
                countDownLatch.await();
            }
            catch (InterruptedException ex2) {
                final String value2 = String.valueOf(this.G);
                final StringBuilder sb2 = new StringBuilder(value2.length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(value2);
                Log.w("ImageManager", sb2.toString());
            }
        }
    }
    
    private final class e implements Runnable
    {
        private final Uri G;
        @k0
        private final Bitmap H;
        private final CountDownLatch I;
        private boolean J;
        
        public e(@k0 final Uri g, final Bitmap h, final boolean j, final CountDownLatch i) {
            this.G = g;
            this.H = h;
            this.J = j;
            this.I = i;
        }
        
        @Override
        public final void run() {
            com.google.android.gms.common.internal.d.a("OnBitmapLoadedRunnable must be executed in the main thread");
            final boolean b = this.H != null;
            final ImageReceiver imageReceiver = ImageManager.this.g.remove(this.G);
            if (imageReceiver != null) {
                final ArrayList a = imageReceiver.H;
                for (int size = a.size(), i = 0; i < size; ++i) {
                    final com.google.android.gms.common.images.d d = a.get(i);
                    if (this.H != null && b) {
                        d.a(ImageManager.this.a, this.H, false);
                    }
                    else {
                        ImageManager.this.h.put(this.G, SystemClock.elapsedRealtime());
                        d.c(ImageManager.this.a, ImageManager.this.e, false);
                    }
                    if (!(d instanceof com.google.android.gms.common.images.e)) {
                        ImageManager.this.f.remove(d);
                    }
                }
            }
            this.I.countDown();
            synchronized (ImageManager.i) {
                ImageManager.j.remove(this.G);
            }
        }
    }
}
