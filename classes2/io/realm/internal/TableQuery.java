// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import io.realm.e;
import io.realm.internal.core.DescriptorOrdering;
import io.realm.internal.objectstore.OsKeyPathMapping;
import org.bson.types.Decimal128;
import java.util.Date;
import org.bson.types.ObjectId;
import c6.h;

public class TableQuery implements k
{
    private static final boolean K = false;
    private static final long L;
    private static final String M = "Date value in query criteria must not be null.";
    private final j G;
    private final Table H;
    private final long I;
    private boolean J;
    
    static {
        L = nativeGetFinalizerPtr();
    }
    
    public TableQuery(final j g, final Table h, final long i) {
        this.J = true;
        this.G = g;
        this.H = h;
        this.I = i;
        g.a(this);
    }
    
    private void L0() {
        throw new IllegalStateException("Mutable method call during read transaction.");
    }
    
    private native void nativeAlwaysFalse(final long p0);
    
    private native void nativeAlwaysTrue(final long p0);
    
    private native long[] nativeAverageDecimal128(final long p0, final long p1);
    
    private native double nativeAverageDouble(final long p0, final long p1);
    
    private native double nativeAverageFloat(final long p0, final long p1);
    
    private native double nativeAverageInt(final long p0, final long p1);
    
    private native void nativeBeginsWith(final long p0, final long[] p1, final long[] p2, final String p3, final boolean p4);
    
    private native void nativeBetween(final long p0, final long[] p1, final double p2, final double p3);
    
    private native void nativeBetween(final long p0, final long[] p1, final float p2, final float p3);
    
    private native void nativeBetween(final long p0, final long[] p1, final long p2, final long p3);
    
    private native void nativeBetweenDecimal128(final long p0, final long[] p1, final long p2, final long p3, final long p4, final long p5);
    
    private native void nativeBetweenTimestamp(final long p0, final long[] p1, final long p2, final long p3);
    
    private native void nativeContains(final long p0, final long[] p1, final long[] p2, final String p3, final boolean p4);
    
    private native long nativeCount(final long p0);
    
    private native void nativeEndGroup(final long p0);
    
    private native void nativeEndsWith(final long p0, final long[] p1, final long[] p2, final String p3, final boolean p4);
    
    private native void nativeEqual(final long p0, final long[] p1, final long[] p2, final double p3);
    
    private native void nativeEqual(final long p0, final long[] p1, final long[] p2, final float p3);
    
