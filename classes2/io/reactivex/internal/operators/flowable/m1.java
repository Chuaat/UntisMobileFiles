// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.exceptions.b;
import o7.d;
import x5.g;
import io.reactivex.k;
import x5.c;
import java.util.concurrent.Callable;
import io.reactivex.l;

public final class m1<T, S> extends l<T>
{
    final Callable<S> H;
    final c<S, k<T>, S> I;
    final g<? super S> J;
    
    public m1(final Callable<S> h, final c<S, k<T>, S> i, final g<? super S> j) {
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void n6(final o7.c<? super T> c) {
        try {
            c.z((d)new a((o7.c<? super Object>)c, (c<Object, ? super k<Object>, Object>)this.I, (g<? super Object>)this.J, this.H.call()));
        }
        finally {
            final Throwable t;
            b.b(t);
            io.reactivex.internal.subscriptions.g.d(t, c);
        }
    }
    
    static final class a<T, S> extends AtomicLong implements k<T>, d
    {
        private static final long N = 7565982551505011832L;
        final o7.c<? super T> G;
        final c<S, ? super k<T>, S> H;
        final g<? super S> I;
        S J;
        volatile boolean K;
        boolean L;
        boolean M;
        
        a(final o7.c<? super T> g, final c<S, ? super k<T>, S> h, final g<? super S> i, final S j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        private void a(final S n) {
            try {
                this.I.accept((Object)n);
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.L) {
                io.reactivex.plugins.a.Y(t);
            }
            else {
                Throwable t2;
                if ((t2 = t) == null) {
                    t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.L = true;
                this.G.b(t2);
            }
        }
        
        public void cancel() {
            if (!this.K) {
                this.K = true;
                if (io.reactivex.internal.util.d.a(this, 1L) == 0L) {
                    final S j = this.J;
                    this.J = null;
                    this.a(j);
                }
            }
        }
        
        @Override
        public void f() {
            if (!this.L) {
                this.L = true;
                this.G.f();
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.L) {
                RuntimeException ex;
                if (this.M) {
                    ex = new IllegalStateException("onNext already called in this generate turn");
                }
                else {
                    if (t != null) {
                        this.M = true;
                        this.G.m((Object)t);
                        return;
                    }
                    ex = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.b(ex);
            }
        }
        
        public void v(long addAndGet) {
            if (!j.m(addAndGet)) {
                return;
            }
            if (io.reactivex.internal.util.d.a(this, addAndGet) != 0L) {
                return;
            }
            Object j = this.J;
            final c<S, ? super k<T>, S> h = this.H;
            long n;
            do {
                n = 0L;
                Object o = j;
                Label_0058: {
                    Label_0053: {
                        while (true) {
                            j = o;
                            if (n != addAndGet) {
                                if (this.K) {
                                    break Label_0053;
                                }
                                this.M = false;
                                try {
                                    final S b = h.b((S)j, this);
                                    if (this.L) {
                                        this.K = true;
                                        j = b;
                                        break Label_0053;
                                    }
                                    ++n;
                                    continue;
                                }
                                finally {
                                    b.b((Throwable)o);
                                    this.K = true;
                                    this.J = null;
                                    this.b((Throwable)o);
                                    break Label_0058;
                                }
                            }
                            final long value = this.get();
                            o = j;
                            addAndGet = value;
                            if (n == value) {
                                break;
                            }
                        }
                        this.J = (S)j;
                        continue;
                    }
                    this.J = null;
                }
                this.a((S)j);
            } while ((addAndGet = this.addAndGet(-n)) != 0L);
        }
    }
}
