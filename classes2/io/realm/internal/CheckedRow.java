// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.Locale;
import io.realm.RealmFieldType;

public class CheckedRow extends UncheckedRow
{
    private UncheckedRow K;
    
    public CheckedRow(final UncheckedRow k) {
        super(k);
        this.K = k;
    }
    
    private CheckedRow(final j j, final Table table, final long n) {
        super(j, table, n);
    }
    
    public static CheckedRow n(final j j, final Table table, final long n) {
        return new CheckedRow(j, table, table.nativeGetRowPtr(table.getNativePtr(), n));
    }
    
    public static CheckedRow q(final UncheckedRow uncheckedRow) {
        return new CheckedRow(uncheckedRow);
    }
    
    @Override
    public boolean G(final long n) {
        final RealmFieldType b0 = this.b0(n);
        return (b0 == RealmFieldType.OBJECT || b0 == RealmFieldType.LIST) && super.G(n);
    }
    
    @Override
    public void I(final long n) {
        if (this.b0(n) == RealmFieldType.BINARY) {
            super.k0(n, null);
        }
        else {
            super.I(n);
        }
    }
    
    @Override
    public OsList V(final long n, final RealmFieldType realmFieldType) {
        if (realmFieldType == this.g().F(n)) {
            return super.V(n, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", this.g().D(n), realmFieldType.name()));
    }
    
    @Override
    public r i0(final OsSharedRealm osSharedRealm) {
        if (!this.T()) {
            return h.G;
        }
        return new CheckedRow(super.G, super.H.v(osSharedRealm), this.nativeFreeze(this.getNativePtr(), osSharedRealm.getNativePtr()));
    }
    
    @Override
    protected native boolean nativeGetBoolean(final long p0, final long p1);
    
    @Override
    protected native byte[] nativeGetByteArray(final long p0, final long p1);
    
    @Override
    protected native long nativeGetColumnCount(final long p0);
    
    @Override
    protected native long nativeGetColumnKey(final long p0, final String p1);
    
    @Override
    protected native int nativeGetColumnType(final long p0, final long p1);
    
    @Override
    protected native long[] nativeGetDecimal128(final long p0, final long p1);
    
    @Override
    protected native double nativeGetDouble(final long p0, final long p1);
    
    @Override
    protected native float nativeGetFloat(final long p0, final long p1);
    
    @Override
    protected native long nativeGetLink(final long p0, final long p1);
    
    @Override
    protected native long nativeGetLong(final long p0, final long p1);
    
    @Override
    protected native String nativeGetObjectId(final long p0, final long p1);
    
    @Override
    protected native String nativeGetString(final long p0, final long p1);
    
    @Override
    protected native long nativeGetTimestamp(final long p0, final long p1);
    
    @Override
    protected native boolean nativeIsNullLink(final long p0, final long p1);
    
    @Override
    protected native void nativeNullifyLink(final long p0, final long p1);
    
    @Override
    protected native void nativeSetBoolean(final long p0, final long p1, final boolean p2);
    
    @Override
    protected native void nativeSetByteArray(final long p0, final long p1, final byte[] p2);
    
    @Override
    protected native void nativeSetDecimal128(final long p0, final long p1, final long p2, final long p3);
    
    @Override
    protected native void nativeSetDouble(final long p0, final long p1, final double p2);
    
    @Override
    protected native void nativeSetFloat(final long p0, final long p1, final float p2);
    
    @Override
    protected native void nativeSetLink(final long p0, final long p1, final long p2);
    
    @Override
    protected native void nativeSetLong(final long p0, final long p1, final long p2);
    
    @Override
    protected native void nativeSetObjectId(final long p0, final long p1, final String p2);
    
    @Override
    protected native void nativeSetString(final long p0, final long p1, final String p2);
    
    @Override
    protected native void nativeSetTimestamp(final long p0, final long p1, final long p2);
    
    @Override
    public OsList p(final long n) {
        if (this.g().F(n) == RealmFieldType.LIST) {
            return super.p(n);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmList'.", this.g().D(n)));
    }
    
    @Override
    public boolean y(final long n) {
        return super.y(n);
    }
}
