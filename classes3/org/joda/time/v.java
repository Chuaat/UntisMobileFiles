// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.convert.ToString;
import java.util.Locale;
import java.util.Date;
import java.util.Calendar;
import org.joda.time.format.b;
import org.joda.convert.FromString;
import java.util.Objects;
import org.joda.time.convert.l;
import org.joda.time.convert.d;
import org.joda.time.chrono.x;
import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;
import org.joda.time.base.j;

public final class v extends j implements n0, Serializable
{
    private static final long J = -12873158713873L;
    public static final v K;
    private static final int L = 0;
    private static final int M = 1;
    private static final int N = 2;
    private static final int O = 3;
    private static final Set<m> P;
    private final long H;
    private final org.joda.time.a I;
    
    static {
        K = new v(0, 0, 0, 0);
        final HashSet<m> p = new HashSet<m>();
        (P = p).add(m.i());
        p.add(m.l());
        p.add(m.j());
        p.add(m.g());
    }
    
    public v() {
        this(h.c(), x.c0());
    }
    
    public v(final int n, final int n2) {
        this(n, n2, 0, 0, x.e0());
    }
    
    public v(final int n, final int n2, final int n3) {
        this(n, n2, n3, 0, x.e0());
    }
    
    public v(final int n, final int n2, final int n3, final int n4) {
        this(n, n2, n3, n4, x.e0());
    }
    
    public v(final int n, final int n2, final int n3, final int n4, org.joda.time.a r) {
        r = h.e(r).R();
        final long r2 = r.r(0L, n, n2, n3, n4);
        this.I = r;
        this.H = r2;
    }
    
    public v(final long n) {
        this(n, x.c0());
    }
    
    public v(long r, org.joda.time.a i) {
        i = h.e(i);
        r = i.s().r(i.I, r);
        i = i.R();
        this.H = i.z().g(r);
        this.I = i;
    }
    
    public v(final long n, final i i) {
        this(n, x.d0(i));
    }
    
    public v(final Object o) {
        this(o, (org.joda.time.a)null);
    }
    
    public v(final Object o, org.joda.time.a r) {
        final l r2 = d.m().r(o);
        final org.joda.time.a e = h.e(r2.a(o, r));
        r = e.R();
        this.I = r;
        final int[] i = r2.i(this, o, e, org.joda.time.format.j.M());
        this.H = r.r(0L, i[0], i[1], i[2], i[3]);
    }
    
    public v(final Object o, final i i) {
        final l r = d.m().r(o);
        final org.joda.time.a e = h.e(r.b(o, i));
        final org.joda.time.a r2 = e.R();
        this.I = r2;
        final int[] j = r.i(this, o, e, org.joda.time.format.j.M());
        this.H = r2.r(0L, j[0], j[1], j[2], j[3]);
    }
    
    public v(final org.joda.time.a a) {
        this(h.c(), a);
    }
    
    public v(final i i) {
        this(h.c(), x.d0(i));
    }
    
    public static v B(final long n, final org.joda.time.a a) {
        return new v(n, h.e(a).R());
    }
    
    public static v V() {
        return new v();
    }
    
    public static v a0(final org.joda.time.a obj) {
        Objects.requireNonNull(obj, "Chronology must not be null");
        return new v(obj);
    }
    
    public static v b0(final i obj) {
        Objects.requireNonNull(obj, "Zone must not be null");
        return new v(obj);
    }
    
    @FromString
    public static v c0(final String s) {
        return i0(s, org.joda.time.format.j.M());
    }
    
    public static v i0(final String s, final b b) {
        return b.r(s);
    }
    
    private Object s0() {
        final org.joda.time.a i = this.I;
        if (i == null) {
            return new v(this.H, x.e0());
        }
        if (!org.joda.time.i.I.equals(i.s())) {
            return new v(this.H, this.I.R());
        }
        return this;
    }
    
