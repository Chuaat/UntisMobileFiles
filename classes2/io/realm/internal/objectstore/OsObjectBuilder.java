// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.objectstore;

import io.realm.l0;
import c6.h;
import java.util.List;
import io.realm.internal.OsSharedRealm;
import io.realm.q;
import java.util.Set;
import io.realm.internal.p;
import io.realm.internal.UncheckedRow;
import io.realm.internal.j;
import io.realm.internal.Table;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import io.realm.t;
import java.util.Date;
import io.realm.n0;
import java.io.Closeable;

public class OsObjectBuilder implements Closeable
{
    private static o<? extends n0> M;
    private static o<String> N;
    private static o<Byte> O;
    private static o<Short> P;
    private static o<Integer> Q;
    private static o<Long> R;
    private static o<Boolean> S;
    private static o<Float> T;
    private static o<Double> U;
    private static o<Date> V;
    private static o<byte[]> W;
    private static o<t> X;
    private static o<Decimal128> Y;
    private static o<ObjectId> Z;
    private final Table G;
    private final long H;
    private final long I;
    private final long J;
    private final j K;
    private final boolean L;
    
    static {
        OsObjectBuilder.M = (o<? extends n0>)new o<n0>() {
            public void b(final long n, final n0 n2) {
                nativeAddIntegerListItem(n, ((UncheckedRow)((p)n2).S6().g()).getNativePtr());
            }
        };
        OsObjectBuilder.N = (o<String>)new o<String>() {
            public void b(final long n, final String s) {
                nativeAddStringListItem(n, s);
            }
        };
        OsObjectBuilder.O = (o<Byte>)new o<Byte>() {
            public void b(final long n, final Byte b) {
                nativeAddIntegerListItem(n, b);
            }
        };
        OsObjectBuilder.P = (o<Short>)new o<Short>() {
            public void b(final long n, final Short n2) {
                nativeAddIntegerListItem(n, n2);
            }
        };
        OsObjectBuilder.Q = (o<Integer>)new o<Integer>() {
            public void b(final long n, final Integer n2) {
                nativeAddIntegerListItem(n, n2);
            }
        };
        OsObjectBuilder.R = (o<Long>)new o<Long>() {
            public void b(final long n, final Long n2) {
                nativeAddIntegerListItem(n, n2);
            }
        };
        OsObjectBuilder.S = (o<Boolean>)new o<Boolean>() {
            public void b(final long n, final Boolean b) {
                nativeAddBooleanListItem(n, b);
            }
        };
        OsObjectBuilder.T = (o<Float>)new o<Float>() {
            public void b(final long n, final Float n2) {
                nativeAddFloatListItem(n, n2);
            }
        };
        OsObjectBuilder.U = (o<Double>)new o<Double>() {
            public void b(final long n, final Double n2) {
                nativeAddDoubleListItem(n, n2);
            }
        };
        OsObjectBuilder.V = (o<Date>)new o<Date>() {
            public void b(final long n, final Date date) {
                nativeAddDateListItem(n, date.getTime());
            }
        };
        OsObjectBuilder.W = (o<byte[]>)new o<byte[]>() {
            public void b(final long n, final byte[] array) {
                nativeAddByteArrayListItem(n, array);
            }
        };
        OsObjectBuilder.X = (o<t>)new o<t>() {
            public void b(final long n, final t t) {
                final Long f = t.f();
                if (f == null) {
                    nativeAddNullListItem(n);
                }
                else {
                    nativeAddIntegerListItem(n, f);
                }
            }
        };
        OsObjectBuilder.Y = (o<Decimal128>)new o<Decimal128>() {
            public void b(final long n, final Decimal128 decimal128) {
                nativeAddDecimal128ListItem(n, decimal128.l(), decimal128.k());
            }
        };
        OsObjectBuilder.Z = (o<ObjectId>)new o<ObjectId>() {
            public void b(final long n, final ObjectId objectId) {
                nativeAddObjectIdListItem(n, objectId.toString());
            }
        };
    }
    
    public OsObjectBuilder(final Table g, final Set<q> set) {
        final OsSharedRealm n = g.N();
        this.H = n.getNativePtr();
        (this.G = g).E();
        this.J = g.getNativePtr();
        this.I = nativeCreateBuilder();
        this.K = n.context;
        this.L = set.contains(q.G);
    }
    
