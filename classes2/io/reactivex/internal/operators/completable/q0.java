// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import io.reactivex.n0;
import java.util.concurrent.Callable;
import io.reactivex.i;
import io.reactivex.k0;

public final class q0<T> extends k0<T>
{
    final i G;
    final Callable<? extends T> H;
    final T I;
    
    public q0(final i g, final Callable<? extends T> h, final T i) {
        this.G = g;
        this.I = i;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a(n0));
    }
    
    final class a implements f
    {
        private final n0<? super T> G;
        
        a(final n0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void f() {
            final q0 h = q0.this;
            final Callable<? extends T> h2 = h.H;
            final T i;
            Label_0045: {
                if (h2 != null) {
                    try {
                        h2.call();
                        break Label_0045;
                    }
                    finally {
                        b.b((Throwable)i);
                        this.G.b((Throwable)i);
                        return;
                    }
                }
                i = h.I;
            }
            if (i == null) {
                this.G.b(new NullPointerException("The value supplied is null"));
            }
            else {
                this.G.d((Object)i);
            }
        }
        
        @Override
        public void l(final c c) {
            this.G.l(c);
        }
    }
}
