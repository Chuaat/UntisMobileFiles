// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import java.util.Iterator;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import java.util.Arrays;
import io.reactivex.internal.disposables.e;
import io.reactivex.v;
import x5.o;
import io.reactivex.y;
import io.reactivex.s;

public final class u1<T, R> extends s<R>
{
    final Iterable<? extends y<? extends T>> G;
    final o<? super Object[], ? extends R> H;
    
    public u1(final Iterable<? extends y<? extends T>> g, final o<? super Object[], ? extends R> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        y[] original = new y[8];
        try {
            final Iterator<? extends y<? extends T>> iterator = this.G.iterator();
            int i = 0;
            int n = 0;
            while (iterator.hasNext()) {
                final y y = (y)iterator.next();
                if (y == null) {
                    e.j(new NullPointerException("One of the sources is null"), v);
                    return;
                }
                y[] array = original;
                if (n == original.length) {
                    array = Arrays.copyOf(original, (n >> 2) + n);
                }
                array[n] = y;
                ++n;
                original = array;
            }
            if (n == 0) {
                e.d(v);
                return;
            }
            if (n == 1) {
                original[0].c(new v0.a((v<? super Object>)v, (o<? super Object, ?>)new a()));
                return;
            }
            final t1.b b = new t1.b((v<? super Object>)v, n, this.H);
            v.l(b);
            while (i < n) {
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
            e.j(t, v);
        }
    }
    
    final class a implements o<T, R>
    {
        @Override
        public R apply(final T t) throws Exception {
            return io.reactivex.internal.functions.b.g((R)u1.this.H.apply(new Object[] { t }), "The zipper returned a null value");
        }
    }
}
