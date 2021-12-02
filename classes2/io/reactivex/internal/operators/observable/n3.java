// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;

public final class n3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    
    public n3(final g0<T> g0, final long h) {
        super(g0);
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super T> G;
        boolean H;
        c I;
        long J;
        
        a(final i0<? super T> g, final long j) {
            this.G = g;
            this.J = j;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.H) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.H = true;
            this.I.dispose();
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            if (!this.H) {
                this.H = true;
                this.I.dispose();
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                if (this.J == 0L) {
                    this.H = true;
                    i.dispose();
                    e.f(this.G);
                }
                else {
                    this.G.l(this);
                }
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.H) {
                final long j = this.J;
                final long i = j - 1L;
                this.J = i;
                if (j > 0L) {
                    final boolean b = i == 0L;
                    this.G.m((Object)t);
                    if (b) {
                        this.f();
                    }
                }
            }
        }
    }
}
