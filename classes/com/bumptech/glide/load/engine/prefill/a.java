// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.prefill;

import androidx.annotation.j0;
import java.security.MessageDigest;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.util.m;
import android.graphics.Bitmap;
import java.util.HashSet;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import java.util.Set;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import androidx.annotation.b1;

final class a implements Runnable
{
    @b1
    static final String O = "PreFillRunner";
    private static final a P;
    static final long Q = 32L;
    static final long R = 40L;
    static final int S = 4;
    static final long T;
    private final e G;
    private final j H;
    private final c I;
    private final a J;
    private final Set<d> K;
    private final Handler L;
    private long M;
    private boolean N;
    
    static {
        P = new a();
        T = TimeUnit.SECONDS.toMillis(1L);
    }
    
    public a(final e e, final j j, final c c) {
        this(e, j, c, a.P, new Handler(Looper.getMainLooper()));
    }
    
    @b1
    a(final e g, final j h, final c i, final a j, final Handler l) {
        this.K = new HashSet<d>();
        this.M = 40L;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.L = l;
    }
    
    private long c() {
        return this.H.e() - this.H.d();
    }
    
    private long d() {
        final long m = this.M;
        this.M = Math.min(4L * m, a.T);
        return m;
    }
    
    private boolean e(final long n) {
        return this.J.a() - n >= 32L;
    }
    
    @b1
    boolean a() {
        final long a = this.J.a();
        while (!this.I.b() && !this.e(a)) {
            final d c = this.I.c();
            Bitmap bitmap;
            if (!this.K.contains(c)) {
                this.K.add(c);
                bitmap = this.G.g(c.d(), c.b(), c.a());
            }
            else {
                bitmap = Bitmap.createBitmap(c.d(), c.b(), c.a());
            }
            final int h = m.h(bitmap);
            if (this.c() >= h) {
                this.H.f(new b(), g.d(bitmap, this.G));
            }
            else {
                this.G.d(bitmap);
            }
            if (Log.isLoggable("PreFillRunner", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("allocated [");
                sb.append(c.d());
                sb.append("x");
                sb.append(c.b());
                sb.append("] ");
                sb.append(c.a());
                sb.append(" size: ");
                sb.append(h);
                Log.d("PreFillRunner", sb.toString());
            }
        }
        return !this.N && !this.I.b();
    }
    
    public void b() {
        this.N = true;
    }
    
    @Override
    public void run() {
        if (this.a()) {
            this.L.postDelayed((Runnable)this, this.d());
        }
    }
    
    @b1
    static class a
    {
        long a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }
    
    private static final class b implements g
    {
        b() {
        }
        
        @Override
        public void a(@j0 final MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }
}
