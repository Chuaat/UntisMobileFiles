// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.v;
import io.reactivex.i;
import y5.e;
import io.reactivex.s;

public final class k0<T> extends s<T> implements e
{
    final i G;
    
    public k0(final i g) {
        this.G = g;
    }
    
    @Override
    public i source() {
        return this.G;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.c(new a<Object>(v));
    }
    
    static final class a<T> implements f, c
    {
        final v<? super T> G;
        c H;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = d.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
            this.H = d.G;
        }
        
        @Override
        public void f() {
            this.H = d.G;
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void l(final c h) {
            if (d.l(this.H, h)) {
                this.H = h;
                this.G.l(this);
            }
        }
    }
}
