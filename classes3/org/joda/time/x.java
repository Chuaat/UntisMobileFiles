// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.convert.ToString;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Calendar;
import org.joda.convert.FromString;
import java.util.Objects;
import java.util.Date;
import org.joda.time.format.a;
import org.joda.time.format.j;
import org.joda.time.format.c;
import org.joda.time.format.b;
import java.io.Serializable;
import org.joda.time.base.k;

public final class x extends k implements n0, Serializable
{
    private static final long J = 2954560699050434609L;
    private static final g[] K;
    private static final b L;
    public static final int M = 0;
    public static final int N = 1;
    
    static {
        K = new g[] { g.R(), g.B() };
        L = new c().K(j.L().e()).K(org.joda.time.format.a.f("--MM-dd").e()).u0();
    }
    
    public x() {
    }
    
    public x(final int n, final int n2) {
        this(n, n2, null);
    }
    
    public x(final int n, final int n2, final org.joda.time.a a) {
        super(new int[] { n, n2 }, a);
    }
    
    public x(final long n) {
        super(n);
    }
    
    public x(final long n, final org.joda.time.a a) {
        super(n, a);
    }
    
    public x(final Object o) {
        super(o, null, j.L());
    }
    
    public x(final Object o, final org.joda.time.a a) {
        super(o, h.e(a), j.L());
    }
    
    public x(final org.joda.time.a a) {
        super(a);
    }
    
    public x(final i i) {
        super(org.joda.time.chrono.x.d0(i));
    }
    
    x(final x x, final org.joda.time.a a) {
        super(x, a);
    }
    
    x(final x x, final int[] array) {
        super(x, array);
    }
    
    public static x B(final Date date) {
        if (date != null) {
            return new x(date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }
    
    public static x M() {
        return new x();
    }
    
    public static x O(final org.joda.time.a obj) {
        Objects.requireNonNull(obj, "Chronology must not be null");
        return new x(obj);
    }
    
    public static x P(final i obj) {
        Objects.requireNonNull(obj, "Zone must not be null");
        return new x(obj);
    }
    
    @FromString
    public static x Q(final String s) {
        return T(s, x.L);
    }
    
    public static x T(final String s, final b b) {
        final t p2 = b.p(s);
        return new x(p2.f3(), p2.X3());
    }
    
    private Object c0() {
        if (!i.I.equals(this.t().s())) {
            return new x(this, this.t().R());
        }
        return this;
    }
    
    public static x z(final Calendar calendar) {
        if (calendar != null) {
            return new x(calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }
    
    @Override
    public String A2(final String s, final Locale locale) throws IllegalArgumentException {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).P(locale).w(this);
    }
    
    public x E(final o0 o0) {
        return this.r0(o0, -1);
    }
    
    public x G(final int n) {
        return this.o0(m.b(), org.joda.time.field.j.l(n));
    }
    
    public x I(final int n) {
        return this.o0(m.k(), org.joda.time.field.j.l(n));
    }
    
    public a K() {
        return new a(this, 0);
    }
    
    @Override
    public g N(final int n) {
        return x.K[n];
    }
    
    public x U(final o0 o0) {
        return this.r0(o0, 1);
    }
    
    public x V(final int n) {
        return this.o0(m.b(), n);
    }
    
    public int X3() {
        return this.e0(1);
    }
    
    public x a0(final int n) {
        return this.o0(m.k(), n);
    }
    
    public a b0(final g g) {
        return new a(this, this.k(g));
    }
    
    @Override
    protected f d(final int i, final org.joda.time.a a) {
        if (i == 0) {
            return a.F();
        }
        if (i == 1) {
            return a.g();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public g[] f() {
        return x.K.clone();
    }
    
    public int f3() {
        return this.e0(0);
    }
    
    @Override
    public String g4(final String s) {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).w(this);
    }
    
    public t i0(final int n) {
        return new t(n, this.f3(), this.X3(), this.t());
    }
    
    public x k0(final org.joda.time.a a) {
        final org.joda.time.a r = h.e(a).R();
        if (r == this.t()) {
            return this;
        }
        final x x = new x(this, r);
        r.L(x, this.h());
        return x;
    }
    
    public x l0(final int n) {
        return new x(this, this.t().g().W(this, 1, this.h(), n));
    }
    
    public x n0(final g g, final int n) {
        final int k = this.k(g);
        if (n == this.e0(k)) {
            return this;
        }
        return new x(this, this.Q3(k).W(this, k, this.h(), n));
    }
    
    public x o0(final m m, final int n) {
        final int l = this.l(m);
        if (n == 0) {
            return this;
        }
        return new x(this, this.Q3(l).c(this, l, this.h(), n));
    }
    
    public x q0(final int n) {
        return new x(this, this.t().F().W(this, 0, this.h(), n));
    }
    
    public x r0(final o0 o0, final int n) {
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
            return new x(this, h);
        }
        return this;
    }
    
    @Override
    public int size() {
        return 2;
    }
    
    @ToString
    @Override
    public String toString() {
        final ArrayList<g> list = new ArrayList<g>();
        list.add(g.R());
        list.add(g.B());
        return j.E(list, true, true).w(this);
    }
    
    public a y() {
        return new a(this, 1);
    }
    
    public static class a extends org.joda.time.field.a implements Serializable
    {
        private static final long I = 5727734012190224363L;
        private final x G;
        private final int H;
        
        a(final x g, final int h) {
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
        
        public x u(final int n) {
            return new x(this.G, this.j().c(this.G, this.H, this.G.h(), n));
        }
        
        public x v(final int n) {
            return new x(this.G, this.j().e(this.G, this.H, this.G.h(), n));
        }
        
        public x w() {
            return this.G;
        }
        
        public x x(final int n) {
            return new x(this.G, this.j().W(this.G, this.H, this.G.h(), n));
        }
        
        public x y(final String s) {
            return this.z(s, null);
        }
        
        public x z(final String s, final Locale locale) {
            return new x(this.G, this.j().X(this.G, this.H, this.G.h(), s, locale));
        }
    }
}
