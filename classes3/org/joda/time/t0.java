// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.convert.ToString;
import java.util.Locale;
import java.util.Date;
import java.util.Calendar;
import org.joda.time.format.b;
import org.joda.convert.FromString;
import java.util.Objects;
import org.joda.time.chrono.x;
import org.joda.time.format.j;
import java.io.Serializable;
import org.joda.time.base.k;

public final class t0 extends k implements n0, Serializable
{
    private static final long J = 797544782896179L;
    private static final g[] K;
    public static final int L = 0;
    public static final int M = 1;
    
    static {
        K = new g[] { g.X(), g.R() };
    }
    
    public t0() {
    }
    
    public t0(final int n, final int n2) {
        this(n, n2, null);
    }
    
    public t0(final int n, final int n2, final org.joda.time.a a) {
        super(new int[] { n, n2 }, a);
    }
    
    public t0(final long n) {
        super(n);
    }
    
    public t0(final long n, final org.joda.time.a a) {
        super(n, a);
    }
    
    public t0(final Object o) {
        super(o, null, j.L());
    }
    
    public t0(final Object o, final org.joda.time.a a) {
        super(o, h.e(a), j.L());
    }
    
    public t0(final org.joda.time.a a) {
        super(a);
    }
    
    public t0(final i i) {
        super(x.d0(i));
    }
    
    t0(final t0 t0, final org.joda.time.a a) {
        super(t0, a);
    }
    
    t0(final t0 t0, final int[] array) {
        super(t0, array);
    }
    
    public static t0 K() {
        return new t0();
    }
    
    public static t0 M(final org.joda.time.a obj) {
        Objects.requireNonNull(obj, "Chronology must not be null");
        return new t0(obj);
    }
    
    public static t0 O(final i obj) {
        Objects.requireNonNull(obj, "Zone must not be null");
        return new t0(obj);
    }
    
    @FromString
    public static t0 P(final String s) {
        return Q(s, j.L());
    }
    
    public static t0 Q(final String s, final b b) {
        final t p2 = b.p(s);
        return new t0(p2.k2(), p2.f3());
    }
    
    private Object b0() {
        if (!i.I.equals(this.t().s())) {
            return new t0(this, this.t().R());
        }
        return this;
    }
    
    public static t0 y(final Calendar calendar) {
        if (calendar != null) {
            return new t0(calendar.get(1), calendar.get(2) + 1);
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }
    
    public static t0 z(final Date date) {
        if (date != null) {
            return new t0(date.getYear() + 1900, date.getMonth() + 1);
        }
        throw new IllegalArgumentException("The date must not be null");
    }
    
    @Override
    public String A2(final String s, final Locale locale) throws IllegalArgumentException {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).P(locale).w(this);
    }
    
    public t0 B(final o0 o0) {
        return this.r0(o0, -1);
    }
    
    public t0 E(final int n) {
        return this.o0(m.k(), org.joda.time.field.j.l(n));
    }
    
    public t0 G(final int n) {
        return this.o0(m.o(), org.joda.time.field.j.l(n));
    }
    
    public a I() {
        return new a(this, 1);
    }
    
    @Override
    public g N(final int n) {
        return t0.K[n];
    }
    
    public t0 T(final o0 o0) {
        return this.r0(o0, 1);
    }
    
    public t0 U(final int n) {
        return this.o0(m.k(), n);
    }
    
    public t0 V(final int n) {
        return this.o0(m.o(), n);
    }
    
    public a a0(final g g) {
        return new a(this, this.k(g));
    }
    
    public r c0() {
        return this.i0(null);
    }
    
    @Override
    protected f d(final int i, final org.joda.time.a a) {
        if (i == 0) {
            return a.T();
        }
        if (i == 1) {
            return a.F();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public g[] f() {
        return t0.K.clone();
    }
    
    public int f3() {
        return this.e0(1);
    }
    
    @Override
    public String g4(final String s) {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).w(this);
    }
    
    public r i0(i o) {
        o = h.o(o);
        return new r(this.k0(1).G0(o), this.U(1).k0(1).G0(o));
    }
    
    public t k0(final int n) {
        return new t(this.k2(), this.f3(), n, this.t());
    }
    
    public int k2() {
        return this.e0(0);
    }
    
    public t0 l0(org.joda.time.a r) {
        r = h.e(r).R();
        if (r == this.t()) {
            return this;
        }
        final t0 t0 = new t0(this, r);
        r.L(t0, this.h());
        return t0;
    }
    
    public t0 n0(final g g, final int n) {
        final int k = this.k(g);
        if (n == this.e0(k)) {
            return this;
        }
        return new t0(this, this.Q3(k).W(this, k, this.h(), n));
    }
    
    public t0 o0(final m m, final int n) {
        final int l = this.l(m);
        if (n == 0) {
            return this;
        }
        return new t0(this, this.Q3(l).c(this, l, this.h(), n));
    }
    
    public t0 q0(final int n) {
        return new t0(this, this.t().F().W(this, 1, this.h(), n));
    }
    
    public t0 r0(final o0 o0, final int n) {
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
            return new t0(this, h);
        }
        return this;
    }
    
    public t0 s0(final int n) {
        return new t0(this, this.t().T().W(this, 0, this.h(), n));
    }
    
    @Override
    public int size() {
        return 2;
    }
    
    public a t0() {
        return new a(this, 0);
    }
    
    @ToString
    @Override
    public String toString() {
        return j.e0().w(this);
    }
    
    public static class a extends org.joda.time.field.a implements Serializable
    {
        private static final long I = 5727734012190224363L;
        private final t0 G;
        private final int H;
        
        a(final t0 g, final int h) {
            this.G = g;
            this.H = h;
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
        
        public t0 u(final int n) {
            return new t0(this.G, this.j().c(this.G, this.H, this.G.h(), n));
        }
        
        public t0 v(final int n) {
            return new t0(this.G, this.j().e(this.G, this.H, this.G.h(), n));
        }
        
        public t0 w() {
            return this.G;
        }
        
        public t0 x(final int n) {
            return new t0(this.G, this.j().W(this.G, this.H, this.G.h(), n));
        }
        
        public t0 y(final String s) {
            return this.z(s, null);
        }
        
        public t0 z(final String s, final Locale locale) {
            return new t0(this.G, this.j().X(this.G, this.H, this.G.h(), s, locale));
        }
    }
}
