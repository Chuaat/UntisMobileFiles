// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.util.Locale;
import java.util.Date;
import java.util.Calendar;
import org.joda.time.chrono.x;
import org.joda.time.format.j;
import java.io.Serializable;
import org.joda.time.base.k;

@Deprecated
public final class q0 extends k implements n0, Serializable
{
    private static final long J = 3633353405803318660L;
    private static final g[] K;
    public static final q0 L;
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    
    static {
        K = new g[] { g.K(), g.Q(), g.T(), g.O() };
        L = new q0(0, 0, 0, 0);
    }
    
    public q0() {
    }
    
    public q0(final int n, final int n2) {
        this(n, n2, 0, 0, null);
    }
    
    public q0(final int n, final int n2, final int n3) {
        this(n, n2, n3, 0, null);
    }
    
    public q0(final int n, final int n2, final int n3, final int n4) {
        this(n, n2, n3, n4, null);
    }
    
    public q0(final int n, final int n2, final int n3, final int n4, final org.joda.time.a a) {
        super(new int[] { n, n2, n3, n4 }, a);
    }
    
    public q0(final int n, final int n2, final int n3, final org.joda.time.a a) {
        this(n, n2, n3, 0, a);
    }
    
    public q0(final int n, final int n2, final org.joda.time.a a) {
        this(n, n2, 0, 0, a);
    }
    
    public q0(final long n) {
        super(n);
    }
    
    public q0(final long n, final org.joda.time.a a) {
        super(n, a);
    }
    
    public q0(final Object o) {
        super(o, null, j.W());
    }
    
    public q0(final Object o, final org.joda.time.a a) {
        super(o, h.e(a), j.W());
    }
    
    public q0(final org.joda.time.a a) {
        super(a);
    }
    
    public q0(final i i) {
        super(x.d0(i));
    }
    
    q0(final q0 q0, final org.joda.time.a a) {
        super(q0, a);
    }
    
    q0(final q0 q0, final int[] array) {
        super(q0, array);
    }
    
    public static q0 B(final long n) {
        return E(n, null);
    }
    
    public static q0 E(final long n, final org.joda.time.a a) {
        return new q0(n, h.e(a).R());
    }
    
    public static q0 y(final Calendar calendar) {
        if (calendar != null) {
            return new q0(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }
    
    public static q0 z(final Date date) {
        if (date != null) {
            return new q0(date.getHours(), date.getMinutes(), date.getSeconds(), ((int)(date.getTime() % 1000L) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }
    
    public int E5() {
        return this.e0(3);
    }
    
    public a G() {
        return new a(this, 0);
    }
    
    public a I() {
        return new a(this, 3);
    }
    
    public q0 K(final o0 o0) {
        return this.x0(o0, -1);
    }
    
    public q0 M(final int n) {
        return this.s0(m.g(), org.joda.time.field.j.l(n));
    }
    
    @Override
    public g N(final int n) {
        return q0.K[n];
    }
    
    public q0 O(final int n) {
        return this.s0(m.i(), org.joda.time.field.j.l(n));
    }
    
    public q0 P(final int n) {
        return this.s0(m.j(), org.joda.time.field.j.l(n));
    }
    
    public q0 Q(final int n) {
        return this.s0(m.l(), org.joda.time.field.j.l(n));
    }
    
    public a T() {
        return new a(this, 1);
    }
    
    public q0 U(final o0 o0) {
        return this.x0(o0, 1);
    }
    
    public q0 V(final int n) {
        return this.s0(m.g(), n);
    }
    
    public q0 a0(final int n) {
        return this.s0(m.i(), n);
    }
    
    public q0 b0(final int n) {
        return this.s0(m.j(), n);
    }
    
    public q0 c0(final int n) {
        return this.s0(m.l(), n);
    }
    
    @Override
    protected f d(final int i, final org.joda.time.a a) {
        if (i == 0) {
            return a.v();
        }
        if (i == 1) {
            return a.D();
        }
        if (i == 2) {
            return a.I();
        }
        if (i == 3) {
            return a.B();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public g[] f() {
        return q0.K.clone();
    }
    
    public a i0(final g g) {
        return new a(this, this.k(g));
    }
    
    public a k0() {
        return new a(this, 2);
    }
    
    public int k5() {
        return this.e0(1);
    }
    
    public c l0() {
        return this.n0(null);
    }
    
    public int l5() {
        return this.e0(2);
    }
    
    public c n0(final i i) {
        final org.joda.time.a s = this.t().S(i);
        return new c(s.K(this, h.c()), s);
    }
    
    public v o0() {
        return new v(this.s4(), this.k5(), this.l5(), this.E5(), this.t());
    }
    
    public q0 q0(org.joda.time.a r) {
        r = h.e(r).R();
        if (r == this.t()) {
            return this;
        }
        final q0 q0 = new q0(this, r);
        r.L(q0, this.h());
        return q0;
    }
    
    public q0 r0(final g g, final int n) {
        final int k = this.k(g);
        if (n == this.e0(k)) {
            return this;
        }
        return new q0(this, this.Q3(k).W(this, k, this.h(), n));
    }
    
    public q0 s0(final m m, final int n) {
        final int l = this.l(m);
        if (n == 0) {
            return this;
        }
        return new q0(this, this.Q3(l).f(this, l, this.h(), n));
    }
    
    public int s4() {
        return this.e0(0);
    }
    
    @Override
    public int size() {
        return 4;
    }
    
    public q0 t0(final int n) {
        return new q0(this, this.t().v().W(this, 0, this.h(), n));
    }
    
    @Override
    public String toString() {
        return j.Q().w(this);
    }
    
    public q0 u0(final int n) {
        return new q0(this, this.t().B().W(this, 3, this.h(), n));
    }
    
    public q0 v0(final int n) {
        return new q0(this, this.t().D().W(this, 1, this.h(), n));
    }
    
    public q0 x0(final o0 o0, final int n) {
        if (o0 != null && n != 0) {
            int[] h = this.h();
            int[] f;
            for (int i = 0; i < o0.size(); ++i, h = f) {
                final int j = this.j(o0.N(i));
                f = h;
                if (j >= 0) {
                    f = this.Q3(j).f(this, j, h, org.joda.time.field.j.h(o0.e0(i), n));
                }
            }
            return new q0(this, h);
        }
        return this;
    }
    
    public q0 z0(final int n) {
        return new q0(this, this.t().I().W(this, 2, this.h(), n));
    }
    
    @Deprecated
    public static class a extends org.joda.time.field.a implements Serializable
    {
        private static final long I = 5598459141741063833L;
        private final q0 G;
        private final int H;
        
        a(final q0 g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public q0 B(final String s, final Locale locale) {
            return new q0(this.G, this.j().X(this.G, this.H, this.G.h(), s, locale));
        }
        
        public q0 C() {
            return this.y(this.n());
        }
        
        public q0 D() {
            return this.y(this.p());
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
        
        public q0 u(final int n) {
            return new q0(this.G, this.j().c(this.G, this.H, this.G.h(), n));
        }
        
        public q0 v(final int n) {
            return new q0(this.G, this.j().f(this.G, this.H, this.G.h(), n));
        }
        
        public q0 w(final int n) {
            return new q0(this.G, this.j().e(this.G, this.H, this.G.h(), n));
        }
        
        public q0 x() {
            return this.G;
        }
        
        public q0 y(final int n) {
            return new q0(this.G, this.j().W(this.G, this.H, this.G.h(), n));
        }
        
        public q0 z(final String s) {
            return this.B(s, null);
        }
    }
}
