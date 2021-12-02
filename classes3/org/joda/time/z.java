// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.util.Locale;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.time.chrono.x;
import java.util.Objects;
import org.joda.time.format.b;
import org.joda.convert.FromString;
import org.joda.time.format.j;
import java.io.Serializable;
import org.joda.time.base.g;

public class z extends g implements f0, Cloneable, Serializable
{
    private static final long L = 2852608688135209575L;
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    public static final int R = 5;
    private f J;
    private int K;
    
    public z() {
    }
    
    public z(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        super(n, n2, n3, n4, n5, n6, n7);
    }
    
    public z(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final org.joda.time.a a) {
        super(n, n2, n3, n4, n5, n6, n7, a);
    }
    
    public z(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final i i) {
        super(n, n2, n3, n4, n5, n6, n7, i);
    }
    
    public z(final long n) {
        super(n);
    }
    
    public z(final long n, final org.joda.time.a a) {
        super(n, a);
    }
    
    public z(final long n, final i i) {
        super(n, i);
    }
    
    public z(final Object o) {
        super(o, (org.joda.time.a)null);
    }
    
    public z(final Object o, final org.joda.time.a a) {
        super(o, h.e(a));
    }
    
    public z(final Object o, final i i) {
        super(o, i);
    }
    
    public z(final org.joda.time.a a) {
        super(a);
    }
    
    public z(final i i) {
        super(i);
    }
    
    @FromString
    public static z A0(final String s) {
        return B0(s, j.D().Q());
    }
    
    public static z B0(final String s, final b b) {
        return b.n(s).I3();
    }
    
    public static z v0() {
        return new z();
    }
    
    public static z x0(final org.joda.time.a obj) {
        Objects.requireNonNull(obj, "Chronology must not be null");
        return new z(obj);
    }
    
    public static z z0(final i obj) {
        Objects.requireNonNull(obj, "Zone must not be null");
        return new z(obj);
    }
    
