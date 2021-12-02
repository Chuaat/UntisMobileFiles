// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import kotlin.sequences.m;
import n6.l;
import kotlin.sequences.p;
import kotlin.e1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import kotlin.q;
import kotlin.h0;
import java.util.List;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import m6.a;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003\u001a\"\u0010\n\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\" \u0010\u0012\u001a\u00020\u0003*\u00020\b8B@\u0003X\u0083\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\" \u0010\u0012\u001a\u00020\u0003*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016" }, d2 = { "Lkotlin/reflect/s;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "jClass", "", "Lkotlin/reflect/u;", "arguments", "e", "type", "", "j", "g", "(Lkotlin/reflect/u;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/u;)V", "javaType", "f", "(Lkotlin/reflect/s;)Ljava/lang/reflect/Type;", "(Lkotlin/reflect/s;)V", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class d0
{
    @q
    private static final Type c(final s s, final boolean b) {
        final g b2 = s.b();
        if (b2 instanceof t) {
            return new b0((t)b2);
        }
        if (!(b2 instanceof d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unsupported type classifier: ");
            sb.append(s);
            throw new UnsupportedOperationException(sb.toString());
        }
        final d<Object> d = (d<Object>)b2;
        Class<Object> clazz;
        if (b) {
            clazz = a.e(d);
        }
        else {
            clazz = a.c(d);
        }
        final List<u> arguments = s.getArguments();
        if (arguments.isEmpty()) {
            return clazz;
        }
        if (!clazz.isArray()) {
            return e(clazz, arguments);
        }
        final Class componentType = clazz.getComponentType();
        k0.o(componentType, "jClass.componentType");
        if (componentType.isPrimitive()) {
            return clazz;
        }
        final u u = v.X4((List<? extends u>)arguments);
        if (u != null) {
            final w a = u.a();
            final s b3 = u.b();
            Type type;
            if (a == null) {
                type = clazz;
            }
            else {
                final int n = c0.a[a.ordinal()];
                type = clazz;
                if (n != 1) {
                    if (n != 2 && n != 3) {
                        throw new h0();
                    }
                    k0.m(b3);
                    final Type d2 = d(b3, false, 1, null);
                    if (d2 instanceof Class) {
                        type = clazz;
                    }
                    else {
                        type = new kotlin.reflect.a(d2);
                    }
                }
            }
            return type;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("kotlin.Array must have exactly one type argument: ");
        sb2.append(s);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    static /* synthetic */ Type d(final s s, boolean b, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        return c(s, b);
    }
    
    @q
    private static final Type e(final Class<?> clazz, final List<u> list) {
        final Class declaringClass = clazz.getDeclaringClass();
        if (declaringClass == null) {
            final ArrayList<Type> list2 = new ArrayList<Type>(v.Y((Iterable<?>)list, 10));
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(g(iterator.next()));
            }
            return new y(clazz, null, list2);
        }
        if (Modifier.isStatic(clazz.getModifiers())) {
            final ArrayList<Type> list3 = new ArrayList<Type>(v.Y((Iterable<?>)list, 10));
            final Iterator<u> iterator2 = (Iterator<u>)list.iterator();
            while (iterator2.hasNext()) {
                list3.add(g(iterator2.next()));
            }
            return new y(clazz, declaringClass, list3);
        }
        final int length = clazz.getTypeParameters().length;
        final Type e = e(declaringClass, list.subList(length, list.size()));
        final List<Object> subList = list.subList(0, length);
        final ArrayList list4 = new ArrayList<Type>(v.Y((Iterable<?>)subList, 10));
        final Iterator<u> iterator3 = subList.iterator();
        while (iterator3.hasNext()) {
            list4.add((Type)g(iterator3.next()));
        }
        return new y(clazz, e, (List<? extends Type>)list4);
    }
    
    @e
    public static final Type f(@e final s s) {
        k0.p(s, "$this$javaType");
        if (s instanceof l0) {
            final Type g = ((l0)s).g();
            if (g != null) {
                return g;
            }
        }
        return d(s, false, 1, null);
    }
    
    private static final Type g(final u u) {
        final w h = u.h();
        if (h != null) {
            final s g = u.g();
            k0.m(g);
            final int n = c0.b[h.ordinal()];
            Type c;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new h0();
                    }
                    c = new e0(c(g, true), null);
                }
                else {
                    c = new e0(null, c(g, true));
                }
            }
            else {
                c = c(g, true);
            }
            return c;
        }
        return e0.J.a();
    }
    
    private static final String j(final Type type) {
        String s;
        if (type instanceof Class) {
            final Class clazz = (Class)type;
            if (clazz.isArray()) {
                final m o = p.o((Object)type, (l)d0$a.G);
                final StringBuilder sb = new StringBuilder();
                sb.append(((Class)p.Y0(o)).getName());
                sb.append(kotlin.text.s.g2((CharSequence)"[]", p.Z(o)));
                s = sb.toString();
            }
            else {
                s = clazz.getName();
            }
            k0.o(s, "if (type.isArray) {\n    \u2026\n        } else type.name");
        }
        else {
            s = type.toString();
        }
        return s;
    }
}
