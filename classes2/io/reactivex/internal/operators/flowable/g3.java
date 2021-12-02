// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.g;
import o7.d;
import io.reactivex.processors.h;
import io.reactivex.subscribers.e;
import o7.c;
import o7.b;
import io.reactivex.l;
import x5.o;

public final class g3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final o<? super l<Throwable>, ? extends b<?>> I;
    
    public g3(final l<T> l, final o<? super l<Throwable>, ? extends b<?>> i) {
        super(l);
        this.I = i;
    }
    
    public void n6(final c<? super T> c) {
        final e e = new e((c<? super T>)c);
        final io.reactivex.processors.c<Throwable> t8 = io.reactivex.processors.h.W8(8).T8();
        try {
            final b b = io.reactivex.internal.functions.b.g((b)this.I.apply(t8), "handler returned a null Publisher");
            final c3.b b2 = new c3.b((b<T>)super.H);
            c.z((d)(b2.J = (c3.c<T, U>)new a((o7.c<? super Object>)e, t8, (d)b2)));
            b.e((c)b2);
            b2.m(0);
        }
        finally {
            final Throwable t9;
            io.reactivex.exceptions.b.b(t9);
            g.d(t9, c);
        }
    }
    
    static final class a<T> extends c<T, Throwable>
    {
        private static final long U = -2680129890138081029L;
        
        a(final o7.c<? super T> c, final io.reactivex.processors.c<Throwable> c2, final d d) {
            super((o7.c<? super Object>)c, c2, d);
        }
        
        public void b(final Throwable t) {
            this.k(t);
        }
        
        public void f() {
            super.R.cancel();
            super.P.f();
        }
    }
}
