// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.response;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.server.converter.b;
import h2.d;
import com.google.android.gms.common.util.d0;
import java.util.Iterator;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.s;
import java.util.HashMap;
import androidx.annotation.RecentlyNullable;
import java.util.Map;
import java.util.ArrayList;
import androidx.annotation.RecentlyNonNull;
import java.math.BigInteger;
import java.math.BigDecimal;
import androidx.annotation.k0;
import com.google.android.gms.common.util.r;
import com.google.android.gms.common.internal.x;
import android.util.Log;
import com.google.android.gms.common.internal.b0;

@b0
@a
public abstract class a
{
    private static <O> void F(final String s) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 58);
            sb.append("Output field (");
            sb.append(s);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }
    
    private static void G(final StringBuilder sb, final a a, final Object o) {
        final int h = a.H;
        String string;
        if (h == 11) {
            final Class<? extends a> n = a.N;
            x.k(n);
            string = ((a)n.cast(o)).toString();
        }
        else {
            if (h != 7) {
                sb.append(o);
                return;
            }
            string = "\"";
            sb.append("\"");
            sb.append(r.b((String)o));
        }
        sb.append(string);
    }
    
    private final <I, O> void H(final a<I, O> a, @k0 final I n) {
        final String l = a.L;
        final O g = a.G(n);
        switch (a.J) {
            default: {
                final int j = a.J;
                final StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(j);
                throw new IllegalStateException(sb.toString());
            }
            case 8:
            case 9: {
                if (g != null) {
                    this.i(a, l, (byte[])(Object)g);
                    return;
                }
                F(l);
            }
            case 7: {
                this.l(a, l, (String)g);
            }
            case 6: {
                if (g != null) {
                    this.h(a, l, (boolean)g);
                    return;
                }
                F(l);
            }
            case 5: {
                this.w(a, l, (BigDecimal)g);
            }
            case 4: {
                if (g != null) {
                    this.u(a, l, (double)g);
                    return;
                }
                F(l);
            }
            case 2: {
                if (g != null) {
                    this.k(a, l, (long)g);
                    return;
                }
                F(l);
            }
            case 1: {
                this.x(a, l, (BigInteger)g);
            }
            case 0: {
                if (g != null) {
                    this.j(a, l, (int)g);
                    return;
                }
                F(l);
            }
        }
    }
    
    @RecentlyNonNull
    protected static <O, I> I o(@RecentlyNonNull final a<I, O> a, @k0 final Object o) {
        if (((a<Object, Object>)a).Q != null) {
            return a.k(o);
        }
        return (I)o;
    }
    
    public final <O> void A(@RecentlyNonNull final a<BigInteger, O> a, @k0 final BigInteger bigInteger) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<BigInteger, Object>)a, bigInteger);
            return;
        }
        this.x(a, a.L, bigInteger);
    }
    
    public final <O> void B(@RecentlyNonNull final a<ArrayList<Integer>, O> a, @k0 final ArrayList<Integer> list) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<ArrayList<Integer>, Object>)a, list);
            return;
        }
        this.y(a, a.L, list);
    }
    
    public final <O> void C(@RecentlyNonNull final a<Map<String, String>, O> a, @k0 final Map<String, String> map) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<Map<String, String>, Object>)a, map);
            return;
        }
        this.m(a, a.L, map);
    }
    
    public final <O> void D(@RecentlyNonNull final a<Boolean, O> a, @RecentlyNonNull final boolean b) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<Boolean, Object>)a, b);
            return;
        }
        this.h(a, a.L, b);
    }
    
    public final <O> void E(@RecentlyNonNull final a<byte[], O> a, @k0 final byte[] array) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<byte[], Object>)a, array);
            return;
        }
        this.i(a, a.L, array);
    }
    
    protected void I(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<BigInteger> list) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }
    
    public final <O> void J(@RecentlyNonNull final a<ArrayList<BigInteger>, O> a, @k0 final ArrayList<BigInteger> list) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<ArrayList<BigInteger>, Object>)a, list);
            return;
        }
        this.I(a, a.L, list);
    }
    
    protected void K(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Long> list) {
        throw new UnsupportedOperationException("Long list not supported");
    }
    
    public final <O> void L(@RecentlyNonNull final a<ArrayList<Long>, O> a, @k0 final ArrayList<Long> list) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<ArrayList<Long>, Object>)a, list);
            return;
        }
        this.K(a, a.L, list);
    }
    
    protected void M(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Float> list) {
        throw new UnsupportedOperationException("Float list not supported");
    }
    
    public final <O> void N(@RecentlyNonNull final a<ArrayList<Float>, O> a, @k0 final ArrayList<Float> list) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<ArrayList<Float>, Object>)a, list);
            return;
        }
        this.M(a, a.L, list);
    }
    
    protected void O(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Double> list) {
        throw new UnsupportedOperationException("Double list not supported");
    }
    
    public final <O> void P(@RecentlyNonNull final a<ArrayList<Double>, O> a, @k0 final ArrayList<Double> list) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<ArrayList<Double>, Object>)a, list);
            return;
        }
        this.O(a, a.L, list);
    }
    
    protected void Q(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<BigDecimal> list) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }
    
    public final <O> void R(@RecentlyNonNull final a<ArrayList<BigDecimal>, O> a, @k0 final ArrayList<BigDecimal> list) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<ArrayList<BigDecimal>, Object>)a, list);
            return;
        }
        this.Q(a, a.L, list);
    }
    
    protected void S(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Boolean> list) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }
    
    public final <O> void T(@RecentlyNonNull final a<ArrayList<Boolean>, O> a, @k0 final ArrayList<Boolean> list) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<ArrayList<Boolean>, Object>)a, list);
            return;
        }
        this.S(a, a.L, list);
    }
    
    public final <O> void U(@RecentlyNonNull final a<ArrayList<String>, O> a, @k0 final ArrayList<String> list) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<ArrayList<String>, Object>)a, list);
            return;
        }
        this.n(a, a.L, list);
    }
    
    @a
    public <T extends a> void a(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<T> list) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }
    
    @a
    public <T extends a> void b(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }
    
    @RecentlyNonNull
    @a
    public abstract Map<String, a<?, ?>> c();
    
    @RecentlyNullable
    @a
    protected Object d(@RecentlyNonNull final a a) {
        final String l = a.L;
        if (a.N != null) {
            x.s(this.e(l) == null, "Concrete field shouldn't be value object: %s", a.L);
            try {
                final char upperCase = Character.toUpperCase(l.charAt(0));
                final String substring = l.substring(1);
                final StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                sb.append("get");
                sb.append(upperCase);
                sb.append(substring);
                return this.getClass().getMethod(sb.toString(), (Class<?>[])new Class[0]).invoke(this, new Object[0]);
            }
            catch (Exception cause) {
                throw new RuntimeException(cause);
            }
        }
        return this.e(l);
    }
    
    @RecentlyNullable
    @a
    protected abstract Object e(@RecentlyNonNull final String p0);
    
    @RecentlyNonNull
    @a
    protected boolean f(@RecentlyNonNull final a a) {
        if (a.J != 11) {
            return this.g(a.L);
        }
        if (a.K) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }
    
    @RecentlyNonNull
    @a
    protected abstract boolean g(@RecentlyNonNull final String p0);
    
    @a
    protected void h(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final boolean b) {
        throw new UnsupportedOperationException("Boolean not supported");
    }
    
    @a
    protected void i(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final byte[] array) {
        throw new UnsupportedOperationException("byte[] not supported");
    }
    
    @a
    protected void j(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final int n) {
        throw new UnsupportedOperationException("Integer not supported");
    }
    
    @a
    protected void k(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final long n) {
        throw new UnsupportedOperationException("Long not supported");
    }
    
    @a
    protected void l(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final String s2) {
        throw new UnsupportedOperationException("String not supported");
    }
    
    @a
    protected void m(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }
    
    @a
    protected void n(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<String> list) {
        throw new UnsupportedOperationException("String list not supported");
    }
    
    public final <O> void p(@RecentlyNonNull final a<Double, O> a, @RecentlyNonNull final double d) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<Double, Object>)a, d);
            return;
        }
        this.u(a, a.L, d);
    }
    
    public final <O> void q(@RecentlyNonNull final a<Float, O> a, @RecentlyNonNull final float f) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<Float, Object>)a, f);
            return;
        }
        this.v(a, a.L, f);
    }
    
    public final <O> void r(@RecentlyNonNull final a<Integer, O> a, @RecentlyNonNull final int i) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<Integer, Object>)a, i);
            return;
        }
        this.j(a, a.L, i);
    }
    
    public final <O> void s(@RecentlyNonNull final a<Long, O> a, @RecentlyNonNull final long l) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<Long, Object>)a, l);
            return;
        }
        this.k(a, a.L, l);
    }
    
    public final <O> void t(@RecentlyNonNull final a<String, O> a, @k0 final String s) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<String, Object>)a, s);
            return;
        }
        this.l(a, a.L, s);
    }
    
    @RecentlyNonNull
    @a
    @Override
    public String toString() {
        final Map<String, a<?, ?>> c = this.c();
        final StringBuilder sb = new StringBuilder(100);
        for (final String str : c.keySet()) {
            final a<ArrayList<Object>, Object> a = c.get(str);
            if (this.f(a)) {
                final ArrayList<Object> o = o(a, this.d(a));
                if (sb.length() == 0) {
                    sb.append("{");
                }
                else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                String str2 = null;
                Label_0140: {
                    if (o != null) {
                        String str3 = null;
                        switch (a.J) {
                            default: {
                                if (a.I) {
                                    final ArrayList<Object> list = o;
                                    sb.append("[");
                                    for (int i = 0; i < list.size(); ++i) {
                                        if (i > 0) {
                                            sb.append(",");
                                        }
                                        final Object value = list.get(i);
                                        if (value != null) {
                                            G(sb, a, value);
                                        }
                                    }
                                    str2 = "]";
                                    break Label_0140;
                                }
                                G(sb, a, o);
                                continue;
                            }
                            case 10: {
                                s.a(sb, (HashMap<String, String>)o);
                                continue;
                            }
                            case 9: {
                                sb.append("\"");
                                str3 = com.google.android.gms.common.util.c.e((byte[])(Object)o);
                                break;
                            }
                            case 8: {
                                sb.append("\"");
                                str3 = com.google.android.gms.common.util.c.d((byte[])(Object)o);
                                break;
                            }
                        }
                        sb.append(str3);
                        sb.append("\"");
                        continue;
                    }
                    str2 = "null";
                }
                sb.append(str2);
            }
        }
        String str4;
        if (sb.length() > 0) {
            str4 = "}";
        }
        else {
            str4 = "{}";
        }
        sb.append(str4);
        return sb.toString();
    }
    
    protected void u(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final double n) {
        throw new UnsupportedOperationException("Double not supported");
    }
    
    protected void v(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @RecentlyNonNull final float n) {
        throw new UnsupportedOperationException("Float not supported");
    }
    
    protected void w(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }
    
    protected void x(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }
    
    protected void y(@RecentlyNonNull final a<?, ?> a, @RecentlyNonNull final String s, @k0 final ArrayList<Integer> list) {
        throw new UnsupportedOperationException("Integer list not supported");
    }
    
    public final <O> void z(@RecentlyNonNull final a<BigDecimal, O> a, @k0 final BigDecimal bigDecimal) {
        if (((a<Object, Object>)a).Q != null) {
            this.H((a<BigDecimal, Object>)a, bigDecimal);
            return;
        }
        this.w(a, a.L, bigDecimal);
    }
    
    @b0
    @d0
    @f2.a
    @h2.d.a(creator = "FieldCreator")
    public static class a<I, O> extends h2.a
    {
        public static final n CREATOR;
        @g(getter = "getVersionCode", id = 1)
        private final int G;
        @RecentlyNonNull
        @c(getter = "getTypeIn", id = 2)
        protected final int H;
        @RecentlyNonNull
        @c(getter = "isTypeInArray", id = 3)
        protected final boolean I;
        @RecentlyNonNull
        @c(getter = "getTypeOut", id = 4)
        protected final int J;
        @RecentlyNonNull
        @c(getter = "isTypeOutArray", id = 5)
        protected final boolean K;
        @RecentlyNonNull
        @c(getter = "getOutputFieldName", id = 6)
        protected final String L;
        @RecentlyNonNull
        @c(getter = "getSafeParcelableFieldId", id = 7)
        protected final int M;
        @RecentlyNullable
        protected final Class<? extends com.google.android.gms.common.server.response.a> N;
        @k0
        @c(getter = "getConcreteTypeName", id = 8)
        private final String O;
        private p P;
        @k0
        @c(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private com.google.android.gms.common.server.response.a.b<I, O> Q;
        
        static {
            CREATOR = new n();
        }
        
        @d.b
        a(@e(id = 1) final int g, @e(id = 2) final int h, @e(id = 3) final boolean i, @e(id = 4) final int j, @e(id = 5) final boolean k, @e(id = 6) final String l, @e(id = 7) final int m, @k0 @e(id = 8) final String o, @k0 @e(id = 9) final b b) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = l;
            this.M = m;
            if (o == null) {
                this.N = null;
                this.O = null;
            }
            else {
                this.N = d.class;
                this.O = o;
            }
            if (b == null) {
                this.Q = null;
                return;
            }
            this.Q = (com.google.android.gms.common.server.response.a.b<I, O>)b.g1();
        }
        
        private a(final int h, final boolean i, final int j, final boolean k, String canonicalName, final int m, @k0 final Class<? extends com.google.android.gms.common.server.response.a> n, @k0 final com.google.android.gms.common.server.response.a.b<I, O> q) {
            this.G = 1;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.L = canonicalName;
            this.M = m;
            this.N = n;
            if (n == null) {
                canonicalName = null;
            }
            else {
                canonicalName = n.getCanonicalName();
            }
            this.O = canonicalName;
            this.Q = q;
        }
        
        @RecentlyNonNull
        @d0
        @f2.a
        public static a<byte[], byte[]> M(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<byte[], byte[]>(8, false, 8, false, s, n, null, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static a<Float, Float> N2(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<Float, Float>(3, false, 3, false, s, n, null, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static a<String, String> O3(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<String, String>(7, false, 7, false, s, n, null, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static <T extends com.google.android.gms.common.server.response.a> a<ArrayList<T>, ArrayList<T>> Q1(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final Class<T> clazz) {
            return new a<ArrayList<T>, ArrayList<T>>(11, true, 11, true, s, n, clazz, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static a<ArrayList<String>, ArrayList<String>> Q4(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<ArrayList<String>, ArrayList<String>>(7, true, 7, true, s, n, null, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static a<HashMap<String, String>, HashMap<String, String>> U3(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<HashMap<String, String>, HashMap<String, String>>(10, false, 10, false, s, n, null, null);
        }
        
        @k0
        private final String X5() {
            String o;
            if ((o = this.O) == null) {
                o = null;
            }
            return o;
        }
        
        @k0
        private final b Y5() {
            final com.google.android.gms.common.server.response.a.b<I, O> q = this.Q;
            if (q == null) {
                return null;
            }
            return b.M(q);
        }
        
        @RecentlyNonNull
        @f2.a
        public static a<Boolean, Boolean> g1(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<Boolean, Boolean>(6, false, 6, false, s, n, null, null);
        }
        
        @RecentlyNonNull
        @d0
        @f2.a
        public static a<Integer, Integer> i3(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<Integer, Integer>(0, false, 0, false, s, n, null, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static a<Double, Double> j2(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<Double, Double>(4, false, 4, false, s, n, null, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static a<Long, Long> j3(@RecentlyNonNull final String s, @RecentlyNonNull final int n) {
            return new a<Long, Long>(2, false, 2, false, s, n, null, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static <T extends com.google.android.gms.common.server.response.a> a<T, T> q1(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final Class<T> clazz) {
            return new a<T, T>(11, false, 11, false, s, n, clazz, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public static a v5(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final com.google.android.gms.common.server.response.a.b<?, ?> b, @RecentlyNonNull final boolean b2) {
            return new a(b.b(), b2, b.f(), false, s, n, null, (com.google.android.gms.common.server.response.a.b<I, O>)b);
        }
        
        @RecentlyNonNull
        public final O G(@k0 final I n) {
            x.k(this.Q);
            return x.k(this.Q.k(n));
        }
        
        @RecentlyNonNull
        public final a<I, O> Q5() {
            return new a<I, O>(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.O, this.Y5());
        }
        
        public final void S5(final p p) {
            this.P = p;
        }
        
        @RecentlyNonNull
        public final boolean T5() {
            return this.Q != null;
        }
        
        @RecentlyNonNull
        @f2.a
        public int U4() {
            return this.M;
        }
        
        @RecentlyNonNull
        public final com.google.android.gms.common.server.response.a U5() throws InstantiationException, IllegalAccessException {
            x.k(this.N);
            final Class<? extends com.google.android.gms.common.server.response.a> n = this.N;
            if (n == d.class) {
                x.k(this.O);
                x.l(this.P, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new d(this.P, this.O);
            }
            return n.newInstance();
        }
        
        @RecentlyNonNull
        public final Map<String, a<?, ?>> V5() {
            x.k(this.O);
            x.k(this.P);
            return x.k(this.P.M(this.O));
        }
        
        @RecentlyNonNull
        public final I k(@RecentlyNonNull final O o) {
            x.k(this.Q);
            return this.Q.G(o);
        }
        
        @RecentlyNonNull
        @Override
        public String toString() {
            final v.a a = v.d(this).a("versionCode", this.G).a("typeIn", this.H).a("typeInArray", this.I).a("typeOut", this.J).a("typeOutArray", this.K).a("outputFieldName", this.L).a("safeParcelFieldId", this.M).a("concreteTypeName", this.X5());
            final Class<? extends com.google.android.gms.common.server.response.a> n = this.N;
            if (n != null) {
                a.a("concreteType.class", n.getCanonicalName());
            }
            final com.google.android.gms.common.server.response.a.b<I, O> q = this.Q;
            if (q != null) {
                a.a("converterName", q.getClass().getCanonicalName());
            }
            return a.toString();
        }
        
        public void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
            final int a = h2.c.a(parcel);
            h2.c.F(parcel, 1, this.G);
            h2.c.F(parcel, 2, this.H);
            h2.c.g(parcel, 3, this.I);
            h2.c.F(parcel, 4, this.J);
            h2.c.g(parcel, 5, this.K);
            h2.c.X(parcel, 6, this.L, false);
            h2.c.F(parcel, 7, this.U4());
            h2.c.X(parcel, 8, this.X5(), false);
            h2.c.S(parcel, 9, (Parcelable)this.Y5(), n, false);
            h2.c.b(parcel, a);
        }
    }
    
    @b0
    public interface b<I, O>
    {
        @RecentlyNonNull
        I G(@RecentlyNonNull final O p0);
        
        @RecentlyNonNull
        int b();
        
        @RecentlyNonNull
        int f();
        
        @RecentlyNullable
        O k(@RecentlyNonNull final I p0);
    }
}
