// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.text.s;
import kotlin.j2;
import java.util.ArrayList;
import kotlin.collections.j1;
import java.util.Iterator;
import kotlin.collections.q0;
import java.util.LinkedHashMap;
import kotlin.ranges.o;
import kotlin.collections.y0;
import kotlin.jvm.internal.k0;
import n6.l;
import kotlin.collections.v;
import kotlin.jvm.internal.w;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import java.util.Map;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;

public final class g implements c
{
    @e
    public static final a e;
    @e
    private static final String f;
    @e
    private static final List<String> g;
    @e
    private static final Map<String, Integer> h;
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e a;
    @e
    private final String[] b;
    @e
    private final Set<Integer> c;
    @e
    private final List<kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c> d;
    
    static {
        final a a = e = new a(null);
        final String s = f = v.Z2((Iterable)v.L((Object[])new Character[] { 'k', 'o', 't', 'l', 'i', 'n' }), (CharSequence)"", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 62, (Object)null);
        g = v.L((Object[])new String[] { k0.C(s, (Object)"/Any"), k0.C(s, (Object)"/Nothing"), k0.C(s, (Object)"/Unit"), k0.C(s, (Object)"/Throwable"), k0.C(s, (Object)"/Number"), k0.C(s, (Object)"/Byte"), k0.C(s, (Object)"/Double"), k0.C(s, (Object)"/Float"), k0.C(s, (Object)"/Int"), k0.C(s, (Object)"/Long"), k0.C(s, (Object)"/Short"), k0.C(s, (Object)"/Boolean"), k0.C(s, (Object)"/Char"), k0.C(s, (Object)"/CharSequence"), k0.C(s, (Object)"/String"), k0.C(s, (Object)"/Comparable"), k0.C(s, (Object)"/Enum"), k0.C(s, (Object)"/Array"), k0.C(s, (Object)"/ByteArray"), k0.C(s, (Object)"/DoubleArray"), k0.C(s, (Object)"/FloatArray"), k0.C(s, (Object)"/IntArray"), k0.C(s, (Object)"/LongArray"), k0.C(s, (Object)"/ShortArray"), k0.C(s, (Object)"/BooleanArray"), k0.C(s, (Object)"/CharArray"), k0.C(s, (Object)"/Cloneable"), k0.C(s, (Object)"/Annotation"), k0.C(s, (Object)"/collections/Iterable"), k0.C(s, (Object)"/collections/MutableIterable"), k0.C(s, (Object)"/collections/Collection"), k0.C(s, (Object)"/collections/MutableCollection"), k0.C(s, (Object)"/collections/List"), k0.C(s, (Object)"/collections/MutableList"), k0.C(s, (Object)"/collections/Set"), k0.C(s, (Object)"/collections/MutableSet"), k0.C(s, (Object)"/collections/Map"), k0.C(s, (Object)"/collections/MutableMap"), k0.C(s, (Object)"/collections/Map.Entry"), k0.C(s, (Object)"/collections/MutableMap.MutableEntry"), k0.C(s, (Object)"/collections/Iterator"), k0.C(s, (Object)"/collections/MutableIterator"), k0.C(s, (Object)"/collections/ListIterator"), k0.C(s, (Object)"/collections/MutableListIterator") });
        final Iterable u5 = v.U5((Iterable)a.a());
        final LinkedHashMap h2 = new LinkedHashMap<String, Integer>(o.n(y0.j(v.Y(u5, 10)), 16));
        for (final q0 q0 : u5) {
            h2.put((String)q0.f(), Integer.valueOf(q0.e()));
        }
        h = h2;
    }
    
    public g(@e final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e a, @e final String[] b) {
        k0.p((Object)a, "types");
        k0.p((Object)b, "strings");
        this.a = a;
        this.b = b;
        final List<Integer> z = a.z();
        Set c;
        if (z.isEmpty()) {
            c = j1.k();
        }
        else {
            k0.o((Object)z, "");
            c = v.N5((Iterable)z);
        }
        this.c = (Set<Integer>)c;
        final ArrayList<kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c> d = new ArrayList<kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c>();
        final List<kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c> b2 = this.d().B();
        d.ensureCapacity(b2.size());
        for (final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c e : b2) {
            for (int i = e.I(), j = 0; j < i; ++j) {
                d.add(e);
            }
        }
        d.trimToSize();
        final j2 a2 = j2.a;
        this.d = d;
    }
    
    public static final /* synthetic */ List c() {
        return kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g.g;
    }
    
    @e
    @Override
    public String a(final int n) {
        return this.getString(n);
    }
    
    @Override
    public boolean b(final int i) {
        return this.c.contains(i);
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e d() {
        return this.a;
    }
    
    @e
    @Override
    public String getString(int intValue) {
        final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c c = this.d.get(intValue);
        String l = null;
        Label_0112: {
            if (c.S()) {
                l = c.L();
            }
            else {
                if (c.Q()) {
                    final a e = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g.e;
                    final int size = e.a().size();
                    final int h = c.H();
                    if (h >= 0 && h <= size - 1) {
                        l = e.a().get(c.H());
                        break Label_0112;
                    }
                }
                l = this.b[intValue];
            }
        }
        String substring = l;
        if (c.N() >= 2) {
            final List<Integer> o = c.O();
            k0.o((Object)o, "substringIndexList");
            final Integer n = o.get(0);
            final Integer n2 = o.get(1);
            k0.o((Object)n, "begin");
            substring = l;
            if (n >= 0) {
                intValue = n;
                k0.o((Object)n2, "end");
                substring = l;
                if (intValue <= n2) {
                    substring = l;
                    if (n2 <= l.length()) {
                        k0.o((Object)l, "string");
                        substring = l.substring(n, n2);
                        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    }
                }
            }
        }
        String s = substring;
        if (c.J() >= 2) {
            final List<Integer> k = c.K();
            k0.o((Object)k, "replaceCharList");
            final Integer n3 = k.get(0);
            final Integer n4 = k.get(1);
            k0.o((Object)substring, "string");
            s = kotlin.text.s.j2(substring, (char)(int)n3, (char)(int)n4, false, 4, null);
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.c c2;
        if ((c2 = c.G()) == null) {
            c2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.c.H;
        }
        intValue = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g.b.a[c2.ordinal()];
        if (intValue != 2) {
            if (intValue == 3) {
                String substring2 = s;
                if (s.length() >= 2) {
                    k0.o((Object)s, "string");
                    substring2 = s.substring(1, s.length() - 1);
                    k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                }
                k0.o((Object)substring2, "string");
                s = kotlin.text.s.j2(substring2, '$', '.', false, 4, null);
            }
        }
        else {
            k0.o((Object)s, "string");
            s = kotlin.text.s.j2(s, '$', '.', false, 4, null);
        }
        k0.o((Object)s, "string");
        return s;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final List<String> a() {
            return (List<String>)kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g.c();
        }
    }
}
