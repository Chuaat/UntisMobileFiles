// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscribers.t;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.o;

public final class q2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final o<? super Throwable, ? extends T> I;
    
    public q2(final l<T> l, final o<? super Throwable, ? extends T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a((o7.c<? super Object>)c, this.I));
    }
    
    static final class a<T> extends t<T, T>
    {
        private static final long O = -3740826063558713822L;
        final o<? super Throwable, ? extends T> N;
        
        a(final c<? super T> c, final o<? super Throwable, ? extends T> n) {
            super(c);
            this.N = n;
        }
        
        public void b(final Throwable t) {
            try {
                this.a(b.g((T)this.N.apply(t), "The valueSupplier returned a null value"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                super.G.b((Throwable)new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        public void f() {
            super.G.f();
        }
        
        public void m(final T t) {
            ++super.J;
            super.G.m((Object)t);
        }
    }
}
