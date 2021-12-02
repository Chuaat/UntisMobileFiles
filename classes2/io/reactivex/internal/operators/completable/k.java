// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.f;
import io.reactivex.j0;
import io.reactivex.i;
import io.reactivex.c;

public final class k extends c
{
    final i G;
    final j0 H;
    
    public k(final i g, final j0 h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a(f, this.H));
    }
    
    static final class a implements f, io.reactivex.disposables.c, Runnable
    {
        final f G;
        final j0 H;
        io.reactivex.disposables.c I;
        volatile boolean J;
        
        a(final f g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.J = true;
            this.H.e(this);
        }
        
        @Override
        public void f() {
            if (this.J) {
                return;
            }
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.J;
        }
        
        @Override
        public void l(final io.reactivex.disposables.c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @Override
        public void run() {
            this.I.dispose();
            this.I = d.G;
        }
    }
}
