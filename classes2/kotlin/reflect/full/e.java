// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.full;

import kotlin.reflect.jvm.internal.impl.utils.b$c;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.x;
import java.lang.reflect.Type;
import n6.a;
import kotlin.reflect.c;
import kotlin.reflect.jvm.internal.impl.utils.b$e;
import kotlin.reflect.jvm.internal.impl.utils.b$g;
import java.util.LinkedList;
import kotlin.reflect.jvm.internal.impl.utils.b$f;
import kotlin.reflect.jvm.internal.impl.utils.b$h;
import kotlin.reflect.jvm.internal.b0;
import kotlin.collections.y0;
import kotlin.reflect.n;
import kotlin.p1;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.utils.b$d;
import kotlin.collections.v;
import kotlin.reflect.s;
import java.util.List;
import kotlin.reflect.p;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.l;
import java.util.Objects;
import kotlin.reflect.q;
import kotlin.reflect.r;
import kotlin.e1;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.f;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.h;
import kotlin.jvm.internal.k0;
import kotlin.reflect.i;
import java.util.Collection;
import kotlin.reflect.d;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007\u001a-\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\t\u001a#\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\".\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\".\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0014*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"@\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00190\r\"\b\b\u0000\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0010\".\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001d\u0010\u0010\"*\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0012\u001a\u0004\b!\u0010\u0010\".\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0012\u001a\u0004\b$\u0010\u0010\"8\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0012\u001a\u0004\b'\u0010(\"\u001e\u0010.\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030+8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\".\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0012\u001a\u0004\b0\u0010\u0010\"@\u00105\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00190\r\"\b\b\u0000\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0012\u001a\u0004\b3\u0010\u0010\"&\u00108\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0012\u001a\u0004\b6\u0010\f\".\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0012\u001a\u0004\b9\u0010\u0010\".\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010\u0012\u001a\u0004\b=\u0010\u0010\"D\u0010C\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030@0\r\"\b\b\u0000\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0012\u001a\u0004\bA\u0010\u0010\".\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0012\u001a\u0004\bD\u0010\u0010\"$\u0010J\u001a\u00020 *\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010\u0012\u001a\u0004\bG\u0010H\"*\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bM\u0010\u0012\u001a\u0004\bK\u0010L\"\u001e\u0010P\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030+8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010-\"D\u0010S\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030@0\r\"\b\b\u0000\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010\u0012\u001a\u0004\bQ\u0010\u0010\".\u0010V\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010\u0012\u001a\u0004\bT\u0010\u0010\".\u0010Y\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0012\u001a\u0004\bW\u0010\u0010\".\u0010\\\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010\u0012\u001a\u0004\bZ\u0010\u0010¨\u0006]" }, d2 = { "Lkotlin/reflect/d;", "base", "", "S", "derived", "T", "", "value", "a", "(Lkotlin/reflect/d;Ljava/lang/Object;)Ljava/lang/Object;", "U", "b", "(Lkotlin/reflect/d;)Ljava/lang/Object;", "", "Lkotlin/reflect/i;", "m", "(Lkotlin/reflect/d;)Ljava/util/Collection;", "getDeclaredMemberExtensionFunctions$annotations", "(Lkotlin/reflect/d;)V", "declaredMemberExtensionFunctions", "", "O", "(Lkotlin/reflect/d;)Ljava/util/List;", "getSuperclasses$annotations", "superclasses", "Lkotlin/reflect/q;", "G", "getMemberProperties$annotations", "memberProperties", "c", "getAllSuperclasses$annotations", "allSuperclasses", "Lkotlin/reflect/s;", "e", "getAllSupertypes$annotations", "allSupertypes", "k", "getDeclaredFunctions$annotations", "declaredFunctions", "I", "(Lkotlin/reflect/d;)Lkotlin/reflect/i;", "getPrimaryConstructor$annotations", "primaryConstructor", "Lkotlin/reflect/jvm/internal/f;", "R", "(Lkotlin/reflect/jvm/internal/f;)Z", "isNotExtension", "Lkotlin/reflect/c;", "u", "getDeclaredMembers$annotations", "declaredMembers", "s", "getDeclaredMemberProperties$annotations", "declaredMemberProperties", "i", "getCompanionObjectInstance$annotations", "companionObjectInstance", "y", "getFunctions$annotations", "functions", "Lkotlin/reflect/p;", "M", "getStaticProperties$annotations", "staticProperties", "Lkotlin/reflect/r;", "C", "getMemberExtensionProperties$annotations", "memberExtensionProperties", "K", "getStaticFunctions$annotations", "staticFunctions", "w", "(Lkotlin/reflect/d;)Lkotlin/reflect/s;", "getDefaultType$annotations", "defaultType", "g", "(Lkotlin/reflect/d;)Lkotlin/reflect/d;", "getCompanionObject$annotations", "companionObject", "Q", "isExtension", "o", "getDeclaredMemberExtensionProperties$annotations", "declaredMemberExtensionProperties", "E", "getMemberFunctions$annotations", "memberFunctions", "q", "getDeclaredMemberFunctions$annotations", "declaredMemberFunctions", "A", "getMemberExtensionFunctions$annotations", "memberExtensionFunctions", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "KClasses")
public final class e
{
    @org.jetbrains.annotations.e
    public static final Collection<i<?>> A(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$memberExtensionFunctions");
        final Collection<f<?>> h = ((h.a)((h)d).i0().invoke()).h();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<i<?>>();
        for (final i<?> next : h) {
            final f<?> f = (f<?>)next;
            if (Q(f) && f instanceof i) {
                list.add(next);
            }
        }
        return (Collection<i<?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final <T> Collection<r<T, ?, ?>> C(@org.jetbrains.annotations.e final d<T> d) {
        k0.p(d, "$this$memberExtensionProperties");
        final Collection<f<?>> h = ((h.a)((h)d).i0().invoke()).h();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<r<T, ?, ?>>();
        for (final r<T, ?, ?> next : h) {
            final f<?> f = (f<?>)next;
            if (Q(f) && f instanceof r) {
                list.add(next);
            }
        }
        return (Collection<r<T, ?, ?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<i<?>> E(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$memberFunctions");
        final Collection<f<?>> h = ((h.a)((h)d).i0().invoke()).h();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<i<?>>();
        for (final i<?> next : h) {
            final f<?> f = (f<?>)next;
            if (R(f) && f instanceof i) {
                list.add(next);
            }
        }
        return (Collection<i<?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final <T> Collection<q<T, ?>> G(@org.jetbrains.annotations.e final d<T> d) {
        k0.p(d, "$this$memberProperties");
        final Collection<f<?>> h = ((h.a)((h)d).i0().invoke()).h();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<q<T, ?>>();
        for (final q<T, ?> next : h) {
            final f<?> f = (f<?>)next;
            if (R(f) && f instanceof q) {
                list.add(next);
            }
        }
        return (Collection<q<T, ?>>)list;
    }
    
    @org.jetbrains.annotations.f
    public static final <T> i<T> I(@org.jetbrains.annotations.e final d<T> d) {
        k0.p(d, "$this$primaryConstructor");
        for (final i<T> next : ((h)d).j()) {
            final i<T> obj = next;
            Objects.requireNonNull((l)obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            final y y0 = ((l)obj).y0();
            Objects.requireNonNull(y0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((kotlin.reflect.jvm.internal.impl.descriptors.l)y0).H()) {
                return next;
            }
        }
        return null;
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<i<?>> K(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$staticFunctions");
        final Collection<f<?>> i = ((h.a)((h)d).i0().invoke()).i();
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<i<?>>();
        for (final i<?> next : i) {
            if (next instanceof i) {
                list.add(next);
            }
        }
        return (Collection<i<?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<p<?>> M(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$staticProperties");
        final Collection<f<?>> i = ((h.a)((h)d).i0().invoke()).i();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<p<?>>();
        for (final p<?> next : i) {
            final f<?> f = (f<?>)next;
            if (R(f) && f instanceof p) {
                list.add(next);
            }
        }
        return (Collection<p<?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final List<d<?>> O(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$superclasses");
        final List k = d.k();
        final ArrayList<d> list = (ArrayList<d>)new ArrayList<d<?>>();
        final Iterator<s> iterator = k.iterator();
        while (iterator.hasNext()) {
            kotlin.reflect.g b;
            if (!((b = iterator.next().b()) instanceof d)) {
                b = null;
            }
            final d<?> d2 = (d<?>)b;
            if (d2 != null) {
                list.add(d2);
            }
        }
        return (List<d<?>>)list;
    }
    
    private static final boolean Q(final f<?> f) {
        return f.l0().q0() != null;
    }
    
    private static final boolean R(final f<?> f) {
        return Q(f) ^ true;
    }
    
    @e1(version = "1.1")
    public static final boolean S(@org.jetbrains.annotations.e final d<?> d, @org.jetbrains.annotations.e final d<?> d2) {
        k0.p(d, "$this$isSubclassOf");
        k0.p(d2, "base");
        if (!k0.g(d, d2)) {
            final List<d<?>> k = v.k(d);
            final q g = kotlin.reflect.full.f.G;
            Object o;
            if ((o = g) != null) {
                o = new kotlin.reflect.full.g(g);
            }
            final Boolean e = b.e((Collection)k, (b$d)o, (n6.l)new n6.l<d<?>, Boolean>() {
                public final Boolean a(final d<?> d) {
                    return k0.g(d, d2);
                }
            });
            k0.o(e, "DFS.ifAny(listOf(this), \u2026erclasses) { it == base }");
            if (!e) {
                return false;
            }
        }
        return true;
    }
    
    @e1(version = "1.1")
    public static final boolean T(@org.jetbrains.annotations.e final d<?> d, @org.jetbrains.annotations.e final d<?> d2) {
        k0.p(d, "$this$isSuperclassOf");
        k0.p(d2, "derived");
        return S(d2, d);
    }
    
    @e1(version = "1.1")
    @org.jetbrains.annotations.f
    public static final <T> T U(@org.jetbrains.annotations.e final d<T> d, @org.jetbrains.annotations.f Object obj) {
        k0.p(d, "$this$safeCast");
        if (d.S(obj)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type T");
        }
        else {
            obj = null;
        }
        return (T)obj;
    }
    
    @e1(version = "1.1")
    @org.jetbrains.annotations.e
    public static final <T> T a(@org.jetbrains.annotations.e final d<T> d, @org.jetbrains.annotations.f final Object obj) {
        k0.p(d, "$this$cast");
        if (d.S(obj)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type T");
            return (T)obj;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Value cannot be cast to ");
        sb.append(d.E());
        throw new p1(sb.toString());
    }
    
    @e1(version = "1.1")
    @org.jetbrains.annotations.e
    public static final <T> T b(@org.jetbrains.annotations.e final d<T> obj) {
        k0.p(obj, "$this$createInstance");
        final Iterator<i<Object>> iterator = obj.j().iterator();
        final i<Object> i = null;
        i<Object> j = null;
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                final i<Object> next = iterator.next();
                final List<n> parameters = ((i<R>)next).getParameters();
                boolean b = false;
                Label_0119: {
                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                        final Iterator<Object> iterator2 = parameters.iterator();
                        while (iterator2.hasNext()) {
                            if (!iterator2.next().Z()) {
                                b = false;
                                break Label_0119;
                            }
                        }
                    }
                    b = true;
                }
                if (b) {
                    if (n != 0) {
                        j = i;
                        final i<Object> k = j;
                        if (k != null) {
                            return (T)k.callBy(y0.z());
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Class should have a single no-arg constructor: ");
                        sb.append(obj);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    else {
                        j = next;
                        n = 1;
                    }
                }
            }
            if (n == 0) {
                j = i;
            }
            continue;
        }
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<d<?>> c(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$allSuperclasses");
        final Collection<s> e = e(d);
        final ArrayList list = new ArrayList<d>(v.Y((Iterable<?>)e, 10));
        for (final s obj : e) {
            kotlin.reflect.g b;
            if (!((b = obj.b()) instanceof d)) {
                b = null;
            }
            final d d2 = (d)b;
            if (d2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Supertype not a class: ");
                sb.append(obj);
                throw new b0(sb.toString());
            }
            list.add(d2);
        }
        return (Collection<d<?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<s> e(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$allSupertypes");
        final Object c = b.c((Collection)d.k(), (b$d)e$a.a, (b$g)new b$h(), (b$e)new b$f<s, s>() {
            public boolean f(@org.jetbrains.annotations.e final s e) {
                k0.p(e, "current");
                ((LinkedList)((b$c)this).a).add(e);
                return true;
            }
        });
        k0.o(c, "DFS.dfs(\n            sup\u2026    }\n            }\n    )");
        return (Collection<s>)c;
    }
    
    @org.jetbrains.annotations.f
    public static final d<?> g(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$companionObject");
        for (final d<?> next : d.F()) {
            final d<?> obj = next;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            if (((h<?>)obj).j0().G()) {
                return next;
            }
        }
        return null;
    }
    
    @org.jetbrains.annotations.f
    public static final Object i(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$companionObjectInstance");
        final d<?> g = g(d);
        Object j;
        if (g != null) {
            j = g.J();
        }
        else {
            j = null;
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<i<?>> k(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$declaredFunctions");
        final Collection<f<?>> l = ((h.a)((h)d).i0().invoke()).l();
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<i<?>>();
        for (final i<?> next : l) {
            if (next instanceof i) {
                list.add(next);
            }
        }
        return (Collection<i<?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<i<?>> m(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$declaredMemberExtensionFunctions");
        final Collection<f<?>> m = ((h.a)((h)d).i0().invoke()).m();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<i<?>>();
        for (final i<?> next : m) {
            final f<?> f = (f<?>)next;
            if (Q(f) && f instanceof i) {
                list.add(next);
            }
        }
        return (Collection<i<?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final <T> Collection<r<T, ?, ?>> o(@org.jetbrains.annotations.e final d<T> d) {
        k0.p(d, "$this$declaredMemberExtensionProperties");
        final Collection<f<?>> m = ((h.a)((h)d).i0().invoke()).m();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<r<T, ?, ?>>();
        for (final r<T, ?, ?> next : m) {
            final f<?> f = (f<?>)next;
            if (Q(f) && f instanceof r) {
                list.add(next);
            }
        }
        return (Collection<r<T, ?, ?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<i<?>> q(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$declaredMemberFunctions");
        final Collection<f<?>> m = ((h.a)((h)d).i0().invoke()).m();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<i<?>>();
        for (final i<?> next : m) {
            final f<?> f = (f<?>)next;
            if (R(f) && f instanceof i) {
                list.add(next);
            }
        }
        return (Collection<i<?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final <T> Collection<q<T, ?>> s(@org.jetbrains.annotations.e final d<T> d) {
        k0.p(d, "$this$declaredMemberProperties");
        final Collection<f<?>> m = ((h.a)((h)d).i0().invoke()).m();
        final ArrayList<f<?>> list = (ArrayList<f<?>>)new ArrayList<q<T, ?>>();
        for (final q<T, ?> next : m) {
            final f<?> f = (f<?>)next;
            if (R(f) && f instanceof q) {
                list.add(next);
            }
        }
        return (Collection<q<T, ?>>)list;
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<c<?>> u(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$declaredMembers");
        return (Collection<c<?>>)((h.a)((h)d).i0().invoke()).l();
    }
    
    @org.jetbrains.annotations.e
    public static final s w(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$defaultType");
        final kotlin.reflect.jvm.internal.impl.types.k0 a = ((h)d).j0().A();
        k0.o(a, "(this as KClassImpl<*>).descriptor.defaultType");
        return new x((c0)a, new a<Type>() {
            @org.jetbrains.annotations.e
            public final Type a() {
                return ((h)d).m();
            }
        });
    }
    
    @org.jetbrains.annotations.e
    public static final Collection<i<?>> y(@org.jetbrains.annotations.e final d<?> d) {
        k0.p(d, "$this$functions");
        final Collection x = d.x();
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<i<?>>();
        for (final i<?> next : x) {
            if (next instanceof i) {
                list.add(next);
            }
        }
        return (Collection<i<?>>)list;
    }
}
