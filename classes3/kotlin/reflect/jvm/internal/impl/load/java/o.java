// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames$FqNames;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.HashMap;
import org.jetbrains.annotations.e;

public final class o
{
    @e
    public static final o a;
    @e
    private static final HashMap<b, b> b;
    
    static {
        final o o = a = new o();
        b = new HashMap<b, b>();
        o.c(StandardNames$FqNames.mutableList, o.a("java.util.ArrayList", "java.util.LinkedList"));
        o.c(StandardNames$FqNames.mutableSet, o.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        o.c(StandardNames$FqNames.mutableMap, o.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        o.c(new b("java.util.function.Function"), o.a("java.util.function.UnaryOperator"));
        o.c(new b("java.util.function.BiFunction"), o.a("java.util.function.BinaryOperator"));
    }
    
    private o() {
    }
    
    private final List<b> a(final String... array) {
        final ArrayList<b> list = new ArrayList<b>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(new b(array[i]));
        }
        return list;
    }
    
    private final void c(final b b, final List<b> list) {
        final HashMap<b, b> b2 = o.b;
        for (final b next : list) {
            final b b3 = next;
            b2.put(next, b);
        }
    }
    
    @f
    public final b b(@e final b key) {
        k0.p((Object)key, "classFqName");
        return o.b.get(key);
    }
}
