// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.r;

public final class s3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final r<? super T> H;
    
    public s3(final g0<T> g0, final r<? super T> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, (r<? super T>)this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super T> G;
        final r<? super T> H;
        c I;
        boolean J;
        
        a(final i0<? super T> g, final r<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.J) {
                this.J = true;
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            if (!this.J) {
                this.J = true;
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
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.J) {
                this.G.m((Object)t);
                try {
                    if (this.H.a((Object)t)) {
                        this.J = true;
                        this.I.dispose();
                        this.G.f();
                    }
                }
                finally {
                    final Throwable t2;
                    b.b(t2);
                    this.I.dispose();
                    this.b(t2);
                }
            }
        }
    }
}
