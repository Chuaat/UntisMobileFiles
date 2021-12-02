// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.bson.types.ObjectId;
import io.realm.n0;
import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.i0;
import io.realm.z;
import c6.h;
import io.realm.internal.core.QueryDescriptor;
import io.realm.internal.core.DescriptorOrdering;
import io.realm.q;
import java.util.Set;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import io.realm.l0;

public class OsResults implements k, ObservableCollection
{
    private static final String N = "This Realm instance has already been closed, making it unusable.";
    private static final long O;
    public static final byte P = 1;
    public static final byte Q = 2;
    public static final byte R = 3;
    public static final byte S = 4;
    public static final byte T = 0;
    public static final byte U = 1;
    public static final byte V = 2;
    public static final byte W = 3;
    public static final byte X = 4;
    public static final byte Y = 5;
    private final long G;
    private final OsSharedRealm H;
    private final j I;
    private final Table J;
    protected boolean K;
    private boolean L;
    protected final m<b> M;
    
    static {
        O = nativeGetFinalizerPtr();
    }
    
    OsResults(final OsSharedRealm h, final Table j, final long g) {
        boolean k = false;
        this.L = false;
        this.M = new m<b>();
        this.H = h;
        final j context = h.context;
        this.I = context;
        this.J = j;
        this.G = g;
        context.a(this);
        if (this.t() != r.J) {
            k = true;
        }
        this.K = k;
    }
    
