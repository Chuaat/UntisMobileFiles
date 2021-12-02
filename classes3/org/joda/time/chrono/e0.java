// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.field.d;
import java.util.Locale;
import org.joda.time.o;
import org.joda.time.n0;
import org.joda.time.field.c;
import org.joda.time.p;
import org.joda.time.l;
import java.util.HashMap;
import org.joda.time.f;
import org.joda.time.i;

public final class e0 extends org.joda.time.chrono.a
{
    private static final long u0 = -1079258847191166848L;
    private static final long v0 = 604800000L;
    
    private e0(final org.joda.time.a a, final i i) {
        super(a, i);
    }
    
    private f c0(final f key, final HashMap<Object, Object> hashMap) {
        if (key == null || !key.M()) {
            return key;
        }
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        final a value = new a(key, this.s(), this.d0(key.t(), hashMap), this.d0(key.I(), hashMap), this.d0(key.v(), hashMap));
        hashMap.put(key, value);
        return value;
    }
    
    private l d0(final l key, final HashMap<Object, Object> hashMap) {
        if (key == null || !key.z()) {
            return key;
        }
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        final b value = new b(key, this.s());
        hashMap.put(key, value);
        return value;
    }
    
    public static e0 e0(org.joda.time.a r, final i i) {
        if (r == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        r = r.R();
        if (r == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (i != null) {
            return new e0(r, i);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }
    
    private long f0(final long n) {
        if (n == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (n == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        final i s = this.s();
        final int y = s.y(n);
        final long n2 = n - y;
        if (n > 604800000L && n2 < 0L) {
            return Long.MAX_VALUE;
        }
        if (n < -604800000L && n2 > 0L) {
            return Long.MIN_VALUE;
        }
        if (y == s.w(n2)) {
            return n2;
        }
        throw new p(n, s.q());
    }
    
    static boolean g0(final l l) {
        return l != null && l.o() < 43200000L;
    }
    
    @Override
    public org.joda.time.a R() {
        return this.Y();
    }
    
    @Override
    public org.joda.time.a S(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        if (n == this.Z()) {
            return this;
        }
        if (n == i.I) {
            return this.Y();
        }
        return new e0(this.Y(), n);
    }
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        a.l = this.d0(a.l, hashMap);
        a.k = this.d0(a.k, hashMap);
        a.j = this.d0(a.j, hashMap);
        a.i = this.d0(a.i, hashMap);
        a.h = this.d0(a.h, hashMap);
        a.g = this.d0(a.g, hashMap);
        a.f = this.d0(a.f, hashMap);
        a.e = this.d0(a.e, hashMap);
        a.d = this.d0(a.d, hashMap);
        a.c = this.d0(a.c, hashMap);
        a.b = this.d0(a.b, hashMap);
        a.a = this.d0(a.a, hashMap);
        a.E = this.c0(a.E, hashMap);
        a.F = this.c0(a.F, hashMap);
        a.G = this.c0(a.G, hashMap);
        a.H = this.c0(a.H, hashMap);
        a.I = this.c0(a.I, hashMap);
        a.x = this.c0(a.x, hashMap);
        a.y = this.c0(a.y, hashMap);
        a.z = this.c0(a.z, hashMap);
        a.D = this.c0(a.D, hashMap);
        a.A = this.c0(a.A, hashMap);
        a.B = this.c0(a.B, hashMap);
        a.C = this.c0(a.C, hashMap);
        a.m = this.c0(a.m, hashMap);
        a.n = this.c0(a.n, hashMap);
        a.o = this.c0(a.o, hashMap);
        a.p = this.c0(a.p, hashMap);
        a.q = this.c0(a.q, hashMap);
        a.r = this.c0(a.r, hashMap);
        a.s = this.c0(a.s, hashMap);
        a.u = this.c0(a.u, hashMap);
        a.t = this.c0(a.t, hashMap);
        a.v = this.c0(a.v, hashMap);
        a.w = this.c0(a.w, hashMap);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof e0)) {
            return false;
        }
        final e0 e0 = (e0)o;
        if (!this.Y().equals(e0.Y()) || !this.s().equals(e0.s())) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return this.s().hashCode() * 11 + 326565 + this.Y().hashCode() * 7;
    }
    
    @Override
    public long p(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        return this.f0(this.Y().p(n, n2, n3, n4));
    }
    
    @Override
    public long q(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) throws IllegalArgumentException {
        return this.f0(this.Y().q(n, n2, n3, n4, n5, n6, n7));
    }
    
    @Override
    public long r(final long n, final int n2, final int n3, final int n4, final int n5) throws IllegalArgumentException {
        return this.f0(this.Y().r(this.s().w(n) + n, n2, n3, n4, n5));
    }
    
    @Override
    public i s() {
        return (i)this.Z();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ZonedChronology[");
        sb.append(this.Y());
        sb.append(", ");
        sb.append(this.s().q());
        sb.append(']');
        return sb.toString();
    }
    
    static final class a extends c
    {
        private static final long h = -3968986277775529794L;
        final f b;
        final i c;
        final l d;
        final boolean e;
        final l f;
        final l g;
        
        a(final f b, final i c, final l d, final l f, final l g) {
            super(b.J());
            if (b.M()) {
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e0.g0(d);
                this.f = f;
                this.g = g;
                return;
            }
            throw new IllegalArgumentException();
        }
        
        private int a0(final long n) {
            final int w = this.c.w(n);
            final long n2 = w;
            if ((n + n2 ^ n) < 0L && (n ^ n2) >= 0L) {
                throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            return w;
        }
        
        @Override
        public int B(final n0 n0) {
            return this.b.B(n0);
        }
        
        @Override
        public int C(final n0 n0, final int[] array) {
            return this.b.C(n0, array);
        }
        
        @Override
        public int D() {
            return this.b.D();
        }
        
        @Override
        public int E(long e) {
            e = this.c.e(e);
            return this.b.E(e);
        }
        
        @Override
        public int F(final n0 n0) {
            return this.b.F(n0);
        }
        
        @Override
        public int G(final n0 n0, final int[] array) {
            return this.b.G(n0, array);
        }
        
        @Override
        public final l I() {
            return this.f;
        }
        
        @Override
        public boolean K(long e) {
            e = this.c.e(e);
            return this.b.K(e);
        }
        
        @Override
        public boolean L() {
            return this.b.L();
        }
        
        @Override
        public long N(long e) {
            e = this.c.e(e);
            return this.b.N(e);
        }
        
        @Override
        public long O(final long n) {
            if (this.e) {
                final int a0 = this.a0(n);
                final f b = this.b;
                final long n2 = a0;
                return b.O(n + n2) - n2;
            }
            return this.c.c(this.b.O(this.c.e(n)), false, n);
        }
        
        @Override
        public long P(final long n) {
            if (this.e) {
                final int a0 = this.a0(n);
                final f b = this.b;
                final long n2 = a0;
                return b.P(n + n2) - n2;
            }
            return this.c.c(this.b.P(this.c.e(n)), false, n);
        }
        
        @Override
        public long T(long c, final int i) {
            final long t = this.b.T(this.c.e(c), i);
            c = this.c.c(t, false, c);
            if (this.g(c) == i) {
                return c;
            }
            final p cause = new p(t, this.c.q());
            final o o = new o(this.b.J(), i, cause.getMessage());
            o.initCause(cause);
            throw o;
        }
        
        @Override
        public long V(final long n, final String s, final Locale locale) {
            return this.c.c(this.b.V(this.c.e(n), s, locale), false, n);
        }
        
        @Override
        public long a(final long n, final int n2) {
            if (this.e) {
                final int a0 = this.a0(n);
                final f b = this.b;
                final long n3 = a0;
                return b.a(n + n3, n2) - n3;
            }
            return this.c.c(this.b.a(this.c.e(n), n2), false, n);
        }
        
        @Override
        public long b(final long n, long b) {
            if (this.e) {
                final int a0 = this.a0(n);
                final f b2 = this.b;
                final long n2 = a0;
                return b2.b(n + n2, b) - n2;
            }
            b = this.b.b(this.c.e(n), b);
            return this.c.c(b, false, n);
        }
        
        @Override
        public long d(final long n, final int n2) {
            if (this.e) {
                final int a0 = this.a0(n);
                final f b = this.b;
                final long n3 = a0;
                return b.d(n + n3, n2) - n3;
            }
            return this.c.c(this.b.d(this.c.e(n), n2), false, n);
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof a) {
                final a a = (a)o;
                if (!this.b.equals(a.b) || !this.c.equals(a.c) || !this.d.equals(a.d) || !this.f.equals(a.f)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int g(long e) {
            e = this.c.e(e);
            return this.b.g(e);
        }
        
        @Override
        public String h(final int n, final Locale locale) {
            return this.b.h(n, locale);
        }
        
        @Override
        public int hashCode() {
            return this.b.hashCode() ^ this.c.hashCode();
        }
        
        @Override
        public String j(long e, final Locale locale) {
            e = this.c.e(e);
            return this.b.j(e, locale);
        }
        
        @Override
        public String m(final int n, final Locale locale) {
            return this.b.m(n, locale);
        }
        
        @Override
        public String o(long e, final Locale locale) {
            e = this.c.e(e);
            return this.b.o(e, locale);
        }
        
        @Override
        public int r(final long n, final long n2) {
            final int a0 = this.a0(n2);
            final f b = this.b;
            int a2;
            if (this.e) {
                a2 = a0;
            }
            else {
                a2 = this.a0(n);
            }
            return b.r(n + a2, n2 + a0);
        }
        
        @Override
        public long s(final long n, final long n2) {
            final int a0 = this.a0(n2);
            final f b = this.b;
            int a2;
            if (this.e) {
                a2 = a0;
            }
            else {
                a2 = this.a0(n);
            }
            return b.s(n + a2, n2 + a0);
        }
        
        @Override
        public final l t() {
            return this.d;
        }
        
        @Override
        public int u(long e) {
            e = this.c.e(e);
            return this.b.u(e);
        }
        
        @Override
        public final l v() {
            return this.g;
        }
        
        @Override
        public int w(final Locale locale) {
            return this.b.w(locale);
        }
        
        @Override
        public int x(final Locale locale) {
            return this.b.x(locale);
        }
        
        @Override
        public int y() {
            return this.b.y();
        }
        
        @Override
        public int z(long e) {
            e = this.c.e(e);
            return this.b.z(e);
        }
    }
    
    static class b extends d
    {
        private static final long L = -485345310999208286L;
        final l I;
        final boolean J;
        final i K;
        
        b(final l i, final i k) {
            super(i.m());
            if (i.z()) {
                this.I = i;
                this.J = e0.g0(i);
                this.K = k;
                return;
            }
            throw new IllegalArgumentException();
        }
        
        private long I(final long n) {
            return this.K.e(n);
        }
        
        private int K(final long n) {
            final int y = this.K.y(n);
            final long n2 = y;
            if ((n - n2 ^ n) < 0L && (n ^ n2) < 0L) {
                throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
            return y;
        }
        
        private int M(final long n) {
            final int w = this.K.w(n);
            final long n2 = w;
            if ((n + n2 ^ n) < 0L && (n ^ n2) >= 0L) {
                throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            return w;
        }
        
        @Override
        public long b(long b, int k) {
            final int m = this.M(b);
            b = this.I.b(b + m, k);
            if (this.J) {
                k = m;
            }
            else {
                k = this.K(b);
            }
            return b - k;
        }
        
        @Override
        public long d(long d, final long n) {
            int n2 = this.M(d);
            d = this.I.d(d + n2, n);
            if (!this.J) {
                n2 = this.K(d);
            }
            return d - n2;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o instanceof b) {
                final b b2 = (b)o;
                if (!this.I.equals(b2.I) || !this.K.equals(b2.K)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int f(final long n, final long n2) {
            final int m = this.M(n2);
            final l i = this.I;
            int j;
            if (this.J) {
                j = m;
            }
            else {
                j = this.M(n);
            }
            return i.f(n + j, n2 + m);
        }
        
        @Override
        public long g(final long n, final long n2) {
            final int m = this.M(n2);
            final l i = this.I;
            int j;
            if (this.J) {
                j = m;
            }
            else {
                j = this.M(n);
            }
            return i.g(n + j, n2 + m);
        }
        
        @Override
        public int hashCode() {
            return this.I.hashCode() ^ this.K.hashCode();
        }
        
        @Override
        public long i(final int n, final long n2) {
            return this.I.i(n, this.I(n2));
        }
        
        @Override
        public long k(final long n, final long n2) {
            return this.I.k(n, this.I(n2));
        }
        
        @Override
        public long o() {
            return this.I.o();
        }
        
        @Override
        public int s(final long n, final long n2) {
            return this.I.s(n, this.I(n2));
        }
        
        @Override
        public long v(final long n, final long n2) {
            return this.I.v(n, this.I(n2));
        }
        
        @Override
        public boolean y() {
            boolean y;
            if (this.J) {
                y = this.I.y();
            }
            else {
                y = (this.I.y() && this.K.E());
            }
            return y;
        }
    }
}
