// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicInteger;
import o7.d;
import java.util.Iterator;
import io.reactivex.internal.subscriptions.g;
import o7.c;
import o7.b;
import org.reactivestreams.Publisher;
import io.reactivex.l;

public final class h<T> extends l<T>
{
    final Publisher<? extends T>[] H;
    final Iterable<? extends o7.b<? extends T>> I;
    
    public h(final Publisher<? extends T>[] h, final Iterable<? extends o7.b<? extends T>> i) {
        this.H = (o7.b[])h;
        this.I = i;
    }
    
    public void n6(final c<? super T> c) {
        o7.b[] h = this.H;
        int length = 0;
        Label_0136: {
            if (h == null) {
                o7.b[] array = new o7.b[8];
                try {
                    final Iterator<? extends o7.b<? extends T>> iterator = this.I.iterator();
                    int n = 0;
                    while (true) {
                        h = array;
                        length = n;
                        if (!iterator.hasNext()) {
                            break Label_0136;
                        }
                        final o7.b b = (o7.b)iterator.next();
                        if (b == null) {
                            break;
                        }
                        h = array;
                        if (n == array.length) {
                            h = new o7.b[(n >> 2) + n];
                            System.arraycopy(array, 0, h, 0, n);
                        }
                        h[n] = b;
                        ++n;
                        array = h;
                    }
                    g.d(new NullPointerException("One of the sources is null"), c);
                    return;
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    g.d(t, c);
                    return;
                }
            }
            length = h.length;
        }
        if (length == 0) {
            g.b(c);
            return;
        }
        if (length == 1) {
            h[0].e((c)c);
            return;
        }
        new a((o7.c<? super Object>)c, length).a(h);
    }
    
    static final class a<T> implements d
    {
        final c<? super T> G;
        final b<T>[] H;
        final AtomicInteger I;
        
        a(final c<? super T> g, final int n) {
            this.I = new AtomicInteger();
            this.G = g;
            this.H = (b<T>[])new b[n];
        }
        
        public void a(final Publisher<? extends T>[] array) {
            final b<T>[] h = this.H;
            final int length = h.length;
            final int n = 0;
            int n2;
            for (int i = 0; i < length; i = n2) {
                n2 = i + 1;
                h[i] = (b<T>)new b((a<Object>)this, n2, (o7.c<? super Object>)this.G);
            }
            this.I.lazySet(0);
            this.G.z((d)this);
            for (int j = n; j < length; ++j) {
                if (this.I.get() != 0) {
                    return;
                }
                ((o7.b)array[j]).e((c)h[j]);
            }
        }
        
        public boolean b(final int newValue) {
            final int value = this.I.get();
            int i = 0;
            if (value == 0 && this.I.compareAndSet(0, newValue)) {
                int n;
                for (b<T>[] h = this.H; i < h.length; i = n) {
                    n = i + 1;
                    if (n != newValue) {
                        h[i].cancel();
                    }
                }
                return true;
            }
            return false;
        }
        
        public void cancel() {
            if (this.I.get() != -1) {
                this.I.lazySet(-1);
                final b<T>[] h = this.H;
                for (int length = h.length, i = 0; i < length; ++i) {
                    h[i].cancel();
                }
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                final int value = this.I.get();
                if (value > 0) {
                    this.H[value - 1].v(n);
                }
                else if (value == 0) {
                    final b<T>[] h = this.H;
                    for (int length = h.length, i = 0; i < length; ++i) {
                        h[i].v(n);
                    }
                }
            }
        }
    }
    
    static final class b<T> extends AtomicReference<d> implements q<T>, d
    {
        private static final long L = -1185974347409665484L;
        final a<T> G;
        final int H;
        final c<? super T> I;
        boolean J;
        final AtomicLong K;
        
        b(final a<T> g, final int h, final c<? super T> i) {
            this.K = new AtomicLong();
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void b(final Throwable t) {
            if (!this.J) {
                if (!this.G.b(this.H)) {
                    this.get().cancel();
                    io.reactivex.plugins.a.Y(t);
                    return;
                }
                this.J = true;
            }
            this.I.b(t);
        }
        
        public void cancel() {
            j.b(this);
        }
        
        public void f() {
            if (!this.J) {
                if (!this.G.b(this.H)) {
                    this.get().cancel();
                    return;
                }
                this.J = true;
            }
            this.I.f();
        }
        
        public void m(final T t) {
            if (!this.J) {
                if (!this.G.b(this.H)) {
                    this.get().cancel();
                    return;
                }
                this.J = true;
            }
            this.I.m((Object)t);
        }
        
        public void v(final long n) {
            j.d(this, this.K, n);
        }
        
        @Override
        public void z(final d d) {
            j.f(this, this.K, d);
        }
    }
}
