// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.q;
import io.realm.internal.r;
import java.util.Collections;
import io.realm.internal.n;
import java.util.Locale;
import io.realm.internal.core.QueryDescriptor;
import io.realm.internal.Util;
import io.realm.internal.p;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.internal.fields.c;
import c6.h;
import io.realm.internal.OsResults;
import io.realm.internal.core.DescriptorOrdering;
import io.realm.internal.OsList;
import io.realm.internal.TableQuery;
import io.realm.internal.Table;

public class RealmQuery<E>
{
    private static final String j = "Field '%s': type mismatch - %s expected.";
    private static final String k = "Non-empty 'values' must be provided.";
    private static final String l = "Async query cannot be created on current thread.";
    private final Table a;
    private final a b;
    private final TableQuery c;
    private final r0 d;
    private Class<E> e;
    private String f;
    private final boolean g;
    private final OsList h;
    private DescriptorOrdering i;
    
    private RealmQuery(final a b, final OsList h, final Class<E> e) {
        this.i = new DescriptorOrdering();
        this.b = b;
        this.e = e;
        final boolean g = I0(e) ^ true;
        this.g = g;
        TableQuery t;
        if (g) {
            t = null;
            this.d = null;
            this.a = null;
            this.h = null;
        }
        else {
            final r0 m = b.H().m((Class<? extends n0>)e);
            this.d = m;
            this.a = m.v();
            this.h = h;
            t = h.t();
        }
        this.c = t;
    }
    
    private RealmQuery(final a b, final OsList h, final String f) {
        this.i = new DescriptorOrdering();
        this.b = b;
        this.f = f;
        this.g = false;
        final r0 n = b.H().n(f);
        this.d = n;
        this.a = n.v();
        this.c = h.t();
        this.h = h;
    }
    
    private RealmQuery(final a b, final String f) {
        this.i = new DescriptorOrdering();
        this.b = b;
        this.f = f;
        this.g = false;
        final r0 n = b.H().n(f);
        this.d = n;
        final Table v = n.v();
        this.a = v;
        this.c = v.y0();
        this.h = null;
    }
    
    private RealmQuery(final f0 b, final Class<E> e) {
        this.i = new DescriptorOrdering();
        this.b = b;
        this.e = e;
        final boolean g = I0(e) ^ true;
        this.g = g;
        if (g) {
            this.d = null;
            this.a = null;
            this.h = null;
            this.c = null;
        }
        else {
            final r0 m = b.H().m((Class<? extends n0>)e);
            this.d = m;
            final Table v = m.v();
            this.a = v;
            this.h = null;
            this.c = v.y0();
        }
    }
    
    private RealmQuery(final s0<E> s0, final Class<E> e) {
        this.i = new DescriptorOrdering();
        final a g = s0.G;
        this.b = g;
        this.e = e;
        final boolean g2 = I0(e) ^ true;
        this.g = g2;
        if (g2) {
            this.d = null;
            this.a = null;
            this.h = null;
            this.c = null;
        }
        else {
            this.d = g.H().m((Class<? extends n0>)e);
            this.a = s0.m();
            this.h = null;
            this.c = s0.i().f0();
        }
    }
    
    private RealmQuery(final s0<k> s0, final String f) {
        this.i = new DescriptorOrdering();
        final a g = s0.G;
        this.b = g;
        this.f = f;
        this.g = false;
        final r0 n = g.H().n(f);
        this.d = n;
        this.a = n.v();
        this.c = s0.i().f0();
        this.h = null;
    }
    
    private RealmQuery<E> A() {
        this.c.q();
        return this;
    }
    
    private RealmQuery<E> A1() {
        this.c.E0();
        return this;
    }
    
    private static boolean I0(final Class<?> clazz) {
        return n0.class.isAssignableFrom(clazz);
    }
    
    private boolean J0() {
        return this.f != null;
    }
    
    private OsResults P0() {
        this.b.h();
        return this.w(this.c, this.i, false).K;
    }
    
    private RealmQuery<E> Q(final String s, @h final Boolean b) {
        final c o = this.d.o(s, RealmFieldType.BOOLEAN);
        if (b == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.B(o.e(), o.h(), b);
        }
        return this;
    }
    
