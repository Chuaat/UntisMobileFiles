// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import io.reactivex.q;
import o7.d;
import java.util.Arrays;
import o7.c;
import io.reactivex.annotations.f;
import io.reactivex.l;
import x5.o;
import o7.b;
import io.reactivex.annotations.g;
import org.reactivestreams.Publisher;

public final class y4<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    @g
    final Publisher<?>[] I;
    @g
    final Iterable<? extends o7.b<?>> J;
    final o<? super Object[], R> K;
    
    public y4(@f final l<T> l, @f final Iterable<? extends o7.b<?>> j, @f final o<? super Object[], R> k) {
        super(l);
        this.I = null;
        this.J = j;
        this.K = k;
    }
    
    public y4(@f final l<T> l, @f final Publisher<?>[] i, final o<? super Object[], R> k) {
        super(l);
        this.I = (o7.b[])i;
        this.J = null;
        this.K = k;
    }
    
    @Override
    protected void n6(final o7.c<? super R> c) {
        o7.b[] i = this.I;
        int length = 0;
        Label_0110: {
            if (i == null) {
                o7.b[] original = new o7.b[8];
                try {
                    final Iterator<? extends o7.b<?>> iterator = this.J.iterator();
                    int n = 0;
                    while (true) {
                        i = original;
                        length = n;
                        if (!iterator.hasNext()) {
                            break Label_0110;
                        }
                        final o7.b b = (o7.b)iterator.next();
                        i = original;
                        if (n == original.length) {
                            i = Arrays.copyOf(original, (n >> 1) + n);
                        }
                        i[n] = b;
                        ++n;
                        original = i;
                    }
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.internal.subscriptions.g.d(t, c);
                    return;
                }
            }
            length = i.length;
        }
        if (length == 0) {
            new b2<T, Object>(super.H, new a()).n6((o7.c<? super Object>)c);
            return;
        }
        final b b2 = new b<Object, Object>((o7.c<? super Object>)c, (o<? super Object[], Object>)this.K, length);
        c.z((d)b2);
        b2.g(i, length);
        super.H.m6(b2);
    }
    
    final class a implements o<T, R>
    {
        @Override
        public R apply(final T t) throws Exception {
            return io.reactivex.internal.functions.b.g(y4.this.K.apply(new Object[] { t }), "The combiner returned a null value");
        }
    }
    
    static final class b<T, R> extends AtomicInteger implements y5.a<T>, d
    {
        private static final long O = 1577321883966341961L;
        final o7.c<? super R> G;
        final o<? super Object[], R> H;
        final c[] I;
        final AtomicReferenceArray<Object> J;
        final AtomicReference<d> K;
        final AtomicLong L;
        final io.reactivex.internal.util.c M;
        volatile boolean N;
        
        b(final o7.c<? super R> g, final o<? super Object[], R> h, final int length) {
            this.G = g;
            this.H = h;
            final c[] i = new c[length];
            for (int j = 0; j < length; ++j) {
                i[j] = new c((b<?, ?>)this, j);
            }
            this.I = i;
            this.J = new AtomicReferenceArray<Object>(length);
            this.K = new AtomicReference<d>();
            this.L = new AtomicLong();
            this.M = new io.reactivex.internal.util.c();
        }
        
        @Override
        public boolean B(final T t) {
            if (this.N) {
                return false;
            }
            final AtomicReferenceArray<Object> j = this.J;
            final int length = j.length();
            final Object[] array = new Object[length + 1];
            array[0] = t;
            Object value;
            for (int i = 0; i < length; ++i, array[i] = value) {
                value = j.get(i);
                if (value == null) {
                    return false;
                }
            }
            try {
                io.reactivex.internal.util.l.f(this.G, io.reactivex.internal.functions.b.g(this.H.apply(array), "The combiner returned a null value"), this, this.M);
                return true;
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.cancel();
                this.b(t2);
                return false;
            }
        }
        
        void a(final int n) {
            final c[] i = this.I;
            for (int j = 0; j < i.length; ++j) {
                if (j != n) {
                    i[j].a();
                }
            }
        }
        
        public void b(final Throwable t) {
            if (this.N) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.N = true;
            this.a(-1);
            io.reactivex.internal.util.l.d(this.G, t, this, this.M);
        }
        
        void c(final int n, final boolean b) {
            if (!b) {
                this.N = true;
                j.b(this.K);
                this.a(n);
                io.reactivex.internal.util.l.b(this.G, this, this.M);
            }
        }
        
        public void cancel() {
            j.b(this.K);
            final c[] i = this.I;
            for (int length = i.length, j = 0; j < length; ++j) {
                i[j].a();
            }
        }
        
        void d(final int n, final Throwable t) {
            this.N = true;
            j.b(this.K);
            this.a(n);
            io.reactivex.internal.util.l.d(this.G, t, this, this.M);
        }
        
        void e(final int i, final Object newValue) {
            this.J.set(i, newValue);
        }
        
        public void f() {
            if (!this.N) {
                this.N = true;
                this.a(-1);
                io.reactivex.internal.util.l.b(this.G, this, this.M);
            }
        }
        
        void g(final Publisher<?>[] array, final int n) {
            final c[] i = this.I;
            final AtomicReference<d> k = this.K;
            for (int j = 0; j < n; ++j) {
                if (k.get() == j.G) {
                    return;
                }
                ((o7.b)array[j]).e((o7.c)i[j]);
            }
        }
        
        public void m(final T t) {
            if (!this.B(t) && !this.N) {
                this.K.get().v(1L);
            }
        }
        
        public void v(final long n) {
            j.d(this.K, this.L, n);
        }
        
        public void z(final d d) {
            j.f(this.K, this.L, d);
        }
    }
    
    static final class c extends AtomicReference<d> implements q<Object>
    {
        private static final long J = 3256684027868224024L;
        final b<?, ?> G;
        final int H;
        boolean I;
        
        c(final b<?, ?> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        void a() {
            j.b(this);
        }
        
        public void b(final Throwable t) {
            this.G.d(this.H, t);
        }
        
        public void f() {
            this.G.c(this.H, this.I);
        }
        
        public void m(final Object o) {
            if (!this.I) {
                this.I = true;
            }
            this.G.e(this.H, o);
        }
        
        @Override
        public void z(final d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
}
