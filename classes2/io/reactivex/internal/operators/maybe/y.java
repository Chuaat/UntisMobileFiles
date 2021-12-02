// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.v;
import x5.r;

public final class y<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final r<? super T> H;
    
    public y(final io.reactivex.y<T> y, final r<? super T> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, (r<? super T>)this.H));
    }
    
    static final class a<T> implements v<T>, c
    {
        final v<? super T> G;
        final r<? super T> H;
        c I;
        
        a(final v<? super T> g, final r<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            try {
                if (this.H.a((Object)t)) {
                    this.G.d((Object)t);
                }
                else {
                    this.G.f();
                }
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void dispose() {
            final c i = this.I;
            this.I = d.G;
            i.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
    }
}
