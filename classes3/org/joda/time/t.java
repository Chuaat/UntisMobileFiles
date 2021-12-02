// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.convert.ToString;
import java.util.TimeZone;
import java.util.Locale;
import org.joda.time.format.b;
import org.joda.convert.FromString;
import java.util.Objects;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Calendar;
import org.joda.time.convert.l;
import org.joda.time.convert.d;
import org.joda.time.chrono.x;
import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;
import org.joda.time.base.j;

public final class t extends j implements n0, Serializable
{
    private static final long K = -8775358157899L;
    private static final int L = 0;
    private static final int M = 1;
    private static final int N = 2;
    private static final Set<m> O;
    private final long H;
    private final org.joda.time.a I;
    private transient int J;
    
    static {
        final HashSet<m> o = new HashSet<m>();
        (O = o).add(m.b());
        o.add(m.m());
        o.add(m.k());
        o.add(m.n());
        o.add(m.o());
        o.add(m.a());
        o.add(m.c());
    }
    
    public t() {
        this(h.c(), x.c0());
    }
    
    public t(final int n, final int n2, final int n3) {
        this(n, n2, n3, x.e0());
    }
    
    public t(final int n, final int n2, final int n3, org.joda.time.a r) {
        r = h.e(r).R();
        final long p4 = r.p(n, n2, n3, 0);
        this.I = r;
        this.H = p4;
    }
    
    public t(final long n) {
        this(n, x.c0());
    }
    
    public t(long r, org.joda.time.a i) {
        i = h.e(i);
        r = i.s().r(i.I, r);
        i = i.R();
        this.H = i.g().P(r);
        this.I = i;
    }
    
    public t(final long n, final i i) {
        this(n, x.d0(i));
    }
    
    public t(final Object o) {
        this(o, (org.joda.time.a)null);
    }
    
    public t(final Object o, org.joda.time.a r) {
        final l r2 = d.m().r(o);
        final org.joda.time.a e = h.e(r2.a(o, r));
        r = e.R();
        this.I = r;
        final int[] i = r2.i(this, o, e, org.joda.time.format.j.L());
        this.H = r.p(i[0], i[1], i[2], 0);
    }
    
    public t(final Object o, final i i) {
        final l r = d.m().r(o);
        final org.joda.time.a e = h.e(r.b(o, i));
        final org.joda.time.a r2 = e.R();
        this.I = r2;
        final int[] j = r.i(this, o, e, org.joda.time.format.j.L());
        this.H = r2.p(j[0], j[1], j[2], 0);
    }
    
    public t(final org.joda.time.a a) {
        this(h.c(), a);
    }
    
    public t(final i i) {
        this(h.c(), x.d0(i));
    }
    