    public a C0(final org.joda.time.g obj) {
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
    
    @Override
    public void D(final o0 o0) {
        this.z1(o0, 1);
    }
    
    public a E0() {
        return new a(this, this.t().H());
    }
    
    public a F0() {
        return new a(this, this.t().I());
    }
    
    @Override
    public void F1(final int n) {
        this.N3(this.t().g().T(this.n(), n));
    }
    
    public void G0(final long n) {
        this.N3(this.t().z().T(n, this.k1()));
    }
    
    @Override
    public void G1(i o) {
        o = h.o(o);
        final org.joda.time.a t = this.t();
        if (t.s() != o) {
            this.J(t.S(o));
        }
    }
    
    @Override
    public void H0(final int n) {
        this.N3(this.t().H().T(this.n(), n));
    }
    
    @Override
    public void H1(final int n) {
        this.N3(this.t().T().T(this.n(), n));
    }
    
    public void I0(final l0 l0) {
        long n2;
        final long n = n2 = h.j(l0);
        if (l0 instanceof j0) {
            final i s = h.e(((j0)l0).t()).s();
            n2 = n;
            if (s != null) {
                n2 = s.r(this.K2(), n);
            }
        }
        this.G0(n2);
    }
    
    @Override
    public void J(final org.joda.time.a a) {
        super.J(a);
    }
    
    public void J0(final f f) {
        this.K0(f, 1);
    }
    
    @Override
    public void J4(final int n) {
        this.N3(this.t().B().T(this.n(), n));
    }
    
    public void K0(final f f, int n) {
        if (f != null && (n < 0 || n > 5)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Illegal rounding mode: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        f j;
        if (n == 0) {
            j = null;
        }
        else {
            j = f;
        }
        this.J = j;
        if (f == null) {
            n = 0;
        }
        this.K = n;
        this.N3(this.n());
    }
    
    @Override
    public void L1(final int n) {
        this.N3(this.t().i().T(this.n(), n));
    }
    
    @Override
    public void M0(final int n) {
        this.N3(this.t().F().T(this.n(), n));
    }
    
    @Override
    public void M4(final int n) {
        this.N3(this.t().D().T(this.n(), n));
    }
    
    public void N0(final long n) {
        this.N3(this.t().z().T(this.n(), x.e0().z().g(n)));
    }
    
    @Override
    public void N3(long n) {
        final int k = this.K;
        if (k != 1) {
            if (k != 2) {
                if (k != 3) {
                    if (k != 4) {
                        if (k == 5) {
                            n = this.J.R(n);
                        }
                    }
                    else {
                        n = this.J.Q(n);
                    }
                }
                else {
                    n = this.J.S(n);
                }
            }
            else {
                n = this.J.O(n);
            }
        }
        else {
            n = this.J.P(n);
        }
        super.N3(n);
    }
    
    public void O0(final l0 l0) {
        final long j = h.j(l0);
        final i s = h.i(l0).s();
        long r = j;
        if (s != null) {
            r = s.r(i.I, j);
        }
        this.N0(r);
    }
    
    @Override
    public void O2(final l0 l0) {
        this.N3(h.j(l0));
    }
    
    public a P0() {
        return new a(this, this.t().M());
    }
    
    @Override
    public void Q0(final int n) {
        this.N3(this.t().h().T(this.n(), n));
    }
    
    public a R0() {
        return new a(this, this.t().O());
    }
    
    @Override
    public void S(final int n) {
        if (n != 0) {
            this.N3(this.t().x().b(this.n(), n));
        }
    }
    
    public a S0() {
        return new a(this, this.t().T());
    }
    
    public a T0() {
        return new a(this, this.t().U());
    }
    
    public a U0() {
        return new a(this, this.t().V());
    }
    
    public a V() {
        return new a(this, this.t().d());
    }
    
    @Override
    public void W(final int n) {
        if (n != 0) {
            this.N3(this.t().N().b(this.n(), n));
        }
    }
    
    @Override
    public void Y(final int n) {
        if (n != 0) {
            this.N3(this.t().G().b(this.n(), n));
        }
    }
    
    public z a0() {
        return (z)this.clone();
    }
    
    public a b0() {
        return new a(this, this.t().g());
    }
    
    public a c0() {
        return new a(this, this.t().h());
    }
    
    @Override
    public void c2(final int n) {
        this.N3(this.t().I().T(this.n(), n));
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError("Clone error");
        }
    }
    
    @Override
    public void d0(final int n) {
        if (n != 0) {
            this.N3(this.t().W().b(this.n(), n));
        }
    }
    
    @Override
    public void d5(final k0 k0, final int n) {
        if (k0 != null) {
            this.f0(org.joda.time.field.j.i(k0.n(), n));
        }
    }
    
    @Override
    public void f0(final long n) {
        this.N3(org.joda.time.field.j.e(this.n(), n));
    }
    
    @Override
    public void f2(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this.N3(this.t().q(n, n2, n3, n4, n5, n6, n7));
    }
    
    @Override
    public void f5(final org.joda.time.g g, final int n) {
        if (g != null) {
            this.N3(g.G(this.t()).T(this.n(), n));
            return;
        }
        throw new IllegalArgumentException("Field must not be null");
    }
    
    @Override
    public void g0(final int n) {
        if (n != 0) {
            this.N3(this.t().J().b(this.n(), n));
        }
    }
    
    @Override
    public void h0(final int n) {
        if (n != 0) {
            this.N3(this.t().j().b(this.n(), n));
        }
    }
    
    @Override
    public void h3(final int n) {
        this.N3(this.t().C().T(this.n(), n));
    }
    
    public a i0() {
        return new a(this, this.t().i());
    }
    
    public a k0() {
        return new a(this, this.t().k());
    }
    
    @Override
    public void k3(final int n, final int n2, final int n3) {
        this.G0(this.t().p(n, n2, n3, 0));
    }
    
    public f l0() {
        return this.J;
    }
    
    @Override
    public void m0(final int n) {
        if (n != 0) {
            this.N3(this.t().y().b(this.n(), n));
        }
    }
    
    @Override
    public void m4(final int n, final int n2, final int n3, final int n4) {
        this.N3(this.t().r(this.n(), n, n2, n3, n4));
    }
    
    public int n0() {
        return this.K;
    }
    
    public a o0() {
        return new a(this, this.t().v());
    }
    
    @Override
    public void p5(final int n) {
        this.N3(this.t().O().T(this.n(), n));
    }
    
    public a q0() {
        return new a(this, this.t().z());
    }
    
    @Override
    public void q2(final int n) {
        if (n != 0) {
            this.N3(this.t().Q().b(this.n(), n));
        }
    }
    
    public a r0() {
        return new a(this, this.t().B());
    }
    
    public a s0() {
        return new a(this, this.t().C());
    }
    
    public a t0() {
        return new a(this, this.t().D());
    }
    
    @Override
    public void t1(i o) {
        o = h.o(o);
        final i o2 = h.o(this.K2());
        if (o == o2) {
            return;
        }
        final long r = o2.r(o, this.n());
        this.J(this.t().S(o));
        this.N3(r);
    }
    
    public a u0() {
        return new a(this, this.t().F());
    }
    
    @Override
    public void u2(final int n) {
        this.N3(this.t().z().T(this.n(), n));
    }
    
    @Override
    public void v1(final k0 k0) {
        this.d5(k0, 1);
    }
    
    @Override
    public void w(final int n) {
        if (n != 0) {
            this.N3(this.t().E().b(this.n(), n));
        }
    }
    
    @Override
    public void w3(final int n) {
        this.N3(this.t().M().T(this.n(), n));
    }
    
    @Override
    public void x(final m m, final int n) {
        if (m != null) {
            if (n != 0) {
                this.N3(m.d(this.t()).b(this.n(), n));
            }
            return;
        }
        throw new IllegalArgumentException("Field must not be null");
    }
    
    @Override
    public void z1(final o0 o0, final int n) {
        if (o0 != null) {
            this.N3(this.t().b(o0, this.n(), n));
        }
    }
    
    @Override
    public void z2(final int n) {
        this.N3(this.t().v().T(this.n(), n));
    }
    
    public static final class a extends b
    {
        private static final long J = -4481126543819298617L;
        private z H;
        private f I;
        
        a(final z h, final f i) {
            this.H = h;
            this.I = i;
        }
        
        private void H(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.H = (z)objectInputStream.readObject();
            this.I = ((org.joda.time.g)objectInputStream.readObject()).G(this.H.t());
        }
        
        private void Q(final ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.I.J());
        }
        
        public z D(final int n) {
            this.H.N3(this.m().a(this.H.n(), n));
            return this.H;
        }
        
        public z E(final long n) {
            this.H.N3(this.m().b(this.H.n(), n));
            return this.H;
        }
        
        public z F(final int n) {
            this.H.N3(this.m().d(this.H.n(), n));
            return this.H;
        }
        
        public z G() {
            return this.H;
        }
        
        public z I() {
            this.H.N3(this.m().O(this.H.n()));
            return this.H;
        }
        
        public z J() {
            this.H.N3(this.m().P(this.H.n()));
            return this.H;
        }
        
        public z K() {
            this.H.N3(this.m().Q(this.H.n()));
            return this.H;
        }
        
        public z L() {
            this.H.N3(this.m().R(this.H.n()));
            return this.H;
        }
        
        public z M() {
            this.H.N3(this.m().S(this.H.n()));
            return this.H;
        }
        
        public z N(final int n) {
            this.H.N3(this.m().T(this.H.n(), n));
            return this.H;
        }
        
        public z O(final String s) {
            this.P(s, null);
            return this.H;
        }
        
        public z P(final String s, final Locale locale) {
            this.H.N3(this.m().V(this.H.n(), s, locale));
            return this.H;
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