    private native void nativeEqual(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeEqual(final long p0, final long[] p1, final long[] p2, @h final String p3, final boolean p4);
    
    private native void nativeEqual(final long p0, final long[] p1, final long[] p2, final boolean p3);
    
    private native void nativeEqual(final long p0, final long[] p1, final long[] p2, final byte[] p3);
    
    private native void nativeEqualDecimal128(final long p0, final long[] p1, final long[] p2, final long p3, final long p4);
    
    private native void nativeEqualObjectId(final long p0, final long[] p1, final long[] p2, final String p3);
    
    private native void nativeEqualTimestamp(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native long nativeFind(final long p0);
    
    private static native long nativeGetFinalizerPtr();
    
    private native void nativeGreater(final long p0, final long[] p1, final long[] p2, final double p3);
    
    private native void nativeGreater(final long p0, final long[] p1, final long[] p2, final float p3);
    
    private native void nativeGreater(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeGreaterDecimal128(final long p0, final long[] p1, final long[] p2, final long p3, final long p4);
    
    private native void nativeGreaterEqual(final long p0, final long[] p1, final long[] p2, final double p3);
    
    private native void nativeGreaterEqual(final long p0, final long[] p1, final long[] p2, final float p3);
    
    private native void nativeGreaterEqual(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeGreaterEqualDecimal128(final long p0, final long[] p1, final long[] p2, final long p3, final long p4);
    
    private native void nativeGreaterEqualObjectId(final long p0, final long[] p1, final long[] p2, final String p3);
    
    private native void nativeGreaterEqualTimestamp(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeGreaterObjectId(final long p0, final long[] p1, final long[] p2, final String p3);
    
    private native void nativeGreaterTimestamp(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeGroup(final long p0);
    
    private native void nativeIsEmpty(final long p0, final long[] p1, final long[] p2);
    
    private native void nativeIsNotEmpty(final long p0, final long[] p1, final long[] p2);
    
    private native void nativeIsNotNull(final long p0, final long[] p1, final long[] p2);
    
    private native void nativeIsNull(final long p0, final long[] p1, final long[] p2);
    
    private native void nativeLess(final long p0, final long[] p1, final long[] p2, final double p3);
    
    private native void nativeLess(final long p0, final long[] p1, final long[] p2, final float p3);
    
    private native void nativeLess(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeLessDecimal128(final long p0, final long[] p1, final long[] p2, final long p3, final long p4);
    
    private native void nativeLessEqual(final long p0, final long[] p1, final long[] p2, final double p3);
    
    private native void nativeLessEqual(final long p0, final long[] p1, final long[] p2, final float p3);
    
    private native void nativeLessEqual(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeLessEqualDecimal128(final long p0, final long[] p1, final long[] p2, final long p3, final long p4);
    
    private native void nativeLessEqualObjectId(final long p0, final long[] p1, final long[] p2, final String p3);
    
    private native void nativeLessEqualTimestamp(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeLessObjectId(final long p0, final long[] p1, final long[] p2, final String p3);
    
    private native void nativeLessTimestamp(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeLike(final long p0, final long[] p1, final long[] p2, final String p3, final boolean p4);
    
    private native long[] nativeMaximumDecimal128(final long p0, final long p1);
    
    private native Double nativeMaximumDouble(final long p0, final long p1);
    
    private native Float nativeMaximumFloat(final long p0, final long p1);
    
    private native Long nativeMaximumInt(final long p0, final long p1);
    
    private native Long nativeMaximumTimestamp(final long p0, final long p1);
    
    private native long[] nativeMinimumDecimal128(final long p0, final long p1);
    
    private native Double nativeMinimumDouble(final long p0, final long p1);
    
    private native Float nativeMinimumFloat(final long p0, final long p1);
    
    private native Long nativeMinimumInt(final long p0, final long p1);
    
    private native Long nativeMinimumTimestamp(final long p0, final long p1);
    
    private native void nativeNot(final long p0);
    
    private native void nativeNotEqual(final long p0, final long[] p1, final long[] p2, final double p3);
    
    private native void nativeNotEqual(final long p0, final long[] p1, final long[] p2, final float p3);
    
    private native void nativeNotEqual(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeNotEqual(final long p0, final long[] p1, final long[] p2, @h final String p3, final boolean p4);
    
    private native void nativeNotEqual(final long p0, final long[] p1, final long[] p2, final byte[] p3);
    
    private native void nativeNotEqualDecimal128(final long p0, final long[] p1, final long[] p2, final long p3, final long p4);
    
    private native void nativeNotEqualObjectId(final long p0, final long[] p1, final long[] p2, final String p3);
    
    private native void nativeNotEqualTimestamp(final long p0, final long[] p1, final long[] p2, final long p3);
    
    private native void nativeOr(final long p0);
    
    private native void nativeRawPredicate(final long p0, final String p1, final Long p2, final long p3, final String[] p4);
    
    private native long nativeRemove(final long p0);
    
    private native long[] nativeSumDecimal128(final long p0, final long p1);
    
    private native double nativeSumDouble(final long p0, final long p1);
    
    private native double nativeSumFloat(final long p0, final long p1);
    
    private native long nativeSumInt(final long p0, final long p1);
    
    private native String nativeValidateQuery(final long p0);
    
    public TableQuery A(final long[] array, final long[] array2, final ObjectId objectId) {
        this.nativeEqualObjectId(this.I, array, array2, objectId.toString());
        this.J = false;
        return this;
    }
    
    public TableQuery A0(final long[] array, final long[] array2, final Date date) {
        if (date != null) {
            this.nativeNotEqualTimestamp(this.I, array, array2, date.getTime());
            this.J = false;
            return this;
        }
        throw new IllegalArgumentException("Date value in query criteria must not be null.");
    }
    
    public TableQuery B(final long[] array, final long[] array2, final boolean b) {
        this.nativeEqual(this.I, array, array2, b);
        this.J = false;
        return this;
    }
    
    public TableQuery B0(final long[] array, final long[] array2, final Decimal128 decimal128) {
        this.nativeNotEqualDecimal128(this.I, array, array2, decimal128.l(), decimal128.k());
        this.J = false;
        return this;
    }
    
    public TableQuery C(final long[] array, final long[] array2, final byte[] array3) {
        this.nativeEqual(this.I, array, array2, array3);
        this.J = false;
        return this;
    }
    
    public TableQuery C0(final long[] array, final long[] array2, final ObjectId objectId) {
        this.nativeNotEqualObjectId(this.I, array, array2, objectId.toString());
        this.J = false;
        return this;
    }
    
    public long D() {
        this.M0();
        return this.nativeFind(this.I);
    }
    
    public TableQuery D0(final long[] array, final long[] array2, final byte[] array3) {
        this.nativeNotEqual(this.I, array, array2, array3);
        this.J = false;
        return this;
    }
    
    public Table E() {
        return this.H;
    }
    
    public TableQuery E0() {
        this.nativeOr(this.I);
        this.J = false;
        return this;
    }
    
    public TableQuery F(final long[] array, final long[] array2, final double n) {
        this.nativeGreater(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public void F0(final String s, @h final OsKeyPathMapping osKeyPathMapping, final DescriptorOrdering descriptorOrdering, final String[] array) {
        final long i = this.I;
        Long value;
        if (osKeyPathMapping != null) {
            value = osKeyPathMapping.getNativePtr();
        }
        else {
            value = null;
        }
        this.nativeRawPredicate(i, s, value, descriptorOrdering.getNativePtr(), array);
    }
    
    public TableQuery G(final long[] array, final long[] array2, final float n) {
        this.nativeGreater(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public long G0() {
        this.M0();
        if (this.H.Z()) {
            this.L0();
        }
        return this.nativeRemove(this.I);
    }
    
    public TableQuery H(final long[] array, final long[] array2, final long n) {
        this.nativeGreater(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public Decimal128 H0(final long n) {
        this.M0();
        final long[] nativeSumDecimal128 = this.nativeSumDecimal128(this.I, n);
        if (nativeSumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeSumDecimal128[1], nativeSumDecimal128[0]);
        }
        return null;
    }
    
    public TableQuery I(final long[] array, final long[] array2, final Date date) {
        if (date != null) {
            this.nativeGreaterTimestamp(this.I, array, array2, date.getTime());
            this.J = false;
            return this;
        }
        throw new IllegalArgumentException("Date value in query criteria must not be null.");
    }
    
    public double I0(final long n) {
        this.M0();
        return this.nativeSumDouble(this.I, n);
    }
    
    public TableQuery J(final long[] array, final long[] array2, final Decimal128 decimal128) {
        this.nativeGreaterDecimal128(this.I, array, array2, decimal128.l(), decimal128.k());
        this.J = false;
        return this;
    }
    
    public double J0(final long n) {
        this.M0();
        return this.nativeSumFloat(this.I, n);
    }
    
    public TableQuery K(final long[] array, final long[] array2, final ObjectId objectId) {
        this.nativeGreaterObjectId(this.I, array, array2, objectId.toString());
        this.J = false;
        return this;
    }
    
    public long K0(final long n) {
        this.M0();
        return this.nativeSumInt(this.I, n);
    }
    
    public TableQuery L(final long[] array, final long[] array2, final double n) {
        this.nativeGreaterEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery M(final long[] array, final long[] array2, final float n) {
        this.nativeGreaterEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    void M0() {
        if (!this.J) {
            final String nativeValidateQuery = this.nativeValidateQuery(this.I);
            if (!nativeValidateQuery.equals("")) {
                throw new UnsupportedOperationException(nativeValidateQuery);
            }
            this.J = true;
        }
    }
    
    public TableQuery N(final long[] array, final long[] array2, final long n) {
        this.nativeGreaterEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery O(final long[] array, final long[] array2, final Date date) {
        if (date != null) {
            this.nativeGreaterEqualTimestamp(this.I, array, array2, date.getTime());
            this.J = false;
            return this;
        }
        throw new IllegalArgumentException("Date value in query criteria must not be null.");
    }
    
    public TableQuery P(final long[] array, final long[] array2, final Decimal128 decimal128) {
        this.nativeGreaterEqualDecimal128(this.I, array, array2, decimal128.l(), decimal128.k());
        this.J = false;
        return this;
    }
    
    public TableQuery Q(final long[] array, final long[] array2, final ObjectId objectId) {
        this.nativeGreaterEqualObjectId(this.I, array, array2, objectId.toString());
        this.J = false;
        return this;
    }
    
    public TableQuery R() {
        this.nativeGroup(this.I);
        this.J = false;
        return this;
    }
    
    public TableQuery S(final long[] array, final long[] array2) {
        this.nativeIsEmpty(this.I, array, array2);
        this.J = false;
        return this;
    }
    
    public TableQuery T(final long[] array, final long[] array2) {
        this.nativeIsNotEmpty(this.I, array, array2);
        this.J = false;
        return this;
    }
    
    public TableQuery U(final long[] array, final long[] array2) {
        this.nativeIsNotNull(this.I, array, array2);
        this.J = false;
        return this;
    }
    
    public TableQuery V(final long[] array, final long[] array2) {
        this.nativeIsNull(this.I, array, array2);
        this.J = false;
        return this;
    }
    
    public TableQuery W(final long[] array, final long[] array2, final double n) {
        this.nativeLess(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery X(final long[] array, final long[] array2, final float n) {
        this.nativeLess(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery Y(final long[] array, final long[] array2, final long n) {
        this.nativeLess(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery Z(final long[] array, final long[] array2, final Date date) {
        if (date != null) {
            this.nativeLessTimestamp(this.I, array, array2, date.getTime());
            this.J = false;
            return this;
        }
        throw new IllegalArgumentException("Date value in query criteria must not be null.");
    }
    
    public void a() {
        this.nativeAlwaysFalse(this.I);
    }
    
    public TableQuery a0(final long[] array, final long[] array2, final Decimal128 decimal128) {
        this.nativeLessDecimal128(this.I, array, array2, decimal128.l(), decimal128.k());
        this.J = false;
        return this;
    }
    
    public void b() {
        this.nativeAlwaysTrue(this.I);
    }
    
    public TableQuery b0(final long[] array, final long[] array2, final ObjectId objectId) {
        this.nativeLessObjectId(this.I, array, array2, objectId.toString());
        this.J = false;
        return this;
    }
    
    public Decimal128 c(final long n) {
        this.M0();
        final long[] nativeAverageDecimal128 = this.nativeAverageDecimal128(this.I, n);
        if (nativeAverageDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeAverageDecimal128[1], nativeAverageDecimal128[0]);
        }
        return null;
    }
    
    public TableQuery c0(final long[] array, final long[] array2, final double n) {
        this.nativeLessEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public double d(final long n) {
        this.M0();
        return this.nativeAverageDouble(this.I, n);
    }
    
    public TableQuery d0(final long[] array, final long[] array2, final float n) {
        this.nativeLessEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public double e(final long n) {
        this.M0();
        return this.nativeAverageFloat(this.I, n);
    }
    
    public TableQuery e0(final long[] array, final long[] array2, final long n) {
        this.nativeLessEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public double f(final long n) {
        this.M0();
        return this.nativeAverageInt(this.I, n);
    }
    
    public TableQuery f0(final long[] array, final long[] array2, final Date date) {
        if (date != null) {
            this.nativeLessEqualTimestamp(this.I, array, array2, date.getTime());
            this.J = false;
            return this;
        }
        throw new IllegalArgumentException("Date value in query criteria must not be null.");
    }
    
    public TableQuery g(final long[] array, final long[] array2, final String s) {
        this.nativeBeginsWith(this.I, array, array2, s, true);
        this.J = false;
        return this;
    }
    
    public TableQuery g0(final long[] array, final long[] array2, final Decimal128 decimal128) {
        this.nativeLessEqualDecimal128(this.I, array, array2, decimal128.l(), decimal128.k());
        this.J = false;
        return this;
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return TableQuery.L;
    }
    
    @Override
    public long getNativePtr() {
        return this.I;
    }
    
    public TableQuery h(final long[] array, final long[] array2, final String s, final e e) {
        this.nativeBeginsWith(this.I, array, array2, s, e.b());
        this.J = false;
        return this;
    }
    
    public TableQuery h0(final long[] array, final long[] array2, final ObjectId objectId) {
        this.nativeLessEqualObjectId(this.I, array, array2, objectId.toString());
        this.J = false;
        return this;
    }
    
    public TableQuery i(final long[] array, final double n, final double n2) {
        this.nativeBetween(this.I, array, n, n2);
        this.J = false;
        return this;
    }
    
    public TableQuery i0(final long[] array, final long[] array2, final String s) {
        this.nativeLike(this.I, array, array2, s, true);
        this.J = false;
        return this;
    }
    
    public TableQuery j(final long[] array, final float n, final float n2) {
        this.nativeBetween(this.I, array, n, n2);
        this.J = false;
        return this;
    }
    
    public TableQuery j0(final long[] array, final long[] array2, final String s, final e e) {
        this.nativeLike(this.I, array, array2, s, e.b());
        this.J = false;
        return this;
    }
    
    public TableQuery k(final long[] array, final long n, final long n2) {
        this.nativeBetween(this.I, array, n, n2);
        this.J = false;
        return this;
    }
    
    public Date k0(final long n) {
        this.M0();
        final Long nativeMaximumTimestamp = this.nativeMaximumTimestamp(this.I, n);
        if (nativeMaximumTimestamp != null) {
            return new Date(nativeMaximumTimestamp);
        }
        return null;
    }
    
    public TableQuery l(final long[] array, final Date date, final Date date2) {
        if (date != null && date2 != null) {
            this.nativeBetweenTimestamp(this.I, array, date.getTime(), date2.getTime());
            this.J = false;
            return this;
        }
        throw new IllegalArgumentException("Date values in query criteria must not be null.");
    }
    
    public Decimal128 l0(final long n) {
        this.M0();
        final long[] nativeMaximumDecimal128 = this.nativeMaximumDecimal128(this.I, n);
        if (nativeMaximumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeMaximumDecimal128[1], nativeMaximumDecimal128[0]);
        }
        return null;
    }
    
    public TableQuery m(final long[] array, final Decimal128 decimal128, final Decimal128 decimal129) {
        if (decimal128 != null && decimal129 != null) {
            this.nativeBetweenDecimal128(this.I, array, decimal128.l(), decimal128.k(), decimal129.l(), decimal129.k());
            this.J = false;
            return this;
        }
        throw new IllegalArgumentException("Decimal128 values in query criteria must not be null.");
    }
    
    public Double m0(final long n) {
        this.M0();
        return this.nativeMaximumDouble(this.I, n);
    }
    
    public TableQuery n(final long[] array, final long[] array2, final String s) {
        this.nativeContains(this.I, array, array2, s, true);
        this.J = false;
        return this;
    }
    
    public Float n0(final long n) {
        this.M0();
        return this.nativeMaximumFloat(this.I, n);
    }
    
    public TableQuery o(final long[] array, final long[] array2, final String s, final e e) {
        this.nativeContains(this.I, array, array2, s, e.b());
        this.J = false;
        return this;
    }
    
    public Long o0(final long n) {
        this.M0();
        return this.nativeMaximumInt(this.I, n);
    }
    
    @Deprecated
    public long p() {
        this.M0();
        return this.nativeCount(this.I);
    }
    
    public Date p0(final long n) {
        this.M0();
        final Long nativeMinimumTimestamp = this.nativeMinimumTimestamp(this.I, n);
        if (nativeMinimumTimestamp != null) {
            return new Date(nativeMinimumTimestamp);
        }
        return null;
    }
    
    public TableQuery q() {
        this.nativeEndGroup(this.I);
        this.J = false;
        return this;
    }
    
    public Decimal128 q0(final long n) {
        this.M0();
        final long[] nativeMinimumDecimal128 = this.nativeMinimumDecimal128(this.I, n);
        if (nativeMinimumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeMinimumDecimal128[1], nativeMinimumDecimal128[0]);
        }
        return null;
    }
    
    public TableQuery r(final long[] array, final long[] array2, final String s) {
        this.nativeEndsWith(this.I, array, array2, s, true);
        this.J = false;
        return this;
    }
    
    public Double r0(final long n) {
        this.M0();
        return this.nativeMinimumDouble(this.I, n);
    }
    
    public TableQuery s(final long[] array, final long[] array2, final String s, final e e) {
        this.nativeEndsWith(this.I, array, array2, s, e.b());
        this.J = false;
        return this;
    }
    
    public Float s0(final long n) {
        this.M0();
        return this.nativeMinimumFloat(this.I, n);
    }
    
    public TableQuery t(final long[] array, final long[] array2, final double n) {
        this.nativeEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public Long t0(final long n) {
        this.M0();
        return this.nativeMinimumInt(this.I, n);
    }
    
    public TableQuery u(final long[] array, final long[] array2, final float n) {
        this.nativeEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery u0() {
        this.nativeNot(this.I);
        this.J = false;
        return this;
    }
    
    public TableQuery v(final long[] array, final long[] array2, final long n) {
        this.nativeEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery v0(final long[] array, final long[] array2, final double n) {
        this.nativeNotEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery w(final long[] array, final long[] array2, final String s) {
        this.nativeEqual(this.I, array, array2, s, true);
        this.J = false;
        return this;
    }
    
    public TableQuery w0(final long[] array, final long[] array2, final float n) {
        this.nativeNotEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery x(final long[] array, final long[] array2, @h final String s, final e e) {
        this.nativeEqual(this.I, array, array2, s, e.b());
        this.J = false;
        return this;
    }
    
    public TableQuery x0(final long[] array, final long[] array2, final long n) {
        this.nativeNotEqual(this.I, array, array2, n);
        this.J = false;
        return this;
    }
    
    public TableQuery y(final long[] array, final long[] array2, @h final Date date) {
        if (date == null) {
            this.nativeIsNull(this.I, array, array2);
        }
        else {
            this.nativeEqualTimestamp(this.I, array, array2, date.getTime());
        }
        this.J = false;
        return this;
    }
    
    public TableQuery y0(final long[] array, final long[] array2, @h final String s) {
        this.nativeNotEqual(this.I, array, array2, s, true);
        this.J = false;
        return this;
    }
    
    public TableQuery z(final long[] array, final long[] array2, final Decimal128 decimal128) {
        this.nativeEqualDecimal128(this.I, array, array2, decimal128.l(), decimal128.k());
        this.J = false;
        return this;
    }
    
    public TableQuery z0(final long[] array, final long[] array2, @h final String s, final e e) {
        this.nativeNotEqual(this.I, array, array2, s, e.b());
        this.J = false;
        return this;
    }
}
