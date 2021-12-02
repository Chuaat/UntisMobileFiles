// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscribers.t;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import java.util.concurrent.Callable;
import x5.o;

public final class c2<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final o<? super T, ? extends R> I;
    final o<? super Throwable, ? extends R> J;
    final Callable<? extends R> K;
    
    public c2(final l<T> l, final o<? super T, ? extends R> i, final o<? super Throwable, ? extends R> j, final Callable<? extends R> k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final c<? super R> c) {
        super.H.m6(new a<Object, Object>(c, this.I, this.J, this.K));
    }
    
    static final class a<T, R> extends t<T, R>
    {
        private static final long Q = 2757120512858778108L;
        final o<? super T, ? extends R> N;
        final o<? super Throwable, ? extends R> O;
        final Callable<? extends R> P;
        
        a(final c<? super R> c, final o<? super T, ? extends R> n, final o<? super Throwable, ? extends R> o, final Callable<? extends R> p4) {
            super(c);
            this.N = n;
            this.O = o;
            this.P = p4;
        }
        
        public void b(final Throwable t) {
            try {
                this.a(b.g((R)this.O.apply(t), "The onError publisher returned is null"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                super.G.b((Throwable)new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        public void f() {
            try {
                this.a(b.g((R)this.P.call(), "The onComplete publisher returned is null"));
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                super.G.b(t);
            }
        }
        
        public void m(final T t) {
            try {
                final Object g = b.g((Object)this.N.apply((Object)t), "The onNext publisher returned is null");
                ++super.J;
                super.G.m(g);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                super.G.b(t2);
            }
        }
    }
}
