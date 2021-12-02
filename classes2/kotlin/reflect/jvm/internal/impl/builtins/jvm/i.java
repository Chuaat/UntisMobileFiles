// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.name.a;
import java.io.Serializable;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.c;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.v;
import java.util.Set;
import org.jetbrains.annotations.e;

public final class i
{
    @e
    public static final i a;
    @e
    private static final Set<String> b;
    @e
    private static final Set<String> c;
    @e
    private static final Set<String> d;
    @e
    private static final Set<String> e;
    @e
    private static final Set<String> f;
    @e
    private static final Set<String> g;
    
    static {
        final i i = a = new i();
        final v a2 = v.a;
        b = j1.D(a2.f("Collection", new String[] { "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;" }), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        c = j1.C((Set<?>)j1.C((Set<?>)j1.C((Set<?>)j1.C((Set<?>)j1.C((Set<?>)j1.C((Set<?>)i.b(), (Iterable<?>)a2.f("List", new String[] { "sort(Ljava/util/Comparator;)V" })), (Iterable<?>)a2.e("String", new String[] { "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;" })), (Iterable<?>)a2.e("Double", new String[] { "isInfinite()Z", "isNaN()Z" })), (Iterable<?>)a2.e("Float", new String[] { "isInfinite()Z", "isNaN()Z" })), (Iterable<?>)a2.e("Enum", new String[] { "getDeclaringClass()Ljava/lang/Class;", "finalize()V" })), (Iterable<?>)a2.e("CharSequence", new String[] { "isEmpty()Z" }));
        d = j1.C((Set<?>)j1.C((Set<?>)j1.C((Set<?>)j1.C((Set<?>)j1.C((Set<?>)j1.C((Set<?>)a2.e("CharSequence", new String[] { "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;" }), (Iterable<?>)a2.f("Iterator", new String[] { "forEachRemaining(Ljava/util/function/Consumer;)V" })), (Iterable<?>)a2.e("Iterable", new String[] { "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;" })), (Iterable<?>)a2.e("Throwable", new String[] { "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V" })), (Iterable<?>)a2.f("Collection", new String[] { "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z" })), (Iterable<?>)a2.f("List", new String[] { "replaceAll(Ljava/util/function/UnaryOperator;)V" })), (Iterable<?>)a2.f("Map", new String[] { "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;" }));
        e = j1.C((Set<?>)j1.C((Set<?>)a2.f("Collection", new String[] { "removeIf(Ljava/util/function/Predicate;)Z" }), (Iterable<?>)a2.f("List", new String[] { "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V" })), (Iterable<?>)a2.f("Map", new String[] { "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z" }));
        final Set<String> a3 = i.a();
        final String[] b2 = a2.b(new String[] { "D" });
        final String[] array = new String[b2.length];
        System.arraycopy(b2, 0, array, 0, b2.length);
        final Set<Object> c2 = j1.C((Set<?>)a3, (Iterable<?>)a2.e("Float", array));
        final String[] b3 = a2.b(new String[] { "[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;" });
        final String[] array2 = new String[b3.length];
        System.arraycopy(b3, 0, array2, 0, b3.length);
        f = j1.C((Set<?>)c2, (Iterable<?>)a2.e("String", array2));
        final String[] b4 = a2.b(new String[] { "Ljava/lang/String;Ljava/lang/Throwable;ZZ" });
        final String[] array3 = new String[b4.length];
        System.arraycopy(b4, 0, array3, 0, b4.length);
        g = a2.e("Throwable", array3);
    }
    
    private i() {
    }
    
    private final Set<String> a() {
        final v a = v.a;
        final d k = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K;
        final d m = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.M;
        final List<d> l = kotlin.collections.v.L(k, m, kotlin.reflect.jvm.internal.impl.resolve.jvm.d.R, kotlin.reflect.jvm.internal.impl.resolve.jvm.d.P, m, kotlin.reflect.jvm.internal.impl.resolve.jvm.d.O, kotlin.reflect.jvm.internal.impl.resolve.jvm.d.Q, kotlin.reflect.jvm.internal.impl.resolve.jvm.d.N);
        final LinkedHashSet<Object> set = new LinkedHashSet<Object>();
        final Iterator<Object> iterator = l.iterator();
        while (iterator.hasNext()) {
            final String d = iterator.next().j().g().d();
            k0.o(d, "it.wrapperFqName.shortName().asString()");
            final String[] b = a.b(new String[] { "Ljava/lang/String;" });
            final String[] array = new String[b.length];
            System.arraycopy(b, 0, array, 0, b.length);
            kotlin.collections.v.q0((Collection<? super Object>)set, (Iterable<?>)a.e(d, array));
        }
        return (Set<String>)set;
    }
    
    private final Set<String> b() {
        final v a = v.a;
        final List<d> l = kotlin.collections.v.L(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K, kotlin.reflect.jvm.internal.impl.resolve.jvm.d.L);
        final LinkedHashSet<Object> set = new LinkedHashSet<Object>();
        for (final d d : l) {
            final String d2 = d.j().g().d();
            k0.o(d2, "it.wrapperFqName.shortName().asString()");
            final StringBuilder sb = new StringBuilder();
            sb.append(d.h());
            sb.append("Value()");
            sb.append(d.g());
            kotlin.collections.v.q0((Collection<? super Object>)set, (Iterable<?>)a.e(d2, new String[] { sb.toString() }));
        }
        return (Set<String>)set;
    }
    
    @e
    public final Set<String> c() {
        return i.b;
    }
    
    @e
    public final Set<String> d() {
        return i.f;
    }
    
    @e
    public final Set<String> e() {
        return i.c;
    }
    
    @e
    public final Set<String> f() {
        return i.e;
    }
    
    @e
    public final Set<String> g() {
        return i.g;
    }
    
    @e
    public final Set<String> h() {
        return i.d;
    }
    
    public final boolean i(@e final c c) {
        k0.p(c, "fqName");
        if (!k0.g(c, StandardNames.FqNames.array)) {
            final StandardNames instance = StandardNames.INSTANCE;
            if (!StandardNames.isPrimitiveArray(c)) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean j(@e final c c) {
        k0.p(c, "fqName");
        if (this.i(c)) {
            return true;
        }
        final a o = c.a.o(c);
        if (o == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(o.b().b()));
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
}
