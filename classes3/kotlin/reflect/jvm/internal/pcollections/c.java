// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.pcollections;

final class c<V>
{
    static final c<Object> f;
    private final long a;
    private final V b;
    private final c<V> c;
    private final c<V> d;
    private final int e;
    
    static {
        f = new c<Object>();
    }
    
    private c() {
        this.e = 0;
        this.a = 0L;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    private c(final long a, final V b, final c<V> c, final c<V> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = c.e + 1 + d.e;
    }
    
    private long b() {
        final c<V> c = this.c;
        if (c.e == 0) {
            return this.a;
        }
        return c.b() + this.a;
    }
    
    private static <V> c<V> e(final long n, final V v, final c<V> c, final c<V> c2) {
        final int e = c.e;
        final int e2 = c2.e;
        if (e + e2 > 1) {
            if (e >= e2 * 5) {
                final c<V> c3 = c.c;
                final c<V> d = c.d;
                if (d.e < c3.e * 2) {
                    final long a = c.a;
                    return new c<V>(a + n, c.b, (c<Object>)c3, new c<Object>(-a, v, (c<Object>)d.g(d.a + a), (c<Object>)c2));
                }
                final c<V> c4 = d.c;
                final c<V> d2 = d.d;
                final long a2 = d.a;
                final long a3 = c.a;
                final V b = d.b;
                final c c5 = new c<Object>(-a2, c.b, (c<Object>)c3, (c<Object>)c4.g(c4.a + a2));
                final long a4 = c.a;
                final long n2 = -a4;
                final long a5 = d.a;
                return new c<V>(a3 + a2 + n, b, (c<Object>)c5, new c<Object>(n2 - a5, v, (c<Object>)d2.g(d2.a + a5 + a4), (c<Object>)c2));
            }
            else if (e2 >= e * 5) {
                final c<Object> c6 = (c<Object>)c2.c;
                final c<Object> d3 = (c<Object>)c2.d;
                if (c6.e < d3.e * 2) {
                    final long a6 = c2.a;
                    return new c<V>(a6 + n, c2.b, new c<Object>(-a6, v, (c<Object>)c, (c<Object>)c6.g(c6.a + a6)), d3);
                }
                final c<Object> c7 = c6.c;
                final c<Object> d4 = c6.d;
                final long a7 = c6.a;
                final long a8 = c2.a;
                final Object b2 = c6.b;
                final c c8 = new c<Object>(-a8 - a7, v, (c<Object>)c, c7.g(c7.a + a7 + a8));
                final long a9 = c6.a;
                return new c<V>(a7 + a8 + n, b2, (c<Object>)c8, new c<Object>(-a9, c2.b, (c<Object>)d4.g(d4.a + a9), d3));
            }
        }
        return new c<V>(n, v, c, c2);
    }
    
    private c<V> f(final c<V> c, final c<V> c2) {
        if (c == this.c && c2 == this.d) {
            return this;
        }
        return e(this.a, this.b, c, c2);
    }
    
    private c<V> g(final long n) {
        if (this.e != 0 && n != this.a) {
            return new c<V>(n, this.b, this.c, this.d);
        }
        return this;
    }
    
    V a(final long n) {
        if (this.e == 0) {
            return null;
        }
        final long a = this.a;
        c<V> c;
        if (n < a) {
            c = this.c;
        }
        else {
            if (n <= a) {
                return this.b;
            }
            c = this.d;
        }
        return (V)c.a(n - a);
    }
    
    c<V> c(long a) {
        if (this.e == 0) {
            return this;
        }
        final long a2 = this.a;
        if (a < a2) {
            return this.f(this.c.c(a - a2), this.d);
        }
        if (a > a2) {
            return this.f(this.c, this.d.c(a - a2));
        }
        final c<V> c = this.c;
        if (c.e == 0) {
            final c<V> d = this.d;
            return (c<V>)d.g(d.a + a2);
        }
        final c<V> d2 = this.d;
        if (d2.e == 0) {
            return (c<V>)c.g(c.a + a2);
        }
        final long b = d2.b();
        a = this.a;
        final long n = b + a;
        final V a3 = this.d.a(n - a);
        final c<V> c2 = this.d.c(n - this.a);
        final c g = c2.g(c2.a + this.a - n);
        final c<V> c3 = this.c;
        return e(n, a3, (c<V>)c3.g(c3.a + this.a - n), g);
    }
    
    c<V> d(final long n, final V v) {
        if (this.e == 0) {
            return new c<V>(n, v, this, this);
        }
        final long a = this.a;
        if (n < a) {
            return this.f(this.c.d(n - a, v), this.d);
        }
        if (n > a) {
            return this.f(this.c, this.d.d(n - a, v));
        }
        if (v == this.b) {
            return this;
        }
        return new c<V>(n, v, this.c, this.d);
    }
}
