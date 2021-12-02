// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import java.util.Iterator;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.e;
import io.reactivex.v;
import io.reactivex.y;
import io.reactivex.s;

public final class b<T> extends s<T>
{
    private final y<? extends T>[] G;
    private final Iterable<? extends y<? extends T>> H;
    
    public b(final y<? extends T>[] g, final Iterable<? extends y<? extends T>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        y<? extends T>[] g = this.G;
        int length = 0;
        Label_0136: {
            if (g == null) {
                y<? extends T>[] array = (y<? extends T>[])new y[8];
                try {
                    final Iterator<? extends y<? extends T>> iterator = this.H.iterator();
                    int n = 0;
                    while (true) {
                        g = array;
                        length = n;
                        if (!iterator.hasNext()) {
                            break Label_0136;
                        }
                        final y<? extends T> y = (y<? extends T>)iterator.next();
                        if (y == null) {
                            break;
                        }
                        g = array;
                        if (n == array.length) {
                            g = (y<? extends T>[])new y[(n >> 2) + n];
                            System.arraycopy(array, 0, g, 0, n);
                        }
                        g[n] = y;
                        ++n;
                        array = g;
                    }
                    e.j(new NullPointerException("One of the sources is null"), v);
                    return;
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    e.j(t, v);
                    return;
                }
            }
            length = g.length;
        }
        final io.reactivex.disposables.b b = new io.reactivex.disposables.b();
        v.l(b);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (final y<? extends T> y2 : g) {
            if (b.i()) {
                return;
            }
            if (y2 == null) {
                b.dispose();
                final NullPointerException ex = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    v.b(ex);
                }
                else {
                    io.reactivex.plugins.a.Y(ex);
                }
                return;
            }
            y2.c(new a<Object>(v, b, atomicBoolean));
        }
        if (length == 0) {
            v.f();
        }
    }
    
    static final class a<T> implements v<T>
    {
        final v<? super T> G;
        final AtomicBoolean H;
        final io.reactivex.disposables.b I;
        c J;
        
        a(final v<? super T> g, final io.reactivex.disposables.b i, final AtomicBoolean h) {
            this.G = g;
            this.I = i;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.H.compareAndSet(false, true)) {
                this.I.c(this.J);
                this.I.dispose();
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void d(final T t) {
            if (this.H.compareAndSet(false, true)) {
                this.I.c(this.J);
                this.I.dispose();
                this.G.d((Object)t);
            }
        }
        
        @Override
        public void f() {
            if (this.H.compareAndSet(false, true)) {
                this.I.c(this.J);
                this.I.dispose();
                this.G.f();
            }
        }
        
        @Override
        public void l(final c j) {
            this.J = j;
            this.I.b(j);
        }
    }
}
