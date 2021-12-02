// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.response;

import android.os.Parcelable;
import androidx.annotation.RecentlyNullable;
import java.util.List;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;
import java.io.Serializable;
import android.os.Bundle;
import h2.b;
import android.util.SparseArray;
import com.google.android.gms.common.util.r;
import com.google.android.gms.common.util.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import f2.a;
import com.google.android.gms.common.util.d0;

@d0
@a
@h2.d.a(creator = "SafeParcelResponseCreator")
public class d extends c
{
    @RecentlyNonNull
    @a
    public static final Parcelable$Creator<d> CREATOR;
    @g(getter = "getVersionCode", id = 1)
    private final int G;
    @h2.d.c(getter = "getParcel", id = 2)
    private final Parcel H;
    private final int I;
    @h2.d.c(getter = "getFieldMappingDictionary", id = 3)
    private final p J;
    @k0
    private final String K;
    private int L;
    private int M;
    
    static {
        CREATOR = (Parcelable$Creator)new t();
    }
    
    @h2.d.b
    d(@e(id = 1) final int g, @e(id = 2) final Parcel parcel, @e(id = 3) final p j) {
        this.G = g;
        this.H = x.k(parcel);
        this.I = 2;
        this.J = j;
        String n2;
        if (j == null) {
            n2 = null;
        }
        else {
            n2 = j.N2();
        }
        this.K = n2;
        this.L = 2;
    }
    
    public d(final p p2, final String s) {
        this.G = 1;
        this.H = Parcel.obtain();
        this.I = 0;
        this.J = x.k(p2);
        this.K = x.k(s);
        this.L = 0;
    }
    
    private d(final h2.d d, final p p3, final String s) {
        this.G = 1;
        ((Parcelable)d).writeToParcel(this.H = Parcel.obtain(), 0);
        this.I = 1;
        this.J = x.k(p3);
        this.K = x.k(s);
        this.L = 2;
    }
    
    private static void G(final StringBuilder sb, final a<?, ?> a, final Object o) {
        if (a.I) {
            final ArrayList list = (ArrayList)o;
            sb.append("[");
            for (int size = list.size(), i = 0; i < size; ++i) {
                if (i != 0) {
                    sb.append(",");
                }
                a0(sb, a.H, list.get(i));
            }
            sb.append("]");
            return;
        }
        a0(sb, a.H, o);
    }
    
    @RecentlyNonNull
    @a
    public static <T extends a> d W(@RecentlyNonNull final T t) {
        final String s = x.k(t.getClass().getCanonicalName());
        final p p = new p(t.getClass());
        Z(p, (a)t);
        p.j2();
        p.g1();
        return new d((h2.d)t, p, s);
    }
    
    private final Parcel X() {
        final int l = this.L;
        if (l != 0) {
            if (l != 1) {
                return this.H;
            }
        }
        else {
            this.M = h2.c.a(this.H);
        }
        h2.c.b(this.H, this.M);
        this.L = 2;
        return this.H;
    }
    
