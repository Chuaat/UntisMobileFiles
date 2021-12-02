// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.l;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.e;
import io.reactivex.exceptions.b;
import java.util.Arrays;
import io.reactivex.i0;
import io.reactivex.annotations.f;
import x5.o;
import io.reactivex.annotations.g;
import io.reactivex.g0;

public final class k4<T, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    @io.reactivex.annotations.g
    final g0<?>[] H;
    @io.reactivex.annotations.g
    final Iterable<? extends g0<?>> I;
    @f
    final o<? super Object[], R> J;
    
    public k4(@f final g0<T> g0, @f final Iterable<? extends g0<?>> i, @f final o<? super Object[], R> j) {
        super(g0);
        this.H = null;
        this.I = i;
        this.J = j;
    }
    
    public k4(@f final g0<T> g0, @f final g0<?>[] h, @f final o<? super Object[], R> j) {
        super(g0);
        this.H = h;
        this.I = null;
        this.J = j;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        g0<?>[] h = this.H;
        int length = 0;
        Label_0110: {
            if (h == null) {
                g0<?>[] original = (g0<?>[])new g0[8];
                try {
                    final Iterator<? extends g0<?>> iterator = this.I.iterator();
                    int n = 0;
                    while (true) {
                        h = original;
                        length = n;
                        if (!iterator.hasNext()) {
                            break Label_0110;
                        }
                        final g0<?> g0 = (g0<?>)iterator.next();
                        h = original;
                        if (n == original.length) {
                            h = Arrays.copyOf(original, (n >> 1) + n);
                        }
                        h[n] = g0;
                        ++n;
                        original = h;
                    }
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    e.l(t, i0);
                    return;
                }
            }
            length = h.length;
        }
        if (length == 0) {
            new w1<T, Object>(super.G, new a()).L5((i0<? super Object>)i0);
            return;
        }
        final b b = new b<Object, Object>((i0<? super Object>)i0, (o<? super Object[], Object>)this.J, length);
        i0.l(b);
        b.g(h, length);
        super.G.c(b);
    }
    
    final class a implements o<T, R>
    {
        @Override
        public R apply(final T t) throws Exception {
            return io.reactivex.internal.functions.b.g(k4.this.J.apply(new Object[] { t }), "The combiner returned a null value");
        }
    }
    
    static final class b<T, R> extends AtomicInteger implements i0<T>, c
    {
        private static final long N = 1577321883966341961L;
        final i0<? super R> G;
        final o<? super Object[], R> H;
        final k4.c[] I;
        final AtomicReferenceArray<Object> J;
        final AtomicReference<c> K;
        final io.reactivex.internal.util.c L;
        volatile boolean M;
        
        b(final i0<? super R> g, final o<? super Object[], R> h, final int length) {
            this.G = g;
            this.H = h;
            final k4.c[] i = new k4.c[length];
            for (int j = 0; j < length; ++j) {
                i[j] = new k4.c((b<?, ?>)this, j);
            }
            this.I = i;
            this.J = new AtomicReferenceArray<Object>(length);
            this.K = new AtomicReference<c>();
            this.L = new io.reactivex.internal.util.c();
        }
        
        void a(final int n) {
            final k4.c[] i = this.I;
            for (int j = 0; j < i.length; ++j) {
                if (j != n) {
                    i[j].a();
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.M) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.M = true;
            this.a(-1);
            l.c(this.G, t, this, this.L);
        }
        
        void c(final int n, final boolean b) {
            if (!b) {
                this.M = true;
                this.a(n);
                l.a(this.G, this, this.L);
            }
        }
        
        void d(final int n, final Throwable t) {
            this.M = true;
            d.b(this.K);
            this.a(n);
            l.c(this.G, t, this, this.L);
        }
        
        @Override
        public void dispose() {
            d.b(this.K);
            final k4.c[] i = this.I;
            for (int length = i.length, j = 0; j < length; ++j) {
                i[j].a();
            }
        }
        
        void e(final int i, final Object newValue) {
            this.J.set(i, newValue);
        }
        
        @Override
        public void f() {
            if (!this.M) {
                this.M = true;
                this.a(-1);
                l.a(this.G, this, this.L);
            }
        }
        
        void g(final g0<?>[] array, final int n) {
            final k4.c[] i = this.I;
            final AtomicReference<c> k = this.K;
            for (int n2 = 0; n2 < n && !d.d(k.get()) && !this.M; ++n2) {
                array[n2].c(i[n2]);
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.K.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this.K, c);
        }
        
        @Override
        public void m(final T t) {
            if (this.M) {
                return;
            }
            final AtomicReferenceArray<Object> j = this.J;
            final int length = j.length();
            final Object[] array = new Object[length + 1];
            int i = 0;
            array[0] = t;
            while (i < length) {
                final Object value = j.get(i);
                if (value == null) {
                    return;
                }
                ++i;
                array[i] = value;
            }
            try {
                l.e(this.G, io.reactivex.internal.functions.b.g(this.H.apply(array), "combiner returned a null value"), this, this.L);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.dispose();
                this.b(t2);
            }
        }
    }
    
    static final class c extends AtomicReference<io.reactivex.disposables.c> implements i0<Object>
    {
        private static final long J = 3256684027868224024L;
        final b<?, ?> G;
        final int H;
        boolean I;
        
        c(final b<?, ?> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public void a() {
            d.b(this);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.d(this.H, t);
        }
        
        @Override
        public void f() {
            this.G.c(this.H, this.I);
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            d.j(this, c);
        }
        
        @Override
        public void m(final Object o) {
            if (!this.I) {
                this.I = true;
            }
            this.G.e(this.H, o);
        }
    }
}
