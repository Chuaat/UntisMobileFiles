// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import m6.k;
import kotlin.text.s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.internal.m;
import java.util.LinkedHashMap;
import n6.l;
import kotlin.collections.v;
import java.util.Map;
import org.jetbrains.annotations.e;

public final class b
{
    @e
    public static final b a;
    @e
    private static final String b;
    @e
    private static final Map<String, String> c;
    
    static {
        a = new b();
        final int n = 0;
        b = v.Z2((Iterable)v.L((Object[])new Character[] { 'k', 'o', 't', 'l', 'i', 'n' }), (CharSequence)"", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 62, (Object)null);
        final LinkedHashMap<String, String> c2 = new LinkedHashMap<String, String>();
        final List l = v.L((Object[])new String[] { "Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D" });
        final int c3 = m.c(0, l.size() - 1, 2);
        if (c3 >= 0) {
            int n2 = 0;
            while (true) {
                final StringBuilder sb = new StringBuilder();
                final String b2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b;
                sb.append(b2);
                sb.append('/');
                sb.append(l.get(n2));
                final String string = sb.toString();
                final int n3 = n2 + 1;
                c2.put(string, l.get(n3));
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(b2);
                sb2.append('/');
                sb2.append(l.get(n2));
                sb2.append("Array");
                c2.put(sb2.toString(), k0.C("[", (Object)l.get(n3)));
                if (n2 == c3) {
                    break;
                }
                n2 += 2;
            }
        }
        c2.put(k0.C(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b, (Object)"/Unit"), "V");
        a(c2, "Any", "java/lang/Object");
        a(c2, "Nothing", "java/lang/Void");
        a(c2, "Annotation", "java/lang/annotation/Annotation");
        for (final String s : v.L((Object[])new String[] { "String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum" })) {
            a(c2, s, k0.C("java/lang/", (Object)s));
        }
        for (final String s2 : v.L((Object[])new String[] { "Iterator", "Collection", "List", "Set", "Map", "ListIterator" })) {
            a(c2, k0.C("collections/", (Object)s2), k0.C("java/util/", (Object)s2));
            a(c2, k0.C("collections/Mutable", (Object)s2), k0.C("java/util/", (Object)s2));
        }
        a(c2, "collections/Iterable", "java/lang/Iterable");
        a(c2, "collections/MutableIterable", "java/lang/Iterable");
        a(c2, "collections/Map.Entry", "java/util/Map$Entry");
        a(c2, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        int i = n;
        while (true) {
            final int n4 = i + 1;
            final String c4 = k0.C("Function", (Object)i);
            final StringBuilder sb3 = new StringBuilder();
            final String b3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b;
            sb3.append(b3);
            sb3.append("/jvm/functions/Function");
            sb3.append(i);
            a(c2, c4, sb3.toString());
            a(c2, k0.C("reflect/KFunction", (Object)i), k0.C(b3, (Object)"/reflect/KFunction"));
            if (n4 > 22) {
                break;
            }
            i = n4;
        }
        for (final String str : v.L((Object[])new String[] { "Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum" })) {
            final String c5 = k0.C(str, (Object)".Companion");
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b);
            sb4.append("/jvm/internal/");
            sb4.append(str);
            sb4.append("CompanionObject");
            a(c2, c5, sb4.toString());
        }
        c = c2;
    }
    
    private b() {
    }
    
    private static final void a(final Map<String, String> map, String string, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b);
        sb.append('/');
        sb.append(string);
        string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append('L');
        sb2.append(str);
        sb2.append(';');
        map.put(string, sb2.toString());
    }
    
    @k
    @e
    public static final String b(@e final String s) {
        k0.p((Object)s, "classId");
        String string;
        if ((string = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.c.get(s)) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append('L');
            sb.append(s.j2(s, '.', '$', false, 4, null));
            sb.append(';');
            string = sb.toString();
        }
        return string;
    }
}
