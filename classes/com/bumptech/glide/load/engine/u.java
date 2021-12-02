// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.j0;
import com.bumptech.glide.util.k;
import com.bumptech.glide.util.pool.c;
import androidx.core.util.m;
import com.bumptech.glide.util.pool.a;

final class u<Z> implements v<Z>, f
{
    private static final m.a<u<?>> K;
    private final c G;
    private v<Z> H;
    private boolean I;
    private boolean J;
    
    static {
        K = com.bumptech.glide.util.pool.a.e(20, (a.d<u<?>>)new d<u<?>>() {
            public u<?> a() {
                return new u<Object>();
            }
        });
    }
    
    u() {
        this.G = com.bumptech.glide.util.pool.c.a();
    }
    
    private void b(final v<Z> h) {
        this.J = false;
        this.I = true;
        this.H = h;
    }
    
    @j0
    static <Z> u<Z> c(final v<Z> v) {
        final u<?> u = k.d(com.bumptech.glide.load.engine.u.K.b());
        u.b(v);
        return (u<Z>)u;
    }
    
    private void d() {
        this.H = null;
        u.K.a(this);
    }
    
    @Override
    public void a() {
        synchronized (this) {
            this.G.c();
            this.J = true;
            if (!this.I) {
                this.H.a();
                this.d();
            }
        }
    }
    
    void e() {
        synchronized (this) {
            this.G.c();
            if (this.I) {
                this.I = false;
                if (this.J) {
                    this.a();
                }
                return;
            }
            throw new IllegalStateException("Already unlocked");
        }
    }
    
    @j0
    @Override
    public c g() {
        return this.G;
    }
    
    @j0
    @Override
    public Z get() {
        return this.H.get();
    }
    
    @Override
    public int l0() {
        return this.H.l0();
    }
    
    @j0
    @Override
    public Class<Z> m0() {
        return this.H.m0();
    }
}
