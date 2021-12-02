// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.util.Locale;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.time.chrono.x;
import org.joda.time.format.b;
import org.joda.convert.FromString;
import org.joda.time.format.j;
import java.util.Objects;
import java.io.Serializable;
import org.joda.time.base.g;

public final class c extends g implements j0, Serializable
{
    private static final long J = -5171125899451703815L;
    
    public c() {
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5) {
        super(n, n2, n3, n4, n5, 0, 0);
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        super(n, n2, n3, n4, n5, n6, 0);
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        super(n, n2, n3, n4, n5, n6, n7);
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final org.joda.time.a a) {
        super(n, n2, n3, n4, n5, n6, n7, a);
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final i i) {
        super(n, n2, n3, n4, n5, n6, n7, i);
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final org.joda.time.a a) {
        super(n, n2, n3, n4, n5, n6, 0, a);
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final i i) {
        super(n, n2, n3, n4, n5, n6, 0, i);
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5, final org.joda.time.a a) {
        super(n, n2, n3, n4, n5, 0, 0, a);
    }
    
    public c(final int n, final int n2, final int n3, final int n4, final int n5, final i i) {
        super(n, n2, n3, n4, n5, 0, 0, i);
    }
    
    public c(final long n) {
        super(n);
    }
    
    public c(final long n, final org.joda.time.a a) {
        super(n, a);
    }
    
    public c(final long n, final i i) {
        super(n, i);
    }
    
    public c(final Object o) {
        super(o, (org.joda.time.a)null);
    }
    
    public c(final Object o, final org.joda.time.a a) {
        super(o, h.e(a));
    }
    
    public c(final Object o, final i i) {
        super(o, i);
    }
    
    public c(final org.joda.time.a a) {
        super(a);
    }
    
    public c(final i i) {
        super(i);
    }
    
    public static c G0() {
        return new c();
    }
    
    public static c I0(final org.joda.time.a obj) {
        Objects.requireNonNull(obj, "Chronology must not be null");
        return new c(obj);
    }
    
    public static c J0(final i obj) {
        Objects.requireNonNull(obj, "Zone must not be null");
        return new c(obj);
    }
    
    @FromString
    public static c K0(final String s) {
        return N0(s, j.D().Q());
    }
    
    public static c N0(final String s, final b b) {
        return b.n(s);
    }
    
