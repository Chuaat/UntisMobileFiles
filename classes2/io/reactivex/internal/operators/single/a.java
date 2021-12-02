// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import java.util.Iterator;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.e;
import io.reactivex.n0;
import io.reactivex.q0;
import io.reactivex.k0;

public final class a<T> extends k0<T>
{
    private final q0<? extends T>[] G;
    private final Iterable<? extends q0<? extends T>> H;
    
    public a(final q0<? extends T>[] g, final Iterable<? extends q0<? extends T>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        q0<? extends T>[] g = this.G;
        Label_0136: {
            if (g == null) {
                q0<? extends T>[] array = (q0<? extends T>[])new q0[8];
                try {
                    final Iterator<? extends q0<? extends T>> iterator = this.H.iterator();
                    int n2 = 0;
                    while (true) {
                        g = array;
                        final int length = n2;
                        if (!iterator.hasNext()) {
                            break Label_0136;
                        }
                        final q0<? extends T> q0 = (q0<? extends T>)iterator.next();
                        if (q0 == null) {
                            break;
                        }
                        g = array;
                        if (n2 == array.length) {
                            g = (q0<? extends T>[])new q0[(n2 >> 2) + n2];
                            System.arraycopy(array, 0, g, 0, n2);
                        }
                        g[n2] = q0;
                        ++n2;
                        array = g;
                    }
                    e.m(new NullPointerException("One of the sources is null"), n0);
                    return;
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    e.m(t, n0);
                    return;
                }
            }
            final int length = g.length;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final io.reactivex.disposables.b b = new io.reactivex.disposables.b();
        n0.l(b);
        for (final q0<? extends T> q2 : g) {
            if (b.i()) {
                return;
            }
            if (q2 == null) {
                b.dispose();
                final NullPointerException ex = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    n0.b(ex);
                }
                else {
                    a.Y(ex);
                }
                return;
            }
            q2.c(new a<Object>(n0, b, atomicBoolean));
        }
    }
    
    static final class a<T> implements n0<T>
    {
        final io.reactivex.disposables.b G;
        final n0<? super T> H;
        final AtomicBoolean I;
        c J;
        
        a(final n0<? super T> h, final io.reactivex.disposables.b g, final AtomicBoolean i) {
            this.H = h;
            this.G = g;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I.compareAndSet(false, true)) {
                this.G.c(this.J);
                this.G.dispose();
                this.H.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void d(final T t) {
            if (this.I.compareAndSet(false, true)) {
                this.G.c(this.J);
                this.G.dispose();
                this.H.d((Object)t);
            }
        }
        
        @Override
        public void l(final c j) {
            this.J = j;
            this.G.b(j);
        }
    }
}
