// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k$a;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.text.m;
import java.util.Comparator;
import java.util.Map;
import kotlin.collections.y0;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.Iterator;
import n6.l;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.util.Objects;
import kotlin.j2;
import org.jetbrains.annotations.f;
import java.util.Arrays;
import java.lang.reflect.Constructor;
import java.io.Serializable;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b;
import java.lang.reflect.Method;
import kotlin.text.s;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.text.o;
import kotlin.Metadata;
import kotlin.jvm.internal.t;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 12\u00020\u0001:\u0003=>?B\u0007¢\u0006\u0004\b;\u0010<JG\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\r\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000fH\u0002J*\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J$\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0014\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0012\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u0019H&J\"\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0004J\u0016\u0010-\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0018\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J \u00101\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bJ\u0014\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003J\u0014\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003R\u001a\u00106\u001a\u0006\u0012\u0002\b\u00030\u00028T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u001f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006@" }, d2 = { "Lkotlin/reflect/jvm/internal/k;", "Lkotlin/jvm/internal/t;", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "a0", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "e0", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "d0", "", "result", "desc", "isConstructor", "Lkotlin/j2;", "B", "V", "", "begin", "end", "b0", "Y", "Lkotlin/reflect/jvm/internal/impl/name/e;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "U", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "P", "index", "Q", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "scope", "Lkotlin/reflect/jvm/internal/k$c;", "belonginess", "Lkotlin/reflect/jvm/internal/f;", "R", "signature", "N", "K", "L", "isMember", "I", "C", "G", "T", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "O", "()Ljava/util/Collection;", "constructorDescriptors", "<init>", "()V", "a", "b", "c", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public abstract class k implements t
{
    private static final Class<?> G;
    @e
    private static final o H;
    @e
    public static final a I;
    
    static {
        I = new a(null);
        G = w.class;
        H = new o("<v#(\\d+)>");
    }
    
    public static final /* synthetic */ o A() {
        return k.H;
    }
    
    private final void B(final List<Class<?>> list, final String s, final boolean b) {
        final List<Class<?>> v = this.V(s);
        list.addAll(v);
        for (int n = (v.size() + 32 - 1) / 32, i = 0; i < n; ++i) {
            final Class<Integer> type = Integer.TYPE;
            k0.o(type, "Integer.TYPE");
            list.add(type);
        }
        Class<?> g;
        if (b) {
            g = k.G;
        }
        else {
            g = Object.class;
        }
        k0.o(g, "if (isConstructor) DEFAU\u2026RKER else Any::class.java");
        list.add(g);
    }
    
    private final List<Class<?>> V(final String str) {
        final ArrayList<Class<?>> list = new ArrayList<Class<?>>();
        int n;
        for (int index = 1; str.charAt(index) != ')'; index = n) {
            for (n = index; str.charAt(n) == '['; ++n) {}
            final char char1 = str.charAt(n);
            if (s.U2((CharSequence)"VZCBSIFJD", char1, false, 2, (Object)null)) {
                ++n;
            }
            else {
                if (char1 != 'L') {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown type prefix in the method signature: ");
                    sb.append(str);
                    throw new b0(sb.toString());
                }
                n = s.q3((CharSequence)str, ';', index, false, 4, (Object)null) + 1;
            }
            list.add(this.b0(str, index, n));
        }
        return list;
    }
    
    private final Class<?> Y(final String s) {
        return this.b0(s, s.q3((CharSequence)s, ')', 0, false, 6, (Object)null) + 1, s.length());
    }
    
    private final Method a0(final Class<?> clazz, final String s, final Class<?>[] array, final Class<?> clazz2, final boolean b) {
        if (b) {
            array[0] = clazz;
        }
        final Method e0 = this.e0(clazz, s, array, clazz2);
        if (e0 != null) {
            return e0;
        }
        final Class<?> superclass = clazz.getSuperclass();
        if (superclass != null) {
            final Method a0 = this.a0(superclass, s, array, clazz2, b);
            if (a0 != null) {
                return a0;
            }
        }
        for (final Class<?> clazz3 : clazz.getInterfaces()) {
            k0.o(clazz3, "superInterface");
            final Method a2 = this.a0(clazz3, s, array, clazz2, b);
            if (a2 != null) {
                return a2;
            }
            if (b) {
                final ClassLoader g = b.g((Class)clazz3);
                final StringBuilder sb = new StringBuilder();
                sb.append(clazz3.getName());
                sb.append("$DefaultImpls");
                final Class a3 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(g, sb.toString());
                if (a3 != null) {
                    array[0] = clazz3;
                    final Method e2 = this.e0(a3, s, array, clazz2);
                    if (e2 != null) {
                        return e2;
                    }
                }
            }
        }
        return null;
    }
    
    private final Class<?> b0(String substring, final int index, final int n) {
        final char char1 = substring.charAt(index);
        Serializable s;
        if (char1 != 'F') {
            String s2;
            if (char1 != 'L') {
                if (char1 == 'S') {
                    s = Short.TYPE;
                    return (Class<?>)s;
                }
                if (char1 != 'V') {
                    if (char1 == 'I') {
                        s = Integer.TYPE;
                        return (Class<?>)s;
                    }
                    if (char1 == 'J') {
                        s = Long.TYPE;
                        return (Class<?>)s;
                    }
                    if (char1 == 'Z') {
                        s = Boolean.TYPE;
                        return (Class<?>)s;
                    }
                    if (char1 == '[') {
                        s = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.a((Class)this.b0(substring, index + 1, n));
                        return (Class<?>)s;
                    }
                    switch (char1) {
                        default: {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unknown type prefix in the method signature: ");
                            sb.append(substring);
                            throw new b0(sb.toString());
                        }
                        case 68: {
                            s = Double.TYPE;
                            return (Class<?>)s;
                        }
                        case 67: {
                            s = Character.TYPE;
                            return (Class<?>)s;
                        }
                        case 66: {
                            s = Byte.TYPE;
                            return (Class<?>)s;
                        }
                    }
                }
                else {
                    s = Void.TYPE;
                    s2 = "Void.TYPE";
                }
            }
            else {
                final ClassLoader g = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.g((Class)this.m());
                substring = substring.substring(index + 1, n - 1);
                k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                s = g.loadClass(kotlin.text.s.j2(substring, '/', '.', false, 4, (Object)null));
                s2 = "jClass.safeClassLoader.l\u2026d - 1).replace('/', '.'))";
            }
            k0.o(s, s2);
        }
        else {
            s = Float.TYPE;
        }
        return (Class<?>)s;
    }
    
    private final Constructor<?> d0(final Class<?> clazz, final List<? extends Class<?>> list) {
        Constructor<?> declaredConstructor;
        try {
            final Object[] array = list.toArray((Object[])new Class[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            final Class<?>[] original = (Class<?>[])array;
            declaredConstructor = clazz.getDeclaredConstructor((Class<?>[])Arrays.copyOf(original, original.length));
        }
        catch (NoSuchMethodException ex) {
            declaredConstructor = null;
        }
        return declaredConstructor;
    }
    
    private final Method e0(final Class<?> clazz, final String name, final Class<?>[] array, final Class<?> clazz2) {
        final Method method = null;
        try {
            final Method declaredMethod = clazz.getDeclaredMethod(name, (Class[])Arrays.copyOf(array, array.length));
            k0.o(declaredMethod, "result");
            Method method2;
            if (k0.g(declaredMethod.getReturnType(), clazz2)) {
                method2 = declaredMethod;
            }
            else {
                final Method[] declaredMethods = clazz.getDeclaredMethods();
                k0.o(declaredMethods, "declaredMethods");
                final int length = declaredMethods.length;
                int n = 0;
                while (true) {
                    method2 = method;
                    if (n >= length) {
                        break;
                    }
                    method2 = declaredMethods[n];
                    k0.o(method2, "method");
                    boolean b = false;
                    Label_0147: {
                        if (k0.g(method2.getName(), name) && k0.g(method2.getReturnType(), clazz2)) {
                            final Class<?>[] parameterTypes = method2.getParameterTypes();
                            k0.m(parameterTypes);
                            if (Arrays.equals(parameterTypes, array)) {
                                b = true;
                                break Label_0147;
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        break;
                    }
                    ++n;
                }
            }
            return method2;
        }
        catch (NoSuchMethodException ex) {
            return method;
        }
    }
    
    @f
    public final Constructor<?> C(@e final String s) {
        k0.p(s, "desc");
        return this.d0(this.m(), this.V(s));
    }
    
    @f
    public final Constructor<?> G(@e final String s) {
        k0.p(s, "desc");
        final Class<?> m = this.m();
        final ArrayList<Class<?>> list = new ArrayList<Class<?>>();
        this.B(list, s, true);
        final j2 a = j2.a;
        return this.d0(m, list);
    }
    
    @f
    public final Method I(@e String string, @e final String s, final boolean b) {
        k0.p(string, "name");
        k0.p(s, "desc");
        if (k0.g(string, "<init>")) {
            return null;
        }
        final ArrayList<Class<?>> list = new ArrayList<Class<?>>();
        if (b) {
            list.add(this.m());
        }
        this.B(list, s, false);
        final Class<?> t = this.T();
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("$default");
        string = sb.toString();
        final Class<?>[] array = list.toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return this.a0(t, string, array, this.Y(s), b);
    }
    
    @e
    public final y K(@e String string, @e final String str) {
        k0.p(string, "name");
        k0.p(str, "signature");
        Object o;
        if (k0.g(string, "<init>")) {
            o = v.I5((Iterable<?>)this.O());
        }
        else {
            final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(string);
            k0.o(i, "Name.identifier(name)");
            o = this.P(i);
        }
        final ArrayList<y> list = new ArrayList<y>();
        for (final y next : o) {
            if (k0.g(h0.b.g(next).a(), str)) {
                list.add(next);
            }
        }
        final int size = list.size();
        boolean b = true;
        if (size != 1) {
            final String z2 = v.Z2((Iterable)o, "\n", null, null, 0, null, k$d.G, 30, null);
            final StringBuilder sb = new StringBuilder();
            sb.append("Function '");
            sb.append(string);
            sb.append("' (JVM signature: ");
            sb.append(str);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            if (z2.length() != 0) {
                b = false;
            }
            if (b) {
                string = " no members found";
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append('\n');
                sb2.append(z2);
                string = sb2.toString();
            }
            sb.append(string);
            throw new b0(sb.toString());
        }
        return (y)v.U4((List<?>)list);
    }
    
    @f
    public final Method L(@e final String s, @e final String s2) {
        k0.p(s, "name");
        k0.p(s2, "desc");
        if (k0.g(s, "<init>")) {
            return null;
        }
        final Class<?>[] array = this.V(s2).toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        final Class<?>[] array2 = array;
        final Class<?> y = this.Y(s2);
        final Method a0 = this.a0(this.T(), s, array2, y, false);
        if (a0 != null) {
            return a0;
        }
        if (this.T().isInterface()) {
            final Method a2 = this.a0(Object.class, s, array2, y, false);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
    
    @e
    public final q0 N(@e String string, @e final String s) {
        k0.p(string, "name");
        k0.p(s, "signature");
        final m h = k.H.h((CharSequence)s);
        boolean b = true;
        if (h != null) {
            string = (String)h.a().k().b().get(1);
            final q0 q = this.Q(Integer.parseInt(string));
            if (q != null) {
                return q;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Local property #");
            sb.append(string);
            sb.append(" not found in ");
            sb.append(this.m());
            throw new b0(sb.toString());
        }
        else {
            final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(string);
            k0.o(i, "Name.identifier(name)");
            final Collection<q0> u = this.U(i);
            final ArrayList<q0> list = new ArrayList<q0>();
            for (final q0 next : u) {
                if (k0.g(h0.b.f(next).a(), s)) {
                    list.add(next);
                }
            }
            if (!list.isEmpty()) {
                Object o;
                if (list.size() != 1) {
                    final LinkedHashMap<Object, List<q0>> linkedHashMap = (LinkedHashMap<Object, List<q0>>)new LinkedHashMap<Object, Object>();
                    for (final q0 next2 : list) {
                        final u visibility = next2.getVisibility();
                        List<q0> value;
                        if ((value = linkedHashMap.get(visibility)) == null) {
                            value = new ArrayList<q0>();
                            linkedHashMap.put(visibility, value);
                        }
                        value.add(next2);
                    }
                    final Collection<Object> values = y0.r((Map<?, ?>)linkedHashMap, (Comparator<? super Object>)k$f.G).values();
                    k0.o(values, "properties\n             \u2026                }).values");
                    final List<? extends T> list2 = v.a3((Iterable<? extends List<? extends T>>)values);
                    if (list2.size() != 1) {
                        final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.name.e.i(string);
                        k0.o(j, "Name.identifier(name)");
                        final String z2 = v.Z2(this.U(j), "\n", null, null, 0, null, k$e.G, 30, null);
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Property '");
                        sb2.append(string);
                        sb2.append("' (JVM signature: ");
                        sb2.append(s);
                        sb2.append(") not resolved in ");
                        sb2.append(this);
                        sb2.append(':');
                        if (z2.length() != 0) {
                            b = false;
                        }
                        if (b) {
                            string = " no members found";
                        }
                        else {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append('\n');
                            sb3.append(z2);
                            string = sb3.toString();
                        }
                        sb2.append(string);
                        throw new b0(sb2.toString());
                    }
                    k0.o(list2, "mostVisibleProperties");
                    o = v.o2((List<?>)list2);
                }
                else {
                    o = v.U4((List<?>)list);
                }
                return (q0)o;
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Property '");
            sb4.append(string);
            sb4.append("' (JVM signature: ");
            sb4.append(s);
            sb4.append(") not resolved in ");
            sb4.append(this);
            throw new b0(sb4.toString());
        }
    }
    
    @e
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> O();
    
    @e
    public abstract Collection<y> P(@e final kotlin.reflect.jvm.internal.impl.name.e p0);
    
    @f
    public abstract q0 Q(final int p0);
    
    @e
    protected final Collection<kotlin.reflect.jvm.internal.f<?>> R(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.h h, @e final c c) {
        k0.p(h, "scope");
        k0.p(c, "belonginess");
        final kotlin.reflect.jvm.internal.a a = new kotlin.reflect.jvm.internal.a(this) {
            @e
            public kotlin.reflect.jvm.internal.f<?> r(@e final kotlin.reflect.jvm.internal.impl.descriptors.l obj, @e final j2 j2) {
                k0.p(obj, "descriptor");
                k0.p(j2, "data");
                final StringBuilder sb = new StringBuilder();
                sb.append("No constructors should appear here: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
        };
        final Collection a2 = k$a.a((kotlin.reflect.jvm.internal.impl.resolve.scopes.k)h, (d)null, (l)null, 3, (Object)null);
        final ArrayList<kotlin.reflect.jvm.internal.f> list = new ArrayList<kotlin.reflect.jvm.internal.f>();
        for (final kotlin.reflect.jvm.internal.impl.descriptors.m m : a2) {
            kotlin.reflect.jvm.internal.f f = null;
            Label_0130: {
                if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.b b = (kotlin.reflect.jvm.internal.impl.descriptors.b)m;
                    if ((k0.g(b.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.t.h) ^ true) && c.b(b)) {
                        f = m.P((kotlin.reflect.jvm.internal.impl.descriptors.o<kotlin.reflect.jvm.internal.f, j2>)a, j2.a);
                        break Label_0130;
                    }
                }
                f = null;
            }
            if (f != null) {
                list.add(f);
            }
        }
        return (Collection<kotlin.reflect.jvm.internal.f<?>>)v.I5((Iterable<?>)list);
    }
    
    @e
    protected Class<?> T() {
        Class<?> clazz = (Class<?>)kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.h((Class)this.m());
        if (clazz == null) {
            clazz = this.m();
        }
        return clazz;
    }
    
    @e
    public abstract Collection<q0> U(@e final kotlin.reflect.jvm.internal.impl.name.e p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R&\u0010\t\u001a\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "kotlin/reflect/jvm/internal/k$a", "", "Lkotlin/text/o;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/o;", "a", "()Lkotlin/text/o;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final o a() {
            return k.A();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n" }, d2 = { "kotlin/reflect/jvm/internal/k$b", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "a", "Lkotlin/reflect/jvm/internal/d0$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "<init>", "(Lkotlin/reflect/jvm/internal/k;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    public abstract class b
    {
        static final /* synthetic */ kotlin.reflect.o[] c;
        @e
        private final d0.a a;
        final /* synthetic */ k b;
        
        static {
            c = new kotlin.reflect.o[] { k1.r(new f1(k1.d(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;")) };
        }
        
        public b() {
            this.a = (d0.a)d0.d((n6.a<Object>)new n6.a<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k>() {
                final /* synthetic */ b G;
                
                public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a() {
                    return c0.b(this.G.b.m());
                }
            });
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a() {
            return (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k)((d0.c)this.a).b(this, k.b.c[0]);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003j\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "kotlin/reflect/jvm/internal/k$c", "", "Lkotlin/reflect/jvm/internal/k$c;", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "member", "", "b", "<init>", "(Ljava/lang/String;I)V", "DECLARED", "INHERITED", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    protected enum c
    {
        G, 
        H;
        
        public final boolean b(@e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
            k0.p(b, "member");
            final kotlin.reflect.jvm.internal.impl.descriptors.b.a n = b.n();
            k0.o(n, "member.kind");
            final boolean b2 = n.b();
            final c g = c.G;
            final boolean b3 = true;
            return b2 == (this == g) && b3;
        }
    }
}
