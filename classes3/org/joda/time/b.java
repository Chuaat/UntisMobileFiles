// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.util.Locale;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.convert.FromString;
import org.joda.time.format.j;
import java.util.Objects;
import java.io.Serializable;
import org.joda.time.base.g;

@Deprecated
public final class b extends g implements j0, Serializable
{
    private static final long J = 156371964018738L;
    
    public b() {
    }
    
    public b(final int n, final int n2, final int n3) {
        super(n, n2, n3, 0, 0, 0, 0);
    }
    
    public b(final int n, final int n2, final int n3, final org.joda.time.a a) {
        super(n, n2, n3, 0, 0, 0, 0, a);
    }
    
    public b(final int n, final int n2, final int n3, final i i) {
        super(n, n2, n3, 0, 0, 0, 0, i);
    }
    
    public b(final long n) {
        super(n);
    }
    
    public b(final long n, final org.joda.time.a a) {
        super(n, a);
    }
    
    public b(final long n, final i i) {
        super(n, i);
    }
    
    public b(final Object o) {
        super(o, (org.joda.time.a)null);
    }
    
    public b(final Object o, final org.joda.time.a a) {
        super(o, h.e(a));
    }
    
    public b(final Object o, final i i) {
        super(o, i);
    }
    
    public b(final org.joda.time.a a) {
        super(a);
    }
    
    public b(final i i) {
        super(i);
    }
    
    public static b A0(final String s, final org.joda.time.format.b b) {
        return b.n(s).f1();
    }
    
    public static b u0() {
        return new b();
    }
    
    public static b v0(final org.joda.time.a obj) {
        Objects.requireNonNull(obj, "Chronology must not be null");
        return new b(obj);
    }
    
    public static b x0(final i obj) {
        Objects.requireNonNull(obj, "Zone must not be null");
        return new b(obj);
    }
    
    @FromString
    public static b z0(final String s) {
        return A0(s, j.D().Q());
    }
    
    public b B0(final long n) {
        return this.Y0(n, 1);
    }
    
    public b C0(final k0 k0) {
        return this.Z0(k0, 1);
    }
    
    public b E0(final o0 o0) {
        return this.j1(o0, 1);
    }
    
