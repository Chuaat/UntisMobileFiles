// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import c6.h;

public class Table implements k
{
    private static final String J;
    private static final int K = 63;
    public static final int L;
    public static final long M = -1L;
    public static final boolean N = true;
    public static final boolean O = false;
    public static final int P = -1;
    public static final int Q = 16777200;
    public static final int R = 16777199;
    private static final long S;
    private final long G;
    private final j H;
    private final OsSharedRealm I;
    
    static {
        L = 63 - (J = Util.i()).length();
        S = nativeGetFinalizerPtr();
    }
    
    Table(final OsSharedRealm i, final long g) {
        final j context = i.context;
        this.H = context;
        this.I = i;
        this.G = g;
        context.a(this);
    }
    
    @h
    public static String A(@h final String s) {
        if (s == null) {
            return null;
        }
        final String j = Table.J;
        if (!s.startsWith(j)) {
            return s;
        }
        return s.substring(j.length());
    }
    
    public static String Q(final String str) {
        if (str == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(Table.J);
        sb.append(str);
        return sb.toString();
    }
    
    private boolean b0(final long n) {
        return this.D(n).equals(OsObjectStore.c(this.I, this.z()));
    }
    
    private native long nativeAddColumn(final long p0, final int p1, final String p2, final boolean p3);
    
    private native long nativeAddColumnLink(final long p0, final int p1, final String p2, final long p3);
    
    private native long nativeAddPrimitiveListColumn(final long p0, final int p1, final String p2, final boolean p3);
    
    private native void nativeAddSearchIndex(final long p0, final long p1);
    
    private native void nativeClear(final long p0);
    
    private native void nativeConvertColumnToNotNullable(final long p0, final long p1, final boolean p2);
    
    private native void nativeConvertColumnToNullable(final long p0, final long p1, final boolean p2);
    
    private native long nativeCountDouble(final long p0, final long p1, final double p2);
    
    private native long nativeCountFloat(final long p0, final long p1, final float p2);
    
    private native long nativeCountLong(final long p0, final long p1, final long p2);
    
    private native long nativeCountString(final long p0, final long p1, final String p2);
    
    private native long nativeFindFirstBool(final long p0, final long p1, final boolean p2);
    
    public static native long nativeFindFirstDecimal128(final long p0, final long p1, final long p2, final long p3);
    
    private native long nativeFindFirstDouble(final long p0, final long p1, final double p2);
    
    private native long nativeFindFirstFloat(final long p0, final long p1, final float p2);
    
    public static native long nativeFindFirstInt(final long p0, final long p1, final long p2);
    
    public static native long nativeFindFirstNull(final long p0, final long p1);
    
    public static native long nativeFindFirstObjectId(final long p0, final long p1, final String p2);
    
    public static native long nativeFindFirstString(final long p0, final long p1, final String p2);
    
    private native long nativeFindFirstTimestamp(final long p0, final long p1, final long p2);
    
    private static native long nativeFreeze(final long p0, final long p1);
    
    private native boolean nativeGetBoolean(final long p0, final long p1, final long p2);
    
    private native byte[] nativeGetByteArray(final long p0, final long p1, final long p2);
    
    private native long nativeGetColumnCount(final long p0);
    
    private native long nativeGetColumnKey(final long p0, final String p1);
    
    private native String nativeGetColumnName(final long p0, final long p1);
    
    private native String[] nativeGetColumnNames(final long p0);
    
    private native int nativeGetColumnType(final long p0, final long p1);
    
    private native long[] nativeGetDecimal128(final long p0, final long p1, final long p2);
    
    private native double nativeGetDouble(final long p0, final long p1, final long p2);
    
    private static native long nativeGetFinalizerPtr();
    
    private native float nativeGetFloat(final long p0, final long p1, final long p2);
    
    private native long nativeGetLink(final long p0, final long p1, final long p2);
    
    private native long nativeGetLinkTarget(final long p0, final long p1);
    
    private native long nativeGetLong(final long p0, final long p1, final long p2);
    
    private native String nativeGetName(final long p0);
    
    private native String nativeGetObjectId(final long p0, final long p1, final long p2);
    
    private native String nativeGetString(final long p0, final long p1, final long p2);
    
    private native long nativeGetTimestamp(final long p0, final long p1, final long p2);
    
    private native boolean nativeHasSameSchema(final long p0, final long p1);
    
    private native boolean nativeHasSearchIndex(final long p0, final long p1);
    
    public static native void nativeIncrementLong(final long p0, final long p1, final long p2, final long p3);
    
    private native boolean nativeIsColumnNullable(final long p0, final long p1);
    
    private static native boolean nativeIsEmbedded(final long p0);
    
    private native boolean nativeIsNull(final long p0, final long p1, final long p2);
    
    private native boolean nativeIsNullLink(final long p0, final long p1, final long p2);
    
    private native boolean nativeIsValid(final long p0);
    
    private native void nativeMoveLastOver(final long p0, final long p1);
    
    public static native void nativeNullifyLink(final long p0, final long p1, final long p2);
    
    private native void nativeRemoveColumn(final long p0, final long p1);
    
    private native void nativeRemoveSearchIndex(final long p0, final long p1);
    
    private native void nativeRenameColumn(final long p0, final long p1, final String p2);
    
    public static native void nativeSetBoolean(final long p0, final long p1, final long p2, final boolean p3, final boolean p4);
    
    public static native void nativeSetByteArray(final long p0, final long p1, final long p2, final byte[] p3, final boolean p4);
    
    public static native void nativeSetDecimal128(final long p0, final long p1, final long p2, final long p3, final long p4, final boolean p5);
    
    public static native void nativeSetDouble(final long p0, final long p1, final long p2, final double p3, final boolean p4);
    
    private static native boolean nativeSetEmbedded(final long p0, final boolean p1);
    
    public static native void nativeSetFloat(final long p0, final long p1, final long p2, final float p3, final boolean p4);
    
    public static native void nativeSetLink(final long p0, final long p1, final long p2, final long p3, final boolean p4);
    
    public static native void nativeSetLong(final long p0, final long p1, final long p2, final long p3, final boolean p4);
    
    public static native void nativeSetNull(final long p0, final long p1, final long p2, final boolean p3);
    
    public static native void nativeSetObjectId(final long p0, final long p1, final long p2, final String p3, final boolean p4);
    
    public static native void nativeSetString(final long p0, final long p1, final long p2, final String p3, final boolean p4);
    
    public static native void nativeSetTimestamp(final long p0, final long p1, final long p2, final long p3, final boolean p4);
    
    private native long nativeSize(final long p0);
    
    private native long nativeWhere(final long p0);
    
    public static void v0(final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Value already exists: ");
        sb.append(obj);
        throw new RealmPrimaryKeyConstraintException(sb.toString());
    }
    
    private static void w0() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }
    
