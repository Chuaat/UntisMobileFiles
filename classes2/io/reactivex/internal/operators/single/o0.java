// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.a;
import io.reactivex.exceptions.b;
import io.reactivex.n0;
import x5.o;
import io.reactivex.q0;
import io.reactivex.k0;

public final class o0<T> extends k0<T>
{
    final q0<? extends T> G;
    final o<? super Throwable, ? extends T> H;
    final T I;
    
    public o0(final q0<? extends T> g, final o<? super Throwable, ? extends T> h, final T i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a(n0));
    }
    
    final class a implements n0<T>
    {
        private final n0<? super T> G;
        
        a(final n0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable cause) {
            final o0 h = o0.this;
            final o<? super Throwable, ? extends T> h2 = h.H;
            final T i;
            Label_0064: {
                if (h2 != null) {
                    try {
                        h2.apply(cause);
                        break Label_0064;
                    }
                    finally {
                        b.b((Throwable)i);
                        this.G.b(new io.reactivex.exceptions.a(new Throwable[] { cause, (Throwable)i }));
                        return;
                    }
                }
                i = h.I;
            }
            if (i == null) {
                final NullPointerException ex = new NullPointerException("Value supplied was null");
                ex.initCause(cause);
                this.G.b(ex);
                return;
            }
            this.G.d((Object)i);
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
        }
        
        @Override
        public void l(final c c) {
            this.G.l(c);
        }
    }
}
