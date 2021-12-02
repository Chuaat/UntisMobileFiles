// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.convert.ToString;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.time.format.b;
import org.joda.convert.FromString;
import java.util.Objects;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Calendar;
import org.joda.time.convert.l;
import org.joda.time.convert.d;
import org.joda.time.chrono.x;
import java.io.Serializable;
import org.joda.time.base.j;

public final class u extends j implements n0, Serializable
{
    private static final long J = -268716875315837168L;
    private static final int K = 0;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = 3;
    private final long H;
    private final org.joda.time.a I;
    
    public u() {
        this(h.c(), x.c0());
    }
    
    public u(final int n, final int n2, final int n3, final int n4, final int n5) {
        this(n, n2, n3, n4, n5, 0, 0, x.e0());
    }
    
    public u(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this(n, n2, n3, n4, n5, n6, 0, x.e0());
    }
    
    public u(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this(n, n2, n3, n4, n5, n6, n7, x.e0());
    }
    
    public u(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, org.joda.time.a r) {
        r = h.e(r).R();
        final long q = r.q(n, n2, n3, n4, n5, n6, n7);
        this.I = r;
        this.H = q;
    }
    
    public u(final long n) {
        this(n, x.c0());
    }
    
    public u(final long n, org.joda.time.a e) {
        e = h.e(e);
        this.H = e.s().r(i.I, n);
        this.I = e.R();
    }
    
    public u(final long n, final i i) {
        this(n, x.d0(i));
    }
    
    public u(final Object o) {
        this(o, (org.joda.time.a)null);
    }
    
    public u(final Object o, org.joda.time.a r) {
        final l r2 = d.m().r(o);
        final org.joda.time.a e = h.e(r2.a(o, r));
        r = e.R();
        this.I = r;
        final int[] i = r2.i(this, o, e, org.joda.time.format.j.K());
        this.H = r.p(i[0], i[1], i[2], i[3]);
    }
    
    public u(final Object o, final i i) {
        final l r = d.m().r(o);
        final org.joda.time.a e = h.e(r.b(o, i));
        final org.joda.time.a r2 = e.R();
        this.I = r2;
        final int[] j = r.i(this, o, e, org.joda.time.format.j.K());
        this.H = r2.p(j[0], j[1], j[2], j[3]);
    }
    
    public u(final org.joda.time.a a) {
        this(h.c(), a);
    }
    
    public u(final i i) {
        this(h.c(), x.d0(i));
    }
    
    public static u I(final Calendar calendar) {
        if (calendar != null) {
            final int value = calendar.get(0);
            int value2 = calendar.get(1);
            if (value != 1) {
                value2 = 1 - value2;
            }
            return new u(value2, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }
    
    public static u K(final Date time) {
        if (time == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (time.getTime() < 0L) {
            final GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(time);
            return I(gregorianCalendar);
        }
        return new u(time.getYear() + 1900, time.getMonth() + 1, time.getDate(), time.getHours(), time.getMinutes(), time.getSeconds(), ((int)(time.getTime() % 1000L) + 1000) % 1000);
    }
    
    private Object N0() {
        final org.joda.time.a i = this.I;
        if (i == null) {
            return new u(this.H, x.e0());
        }
        if (!org.joda.time.i.I.equals(i.s())) {
            return new u(this.H, this.I.R());
        }
        return this;
    }
    
    public static u r0() {
        return new u();
    }
    
    public static u s0(final org.joda.time.a obj) {
        Objects.requireNonNull(obj, "Chronology must not be null");
        return new u(obj);
    }
    
    public static u t0(final i obj) {
        Objects.requireNonNull(obj, "Zone must not be null");
        return new u(obj);
    }
    
    @FromString
    public static u u0(final String s) {
        return v0(s, org.joda.time.format.j.K());
    }
    
    public static u v0(final String s, final b b) {
        return b.q(s);
    }
    
    private Date y(final Date time, final TimeZone timeZone) {
        final Calendar instance = Calendar.getInstance(timeZone);
        instance.setTime(time);
        final u i = I(instance);
        Calendar calendar;
        if (i.o(this)) {
            u j = i;
            u k;
            while (true) {
                k = j;
                if (!j.o(this)) {
                    break;
                }
                instance.setTimeInMillis(instance.getTimeInMillis() + 60000L);
                j = I(instance);
            }
            while (!k.o(this)) {
                instance.setTimeInMillis(instance.getTimeInMillis() - 1000L);
                k = I(instance);
            }
            instance.setTimeInMillis(instance.getTimeInMillis() + 1000L);
            calendar = instance;
        }
        else {
            calendar = instance;
            if (i.equals(this)) {
                final Calendar instance2 = Calendar.getInstance(timeZone);
                instance2.setTimeInMillis(instance.getTimeInMillis() - timeZone.getDSTSavings());
                calendar = instance;
                if (I(instance2).equals(this)) {
                    calendar = instance2;
                }
            }
        }
        return calendar.getTime();
    }
    
    public u A0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().j().b(this.u(), n));
    }
    
    public u A1(final int n) {
        return this.l1(this.t().U().T(this.u(), n));
    }
    
    public String A2(final String s, final Locale locale) throws IllegalArgumentException {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).P(locale).w(this);
    }
    