    private void x0(final String s) {
        if (s.length() <= 63) {
            return;
        }
        throw new IllegalArgumentException("Column names are currently limited to max 63 characters.");
    }
    
    public long B() {
        return this.nativeGetColumnCount(this.G);
    }
    
    public long C(final String s) {
        if (s != null) {
            return this.nativeGetColumnKey(this.G, s);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }
    
    public String D(final long n) {
        return this.nativeGetColumnName(this.G, n);
    }
    
    public String[] E() {
        return this.nativeGetColumnNames(this.G);
    }
    
    public RealmFieldType F(final long n) {
        return RealmFieldType.fromNativeValue(this.nativeGetColumnType(this.G, n));
    }
    
    public Date G(final long n, final long n2) {
        return new Date(this.nativeGetTimestamp(this.G, n, n2));
    }
    
    public double H(final long n, final long n2) {
        return this.nativeGetDouble(this.G, n, n2);
    }
    
    public float I(final long n, final long n2) {
        return this.nativeGetFloat(this.G, n, n2);
    }
    
    public long J(final long n, final long n2) {
        return this.nativeGetLink(this.G, n, n2);
    }
    
    public Table K(long nativeGetLinkTarget) {
        nativeGetLinkTarget = this.nativeGetLinkTarget(this.G, nativeGetLinkTarget);
        return new Table(this.I, nativeGetLinkTarget);
    }
    
    public long L(final long n, final long n2) {
        return this.nativeGetLong(this.G, n, n2);
    }
    
    @h
    public String M() {
        return this.nativeGetName(this.G);
    }
    
    public OsSharedRealm N() {
        return this.I;
    }
    
    public String O(final long n, final long n2) {
        return this.nativeGetString(this.G, n, n2);
    }
    
    public Table P() {
        return this;
    }
    
    public UncheckedRow R(final long n) {
        return UncheckedRow.c(this.H, this, n);
    }
    
    public UncheckedRow S(final long n) {
        return UncheckedRow.e(this.H, this, n);
    }
    
    public boolean T(final Table table) {
        if (table != null) {
            return this.nativeHasSameSchema(this.G, table.G);
        }
        throw new IllegalArgumentException("The argument cannot be null");
    }
    
    public boolean U(final long n) {
        return this.nativeHasSearchIndex(this.G, n);
    }
    
    public void V(final long n, final long n2, final long n3) {
        this.e();
        nativeIncrementLong(this.G, n, n2, n3);
    }
    
    public boolean W(final long n) {
        return this.nativeIsColumnNullable(this.G, n);
    }
    
    public boolean X() {
        return nativeIsEmbedded(this.G);
    }
    
    public boolean Y() {
        return this.u0() == 0L;
    }
    
    boolean Z() {
        final OsSharedRealm i = this.I;
        return i != null && !i.isInTransaction();
    }
    
    public long a(final RealmFieldType realmFieldType, final String s) {
        return this.b(realmFieldType, s, false);
    }
    
    public boolean a0(final long n, final long n2) {
        return this.nativeIsNullLink(this.G, n, n2);
    }
    
    public long b(final RealmFieldType obj, final String s, final boolean b) {
        this.x0(s);
        switch (Table$a.a[obj.ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported type: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18: {
                return this.nativeAddPrimitiveListColumn(this.G, obj.getNativeValue() - 128, s, b);
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                return this.nativeAddColumn(this.G, obj.getNativeValue(), s, b);
            }
        }
    }
    
    public long c(final RealmFieldType realmFieldType, final String s, final Table table) {
        this.x0(s);
        return this.nativeAddColumnLink(this.G, realmFieldType.getNativeValue(), s, table.G);
    }
    
    public boolean c0() {
        final long g = this.G;
        return g != 0L && this.nativeIsValid(g);
    }
    
    public void d(final long n) {
        this.e();
        this.nativeAddSearchIndex(this.G, n);
    }
    
    public void d0(final long n) {
        this.e();
        this.nativeMoveLastOver(this.G, n);
    }
    
    void e() {
        if (this.Z()) {
            w0();
        }
    }
    
    public void e0(final long n, final long n2) {
        nativeNullifyLink(this.G, n, n2);
    }
    
    public void f() {
        this.e();
        this.nativeClear(this.G);
    }
    
    public void f0(final long n) {
        final String z = this.z();
        final String d = this.D(n);
        final String c = OsObjectStore.c(this.I, this.z());
        this.nativeRemoveColumn(this.G, n);
        if (d.equals(c)) {
            OsObjectStore.e(this.I, z, null);
        }
    }
    
    public void g(final long n) {
        if (!this.I.isSyncRealm()) {
            this.nativeConvertColumnToNotNullable(this.G, n, this.b0(n));
            return;
        }
        throw new IllegalStateException("This method is only available for non-synchronized Realms");
    }
    
    public void g0(final long n) {
        this.e();
        this.nativeRemoveSearchIndex(this.G, n);
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return Table.S;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
    
    public void h(final long n) {
        if (!this.I.isSyncRealm()) {
            this.nativeConvertColumnToNullable(this.G, n, this.b0(n));
            return;
        }
        throw new IllegalStateException("This method is only available for non-synchronized Realms");
    }
    
    public void h0(final long n, final String s) {
        this.x0(s);
        final String nativeGetColumnName = this.nativeGetColumnName(this.G, n);
        final String c = OsObjectStore.c(this.I, this.z());
        this.nativeRenameColumn(this.G, n, s);
        if (nativeGetColumnName.equals(c)) {
            try {
                OsObjectStore.e(this.I, this.z(), s);
            }
            catch (Exception cause) {
                this.nativeRenameColumn(this.G, n, nativeGetColumnName);
                throw new RuntimeException(cause);
            }
        }
    }
    
    public long i(final long n, final double n2) {
        return this.nativeCountDouble(this.G, n, n2);
    }
    
    public void i0(final long n, final long n2, final byte[] array, final boolean b) {
        this.e();
        nativeSetByteArray(this.G, n, n2, array, b);
    }
    
    public long j(final long n, final float n2) {
        return this.nativeCountFloat(this.G, n, n2);
    }
    
    public void j0(final long n, final long n2, final boolean b, final boolean b2) {
        this.e();
        nativeSetBoolean(this.G, n, n2, b, b2);
    }
    
    public long k(final long n, final long n2) {
        return this.nativeCountLong(this.G, n, n2);
    }
    
    public void k0(final long n, final long n2, final Date date, final boolean b) {
        if (date != null) {
            this.e();
            nativeSetTimestamp(this.G, n, n2, date.getTime(), b);
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }
    
    public long l(final long n, final String s) {
        return this.nativeCountString(this.G, n, s);
    }
    
    public void l0(final long n, final long n2, @h final Decimal128 decimal128, final boolean b) {
        this.e();
        if (decimal128 == null) {
            nativeSetNull(this.G, n, n2, b);
        }
        else {
            nativeSetDecimal128(this.G, n, n2, decimal128.l(), decimal128.k(), b);
        }
    }
    
    public long m(final long n, final boolean b) {
        return this.nativeFindFirstBool(this.G, n, b);
    }
    
    public void m0(final long n, final long n2, final double n3, final boolean b) {
        this.e();
        nativeSetDouble(this.G, n, n2, n3, b);
    }
    
    public long n(final long n, final Date date) {
        if (date != null) {
            return this.nativeFindFirstTimestamp(this.G, n, date.getTime());
        }
        throw new IllegalArgumentException("null is not supported");
    }
    
    public boolean n0(final boolean b) {
        return nativeSetEmbedded(this.G, b);
    }
    
    native long nativeGetRowPtr(final long p0, final long p1);
    
    public long o(final long n, final Decimal128 decimal128) {
        if (decimal128 != null) {
            return nativeFindFirstDecimal128(this.G, n, decimal128.l(), decimal128.k());
        }
        throw new IllegalArgumentException("null is not supported");
    }
    
    public void o0(final long n, final long n2, final float n3, final boolean b) {
        this.e();
        nativeSetFloat(this.G, n, n2, n3, b);
    }
    
    public long p(final long n, final double n2) {
        return this.nativeFindFirstDouble(this.G, n, n2);
    }
    
    public void p0(final long n, final long n2, final long n3, final boolean b) {
        this.e();
        nativeSetLink(this.G, n, n2, n3, b);
    }
    
    public long q(final long n, final float n2) {
        return this.nativeFindFirstFloat(this.G, n, n2);
    }
    
    public void q0(final long n, final long n2, final long n3, final boolean b) {
        this.e();
        nativeSetLong(this.G, n, n2, n3, b);
    }
    
    public long r(final long n, final long n2) {
        return nativeFindFirstInt(this.G, n, n2);
    }
    
    public void r0(final long n, final long n2, final boolean b) {
        this.e();
        nativeSetNull(this.G, n, n2, b);
    }
    
    public long s(final long n) {
        return nativeFindFirstNull(this.G, n);
    }
    
    public void s0(final long n, final long n2, @h final ObjectId objectId, final boolean b) {
        this.e();
        if (objectId == null) {
            nativeSetNull(this.G, n, n2, b);
        }
        else {
            nativeSetObjectId(this.G, n, n2, objectId.toString(), b);
        }
    }
    
    public long t(final long n, final ObjectId objectId) {
        if (objectId != null) {
            return nativeFindFirstObjectId(this.G, n, objectId.toString());
        }
        throw new IllegalArgumentException("null is not supported");
    }
    
    public void t0(final long n, final long n2, @h final String s, final boolean b) {
        this.e();
        final long g = this.G;
        if (s == null) {
            nativeSetNull(g, n, n2, b);
        }
        else {
            nativeSetString(g, n, n2, s, b);
        }
    }
    
    @Override
    public String toString() {
        final long b = this.B();
        final String m = this.M();
        final StringBuilder sb = new StringBuilder("The Table ");
        if (m != null && !m.isEmpty()) {
            sb.append(this.M());
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(b);
        sb.append(" columns: ");
        final String[] e = this.E();
        final int length = e.length;
        int n = 1;
        for (int i = 0; i < length; ++i, n = 0) {
            final String str = e[i];
            if (n == 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(".");
        sb.append(" And ");
        sb.append(this.u0());
        sb.append(" rows.");
        return sb.toString();
    }
    
    public long u(final long n, final String s) {
        if (s != null) {
            return nativeFindFirstString(this.G, n, s);
        }
        throw new IllegalArgumentException("null is not supported");
    }
    
    public long u0() {
        return this.nativeSize(this.G);
    }
    
    public Table v(final OsSharedRealm osSharedRealm) {
        if (osSharedRealm.isFrozen()) {
            return new Table(osSharedRealm, nativeFreeze(osSharedRealm.getNativePtr(), this.G));
        }
        throw new IllegalArgumentException("Frozen Realm required");
    }
    
    public byte[] w(final long n, final long n2) {
        return this.nativeGetByteArray(this.G, n, n2);
    }
    
    public boolean x(final long n, final long n2) {
        return this.nativeGetBoolean(this.G, n, n2);
    }
    
    public CheckedRow y(final long n) {
        return CheckedRow.n(this.H, this, n);
    }
    
    public TableQuery y0() {
        return new TableQuery(this.H, this, this.nativeWhere(this.G));
    }
    
    public String z() {
        final String a = A(this.M());
        if (!Util.k(a)) {
            return a;
        }
        throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
    }
}