    private RealmQuery<E> R(final String s, @h final Byte b) {
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        if (b == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.v(o.e(), o.h(), b);
        }
        return this;
    }
    
    private RealmQuery<E> S(final String s, @h final Double n) {
        final c o = this.d.o(s, RealmFieldType.DOUBLE);
        if (n == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.t(o.e(), o.h(), n);
        }
        return this;
    }
    
    private RealmQuery<E> T(final String s, @h final Float n) {
        final c o = this.d.o(s, RealmFieldType.FLOAT);
        if (n == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.u(o.e(), o.h(), n);
        }
        return this;
    }
    
    private RealmQuery<E> U(final String s, @h final Integer n) {
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        if (n == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.v(o.e(), o.h(), n);
        }
        return this;
    }
    
    private RealmQuery<E> V(final String s, @h final Long n) {
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        if (n == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.v(o.e(), o.h(), n);
        }
        return this;
    }
    
    private RealmQuery<E> W(final String s, @h final Short n) {
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        if (n == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.v(o.e(), o.h(), n);
        }
        return this;
    }
    
    private RealmQuery<E> X(final String s, @h final String s2, final e e) {
        final c o = this.d.o(s, RealmFieldType.STRING);
        this.c.x(o.e(), o.h(), s2, e);
        return this;
    }
    
    private RealmQuery<E> Y(final String s, @h final Date date) {
        final c o = this.d.o(s, RealmFieldType.DATE);
        this.c.y(o.e(), o.h(), date);
        return this;
    }
    
    private RealmQuery<E> Z(final String s, @h final Decimal128 decimal128) {
        final c o = this.d.o(s, RealmFieldType.DECIMAL128);
        if (decimal128 == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.z(o.e(), o.h(), decimal128);
        }
        return this;
    }
    
    private RealmQuery<E> a0(final String s, @h final ObjectId objectId) {
        final c o = this.d.o(s, RealmFieldType.OBJECT_ID);
        if (objectId == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.A(o.e(), o.h(), objectId);
        }
        return this;
    }
    
    private RealmQuery<E> g() {
        this.c.R();
        return this;
    }
    
    private u0 h0() {
        return new u0(this.b.H());
    }
    
    private long i0() {
        if (this.i.c()) {
            return this.c.D();
        }
        final p p = (p)this.b0().w6((Object)null);
        if (p != null) {
            return p.S6().g().l0();
        }
        return -1L;
    }
    
    private static native String nativeSerializeQuery(final long p0, final long p1);
    
    static <E extends n0> RealmQuery<E> s(final j j, final String s) {
        return new RealmQuery<E>(j, s);
    }
    
    static <E extends n0> RealmQuery<E> t(final f0 f0, final Class<E> clazz) {
        return new RealmQuery<E>(f0, clazz);
    }
    
    static <E> RealmQuery<E> u(final l0<E> l0) {
        RealmQuery<E> realmQuery;
        if (l0.G == null) {
            realmQuery = new RealmQuery<E>(l0.J, l0.z(), l0.H);
        }
        else {
            realmQuery = new RealmQuery<E>(l0.J, l0.z(), l0.G);
        }
        return realmQuery;
    }
    
    static <E> RealmQuery<E> v(final s0<E> s0) {
        final Class<E> h = s0.H;
        RealmQuery<E> realmQuery;
        if (h == null) {
            realmQuery = new RealmQuery<E>((s0<k>)s0, s0.I);
        }
        else {
            realmQuery = new RealmQuery<E>(s0, h);
        }
        return realmQuery;
    }
    
    private s0<E> w(final TableQuery tableQuery, final DescriptorOrdering descriptorOrdering, final boolean b) {
        final OsResults l = OsResults.l(this.b.K, tableQuery, descriptorOrdering);
        s0 s0;
        if (this.J0()) {
            s0 = new s0<E>(this.b, l, this.f);
        }
        else {
            s0 = new s0<E>(this.b, l, this.e);
        }
        if (b) {
            s0.Y4();
        }
        return (s0<E>)s0;
    }
    
