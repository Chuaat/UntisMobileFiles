// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request;

import androidx.annotation.w;
import androidx.annotation.k0;

public class k implements e, d
{
    @k0
    private final e a;
    private final Object b;
    private volatile d c;
    private volatile d d;
    @w("requestLock")
    private a e;
    @w("requestLock")
    private a f;
    @w("requestLock")
    private boolean g;
    
    public k(final Object b, @k0 final e a) {
        final a j = com.bumptech.glide.request.e.a.J;
        this.e = j;
        this.f = j;
        this.b = b;
        this.a = a;
    }
    
    @w("requestLock")
    private boolean l() {
        final e a = this.a;
        return a == null || a.k(this);
    }
    
    @w("requestLock")
    private boolean m() {
        final e a = this.a;
        return a == null || a.f(this);
    }
    
    @w("requestLock")
    private boolean n() {
        final e a = this.a;
        return a == null || a.h(this);
    }
    
    @Override
    public void D() {
        synchronized (this.b) {
            if (!this.f.b()) {
                this.f = com.bumptech.glide.request.e.a.I;
                this.d.D();
            }
            if (!this.e.b()) {
                this.e = com.bumptech.glide.request.e.a.I;
                this.c.D();
            }
        }
    }
    
    @Override
    public void a(final d d) {
        synchronized (this.b) {
            if (!d.equals(this.c)) {
                this.f = com.bumptech.glide.request.e.a.L;
                return;
            }
            this.e = com.bumptech.glide.request.e.a.L;
            final e a = this.a;
            if (a != null) {
                a.a(this);
            }
        }
    }
    
    @Override
    public boolean b() {
        synchronized (this.b) {
            return this.d.b() || this.c.b();
        }
    }
    
    @Override
    public e c() {
        synchronized (this.b) {
            final e a = this.a;
            e c;
            if (a != null) {
                c = a.c();
            }
            else {
                c = this;
            }
            return c;
        }
    }
    
    @Override
    public void clear() {
        synchronized (this.b) {
            this.g = false;
            final a j = com.bumptech.glide.request.e.a.J;
            this.e = j;
            this.f = j;
            this.d.clear();
            this.c.clear();
        }
    }
    
    @Override
    public boolean d() {
        synchronized (this.b) {
            return this.e == com.bumptech.glide.request.e.a.K;
        }
    }
    
    @Override
    public boolean e(final d d) {
        final boolean b = d instanceof k;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final k k = (k)d;
            if (this.c == null) {
                b3 = b2;
                if (k.c != null) {
                    return b3;
                }
            }
            else {
                b3 = b2;
                if (!this.c.e(k.c)) {
                    return b3;
                }
            }
            if (this.d == null) {
                b3 = b2;
                if (k.d != null) {
                    return b3;
                }
            }
            else {
                b3 = b2;
                if (!this.d.e(k.d)) {
                    return b3;
                }
            }
            b3 = true;
        }
        return b3;
    }
    
    @Override
    public boolean f(final d d) {
        synchronized (this.b) {
            return this.m() && d.equals(this.c) && !this.b();
        }
    }
    
    @Override
    public boolean g() {
        synchronized (this.b) {
            return this.e == com.bumptech.glide.request.e.a.J;
        }
    }
    
    @Override
    public boolean h(final d d) {
        synchronized (this.b) {
            return this.n() && (d.equals(this.c) || this.e != com.bumptech.glide.request.e.a.K);
        }
    }
    
    @Override
    public void i() {
        synchronized (this.b) {
            this.g = true;
            try {
                if (this.e != com.bumptech.glide.request.e.a.K) {
                    final a f = this.f;
                    final a h = com.bumptech.glide.request.e.a.H;
                    if (f != h) {
                        this.f = h;
                        this.d.i();
                    }
                }
                if (this.g) {
                    final a e = this.e;
                    final a h2 = com.bumptech.glide.request.e.a.H;
                    if (e != h2) {
                        this.e = h2;
                        this.c.i();
                    }
                }
            }
            finally {
                this.g = false;
            }
        }
    }
    
    @Override
    public boolean isRunning() {
        synchronized (this.b) {
            return this.e == com.bumptech.glide.request.e.a.H;
        }
    }
    
    @Override
    public void j(final d d) {
        synchronized (this.b) {
            if (d.equals(this.d)) {
                this.f = com.bumptech.glide.request.e.a.K;
                return;
            }
            this.e = com.bumptech.glide.request.e.a.K;
            final e a = this.a;
            if (a != null) {
                a.j(this);
            }
            if (!this.f.b()) {
                this.d.clear();
            }
        }
    }
    
    @Override
    public boolean k(final d d) {
        synchronized (this.b) {
            return this.l() && d.equals(this.c) && this.e != com.bumptech.glide.request.e.a.I;
        }
    }
    
    public void o(final d c, final d d) {
        this.c = c;
        this.d = d;
    }
}
