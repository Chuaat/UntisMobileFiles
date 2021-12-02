// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.util.Locale;
import java.util.Calendar;
import java.util.Date;
import org.joda.time.chrono.x;
import org.joda.time.format.j;
import java.io.Serializable;
import org.joda.time.base.k;

@Deprecated
public final class u0 extends k implements n0, Serializable
{
    private static final long J = 797544782896179L;
    private static final g[] K;
    public static final int L = 0;
    public static final int M = 1;
    public static final int N = 2;
    
    static {
        K = new g[] { g.X(), g.R(), g.B() };
    }
    
    public u0() {
    }
    
    public u0(final int n, final int n2, final int n3) {
        this(n, n2, n3, null);
    }
    
    public u0(final int n, final int n2, final int n3, final org.joda.time.a a) {
        super(new int[] { n, n2, n3 }, a);
    }
    
    public u0(final long n) {
        super(n);
    }
    
    public u0(final long n, final org.joda.time.a a) {
        super(n, a);
    }
    
    public u0(final Object o) {
        super(o, null, j.z());
    }
    
    public u0(final Object o, final org.joda.time.a a) {
        super(o, h.e(a), j.z());
    }
    
    public u0(final org.joda.time.a a) {
        super(a);
    }
    
    public u0(final i i) {
        super(x.d0(i));
    }
    
    u0(final u0 u0, final org.joda.time.a a) {
        super(u0, a);
    }
    
    u0(final u0 u0, final int[] array) {
        super(u0, array);
    }
    
    public static u0 B(final Date date) {
        if (date != null) {
            return new u0(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }
    
    public static u0 z(final Calendar calendar) {
        if (calendar != null) {
            return new u0(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }
    
    public u0 A0(final int n) {
        return new u0(this, this.t().T().W(this, 0, this.h(), n));
    }
    
    public a B0() {
        return new a(this, 0);
    }
    
    public u0 E(final o0 o0) {
        return this.z0(o0, -1);
    }
    
    public u0 G(final int n) {
        return this.v0(m.b(), org.joda.time.field.j.l(n));
    }
    
    public u0 I(final int n) {
        return this.v0(m.k(), org.joda.time.field.j.l(n));
    }
    
    public u0 K(final int n) {
        return this.v0(m.o(), org.joda.time.field.j.l(n));
    }
    
    public a M() {
        return new a(this, 1);
    }
    
    @Override
    public g N(final int n) {
        return u0.K[n];
    }
    
    public u0 O(final o0 o0) {
        return this.z0(o0, 1);
    }
    
    public u0 P(final int n) {
        return this.v0(m.b(), n);
    }
    
    public u0 Q(final int n) {
        return this.v0(m.k(), n);
    }
    
    public u0 T(final int n) {
        return this.v0(m.o(), n);
    }
    
    public a U(final g g) {
        return new a(this, this.k(g));
    }
    
    public b V() {
        return this.a0(null);
    }
    
    public int X3() {
        return this.e0(2);
    }
    
    public b a0(final i i) {
        return new b(this.k2(), this.f3(), this.X3(), this.t().S(i));
    }
    
    public c b0(final q0 q0) {
        return this.c0(q0, null);
    }
    
    public c c0(final q0 q0, final i i) {
        final org.joda.time.a s = this.t().S(i);
        long n = s.K(this, h.c());
        if (q0 != null) {
            n = s.K(q0, n);
        }
        return new c(n, s);
    }
    
    @Override
    protected f d(final int i, final org.joda.time.a a) {
        if (i == 0) {
            return a.T();
        }
        if (i == 1) {
            return a.F();
        }
        if (i == 2) {
            return a.g();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public g[] f() {
        return u0.K.clone();
    }
    
    public int f3() {
        return this.e0(1);
    }
    
    public c i0() {
        return this.k0(null);
    }
    
    public c k0(final i i) {
        final org.joda.time.a s = this.t().S(i);
        return new c(s.K(this, h.c()), s);
    }
    
    public int k2() {
        return this.e0(0);
    }
    
    public c l0() {
        return this.n0(null);
    }
    
    public c n0(final i i) {
        return new c(this.k2(), this.f3(), this.X3(), 0, 0, 0, 0, this.t().S(i));
    }
    
    public r o0() {
        return this.q0(null);
    }
    
    public r q0(final i i) {
        return this.a0(h.o(i)).N0();
    }
    
    public t r0() {
        return new t(this.k2(), this.f3(), this.X3(), this.t());
    }
    
    public u0 s0(org.joda.time.a r) {
        r = h.e(r).R();
        if (r == this.t()) {
            return this;
        }
        final u0 u0 = new u0(this, r);
        r.L(u0, this.h());
        return u0;
    }
    
    @Override
    public int size() {
        return 3;
    }
    
    public u0 t0(final int n) {
        return new u0(this, this.t().g().W(this, 2, this.h(), n));
    }
    
    @Override
    public String toString() {
        return j.f0().w(this);
    }
    
    public u0 u0(final g g, final int n) {
        final int k = this.k(g);
        if (n == this.e0(k)) {
            return this;
        }
        return new u0(this, this.Q3(k).W(this, k, this.h(), n));
    }
    
    public u0 v0(final m m, final int n) {
        final int l = this.l(m);
        if (n == 0) {
            return this;
        }
        return new u0(this, this.Q3(l).c(this, l, this.h(), n));
    }
    
    public u0 x0(final int n) {
        return new u0(this, this.t().F().W(this, 1, this.h(), n));
    }
    
    public a y() {
        return new a(this, 2);
    }
    
    public u0 z0(final o0 o0, final int n) {
        if (o0 != null && n != 0) {
            int[] h = this.h();
            int[] c;
            for (int i = 0; i < o0.size(); ++i, h = c) {
                final int j = this.j(o0.N(i));
                c = h;
                if (j >= 0) {
                    c = this.Q3(j).c(this, j, h, org.joda.time.field.j.h(o0.e0(i), n));
                }
            }
            return new u0(this, h);
        }
        return this;
    }
    
    @Deprecated
    public static class a extends org.joda.time.field.a implements Serializable
    {
        private static final long I = 5727734012190224363L;
        private final u0 G;
        private final int H;
        
        a(final u0 g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public u0 B() {
            return this.x(this.n());
        }
        
        public u0 C() {
            return this.x(this.p());
        }
        
        @Override
        public int c() {
            return this.G.e0(this.H);
        }
        
        @Override
        public f j() {
            return this.G.Q3(this.H);
        }
        
        @Override
        protected n0 t() {
            return this.G;
        }
        
        public u0 u(final int n) {
            return new u0(this.G, this.j().c(this.G, this.H, this.G.h(), n));
        }
        
        public u0 v(final int n) {
            return new u0(this.G, this.j().e(this.G, this.H, this.G.h(), n));
        }
        
        public u0 w() {
            return this.G;
        }
        
        public u0 x(final int n) {
            return new u0(this.G, this.j().W(this.G, this.H, this.G.h(), n));
        }
        
        public u0 y(final String s) {
            return this.z(s, null);
        }
        
        public u0 z(final String s, final Locale locale) {
            return new u0(this.G, this.j().X(this.G, this.H, this.G.h(), s, locale));
        }
    }
}
