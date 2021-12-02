// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.n0;
import org.joda.time.f;
import org.joda.time.field.c;
import org.joda.time.format.b;
import org.joda.time.format.j;
import org.joda.time.o;
import org.joda.time.l;
import org.joda.time.t;
import org.joda.time.h;
import org.joda.time.l0;
import org.joda.time.i;
import java.util.concurrent.ConcurrentHashMap;

public final class q extends org.joda.time.chrono.a
{
    static final org.joda.time.q A0;
    private static final ConcurrentHashMap<p, q> B0;
    private static final long z0 = -2545574827706931671L;
    private a0 u0;
    private w v0;
    private org.joda.time.q w0;
    private long x0;
    private long y0;
    
    static {
        A0 = new org.joda.time.q(-12219292800000L);
        B0 = new ConcurrentHashMap<p, q>();
    }
    
    private q(final org.joda.time.a a, final a0 a2, final w w, final org.joda.time.q q) {
        super(a, new Object[] { a2, w, q });
    }
    
    private q(final a0 a0, final w w, final org.joda.time.q q) {
        super(null, new Object[] { a0, w, q });
    }
    
    private static long e0(final long n, final org.joda.time.a a, final org.joda.time.a a2) {
        return a2.z().T(a2.h().T(a2.M().T(a2.O().T(0L, a.O().g(n)), a.M().g(n)), a.h().g(n)), a.z().g(n));
    }
    
    private static long f0(final long n, final org.joda.time.a a, final org.joda.time.a a2) {
        return a2.p(a.T().g(n), a.F().g(n), a.g().g(n), a.z().g(n));
    }
    
    public static q h0() {
        return l0(i.n(), q.A0, 4);
    }
    
    public static q i0(final i i) {
        return l0(i, q.A0, 4);
    }
    
    public static q j0(final i i, final long n, final int n2) {
        l0 l0;
        if (n == q.A0.n()) {
            l0 = null;
        }
        else {
            l0 = new org.joda.time.q(n);
        }
        return l0(i, l0, n2);
    }
    
    public static q k0(final i i, final l0 l0) {
        return l0(i, l0, 4);
    }
    
