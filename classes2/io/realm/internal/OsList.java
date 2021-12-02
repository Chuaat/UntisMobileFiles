// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.Date;
import io.realm.i0;
import io.realm.z;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import c6.h;

public class OsList implements k, ObservableCollection
{
    private static final long K;
    private final long G;
    private final j H;
    private final Table I;
    private final m<b> J;
    
    static {
        K = nativeGetFinalizerPtr();
    }
    
    private OsList(final OsSharedRealm osSharedRealm, final long g, @h final Table i) {
        this.J = new m<b>();
        this.G = g;
        this.I = i;
        (this.H = osSharedRealm.context).a(this);
    }
    
    public OsList(final UncheckedRow uncheckedRow, final long n) {
        this.J = new m<b>();
        final OsSharedRealm n2 = uncheckedRow.g().N();
        final long[] nativeCreate = nativeCreate(n2.getNativePtr(), uncheckedRow.getNativePtr(), n);
        this.G = nativeCreate[0];
        (this.H = n2.context).a(this);
        if (nativeCreate[1] != 0L) {
            this.I = new Table(n2, nativeCreate[1]);
        }
        else {
            this.I = null;
        }
    }
    
    private static native void nativeAddBinary(final long p0, @h final byte[] p1);
    
    private static native void nativeAddBoolean(final long p0, final boolean p1);
    
    private static native void nativeAddDate(final long p0, final long p1);
    
    private static native void nativeAddDecimal128(final long p0, final long p1, final long p2);
    
    private static native void nativeAddDouble(final long p0, final double p1);
    
    private static native void nativeAddFloat(final long p0, final float p1);
    
    private static native void nativeAddLong(final long p0, final long p1);
    
    private static native void nativeAddNull(final long p0);
    
    private static native void nativeAddObjectId(final long p0, final String p1);
    
    private static native void nativeAddRow(final long p0, final long p1);
    
    private static native void nativeAddString(final long p0, @h final String p1);
    
    private static native long[] nativeCreate(final long p0, final long p1, final long p2);
    
    private static native long nativeCreateAndAddEmbeddedObject(final long p0, final long p1);
    
    private static native long nativeCreateAndSetEmbeddedObject(final long p0, final long p1);
    
    private static native void nativeDelete(final long p0, final long p1);
    
    private static native void nativeDeleteAll(final long p0);
    
    private static native long nativeFreeze(final long p0, final long p1);
    
    private static native long nativeGetFinalizerPtr();
    
    private static native long nativeGetQuery(final long p0);
    
    private static native long nativeGetRow(final long p0, final long p1);
    
    private static native Object nativeGetValue(final long p0, final long p1);
    
    private static native void nativeInsertBinary(final long p0, final long p1, @h final byte[] p2);
    
    private static native void nativeInsertBoolean(final long p0, final long p1, final boolean p2);
    
    private static native void nativeInsertDate(final long p0, final long p1, final long p2);
    
    private static native void nativeInsertDecimal128(final long p0, final long p1, final long p2, final long p3);
    
    private static native void nativeInsertDouble(final long p0, final long p1, final double p2);
    
    private static native void nativeInsertFloat(final long p0, final long p1, final float p2);
    
    private static native void nativeInsertLong(final long p0, final long p1, final long p2);
    
    private static native void nativeInsertNull(final long p0, final long p1);
    
    private static native void nativeInsertObjectId(final long p0, final long p1, final String p2);
    
    private static native void nativeInsertRow(final long p0, final long p1, final long p2);
    
    private static native void nativeInsertString(final long p0, final long p1, @h final String p2);
    
    private static native boolean nativeIsValid(final long p0);
    
    private static native void nativeMove(final long p0, final long p1, final long p2);
    
    private static native void nativeRemove(final long p0, final long p1);
    
    private static native void nativeRemoveAll(final long p0);
    
    private static native void nativeSetBinary(final long p0, final long p1, @h final byte[] p2);
    