    public a B() {
        return new a(this, this.t().h());
    }
    
    public u B0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().x().b(this.u(), n));
    }
    
    public u B1(final int n) {
        return this.l1(this.t().V().T(this.u(), n));
    }
    
    public u C0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().y().b(this.u(), n));
    }
    
    public a C1() {
        return new a(this, this.t().T());
    }
    
    public int C3() {
        return this.t().i().g(this.u());
    }
    
    public a D1() {
        return new a(this, this.t().U());
    }
    
    public a E() {
        return new a(this, this.t().i());
    }
    
    public u E0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().E().b(this.u(), n));
    }
    
    public int E5() {
        return this.t().B().g(this.u());
    }
    
    public u F0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().G().b(this.u(), n));
    }
    
    public a G() {
        return new a(this, this.t().k());
    }
    
    public u G0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().J().b(this.u(), n));
    }
    
    public u I0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().N().b(this.u(), n));
    }
    
    public a I1() {
        return new a(this, this.t().V());
    }
    
    public u J0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().W().b(this.u(), n));
    }
    
    public a K0(final g obj) {
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
    
    public a M() {
        return new a(this, this.t().v());
    }
    
    public int M5() {
        return this.t().U().g(this.u());
    }
    
    public boolean O(final m m) {
        return m != null && m.d(this.t()).z();
    }
    
    public a O0() {
        return new a(this, this.t().I());
    }
    
    public a P() {
        return new a(this, this.t().z());
    }
    
    public Date P0() {
        final Date date = new Date(this.k2() - 1900, this.f3() - 1, this.X3(), this.s4(), this.k5(), this.l5());
        date.setTime(date.getTime() + this.E5());
        return this.y(date, TimeZone.getDefault());
    }
    
    public a Q() {
        return new a(this, this.t().B());
    }
    
    public Date R0(final TimeZone zone) {
        final Calendar instance = Calendar.getInstance(zone);
        instance.clear();
        instance.set(this.k2(), this.f3() - 1, this.X3(), this.s4(), this.k5(), this.l5());
        final Date time = instance.getTime();
        time.setTime(time.getTime() + this.E5());
        return this.y(time, zone);
    }
    
    public int R4() {
        return this.t().O().g(this.u());
    }
    
    public c S0(i o) {
        o = h.o(o);
        return new c(this.k2(), this.f3(), this.X3(), this.s4(), this.k5(), this.l5(), this.E5(), this.I.S(o));
    }
    
    public u T(final k0 k0) {
        return this.e1(k0, -1);
    }
    
    public t T0() {
        return new t(this.u(), this.t());
    }
    
    public u U(final o0 o0) {
        return this.r1(o0, -1);
    }
    
    public v U0() {
        return new v(this.u(), this.t());
    }
    
    public u V(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().j().B(this.u(), n));
    }
    
    public a V0() {
        return new a(this, this.t().M());
    }
    
    public a W0() {
        return new a(this, this.t().O());
    }
    
    public u X0(final int n) {
        return this.l1(this.t().d().T(this.u(), n));
    }
    
    public int X3() {
        return this.t().g().g(this.u());
    }
    
    public u Y0(final int n, final int n2, final int n3) {
        final org.joda.time.a t = this.t();
        return this.l1(t.g().T(t.F().T(t.T().T(this.u(), n), n2), n3));
    }
    
    @Override
    public boolean Z(final g g) {
        return g != null && g.G(this.t()).M();
    }
    
    public u Z0(final int n) {
        return this.l1(this.t().g().T(this.u(), n));
    }
    
    public int Z2() {
        return this.t().M().g(this.u());
    }
    
    public u a0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().x().B(this.u(), n));
    }
    
    @Override
    public int b(final n0 n0) {
        int n2 = 0;
        if (this == n0) {
            return 0;
        }
        if (n0 instanceof u) {
            final u u = (u)n0;
            if (this.I.equals(u.I)) {
                final long h = this.H;
                final long h2 = u.H;
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
    
    public u b0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().y().B(this.u(), n));
    }
    
    public u b1(final int n) {
        return this.l1(this.t().h().T(this.u(), n));
    }
    
    public u c0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().E().B(this.u(), n));
    }
    
    public u c1(final int n) {
        return this.l1(this.t().i().T(this.u(), n));
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
        if (i == 3) {
            return a.z();
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
                    if (i != 3) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid index: ");
                        sb.append(i);
                        throw new IndexOutOfBoundsException(sb.toString());
                    }
                    f = this.t().z();
                }
                else {
                    f = this.t().g();
                }
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
    
    public u e1(final k0 k0, final int n) {
        if (k0 != null && n != 0) {
            return this.l1(this.t().a(this.u(), k0.n(), n));
        }
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof u) {
            final u u = (u)o;
            if (this.I.equals(u.I)) {
                if (this.H != u.H) {
                    b = false;
                }
                return b;
            }
        }
        return super.equals(o);
    }
    
    public u f1(final int n) {
        return this.l1(this.t().k().T(this.u(), n));
    }
    
    public int f3() {
        return this.t().F().g(this.u());
    }
    
    public u g1(final g g, final int n) {
        if (g != null) {
            return this.l1(g.G(this.t()).T(this.u(), n));
        }
        throw new IllegalArgumentException("Field must not be null");
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
    
    public u h1(final m m, final int n) {
        if (m == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (n == 0) {
            return this;
        }
        return this.l1(m.d(this.t()).b(this.u(), n));
    }
    
    public int h4() {
        return this.t().k().g(this.u());
    }
    
    public u i0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().G().B(this.u(), n));
    }
    
    public u i1(final n0 n0) {
        if (n0 == null) {
            return this;
        }
        return this.l1(this.t().K(n0, this.u()));
    }
    
    @Override
    public int j0(final g g) {
        if (g != null) {
            return g.G(this.t()).g(this.u());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }
    
    public u j1(final int n) {
        return this.l1(this.t().v().T(this.u(), n));
    }
    
    public u k0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().J().B(this.u(), n));
    }
    
    public int k1() {
        return this.t().z().g(this.u());
    }
    
    public int k2() {
        return this.t().T().g(this.u());
    }
    
    public int k5() {
        return this.t().D().g(this.u());
    }
    
    public u l0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().N().B(this.u(), n));
    }
    
    u l1(final long n) {
        u u;
        if (n == this.u()) {
            u = this;
        }
        else {
            u = new u(n, this.t());
        }
        return u;
    }
    
    public int l5() {
        return this.t().I().g(this.u());
    }
    
    public u m1(final int n) {
        return this.l1(this.t().z().T(this.u(), n));
    }
    
    public u n0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.l1(this.t().W().B(this.u(), n));
    }
    
    public u n1(final int n) {
        return this.l1(this.t().B().T(this.u(), n));
    }
    
    public a o0() {
        return new a(this, this.t().D());
    }
    
    public u o1(final int n) {
        return this.l1(this.t().D().T(this.u(), n));
    }
    
    public int p2() {
        return this.t().h().g(this.u());
    }
    
    public a q0() {
        return new a(this, this.t().F());
    }
    
    public u q1(final int n) {
        return this.l1(this.t().F().T(this.u(), n));
    }
    
    public u r1(final o0 o0, final int n) {
        if (o0 != null && n != 0) {
            return this.l1(this.t().b(o0, this.u(), n));
        }
        return this;
    }
    
    public u s1(final int n) {
        return this.l1(this.t().I().T(this.u(), n));
    }
    
    public int s4() {
        return this.t().v().g(this.u());
    }
    
    @Override
    public int size() {
        return 4;
    }
    
    @Override
    public org.joda.time.a t() {
        return this.I;
    }
    
    @ToString
    @Override
    public String toString() {
        return org.joda.time.format.j.B().w(this);
    }
    
    @Override
    protected long u() {
        return this.H;
    }
    
    public u u1(final int n, final int n2, final int n3, final int n4) {
        final org.joda.time.a t = this.t();
        return this.l1(t.B().T(t.I().T(t.D().T(t.v().T(this.u(), n), n2), n3), n4));
    }
    
    public a v() {
        return new a(this, this.t().d());
    }
    
    public int w0() {
        return this.t().d().g(this.u());
    }
    
    public u w1(final int n) {
        return this.l1(this.t().M().T(this.u(), n));
    }
    
    public u x0(final k0 k0) {
        return this.e1(k0, 1);
    }
    
    public u x1(final int n) {
        return this.l1(this.t().O().T(this.u(), n));
    }
    
    public c y0() {
        return this.S0(null);
    }
    
    public u y1(final int n) {
        return this.l1(this.t().T().T(this.u(), n));
    }
    
    public a z() {
        return new a(this, this.t().g());
    }
    
    public u z0(final o0 o0) {
        return this.r1(o0, 1);
    }
    
    public static final class a extends b
    {
        private static final long J = -358138762846288L;
        private transient u H;
        private transient f I;
        
        a(final u h, final f i) {
            this.H = h;
            this.I = i;
        }
        
        private void H(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.H = (u)objectInputStream.readObject();
            this.I = ((g)objectInputStream.readObject()).G(this.H.t());
        }
        
        private void S(final ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.I.J());
        }
        
        public u D(final int n) {
            final u h = this.H;
            return h.l1(this.I.a(h.u(), n));
        }
        
        public u E(final long n) {
            final u h = this.H;
            return h.l1(this.I.b(h.u(), n));
        }
        
        public u F(final int n) {
            final u h = this.H;
            return h.l1(this.I.d(h.u(), n));
        }
        
        public u G() {
            return this.H;
        }
        
        public u I() {
            final u h = this.H;
            return h.l1(this.I.O(h.u()));
        }
        
        public u J() {
            final u h = this.H;
            return h.l1(this.I.P(h.u()));
        }
        
        public u K() {
            final u h = this.H;
            return h.l1(this.I.Q(h.u()));
        }
        
        public u L() {
            final u h = this.H;
            return h.l1(this.I.R(h.u()));
        }
        
        public u M() {
            final u h = this.H;
            return h.l1(this.I.S(h.u()));
        }
        
        public u N(final int n) {
            final u h = this.H;
            return h.l1(this.I.T(h.u(), n));
        }
        
        public u O(final String s) {
            return this.P(s, null);
        }
        
        public u P(final String s, final Locale locale) {
            final u h = this.H;
            return h.l1(this.I.V(h.u(), s, locale));
        }
        
        public u Q() {
            return this.N(this.s());
        }
        
        public u R() {
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
            return this.H.u();
        }
    }
}