    public b F0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.h1(this.t().j().b(this.n(), n));
    }
    
    public b G0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.h1(this.t().G().b(this.n(), n));
    }
    
    public b I0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.h1(this.t().N().b(this.n(), n));
    }
    
    public b J0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.h1(this.t().W().b(this.n(), n));
    }
    
    public a K0(final org.joda.time.g obj) {
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
    
    public r N0() {
        final org.joda.time.a t = this.t();
        final long n = this.n();
        return new r(n, m.b().d(t).b(n, 1), t);
    }
    
    public t O0() {
        return new t(this.n(), this.t());
    }
    
    @Deprecated
    public u0 P0() {
        return new u0(this.n(), this.t());
    }
    
    public a R0() {
        return new a(this, this.t().M());
    }
    
    public a S0() {
        return new a(this, this.t().O());
    }
    
    public b T0(final int n) {
        return this.h1(this.t().d().T(this.n(), n));
    }
    
    @Override
    protected long U(final long n, final org.joda.time.a a) {
        return a.g().P(n);
    }
    
    public b U0(final org.joda.time.a a) {
        b b;
        if (a == this.t()) {
            b = this;
        }
        else {
            b = new b(this.n(), a);
        }
        return b;
    }
    
    public a V() {
        return new a(this, this.t().d());
    }
    
    public b V0(final int n) {
        return this.h1(this.t().g().T(this.n(), n));
    }
    
    public b W0(final int n) {
        return this.h1(this.t().h().T(this.n(), n));
    }
    
    public b X0(final int n) {
        return this.h1(this.t().i().T(this.n(), n));
    }
    
    public b Y0(final long n, final int n2) {
        if (n != 0L && n2 != 0) {
            return this.h1(this.t().a(this.n(), n, n2));
        }
        return this;
    }
    
    public b Z0(final k0 k0, final int n) {
        if (k0 != null && n != 0) {
            return this.Y0(k0.n(), n);
        }
        return this;
    }
    
    public a a0() {
        return new a(this, this.t().g());
    }
    
    public a b0() {
        return new a(this, this.t().h());
    }
    
    public b b1(final int n) {
        return this.h1(this.t().k().T(this.n(), n));
    }
    
    public a c0() {
        return new a(this, this.t().i());
    }
    
    public b c1(final org.joda.time.g g, final int n) {
        if (g != null) {
            return this.h1(g.G(this.t()).T(this.n(), n));
        }
        throw new IllegalArgumentException("Field must not be null");
    }
    
    public b e1(final m m, final int n) {
        if (m == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (n == 0) {
            return this;
        }
        return this.h1(m.d(this.t()).b(this.n(), n));
    }
    
    public b f1(final n0 n0) {
        if (n0 == null) {
            return this;
        }
        return this.h1(this.t().K(n0, this.n()));
    }
    
    public b h1(long u) {
        final org.joda.time.a t = this.t();
        u = this.U(u, t);
        b b;
        if (u == this.n()) {
            b = this;
        }
        else {
            b = new b(u, t);
        }
        return b;
    }
    
    public a i0() {
        return new a(this, this.t().k());
    }
    
    public b i1(final int n) {
        return this.h1(this.t().F().T(this.n(), n));
    }
    
    public b j1(final o0 o0, final int n) {
        if (o0 != null && n != 0) {
            return this.h1(this.t().b(o0, this.n(), n));
        }
        return this;
    }
    
    public b k0(final long n) {
        return this.Y0(n, -1);
    }
    
    public b l0(final k0 k0) {
        return this.Z0(k0, -1);
    }
    
    public b l1(final int n) {
        return this.h1(this.t().M().T(this.n(), n));
    }
    
    public b m1(final int n) {
        return this.h1(this.t().O().T(this.n(), n));
    }
    
    public b n0(final o0 o0) {
        return this.j1(o0, -1);
    }
    
    public b n1(final int n) {
        return this.h1(this.t().T().T(this.n(), n));
    }
    
    public b o0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.h1(this.t().j().B(this.n(), n));
    }
    
    public b o1(final int n) {
        return this.h1(this.t().U().T(this.n(), n));
    }
    
    public b q0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.h1(this.t().G().B(this.n(), n));
    }
    
    public b r0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.h1(this.t().N().B(this.n(), n));
    }
    
    public b r1(final int n) {
        return this.h1(this.t().V().T(this.n(), n));
    }
    
    public b s0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.h1(this.t().W().B(this.n(), n));
    }
    
    public b s1(i o) {
        o = h.o(o);
        final i o2 = h.o(this.K2());
        if (o == o2) {
            return this;
        }
        return new b(o2.r(o, this.n()), this.t().S(o));
    }
    
    public a t0() {
        return new a(this, this.t().F());
    }
    
    public a u1() {
        return new a(this, this.t().T());
    }
    
    public a w1() {
        return new a(this, this.t().U());
    }
    
    public a x1() {
        return new a(this, this.t().V());
    }
    
    public static final class a extends org.joda.time.field.b
    {
        private static final long J = 257629620L;
        private b H;
        private f I;
        
        a(final b h, final f i) {
            this.H = h;
            this.I = i;
        }
        
        private void H(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.H = (b)objectInputStream.readObject();
            this.I = ((org.joda.time.g)objectInputStream.readObject()).G(this.H.t());
        }
        
        private void S(final ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.I.J());
        }
        
        public b D(final int n) {
            final b h = this.H;
            return h.h1(this.I.a(h.n(), n));
        }
        
        public b E(final long n) {
            final b h = this.H;
            return h.h1(this.I.b(h.n(), n));
        }
        
        public b F(final int n) {
            final b h = this.H;
            return h.h1(this.I.d(h.n(), n));
        }
        
        public b G() {
            return this.H;
        }
        
        public b I() {
            final b h = this.H;
            return h.h1(this.I.O(h.n()));
        }
        
        public b J() {
            final b h = this.H;
            return h.h1(this.I.P(h.n()));
        }
        
        public b K() {
            final b h = this.H;
            return h.h1(this.I.Q(h.n()));
        }
        
        public b L() {
            final b h = this.H;
            return h.h1(this.I.R(h.n()));
        }
        
        public b M() {
            final b h = this.H;
            return h.h1(this.I.S(h.n()));
        }
        
        public b N(final int n) {
            final b h = this.H;
            return h.h1(this.I.T(h.n(), n));
        }
        
        public b O(final String s) {
            return this.P(s, null);
        }
        
        public b P(final String s, final Locale locale) {
            final b h = this.H;
            return h.h1(this.I.V(h.n(), s, locale));
        }
        
        public b Q() {
            return this.N(this.s());
        }
        
        public b R() {
            return this.N(this.v());
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
