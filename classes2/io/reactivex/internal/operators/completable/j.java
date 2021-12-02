// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class j extends c
{
    final i G;
    
    public j(final i g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a(f));
    }
    
    static final class a implements f, io.reactivex.disposables.c
    {
        f G;
        io.reactivex.disposables.c H;
        
        a(final f g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = d.G;
            final f g = this.G;
            if (g != null) {
                this.G = null;
                g.b(t);
            }
        }
        
        @Override
        public void dispose() {
            this.G = null;
            this.H.dispose();
            this.H = d.G;
        }
        
        @Override
        public void f() {
            this.H = d.G;
            final f g = this.G;
            if (g != null) {
                this.G = null;
                g.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c h) {
            if (d.l(this.H, h)) {
                this.H = h;
                this.G.l(this);
            }
        }
    }
}
