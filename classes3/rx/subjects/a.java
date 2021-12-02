// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import java.util.List;
import rx.exceptions.c;
import java.util.ArrayList;
import rx.i;
import rx.n;
import rx.internal.operators.x;
import rx.functions.b;

public final class a<T> extends f<T, T>
{
    final rx.subjects.g<T> H;
    volatile Object I;
    
    protected a(final g.a<T> a, final rx.subjects.g<T> h) {
        super(a);
        this.H = h;
    }
    
    public static <T> a<T> G7() {
        final rx.subjects.g<T> g = (rx.subjects.g<T>)new rx.subjects.g<Object>();
        g.K = new rx.functions.b<rx.subjects.g.c<T>>() {
            public void a(final rx.subjects.g.c<T> c) {
                final Object d = g.d();
                if (d != null && !x.f(d)) {
                    if (x.g(d)) {
                        c.b(x.d(d));
                    }
                    else {
                        c.G.s0(new rx.internal.producers.f<Object>((n<? super Object>)c.G, x.e(d)));
                    }
                }
                else {
                    c.c();
                }
            }
        };
        return new a<T>((g.a<Object>)g, (rx.subjects.g<Object>)g);
    }
    
    @Override
    public boolean E7() {
        return this.H.f().length > 0;
    }
    
    public Throwable H7() {
        final Object d = this.H.d();
        if (x.g(d)) {
            return x.d(d);
        }
        return null;
    }
    
    public T I7() {
        final Object i = this.I;
        if (!x.g(this.H.d()) && x.h(i)) {
            return (T)x.e(i);
        }
        return null;
    }
    
    public boolean J7() {
        final Object d = this.H.d();
        return d != null && !x.g(d);
    }
    
    public boolean K7() {
        return x.g(this.H.d());
    }
    
    public boolean L7() {
        final Object i = this.I;
        return !x.g(this.H.d()) && x.h(i);
    }
    
    @Override
    public void b(final Throwable t) {
        if (this.H.H) {
            final Object c = x.c(t);
            List<Throwable> list = null;
            for (final rx.subjects.g.c<T> c2 : this.H.m(c)) {
                try {
                    c2.b(t);
                }
                finally {
                    List<Throwable> list2 = list;
                    if (list == null) {
                        list2 = new ArrayList<Throwable>();
                    }
                    final Throwable t2;
                    list2.add(t2);
                    list = list2;
                }
            }
            rx.exceptions.c.d(list);
        }
    }
    
    @Override
    public void c() {
        if (this.H.H) {
            Object o;
            if ((o = this.I) == null) {
                o = x.b();
            }
            for (final rx.subjects.g.c<T> c : this.H.m(o)) {
                if (o == x.b()) {
                    c.c();
                }
                else {
                    c.G.s0(new rx.internal.producers.f<Object>((n<? super Object>)c.G, x.e(o)));
                }
            }
        }
    }
    
    @Override
    public void m(final T t) {
        this.I = x.j(t);
    }
}
