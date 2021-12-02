// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import java.util.ArrayDeque;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class b4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final int I;
    
    public b4(final l<T> l, final int i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I));
    }
    
    static final class a<T> extends ArrayDeque<T> implements q<T>, d
    {
        private static final long N = 7240042530241604978L;
        final c<? super T> G;
        final int H;
        d I;
        volatile boolean J;
        volatile boolean K;
        final AtomicLong L;
        final AtomicInteger M;
        
        a(final c<? super T> g, final int h) {
            this.L = new AtomicLong();
            this.M = new AtomicInteger();
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.K = true;
            this.I.cancel();
        }
        
        public void f() {
            this.J = true;
            this.i();
        }
        
        void i() {
            if (this.M.getAndIncrement() == 0) {
                final c<? super T> g = this.G;
                long value = this.L.get();
                while (!this.K) {
                    long addAndGet = value;
                    if (this.J) {
                        long n;
                        for (n = 0L; n != value; ++n) {
                            if (this.K) {
                                return;
                            }
                            final Object poll = this.poll();
                            if (poll == null) {
                                g.f();
                                return;
                            }
                            g.m(poll);
                        }
                        addAndGet = value;
                        if (n != 0L) {
                            addAndGet = value;
                            if (value != Long.MAX_VALUE) {
                                addAndGet = this.L.addAndGet(-n);
                            }
                        }
                    }
                    value = addAndGet;
                    if (this.M.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
        
        public void m(final T e) {
            if (this.H == this.size()) {
                this.poll();
            }
            this.offer(e);
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.L, n);
                this.i();
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
    }
}