    private void F(final long n) {
        nativeStopList(this.I, n, nativeStartList(0L));
    }
    
    private <T> void Q(final long n, final long n2, @h final List<T> list, final o<T> o) {
        if (list != null) {
            final long nativeStartList = nativeStartList(list.size());
            int i = 0;
            final boolean b = n2 == 0L || this.G.W(n2);
            while (i < list.size()) {
                final T value = list.get(i);
                if (value == null) {
                    if (!b) {
                        throw new IllegalArgumentException("This 'RealmList' is not nullable. A non-null value is expected.");
                    }
                    nativeAddNullListItem(nativeStartList);
                }
                else {
                    o.a(nativeStartList, value);
                }
                ++i;
            }
            nativeStopList(n, n2, nativeStartList);
        }
        else {
            this.F(n2);
        }
    }
    
    private static native void nativeAddBoolean(final long p0, final long p1, final boolean p2);
    
    private static native void nativeAddBooleanListItem(final long p0, final boolean p1);
    
    private static native void nativeAddByteArray(final long p0, final long p1, final byte[] p2);
    
    private static native void nativeAddByteArrayListItem(final long p0, final byte[] p1);
    
    private static native void nativeAddDate(final long p0, final long p1, final long p2);
    
    private static native void nativeAddDateListItem(final long p0, final long p1);
    
    private static native void nativeAddDecimal128(final long p0, final long p1, final long p2, final long p3);
    
    private static native void nativeAddDecimal128ListItem(final long p0, final long p1, final long p2);
    
    private static native void nativeAddDouble(final long p0, final long p1, final double p2);
    
    private static native void nativeAddDoubleListItem(final long p0, final double p1);
    
    private static native void nativeAddFloat(final long p0, final long p1, final float p2);
    
    private static native void nativeAddFloatListItem(final long p0, final float p1);
    
    private static native void nativeAddInteger(final long p0, final long p1, final long p2);
    
    private static native void nativeAddIntegerListItem(final long p0, final long p1);
    
    private static native void nativeAddNull(final long p0, final long p1);
    
    private static native void nativeAddNullListItem(final long p0);
    
    private static native void nativeAddObject(final long p0, final long p1, final long p2);
    
    private static native void nativeAddObjectId(final long p0, final long p1, final String p2);
    
    private static native void nativeAddObjectIdListItem(final long p0, final String p1);
    
    private static native void nativeAddObjectList(final long p0, final long p1, final long[] p2);
    
    private static native void nativeAddObjectListItem(final long p0, final long p1);
    
    private static native void nativeAddString(final long p0, final long p1, final String p2);
    
    private static native void nativeAddStringListItem(final long p0, final String p1);
    
    private static native long nativeCreateBuilder();
    
    private static native long nativeCreateOrUpdateTopLevelObject(final long p0, final long p1, final long p2, final boolean p3, final boolean p4);
    
    private static native void nativeDestroyBuilder(final long p0);
    
    private static native long nativeStartList(final long p0);
    
    private static native void nativeStopList(final long p0, final long p1, final long p2);
    
    private static native long nativeUpdateEmbeddedObject(final long p0, final long p1, final long p2, final long p3, final boolean p4);
    
    public void C(final long n, @h final Double n2) {
        if (n2 == null) {
            nativeAddNull(this.I, n);
        }
        else {
            nativeAddDouble(this.I, n, n2);
        }
    }
    
