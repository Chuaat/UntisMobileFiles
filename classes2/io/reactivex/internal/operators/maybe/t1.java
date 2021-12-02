// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.v;
import x5.o;
import io.reactivex.y;
import io.reactivex.s;

public final class t1<T, R> extends s<R>
{
    final y<? extends T>[] G;
    final o<? super Object[], ? extends R> H;
    
    public t1(final y<? extends T>[] g, final o<? super Object[], ? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        final y<? extends T>[] g = this.G;
        final int length = g.length;
        int i = 0;
        if (length == 1) {
            g[0].c(new v0.a<Object, Object>((v<? super Object>)v, (o<? super Object, ?>)new a()));
            return;
        }
        final b b = new b(v, length, this.H);
        v.l(b);
        while (i < length) {
            if (b.i()) {
                return;
            }
            final y<? extends T> y = g[i];
            if (y == null) {
                b.c(new NullPointerException("One of the sources is null"), i);
                return;
            }
            y.c((v<? super T>)b.I[i]);
            ++i;
        }
    }
    
    final class a implements o<T, R>
    {
        @Override
        public R apply(final T t) throws Exception {
            return io.reactivex.internal.functions.b.g((R)t1.this.H.apply(new Object[] { t }), "The zipper returned a null value");
        }
    }
    
    static final class b<T, R> extends AtomicInteger implements c
    {
        private static final long K = -5556924161382950569L;
        final v<? super R> G;
        final o<? super Object[], ? extends R> H;
        final t1.c<T>[] I;
        final Object[] J;
        
        b(final v<? super R> g, final int initialValue, final o<? super Object[], ? extends R> h) {
            super(initialValue);
            this.G = g;
            this.H = h;
            final t1.c[] i = new t1.c[initialValue];
            for (int j = 0; j < initialValue; ++j) {
                i[j] = new t1.c((b<Object, ?>)this, j);
            }
            this.I = (t1.c<T>[])i;
            this.J = new Object[initialValue];
        }
        
        void a(final int n) {
            final t1.c<T>[] i = this.I;
            final int length = i.length;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= n) {
                    break;
                }
                i[n2].a();
                ++n2;
            }
            while (++n3 < length) {
                i[n3].a();
            }
        }
        
        void b(final int n) {
            if (this.getAndSet(0) > 0) {
                this.a(n);
                this.G.f();
            }
        }
        
        void c(final Throwable t, final int n) {
            if (this.getAndSet(0) > 0) {
                this.a(n);
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void d(final T t, final int n) {
            this.J[n] = t;
            if (this.decrementAndGet() == 0) {
                try {
                    this.G.d((Object)io.reactivex.internal.functions.b.g((Object)this.H.apply(this.J), "The zipper returned a null value"));
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.G.b(t2);
                }
            }
        }
        
        @Override
        public void dispose() {
            int i = 0;
            if (this.getAndSet(0) > 0) {
                for (t1.c<T>[] j = this.I; i < j.length; ++i) {
                    j[i].a();
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.get() <= 0;
        }
    }
    
    static final class c<T> extends AtomicReference<io.reactivex.disposables.c> implements v<T>
    {
        private static final long I = 3323743579927613702L;
        final b<T, ?> G;
        final int H;
        
        c(final b<T, ?> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public void a() {
            d.b(this);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.c(t, this.H);
        }
        
        @Override
        public void d(final T t) {
            this.G.d(t, this.H);
        }
        
        @Override
        public void f() {
            this.G.b(this.H);
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            d.j(this, c);
        }
    }
}