    public RealmQuery<E> A0(final String s, @h final Double[] array) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().S(s, array[0]);
            for (int i = 1; i < array.length; ++i) {
                this.A1().S(s, array[i]);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    public RealmQuery<E> B(final String s, final String s2) {
        return this.C(s, s2, io.realm.e.H);
    }
    
    public RealmQuery<E> B0(final String s, @h final Float[] array) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().T(s, array[0]);
            for (int i = 1; i < array.length; ++i) {
                this.A1().T(s, array[i]);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    public RealmQuery<E> B1(final String s) {
        return this.C1(s, new String[0]);
    }
    
    public RealmQuery<E> C(final String s, final String s2, final e e) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.STRING);
        this.c.s(o.e(), o.h(), s2, e);
        return this;
    }
    
    public RealmQuery<E> C0(final String s, @h final Integer[] array) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().U(s, array[0]);
            for (int i = 1; i < array.length; ++i) {
                this.A1().U(s, array[i]);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    RealmQuery<E> C1(final String s, final Object[] array) {
        this.b.h();
        if (!Util.k(s)) {
            final String[] array2 = new String[array.length];
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Null argument provided at index: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                array2[i] = array[i].toString();
            }
            try {
                this.c.F0(s, this.b.H().l(), this.i, array2);
                return this;
            }
            catch (RuntimeException cause) {
                throw new IllegalArgumentException(cause);
            }
        }
        throw new IllegalArgumentException("Non-null 'predicate' required.");
    }
    
    public RealmQuery<E> D(final String s, @h final Boolean b) {
        this.b.h();
        return this.Q(s, b);
    }
    