    public void D(final long n, final l0<Double> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.U);
    }
    
    public void G(final long n, @h final Float n2) {
        final long i = this.I;
        if (n2 == null) {
            nativeAddNull(i, n);
        }
        else {
            nativeAddFloat(i, n, n2);
        }
    }
    
    public void H(final long n, final l0<Float> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.T);
    }
    
    public void J(final long n, @h final Byte b) {
        if (b == null) {
            nativeAddNull(this.I, n);
        }
        else {
            nativeAddInteger(this.I, n, b);
        }
    }
    
    public void K(final long n, @h final Integer n2) {
        if (n2 == null) {
            nativeAddNull(this.I, n);
        }
        else {
            nativeAddInteger(this.I, n, n2);
        }
    }
    
    public void L(final long n, @h final Long n2) {
        if (n2 == null) {
            nativeAddNull(this.I, n);
        }
        else {
            nativeAddInteger(this.I, n, n2);
        }
    }
    
    public void M(final long n, @h final Short n2) {
        if (n2 == null) {
            nativeAddNull(this.I, n);
        }
        else {
            nativeAddInteger(this.I, n, n2);
        }
    }
    
    public void N(final long n, final l0<Integer> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.Q);
    }
    
    public void R(final long n, final l0<Long> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.R);
    }
    
    public void S(final long n, @h final t t) {
        if (t != null && t.f() != null) {
            nativeAddInteger(this.I, n, t.f());
        }
        else {
            nativeAddNull(this.I, n);
        }
    }
    
    public void T(final long n, final l0<t> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.X);
    }
    
    public void V(final long n) {
        nativeAddNull(this.I, n);
    }
    
    public void W(final long n, @h final n0 n2) {
        if (n2 == null) {
            nativeAddNull(this.I, n);
        }
        else {
            nativeAddObject(this.I, n, ((UncheckedRow)((p)n2).S6().g()).getNativePtr());
        }
    }
    
    public void X(final long n, @h final ObjectId objectId) {
        final long i = this.I;
        if (objectId == null) {
            nativeAddNull(i, n);
        }
        else {
            nativeAddObjectId(i, n, objectId.toString());
        }
    }
    
    public void Y(final long n, final l0<ObjectId> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.Z);
    }
    
    public <T extends n0> void Z(final long n, @h final l0<T> l0) {
        int i = 0;
        if (l0 != null) {
            final long[] array = new long[l0.size()];
            while (i < l0.size()) {
                final p p2 = (p)l0.get(i);
                if (p2 == null) {
                    throw new IllegalArgumentException("Null values are not allowed in RealmLists containing Realm models");
                }
                array[i] = ((UncheckedRow)p2.S6().g()).getNativePtr();
                ++i;
            }
            nativeAddObjectList(this.I, n, array);
        }
        else {
            nativeAddObjectList(this.I, n, new long[0]);
        }
    }
    
    public void a0(final long n, final l0<Short> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.P);
    }
    
    @Override
    public void close() {
        nativeDestroyBuilder(this.I);
    }
    
    public void d0(final long n, @h final String s) {
        final long i = this.I;
        if (s == null) {
            nativeAddNull(i, n);
        }
        else {
            nativeAddString(i, n, s);
        }
    }
    
    public void e0(final long n, final l0<String> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.N);
    }
    
    public UncheckedRow f0() {
        try {
            return new UncheckedRow(this.K, this.G, nativeCreateOrUpdateTopLevelObject(this.H, this.J, this.I, false, false));
        }
        finally {
            this.close();
        }
    }
    
    public long g0() {
        return this.I;
    }
    
    public void h0(final p p) {
        try {
            nativeUpdateEmbeddedObject(this.H, this.J, this.I, p.S6().g().l0(), this.L);
        }
        finally {
            this.close();
        }
    }
    
    public void i0() {
        try {
            nativeCreateOrUpdateTopLevelObject(this.H, this.J, this.I, true, this.L);
        }
        finally {
            this.close();
        }
    }
    
    public void n(final long n, @h final Boolean b) {
        final long i = this.I;
        if (b == null) {
            nativeAddNull(i, n);
        }
        else {
            nativeAddBoolean(i, n, b);
        }
    }
    
    public void o(final long n, final l0<Boolean> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.S);
    }
    
    public void q(final long n, @h final byte[] array) {
        final long i = this.I;
        if (array == null) {
            nativeAddNull(i, n);
        }
        else {
            nativeAddByteArray(i, n, array);
        }
    }
    
    public void r(final long n, final l0<byte[]> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.W);
    }
    
    public void s(final long n, final l0<Byte> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.O);
    }
    
    public void t(final long n, @h final Date date) {
        if (date == null) {
            nativeAddNull(this.I, n);
        }
        else {
            nativeAddDate(this.I, n, date.getTime());
        }
    }
    
    public void w(final long n, final l0<Date> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.V);
    }
    
    public void x(final long n, @h final Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeAddNull(this.I, n);
        }
        else {
            nativeAddDecimal128(this.I, n, decimal128.l(), decimal128.k());
        }
    }
    
    public void y(final long n, final l0<Decimal128> l0) {
        this.Q(this.I, n, l0, OsObjectBuilder.Y);
    }
    
    private interface o<T>
    {
        void a(final long p0, final T p1);
    }
}
