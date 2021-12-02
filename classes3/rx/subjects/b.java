// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import java.util.List;
import rx.exceptions.c;
import java.util.ArrayList;
import java.lang.reflect.Array;
import rx.internal.operators.x;

public final class b<T> extends f<T, T>
{
    private static final Object[] I;
    private final rx.subjects.g<T> H;
    
    static {
        I = new Object[0];
    }
    
    protected b(final a<T> a, final rx.subjects.g<T> h) {
        super(a);
        this.H = h;
    }
    
    public static <T> b<T> G7() {
        return I7((T)null, false);
    }
    
    public static <T> b<T> H7(final T t) {
        return I7(t, true);
    }
    
    private static <T> b<T> I7(final T t, final boolean b) {
        final rx.subjects.g<T> g = (rx.subjects.g<T>)new rx.subjects.g<Object>();
        if (b) {
            g.i(x.j(t));
        }
        final rx.functions.b<rx.subjects.g.c<T>> b2 = new rx.functions.b<rx.subjects.g.c<T>>() {
            public void a(final rx.subjects.g.c<T> c) {
                c.j(g.d());
            }
        };
        g.J = b2;
        g.K = b2;
        return new b<T>((a<Object>)g, (rx.subjects.g<Object>)g);
    }
    
    @Override
    public boolean E7() {
        return this.H.f().length > 0;
    }
    
    public Throwable J7() {
        final Object d = this.H.d();
        if (x.g(d)) {
            return x.d(d);
        }
        return null;
    }
    
    public T K7() {
        final Object d = this.H.d();
        if (x.h(d)) {
            return (T)x.e(d);
        }
        return null;
    }
    
    public Object[] L7() {
        final Object[] i = b.I;
        final Object[] m7 = this.M7(i);
        if (m7 == i) {
            return new Object[0];
        }
        return m7;
    }
    
    public T[] M7(final T[] array) {
        final Object d = this.H.d();
        T[] array3;
        if (x.h(d)) {
            Object[] array2 = array;
            if (array.length == 0) {
                array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), 1);
            }
            array2[0] = x.e(d);
            array3 = (T[])array2;
            if (((T[])array2).length > 1) {
                array2[1] = null;
                array3 = (T[])array2;
            }
        }
        else {
            array3 = array;
            if (array.length > 0) {
                array[0] = null;
                array3 = array;
            }
        }
        return array3;
    }
    
    public boolean N7() {
        return x.f(this.H.d());
    }
    
    public boolean O7() {
        return x.g(this.H.d());
    }
    
    public boolean P7() {
        return x.h(this.H.d());
    }
    
    int Q7() {
        return this.H.f().length;
    }
    
    @Override
    public void b(Throwable t) {
        if (this.H.d() == null || this.H.H) {
            final Object c = x.c(t);
            t = null;
            for (final rx.subjects.g.c<T> c2 : this.H.m(c)) {
                try {
                    c2.l(c);
                }
                finally {
                    Object o = t;
                    if (t == null) {
                        o = new ArrayList<Throwable>();
                    }
                    final Throwable t2;
                    ((List<Throwable>)o).add(t2);
                    t = (Throwable)o;
                }
            }
            rx.exceptions.c.d((List<? extends Throwable>)t);
        }
    }
    
    @Override
    public void c() {
        if (this.H.d() == null || this.H.H) {
            final Object b = x.b();
            final rx.subjects.g.c<T>[] m = this.H.m(b);
            for (int length = m.length, i = 0; i < length; ++i) {
                m[i].l(b);
            }
        }
    }
    
    @Override
    public void m(final T t) {
        if (this.H.d() == null || this.H.H) {
            final Object j = x.j(t);
            final rx.subjects.g.c<T>[] e = this.H.e(j);
            for (int length = e.length, i = 0; i < length; ++i) {
                e[i].l(j);
            }
        }
    }
}
