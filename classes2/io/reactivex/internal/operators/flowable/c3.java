// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.i;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.g;
import o7.d;
import io.reactivex.processors.h;
import io.reactivex.subscribers.e;
import o7.c;
import o7.b;
import io.reactivex.l;
import x5.o;

public final class c3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final o<? super l<Object>, ? extends o7.b<?>> I;
    
    public c3(final l<T> l, final o<? super l<Object>, ? extends o7.b<?>> i) {
        super(l);
        this.I = i;
    }
    
    public void n6(final o7.c<? super T> c) {
        final e e = new e((o7.c<? super T>)c);
        final io.reactivex.processors.c<Object> t8 = io.reactivex.processors.h.W8(8).T8();
        try {
            final o7.b b = io.reactivex.internal.functions.b.g((o7.b)this.I.apply(t8), "handler returned a null Publisher");
            final b b2 = new b((o7.b<T>)super.H);
            c.z((d)(b2.J = (c<T, U>)new a((o7.c<? super Object>)e, t8, (d)b2)));
            b.e((o7.c)b2);
            b2.m(0);
        }
        finally {
            final Throwable t9;
            io.reactivex.exceptions.b.b(t9);
            g.d(t9, c);
        }
    }
    
    static final class a<T> extends c<T, Object>
    {
        private static final long U = -2680129890138081029L;
        
        a(final o7.c<? super T> c, final io.reactivex.processors.c<Object> c2, final d d) {
            super((o7.c<? super Object>)c, c2, d);
        }
        
        public void b(final Throwable t) {
            super.R.cancel();
            super.P.b(t);
        }
        
        public void f() {
            this.k(0);
        }
    }
    
    static final class b<T, U> extends AtomicInteger implements q<Object>, d
    {
        private static final long K = 2827772011130406689L;
        final o7.b<T> G;
        final AtomicReference<d> H;
        final AtomicLong I;
        c<T, U> J;
        
        b(final o7.b<T> g) {
            this.G = g;
            this.H = new AtomicReference<d>();
            this.I = new AtomicLong();
        }
        
        public void b(final Throwable t) {
            this.J.cancel();
            this.J.P.b(t);
        }
        
        public void cancel() {
            j.b(this.H);
        }
        
        public void f() {
            this.J.cancel();
            this.J.P.f();
        }
        
        public void m(final Object o) {
            if (this.getAndIncrement() == 0) {
                while (this.H.get() != j.G) {
                    this.G.e((o7.c)this.J);
                    if (this.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
        
        public void v(final long n) {
            j.d(this.H, this.I, n);
        }
        
        @Override
        public void z(final d d) {
            j.f(this.H, this.I, d);
        }
    }
    
    abstract static class c<T, U> extends i implements q<T>
    {
        private static final long T = -5604623027276966720L;
        protected final o7.c<? super T> P;
        protected final io.reactivex.processors.c<U> Q;
        protected final d R;
        private long S;
        
        c(final o7.c<? super T> p3, final io.reactivex.processors.c<U> q, final d r) {
            super(false);
            this.P = p3;
            this.Q = q;
            this.R = r;
        }
        
        @Override
        public final void cancel() {
            super.cancel();
            this.R.cancel();
        }
        
        protected final void k(final U u) {
            this.j((d)g.G);
            final long s = this.S;
            if (s != 0L) {
                this.S = 0L;
                this.i(s);
            }
            this.R.v(1L);
            ((o7.c)this.Q).m((Object)u);
        }
        
        public final void m(final T t) {
            ++this.S;
            this.P.m((Object)t);
        }
        
        @Override
        public final void z(final d d) {
            this.j(d);
        }
    }
}
