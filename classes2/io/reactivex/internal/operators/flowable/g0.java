// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import io.reactivex.subscribers.e;
import o7.c;
import io.reactivex.l;
import o7.b;
import x5.o;

public final class g0<T, U> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final o<? super T, ? extends b<U>> I;
    
    public g0(final l<T> l, final o<? super T, ? extends b<U>> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object, Object>((o7.c<? super T>)new e((o7.c<? super Object>)c), this.I));
    }
    
    static final class a<T, U> extends AtomicLong implements q<T>, d
    {
        private static final long M = 6725975399620862591L;
        final c<? super T> G;
        final o<? super T, ? extends b<U>> H;
        d I;
        final AtomicReference<io.reactivex.disposables.c> J;
        volatile long K;
        boolean L;
        
        a(final c<? super T> g, final o<? super T, ? extends b<U>> h) {
            this.J = new AtomicReference<io.reactivex.disposables.c>();
            this.G = g;
            this.H = h;
        }
        
        void a(final long n, final T t) {
            if (n == this.K) {
                if (this.get() != 0L) {
                    this.G.m((Object)t);
                    io.reactivex.internal.util.d.e(this, 1L);
                }
                else {
                    this.cancel();
                    this.G.b((Throwable)new io.reactivex.exceptions.c("Could not deliver value due to lack of requests"));
                }
            }
        }
        
        public void b(final Throwable t) {
            io.reactivex.internal.disposables.d.b(this.J);
            this.G.b(t);
        }
        
        public void cancel() {
            this.I.cancel();
            io.reactivex.internal.disposables.d.b(this.J);
        }
        
        public void f() {
            if (this.L) {
                return;
            }
            this.L = true;
            final io.reactivex.disposables.c c = this.J.get();
            if (!io.reactivex.internal.disposables.d.d(c)) {
                ((g0.a.a)c).e();
                io.reactivex.internal.disposables.d.b(this.J);
                this.G.f();
            }
        }
        
        public void m(final T t) {
            if (this.L) {
                return;
            }
            final long k = this.K + 1L;
            this.K = k;
            final io.reactivex.disposables.c expectedValue = this.J.get();
            if (expectedValue != null) {
                expectedValue.dispose();
            }
            try {
                final b b = io.reactivex.internal.functions.b.g((b)this.H.apply((Object)t), "The publisher supplied is null");
                final g0.a.a newValue = new g0.a.a<Object, Object>((g0.a<Object, Object>)this, k, t);
                if (this.J.compareAndSet(expectedValue, newValue)) {
                    b.e((c)newValue);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.cancel();
                this.G.b(t2);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this, n);
            }
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
                i.v(Long.MAX_VALUE);
            }
        }
        
        static final class a<T, U> extends b<U>
        {
            final g0.a<T, U> H;
            final long I;
            final T J;
            boolean K;
            final AtomicBoolean L;
            
            a(final g0.a<T, U> h, final long i, final T j) {
                this.L = new AtomicBoolean();
                this.H = h;
                this.I = i;
                this.J = j;
            }
            
            public void b(final Throwable t) {
                if (this.K) {
                    io.reactivex.plugins.a.Y(t);
                    return;
                }
                this.K = true;
                this.H.b(t);
            }
            
            void e() {
                if (this.L.compareAndSet(false, true)) {
                    this.H.a(this.I, this.J);
                }
            }
            
            public void f() {
                if (this.K) {
                    return;
                }
                this.K = true;
                this.e();
            }
            
            public void m(final U u) {
                if (this.K) {
                    return;
                }
                this.K = true;
                this.a();
                this.e();
            }
        }
    }
}