    public static q l0(i i, final l0 l0, final int n) {
        final i o = h.o(i);
        org.joda.time.q q;
        if (l0 == null) {
            q = org.joda.time.chrono.q.A0;
        }
        else {
            q = l0.S2();
            if (new t(q.n(), w.W0(o)).k2() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        final p p3 = new p(o, q, n);
        final ConcurrentHashMap<p, q> b0 = org.joda.time.chrono.q.B0;
        q value;
        if ((value = b0.get(p3)) == null) {
            i = i.I;
            if (o == i) {
                value = new q(a0.Y0(o, n), w.X0(o, n), q);
            }
            else {
                final q l2 = l0(i, q, n);
                value = new q(e0.e0(l2, o), l2.u0, l2.v0, l2.w0);
            }
            final q q2 = b0.putIfAbsent(p3, value);
            if (q2 != null) {
                value = q2;
            }
        }
        return value;
    }
    
    public static q m0() {
        return l0(i.I, q.A0, 4);
    }
    
    private Object s0() {
        return l0(this.s(), this.w0, this.n0());
    }
    
    @Override
    public org.joda.time.a R() {
        return this.S(i.I);
    }
    
    @Override
    public org.joda.time.a S(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        if (n == this.s()) {
            return this;
        }
        return l0(n, this.w0, this.n0());
    }
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        final Object[] array = (Object[])this.Z();
        final a0 u0 = (a0)array[0];
        final w v0 = (w)array[1];
        final org.joda.time.q w0 = (org.joda.time.q)array[2];
        this.x0 = w0.n();
        this.u0 = u0;
        this.v0 = v0;
        this.w0 = w0;
        if (this.Y() != null) {
            return;
        }
        if (u0.E0() == v0.E0()) {
            final long x0 = this.x0;
            this.y0 = x0 - this.r0(x0);
            a.a(v0);
            if (v0.z().g(this.x0) == 0) {
                a.m = new a(u0.B(), a.m, this.x0);
                a.n = new a(u0.z(), a.n, this.x0);
                a.o = new a(u0.I(), a.o, this.x0);
                a.p = new a(u0.H(), a.p, this.x0);
                a.q = new a(u0.D(), a.q, this.x0);
                a.r = new a(u0.C(), a.r, this.x0);
                a.s = new a(u0.v(), a.s, this.x0);
                a.u = new a(u0.w(), a.u, this.x0);
                a.t = new a(u0.e(), a.t, this.x0);
                a.v = new a(u0.f(), a.v, this.x0);
                a.w = new a(u0.t(), a.w, this.x0);
            }
            a.I = new a(u0.k(), a.I, this.x0);
            final b e = new b(u0.T(), a.E, this.x0);
            a.E = e;
            a.j = e.t();
            a.F = new b(u0.V(), a.F, a.j, this.x0);
            final b h = new b(u0.d(), a.H, this.x0);
            a.H = h;
            a.k = h.t();
            a.G = new b(u0.U(), a.G, a.j, a.k, this.x0);
            final b d = new b(u0.F(), a.D, null, a.j, this.x0);
            a.D = d;
            a.i = d.t();
            final b b = new b(u0.O(), a.B, null, this.x0, true);
            a.B = b;
            a.h = b.t();
            a.C = new b(u0.P(), a.C, a.h, a.k, this.x0);
            a.z = new a(u0.i(), a.z, a.j, v0.T().O(this.x0), false);
            a.A = new a(u0.M(), a.A, a.h, v0.O().O(this.x0), true);
            final a y = new a(u0.g(), a.y, this.x0);
            y.g = a.i;
            a.y = y;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof q) {
            final q q = (q)o;
            if (this.x0 != q.x0 || this.n0() != q.n0() || !this.s().equals(q.s())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public org.joda.time.q g0() {
        return this.w0;
    }
    
    @Override
    public int hashCode() {
        return 25025 + this.s().hashCode() + this.n0() + this.w0.hashCode();
    }
    
    public int n0() {
        return this.v0.E0();
    }
    
    long o0(final long n) {
        return e0(n, this.v0, this.u0);
    }
    
    @Override
    public long p(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        final org.joda.time.a y = this.Y();
        if (y != null) {
            return y.p(n, n2, n3, n4);
        }
        long n5;
        if ((n5 = this.v0.p(n, n2, n3, n4)) < this.x0) {
            n5 = this.u0.p(n, n2, n3, n4);
            if (n5 >= this.x0) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return n5;
    }
    
    long p0(final long n) {
        return f0(n, this.v0, this.u0);
    }
    
    @Override
    public long q(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) throws IllegalArgumentException {
        final org.joda.time.a y = this.Y();
        if (y != null) {
            return y.q(n, n2, n3, n4, n5, n6, n7);
        }
        Label_0095: {
            try {
                final long n8 = this.v0.q(n, n2, n3, n4, n5, n6, n7);
                break Label_0095;
            }
            catch (o o) {
                if (n2 != 2 || n3 != 29) {
                    throw o;
                }
                final long n8 = this.v0.q(n, n2, 28, n4, n5, n6, n7);
                if (n8 < this.x0) {
                    long q = n8;
                    if (n8 < this.x0) {
                        q = this.u0.q(n, n2, n3, n4, n5, n6, n7);
                        if (q >= this.x0) {
                            throw new IllegalArgumentException("Specified date does not exist");
                        }
                    }
                    return q;
                }
                throw o;
            }
        }
    }
    
    long q0(final long n) {
        return e0(n, this.u0, this.v0);
    }
    
    long r0(final long n) {
        return f0(n, this.u0, this.v0);
    }
    
    @Override
    public i s() {
        final org.joda.time.a y = this.Y();
        if (y != null) {
            return y.s();
        }
        return i.I;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(60);
        sb.append("GJChronology");
        sb.append('[');
        sb.append(this.s().q());
        if (this.x0 != q.A0.n()) {
            sb.append(",cutover=");
            org.joda.time.format.b b;
            if (this.R().i().N(this.x0) == 0L) {
                b = j.p();
            }
            else {
                b = j.B();
            }
            b.N(this.R()).E(sb, this.x0);
        }
        if (this.n0() != 4) {
            sb.append(",mdfw=");
            sb.append(this.n0());
        }
        sb.append(']');
        return sb.toString();
    }
    
    private class a extends c
    {
        private static final long i = 3528501219481026402L;
        final f b;
        final f c;
        final long d;
        final boolean e;
        protected l f;
        protected l g;
        
        a(final q q, final f f, final f f2, final long n) {
            this(q, f, f2, n, false);
        }
        
        a(final q q, final f f, final f f2, final long n, final boolean b) {
            this(q, f, f2, null, n, b);
        }
        
        a(final f b, final f c, final l l, final long d, final boolean e) {
            super(c.J());
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = c.t();
            l g = l;
            if (l == null && (g = c.I()) == null) {
                g = b.I();
            }
            this.g = g;
        }
        
        @Override
        public int B(final n0 n0) {
            return this.z(q.m0().K(n0, 0L));
        }
        
        @Override
        public int C(final n0 n0, final int[] array) {
            final q m0 = q.m0();
            final int size = n0.size();
            long n2 = 0L;
            long t;
            for (int i = 0; i < size; ++i, n2 = t) {
                final f g = n0.N(i).G(m0);
                t = n2;
                if (array[i] <= g.z(n2)) {
                    t = g.T(n2, array[i]);
                }
            }
            return this.z(n2);
        }
        
        @Override
        public int D() {
            return this.b.D();
        }
        
        @Override
        public int E(long t) {
            if (t < this.d) {
                return this.b.E(t);
            }
            int n = this.c.E(t);
            t = this.c.T(t, n);
            final long d = this.d;
            if (t < d) {
                n = this.c.g(d);
            }
            return n;
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
        public l I() {
            return this.g;
        }
        
        @Override
        public boolean K(final long n) {
            f f;
            if (n >= this.d) {
                f = this.c;
            }
            else {
                f = this.b;
            }
            return f.K(n);
        }
        
        @Override
        public boolean L() {
            return false;
        }
        
        @Override
        public long O(long n) {
            if (n >= this.d) {
                n = this.c.O(n);
            }
            else {
                final long n2 = n = this.b.O(n);
                if (n2 >= this.d) {
                    n = n2;
                    if (n2 - q.this.y0 >= this.d) {
                        n = this.b0(n2);
                    }
                }
            }
            return n;
        }
        
        @Override
        public long P(long n) {
            if (n >= this.d) {
                final long n2 = n = this.c.P(n);
                if (n2 < this.d) {
                    n = n2;
                    if (q.this.y0 + n2 < this.d) {
                        n = this.a0(n2);
                    }
                }
            }
            else {
                n = this.b.P(n);
            }
            return n;
        }
        
        @Override
        public long T(long n, final int n2) {
            if (n >= this.d) {
                final long n3 = n = this.c.T(n, n2);
                if (n3 < this.d) {
                    n = n3;
                    if (q.this.y0 + n3 < this.d) {
                        n = this.a0(n3);
                    }
                    if (this.g(n) != n2) {
                        throw new o(this.c.J(), n2, null, null);
                    }
                }
            }
            else {
                final long n4 = n = this.b.T(n, n2);
                if (n4 >= this.d) {
                    n = n4;
                    if (n4 - q.this.y0 >= this.d) {
                        n = this.b0(n4);
                    }
                    if (this.g(n) != n2) {
                        throw new o(this.b.J(), n2, null, null);
                    }
                }
            }
            return n;
        }
        
        @Override
        public long V(long n, final String s, final Locale locale) {
            if (n >= this.d) {
                final long n2 = n = this.c.V(n, s, locale);
                if (n2 < this.d) {
                    n = n2;
                    if (q.this.y0 + n2 < this.d) {
                        n = this.a0(n2);
                    }
                }
            }
            else {
                final long n3 = n = this.b.V(n, s, locale);
                if (n3 >= this.d) {
                    n = n3;
                    if (n3 - q.this.y0 >= this.d) {
                        n = this.b0(n3);
                    }
                }
            }
            return n;
        }
        
        @Override
        public long a(final long n, final int n2) {
            return this.c.a(n, n2);
        }
        
        protected long a0(final long n) {
            if (this.e) {
                return q.this.o0(n);
            }
            return q.this.p0(n);
        }
        
        @Override
        public long b(final long n, final long n2) {
            return this.c.b(n, n2);
        }
        
        protected long b0(final long n) {
            if (this.e) {
                return q.this.q0(n);
            }
            return q.this.r0(n);
        }
        
        @Override
        public int[] c(final n0 n0, int i, final int[] array, final int n2) {
            if (n2 == 0) {
                return array;
            }
            if (org.joda.time.h.p(n0)) {
                long t = 0L;
                for (i = 0; i < n0.size(); ++i) {
                    t = n0.N(i).G(q.this).T(t, array[i]);
                }
                return q.this.m(n0, this.a(t, n2));
            }
            return super.c(n0, i, array, n2);
        }
        
        @Override
        public int g(final long n) {
            f f;
            if (n >= this.d) {
                f = this.c;
            }
            else {
                f = this.b;
            }
            return f.g(n);
        }
        
        @Override
        public String h(final int n, final Locale locale) {
            return this.c.h(n, locale);
        }
        
        @Override
        public String j(final long n, final Locale locale) {
            f f;
            if (n >= this.d) {
                f = this.c;
            }
            else {
                f = this.b;
            }
            return f.j(n, locale);
        }
        
        @Override
        public String m(final int n, final Locale locale) {
            return this.c.m(n, locale);
        }
        
        @Override
        public String o(final long n, final Locale locale) {
            f f;
            if (n >= this.d) {
                f = this.c;
            }
            else {
                f = this.b;
            }
            return f.o(n, locale);
        }
        
        @Override
        public int r(final long n, final long n2) {
            return this.c.r(n, n2);
        }
        
        @Override
        public long s(final long n, final long n2) {
            return this.c.s(n, n2);
        }
        
        @Override
        public l t() {
            return this.f;
        }
        
        @Override
        public int u(final long n) {
            f f;
            if (n >= this.d) {
                f = this.c;
            }
            else {
                f = this.b;
            }
            return f.u(n);
        }
        
        @Override
        public l v() {
            return this.c.v();
        }
        
        @Override
        public int w(final Locale locale) {
            return Math.max(this.b.w(locale), this.c.w(locale));
        }
        
        @Override
        public int x(final Locale locale) {
            return Math.max(this.b.x(locale), this.c.x(locale));
        }
        
        @Override
        public int y() {
            return this.c.y();
        }
        
        @Override
        public int z(long d) {
            if (d >= this.d) {
                return this.c.z(d);
            }
            int n = this.b.z(d);
            final long t = this.b.T(d, n);
            d = this.d;
            if (t >= d) {
                final f b = this.b;
                n = b.g(b.a(d, -1));
            }
            return n;
        }
    }
    
    private final class b extends a
    {
        private static final long k = 3410248757173576441L;
        
        b(final q q, final f f, final f f2, final long n) {
            this(q, f, f2, null, n, false);
        }
        
        b(final q q, final f f, final f f2, final l l, final long n) {
            this(q, f, f2, l, n, false);
        }
        
        b(final f f, final f f2, final l l, final long n, final boolean b) {
            super(f, f2, n, b);
            l f3 = l;
            if (l == null) {
                f3 = new q.c(super.f, this);
            }
            super.f = f3;
        }
        
        b(final q q, final f f, final f f2, final l l, final l g, final long n) {
            this(q, f, f2, l, n, false);
            super.g = g;
        }
        
        @Override
        public int E(final long n) {
            f f;
            if (n >= super.d) {
                f = super.c;
            }
            else {
                f = super.b;
            }
            return f.E(n);
        }
        
        @Override
        public long a(long n, final int n2) {
            if (n >= super.d) {
                final long n3 = n = super.c.a(n, n2);
                if (n3 < super.d) {
                    n = n3;
                    if (q.this.y0 + n3 < super.d) {
                        Label_0139: {
                            f f;
                            if (super.e) {
                                n = n3;
                                if (q.this.v0.O().g(n3) > 0) {
                                    break Label_0139;
                                }
                                f = q.this.v0.O();
                            }
                            else {
                                n = n3;
                                if (q.this.v0.T().g(n3) > 0) {
                                    break Label_0139;
                                }
                                f = q.this.v0.T();
                            }
                            n = f.a(n3, -1);
                        }
                        n = ((a)this).a0(n);
                    }
                }
            }
            else {
                final long n4 = n = super.b.a(n, n2);
                if (n4 >= super.d) {
                    n = n4;
                    if (n4 - q.this.y0 >= super.d) {
                        n = ((a)this).b0(n4);
                    }
                }
            }
            return n;
        }
        
        @Override
        public long b(long n, long n2) {
            if (n >= super.d) {
                n2 = (n = super.c.b(n, n2));
                if (n2 < super.d) {
                    n = n2;
                    if (q.this.y0 + n2 < super.d) {
                        Label_0129: {
                            f f;
                            if (super.e) {
                                n = n2;
                                if (q.this.v0.O().g(n2) > 0) {
                                    break Label_0129;
                                }
                                f = q.this.v0.O();
                            }
                            else {
                                n = n2;
                                if (q.this.v0.T().g(n2) > 0) {
                                    break Label_0129;
                                }
                                f = q.this.v0.T();
                            }
                            n = f.a(n2, -1);
                        }
                        n = ((a)this).a0(n);
                    }
                }
            }
            else {
                n2 = (n = super.b.b(n, n2));
                if (n2 >= super.d) {
                    n = n2;
                    if (n2 - q.this.y0 >= super.d) {
                        n = ((a)this).b0(n2);
                    }
                }
            }
            return n;
        }
        
        @Override
        public int r(long n, final long n2) {
            final long d = super.d;
            Label_0040: {
                if (n >= d) {
                    if (n2 < d) {
                        n = ((a)this).a0(n);
                        break Label_0040;
                    }
                }
                else {
                    if (n2 < d) {
                        break Label_0040;
                    }
                    n = ((a)this).b0(n);
                }
                final f f = super.c;
                return f.r(n, n2);
            }
            final f f = super.b;
            return f.r(n, n2);
        }
        
        @Override
        public long s(long n, final long n2) {
            final long d = super.d;
            Label_0040: {
                if (n >= d) {
                    if (n2 < d) {
                        n = ((a)this).a0(n);
                        break Label_0040;
                    }
                }
                else {
                    if (n2 < d) {
                        break Label_0040;
                    }
                    n = ((a)this).b0(n);
                }
                final f f = super.c;
                return f.s(n, n2);
            }
            final f f = super.b;
            return f.s(n, n2);
        }
        
        @Override
        public int z(final long n) {
            f f;
            if (n >= super.d) {
                f = super.c;
            }
            else {
                f = super.b;
            }
            return f.z(n);
        }
    }
    
    private static class c extends f
    {
        private static final long L = 4097975388007713084L;
        private final b K;
        
        c(final l l, final b k) {
            super(l, l.m());
            this.K = k;
        }
        
        @Override
        public long b(final long n, final int n2) {
            return this.K.a(n, n2);
        }
        
        @Override
        public long d(final long n, final long n2) {
            return this.K.b(n, n2);
        }
        
        @Override
        public int f(final long n, final long n2) {
            return this.K.r(n, n2);
        }
        
        @Override
        public long g(final long n, final long n2) {
            return this.K.s(n, n2);
        }
    }
}
