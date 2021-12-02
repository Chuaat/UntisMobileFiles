// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.b;
import java.util.concurrent.Callable;

public final class s<T, U> extends io.reactivex.internal.operators.flowable.a<T, U>
{
    final Callable<? extends U> I;
    final b<? super U, ? super T> J;
    
    public s(final l<T> l, final Callable<? extends U> i, final b<? super U, ? super T> j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final c<? super U> c) {
        try {
            super.H.m6(new a<Object, Object>(c, io.reactivex.internal.functions.b.g((Object)this.I.call(), "The initial value supplied is null"), this.J));
        }
        finally {
            final Throwable t;
            g.d(t, c);
        }
    }
    
    static final class a<T, U> extends f<U> implements q<T>
    {
        private static final long W = -3589550218733891694L;
        final b<? super U, ? super T> S;
        final U T;
        d U;
        boolean V;
        
        a(final o7.c<? super U> c, final U t, final b<? super U, ? super T> s) {
            super(c);
            this.S = s;
            this.T = t;
        }
        
        public void b(final Throwable t) {
            if (this.V) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.V = true;
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.U.cancel();
        }
        
        public void f() {
            if (this.V) {
                return;
            }
            this.V = true;
            this.g(this.T);
        }
        
        public void m(final T t) {
            if (this.V) {
                return;
            }
            try {
                this.S.a((Object)this.T, (Object)t);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.U.cancel();
                this.b(t2);
            }
        }
        
        @Override
        public void z(final d u) {
            if (j.o(this.U, u)) {
                this.U = u;
                super.H.z((d)this);
                u.v(Long.MAX_VALUE);
            }
        }
    }
}
