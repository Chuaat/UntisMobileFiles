// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.o;
import rx.h;
import rx.exceptions.c;
import java.util.Collections;
import java.util.ArrayList;
import rx.internal.producers.e;
import rx.n;
import rx.functions.q;
import java.util.Comparator;
import java.util.List;
import rx.g;

public final class a4<T> implements b<List<T>, T>
{
    private static final Comparator I;
    final Comparator<? super T> G;
    final int H;
    
    static {
        I = new c();
    }
    
    public a4(final int h) {
        this.G = (Comparator<? super T>)a4.I;
        this.H = h;
    }
    
    public a4(final q<? super T, ? super T, Integer> q, final int h) {
        this.H = h;
        this.G = new Comparator<T>() {
            @Override
            public int compare(final T t, final T t2) {
                return q.s(t, t2);
            }
        };
    }
    
    public n<? super T> a(final n<? super List<T>> n) {
        final e e = new e((n<? super T>)n);
        final n<T> n2 = new n<T>() {
            List<T> L = new ArrayList<T>(a4.this.H);
            boolean M;
            
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                if (!this.M) {
                    this.M = true;
                    final List<T> l = this.L;
                    this.L = null;
                    try {
                        Collections.sort(l, a4.this.G);
                        e.b(l);
                    }
                    finally {
                        final Throwable t;
                        rx.exceptions.c.f(t, this);
                    }
                }
            }
            
            @Override
            public void f() {
                this.v(Long.MAX_VALUE);
            }
            
            @Override
            public void m(final T t) {
                if (!this.M) {
                    this.L.add(t);
                }
            }
        };
        n.r(n2);
        n.s0(e);
        return n2;
    }
    
    static final class c implements Comparator<Object>
    {
        @Override
        public int compare(final Object o, final Object o2) {
            return ((Comparable)o).compareTo(o2);
        }
    }
}