    private final void Y(final a<?, ?> a) {
        if (a.M == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        final Parcel h = this.H;
        if (h == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        final int l = this.L;
        if (l == 0) {
            this.M = h2.c.a(h);
            this.L = 1;
            return;
        }
        if (l == 1) {
            return;
        }
        if (l != 2) {
            throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
        }
        throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
    }
    
    private static void Z(final p p, a a) {
        final Class<? extends a> class1 = a.getClass();
        if (!p.Q1(class1)) {
            final Map<String, a<?, ?>> c = a.c();
            p.q1(class1, c);
            final Iterator<String> iterator = c.keySet().iterator();
            while (iterator.hasNext()) {
                a = (a)c.get(iterator.next());
                final Class<? extends a> n = ((a)a).N;
                if (n != null) {
                    try {
                        Z(p, (a)n.newInstance());
                        continue;
                    }
                    catch (IllegalAccessException cause) {
                        final String value = String.valueOf(x.k(((a)a).N).getCanonicalName());
                        String concat;
                        if (value.length() != 0) {
                            concat = "Could not access object of type ".concat(value);
                        }
                        else {
                            concat = new String("Could not access object of type ");
                        }
                        throw new IllegalStateException(concat, cause);
                    }
                    catch (InstantiationException cause2) {
                        final String value2 = String.valueOf(x.k(((a)a).N).getCanonicalName());
                        String concat2;
                        if (value2.length() != 0) {
                            concat2 = "Could not instantiate an object of type ".concat(value2);
                        }
                        else {
                            concat2 = new String("Could not instantiate an object of type ");
                        }
                        throw new IllegalStateException(concat2, cause2);
                    }
                    break;
                }
            }
        }
    }
    
    private static void a0(StringBuilder sb, final int i, @k0 final Object obj) {
        switch (i) {
            default: {
                sb = new StringBuilder(26);
                sb.append("Unknown type = ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
            case 10: {
                s.a(sb, x.k(obj));
            }
            case 9: {
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.c.e((byte[])obj));
                sb.append("\"");
            }
            case 8: {
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.c.d((byte[])obj));
                sb.append("\"");
            }
            case 7: {
                sb.append("\"");
                sb.append(r.b(x.k(obj).toString()));
                sb.append("\"");
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                sb.append(obj);
            }
        }
    }
    
    private final void b0(final StringBuilder sb, final Map<String, a<?, ?>> map, final Parcel parcel) {
        final SparseArray sparseArray = new SparseArray();
        for (final Map.Entry<String, a<?, ?>> entry : map.entrySet()) {
            sparseArray.put(((a)entry.getValue()).U4(), (Object)entry);
        }
        sb.append('{');
        final int h0 = b.h0(parcel);
        int n = 0;
        while (parcel.dataPosition() < h0) {
            final int x = b.X(parcel);
            final Map.Entry entry2 = (Map.Entry)sparseArray.get(b.O(x));
            if (entry2 != null) {
                if (n != 0) {
                    sb.append(",");
                }
                final String str = entry2.getKey();
                final a<Object, Object> a = entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                Label_1210: {
                    if (a.T5()) {
                        Object o = null;
                        Label_0500: {
                            Serializable s = null;
                            switch (a.J) {
                                default: {
                                    final int j = a.J;
                                    final StringBuilder sb2 = new StringBuilder(36);
                                    sb2.append("Unknown field out type = ");
                                    sb2.append(j);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                                case 11: {
                                    throw new IllegalArgumentException("Method does not accept concrete type.");
                                }
                                case 10: {
                                    final Bundle g = b.g(parcel, x);
                                    final HashMap<String, String> hashMap = new HashMap<String, String>();
                                    for (final String key : g.keySet()) {
                                        hashMap.put(key, com.google.android.gms.common.internal.x.k(g.getString(key)));
                                    }
                                    o = com.google.android.gms.common.server.response.a.o(a, hashMap);
                                    break Label_0500;
                                }
                                case 8:
                                case 9: {
                                    o = com.google.android.gms.common.server.response.a.o(a, b.h(parcel, x));
                                    break Label_0500;
                                }
                                case 7: {
                                    s = b.G(parcel, x);
                                    break;
                                }
                                case 6: {
                                    s = b.P(parcel, x);
                                    break;
                                }
                                case 5: {
                                    s = b.a(parcel, x);
                                    break;
                                }
                                case 4: {
                                    s = b.T(parcel, x);
                                    break;
                                }
                                case 3: {
                                    s = b.V(parcel, x);
                                    break;
                                }
                                case 2: {
                                    s = b.c0(parcel, x);
                                    break;
                                }
                                case 1: {
                                    s = b.c(parcel, x);
                                    break;
                                }
                                case 0: {
                                    s = b.Z(parcel, x);
                                    break;
                                }
                            }
                            o = com.google.android.gms.common.server.response.a.o(a, s);
                        }
                        G(sb, (a<?, ?>)a, o);
                    }
                    else {
                        String str3 = null;
                        Label_0779: {
                            if (!a.K) {
                                Number obj = null;
                                Label_1190: {
                                    String str4 = null;
                                    switch (a.J) {
                                        default: {
                                            throw new IllegalStateException("Unknown field type out");
                                        }
                                        case 11: {
                                            final Parcel y = b.y(parcel, x);
                                            y.setDataPosition(0);
                                            this.b0(sb, a.V5(), y);
                                            break Label_1210;
                                        }
                                        case 10: {
                                            final Bundle g2 = b.g(parcel, x);
                                            final Set keySet = g2.keySet();
                                            sb.append("{");
                                            final Iterator<String> iterator3 = keySet.iterator();
                                            int n2 = 1;
                                            while (iterator3.hasNext()) {
                                                final String str2 = iterator3.next();
                                                if (n2 == 0) {
                                                    sb.append(",");
                                                }
                                                sb.append("\"");
                                                sb.append(str2);
                                                sb.append("\"");
                                                sb.append(":");
                                                sb.append("\"");
                                                sb.append(r.b(g2.getString(str2)));
                                                sb.append("\"");
                                                n2 = 0;
                                            }
                                            str3 = "}";
                                            break Label_0779;
                                        }
                                        case 9: {
                                            final byte[] h2 = b.h(parcel, x);
                                            sb.append("\"");
                                            str4 = com.google.android.gms.common.util.c.e(h2);
                                            break;
                                        }
                                        case 8: {
                                            final byte[] h3 = b.h(parcel, x);
                                            sb.append("\"");
                                            str4 = com.google.android.gms.common.util.c.d(h3);
                                            break;
                                        }
                                        case 7: {
                                            final String g3 = b.G(parcel, x);
                                            sb.append("\"");
                                            str4 = r.b(g3);
                                            break;
                                        }
                                        case 6: {
                                            sb.append(b.P(parcel, x));
                                            break Label_1210;
                                        }
                                        case 5: {
                                            obj = b.a(parcel, x);
                                            break Label_1190;
                                        }
                                        case 4: {
                                            sb.append(b.T(parcel, x));
                                            break Label_1210;
                                        }
                                        case 3: {
                                            sb.append(b.V(parcel, x));
                                            break Label_1210;
                                        }
                                        case 2: {
                                            sb.append(b.c0(parcel, x));
                                            break Label_1210;
                                        }
                                        case 1: {
                                            obj = b.c(parcel, x);
                                            break Label_1190;
                                        }
                                        case 0: {
                                            sb.append(b.Z(parcel, x));
                                            break Label_1210;
                                        }
                                    }
                                    sb.append(str4);
                                    sb.append("\"");
                                    break Label_1210;
                                }
                                sb.append(obj);
                                break Label_1210;
                            }
                            sb.append("[");
                            switch (a.J) {
                                default: {
                                    throw new IllegalStateException("Unknown field type out.");
                                }
                                case 11: {
                                    final Parcel[] z = b.z(parcel, x);
                                    for (int length = z.length, i = 0; i < length; ++i) {
                                        if (i > 0) {
                                            sb.append(",");
                                        }
                                        z[i].setDataPosition(0);
                                        this.b0(sb, a.V5(), z[i]);
                                    }
                                    break;
                                }
                                case 8:
                                case 9:
                                case 10: {
                                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                                }
                                case 7: {
                                    com.google.android.gms.common.util.b.q(sb, b.H(parcel, x));
                                    break;
                                }
                                case 6: {
                                    com.google.android.gms.common.util.b.p(sb, b.e(parcel, x));
                                    break;
                                }
                                case 5: {
                                    com.google.android.gms.common.util.b.o(sb, b.b(parcel, x));
                                    break;
                                }
                                case 4: {
                                    com.google.android.gms.common.util.b.k(sb, b.l(parcel, x));
                                    break;
                                }
                                case 3: {
                                    com.google.android.gms.common.util.b.l(sb, b.o(parcel, x));
                                    break;
                                }
                                case 2: {
                                    com.google.android.gms.common.util.b.n(sb, b.w(parcel, x));
                                    break;
                                }
                                case 1: {
                                    com.google.android.gms.common.util.b.o(sb, b.d(parcel, x));
                                    break;
                                }
                                case 0: {
                                    com.google.android.gms.common.util.b.m(sb, b.u(parcel, x));
                                    break;
                                }
                            }
                            str3 = "]";
                        }
                        sb.append(str3);
                    }
                }
                n = 1;
            }
        }
        if (parcel.dataPosition() == h0) {
            sb.append('}');
            return;
        }
        final StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(h0);
        throw new b.a(sb3.toString(), parcel);
    }
    
    @Override
    protected final void I(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<BigInteger> list) {
        this.Y(a);
        final int size = x.k(list).size();
        final BigInteger[] array = new BigInteger[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        h2.c.f(this.H, a.U4(), array, true);
    }
    
    @Override
    protected final void K(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Long> list) {
        this.Y(a);
        final int size = x.k(list).size();
        final long[] array = new long[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        h2.c.L(this.H, a.U4(), array, true);
    }
    
    @Override
    protected final void M(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Float> list) {
        this.Y(a);
        final int size = x.k(list).size();
        final float[] array = new float[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        h2.c.x(this.H, a.U4(), array, true);
    }
    
    @Override
    protected final void O(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Double> list) {
        this.Y(a);
        final int size = x.k(list).size();
        final double[] array = new double[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        h2.c.s(this.H, a.U4(), array, true);
    }
    
    @Override
    protected final void Q(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<BigDecimal> list) {
        this.Y(a);
        final int size = x.k(list).size();
        final BigDecimal[] array = new BigDecimal[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        h2.c.d(this.H, a.U4(), array, true);
    }
    
    @Override
    protected final void S(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Boolean> list) {
        this.Y(a);
        final int size = x.k(list).size();
        final boolean[] array = new boolean[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        h2.c.h(this.H, a.U4(), array, true);
    }
    
    @Override
    public <T extends a> void a(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<T> list) {
        this.Y(a);
        final ArrayList<Parcel> list2 = new ArrayList<Parcel>();
        x.k(list).size();
        final int size = list.size();
        int i = 0;
        while (i < size) {
            final a value = list.get(i);
            ++i;
            list2.add(((d)value).X());
        }
        h2.c.Q(this.H, a.U4(), list2, true);
    }
    
    @Override
    public <T extends a> void b(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final T t) {
        this.Y(a);
        h2.c.O(this.H, a.U4(), ((d)t).X(), true);
    }
    
    @RecentlyNullable
    @Override
    public Map<String, a<?, ?>> c() {
        final p j = this.J;
        if (j == null) {
            return null;
        }
        return j.M(x.k(this.K));
    }
    
    @RecentlyNonNull
    @Override
    public Object e(@RecentlyNonNull final String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
    
    @RecentlyNonNull
    @Override
    public boolean g(@RecentlyNonNull final String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
    
    @Override
    protected void h(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final boolean b) {
        this.Y(a);
        h2.c.g(this.H, a.U4(), b);
    }
    
    @Override
    protected void i(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final byte[] array) {
        this.Y(a);
        h2.c.m(this.H, a.U4(), array, true);
    }
    
    @Override
    protected void j(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final int n) {
        this.Y(a);
        h2.c.F(this.H, a.U4(), n);
    }
    
    @Override
    protected void k(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final long n) {
        this.Y(a);
        h2.c.K(this.H, a.U4(), n);
    }
    
    @Override
    protected void l(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final String s2) {
        this.Y(a);
        h2.c.X(this.H, a.U4(), s2, true);
    }
    
    @Override
    protected void m(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final Map<String, String> map) {
        this.Y(a);
        final Bundle bundle = new Bundle();
        for (final String s2 : x.k(map).keySet()) {
            bundle.putString(s2, (String)map.get(s2));
        }
        h2.c.k(this.H, a.U4(), bundle, true);
    }
    
    @Override
    protected void n(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<String> list) {
        this.Y(a);
        final int size = x.k(list).size();
        final String[] array = new String[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        h2.c.Y(this.H, a.U4(), array, true);
    }
    
    @RecentlyNonNull
    @Override
    public String toString() {
        x.l(this.J, "Cannot convert to JSON on client side.");
        final Parcel x = this.X();
        x.setDataPosition(0);
        final StringBuilder sb = new StringBuilder(100);
        this.b0(sb, com.google.android.gms.common.internal.x.k(this.J.M(com.google.android.gms.common.internal.x.k(this.K))), x);
        return sb.toString();
    }
    
    @Override
    protected final void u(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final double n) {
        this.Y(a);
        h2.c.r(this.H, a.U4(), n);
    }
    
    @Override
    protected final void v(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final float n) {
        this.Y(a);
        h2.c.w(this.H, a.U4(), n);
    }
    
    @Override
    protected final void w(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final BigDecimal bigDecimal) {
        this.Y(a);
        h2.c.c(this.H, a.U4(), bigDecimal, true);
    }
    
    public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int i) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.O(parcel, 2, this.X(), false);
        final int j = this.I;
        Object k;
        if (j != 0) {
            if (j != 1 && j != 2) {
                i = this.I;
                final StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            k = this.J;
        }
        else {
            k = null;
        }
        h2.c.S(parcel, 3, (Parcelable)k, i, false);
        h2.c.b(parcel, a);
    }
    
    @Override
    protected final void x(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final BigInteger bigInteger) {
        this.Y(a);
        h2.c.e(this.H, a.U4(), bigInteger, true);
    }
    
    @Override
    protected final void y(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Integer> list) {
        this.Y(a);
        final int size = x.k(list).size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        h2.c.G(this.H, a.U4(), array, true);
    }
}