    public static t G(final Calendar calendar) {
        if (calendar != null) {
            final int value = calendar.get(0);
            int value2 = calendar.get(1);
            if (value != 1) {
                value2 = 1 - value2;
            }
            return new t(value2, calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }
    
    public static t I(final Date time) {
        if (time == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (time.getTime() < 0L) {
            final GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(time);
            return G(gregorianCalendar);
        }
        return new t(time.getYear() + 1900, time.getMonth() + 1, time.getDate());
    }
    
    public static t V() {
        return new t();
    }
    
    public static t a0(final org.joda.time.a obj) {
        Objects.requireNonNull(obj, "Chronology must not be null");
        return new t(obj);
    }
    
    public static t b0(final i obj) {
        Objects.requireNonNull(obj, "Zone must not be null");
        return new t(obj);
    }
    
    @FromString
    public static t c0(final String s) {
        return i0(s, org.joda.time.format.j.L());
    }
    
    public static t i0(final String s, final b b) {
        return b.p(s);
    }
    
    private Object s0() {
        final org.joda.time.a i = this.I;
        if (i == null) {
            return new t(this.H, x.e0());
        }
        if (!org.joda.time.i.I.equals(i.s())) {
            return new t(this.H, this.I.R());
        }
        return this;
    }
    
    public c A0() {
        return this.B0(null);
    }
    
    public String A2(final String s, final Locale locale) throws IllegalArgumentException {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).P(locale).w(this);
    }
    
    public a B() {
        return new a(this, this.t().i());
    }
    
    public c B0(i o) {
        o = h.o(o);
        final org.joda.time.a s = this.t().S(o);
        return new c(s.K(this, h.c()), s);
    }
    
    @Deprecated
    public c C0() {
        return this.E0(null);
    }
    
    public int C3() {
        return this.t().i().g(this.u());
    }
    
    public a E() {
        return new a(this, this.t().k());
    }
    
    @Deprecated
    public c E0(i o) {
        o = h.o(o);
        return new c(this.k2(), this.f3(), this.X3(), 0, 0, 0, 0, this.t().S(o));
    }
    
    public c F0() {
        return this.G0(null);
    }
    
    public c G0(final i i) {
        final i o = h.o(i);
        final org.joda.time.a s = this.t().S(o);
        return new c(s.g().P(o.b(this.u() + 21600000L, false)), s).D1();
    }
    
    public r I0() {
        return this.J0(null);
    }
    
    public r J0(i o) {
        o = h.o(o);
        return new r(this.G0(o), this.l0(1).G0(o));
    }
    
    public boolean K(final m m) {
        if (m == null) {
            return false;
        }
        final org.joda.time.l d = m.d(this.t());
        return (t.O.contains(m) || d.o() >= this.t().j().o()) && d.z();
    }
    
    public u K0(final v v) {
        if (v == null) {
            throw new IllegalArgumentException("The time must not be null");
        }
        if (this.t() == v.t()) {
            return new u(this.u() + v.u(), this.t());
        }
        throw new IllegalArgumentException("The chronology of the time does not match");
    }
    
    public t M(final o0 o0) {
        return this.b1(o0, -1);
    }
    
    public int M5() {
        return this.t().U().g(this.u());
    }
    
    public a N0() {
        return new a(this, this.t().M());
    }
    
    public t O(final int n) {
        if (n == 0) {
            return this;
        }
        return this.Y0(this.t().j().B(this.u(), n));
    }
    
    public a O0() {
        return new a(this, this.t().O());
    }
    
    public t P(final int n) {
        if (n == 0) {
            return this;
        }
        return this.Y0(this.t().G().B(this.u(), n));
    }
    
    public t P0(final int n) {
        return this.Y0(this.t().d().T(this.u(), n));
    }
    
    public t Q(final int n) {
        if (n == 0) {
            return this;
        }
        return this.Y0(this.t().N().B(this.u(), n));
    }
    
    public t R0(final int n) {
        return this.Y0(this.t().g().T(this.u(), n));
    }
    
    public int R4() {
        return this.t().O().g(this.u());
    }
    
    public t S0(final int n) {
        return this.Y0(this.t().h().T(this.u(), n));
    }
    
    public t T(final int n) {
        if (n == 0) {
            return this;
        }
        return this.Y0(this.t().W().B(this.u(), n));
    }
    
    public t T0(final int n) {
        return this.Y0(this.t().i().T(this.u(), n));
    }
    
    public a U() {
        return new a(this, this.t().F());
    }
    
    public t U0(final int n) {
        return this.Y0(this.t().k().T(this.u(), n));
    }
    
    public t V0(final g obj, final int n) {
        if (obj == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (this.Z(obj)) {
            return this.Y0(obj.G(this.t()).T(this.u(), n));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field '");
        sb.append(obj);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public t W0(final m obj, final int n) {
        if (obj == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (!this.K(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Field '");
            sb.append(obj);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
        if (n == 0) {
            return this;
        }
        return this.Y0(obj.d(this.t()).b(this.u(), n));
    }
    
    public t X0(final n0 n0) {
        if (n0 == null) {
            return this;
        }
        return this.Y0(this.t().K(n0, this.u()));
    }
    
    public int X3() {
        return this.t().g().g(this.u());
    }
    
    t Y0(long p) {
        p = this.I.g().P(p);
        t t;
        if (p == this.u()) {
            t = this;
        }
        else {
            t = new t(p, this.t());
        }
        return t;
    }
    
    @Override
    public boolean Z(final g g) {
        if (g == null) {
            return false;
        }
        final m f = g.F();
        return (t.O.contains(f) || f.d(this.t()).o() >= this.t().j().o()) && g.G(this.t()).M();
    }
    
    public t Z0(final int n) {
        return this.Y0(this.t().F().T(this.u(), n));
    }
    
    public int Z2() {
        return this.t().M().g(this.u());
    }
    
    @Override
    public int b(final n0 n0) {
        int n2 = 0;
        if (this == n0) {
            return 0;
        }
        if (n0 instanceof t) {
            final t t = (t)n0;
            if (this.I.equals(t.I)) {
                final long h = this.H;
                final long h2 = t.H;
                if (h < h2) {
                    n2 = -1;
                }
                else if (h != h2) {
                    n2 = 1;
                }
                return n2;
            }
        }
        return super.b(n0);
    }
    
    public t b1(final o0 o0, final int n) {
        if (o0 != null && n != 0) {
            long u = this.u();
            final org.joda.time.a t = this.t();
            long d;
            for (int i = 0; i < o0.size(); ++i, u = d) {
                final long n2 = org.joda.time.field.j.h(o0.e0(i), n);
                final m n3 = o0.N(i);
                d = u;
                if (this.K(n3)) {
                    d = n3.d(t).d(u, n2);
                }
            }
            return this.Y0(u);
        }
        return this;
    }
    
    public t c1(final int n) {
        return this.Y0(this.t().M().T(this.u(), n));
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
    public int e0(final int i) {
        f f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid index: ");
                    sb.append(i);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                f = this.t().g();
            }
            else {
                f = this.t().F();
            }
        }
        else {
            f = this.t().T();
        }
        return f.g(this.u());
    }
    
    public t e1(final int n) {
        return this.Y0(this.t().O().T(this.u(), n));
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof t) {
            final t t = (t)o;
            if (this.I.equals(t.I)) {
                if (this.H != t.H) {
                    b = false;
                }
                return b;
            }
        }
        return super.equals(o);
    }
    
    public t f1(final int n) {
        return this.Y0(this.t().T().T(this.u(), n));
    }
    
    public int f3() {
        return this.t().F().g(this.u());
    }
    
    public t g1(final int n) {
        return this.Y0(this.t().U().T(this.u(), n));
    }
    
    public String g4(final String s) {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).w(this);
    }
    
    public int g5() {
        return this.t().V().g(this.u());
    }
    
    public t h1(final int n) {
        return this.Y0(this.t().V().T(this.u(), n));
    }
    
    public int h4() {
        return this.t().k().g(this.u());
    }
    
    @Override
    public int hashCode() {
        int j;
        if ((j = this.J) == 0) {
            j = super.hashCode();
            this.J = j;
        }
        return j;
    }
    
    public a i1() {
        return new a(this, this.t().T());
    }
    
    @Override
    public int j0(final g obj) {
        if (obj == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (this.Z(obj)) {
            return obj.G(this.t()).g(this.u());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field '");
        sb.append(obj);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public a j1() {
        return new a(this, this.t().U());
    }
    
    public t k0(final o0 o0) {
        return this.b1(o0, 1);
    }
    
    public int k2() {
        return this.t().T().g(this.u());
    }
    
    public t l0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.Y0(this.t().j().b(this.u(), n));
    }
    
    public a l1() {
        return new a(this, this.t().V());
    }
    
    public t n0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.Y0(this.t().G().b(this.u(), n));
    }
    
    public t o0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.Y0(this.t().N().b(this.u(), n));
    }
    
    public int p2() {
        return this.t().h().g(this.u());
    }
    
    public t q0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.Y0(this.t().W().b(this.u(), n));
    }
    
    public a r0(final g obj) {
        if (obj == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (this.Z(obj)) {
            return new a(this, obj.G(this.t()));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field '");
        sb.append(obj);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public int size() {
        return 3;
    }
    
    @Override
    public org.joda.time.a t() {
        return this.I;
    }
    
    public Date t0() {
        final int x3 = this.X3();
        final Date date = new Date(this.k2() - 1900, this.f3() - 1, x3);
        final t i = I(date);
        Date date3;
        if (i.o(this)) {
            for (t j = i; !j.equals(this); j = I(date)) {
                date.setTime(date.getTime() + 3600000L);
            }
            long time;
            while (true) {
                final int date2 = date.getDate();
                time = date.getTime();
                if (date2 != x3) {
                    break;
                }
                date.setTime(time - 1000L);
            }
            date.setTime(time + 1000L);
            date3 = date;
        }
        else {
            date3 = date;
            if (i.equals(this)) {
                final Date date4 = new Date(date.getTime() - TimeZone.getDefault().getDSTSavings());
                date3 = date;
                if (date4.getDate() == x3) {
                    date3 = date4;
                }
            }
        }
        return date3;
    }
    
    @ToString
    @Override
    public String toString() {
        return org.joda.time.format.j.p().w(this);
    }
    
    @Override
    protected long u() {
        return this.H;
    }
    
    @Deprecated
    public org.joda.time.b u0() {
        return this.v0(null);
    }
    
    public a v() {
        return new a(this, this.t().d());
    }
    
    @Deprecated
    public org.joda.time.b v0(i o) {
        o = h.o(o);
        return new org.joda.time.b(this.k2(), this.f3(), this.X3(), this.t().S(o));
    }
    
    public int w0() {
        return this.t().d().g(this.u());
    }
    
    public c x0(final v v) {
        return this.z0(v, null);
    }
    
    public a y() {
        return new a(this, this.t().g());
    }
    
    public a z() {
        return new a(this, this.t().h());
    }
    
    public c z0(final v v, final i i) {
        if (v == null) {
            return this.B0(i);
        }
        if (this.t() == v.t()) {
            return new c(this.k2(), this.f3(), this.X3(), v.s4(), v.k5(), v.l5(), v.E5(), this.t().S(i));
        }
        throw new IllegalArgumentException("The chronology of the time does not match");
    }
    
    public static final class a extends b
    {
        private static final long J = -3193829732634L;
        private transient t H;
        private transient f I;
        
        a(final t h, final f i) {
            this.H = h;
            this.I = i;
        }
        
        private void G(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.H = (t)objectInputStream.readObject();
            this.I = ((g)objectInputStream.readObject()).G(this.H.t());
        }
        
        private void R(final ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.I.J());
        }
        
        public t D(final int n) {
            final t h = this.H;
            return h.Y0(this.I.a(h.u(), n));
        }
        
        public t E(final int n) {
            final t h = this.H;
            return h.Y0(this.I.d(h.u(), n));
        }
        
        public t F() {
            return this.H;
        }
        
        public t H() {
            final t h = this.H;
            return h.Y0(this.I.O(h.u()));
        }
        
        public t I() {
            final t h = this.H;
            return h.Y0(this.I.P(h.u()));
        }
        
        public t J() {
            final t h = this.H;
            return h.Y0(this.I.Q(h.u()));
        }
        
        public t K() {
            final t h = this.H;
            return h.Y0(this.I.R(h.u()));
        }
        
        public t L() {
            final t h = this.H;
            return h.Y0(this.I.S(h.u()));
        }
        
        public t M(final int n) {
            final t h = this.H;
            return h.Y0(this.I.T(h.u(), n));
        }
        
        public t N(final String s) {
            return this.O(s, null);
        }
        
        public t O(final String s, final Locale locale) {
            final t h = this.H;
            return h.Y0(this.I.V(h.u(), s, locale));
        }
        
        public t P() {
            return this.M(this.s());
        }
        
        public t Q() {
            return this.M(this.v());
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
            return this.H.u();
        }
    }
}
