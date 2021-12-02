// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.RealmFieldType;
import c6.h;
import org.bson.types.ObjectId;

public class UncheckedRow implements k, r
{
    private static final long J;
    protected final j G;
    protected final Table H;
    private final long I;
    
    static {
        J = nativeGetFinalizerPtr();
    }
    
    UncheckedRow(final UncheckedRow uncheckedRow) {
        this.G = uncheckedRow.G;
        this.H = uncheckedRow.H;
        this.I = uncheckedRow.I;
    }
    
    public UncheckedRow(final j g, final Table h, final long i) {
        this.G = g;
        this.H = h;
        this.I = i;
        g.a(this);
    }
    
    static UncheckedRow c(final j j, final Table table, final long n) {
        return new UncheckedRow(j, table, table.nativeGetRowPtr(table.getNativePtr(), n));
    }
    
    static UncheckedRow e(final j j, final Table table, final long n) {
        return new UncheckedRow(j, table, n);
    }
    
    private static native long nativeGetFinalizerPtr();
    
    @Override
    public long B(final String s) {
        if (s != null) {
            return this.nativeGetColumnKey(this.I, s);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }
    
    @Override
    public void E(final long n, @h final ObjectId objectId) {
        this.H.e();
        if (objectId == null) {
            this.nativeSetNull(this.I, n);
        }
        else {
            this.nativeSetObjectId(this.I, n, objectId.toString());
        }
    }
    
    @Override
    public boolean G(final long n) {
        return this.nativeIsNullLink(this.I, n);
    }
    
    @Override
    public void I(final long n) {
        this.H.e();
        this.nativeSetNull(this.I, n);
    }
    
    @Override
    public byte[] K(final long n) {
        return this.nativeGetByteArray(this.I, n);
    }
    
    @Override
    public void M() {
        if (this.T()) {
            return;
        }
        throw new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }
    
    @Override
    public double O(final long n) {
        return this.nativeGetDouble(this.I, n);
    }
    
    @Override
    public long P(final long n) {
        return this.nativeGetLink(this.I, n);
    }
    
    @Override
    public float Q(final long n) {
        return this.nativeGetFloat(this.I, n);
    }
    
    @Override
    public boolean T() {
        final long i = this.I;
        return i != 0L && this.nativeIsValid(i);
    }
    
    @Override
    public String U(final long n) {
        return this.nativeGetString(this.I, n);
    }
    
    @Override
    public OsList V(final long n, final RealmFieldType realmFieldType) {
        return new OsList(this, n);
    }
    
    public CheckedRow a() {
        return CheckedRow.q(this);
    }
    
    @Override
    public void a0(final long n, final Date date) {
        this.H.e();
        if (date != null) {
            this.nativeSetTimestamp(this.I, n, date.getTime());
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }
    
    @Override
    public Decimal128 b(final long n) {
        final long[] nativeGetDecimal128 = this.nativeGetDecimal128(this.I, n);
        if (nativeGetDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeGetDecimal128[1], nativeGetDecimal128[0]);
        }
        return null;
    }
    
    @Override
    public RealmFieldType b0(final long n) {
        return RealmFieldType.fromNativeValue(this.nativeGetColumnType(this.I, n));
    }
    
    @Override
    public void c0(final long n, final double n2) {
        this.H.e();
        this.nativeSetDouble(this.I, n, n2);
    }
    
    @Override
    public void d(final long n, @h final String s) {
        this.H.e();
        if (s == null) {
            this.nativeSetNull(this.I, n);
        }
        else {
            this.nativeSetString(this.I, n, s);
        }
    }
    
    @Override
    public boolean e1() {
        return true;
    }
    
    @Override
    public void f(final long n, final float n2) {
        this.H.e();
        this.nativeSetFloat(this.I, n, n2);
    }
    
    @Override
    public Table g() {
        return this.H;
    }
    
    @Override
    public long getColumnCount() {
        return this.nativeGetColumnCount(this.I);
    }
    
    @Override
    public String[] getColumnNames() {
        return this.nativeGetColumnNames(this.I);
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return UncheckedRow.J;
    }
    
    @Override
    public long getNativePtr() {
        return this.I;
    }
    
    @Override
    public long h(final long n, final RealmFieldType obj) {
        final int n2 = UncheckedRow$a.a[obj.ordinal()];
        if (n2 == 1) {
            this.H.e();
            return this.nativeCreateEmbeddedObject(this.I, n);
        }
        if (n2 == 2) {
            return this.p(n).n();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Wrong parentPropertyType, expected OBJECT or LIST but received ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public void i(final long n, final boolean b) {
        this.H.e();
        this.nativeSetBoolean(this.I, n, b);
    }
    
    @Override
    public r i0(final OsSharedRealm osSharedRealm) {
        if (!this.T()) {
            return io.realm.internal.h.G;
        }
        return new UncheckedRow(this.G, this.H.v(osSharedRealm), this.nativeFreeze(this.I, osSharedRealm.getNativePtr()));
    }
    
    @Override
    public boolean j(final String s) {
        return this.nativeHasColumn(this.I, s);
    }
    
    @Override
    public ObjectId k(final long n) {
        return new ObjectId(this.nativeGetObjectId(this.I, n));
    }
    
    @Override
    public void k0(final long n, @h final byte[] array) {
        this.H.e();
        this.nativeSetByteArray(this.I, n, array);
    }
    
    @Override
    public boolean l(final long n) {
        return this.nativeGetBoolean(this.I, n);
    }
    
    @Override
    public long l0() {
        return this.nativeGetObjectKey(this.I);
    }
    
    @Override
    public long m(final long n) {
        return this.nativeGetLong(this.I, n);
    }
    
    protected native long nativeCreateEmbeddedObject(final long p0, final long p1);
    
    protected native long nativeFreeze(final long p0, final long p1);
    
    protected native boolean nativeGetBoolean(final long p0, final long p1);
    
    protected native byte[] nativeGetByteArray(final long p0, final long p1);
    
    protected native long nativeGetColumnCount(final long p0);
    
    protected native long nativeGetColumnKey(final long p0, final String p1);
    
    protected native String[] nativeGetColumnNames(final long p0);
    
    protected native int nativeGetColumnType(final long p0, final long p1);
    
    protected native long[] nativeGetDecimal128(final long p0, final long p1);
    
    protected native double nativeGetDouble(final long p0, final long p1);
    
    protected native float nativeGetFloat(final long p0, final long p1);
    
    protected native long nativeGetLink(final long p0, final long p1);
    
    protected native long nativeGetLong(final long p0, final long p1);
    
    protected native String nativeGetObjectId(final long p0, final long p1);
    
    protected native long nativeGetObjectKey(final long p0);
    
    protected native String nativeGetString(final long p0, final long p1);
    
    protected native long nativeGetTimestamp(final long p0, final long p1);
    
    protected native boolean nativeHasColumn(final long p0, final String p1);
    
    protected native boolean nativeIsNull(final long p0, final long p1);
    
    protected native boolean nativeIsNullLink(final long p0, final long p1);
    
    protected native boolean nativeIsValid(final long p0);
    
    protected native void nativeNullifyLink(final long p0, final long p1);
    
    protected native void nativeSetBoolean(final long p0, final long p1, final boolean p2);
    
    protected native void nativeSetByteArray(final long p0, final long p1, @h final byte[] p2);
    
    protected native void nativeSetDecimal128(final long p0, final long p1, final long p2, final long p3);
    
    protected native void nativeSetDouble(final long p0, final long p1, final double p2);
    
    protected native void nativeSetFloat(final long p0, final long p1, final float p2);
    
    protected native void nativeSetLink(final long p0, final long p1, final long p2);
    
    protected native void nativeSetLong(final long p0, final long p1, final long p2);
    
    protected native void nativeSetNull(final long p0, final long p1);
    
    protected native void nativeSetObjectId(final long p0, final long p1, final String p2);
    
    protected native void nativeSetString(final long p0, final long p1, final String p2);
    
    protected native void nativeSetTimestamp(final long p0, final long p1, final long p2);
    
    @Override
    public void o(final long n, final long n2) {
        this.H.e();
        this.nativeSetLink(this.I, n, n2);
    }
    
    @Override
    public OsList p(final long n) {
        return new OsList(this, n);
    }
    
    @Override
    public void s(final long n, final long n2) {
        this.H.e();
        this.nativeSetLong(this.I, n, n2);
    }
    
    @Override
    public Date u(final long n) {
        return new Date(this.nativeGetTimestamp(this.I, n));
    }
    
    @Override
    public void v(final long n, @h final Decimal128 decimal128) {
        this.H.e();
        if (decimal128 == null) {
            this.nativeSetNull(this.I, n);
        }
        else {
            this.nativeSetDecimal128(this.I, n, decimal128.l(), decimal128.k());
        }
    }
    
    @Override
    public boolean y(final long n) {
        return this.nativeIsNull(this.I, n);
    }
    
    @Override
    public void z(final long n) {
        this.H.e();
        this.nativeNullifyLink(this.I, n);
    }
}
