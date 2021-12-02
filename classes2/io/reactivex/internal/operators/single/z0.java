// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import java.util.Iterator;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import java.util.NoSuchElementException;
import java.util.Arrays;
import io.reactivex.internal.disposables.e;
import io.reactivex.n0;
import x5.o;
import io.reactivex.q0;
import io.reactivex.k0;

public final class z0<T, R> extends k0<R>
{
    final Iterable<? extends q0<? extends T>> G;
    final o<? super Object[], ? extends R> H;
    
    public z0(final Iterable<? extends q0<? extends T>> g, final o<? super Object[], ? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super R> n0) {
        q0[] original = new q0[8];
        try {
            final Iterator<? extends q0<? extends T>> iterator = this.G.iterator();
            int i = 0;
            int n2 = 0;
            while (iterator.hasNext()) {
                final q0 q0 = (q0)iterator.next();
                if (q0 == null) {
                    e.m(new NullPointerException("One of the sources is null"), n0);
                    return;
                }
                q0[] array = original;
                if (n2 == original.length) {
                    array = Arrays.copyOf(original, (n2 >> 2) + n2);
                }
                array[n2] = q0;
                ++n2;
                original = array;
            }
            if (n2 == 0) {
                e.m(new NoSuchElementException(), n0);
                return;
            }
            if (n2 == 1) {
                original[0].c(new io.reactivex.internal.operators.single.k0.a((n0<? super Object>)n0, (o<? super Object, ?>)new a()));
                return;
            }
            final y0.b b = new y0.b((n0<? super Object>)n0, n2, this.H);
            n0.l(b);
            while (i < n2) {
                if (b.i()) {
                    return;
                }
                original[i].c(b.I[i]);
                ++i;
            }
        }
        finally {
            final Throwable t;
            b.b(t);
            e.m(t, n0);
        }
    }
    
    final class a implements o<T, R>
    {
        @Override
        public R apply(final T t) throws Exception {
            return io.reactivex.internal.functions.b.g((R)z0.this.H.apply(new Object[] { t }), "The zipper returned a null value");
        }
    }
}
