// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm;

import kotlin.reflect.q;
import kotlin.reflect.c;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f$a;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.p;
import kotlin.reflect.h;
import java.lang.reflect.Member;
import kotlin.reflect.d0;
import kotlin.reflect.jvm.internal.x;
import java.lang.reflect.Type;
import kotlin.reflect.s;
import kotlin.reflect.j;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.u;
import java.lang.reflect.Field;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.reflect.jvm.internal.f;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Constructor;
import kotlin.reflect.i;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\"\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\f\u001a\u00020\t*\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\r8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u0006\u0012\u0002\b\u00030\r8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u001d\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r*\u00020\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"/\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\"\b\b\u0000\u0010\u001d*\u00020\u001c*\b\u0012\u0004\u0012\u00028\u00000\u001e8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001d\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011*\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010#\"1\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e\"\u0004\b\u0000\u0010\u001d*\b\u0012\u0004\u0012\u00028\u00000\u00118F@\u0006¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006)" }, d2 = { "Ljava/lang/reflect/Member;", "Lkotlin/reflect/h;", "h", "Lkotlin/reflect/j;", "Ljava/lang/reflect/Method;", "f", "(Lkotlin/reflect/j;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/s;", "Ljava/lang/reflect/Type;", "g", "(Lkotlin/reflect/s;)Ljava/lang/reflect/Type;", "javaType", "Lkotlin/reflect/o;", "d", "(Lkotlin/reflect/o;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/i;", "e", "(Lkotlin/reflect/i;)Ljava/lang/reflect/Method;", "javaMethod", "Ljava/lang/reflect/Field;", "c", "(Lkotlin/reflect/o;)Ljava/lang/reflect/Field;", "javaField", "k", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/o;", "kotlinProperty", "", "T", "Ljava/lang/reflect/Constructor;", "i", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/i;", "kotlinFunction", "j", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/i;", "a", "(Lkotlin/reflect/i;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/i;)V", "javaConstructor", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "ReflectJvmMapping")
public final class e
{
    @org.jetbrains.annotations.f
    public static final <T> Constructor<T> a(@org.jetbrains.annotations.e final i<? extends T> i) {
        k0.p(i, "$this$javaConstructor");
        final f<?> a = kotlin.reflect.jvm.internal.k0.a(i);
        final Constructor<T> constructor = null;
        Constructor<T> b = null;
        Label_0038: {
            if (a != null) {
                final d i2 = a.i0();
                if (i2 != null) {
                    b = i2.b();
                    break Label_0038;
                }
            }
            b = null;
        }
        if (!(b instanceof Constructor)) {
            b = constructor;
        }
        return b;
    }
    
    @org.jetbrains.annotations.f
    public static final Field c(@org.jetbrains.annotations.e final o<?> o) {
        k0.p(o, "$this$javaField");
        final u<?> c = kotlin.reflect.jvm.internal.k0.c(o);
        Field u0;
        if (c != null) {
            u0 = c.u0();
        }
        else {
            u0 = null;
        }
        return u0;
    }
    
    @org.jetbrains.annotations.f
    public static final Method d(@org.jetbrains.annotations.e final o<?> o) {
        k0.p(o, "$this$javaGetter");
        return e(o.e());
    }
    
    @org.jetbrains.annotations.f
    public static final Method e(@org.jetbrains.annotations.e final i<?> i) {
        k0.p(i, "$this$javaMethod");
        final f<?> a = kotlin.reflect.jvm.internal.k0.a(i);
        final Method method = null;
        Method b = null;
        Label_0038: {
            if (a != null) {
                final d i2 = a.i0();
                if (i2 != null) {
                    b = i2.b();
                    break Label_0038;
                }
            }
            b = null;
        }
        if (!(b instanceof Method)) {
            b = method;
        }
        return b;
    }
    
    @org.jetbrains.annotations.f
    public static final Method f(@org.jetbrains.annotations.e final j<?> j) {
        k0.p(j, "$this$javaSetter");
        return e(j.h());
    }
    
    @org.jetbrains.annotations.e
    public static final Type g(@org.jetbrains.annotations.e final s s) {
        k0.p(s, "$this$javaType");
        final Type g = ((x)s).g();
        Type f;
        if (g != null) {
            f = g;
        }
        else {
            f = d0.f(s);
        }
        return f;
    }
    
    private static final h h(final Member member) {
        final f$a c = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.c;
        final Class<?> declaringClass = member.getDeclaringClass();
        k0.o(declaringClass, "declaringClass");
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f a = c.a((Class)declaringClass);
        final h h = null;
        Object c2 = null;
        Label_0048: {
            if (a != null) {
                final a a2 = a.a();
                if (a2 != null) {
                    c2 = a2.c();
                    break Label_0048;
                }
            }
            c2 = null;
        }
        h h2;
        if (c2 == null) {
            h2 = h;
        }
        else {
            final int n = kotlin.reflect.jvm.d.a[((Enum)c2).ordinal()];
            if (n != 1 && n != 2 && n != 3) {
                h2 = h;
            }
            else {
                final Class<?> declaringClass2 = member.getDeclaringClass();
                k0.o(declaringClass2, "declaringClass");
                h2 = new p(declaringClass2, null, 2, null);
            }
        }
        return h2;
    }
    
    @org.jetbrains.annotations.f
    public static final <T> i<T> i(@org.jetbrains.annotations.e final Constructor<T> constructor) {
        k0.p(constructor, "$this$kotlinFunction");
        final Class<T> declaringClass = constructor.getDeclaringClass();
        k0.o(declaringClass, "declaringClass");
        for (final i<T> next : m6.a.g(declaringClass).j()) {
            if (k0.g(a((i<?>)next), constructor)) {
                return next;
            }
        }
        return null;
    }
    
    @org.jetbrains.annotations.f
    public static final i<?> j(@org.jetbrains.annotations.e final Method method) {
        k0.p(method, "$this$kotlinFunction");
        final boolean static1 = Modifier.isStatic(method.getModifiers());
        final i<?> i = null;
        final i<?> j = null;
        Label_0302: {
            if (static1) {
                final h h = h(method);
                if (h != null) {
                    final Collection<c<?>> x = h.x();
                    final ArrayList<i<?>> list = new ArrayList<i<?>>();
                    for (final i<?> next : x) {
                        if (next instanceof i) {
                            list.add(next);
                        }
                    }
                    final Iterator<Object> iterator2 = list.iterator();
                    i<?> next2;
                    do {
                        next2 = j;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        next2 = iterator2.next();
                    } while (!k0.g(e(next2), method));
                    return next2;
                }
                final Class<?> declaringClass = method.getDeclaringClass();
                k0.o(declaringClass, "declaringClass");
                final kotlin.reflect.d<?> g = kotlin.reflect.full.e.g(m6.a.g(declaringClass));
                if (g != null) {
                    while (true) {
                        for (final i<?> next3 : kotlin.reflect.full.e.y(g)) {
                            final Method e = e(next3);
                            boolean b = false;
                            Label_0276: {
                                if (e != null && k0.g(e.getName(), method.getName())) {
                                    final Class<?>[] parameterTypes = e.getParameterTypes();
                                    k0.m(parameterTypes);
                                    if (Arrays.equals(parameterTypes, method.getParameterTypes()) && k0.g(e.getReturnType(), method.getReturnType())) {
                                        b = true;
                                        break Label_0276;
                                    }
                                }
                                b = false;
                            }
                            if (b) {
                                final i<?> k = next3;
                                if (k != null) {
                                    return k;
                                }
                                break Label_0302;
                            }
                        }
                        i<?> next3 = null;
                        continue;
                    }
                }
            }
        }
        final Class<?> declaringClass2 = method.getDeclaringClass();
        k0.o(declaringClass2, "declaringClass");
        final Iterator<Object> iterator4 = kotlin.reflect.full.e.y(m6.a.g(declaringClass2)).iterator();
        i<?> next4;
        do {
            next4 = i;
            if (!iterator4.hasNext()) {
                break;
            }
            next4 = iterator4.next();
        } while (!k0.g(e(next4), method));
        return next4;
    }
    
    @org.jetbrains.annotations.f
    public static final o<?> k(@org.jetbrains.annotations.e final Field field) {
        k0.p(field, "$this$kotlinProperty");
        final boolean synthetic = field.isSynthetic();
        final q<?, ?> q = null;
        final o<?> o = null;
        if (synthetic) {
            return null;
        }
        final h h = h(field);
        if (h != null) {
            final Collection<c<?>> x = h.x();
            final ArrayList<o<?>> list = new ArrayList<o<?>>();
            for (final o<?> next : x) {
                if (next instanceof o) {
                    list.add(next);
                }
            }
            final Iterator<Object> iterator2 = list.iterator();
            o<?> next2;
            do {
                next2 = o;
                if (!iterator2.hasNext()) {
                    break;
                }
                next2 = iterator2.next();
            } while (!k0.g(c(next2), field));
            return next2;
        }
        final Class<?> declaringClass = field.getDeclaringClass();
        k0.o(declaringClass, "declaringClass");
        final Iterator<Object> iterator3 = kotlin.reflect.full.e.G((kotlin.reflect.d<Object>)m6.a.g(declaringClass)).iterator();
        q<?, ?> next3;
        do {
            next3 = q;
            if (!iterator3.hasNext()) {
                break;
            }
            next3 = iterator3.next();
        } while (!k0.g(c(next3), field));
        return next3;
    }
}