    private <T> void e(final String s, final l0<T> l0, final n<T> n) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(this.u(), Collections.EMPTY_SET);
        n.a(osObjectBuilder, l0);
        try {
            nativeSetList(this.G, s, osObjectBuilder.g0());
        }
        finally {
            osObjectBuilder.close();
        }
    }
    
    public static OsResults j(final OsSharedRealm osSharedRealm, final UncheckedRow uncheckedRow, final Table table, final String s) {
        return new OsResults(osSharedRealm, table, nativeCreateResultsFromBacklinks(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr(), table.getNativePtr(), table.C(s)));
    }
    
    public static OsResults k(final OsSharedRealm osSharedRealm, final TableQuery tableQuery) {
        return l(osSharedRealm, tableQuery, new DescriptorOrdering());
    }
    
    public static OsResults l(final OsSharedRealm osSharedRealm, final TableQuery tableQuery, final DescriptorOrdering descriptorOrdering) {
        tableQuery.M0();
        return new OsResults(osSharedRealm, tableQuery.E(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr(), descriptorOrdering.getNativePtr()));
    }
    
    private static native Object nativeAggregate(final long p0, final long p1, final byte p2);
    
    private static native void nativeClear(final long p0);
    
    private static native boolean nativeContains(final long p0, final long p1);
    
    protected static native long nativeCreateResults(final long p0, final long p1, final long p2);
    
    private static native long nativeCreateResultsFromBacklinks(final long p0, final long p1, final long p2, final long p3);
    
    private static native long nativeCreateSnapshot(final long p0);
    
    private static native void nativeDelete(final long p0, final long p1);
    
    private static native boolean nativeDeleteFirst(final long p0);
    
    private static native boolean nativeDeleteLast(final long p0);
    
    private static native long nativeDistinct(final long p0, final QueryDescriptor p1);
    
    private static native void nativeEvaluateQueryIfNeeded(final long p0, final boolean p1);
    
    private static native long nativeFirstRow(final long p0);
    
    private static native long nativeFreeze(final long p0, final long p1);
    
    private static native long nativeGetFinalizerPtr();
    
    private static native byte nativeGetMode(final long p0);
    
    private static native long nativeGetRow(final long p0, final int p1);
    
    private static native long nativeIndexOf(final long p0, final long p1);
    
    private static native boolean nativeIsValid(final long p0);
    
    private static native long nativeLastRow(final long p0);
    
    private static native void nativeSetBinary(final long p0, final String p1, @h final byte[] p2);
    
    private static native void nativeSetBoolean(final long p0, final String p1, final boolean p2);
    
    private static native void nativeSetDecimal128(final long p0, final String p1, final long p2, final long p3);
    
    private static native void nativeSetDouble(final long p0, final String p1, final double p2);
    
    private static native void nativeSetFloat(final long p0, final String p1, final float p2);
    
    private static native void nativeSetInt(final long p0, final String p1, final long p2);
    
    private static native void nativeSetList(final long p0, final String p1, final long p2);
    
    private static native void nativeSetNull(final long p0, final String p1);
    
    private static native void nativeSetObject(final long p0, final String p1, final long p2);
    
    private static native void nativeSetObjectId(final long p0, final String p1, final String p2);
    
    private static native void nativeSetString(final long p0, final String p1, @h final String p2);
    
    private static native void nativeSetTimestamp(final long p0, final String p1, final long p2);
    
    private static native long nativeSize(final long p0);
    
    private static native long nativeSort(final long p0, final QueryDescriptor p1);
    
    private native void nativeStartListening(final long p0);
    
    private native void nativeStopListening(final long p0);
    
    private static native long nativeWhere(final long p0);
    
    private static native String toJSON(final long p0, final int p1);
    
    public void A() {
        if (this.K) {
            return;
        }
        nativeEvaluateQueryIfNeeded(this.G, false);
        this.notifyChangeListeners(0L);
    }
    
    public void B() {
        this.M.b();
        this.nativeStopListening(this.G);
    }
    
    public <T> void C(final T t, final z<T> z) {
        this.M.e(t, z);
        if (this.M.d()) {
            this.nativeStopListening(this.G);
        }
    }
    
    public <T> void D(final T t, final i0<T> i0) {
        this.C(t, new c<T>(i0));
    }
    
    public void E(final String s, @h final byte[] array) {
        nativeSetBinary(this.G, s, array);
    }
    
    public void F(final String s, final boolean b) {
        nativeSetBoolean(this.G, s, b);
    }
    
    public void G(final String s, final l0<Boolean> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Boolean>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Boolean> l0) {
                osObjectBuilder.o(0L, l0);
            }
        });
    }
    
    public void H(final String s, final l0<byte[]> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<byte[]>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<byte[]> l0) {
                osObjectBuilder.r(0L, l0);
            }
        });
    }
    
    public void I(final String s, final l0<Byte> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Byte>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Byte> l0) {
                osObjectBuilder.s(0L, l0);
            }
        });
    }
    
    public void J(final String s, @h final Date date) {
        final long g = this.G;
        if (date == null) {
            nativeSetNull(g, s);
        }
        else {
            nativeSetTimestamp(g, s, date.getTime());
        }
    }
    
    public void K(final String s, final l0<Date> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Date>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Date> l0) {
                osObjectBuilder.w(0L, l0);
            }
        });
    }
    
    public void L(final String s, @h final Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.G, s);
        }
        else {
            nativeSetDecimal128(this.G, s, decimal128.l(), decimal128.k());
        }
    }
    
    public void M(final String s, final l0<Decimal128> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Decimal128>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Decimal128> l0) {
                osObjectBuilder.y(0L, l0);
            }
        });
    }
    
    public void N(final String s, final double n) {
        nativeSetDouble(this.G, s, n);
    }
    
    public void O(final String s, final l0<Double> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Double>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Double> l0) {
                osObjectBuilder.D(0L, l0);
            }
        });
    }
    
    public void P(final String s, final float n) {
        nativeSetFloat(this.G, s, n);
    }
    
    public void Q(final String s, final l0<Float> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Float>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Float> l0) {
                osObjectBuilder.H(0L, l0);
            }
        });
    }
    
    public void R(final String s, final long n) {
        nativeSetInt(this.G, s, n);
    }
    
    public void S(final String s, final l0<Integer> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Integer>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Integer> l0) {
                osObjectBuilder.N(0L, l0);
            }
        });
    }
    
    public void T(final String s, final l0<Long> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Long>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Long> l0) {
                osObjectBuilder.R(0L, l0);
            }
        });
    }
    
    public void U(final String s, final l0<n0> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<n0>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<n0> l0) {
                osObjectBuilder.Z(0L, l0);
            }
        });
    }
    
    public void V(final String s) {
        nativeSetNull(this.G, s);
    }
    
    public void W(final String s, @h final io.realm.internal.r r) {
        if (r == null) {
            this.V(s);
        }
        else {
            UncheckedRow uncheckedRow;
            if (r instanceof UncheckedRow) {
                uncheckedRow = (UncheckedRow)r;
            }
            else {
                if (!(r instanceof CheckedRow)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported Row type: ");
                    sb.append(r.getClass().getCanonicalName());
                    throw new UnsupportedOperationException(sb.toString());
                }
                uncheckedRow = (CheckedRow)r;
            }
            nativeSetObject(this.G, s, uncheckedRow.getNativePtr());
        }
    }
    
    public void X(final String s, @h final ObjectId objectId) {
        final long g = this.G;
        if (objectId == null) {
            nativeSetNull(g, s);
        }
        else {
            nativeSetObjectId(g, s, objectId.toString());
        }
    }
    
    public void Y(final String s, final l0<ObjectId> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<ObjectId>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<ObjectId> l0) {
                osObjectBuilder.Y(0L, l0);
            }
        });
    }
    
    public void Z(final String s, final l0<Short> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<Short>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<Short> l0) {
                osObjectBuilder.a0(0L, l0);
            }
        });
    }
    
    public void a0(final String s, @h final String s2) {
        nativeSetString(this.G, s, s2);
    }
    
    public void b0(final String s, final l0<String> l0) {
        this.e(s, (l0<Object>)l0, (n<Object>)new n<String>() {
            @Override
            public void a(final OsObjectBuilder osObjectBuilder, final l0<String> l0) {
                osObjectBuilder.e0(0L, l0);
            }
        });
    }
    
    public <T> void c(final T t, final z<T> z) {
        if (this.M.d()) {
            this.nativeStartListening(this.G);
        }
        this.M.a(new b((T)t, z));
    }
    
    public long c0() {
        return nativeSize(this.G);
    }
    
    public <T> void d(final T t, final i0<T> i0) {
        this.c(t, new c<T>(i0));
    }
    
    public OsResults d0(final QueryDescriptor queryDescriptor) {
        return new OsResults(this.H, this.J, nativeSort(this.G, queryDescriptor));
    }
    
    public String e0(final int n) {
        return toJSON(this.G, n);
    }
    
    public Date f(final o o, final long n) {
        return (Date)nativeAggregate(this.G, n, o.b());
    }
    
    public TableQuery f0() {
        return new TableQuery(this.I, this.J, nativeWhere(this.G));
    }
    
    public Number g(final o o, final long n) {
        return (Number)nativeAggregate(this.G, n, o.b());
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsResults.O;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
    
    public void h() {
        nativeClear(this.G);
    }
    
    public boolean i(final UncheckedRow uncheckedRow) {
        return nativeContains(this.G, uncheckedRow.getNativePtr());
    }
    
    public OsResults m() {
        if (this.L) {
            return this;
        }
        final OsResults osResults = new OsResults(this.H, this.J, nativeCreateSnapshot(this.G));
        osResults.L = true;
        return osResults;
    }
    
    public void n(final long n) {
        nativeDelete(this.G, n);
    }
    
    @Override
    public void notifyChangeListeners(final long n) {
        OsCollectionChangeSet set;
        if (n == 0L) {
            set = new d();
        }
        else {
            set = new OsCollectionChangeSet(n, this.x() ^ true);
        }
        if (set.h() && this.x()) {
            return;
        }
        this.K = true;
        this.M.c((m.a<b>)new a(set));
    }
    
    public boolean o() {
        return nativeDeleteFirst(this.G);
    }
    
    public boolean p() {
        return nativeDeleteLast(this.G);
    }
    
    public OsResults q(final QueryDescriptor queryDescriptor) {
        return new OsResults(this.H, this.J, nativeDistinct(this.G, queryDescriptor));
    }
    
    public UncheckedRow r() {
        final long nativeFirstRow = nativeFirstRow(this.G);
        if (nativeFirstRow != 0L) {
            return this.J.S(nativeFirstRow);
        }
        return null;
    }
    
    public OsResults s(final OsSharedRealm osSharedRealm) {
        final OsResults osResults = new OsResults(osSharedRealm, this.J.v(osSharedRealm), nativeFreeze(this.G, osSharedRealm.getNativePtr()));
        if (this.x()) {
            osResults.A();
        }
        return osResults;
    }
    
    public r t() {
        return r.b(nativeGetMode(this.G));
    }
    
    public Table u() {
        return this.J;
    }
    
    public UncheckedRow v(final int n) {
        return this.J.S(nativeGetRow(this.G, n));
    }
    
    public int w(final UncheckedRow uncheckedRow) {
        final long nativeIndex = nativeIndexOf(this.G, uncheckedRow.getNativePtr());
        int n;
        if (nativeIndex > 2147483647L) {
            n = Integer.MAX_VALUE;
        }
        else {
            n = (int)nativeIndex;
        }
        return n;
    }
    
    public boolean x() {
        return this.K;
    }
    
    public boolean y() {
        return nativeIsValid(this.G);
    }
    
    public UncheckedRow z() {
        final long nativeLastRow = nativeLastRow(this.G);
        if (nativeLastRow != 0L) {
            return this.J.S(nativeLastRow);
        }
        return null;
    }
    
    private interface n<T>
    {
        void a(final OsObjectBuilder p0, final l0<T> p1);
    }
    
    public enum o
    {
        H((byte)1), 
        I((byte)2), 
        J((byte)3), 
        K((byte)4);
        
        private final byte G;
        
        private o(final byte b) {
            this.G = b;
        }
        
        public byte b() {
            return this.G;
        }
    }
    
    public abstract static class p<T> implements Iterator<T>
    {
        OsResults G;
        protected int H;
        
        public p(final OsResults g) {
            this.H = -1;
            if (g.H.isClosed()) {
                throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
            }
            this.G = g;
            if (g.L) {
                return;
            }
            if (g.H.isInTransaction()) {
                this.c();
            }
            else {
                this.G.H.addIterator(this);
            }
        }
        
        void a() {
            if (this.G != null) {
                return;
            }
            throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
        }
        
        protected abstract T b(final UncheckedRow p0);
        
        void c() {
            this.G = this.G.m();
        }
        
        @h
        T d(final int n) {
            return this.b(this.G.v(n));
        }
        
        void e() {
            this.G = null;
        }
        
        @Override
        public boolean hasNext() {
            this.a();
            final int h = this.H;
            boolean b = true;
            if (h + 1 >= this.G.c0()) {
                b = false;
            }
            return b;
        }
        
        @h
        @Override
        public T next() {
            this.a();
            final int h = this.H + 1;
            this.H = h;
            if (h < this.G.c0()) {
                return this.d(this.H);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot access index ");
            sb.append(this.H);
            sb.append(" when size is ");
            sb.append(this.G.c0());
            sb.append(". Remember to check hasNext() before using next().");
            throw new NoSuchElementException(sb.toString());
        }
        
        @Deprecated
        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }
    
    public abstract static class q<T> extends p<T> implements ListIterator<T>
    {
        public q(final OsResults osResults, final int i) {
            super(osResults);
            if (i >= 0 && i <= super.G.c0()) {
                super.H = i - 1;
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Starting location must be a valid index: [0, ");
            sb.append(super.G.c0() - 1L);
            sb.append("]. Yours was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        
        @Deprecated
        @Override
        public void add(@h final T t) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }
        
        @Override
        public boolean hasPrevious() {
            this.a();
            return super.H >= 0;
        }
        
        @Override
        public int nextIndex() {
            this.a();
            return super.H + 1;
        }
        
        @h
        @Override
        public T previous() {
            this.a();
            try {
                final T d = this.d(super.H);
                --super.H;
                return d;
            }
            catch (IndexOutOfBoundsException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot access index less than zero. This was ");
                sb.append(super.H);
                sb.append(". Remember to check hasPrevious() before using previous().");
                throw new NoSuchElementException(sb.toString());
            }
        }
        
        @Override
        public int previousIndex() {
            this.a();
            return super.H;
        }
        
        @Deprecated
        @Override
        public void set(@h final T t) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }
    
    public enum r
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L;
        
        static r b(final byte i) {
            if (i == 0) {
                return r.G;
            }
            if (i == 1) {
                return r.H;
            }
            if (i == 2) {
                return r.I;
            }
            if (i == 3) {
                return r.J;
            }
            if (i == 4) {
                return r.K;
            }
            if (i == 5) {
                return r.L;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid value: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