    public RealmQuery<E> D0(final String s, @h final Long[] array) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().V(s, array[0]);
            for (int i = 1; i < array.length; ++i) {
                this.A1().V(s, array[i]);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    public RealmQuery<E> D1(final String s) {
        this.b.h();
        return this.E1(s, v0.H);
    }
    
    public RealmQuery<E> E(final String s, @h final Byte b) {
        this.b.h();
        return this.R(s, b);
    }
    
    public RealmQuery<E> E0(final String s, @h final Short[] array) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().W(s, array[0]);
            for (int i = 1; i < array.length; ++i) {
                this.A1().W(s, array[i]);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    public RealmQuery<E> E1(final String s, final v0 v0) {
        this.b.h();
        return this.G1(new String[] { s }, new v0[] { v0 });
    }
    
    public RealmQuery<E> F(final String s, @h final Double n) {
        this.b.h();
        return this.S(s, n);
    }
    
    public RealmQuery<E> F0(final String s, @h final String[] array) {
        return this.G0(s, array, io.realm.e.H);
    }
    
    public RealmQuery<E> F1(final String s, final v0 v0, final String s2, final v0 v2) {
        this.b.h();
        return this.G1(new String[] { s, s2 }, new v0[] { v0, v2 });
    }
    
    public RealmQuery<E> G(final String s, @h final Float n) {
        this.b.h();
        return this.T(s, n);
    }
    
    public RealmQuery<E> G0(final String s, @h final String[] array, final e e) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().X(s, array[0], e);
            for (int i = 1; i < array.length; ++i) {
                this.A1().X(s, array[i], e);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    public RealmQuery<E> G1(final String[] array, final v0[] array2) {
        this.b.h();
        this.i.b(QueryDescriptor.getInstanceForSort(this.h0(), this.c.E(), array, array2));
        return this;
    }
    
    public RealmQuery<E> H(final String s, @h final Integer n) {
        this.b.h();
        return this.U(s, n);
    }
    
    public RealmQuery<E> H0(final String s, @h final Date[] array) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().Y(s, array[0]);
            for (int i = 1; i < array.length; ++i) {
                this.A1().Y(s, array[i]);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    public Number H1(final String s) {
        this.b.h();
        this.b.e();
        final long k = this.d.k(s);
        final int n = RealmQuery$a.a[this.a.F(k).ordinal()];
        if (n == 1) {
            return this.c.K0(k);
        }
        if (n == 2) {
            return this.c.J0(k);
        }
        if (n == 3) {
            return this.c.I0(k);
        }
        if (n == 4) {
            return (Number)this.c.H0(k);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", s, "int, float or double"));
    }
    
    public RealmQuery<E> I(final String s, @h final Long n) {
        this.b.h();
        return this.V(s, n);
    }
    
    public RealmQuery<E> J(final String s, @h final Short n) {
        this.b.h();
        return this.W(s, n);
    }
    
    public RealmQuery<E> K(final String s, @h final String s2) {
        return this.L(s, s2, io.realm.e.H);
    }
    
    public RealmQuery<E> K0(final String s) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.STRING, RealmFieldType.BINARY, RealmFieldType.LIST, RealmFieldType.LINKING_OBJECTS);
        this.c.S(o.e(), o.h());
        return this;
    }
    
    public RealmQuery<E> L(final String s, @h final String s2, final e e) {
        this.b.h();
        return this.X(s, s2, e);
    }
    
    public RealmQuery<E> L0(final String s) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.STRING, RealmFieldType.BINARY, RealmFieldType.LIST, RealmFieldType.LINKING_OBJECTS);
        this.c.T(o.e(), o.h());
        return this;
    }
    
    public RealmQuery<E> M(final String s, @h final Date date) {
        this.b.h();
        return this.Y(s, date);
    }
    
    public RealmQuery<E> M0(final String s) {
        this.b.h();
        final c o = this.d.o(s, new RealmFieldType[0]);
        this.c.U(o.e(), o.h());
        return this;
    }
    
    public RealmQuery<E> N(final String s, @h final Decimal128 decimal128) {
        this.b.h();
        return this.Z(s, decimal128);
    }
    
    public RealmQuery<E> N0(final String s) {
        this.b.h();
        final c o = this.d.o(s, new RealmFieldType[0]);
        this.c.V(o.e(), o.h());
        return this;
    }
    
    public RealmQuery<E> O(final String s, @h final ObjectId objectId) {
        this.b.h();
        return this.a0(s, objectId);
    }
    
    public boolean O0() {
        final a b = this.b;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b != null) {
            if (b.isClosed()) {
                b3 = b2;
            }
            else {
                final OsList h = this.h;
                if (h != null) {
                    return h.J();
                }
                final Table a = this.a;
                b3 = b2;
                if (a != null) {
                    b3 = b2;
                    if (a.c0()) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    public RealmQuery<E> P(final String s, @h final byte[] array) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.BINARY);
        if (array == null) {
            this.c.V(o.e(), o.h());
        }
        else {
            this.c.C(o.e(), o.h(), array);
        }
        return this;
    }
    
    public RealmQuery<E> Q0(final String s, final double n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DOUBLE);
        this.c.W(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> R0(final String s, final float n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.FLOAT);
        this.c.X(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> S0(final String s, final int n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        this.c.Y(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> T0(final String s, final long n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        this.c.Y(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> U0(final String s, final Date date) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DATE);
        this.c.Z(o.e(), o.h(), date);
        return this;
    }
    
    public RealmQuery<E> V0(final String s, final Decimal128 decimal128) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DECIMAL128);
        this.c.a0(o.e(), o.h(), decimal128);
        return this;
    }
    
    public RealmQuery<E> W0(final String s, final ObjectId objectId) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.OBJECT_ID);
        this.c.b0(o.e(), o.h(), objectId);
        return this;
    }
    
    public RealmQuery<E> X0(final String s, final double n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DOUBLE);
        this.c.c0(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> Y0(final String s, final float n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.FLOAT);
        this.c.d0(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> Z0(final String s, final int n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        this.c.e0(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> a() {
        this.b.h();
        this.c.a();
        return this;
    }
    
    public RealmQuery<E> a1(final String s, final long n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        this.c.e0(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> b() {
        this.b.h();
        this.c.b();
        return this;
    }
    
    public s0<E> b0() {
        this.b.h();
        this.b.e();
        return this.w(this.c, this.i, true);
    }
    
    public RealmQuery<E> b1(final String s, final Date date) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DATE);
        this.c.f0(o.e(), o.h(), date);
        return this;
    }
    
    public RealmQuery<E> c() {
        this.b.h();
        return this;
    }
    
    public s0<E> c0() {
        this.b.h();
        this.b.K.capabilities.c("Async query cannot be created on current thread.");
        return this.w(this.c, this.i, false);
    }
    
    public RealmQuery<E> c1(final String s, final Decimal128 decimal128) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DECIMAL128);
        this.c.g0(o.e(), o.h(), decimal128);
        return this;
    }
    
    public double d(final String s) {
        this.b.h();
        this.b.e();
        final long k = this.d.k(s);
        final int n = RealmQuery$a.a[this.a.F(k).ordinal()];
        if (n == 1) {
            return this.c.f(k);
        }
        if (n == 2) {
            return this.c.e(k);
        }
        if (n == 3) {
            return this.c.d(k);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", s, "int, float or double. For Decimal128 use `averageDecimal128` method."));
    }
    
    @h
    public E d0() {
        this.b.h();
        this.b.e();
        final boolean g = this.g;
        Object y = null;
        if (g) {
            return null;
        }
        final long i0 = this.i0();
        if (i0 >= 0L) {
            y = this.b.y((Class<n0>)this.e, this.f, i0);
        }
        return (E)y;
    }
    
    public RealmQuery<E> d1(final String s, final ObjectId objectId) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.OBJECT_ID);
        this.c.h0(o.e(), o.h(), objectId);
        return this;
    }
    
    @h
    public Decimal128 e(final String s) {
        this.b.h();
        this.b.e();
        return this.c.c(this.d.k(s));
    }
    
    public E e0() {
        this.b.h();
        if (!this.g) {
            this.b.K.capabilities.c("Async query cannot be created on current thread.");
            r r;
            if (this.b.Q()) {
                r = OsResults.k(this.b.K, this.c).r();
            }
            else {
                r = new n(this.b.K, this.c, this.i, this.J0());
            }
            p s;
            if (this.J0()) {
                s = new k(this.b, r);
            }
            else {
                final Class<E> e = this.e;
                final q r2 = this.b.D().r();
                final a b = this.b;
                s = r2.s((Class<p>)e, b, r, b.H().j((Class<? extends n0>)e), false, Collections.emptyList());
            }
            if (r instanceof n) {
                ((n)r).q((n.b)s.S6());
            }
            return (E)s;
        }
        throw new UnsupportedOperationException("findFirstAsync() available only when type parameter 'E' is implementing RealmModel.");
    }
    
    public RealmQuery<E> e1(final String s, final String s2) {
        return this.f1(s, s2, io.realm.e.H);
    }
    
    public RealmQuery<E> f() {
        this.b.h();
        return this.g();
    }
    
    public String f0() {
        return nativeSerializeQuery(this.c.getNativePtr(), this.i.getNativePtr());
    }
    
    public RealmQuery<E> f1(final String s, final String s2, final e e) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.STRING);
        this.c.j0(o.e(), o.h(), s2, e);
        return this;
    }
    
    public f0 g0() {
        final a b = this.b;
        if (b == null) {
            return null;
        }
        b.h();
        final a b2 = this.b;
        if (b2 instanceof f0) {
            return (f0)b2;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }
    
    public RealmQuery<E> g1(final long lng) {
        this.b.h();
        if (lng >= 1L) {
            this.i.d(lng);
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Only positive numbers above 0 is allowed. Yours was: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public RealmQuery<E> h(final String s, final String s2) {
        return this.i(s, s2, io.realm.e.H);
    }
    
    @h
    public Number h1(final String s) {
        this.b.h();
        this.b.e();
        final long k = this.d.k(s);
        final int n = RealmQuery$a.a[this.a.F(k).ordinal()];
        if (n == 1) {
            return this.c.o0(k);
        }
        if (n == 2) {
            return this.c.n0(k);
        }
        if (n == 3) {
            return this.c.m0(k);
        }
        if (n == 4) {
            return (Number)this.c.l0(k);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", s, "int, float or double"));
    }
    
    public RealmQuery<E> i(final String s, final String s2, final e e) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.STRING);
        this.c.h(o.e(), o.h(), s2, e);
        return this;
    }
    
    @h
    public Date i1(final String s) {
        this.b.h();
        this.b.e();
        return this.c.k0(this.d.k(s));
    }
    
    public RealmQuery<E> j(final String s, final double n, final double n2) {
        this.b.h();
        this.c.i(this.d.o(s, RealmFieldType.DOUBLE).e(), n, n2);
        return this;
    }
    
    public String j0() {
        return this.a.z();
    }
    
    @h
    public Number j1(final String s) {
        this.b.h();
        this.b.e();
        final long k = this.d.k(s);
        final int n = RealmQuery$a.a[this.a.F(k).ordinal()];
        if (n == 1) {
            return this.c.t0(k);
        }
        if (n == 2) {
            return this.c.s0(k);
        }
        if (n == 3) {
            return this.c.r0(k);
        }
        if (n == 4) {
            return (Number)this.c.q0(k);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", s, "int, float or double"));
    }
    
    public RealmQuery<E> k(final String s, final float n, final float n2) {
        this.b.h();
        this.c.j(this.d.o(s, RealmFieldType.FLOAT).e(), n, n2);
        return this;
    }
    
    public RealmQuery<E> k0(final String s, final double n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DOUBLE);
        this.c.F(o.e(), o.h(), n);
        return this;
    }
    
    @h
    public Date k1(final String s) {
        this.b.h();
        this.b.e();
        return this.c.p0(this.d.k(s));
    }
    
    public RealmQuery<E> l(final String s, final int n, final int n2) {
        this.b.h();
        this.c.k(this.d.o(s, RealmFieldType.INTEGER).e(), n, n2);
        return this;
    }
    
    public RealmQuery<E> l0(final String s, final float n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.FLOAT);
        this.c.G(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> l1() {
        this.b.h();
        this.c.u0();
        return this;
    }
    
    public RealmQuery<E> m(final String s, final long n, final long n2) {
        this.b.h();
        this.c.k(this.d.o(s, RealmFieldType.INTEGER).e(), n, n2);
        return this;
    }
    
    public RealmQuery<E> m0(final String s, final int n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        this.c.H(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> m1(final String s, @h final Boolean b) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.BOOLEAN);
        if (b == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.B(o.e(), o.h(), b ^ true);
        }
        return this;
    }
    
    public RealmQuery<E> n(final String s, final Date date, final Date date2) {
        this.b.h();
        this.c.l(this.d.o(s, RealmFieldType.DATE).e(), date, date2);
        return this;
    }
    
    public RealmQuery<E> n0(final String s, final long n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        this.c.H(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> n1(final String s, @h final Byte b) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        if (b == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.x0(o.e(), o.h(), b);
        }
        return this;
    }
    
    public RealmQuery<E> o(final String s, final Decimal128 decimal128, final Decimal128 decimal129) {
        this.b.h();
        this.c.m(this.d.o(s, RealmFieldType.DECIMAL128).e(), decimal128, decimal129);
        return this;
    }
    
    public RealmQuery<E> o0(final String s, final Date date) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DATE);
        this.c.I(o.e(), o.h(), date);
        return this;
    }
    
    public RealmQuery<E> o1(final String s, @h final Double n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DOUBLE);
        if (n == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.v0(o.e(), o.h(), n);
        }
        return this;
    }
    
    public RealmQuery<E> p(final String s, final String s2) {
        return this.q(s, s2, io.realm.e.H);
    }
    
    public RealmQuery<E> p0(final String s, final Decimal128 decimal128) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DECIMAL128);
        this.c.J(o.e(), o.h(), decimal128);
        return this;
    }
    
