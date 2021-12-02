// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.v;
import kotlin.jvm.internal.w;
import java.util.Map;

public final class j
{
    @org.jetbrains.annotations.e
    private static final e a;
    @org.jetbrains.annotations.e
    private static final e b;
    @org.jetbrains.annotations.e
    private static final e c;
    @org.jetbrains.annotations.e
    private static final Map<String, k> d;
    
    static {
        a = new e(h.G, null, false, false, 8, null);
        final h h = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.H;
        b = new e(h, null, false, false, 8, null);
        c = new e(h, null, true, false, 8, null);
        final v a2 = v.a;
        final String h2 = a2.h("Object");
        final String g = a2.g("Predicate");
        final String g2 = a2.g("Function");
        final String g3 = a2.g("Consumer");
        final String g4 = a2.g("BiFunction");
        final String g5 = a2.g("BiConsumer");
        final String g6 = a2.g("UnaryOperator");
        final String i = a2.i("stream/Stream");
        final String j = a2.i("Optional");
        final m m = new m();
        new m.a(a2.i("Iterator")).a("forEachRemaining", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(g3, j.b(), j.b());
            }
        });
        new m.a(a2.h("Iterable")).a("spliterator", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.d(a2.i("Spliterator"), j.b(), j.b());
            }
        });
        final m.a a3 = new m.a(a2.i("Collection"));
        a3.a("removeIf", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(g, j.b(), j.b());
                a.e(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K);
            }
        });
        a3.a("stream", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.d(i, j.b(), j.b());
            }
        });
        a3.a("parallelStream", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.d(i, j.b(), j.b());
            }
        });
        new m.a(a2.i("List")).a("replaceAll", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(g6, j.b(), j.b());
            }
        });
        final m.a a4 = new m.a(a2.i("Map"));
        a4.a("forEach", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(g5, j.b(), j.b(), j.b());
            }
        });
        a4.a("putIfAbsent", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(h2, j.b());
                a.d(h2, j.c());
            }
        });
        a4.a("replace", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(h2, j.b());
                a.d(h2, j.c());
            }
        });
        a4.a("replace", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(h2, j.b());
                a.c(h2, j.b());
                a.e(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K);
            }
        });
        a4.a("replaceAll", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(g4, j.b(), j.b(), j.b(), j.b());
            }
        });
        a4.a("compute", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(g4, j.b(), j.b(), j.c(), j.c());
                a.d(h2, j.c());
            }
        });
        a4.a("computeIfAbsent", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(g2, j.b(), j.b(), j.b());
                a.d(h2, j.b());
            }
        });
        a4.a("computeIfPresent", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(g4, j.b(), j.b(), j.a(), j.c());
                a.d(h2, j.c());
            }
        });
        a4.a("merge", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(h2, j.a());
                a.c(g4, j.b(), j.a(), j.a(), j.c());
                a.d(h2, j.c());
            }
        });
        final m.a a5 = new m.a(j);
        a5.a("empty", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.d(j, j.b(), j.a());
            }
        });
        a5.a("of", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.a());
                a.d(j, j.b(), j.a());
            }
        });
        a5.a("ofNullable", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.c());
                a.d(j, j.b(), j.a());
            }
        });
        a5.a("get", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.d(h2, j.a());
            }
        });
        a5.a("ifPresent", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(g3, j.b(), j.a());
            }
        });
        new m.a(a2.h("ref/Reference")).a("get", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.d(h2, j.c());
            }
        });
        new m.a(g).a("test", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.e(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K);
            }
        });
        new m.a(a2.g("BiPredicate")).a("test", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(h2, j.b());
                a.e(kotlin.reflect.jvm.internal.impl.resolve.jvm.d.K);
            }
        });
        new m.a(g3).a("accept", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
            }
        });
        new m.a(g5).a("accept", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(h2, j.b());
            }
        });
        new m.a(g2).a("apply", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.d(h2, j.b());
            }
        });
        new m.a(g4).a("apply", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.c(h2, j.b());
                a.c(h2, j.b());
                a.d(h2, j.b());
            }
        });
        new m.a(a2.g("Supplier")).a("get", (l<? super m.a.a, j2>)new l<m.a.a, j2>() {
            public final void a(@org.jetbrains.annotations.e final m.a.a a) {
                k0.p((Object)a, "<this>");
                a.d(h2, j.b());
            }
        });
        d = m.b();
    }
    
    public static final /* synthetic */ e a() {
        return j.c;
    }
    
    public static final /* synthetic */ e b() {
        return j.b;
    }
    
    public static final /* synthetic */ e c() {
        return j.a;
    }
    
    @org.jetbrains.annotations.e
    public static final Map<String, k> d() {
        return j.d;
    }
}
