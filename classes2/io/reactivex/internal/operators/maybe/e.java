// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.q;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicInteger;
import o7.d;
import o7.c;
import io.reactivex.y;
import io.reactivex.l;

public final class e<T> extends l<T>
{
    final y<? extends T>[] H;
    
    public e(final y<? extends T>[] h) {
        this.H = h;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a a = new a((c<? super T>)c, (y<? extends T>[])this.H);
        c.z((d)a);
        a.a();
    }
    
    static final class a<T> extends AtomicInteger implements v<T>, d
    {
        private static final long N = 3520831347801429610L;
        final c<? super T> G;
        final AtomicLong H;
        final AtomicReference<Object> I;
        final h J;
        final y<? extends T>[] K;
        int L;
        long M;
        
        a(final c<? super T> g, final y<? extends T>[] k) {
            this.G = g;
            this.K = k;
            this.H = new AtomicLong();
            this.J = new h();
            this.I = new AtomicReference<Object>(q.G);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final AtomicReference<Object> i = this.I;
            final c<? super T> g = this.G;
            final h j = this.J;
            while (!j.i()) {
                final q value = i.get();
                if (value != null) {
                    final q g2 = q.G;
                    boolean b = true;
                    if (value != g2) {
                        final long m = this.M;
                        if (m != this.H.get()) {
                            this.M = m + 1L;
                            i.lazySet(null);
                            g.m((Object)value);
                        }
                        else {
                            b = false;
                        }
                    }
                    else {
                        i.lazySet(null);
                    }
                    if (b && !j.i()) {
                        final int l = this.L;
                        final y<? extends T>[] k = this.K;
                        if (l == k.length) {
                            g.f();
                            return;
                        }
                        this.L = l + 1;
                        k[l].c(this);
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            i.lazySet(null);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.J.dispose();
        }
        
        @Override
        public void d(final T newValue) {
            this.I.lazySet(newValue);
            this.a();
        }
        
        @Override
        public void f() {
            this.I.lazySet(q.G);
            this.a();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.J.a(c);
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.H, n);
                this.a();
            }
        }
    }
}
