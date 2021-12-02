// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class o2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    public o2(final l<T> l) {
        super(l);
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c));
    }
    
    static final class a<T> extends AtomicInteger implements q<T>, d
    {
        private static final long N = 163080509307634843L;
        final c<? super T> G;
        d H;
        volatile boolean I;
        Throwable J;
        volatile boolean K;
        final AtomicLong L;
        final AtomicReference<T> M;
        
        a(final c<? super T> g) {
            this.L = new AtomicLong();
            this.M = new AtomicReference<T>();
            this.G = g;
        }
        
        boolean a(final boolean b, final boolean b2, final c<?> c, final AtomicReference<T> atomicReference) {
            if (this.K) {
                atomicReference.lazySet(null);
                return true;
            }
            if (b) {
                final Throwable j = this.J;
                if (j != null) {
                    atomicReference.lazySet(null);
                    c.b(j);
                    return true;
                }
                if (b2) {
                    c.f();
                    return true;
                }
            }
            return false;
        }
        
        public void b(final Throwable j) {
            this.J = j;
            this.I = true;
            this.c();
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final c<? super T> g = this.G;
            final AtomicLong l = this.L;
            final AtomicReference<T> m = this.M;
            int addAndGet = 1;
            do {
                long n = 0L;
                boolean b;
                while (true) {
                    final long value = l.get();
                    b = false;
                    if (n == value) {
                        break;
                    }
                    final boolean i = this.I;
                    final T andSet = m.getAndSet(null);
                    final boolean b2 = andSet == null;
                    if (this.a(i, b2, g, m)) {
                        return;
                    }
                    if (b2) {
                        break;
                    }
                    g.m((Object)andSet);
                    ++n;
                }
                if (n == l.get()) {
                    final boolean j = this.I;
                    boolean b3 = b;
                    if (m.get() == null) {
                        b3 = true;
                    }
                    if (this.a(j, b3, g, m)) {
                        return;
                    }
                }
                if (n != 0L) {
                    io.reactivex.internal.util.d.e(l, n);
                }
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        public void cancel() {
            if (!this.K) {
                this.K = true;
                this.H.cancel();
                if (this.getAndIncrement() == 0) {
                    this.M.lazySet(null);
                }
            }
        }
        
        public void f() {
            this.I = true;
            this.c();
        }
        
        public void m(final T newValue) {
            this.M.lazySet(newValue);
            this.c();
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.L, n);
                this.c();
            }
        }
        
        @Override
        public void z(final d h) {
            if (j.o(this.H, h)) {
                this.H = h;
                this.G.z((d)this);
                h.v(Long.MAX_VALUE);
            }
        }
    }
}