    public c A0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().N().B(this.n(), n));
    }
    
    public c A1(final int n) {
        return this.R1(this.t().i().T(this.n(), n));
    }
    
    public c B0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().W().B(this.n(), n));
    }
    
    public c B1(final long n, final int n2) {
        if (n != 0L && n2 != 0) {
            return this.R1(this.t().a(this.n(), n, n2));
        }
        return this;
    }
    
    public a C0() {
        return new a(this, this.t().C());
    }
    
    public c C1(final k0 k0, final int n) {
        if (k0 != null && n != 0) {
            return this.B1(k0.n(), n);
        }
        return this;
    }
    
    public c D1() {
        return this.R1(this.K2().a(this.n(), false));
    }
    
    public a E0() {
        return new a(this, this.t().D());
    }
    
    public a F0() {
        return new a(this, this.t().F());
    }
    
    public c I1(final int n) {
        return this.R1(this.t().k().T(this.n(), n));
    }
    
    public c J1(final org.joda.time.g g, final int n) {
        if (g != null) {
            return this.R1(g.G(this.t()).T(this.n(), n));
        }
        throw new IllegalArgumentException("Field must not be null");
    }
    
    public c K1(final m m, final int n) {
        if (m == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (n == 0) {
            return this;
        }
        return this.R1(m.d(this.t()).b(this.n(), n));
    }
    
    public c M1(final n0 n0) {
        if (n0 == null) {
            return this;
        }
        return this.R1(this.t().K(n0, this.n()));
    }
    
    public c N1(final int n) {
        return this.R1(this.t().v().T(this.n(), n));
    }
    
    public c O0(final long n) {
        return this.B1(n, 1);
    }
    
    public c O1() {
        return this.R1(this.K2().a(this.n(), true));
    }
    
    public c P0(final k0 k0) {
        return this.C1(k0, 1);
    }
    
    public c R0(final o0 o0) {
        return this.W1(o0, 1);
    }
    
    public c R1(final long n) {
        c c;
        if (n == this.n()) {
            c = this;
        }
        else {
            c = new c(n, this.t());
        }
        return c;
    }
    
    public c S0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().j().b(this.n(), n));
    }
    
    public c S1(final int n) {
        return this.R1(this.t().z().T(this.n(), n));
    }
    
    public c T0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().x().b(this.n(), n));
    }
    
    public c T1(final int n) {
        return this.R1(this.t().B().T(this.n(), n));
    }
    
    public c U0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().y().b(this.n(), n));
    }
    
    public c U1(final int n) {
        return this.R1(this.t().D().T(this.n(), n));
    }
    
    public a V() {
        return new a(this, this.t().d());
    }
    
    public c V0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().E().b(this.n(), n));
    }
    
    public c V1(final int n) {
        return this.R1(this.t().F().T(this.n(), n));
    }
    
    public c W0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().G().b(this.n(), n));
    }
    
    public c W1(final o0 o0, final int n) {
        if (o0 != null && n != 0) {
            return this.R1(this.t().b(o0, this.n(), n));
        }
        return this;
    }
    
    public c X0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().J().b(this.n(), n));
    }
    
    public c X1(final int n) {
        return this.R1(this.t().I().T(this.n(), n));
    }
    
    public c Y0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().N().b(this.n(), n));
    }
    
    public c Y1(final int n, final int n2, final int n3, final int n4) {
        final org.joda.time.a t = this.t();
        return this.R1(t.s().c(t.R().q(this.k2(), this.f3(), this.X3(), n, n2, n3, n4), false, this.n()));
    }
    
    public c Z0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().W().b(this.n(), n));
    }
    
    public c Z1(final v v) {
        return this.Y1(v.s4(), v.k5(), v.l5(), v.E5());
    }
    
    public a a0() {
        return new a(this, this.t().g());
    }
    
    public c a2() {
        return this.h1().G0(this.K2());
    }
    
    public a b0() {
        return new a(this, this.t().h());
    }
    
    public a b1(final org.joda.time.g obj) {
        if (obj == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        final f g = obj.G(this.t());
        if (g.M()) {
            return new a(this, g);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field '");
        sb.append(obj);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public c b2(final int n) {
        return this.R1(this.t().M().T(this.n(), n));
    }
    
    public a c0() {
        return new a(this, this.t().i());
    }
    
    public a c1() {
        return new a(this, this.t().H());
    }
    
    public c d2(final int n) {
        return this.R1(this.t().O().T(this.n(), n));
    }
    
    public a e1() {
        return new a(this, this.t().I());
    }
    
    public c e2(final int n) {
        return this.R1(this.t().T().T(this.n(), n));
    }
    
    @Deprecated
    public org.joda.time.b f1() {
        return new org.joda.time.b(this.n(), this.t());
    }
    
    public c g2(final int n) {
        return this.R1(this.t().U().T(this.n(), n));
    }
    
    public t h1() {
        return new t(this.n(), this.t());
    }
    
    public c h2(final int n) {
        return this.R1(this.t().V().T(this.n(), n));
    }
    
    public a i0() {
        return new a(this, this.t().k());
    }
    
    public u i1() {
        return new u(this.n(), this.t());
    }
    
    public c i2(final i i) {
        return this.s1(this.t().S(i));
    }
    
    public v j1() {
        return new v(this.n(), this.t());
    }
    
    public a k0() {
        return new a(this, this.t().v());
    }
    
    public a l0() {
        return new a(this, this.t().z());
    }
    
    @Deprecated
    public q0 l1() {
        return new q0(this.n(), this.t());
    }
    
    public c l2(i o) {
        o = h.o(o);
        final i o2 = h.o(this.K2());
        if (o == o2) {
            return this;
        }
        return new c(o2.r(o, this.n()), this.t().S(o));
    }
    
    @Deprecated
    public u0 m1() {
        return new u0(this.n(), this.t());
    }
    
    public a m2() {
        return new a(this, this.t().T());
    }
    
    public a n0() {
        return new a(this, this.t().B());
    }
    
    public a n1() {
        return new a(this, this.t().M());
    }
    
    public a n2() {
        return new a(this, this.t().U());
    }
    
    public c o0(final long n) {
        return this.B1(n, -1);
    }
    
    public a o1() {
        return new a(this, this.t().O());
    }
    
    public a o2() {
        return new a(this, this.t().V());
    }
    
    public c q0(final k0 k0) {
        return this.C1(k0, -1);
    }
    
    public c r0(final o0 o0) {
        return this.W1(o0, -1);
    }
    
    public c r1(final int n) {
        return this.R1(this.t().d().T(this.n(), n));
    }
    
    public c s0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().j().B(this.n(), n));
    }
    
    public c s1(org.joda.time.a e) {
        e = h.e(e);
        c c;
        if (e == this.t()) {
            c = this;
        }
        else {
            c = new c(this.n(), e);
        }
        return c;
    }
    
    public c t0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().x().B(this.n(), n));
    }
    
    @Override
    public c u(org.joda.time.a e) {
        e = h.e(e);
        if (this.t() == e) {
            return this;
        }
        return super.u(e);
    }
    
    public c u0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().y().B(this.n(), n));
    }
    
    public c u1(final int n, final int n2, final int n3) {
        final org.joda.time.a t = this.t();
        return this.R1(t.s().c(t.R().p(n, n2, n3, this.k1()), false, this.n()));
    }
    
    @Override
    public c v(i o) {
        o = h.o(o);
        if (this.K2() == o) {
            return this;
        }
        return super.v(o);
    }
    
    public c v0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().E().B(this.n(), n));
    }
    
    public c w1(final t t) {
        return this.u1(t.k2(), t.f3(), t.X3());
    }
    
    public c x0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().G().B(this.n(), n));
    }
    
    public c x1(final int n) {
        return this.R1(this.t().g().T(this.n(), n));
    }
    
    @Override
    public c y() {
        if (this.t() == x.c0()) {
            return this;
        }
        return super.y();
    }
    
    @Override
    public c y0() {
        return this;
    }
    
    public c y1(final int n) {
        return this.R1(this.t().h().T(this.n(), n));
    }
    
    public c z0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.R1(this.t().J().B(this.n(), n));
    }
    
    public static final class a extends b
    {
        private static final long J = -6983323811635733510L;
        private c H;
        private f I;
        
        a(final c h, final f i) {
            this.H = h;
            this.I = i;
        }
        
        private void H(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.H = (c)objectInputStream.readObject();
            this.I = ((org.joda.time.g)objectInputStream.readObject()).G(this.H.t());
        }
        
        private void S(final ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.I.J());
        }
        
        public c D(final int n) {
            final c h = this.H;
            return h.R1(this.I.a(h.n(), n));
        }
        
        public c E(final long n) {
            final c h = this.H;
            return h.R1(this.I.b(h.n(), n));
        }
        
        public c F(final int n) {
            final c h = this.H;
            return h.R1(this.I.d(h.n(), n));
        }
        
        public c G() {
            return this.H;
        }
        
        public c I() {
            final c h = this.H;
            return h.R1(this.I.O(h.n()));
        }
        
        public c J() {
            final c h = this.H;
            return h.R1(this.I.P(h.n()));
        }
        
        public c K() {
            final c h = this.H;
            return h.R1(this.I.Q(h.n()));
        }
        
        public c L() {
            final c h = this.H;
            return h.R1(this.I.R(h.n()));
        }
        
        public c M() {
            final c h = this.H;
            return h.R1(this.I.S(h.n()));
        }
        
        public c N(final int n) {
            final c h = this.H;
            return h.R1(this.I.T(h.n(), n));
        }
        
        public c O(final String s) {
            return this.P(s, null);
        }
        
        public c P(final String s, final Locale locale) {
            final c h = this.H;
            return h.R1(this.I.V(h.n(), s, locale));
        }
        
        public c Q() {
            try {
                return this.N(this.s());
            }
            catch (RuntimeException ex) {
                if (p.b(ex)) {
                    return new c(this.i().s().J(this.u() + 86400000L), this.i());
                }
                throw ex;
            }
        }
        
        public c R() {
            try {
                return this.N(this.v());
            }
            catch (RuntimeException ex) {
                if (p.b(ex)) {
                    return new c(this.i().s().H(this.u() - 86400000L), this.i());
                }
                throw ex;
            }
        }
        
        @Override
        protected org.joda.time.a i() {
            return this.H.t();
        }
        
        @Override
        public f m() {
            return this.I;
        }
        
        @Override
        protected long u() {
            return this.H.n();
        }
    }
}