    private static native void nativeSetBoolean(final long p0, final long p1, final boolean p2);
    
    private static native void nativeSetDate(final long p0, final long p1, final long p2);
    
    private static native void nativeSetDecimal128(final long p0, final long p1, final long p2, final long p3);
    
    private static native void nativeSetDouble(final long p0, final long p1, final double p2);
    
    private static native void nativeSetFloat(final long p0, final long p1, final float p2);
    
    private static native void nativeSetLong(final long p0, final long p1, final long p2);
    
    private static native void nativeSetNull(final long p0, final long p1);
    
    private static native void nativeSetObjectId(final long p0, final long p1, final String p2);
    
    private static native void nativeSetRow(final long p0, final long p1, final long p2);
    
    private static native void nativeSetString(final long p0, final long p1, @h final String p2);
    
    private static native long nativeSize(final long p0);
    
    private native void nativeStartListening(final long p0);
    
    private native void nativeStopListening(final long p0);
    
    public void A(final long n, @h final Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeInsertNull(this.G, n);
        }
        else {
            nativeInsertDecimal128(this.G, n, decimal128.l(), decimal128.k());
        }
    }
    
    public void B(final long n, final double n2) {
        nativeInsertDouble(this.G, n, n2);
    }
    
    public void C(final long n, final float n2) {
        nativeInsertFloat(this.G, n, n2);
    }
    
    public void D(final long n, final long n2) {
        nativeInsertLong(this.G, n, n2);
    }
    
    public void E(final long n) {
        nativeInsertNull(this.G, n);
    }
    
    public void F(final long n, @h final ObjectId objectId) {
        final long g = this.G;
        if (objectId == null) {
            nativeInsertNull(g, n);
        }
        else {
            nativeInsertObjectId(g, n, objectId.toString());
        }
    }
    
    public void G(final long n, final long n2) {
        nativeInsertRow(this.G, n, n2);
    }
    
    public void H(final long n, @h final String s) {
        nativeInsertString(this.G, n, s);
    }
    
    public boolean I() {
        return nativeSize(this.G) <= 0L;
    }
    
    public boolean J() {
        return nativeIsValid(this.G);
    }
    
    public void K(final long n, final long n2) {
        nativeMove(this.G, n, n2);
    }
    
    public void L(final long n) {
        nativeRemove(this.G, n);
    }
    
    public void M() {
        nativeRemoveAll(this.G);
    }
    
    public void N() {
        this.J.b();
        this.nativeStopListening(this.G);
    }
    
    public <T> void O(final T t, final z<T> z) {
        this.J.e(t, z);
        if (this.J.d()) {
            this.nativeStopListening(this.G);
        }
    }
    
    public <T> void P(final T t, final i0<T> i0) {
        this.O(t, new c<T>(i0));
    }
    
    public void Q(final long n, @h final byte[] array) {
        nativeSetBinary(this.G, n, array);
    }
    
    public void R(final long n, final boolean b) {
        nativeSetBoolean(this.G, n, b);
    }
    
    public void S(final long n, @h final Date date) {
        if (date == null) {
            nativeSetNull(this.G, n);
        }
        else {
            nativeSetDate(this.G, n, date.getTime());
        }
    }
    
    public void T(final long n, @h final Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.G, n);
        }
        else {
            nativeSetDecimal128(this.G, n, decimal128.l(), decimal128.k());
        }
    }
    
    public void U(final long n, final double n2) {
        nativeSetDouble(this.G, n, n2);
    }
    
    public void V(final long n, final float n2) {
        nativeSetFloat(this.G, n, n2);
    }
    
    public void W(final long n, final long n2) {
        nativeSetLong(this.G, n, n2);
    }
    
    public void X(final long n) {
        nativeSetNull(this.G, n);
    }
    
    public void Y(final long n, @h final ObjectId objectId) {
        final long g = this.G;
        if (objectId == null) {
            nativeSetNull(g, n);
        }
        else {
            nativeSetObjectId(g, n, objectId.toString());
        }
    }
    
    public void Z(final long n, final long n2) {
        nativeSetRow(this.G, n, n2);
    }
    
    public void a(@h final byte[] array) {
        nativeAddBinary(this.G, array);
    }
    
    public void a0(final long n, @h final String s) {
        nativeSetString(this.G, n, s);
    }
    
    public void b(final boolean b) {
        nativeAddBoolean(this.G, b);
    }
    
    public long b0() {
        return nativeSize(this.G);
    }
    
    public void c(@h final Date date) {
        final long g = this.G;
        if (date == null) {
            nativeAddNull(g);
        }
        else {
            nativeAddDate(g, date.getTime());
        }
    }
    
    public void d(@h final Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeAddNull(this.G);
        }
        else {
            nativeAddDecimal128(this.G, decimal128.l(), decimal128.k());
        }
    }
    
    public void e(final double n) {
        nativeAddDouble(this.G, n);
    }
    
    public void f(final float n) {
        nativeAddFloat(this.G, n);
    }
    
    public <T> void g(final T t, final z<T> z) {
        if (this.J.d()) {
            this.nativeStartListening(this.G);
        }
        this.J.a(new b((T)t, z));
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsList.K;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
    
    public <T> void h(final T t, final i0<T> i0) {
        this.g(t, new c<T>(i0));
    }
    
    public void i(final long n) {
        nativeAddLong(this.G, n);
    }
    
    public void j() {
        nativeAddNull(this.G);
    }
    
    public void k(@h final ObjectId objectId) {
        final long g = this.G;
        if (objectId == null) {
            nativeAddNull(g);
        }
        else {
            nativeAddObjectId(g, objectId.toString());
        }
    }
    
    public void l(final long n) {
        nativeAddRow(this.G, n);
    }
    
    public void m(@h final String s) {
        nativeAddString(this.G, s);
    }
    
    public long n() {
        return nativeCreateAndAddEmbeddedObject(this.G, this.b0());
    }
    
    @Override
    public void notifyChangeListeners(final long n) {
        final OsCollectionChangeSet set = new OsCollectionChangeSet(n, false);
        if (set.h()) {
            return;
        }
        this.J.c((m.a<b>)new a(set));
    }
    
    public long o(final long n) {
        return nativeCreateAndAddEmbeddedObject(this.G, n);
    }
    
    public long p(final long n) {
        return nativeCreateAndSetEmbeddedObject(this.G, n);
    }
    
    public void q(final long n) {
        nativeDelete(this.G, n);
    }
    
    public void r() {
        nativeDeleteAll(this.G);
    }
    
    public OsList s(final OsSharedRealm osSharedRealm) {
        final long nativeFreeze = nativeFreeze(this.G, osSharedRealm.getNativePtr());
        final Table i = this.I;
        Table v;
        if (i != null) {
            v = i.v(osSharedRealm);
        }
        else {
            v = null;
        }
        return new OsList(osSharedRealm, nativeFreeze, v);
    }
    
    public TableQuery t() {
        return new TableQuery(this.H, this.I, nativeGetQuery(this.G));
    }
    
    public Table u() {
        return this.I;
    }
    
    public UncheckedRow v(final long n) {
        return this.I.S(nativeGetRow(this.G, n));
    }
    
    @h
    public Object w(final long n) {
        return nativeGetValue(this.G, n);
    }
    
    public void x(final long n, @h final byte[] array) {
        nativeInsertBinary(this.G, n, array);
    }
    
    public void y(final long n, final boolean b) {
        nativeInsertBoolean(this.G, n, b);
    }
    
    public void z(final long n, @h final Date date) {
        if (date == null) {
            nativeInsertNull(this.G, n);
        }
        else {
            nativeInsertDate(this.G, n, date.getTime());
        }
    }
}
