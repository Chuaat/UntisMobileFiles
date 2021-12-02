// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.a;
import androidx.annotation.j0;
import java.io.File;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.g;
import java.util.List;
import com.bumptech.glide.load.data.d;

class c implements f, d.a<Object>
{
    private final List<g> G;
    private final com.bumptech.glide.load.engine.g<?> H;
    private final f.a I;
    private int J;
    private g K;
    private List<n<File, ?>> L;
    private int M;
    private volatile n.a<?> N;
    private File O;
    
    c(final com.bumptech.glide.load.engine.g<?> g, final f.a a) {
        this(g.c(), g, a);
    }
    
    c(final List<g> g, final com.bumptech.glide.load.engine.g<?> h, final f.a i) {
        this.J = -1;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    private boolean b() {
        return this.M < this.L.size();
    }
    
    @Override
    public boolean a() {
        while (true) {
            final List<n<File, ?>> l = this.L;
            boolean b = false;
            if (l != null && this.b()) {
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
            if (++this.J >= this.G.size()) {
                return false;
            }
            final g k = this.G.get(this.J);
            final File b2 = this.H.d().b(new com.bumptech.glide.load.engine.d(k, this.H.o()));
            if ((this.O = b2) == null) {
                continue;
            }
            this.K = k;
            this.L = this.H.j(b2);
            this.M = 0;
        }
    }
    
    @Override
    public void c(@j0 final Exception ex) {
        this.I.b(this.K, ex, this.N.c, a.I);
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
        this.I.f(this.K, o, this.N.c, a.I, this.K);
    }
}
