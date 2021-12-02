// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request;

import androidx.annotation.w;
import androidx.annotation.k0;

public final class b implements e, d
{
    private final Object a;
    @k0
    private final e b;
    private volatile d c;
    private volatile d d;
    @w("requestLock")
    private a e;
    @w("requestLock")
    private a f;
    
    public b(final Object a, @k0 final e b) {
        final a j = com.bumptech.glide.request.e.a.J;
        this.e = j;
        this.f = j;
        this.a = a;
        this.b = b;
    }
    
    @w("requestLock")
    private boolean l(final d d) {
        return d.equals(this.c) || (this.e == com.bumptech.glide.request.e.a.L && d.equals(this.d));
    }
    
    @w("requestLock")
    private boolean m() {
        final e b = this.b;
        return b == null || b.k(this);
    }
    
    @w("requestLock")
    private boolean n() {
        final e b = this.b;
        return b == null || b.f(this);
    }
    
    @w("requestLock")
    private boolean o() {
        final e b = this.b;
        return b == null || b.h(this);
    }
    
    @Override
    public void D() {
        synchronized (this.a) {
            final a e = this.e;
            final a h = com.bumptech.glide.request.e.a.H;
            if (e == h) {
                this.e = com.bumptech.glide.request.e.a.I;
                this.c.D();
            }
            if (this.f == h) {
                this.f = com.bumptech.glide.request.e.a.I;
                this.d.D();
            }
        }
    }
    
    @Override
    public void a(final d d) {
        synchronized (this.a) {
            if (!d.equals(this.d)) {
                this.e = com.bumptech.glide.request.e.a.L;
                final a f = this.f;
                final a h = com.bumptech.glide.request.e.a.H;
                if (f != h) {
                    this.f = h;
                    this.d.i();
                }
                return;
            }
            this.f = com.bumptech.glide.request.e.a.L;
            final e b = this.b;
            if (b != null) {
                b.a(this);
            }
        }
    }
    
    @Override
    public boolean b() {
        synchronized (this.a) {
            return this.c.b() || this.d.b();
        }
    }
    
    @Override
    public e c() {
        synchronized (this.a) {
            final e b = this.b;
            e c;
            if (b != null) {
                c = b.c();
            }
            else {
                c = this;
            }
            return c;
        }
    }
    
    @Override
    public void clear() {
        synchronized (this.a) {
            final a j = com.bumptech.glide.request.e.a.J;
            this.e = j;
            this.c.clear();
            if (this.f != j) {
                this.f = j;
                this.d.clear();
            }
        }
    }
    
    @Override
    public boolean d() {
        synchronized (this.a) {
            final a e = this.e;
            final a k = com.bumptech.glide.request.e.a.K;
            return e == k || this.f == k;
        }
    }
    
    @Override
    public boolean e(final d d) {
        final boolean b = d instanceof b;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final b b4 = (b)d;
            b3 = b2;
            if (this.c.e(b4.c)) {
                b3 = b2;
                if (this.d.e(b4.d)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public boolean f(final d d) {
        synchronized (this.a) {
            return this.n() && this.l(d);
        }
    }
    
    @Override
    public boolean g() {
        synchronized (this.a) {
            final a e = this.e;
            final a j = com.bumptech.glide.request.e.a.J;
            return e == j && this.f == j;
        }
    }
    
    @Override
    public boolean h(final d d) {
        synchronized (this.a) {
            return this.o() && this.l(d);
        }
    }
    
    @Override
    public void i() {
        synchronized (this.a) {
            final a e = this.e;
            final a h = com.bumptech.glide.request.e.a.H;
            if (e != h) {
                this.e = h;
                this.c.i();
            }
        }
    }
    
    @Override
    public boolean isRunning() {
        synchronized (this.a) {
            final a e = this.e;
            final a h = com.bumptech.glide.request.e.a.H;
            return e == h || this.f == h;
        }
    }
    
    @Override
    public void j(final d d) {
        synchronized (this.a) {
            if (d.equals(this.c)) {
                this.e = com.bumptech.glide.request.e.a.K;
            }
            else if (d.equals(this.d)) {
                this.f = com.bumptech.glide.request.e.a.K;
            }
            final e b = this.b;
            if (b != null) {
                b.j(this);
            }
        }
    }
    
    @Override
    public boolean k(final d d) {
        synchronized (this.a) {
            return this.m() && this.l(d);
        }
    }
    
    public void p(final d c, final d d) {
        this.c = c;
        this.d = d;
    }
}
