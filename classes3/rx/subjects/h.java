// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import java.util.concurrent.TimeUnit;
import rx.functions.a;
import rx.internal.operators.x;
import rx.functions.b;
import rx.schedulers.d;
import rx.j;

public final class h<T> extends f<T, T>
{
    private final rx.subjects.g<T> H;
    private final j.a I;
    
    protected h(final a<T> a, final rx.subjects.g<T> h, final d d) {
        super(a);
        this.H = h;
        this.I = d.a();
    }
    
    public static <T> h<T> G7(final d d) {
        final rx.subjects.g<T> g = (rx.subjects.g<T>)new rx.subjects.g<Object>();
        final rx.functions.b<rx.subjects.g.c<T>> b = new rx.functions.b<rx.subjects.g.c<T>>() {
            public void a(final rx.subjects.g.c<T> c) {
                c.j(g.d());
            }
        };
        g.J = b;
        g.K = b;
        return new h<T>((a<Object>)g, (rx.subjects.g<Object>)g, d);
    }
    
    @Override
    public boolean E7() {
        return this.H.f().length > 0;
    }
    
    void H7() {
        final rx.subjects.g<T> h = this.H;
        if (h.H) {
            final rx.subjects.g.c<T>[] m = h.m(x.b());
            for (int length = m.length, i = 0; i < length; ++i) {
                m[i].c();
            }
        }
    }
    
    void I7(final Throwable t) {
        final rx.subjects.g<T> h = this.H;
        if (h.H) {
            final rx.subjects.g.c<T>[] m = h.m(x.c(t));
            for (int length = m.length, i = 0; i < length; ++i) {
                m[i].b(t);
            }
        }
    }
    
    void J7(final T t) {
        final rx.subjects.g.c<T>[] f = this.H.f();
        for (int length = f.length, i = 0; i < length; ++i) {
            f[i].m(t);
        }
    }
    
    public void K7(final long n) {
        this.I.d(new rx.functions.a() {
            @Override
            public void call() {
                h.this.H7();
            }
        }, n, TimeUnit.MILLISECONDS);
    }
    
    public void L7(final Throwable t, final long n) {
        this.I.d(new rx.functions.a() {
            @Override
            public void call() {
                h.this.I7(t);
            }
        }, n, TimeUnit.MILLISECONDS);
    }
    
    public void M7(final T t, final long n) {
        this.I.d(new rx.functions.a() {
            @Override
            public void call() {
                h.this.J7(t);
            }
        }, n, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public void b(final Throwable t) {
        this.L7(t, 0L);
    }
    
    @Override
    public void c() {
        this.K7(0L);
    }
    
    @Override
    public void m(final T t) {
        this.M7(t, 0L);
    }
}
