// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.y0;
import kotlin.s0;
import kotlin.n1;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.collections.j1;
import kotlin.jvm.internal.w;
import java.util.Set;
import java.util.Map;
import java.util.List;
import org.jetbrains.annotations.e;

public class c0
{
    @e
    public static final a a;
    @e
    private static final List<a.a> b;
    @e
    private static final List<String> c;
    @e
    private static final List<String> d;
    @e
    private static final Map<a.a, c> e;
    @e
    private static final Map<String, c> f;
    @e
    private static final Set<kotlin.reflect.jvm.internal.impl.name.e> g;
    @e
    private static final Set<String> h;
    @e
    private static final a.a i;
    @e
    private static final Map<a.a, kotlin.reflect.jvm.internal.impl.name.e> j;
    @e
    private static final Map<String, kotlin.reflect.jvm.internal.impl.name.e> k;
    @e
    private static final List<kotlin.reflect.jvm.internal.impl.name.e> l;
    @e
    private static final Map<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.name.e>> m;
    
    static {
        a = new a(null);
        final Set u = j1.u((Object[])new String[] { "containsAll", "removeAll", "retainAll" });
        final ArrayList b2 = new ArrayList<a.a>(v.Y((Iterable)u, 10));
        for (final String s : u) {
            final a a2 = c0.a;
            final String g2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K.g();
            k0.o((Object)g2, "BOOLEAN.desc");
            b2.add(a2.k("java/util/Collection", s, "Ljava/util/Collection;", g2));
        }
        b = b2;
        final ArrayList c2 = new ArrayList<String>(v.Y((Iterable)b2, 10));
        final Iterator<a.a> iterator2 = b2.iterator();
        while (iterator2.hasNext()) {
            c2.add(iterator2.next().b());
        }
        c = c2;
        final List<a.a> b3 = c0.b;
        final ArrayList d2 = new ArrayList<String>(v.Y((Iterable)b3, 10));
        final Iterator<Object> iterator3 = b3.iterator();
        while (iterator3.hasNext()) {
            d2.add(((a.a)iterator3.next()).a().d());
        }
        d = d2;
        final kotlin.reflect.jvm.internal.impl.load.kotlin.v a3 = kotlin.reflect.jvm.internal.impl.load.kotlin.v.a;
        final a a4 = c0.a;
        final String i2 = a3.i("Collection");
        final d k2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K;
        final String g3 = k2.g();
        k0.o((Object)g3, "BOOLEAN.desc");
        final a.a a5 = a4.k(i2, "contains", "Ljava/lang/Object;", g3);
        final c j2 = c0.c.J;
        final s0 a6 = n1.a((Object)a5, (Object)j2);
        final String i3 = a3.i("Collection");
        final String g4 = k2.g();
        k0.o((Object)g4, "BOOLEAN.desc");
        final s0 a7 = n1.a((Object)a4.k(i3, "remove", "Ljava/lang/Object;", g4), (Object)j2);
        final String i4 = a3.i("Map");
        final String g5 = k2.g();
        k0.o((Object)g5, "BOOLEAN.desc");
        final s0 a8 = n1.a((Object)a4.k(i4, "containsKey", "Ljava/lang/Object;", g5), (Object)j2);
        final String i5 = a3.i("Map");
        final String g6 = k2.g();
        k0.o((Object)g6, "BOOLEAN.desc");
        final s0 a9 = n1.a((Object)a4.k(i5, "containsValue", "Ljava/lang/Object;", g6), (Object)j2);
        final String i6 = a3.i("Map");
        final String g7 = k2.g();
        k0.o((Object)g7, "BOOLEAN.desc");
        final s0 a10 = n1.a((Object)a4.k(i6, "remove", "Ljava/lang/Object;Ljava/lang/Object;", g7), (Object)j2);
        final s0 a11 = n1.a((Object)a4.k(a3.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), (Object)c0.c.K);
        final a.a a12 = a4.k(a3.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        final c h2 = c0.c.H;
        final s0 a13 = n1.a((Object)a12, (Object)h2);
        final s0 a14 = n1.a((Object)a4.k(a3.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), (Object)h2);
        final String i7 = a3.i("List");
        final d o = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.O;
        final String g8 = o.g();
        k0.o((Object)g8, "INT.desc");
        final a.a a15 = a4.k(i7, "indexOf", "Ljava/lang/Object;", g8);
        final c i8 = c0.c.I;
        final s0 a16 = n1.a((Object)a15, (Object)i8);
        final String i9 = a3.i("List");
        final String g9 = o.g();
        k0.o((Object)g9, "INT.desc");
        final Map<a.a, c> map = (Map<a.a, c>)(e = y0.W(new s0[] { a6, a7, a8, a9, a10, a11, a13, a14, a16, n1.a((Object)a4.k(i9, "lastIndexOf", "Ljava/lang/Object;", g9), (Object)i8) }));
        final LinkedHashMap f2 = new LinkedHashMap<String, c>(y0.j(map.size()));
        for (final Map.Entry<a.a, V> entry : map.entrySet()) {
            f2.put(entry.getKey().b(), (c)entry.getValue());
        }
        f = f2;
        final Set c3 = j1.C((Set)c0.e.keySet(), (Iterable)c0.b);
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>(v.Y((Iterable)c3, 10));
        final Iterator<a.a> iterator5 = c3.iterator();
        while (iterator5.hasNext()) {
            list.add(iterator5.next().a());
        }
        g = v.N5((Iterable)list);
        final ArrayList list2 = new ArrayList<String>(v.Y((Iterable)c3, 10));
        final Iterator<a.a> iterator6 = c3.iterator();
        while (iterator6.hasNext()) {
            list2.add(iterator6.next().b());
        }
        h = v.N5((Iterable)list2);
        final a a17 = c0.a;
        final d o2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.O;
        final String g10 = o2.g();
        k0.o((Object)g10, "INT.desc");
        i = a17.k("java/util/List", "removeAt", g10, "Ljava/lang/Object;");
        final kotlin.reflect.jvm.internal.impl.load.kotlin.v a18 = kotlin.reflect.jvm.internal.impl.load.kotlin.v.a;
        final String h3 = a18.h("Number");
        final String g11 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.M.g();
        k0.o((Object)g11, "BYTE.desc");
        final s0 a19 = n1.a((Object)a17.k(h3, "toByte", "", g11), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("byteValue"));
        final String h4 = a18.h("Number");
        final String g12 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.N.g();
        k0.o((Object)g12, "SHORT.desc");
        final s0 a20 = n1.a((Object)a17.k(h4, "toShort", "", g12), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("shortValue"));
        final String h5 = a18.h("Number");
        final String g13 = o2.g();
        k0.o((Object)g13, "INT.desc");
        final s0 a21 = n1.a((Object)a17.k(h5, "toInt", "", g13), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("intValue"));
        final String h6 = a18.h("Number");
        final String g14 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.Q.g();
        k0.o((Object)g14, "LONG.desc");
        final s0 a22 = n1.a((Object)a17.k(h6, "toLong", "", g14), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("longValue"));
        final String h7 = a18.h("Number");
        final String g15 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.P.g();
        k0.o((Object)g15, "FLOAT.desc");
        final s0 a23 = n1.a((Object)a17.k(h7, "toFloat", "", g15), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("floatValue"));
        final String h8 = a18.h("Number");
        final String g16 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.R.g();
        k0.o((Object)g16, "DOUBLE.desc");
        final s0 a24 = n1.a((Object)a17.k(h8, "toDouble", "", g16), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("doubleValue"));
        final s0 a25 = n1.a((Object)a17.g(), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("remove"));
        final String h9 = a18.h("CharSequence");
        final String g17 = o2.g();
        k0.o((Object)g17, "INT.desc");
        final String g18 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.L.g();
        k0.o((Object)g18, "CHAR.desc");
        final Map<a.a, kotlin.reflect.jvm.internal.impl.name.e> map2 = (Map<a.a, kotlin.reflect.jvm.internal.impl.name.e>)(j = y0.W(new s0[] { a19, a20, a21, a22, a23, a24, a25, n1.a((Object)a17.k(h9, "get", g17, g18), (Object)kotlin.reflect.jvm.internal.impl.name.e.i("charAt")) }));
        final LinkedHashMap k3 = new LinkedHashMap<String, kotlin.reflect.jvm.internal.impl.name.e>(y0.j(map2.size()));
        for (final Map.Entry<a.a, V> entry2 : map2.entrySet()) {
            k3.put(entry2.getKey().b(), (kotlin.reflect.jvm.internal.impl.name.e)entry2.getValue());
        }
        k = k3;
        final Set<a.a> keySet = c0.j.keySet();
        final ArrayList l2 = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>(v.Y((Iterable)keySet, 10));
        final Iterator<Object> iterator8 = keySet.iterator();
        while (iterator8.hasNext()) {
            l2.add(((a.a)iterator8.next()).a());
        }
        l = l2;
        final Set<Map.Entry<a.a, kotlin.reflect.jvm.internal.impl.name.e>> entrySet = c0.j.entrySet();
        final ArrayList list3 = new ArrayList<s0>(v.Y((Iterable)entrySet, 10));
        for (final Map.Entry<a.a, V> entry3 : entrySet) {
            list3.add(new s0((Object)entry3.getKey().a(), (Object)entry3.getValue()));
        }
        final LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.name.e>> m2 = (LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.name.e>>)new LinkedHashMap<Object, Object>();
        for (final s0 s2 : list3) {
            final kotlin.reflect.jvm.internal.impl.name.e e2 = (kotlin.reflect.jvm.internal.impl.name.e)s2.f();
            List<kotlin.reflect.jvm.internal.impl.name.e> value;
            if ((value = m2.get(e2)) == null) {
                value = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>();
                m2.put(e2, value);
            }
            value.add((kotlin.reflect.jvm.internal.impl.name.e)s2.e());
        }
        m = m2;
    }
    
    public static final /* synthetic */ List a() {
        return c0.c;
    }
    
    public static final /* synthetic */ Set b() {
        return c0.g;
    }
    
    public static final /* synthetic */ Set c() {
        return c0.h;
    }
    
    public static final /* synthetic */ Map d() {
        return c0.m;
    }
    
    public static final /* synthetic */ List e() {
        return c0.l;
    }
    
    public static final /* synthetic */ a.a f() {
        return c0.i;
    }
    
    public static final /* synthetic */ Map g() {
        return c0.f;
    }
    
    public static final /* synthetic */ Map h() {
        return c0.k;
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final c0.a.a k(final String s, final String str, final String str2, final String str3) {
            final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(str);
            k0.o((Object)i, "identifier(name)");
            final kotlin.reflect.jvm.internal.impl.load.kotlin.v a = kotlin.reflect.jvm.internal.impl.load.kotlin.v.a;
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            sb.append(str2);
            sb.append(')');
            sb.append(str3);
            return new c0.a.a(i, a.k(s, sb.toString()));
        }
        
        @e
        public final List<String> b() {
            return (List<String>)c0.a();
        }
        
        @e
        public final Set<kotlin.reflect.jvm.internal.impl.name.e> c() {
            return (Set<kotlin.reflect.jvm.internal.impl.name.e>)c0.b();
        }
        
        @e
        public final Set<String> d() {
            return (Set<String>)c0.c();
        }
        
        @e
        public final Map<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.name.e>> e() {
            return (Map<kotlin.reflect.jvm.internal.impl.name.e, List<kotlin.reflect.jvm.internal.impl.name.e>>)c0.d();
        }
        
        @e
        public final List<kotlin.reflect.jvm.internal.impl.name.e> f() {
            return (List<kotlin.reflect.jvm.internal.impl.name.e>)c0.e();
        }
        
        @e
        public final c0.a.a g() {
            return c0.f();
        }
        
        @e
        public final Map<String, c> h() {
            return (Map<String, c>)c0.g();
        }
        
        @e
        public final Map<String, kotlin.reflect.jvm.internal.impl.name.e> i() {
            return (Map<String, kotlin.reflect.jvm.internal.impl.name.e>)c0.h();
        }
        
        @e
        public final b j(@e final String s) {
            k0.p((Object)s, "builtinSignature");
            if (this.b().contains(s)) {
                return c0.b.I;
            }
            b b;
            if (y0.K((Map)this.h(), (Object)s) == c0.c.H) {
                b = c0.b.K;
            }
            else {
                b = c0.b.J;
            }
            return b;
        }
        
        public static final class a
        {
            @e
            private final kotlin.reflect.jvm.internal.impl.name.e a;
            @e
            private final String b;
            
            public a(@e final kotlin.reflect.jvm.internal.impl.name.e a, @e final String b) {
                k0.p((Object)a, "name");
                k0.p((Object)b, "signature");
                this.a = a;
                this.b = b;
            }
            
            @e
            public final kotlin.reflect.jvm.internal.impl.name.e a() {
                return this.a;
            }
            
            @e
            public final String b() {
                return this.b;
            }
            
            @Override
            public boolean equals(@f final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof a)) {
                    return false;
                }
                final a a = (a)o;
                return k0.g((Object)this.a, (Object)a.a) && k0.g((Object)this.b, (Object)a.b);
            }
            
            @Override
            public int hashCode() {
                return this.a.hashCode() * 31 + this.b.hashCode();
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("NameAndSignature(name=");
                sb.append(this.a);
                sb.append(", signature=");
                sb.append(this.b);
                sb.append(')');
                return sb.toString();
            }
        }
    }
    
    public enum b
    {
        I("Ljava/util/Collection<+Ljava/lang/Object;>;", false), 
        J((String)null, true), 
        K("Ljava/lang/Object;", true);
        
        @f
        private final String G;
        private final boolean H;
        
        private b(final String g, final boolean h) {
            this.G = g;
            this.H = h;
        }
    }
    
    public enum c
    {
        H((Object)null), 
        I((Object)(-1)), 
        J((Object)Boolean.FALSE), 
        K;
        
        @f
        private final Object G;
        
        private c(final Object g) {
            this.G = g;
        }
        
        static final class a extends c
        {
            a(final String s, final int n) {
                super(s, n, null, null);
            }
        }
    }
}
