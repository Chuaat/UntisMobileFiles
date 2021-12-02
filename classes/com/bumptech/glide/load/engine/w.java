// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.a;
import androidx.annotation.j0;
import java.io.File;
import com.bumptech.glide.load.model.n;
import java.util.List;
import com.bumptech.glide.load.data.d;

class w implements f, d.a<Object>
{
    private final f.a G;
    private final g<?> H;
    private int I;
    private int J;
    private com.bumptech.glide.load.g K;
    private List<n<File, ?>> L;
    private int M;
    private volatile n.a<?> N;
    private File O;
    private x P;
    
    w(final g<?> h, final f.a g) {
        this.J = -1;
        this.H = h;
        this.G = g;
    }
    
    private boolean b() {
        return this.M < this.L.size();
    }
    
    @Override
    public boolean a() {
        final List<com.bumptech.glide.load.g> c = this.H.c();
        final boolean empty = c.isEmpty();
        boolean b = false;
        if (empty) {
            return false;
        }
        final List<Class<?>> m = this.H.m();
        if (!m.isEmpty()) {
            while (this.L == null || !this.b()) {
                if (++this.J >= m.size()) {
                    if (++this.I >= c.size()) {
                        return false;
                    }
                    this.J = 0;
                }
                final com.bumptech.glide.load.g k = c.get(this.I);
                final Class<Object> clazz = m.get(this.J);
                this.P = new x(this.H.b(), k, this.H.o(), this.H.s(), this.H.f(), this.H.r(clazz), clazz, this.H.k());
                final File b2 = this.H.d().b(this.P);
                if ((this.O = b2) != null) {
                    this.K = k;
                    this.L = this.H.j(b2);
                    this.M = 0;
                }
            }
            this.N = null;
            while (!b && this.b()) {
                this.N = this.L.get(this.M++).b(this.O, this.H.s(), this.H.f(), this.H.k());
                if (this.N != null && this.H.t(this.N.c.a())) {
                    this.N.c.e(this.H.l(), (d.a<?>)this);
                    b = true;
                }
            }
            return b;
        }
        if (File.class.equals(this.H.q())) {
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to find any load path from ");
        sb.append(this.H.i());
        sb.append(" to ");
        sb.append(this.H.q());
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public void c(@j0 final Exception ex) {
        this.G.b(this.P, ex, this.N.c, a.J);
    }
    
    @Override
    public void cancel() {
        final n.a<?> n = this.N;
        if (n != null) {
            n.c.cancel();
        }
    }
    
    @Override
    public void f(final Object o) {
        this.G.f(this.K, o, this.N.c, a.J, this.P);
    }
}
