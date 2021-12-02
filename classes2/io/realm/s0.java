// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.reactivex.l;
import java.util.ListIterator;
import java.util.Iterator;
import io.realm.internal.android.c;
import java.util.Collection;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.internal.Util;
import io.realm.log.RealmLog;
import android.annotation.SuppressLint;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Table;
import java.util.Locale;
import io.realm.internal.p;
import io.realm.internal.r;
import c6.h;
import io.realm.internal.OsResults;

public class s0<E> extends a0<E>
{
    s0(final io.realm.a a, final OsResults osResults, final Class<E> clazz) {
        super(a, osResults, clazz);
    }
    
    s0(final io.realm.a a, final OsResults osResults, final String s) {
        super(a, osResults, s);
    }
    
    private r A(final String s, @h final n0 n0) {
        if (n0 == null) {
            return null;
        }
        if (!p0.j8(n0) || !p0.k8(n0)) {
            throw new IllegalArgumentException("'value' is not a valid, managed Realm object.");
        }
        final c0 s2 = ((p)n0).S6();
        if (!s2.f().getPath().equals(super.G.getPath())) {
            throw new IllegalArgumentException("'value' does not belong to the same Realm as the RealmResults.");
        }
        final Table u = super.K.u();
        final Table k = u.K(u.C(s));
        final Table g = s2.g().g();
        if (k.T(g)) {
            return s2.g();
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Type of object is wrong. Was '%s', expected '%s'", g.z(), k.z()));
    }
    
    private void B(final String s, final RealmFieldType realmFieldType) {
        final String z = super.K.u().z();
        final RealmFieldType q = super.G.H().h(z).q(s);
        if (q == realmFieldType) {
            return;
        }
        throw new IllegalArgumentException(String.format("The field '%s.%s' is not of the expected type. Actual: %s, Expected: %s", z, s, q, realmFieldType));
    }
    
    private <T> void C(final l0<T> l0, final Class<?> clazz) {
        if (!l0.isEmpty()) {
            final Class<?> class1 = l0.o2().getClass();
            if (!clazz.isAssignableFrom(class1)) {
                throw new IllegalArgumentException(String.format("List contained the wrong type of elements. Elements of type '%s' was expected, but the actual type is '%s'", clazz, class1));
            }
        }
    }
    
    @SuppressLint({ "unused" })
    static <T extends n0> s0<T> D(final io.realm.a a, final r r, final Class<T> clazz, final String s) {
        return new s0<T>(a, OsResults.j(a.K, (UncheckedRow)r, a.H().o(clazz), s), clazz);
    }
    
    static s0<k> E(final j j, final UncheckedRow uncheckedRow, final Table table, final String s) {
        return new s0<k>(j, OsResults.j(j.K, uncheckedRow, table, s), Table.A(table.M()));
    }
    
    private Class<?> G(final l0 l0) {
        if (!l0.isEmpty()) {
            return l0.o2().getClass();
        }
        return Long.class;
    }
    
    private String H(final String s) {
        String i = s;
        if (super.G instanceof f0) {
            i = super.G.H().k(super.K.u().z()).i(s);
            if (i == null) {
                throw new IllegalArgumentException(String.format("Field '%s' does not exists.", s));
            }
        }
        return i;
    }
    
    private void v(@h final Object o) {
        if (o != null) {
            super.G.h();
            super.G.K.capabilities.c("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }
    
    private void w(@h final Object o, final boolean b) {
        if (b && o == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (super.G.isClosed()) {
            RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", super.G.I.m());
        }
    }
    
    private void x(final String s) {
        if (!Util.k(s)) {
            return;
        }
        throw new IllegalArgumentException("Non-empty 'fieldname' required.");
    }
    
    private void z(@h final Object o) {
        if (o != null) {
            return;
        }
        throw new IllegalArgumentException("Non-null 'value' required. Use 'setNull(fieldName)' instead.");
    }
    
    public s0<E> F() {
        if (!this.T()) {
            throw new IllegalStateException("Only valid, managed RealmResults can be frozen.");
        }
        final io.realm.a w = super.G.w();
        final OsResults s = super.K.s(w.K);
        final String i = super.I;
        if (i != null) {
            return new s0<E>(w, s, i);
        }
        return new s0<E>(w, s, super.H);
    }
    
    public void I() {
        this.w(null, false);
        super.K.B();
    }
    
    public void J(final z<s0<E>> z) {
        this.w(z, true);
        super.K.C(this, (z<s0>)z);
    }
    
    public void K(final i0<s0<E>> i0) {
        this.w(i0, true);
        super.K.D(this, (i0<s0>)i0);
    }
    
    public void L(String h, @h final byte[] array) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.BINARY);
        super.K.E(h, array);
    }
    
    public void M(String h, final boolean b) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.BOOLEAN);
        super.K.F(h, b);
    }
    
    public void N(String h, final byte b) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.INTEGER);
        super.K.R(h, b);
    }
    
    public void O(String h, @h final Date date) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.DATE);
        super.K.J(h, date);
    }
    
    public void P(String h, @h final Decimal128 decimal128) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.DECIMAL128);
        super.K.L(h, decimal128);
    }
    
    public void R(String h, final double n) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.DOUBLE);
        super.K.N(h, n);
    }
    
    @Override
    public s0<E> R3(final String s, final v0 v0, final String s2, final v0 v2) {
        return this.B3(new String[] { s, s2 }, new v0[] { v0, v2 });
    }
    
    public void S(String h, final float n) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.FLOAT);
        super.K.P(h, n);
    }
    
    public void U(String h, final int n) {
        this.x(h);
        h = this.H(h);
        this.B(h, RealmFieldType.INTEGER);
        super.G.j();
        super.K.R(h, n);
    }
    
    public <T> void W(String h, final l0<T> l0) {
        this.x(h);
        h = this.H(h);
        super.G.j();
        if (l0 != null) {
            final RealmFieldType q = super.G.H().n(super.K.u().z()).q(h);
            switch (s0$a.a[q.ordinal()]) {
                default: {
                    throw new IllegalArgumentException(String.format("Field '%s' is not a list but a %s", h, q));
                }
                case 17: {
                    this.C(l0, Double.class);
                    super.K.O(h, (l0<Double>)l0);
                    break;
                }
                case 16: {
                    this.C(l0, Float.class);
                    super.K.Q(h, (l0<Float>)l0);
                    break;
                }
                case 15: {
                    this.C(l0, ObjectId.class);
                    super.K.Y(h, (l0<ObjectId>)l0);
                    break;
                }
                case 14: {
                    this.C(l0, Decimal128.class);
                    super.K.M(h, (l0<Decimal128>)l0);
                    break;
                }
                case 13: {
                    this.C(l0, Date.class);
                    super.K.K(h, (l0<Date>)l0);
                    break;
                }
                case 12: {
                    this.C(l0, byte[].class);
                    super.K.H(h, (l0<byte[]>)l0);
                    break;
                }
                case 11: {
                    this.C(l0, String.class);
                    super.K.b0(h, (l0<String>)l0);
                    break;
                }
                case 10: {
                    this.C(l0, Boolean.class);
                    super.K.G(h, (l0<Boolean>)l0);
                    break;
                }
                case 9: {
                    final Class<?> g = this.G(l0);
                    if (g.equals(Integer.class)) {
                        super.K.S(h, (l0<Integer>)l0);
                        break;
                    }
                    if (g.equals(Long.class)) {
                        super.K.T(h, (l0<Long>)l0);
                        break;
                    }
                    if (g.equals(Short.class)) {
                        super.K.Z(h, (l0<Short>)l0);
                        break;
                    }
                    if (g.equals(Byte.class)) {
                        super.K.I(h, (l0<Byte>)l0);
                        break;
                    }
                    throw new IllegalArgumentException(String.format("List contained the wrong type of elements. Elements that can be mapped to Integers was expected, but the actual type is '%s'", g));
                }
                case 8: {
                    this.C(l0, n0.class);
                    this.A(h, (n0)l0.w6((Double)null));
                    super.K.U(h, (l0<n0>)l0);
                    break;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Non-null 'list' required");
    }
    
    public void X(String h, final long n) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.INTEGER);
        super.K.R(h, n);
    }
    
    public void Y(final String s) {
        this.x(s);
        super.G.j();
        super.K.V(s);
    }
    
    @Override
    public boolean Y4() {
        super.G.h();
        super.K.A();
        return true;
    }
    
    public void Z(String h, @h final n0 n0) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.OBJECT);
        super.K.W(h, this.A(h, n0));
    }
    
    @Override
    public RealmQuery<E> a3() {
        super.G.h();
        return RealmQuery.v(this);
    }
    
    public void b0(String h, @h final ObjectId objectId) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.OBJECT_ID);
        super.K.X(h, objectId);
    }
    
    public void c0(String h, final short n) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.INTEGER);
        super.K.R(h, n);
    }
    
    public void d0(String h, @h final String s) {
        this.x(h);
        super.G.j();
        h = this.H(h);
        this.B(h, RealmFieldType.STRING);
        super.K.a0(h, s);
    }
    
    public void e0(String z, @h Object o) {
        this.x(z);
        super.G.j();
        final String h = this.H(z);
        final boolean b = o instanceof String;
        String s;
        if (b) {
            s = (String)o;
        }
        else {
            s = null;
        }
        z = super.K.u().z();
        final r0 h2 = this.k().H().h(z);
        if (!h2.w(h)) {
            throw new IllegalArgumentException(String.format("Field '%s' could not be found in class '%s'", h, z));
        }
        if (o == null) {
            super.K.V(h);
            return;
        }
        final RealmFieldType q = h2.q(h);
        Object o2 = o;
        if (b) {
            o2 = o;
            if (q != RealmFieldType.STRING) {
                switch (s0$a.a[q.ordinal()]) {
                    default: {
                        throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", h, o));
                    }
                    case 7: {
                        o2 = new ObjectId(s);
                        break;
                    }
                    case 6: {
                        o2 = Decimal128.y(s);
                        break;
                    }
                    case 5: {
                        o2 = c.b(s);
                        break;
                    }
                    case 4: {
                        o2 = Double.parseDouble(s);
                        break;
                    }
                    case 3: {
                        o2 = Float.parseFloat(s);
                        break;
                    }
                    case 2: {
                        o2 = Long.parseLong(s);
                        break;
                    }
                    case 1: {
                        o2 = Boolean.parseBoolean(s);
                        break;
                    }
                }
            }
        }
        final Class<? extends l0> class1 = ((l0<Object>)o2).getClass();
        if (class1 == Boolean.class) {
            this.M(h, (boolean)o2);
        }
        else if (class1 == Short.class) {
            this.c0(h, (short)o2);
        }
        else if (class1 == Integer.class) {
            this.U(h, (int)o2);
        }
        else if (class1 == Long.class) {
            this.X(h, (long)o2);
        }
        else if (class1 == Byte.class) {
            this.N(h, (byte)o2);
        }
        else if (class1 == Float.class) {
            this.S(h, (float)o2);
        }
        else if (class1 == Double.class) {
            this.R(h, (double)o2);
        }
        else if (class1 == String.class) {
            this.d0(h, (String)o2);
        }
        else if (o2 instanceof Date) {
            this.O(h, (Date)o2);
        }
        else if (o2 instanceof Decimal128) {
            this.P(h, (Decimal128)o2);
        }
        else if (o2 instanceof ObjectId) {
            this.b0(h, (ObjectId)o2);
        }
        else if (o2 instanceof byte[]) {
            this.L(h, (byte[])o2);
        }
        else if (o2 instanceof n0) {
            this.Z(h, (n0)o2);
        }
        else {
            if (class1 != l0.class) {
                o = new StringBuilder();
                ((StringBuilder)o).append("Value is of a type not supported: ");
                ((StringBuilder)o).append(((l0<Object>)o2).getClass());
                throw new IllegalArgumentException(((StringBuilder)o).toString());
            }
            this.W(h, (l0<Object>)o2);
        }
    }
    
    @Override
    public boolean e1() {
        super.G.h();
        return super.K.x();
    }
    
    @Override
    public boolean n6() {
        final io.realm.a g = super.G;
        return g != null && g.N();
    }
    
    public void o(final z<s0<E>> z) {
        this.v(z);
        super.K.c(this, (z<s0>)z);
    }
    
    public void p(final i0<s0<E>> i0) {
        this.v(i0);
        super.K.d(this, (i0<s0>)i0);
    }
    
    public io.reactivex.b0<io.realm.rx.a<s0<E>>> q() {
        final io.realm.a g = super.G;
        if (g instanceof f0) {
            return g.I.q().o((f0)super.G, this);
        }
        if (g instanceof j) {
            return g.I.q().i((j)g, this);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(super.G.getClass());
        sb.append(" does not support RxJava2.");
        throw new UnsupportedOperationException(sb.toString());
    }
    
    public l<s0<E>> r() {
        final io.realm.a g = super.G;
        if (g instanceof f0) {
            return g.I.q().c((f0)super.G, this);
        }
        if (g instanceof j) {
            return g.I.q().g((j)g, this);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(super.G.getClass());
        sb.append(" does not support RxJava2.");
        throw new UnsupportedOperationException(sb.toString());
    }
    
    public String t() {
        return super.K.e0(-1);
    }
}
