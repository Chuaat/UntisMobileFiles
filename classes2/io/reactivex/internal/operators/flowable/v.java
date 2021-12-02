// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.b;
import io.reactivex.exceptions.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import io.reactivex.internal.subscriptions.i;
import o7.d;
import o7.c;
import org.reactivestreams.Publisher;
import io.reactivex.l;

public final class v<T> extends l<T>
{
    final Publisher<? extends T>[] H;
    final boolean I;
    
    public v(final Publisher<? extends T>[] h, final boolean i) {
        this.H = (b[])h;
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a a = new a(this.H, this.I, (c)c);
        c.z((d)a);
        a.f();
    }
    
    static final class a<T> extends i implements q<T>
    {
        private static final long W = -8158322871608889516L;
        final c<? super T> P;
        final Publisher<? extends T>[] Q;
        final boolean R;
        final AtomicInteger S;
        int T;
        List<Throwable> U;
        long V;
        
        a(final Publisher<? extends T>[] q, final boolean r, final c<? super T> p3) {
            super(false);
            this.P = p3;
            this.Q = (b[])q;
            this.R = r;
            this.S = new AtomicInteger();
        }
        
        public void b(final Throwable t) {
            if (this.R) {
                List<Throwable> u;
                if ((u = this.U) == null) {
                    u = new ArrayList<Throwable>(this.Q.length - this.T + 1);
                    this.U = u;
                }
                u.add(t);
                this.f();
            }
            else {
                this.P.b(t);
            }
        }
        
        public void f() {
            if (this.S.getAndIncrement() == 0) {
                final b[] q = this.Q;
                final int length = q.length;
                int i = this.T;
                while (i != length) {
                    final b b = q[i];
                    if (b == null) {
                        final NullPointerException ex = new NullPointerException("A Publisher entry is null");
                        if (!this.R) {
                            this.P.b((Throwable)ex);
                            return;
                        }
                        List<Throwable> u;
                        if ((u = this.U) == null) {
                            u = new ArrayList<Throwable>(length - i + 1);
                            this.U = u;
                        }
                        u.add(ex);
                        ++i;
                    }
                    else {
                        final long v = this.V;
                        if (v != 0L) {
                            this.V = 0L;
                            this.i(v);
                        }
                        b.e((c)this);
                        ++i;
                        this.T = i;
                        if (this.S.decrementAndGet() == 0) {
                            return;
                        }
                        continue;
                    }
                }
                final List<Throwable> u2 = this.U;
                if (u2 != null) {
                    if (u2.size() == 1) {
                        this.P.b((Throwable)u2.get(0));
                    }
                    else {
                        this.P.b((Throwable)new io.reactivex.exceptions.a(u2));
                    }
                }
                else {
                    this.P.f();
                }
            }
        }
        
        public void m(final T t) {
            ++this.V;
            this.P.m((Object)t);
        }
        
        @Override
        public void z(final d d) {
            this.j(d);
        }
    }
}