    public static v v(final Calendar calendar) {
        if (calendar != null) {
            return new v(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }
    
    public static v y(final Date date) {
        if (date != null) {
            return new v(date.getHours(), date.getMinutes(), date.getSeconds(), ((int)(date.getTime() % 1000L) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }
    
    public static v z(final long n) {
        return B(n, null);
    }
    
    public v A0(final n0 n0) {
        if (n0 == null) {
            return this;
        }
        return this.C0(this.t().K(n0, this.u()));
    }
    
    public String A2(final String s, final Locale locale) throws IllegalArgumentException {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).P(locale).w(this);
    }
    
    public v B0(final int n) {
        return this.C0(this.t().v().T(this.u(), n));
    }
    
    v C0(final long n) {
        v v;
        if (n == this.u()) {
            v = this;
        }
        else {
            v = new v(n, this.t());
        }
        return v;
    }
    
    public a E() {
        return new a(this, this.t().v());
    }
    
    public v E0(final int n) {
        return this.C0(this.t().z().T(this.u(), n));
    }
    
    public int E5() {
        return this.t().B().g(this.u());
    }
    
    public v F0(final int n) {
        return this.C0(this.t().B().T(this.u(), n));
    }
    
    public boolean G(final m m) {
        if (m == null) {
            return false;
        }
        final org.joda.time.l d = m.d(this.t());
        return (v.P.contains(m) || d.o() < this.t().j().o()) && d.z();
    }
    
    public v G0(final int n) {
        return this.C0(this.t().D().T(this.u(), n));
    }
    
    public a I() {
        return new a(this, this.t().z());
    }
    
    public v I0(final o0 o0, final int n) {
        if (o0 != null && n != 0) {
            return this.C0(this.t().b(o0, this.u(), n));
        }
        return this;
    }
    
    public v J0(final int n) {
        return this.C0(this.t().I().T(this.u(), n));
    }
    
    public a K() {
        return new a(this, this.t().B());
    }
    
    public v M(final o0 o0) {
        return this.I0(o0, -1);
    }
    
    public v O(final int n) {
        if (n == 0) {
            return this;
        }
        return this.C0(this.t().x().B(this.u(), n));
    }
    
    public v P(final int n) {
        if (n == 0) {
            return this;
        }
        return this.C0(this.t().y().B(this.u(), n));
    }
    
    public v Q(final int n) {
        if (n == 0) {
            return this;
        }
        return this.C0(this.t().E().B(this.u(), n));
    }
    
    public v T(final int n) {
        if (n == 0) {
            return this;
        }
        return this.C0(this.t().J().B(this.u(), n));
    }
    
    public a U() {
        return new a(this, this.t().D());
    }
    
    @Override
    public boolean Z(final g g) {
        boolean b = false;
        if (g == null) {
            return false;
        }
        if (!this.G(g.F())) {
            return false;
        }
        final m i = g.I();
        if (this.G(i) || i == m.b()) {
            b = true;
        }
        return b;
    }
    
    @Override
    public int b(final n0 n0) {
        int n2 = 0;
        if (this == n0) {
            return 0;
        }
        if (n0 instanceof v) {
            final v v = (v)n0;
            if (this.I.equals(v.I)) {
                final long h = this.H;
                final long h2 = v.H;
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
                    f = this.t().B();
                }
                else {
                    f = this.t().I();
                }
            }
            else {
                f = this.t().D();
            }
        }
        else {
            f = this.t().v();
        }
        return f.g(this.u());
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof v) {
            final v v = (v)o;
            if (this.I.equals(v.I)) {
                if (this.H != v.H) {
                    b = false;
                }
                return b;
            }
        }
        return super.equals(o);
    }
    
    public String g4(final String s) {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).w(this);
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
    
    public v k0(final o0 o0) {
        return this.I0(o0, 1);
    }
    
    public int k1() {
        return this.t().z().g(this.u());
    }
    
    public int k5() {
        return this.t().D().g(this.u());
    }
    
    public v l0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.C0(this.t().x().b(this.u(), n));
    }
    
    public int l5() {
        return this.t().I().g(this.u());
    }
    
    public v n0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.C0(this.t().y().b(this.u(), n));
    }
    
    public v o0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.C0(this.t().E().b(this.u(), n));
    }
    
    public v q0(final int n) {
        if (n == 0) {
            return this;
        }
        return this.C0(this.t().J().b(this.u(), n));
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
    
    public a t0() {
        return new a(this, this.t().I());
    }
    
    @ToString
    @Override
    public String toString() {
        return org.joda.time.format.j.S().w(this);
    }
    
    @Override
    protected long u() {
        return this.H;
    }
    
    public c u0() {
        return this.v0(null);
    }
    
    public c v0(final i i) {
        final org.joda.time.a s = this.t().S(i);
        return new c(s.K(this, h.c()), s);
    }
    
    public v x0(final g obj, final int n) {
        if (obj == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (this.Z(obj)) {
            return this.C0(obj.G(this.t()).T(this.u(), n));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field '");
        sb.append(obj);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public v z0(final m obj, final int n) {
        if (obj == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (!this.G(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Field '");
            sb.append(obj);
            sb.append("' is not supported");
            throw new IllegalArgumentException(sb.toString());
        }
        if (n == 0) {
            return this;
        }
        return this.C0(obj.d(this.t()).b(this.u(), n));
    }
    
    public static final class a extends b
    {
        private static final long J = -325842547277223L;
        private transient v H;
        private transient f I;
        
        a(final v h, final f i) {
            this.H = h;
            this.I = i;
        }
        
        private void I(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.H = (v)objectInputStream.readObject();
            this.I = ((g)objectInputStream.readObject()).G(this.H.t());
        }
        
        private void T(final ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.H);
            objectOutputStream.writeObject(this.I.J());
        }
        
        public v D(final int n) {
            final v h = this.H;
            return h.C0(this.I.a(h.u(), n));
        }
        
        public v E(final long n) {
            final v h = this.H;
            return h.C0(this.I.b(h.u(), n));
        }
        
        public v F(final int n) {
            final long a = this.I.a(this.H.u(), n);
            if (this.H.t().z().g(a) == a) {
                return this.H.C0(a);
            }
            throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
        }
        
        public v G(final int n) {
            final v h = this.H;
            return h.C0(this.I.d(h.u(), n));
        }
        
        public v H() {
            return this.H;
        }
        
        public v J() {
            final v h = this.H;
            return h.C0(this.I.O(h.u()));
        }
        
        public v K() {
            final v h = this.H;
            return h.C0(this.I.P(h.u()));
        }
        
        public v L() {
            final v h = this.H;
            return h.C0(this.I.Q(h.u()));
        }
        
        public v M() {
            final v h = this.H;
            return h.C0(this.I.R(h.u()));
        }
        
        public v N() {
            final v h = this.H;
            return h.C0(this.I.S(h.u()));
        }
        
        public v O(final int n) {
            final v h = this.H;
            return h.C0(this.I.T(h.u(), n));
        }
        
        public v P(final String s) {
            return this.Q(s, null);
        }
        
        public v Q(final String s, final Locale locale) {
            final v h = this.H;
            return h.C0(this.I.V(h.u(), s, locale));
        }
        
        public v R() {
            return this.O(this.s());
        }
        
        public v S() {
            return this.O(this.v());
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
