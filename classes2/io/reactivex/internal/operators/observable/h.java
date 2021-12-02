// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import java.util.Iterator;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.e;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;

public final class h<T> extends b0<T>
{
    final g0<? extends T>[] G;
    final Iterable<? extends g0<? extends T>> H;
    
    public h(final g0<? extends T>[] g, final Iterable<? extends g0<? extends T>> h) {
        this.G = g;
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        g0<? extends T>[] g = this.G;
        int length = 0;
        Label_0136: {
            if (g == null) {
                g0<? extends T>[] array = (g0<? extends T>[])new b0[8];
                try {
                    final Iterator<? extends g0<? extends T>> iterator = this.H.iterator();
                    int n = 0;
                    while (true) {
                        g = array;
                        length = n;
                        if (!iterator.hasNext()) {
                            break Label_0136;
                        }
                        final g0<? extends T> g2 = (g0<? extends T>)iterator.next();
                        if (g2 == null) {
                            break;
                        }
                        g = array;
                        if (n == array.length) {
                            g = (g0<? extends T>[])new g0[(n >> 2) + n];
                            System.arraycopy(array, 0, g, 0, n);
                        }
                        g[n] = g2;
                        ++n;
                        array = g;
                    }
                    e.l(new NullPointerException("One of the sources is null"), i0);
                    return;
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    e.l(t, i0);
                    return;
                }
            }
            length = g.length;
        }
        if (length == 0) {
            e.f(i0);
            return;
        }
        if (length == 1) {
            g[0].c(i0);
            return;
        }
        new a((i0<? super Object>)i0, length).a((g0[])g);
    }
    
    static final class a<T> implements c
    {
        final i0<? super T> G;
        final b<T>[] H;
        final AtomicInteger I;
        
        a(final i0<? super T> g, final int n) {
            this.I = new AtomicInteger();
            this.G = g;
            this.H = (b<T>[])new b[n];
        }
        
        public void a(final g0<? extends T>[] array) {
            final b<T>[] h = this.H;
            final int length = h.length;
            final int n = 0;
            int n2;
            for (int i = 0; i < length; i = n2) {
                n2 = i + 1;
                h[i] = (b<T>)new b((a<Object>)this, n2, (i0<? super Object>)this.G);
            }
            this.I.lazySet(0);
            this.G.l(this);
            for (int j = n; j < length; ++j) {
                if (this.I.get() != 0) {
                    return;
                }
                array[j].c(h[j]);
            }
        }
        
        public boolean b(final int newValue) {
            final int value = this.I.get();
            boolean b = true;
            int i = 0;
            if (value != 0) {
                if (value != newValue) {
                    b = false;
                }
                return b;
            }
            if (this.I.compareAndSet(0, newValue)) {
                int n;
                for (b<T>[] h = this.H; i < h.length; i = n) {
                    n = i + 1;
                    if (n != newValue) {
                        h[i].a();
                    }
                }
                return true;
            }
            return false;
        }
        
        @Override
        public void dispose() {
            if (this.I.get() != -1) {
                this.I.lazySet(-1);
                final b<T>[] h = this.H;
                for (int length = h.length, i = 0; i < length; ++i) {
                    h[i].a();
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.I.get() == -1;
        }
    }
    
    static final class b<T> extends AtomicReference<c> implements i0<T>
    {
        private static final long K = -1185974347409665484L;
        final a<T> G;
        final int H;
        final i0<? super T> I;
        boolean J;
        
        b(final a<T> g, final int h, final i0<? super T> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void a() {
            d.b(this);
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.J) {
                if (!this.G.b(this.H)) {
                    io.reactivex.plugins.a.Y(t);
                    return;
                }
                this.J = true;
            }
            this.I.b(t);
        }
        
        @Override
        public void f() {
            if (!this.J) {
                if (!this.G.b(this.H)) {
                    return;
                }
                this.J = true;
            }
            this.I.f();
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
        
        @Override
        public void m(final T t) {
            if (!this.J) {
                if (!this.G.b(this.H)) {
                    this.get().dispose();
                    return;
                }
                this.J = true;
            }
            this.I.m((Object)t);
        }
    }
}
