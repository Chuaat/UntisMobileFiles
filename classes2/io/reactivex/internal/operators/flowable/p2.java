// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.i;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import o7.b;
import x5.o;

public final class p2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final o<? super Throwable, ? extends b<? extends T>> I;
    final boolean J;
    
    public p2(final l<T> l, final o<? super Throwable, ? extends b<? extends T>> i, final boolean j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a a = new a<Object>((o7.c<? super T>)c, (o<? super Throwable, ? extends o7.b<? extends T>>)this.I, this.J);
        c.z((d)a);
        super.H.m6(a);
    }
    
    static final class a<T> extends i implements q<T>
    {
        private static final long V = 4063763155303814625L;
        final c<? super T> P;
        final o<? super Throwable, ? extends b<? extends T>> Q;
        final boolean R;
        boolean S;
        boolean T;
        long U;
        
        a(final c<? super T> p3, final o<? super Throwable, ? extends b<? extends T>> q, final boolean r) {
            super(false);
            this.P = p3;
            this.Q = q;
            this.R = r;
        }
        
        public void b(final Throwable t) {
            if (this.S) {
                if (this.T) {
                    io.reactivex.plugins.a.Y(t);
                    return;
                }
                this.P.b(t);
            }
            else {
                this.S = true;
                if (this.R && !(t instanceof Exception)) {
                    this.P.b(t);
                    return;
                }
                try {
                    final b b = io.reactivex.internal.functions.b.g((b)this.Q.apply(t), "The nextSupplier returned a null Publisher");
                    final long u = this.U;
                    if (u != 0L) {
                        this.i(u);
                    }
                    b.e((c)this);
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.P.b((Throwable)new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
                }
            }
        }
        
        public void f() {
            if (this.T) {
                return;
            }
            this.T = true;
            this.S = true;
            this.P.f();
        }
        
        public void m(final T t) {
            if (this.T) {
                return;
            }
            if (!this.S) {
                ++this.U;
            }
            this.P.m((Object)t);
        }
        
        @Override
        public void z(final d d) {
            this.j(d);
        }
    }
}
