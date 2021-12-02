// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.calls;

import kotlin.jvm.internal.k1;
import java.util.Set;
import java.util.ArrayList;
import java.lang.reflect.Proxy;
import kotlin.collections.m;
import kotlin.reflect.o;
import kotlin.b0;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.Collection;
import kotlin.reflect.d;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.Arrays;
import kotlin.d0;
import n6.l;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001aK\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014" }, d2 = { "", "Ljava/lang/Class;", "expectedType", "f", "", "index", "", "name", "expectedJvmType", "", "e", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "c", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
public final class b
{
    @e
    public static final <T> T c(@e final Class<T> clazz, @e final Map<String, ?> map, @e final List<Method> list) {
        k0.p(clazz, "annotationClass");
        k0.p(map, "values");
        k0.p(list, "methods");
        final Object proxyInstance = Proxy.newProxyInstance(clazz.getClassLoader(), new Class[] { clazz }, new InvocationHandler() {
            final /* synthetic */ b0 b = d0.c((a<?>)new a<String>(clazz, map) {
                final /* synthetic */ Class G;
                final /* synthetic */ Map H;
                
                @e
                public final String a() {
                    final StringBuilder sb = new StringBuilder();
                    sb.append('@');
                    sb.append(this.G.getCanonicalName());
                    v.X2(this.H.entrySet(), sb, ", ", "(", ")", 0, null, b$d$a.G, 48, null);
                    final String string = sb.toString();
                    k0.o(string, "StringBuilder().apply(builderAction).toString()");
                    return string;
                }
            });
            final /* synthetic */ b0 d = d0.c((a<?>)new a<Integer>(map) {
                final /* synthetic */ Map G;
                
                public final int a() {
                    final Iterator iterator = this.G.entrySet().iterator();
                    int n = 0;
                    while (iterator.hasNext()) {
                        final Map.Entry<String, V> entry = iterator.next();
                        final String s = entry.getKey();
                        final V value = entry.getValue();
                        int n2;
                        if (value instanceof boolean[]) {
                            n2 = Arrays.hashCode((boolean[])(Object)value);
                        }
                        else if (value instanceof char[]) {
                            n2 = Arrays.hashCode((char[])(Object)value);
                        }
                        else if (value instanceof byte[]) {
                            n2 = Arrays.hashCode((byte[])(Object)value);
                        }
                        else if (value instanceof short[]) {
                            n2 = Arrays.hashCode((short[])(Object)value);
                        }
                        else if (value instanceof int[]) {
                            n2 = Arrays.hashCode((int[])(Object)value);
                        }
                        else if (value instanceof float[]) {
                            n2 = Arrays.hashCode((float[])(Object)value);
                        }
                        else if (value instanceof long[]) {
                            n2 = Arrays.hashCode((long[])(Object)value);
                        }
                        else if (value instanceof double[]) {
                            n2 = Arrays.hashCode((double[])(Object)value);
                        }
                        else if (value instanceof Object[]) {
                            n2 = Arrays.hashCode((Object[])(Object)value);
                        }
                        else {
                            n2 = value.hashCode();
                        }
                        n += (n2 ^ s.hashCode() * 127);
                    }
                    return n;
                }
            });
            final /* synthetic */ b$a f = new l<Object, Boolean>(clazz, list, map) {
                final /* synthetic */ Class G;
                final /* synthetic */ List H;
                final /* synthetic */ Map I;
                
                public final boolean a(@f final Object obj) {
                    final boolean b = obj instanceof Annotation;
                    final Object o = null;
                    Object o2;
                    if (!b) {
                        o2 = null;
                    }
                    else {
                        o2 = obj;
                    }
                    final Annotation annotation = (Annotation)o2;
                    Object c = o;
                    if (annotation != null) {
                        final d<? extends Annotation> a = m6.a.a(annotation);
                        c = o;
                        if (a != null) {
                            c = m6.a.c((d<Object>)a);
                        }
                    }
                    final boolean g = k0.g(c, this.G);
                    final boolean b2 = true;
                    if (g) {
                        final List h = this.H;
                        boolean b4 = false;
                        Label_0488: {
                            if (!(h instanceof Collection) || !h.isEmpty()) {
                                for (final Method method : h) {
                                    final Object value = this.I.get(method.getName());
                                    final Object invoke = method.invoke(obj, new Object[0]);
                                    boolean b3;
                                    if (value instanceof boolean[]) {
                                        final boolean[] a2 = (boolean[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                                        b3 = Arrays.equals(a2, (boolean[])invoke);
                                    }
                                    else if (value instanceof char[]) {
                                        final char[] a3 = (char[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                                        b3 = Arrays.equals(a3, (char[])invoke);
                                    }
                                    else if (value instanceof byte[]) {
                                        final byte[] a4 = (byte[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                        b3 = Arrays.equals(a4, (byte[])invoke);
                                    }
                                    else if (value instanceof short[]) {
                                        final short[] a5 = (short[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                                        b3 = Arrays.equals(a5, (short[])invoke);
                                    }
                                    else if (value instanceof int[]) {
                                        final int[] a6 = (int[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                                        b3 = Arrays.equals(a6, (int[])invoke);
                                    }
                                    else if (value instanceof float[]) {
                                        final float[] a7 = (float[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                                        b3 = Arrays.equals(a7, (float[])invoke);
                                    }
                                    else if (value instanceof long[]) {
                                        final long[] a8 = (long[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                                        b3 = Arrays.equals(a8, (long[])invoke);
                                    }
                                    else if (value instanceof double[]) {
                                        final double[] a9 = (double[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                                        b3 = Arrays.equals(a9, (double[])invoke);
                                    }
                                    else if (value instanceof Object[]) {
                                        final Object[] a10 = (Object[])value;
                                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                        b3 = Arrays.equals(a10, (Object[])invoke);
                                    }
                                    else {
                                        b3 = k0.g(value, invoke);
                                    }
                                    if (!b3) {
                                        b4 = false;
                                        break Label_0488;
                                    }
                                }
                            }
                            b4 = true;
                        }
                        if (b4) {
                            return b2;
                        }
                    }
                    return false;
                }
            };
            
            @Override
            public final Object invoke(Object o, final Method obj, Object[] array) {
                k0.o(obj, "method");
                final String name = obj.getName();
                Label_0106: {
                    if (name != null) {
                        final int hashCode = name.hashCode();
                        b0 b0;
                        if (hashCode != -1776922004) {
                            if (hashCode != 147696667) {
                                if (hashCode != 1444986633) {
                                    break Label_0106;
                                }
                                if (name.equals("annotationType")) {
                                    o = clazz;
                                    return o;
                                }
                                break Label_0106;
                            }
                            else {
                                if (!name.equals("hashCode")) {
                                    break Label_0106;
                                }
                                b0 = this.d;
                            }
                        }
                        else {
                            if (!name.equals("toString")) {
                                break Label_0106;
                            }
                            b0 = this.b;
                        }
                        o = b0.getValue();
                        return o;
                    }
                }
                if (k0.g(name, "equals") && array != null && array.length == 1) {
                    o = this.f.a(m.Cs(array));
                }
                else {
                    if (!map.containsKey(name)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Method is not supported: ");
                        sb.append(obj);
                        sb.append(" (args: ");
                        if (array == null) {
                            array = new Object[0];
                        }
                        sb.append(m.ey(array));
                        sb.append(')');
                        throw new kotlin.reflect.jvm.internal.b0(sb.toString());
                    }
                    o = map.get(name);
                }
                return o;
            }
        });
        Objects.requireNonNull(proxyInstance, "null cannot be cast to non-null type T");
        return (T)proxyInstance;
    }
    
    private static final Void e(final int i, final String str, final Class<?> clazz) {
        d<T> d = null;
        Label_0050: {
            Class<d> clazz2;
            if (k0.g(clazz, Class.class)) {
                clazz2 = d.class;
            }
            else {
                if (!clazz.isArray() || !k0.g(clazz.getComponentType(), Class.class)) {
                    d = m6.a.g(clazz);
                    break Label_0050;
                }
                clazz2 = d[].class;
            }
            d = (d<T>)k1.d(clazz2);
        }
        String str2;
        if (k0.g(d.E(), k1.d(Object[].class).E())) {
            final StringBuilder sb = new StringBuilder();
            sb.append(d.E());
            sb.append('<');
            final Class<?> componentType = m6.a.c((d<Object>)d).getComponentType();
            k0.o(componentType, "kotlinClass.java.componentType");
            sb.append(m6.a.g(componentType).E());
            sb.append('>');
            str2 = sb.toString();
        }
        else {
            str2 = d.E();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Argument #");
        sb2.append(i);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(" is not of the required type ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    private static final Object f(Object obj, final Class<?> clazz) {
        final boolean b = obj instanceof Class;
        final Object o = null;
        if (b) {
            return null;
        }
        Object obj2;
        if (obj instanceof d) {
            obj2 = m6.a.c((d<Object>)obj);
        }
        else {
            obj2 = obj;
            if (obj instanceof Object[]) {
                obj2 = obj;
                if (obj2 instanceof Class[]) {
                    return null;
                }
                if (obj2 instanceof d[]) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                    final d[] array = (d[])obj;
                    final ArrayList list = new ArrayList<Class<Object>>(array.length);
                    for (int length = array.length, i = 0; i < length; ++i) {
                        list.add(m6.a.c((d<Object>)array[i]));
                    }
                    obj2 = list.toArray(new Class[0]);
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        obj = o;
        if (clazz.isInstance(obj2)) {
            obj = obj2;
        }
        return obj;
    }
}