    public RealmQuery<E> p1(final String s, @h final Float n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.FLOAT);
        if (n == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.w0(o.e(), o.h(), n);
        }
        return this;
    }
    
    public RealmQuery<E> q(final String s, final String s2, final e e) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.STRING);
        this.c.o(o.e(), o.h(), s2, e);
        return this;
    }
    
    public RealmQuery<E> q0(final String s, final ObjectId objectId) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.OBJECT_ID);
        this.c.K(o.e(), o.h(), objectId);
        return this;
    }
    
    public RealmQuery<E> q1(final String s, @h final Integer n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        if (n == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.x0(o.e(), o.h(), n);
        }
        return this;
    }
    
    public long r() {
        this.b.h();
        this.b.e();
        return this.P0().c0();
    }
    
    public RealmQuery<E> r0(final String s, final double n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DOUBLE);
        this.c.L(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> r1(final String s, @h final Long n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        if (n == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.x0(o.e(), o.h(), n);
        }
        return this;
    }
    
    public RealmQuery<E> s0(final String s, final float n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.FLOAT);
        this.c.M(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> s1(final String s, @h final Short n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        if (n == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.x0(o.e(), o.h(), n);
        }
        return this;
    }
    
    public RealmQuery<E> t0(final String s, final int n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        this.c.N(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> t1(final String s, @h final String s2) {
        return this.u1(s, s2, io.realm.e.H);
    }
    
    public RealmQuery<E> u0(final String s, final long n) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.INTEGER);
        this.c.N(o.e(), o.h(), n);
        return this;
    }
    
    public RealmQuery<E> u1(final String s, @h final String s2, final e e) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.STRING);
        if (o.i() > 1 && !e.b()) {
            throw new IllegalArgumentException("Link queries cannot be case insensitive - coming soon.");
        }
        this.c.z0(o.e(), o.h(), s2, e);
        return this;
    }
    
    public RealmQuery<E> v0(final String s, final Date date) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DATE);
        this.c.O(o.e(), o.h(), date);
        return this;
    }
    
    public RealmQuery<E> v1(final String s, @h final Date date) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DATE);
        if (date == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.A0(o.e(), o.h(), date);
        }
        return this;
    }
    
    public RealmQuery<E> w0(final String s, final Decimal128 decimal128) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DECIMAL128);
        this.c.P(o.e(), o.h(), decimal128);
        return this;
    }
    
    public RealmQuery<E> w1(final String s, final Decimal128 decimal128) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.DECIMAL128);
        if (decimal128 == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.B0(o.e(), o.h(), decimal128);
        }
        return this;
    }
    
    public RealmQuery<E> x(final String s) {
        return this.y(s, new String[0]);
    }
    
    public RealmQuery<E> x0(final String s, final ObjectId objectId) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.OBJECT_ID);
        this.c.Q(o.e(), o.h(), objectId);
        return this;
    }
    
    public RealmQuery<E> x1(final String s, final ObjectId objectId) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.OBJECT_ID);
        if (objectId == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.C0(o.e(), o.h(), objectId);
        }
        return this;
    }
    
    public RealmQuery<E> y(final String s, final String... array) {
        this.b.h();
        QueryDescriptor queryDescriptor;
        if (array.length == 0) {
            queryDescriptor = QueryDescriptor.getInstanceForDistinct(this.h0(), this.a, s);
        }
        else {
            final String[] array2 = new String[array.length + 1];
            array2[0] = s;
            System.arraycopy(array, 0, array2, 1, array.length);
            queryDescriptor = QueryDescriptor.getInstanceForDistinct(this.h0(), this.a, array2);
        }
        this.i.a(queryDescriptor);
        return this;
    }
    
    public RealmQuery<E> y0(final String s, @h final Boolean[] array) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().Q(s, array[0]);
            for (int i = 1; i < array.length; ++i) {
                this.A1().Q(s, array[i]);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    public RealmQuery<E> y1(final String s, @h final byte[] array) {
        this.b.h();
        final c o = this.d.o(s, RealmFieldType.BINARY);
        if (array == null) {
            this.c.U(o.e(), o.h());
        }
        else {
            this.c.D0(o.e(), o.h(), array);
        }
        return this;
    }
    
    public RealmQuery<E> z() {
        this.b.h();
        return this.A();
    }
    
    public RealmQuery<E> z0(final String s, @h final Byte[] array) {
        this.b.h();
        if (array != null && array.length != 0) {
            this.g().R(s, array[0]);
            for (int i = 1; i < array.length; ++i) {
                this.A1().R(s, array[i]);
            }
            return this.A();
        }
        this.a();
        return this;
    }
    
    public RealmQuery<E> z1() {
        this.b.h();
        return this.A1();
    }
}
