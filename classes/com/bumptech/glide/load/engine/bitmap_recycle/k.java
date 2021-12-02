// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.util.Log;
import androidx.annotation.j0;
import android.graphics.Bitmap;
import androidx.annotation.k0;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import java.util.Set;
import android.graphics.Bitmap$Config;

public class k implements e
{
    private static final String k = "LruBitmapPool";
    private static final Bitmap$Config l;
    private final l a;
    private final Set<Bitmap$Config> b;
    private final long c;
    private final a d;
    private long e;
    private long f;
    private int g;
    private int h;
    private int i;
    private int j;
    
    static {
        l = Bitmap$Config.ARGB_8888;
    }
    
    public k(final long n) {
        this(n, p(), o());
    }
    
    k(final long n, final l a, final Set<Bitmap$Config> b) {
        this.c = n;
        this.e = n;
        this.a = a;
        this.b = b;
        this.d = (a)new b();
    }
    
    public k(final long n, final Set<Bitmap$Config> set) {
        this(n, p(), set);
    }
    
    @TargetApi(26)
    private static void h(final Bitmap$Config obj) {
        if (Build$VERSION.SDK_INT < 26) {
            return;
        }
        if (obj != Bitmap$Config.HARDWARE) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot create a mutable Bitmap with config: ");
        sb.append(obj);
        sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @j0
    private static Bitmap i(final int n, final int n2, @k0 Bitmap$Config l) {
        if (l == null) {
            l = com.bumptech.glide.load.engine.bitmap_recycle.k.l;
        }
        return Bitmap.createBitmap(n, n2, l);
    }
    
    private void j() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            this.k();
        }
    }
    
    private void k() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.g);
        sb.append(", misses=");
        sb.append(this.h);
        sb.append(", puts=");
        sb.append(this.i);
        sb.append(", evictions=");
        sb.append(this.j);
        sb.append(", currentSize=");
        sb.append(this.f);
        sb.append(", maxSize=");
        sb.append(this.e);
        sb.append("\nStrategy=");
        sb.append(this.a);
        Log.v("LruBitmapPool", sb.toString());
    }
    
    private void l() {
        this.v(this.e);
    }
    
    @TargetApi(26)
    private static Set<Bitmap$Config> o() {
        final HashSet<Bitmap$Config> s = new HashSet<Bitmap$Config>(Arrays.asList(Bitmap$Config.values()));
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 19) {
            s.add(null);
        }
        if (sdk_INT >= 26) {
            s.remove(Bitmap$Config.HARDWARE);
        }
        return (Set<Bitmap$Config>)Collections.unmodifiableSet((Set<?>)s);
    }
    
    private static l p() {
        l l;
        if (Build$VERSION.SDK_INT >= 19) {
            l = new o();
        }
        else {
            l = new com.bumptech.glide.load.engine.bitmap_recycle.c();
        }
        return l;
    }
    
    @k0
    private Bitmap q(final int n, final int n2, @k0 final Bitmap$Config bitmap$Config) {
        synchronized (this) {
            h(bitmap$Config);
            final l a = this.a;
            Bitmap$Config l;
            if (bitmap$Config != null) {
                l = bitmap$Config;
            }
            else {
                l = com.bumptech.glide.load.engine.bitmap_recycle.k.l;
            }
            final Bitmap f = a.f(n, n2, l);
            if (f == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Missing bitmap=");
                    sb.append(this.a.a(n, n2, bitmap$Config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                ++this.h;
            }
            else {
                ++this.g;
                this.f -= this.a.b(f);
                this.d.a(f);
                u(f);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Get bitmap=");
                sb2.append(this.a.a(n, n2, bitmap$Config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            this.j();
            return f;
        }
    }
    
    @TargetApi(19)
    private static void s(final Bitmap bitmap) {
        if (Build$VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }
    
    private static void u(final Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        s(bitmap);
    }
    
    private void v(final long n) {
        synchronized (this) {
            while (this.f > n) {
                final Bitmap removeLast = this.a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        this.k();
                    }
                    this.f = 0L;
                    return;
                }
                this.d.a(removeLast);
                this.f -= this.a.b(removeLast);
                ++this.j;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.a.c(removeLast));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.j();
                removeLast.recycle();
            }
        }
    }
    
    @SuppressLint({ "InlinedApi" })
    @Override
    public void a(final int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
            Log.d("LruBitmapPool", sb.toString());
        }
        if (i < 40 && (Build$VERSION.SDK_INT < 23 || i < 20)) {
            if (i >= 20 || i == 15) {
                this.v(this.e() / 2L);
            }
        }
        else {
            this.b();
        }
    }
    
    @Override
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        this.v(0L);
    }
    
    @Override
    public void c(final float n) {
        synchronized (this) {
            this.e = Math.round(this.c * n);
            this.l();
        }
    }
    
    @Override
    public void d(final Bitmap bitmap) {
        // monitorenter(this)
        if (bitmap != null) {
            Label_0301: {
                try {
                    if (bitmap.isRecycled()) {
                        throw new IllegalStateException("Cannot pool recycled bitmap");
                    }
                    if (bitmap.isMutable() && this.a.b(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                        final int b = this.a.b(bitmap);
                        this.a.d(bitmap);
                        this.d.b(bitmap);
                        ++this.i;
                        this.f += b;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Put bitmap in pool=");
                            sb.append(this.a.c(bitmap));
                            Log.v("LruBitmapPool", sb.toString());
                        }
                        this.j();
                        this.l();
                        // monitorexit(this)
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.a.c(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.b.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    // monitorexit(this)
                    return;
                }
                finally {
                    break Label_0301;
                }
                throw new NullPointerException("Bitmap must not be null");
            }
        }
        // monitorexit(this)
        throw new NullPointerException("Bitmap must not be null");
    }
    
    @Override
    public long e() {
        return this.e;
    }
    
    @j0
    @Override
    public Bitmap f(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final Bitmap q = this.q(n, n2, bitmap$Config);
        Bitmap i;
        if (q != null) {
            q.eraseColor(0);
            i = q;
        }
        else {
            i = i(n, n2, bitmap$Config);
        }
        return i;
    }
    
    @j0
    @Override
    public Bitmap g(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        Bitmap bitmap;
        if ((bitmap = this.q(n, n2, bitmap$Config)) == null) {
            bitmap = i(n, n2, bitmap$Config);
        }
        return bitmap;
    }
    
    public long m() {
        return this.j;
    }
    
    public long n() {
        return this.f;
    }
    
    public long r() {
        return this.g;
    }
    
    public long t() {
        return this.h;
    }
    
    private interface a
    {
        void a(final Bitmap p0);
        
        void b(final Bitmap p0);
    }
    
    private static final class b implements a
    {
        b() {
        }
        
        @Override
        public void a(final Bitmap bitmap) {
        }
        
        @Override
        public void b(final Bitmap bitmap) {
        }
    }
    
    private static class c implements a
    {
        private final Set<Bitmap> a;
        
        private c() {
            this.a = Collections.synchronizedSet(new HashSet<Bitmap>());
        }
        
        @Override
        public void a(final Bitmap bitmap) {
            if (this.a.contains(bitmap)) {
                this.a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }
        
        @Override
        public void b(final Bitmap obj) {
            if (!this.a.contains(obj)) {
                this.a.add(obj);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't add already added bitmap: ");
            sb.append(obj);
            sb.append(" [");
            sb.append(obj.getWidth());
            sb.append("x");
            sb.append(obj.getHeight());
            sb.append("]");
            throw new IllegalStateException(sb.toString());
        }
    }
}
