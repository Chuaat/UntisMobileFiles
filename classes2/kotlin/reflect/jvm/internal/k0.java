// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q$b$a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q$b$b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q$b;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.n;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Set;
import kotlin.collections.y0;
import kotlin.n1;
import java.util.Map;
import kotlin.s0;
import kotlin.reflect.s;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.metadata.a$n;
import kotlin.reflect.jvm.internal.impl.metadata.a$i;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import n6.p;
import java.io.Serializable;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m$a;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.a;
import kotlin.jvm.internal.i1;
import kotlin.reflect.c;
import kotlin.jvm.internal.f0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002\u001a.\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000\u001a\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u0011H\u0000\u001a\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u0015H\u0002\u001a\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u0018H\u0000\u001a\u0014\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c*\u0004\u0018\u00010\u0018H\u0000\u001a\u0014\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e*\u0004\u0018\u00010\u0018H\u0000\u001a\u0012\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020 H\u0000\u001ap\u00103\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010$*\u00020#\"\b\b\u0001\u0010&*\u00020%2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010(\u001a\u00028\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u001d\u00102\u001a\u0019\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/¢\u0006\u0002\b1H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0080\b\u00f8\u0001\u0000¢\u0006\u0004\b8\u00109\"\u001c\u0010>\u001a\u00020:8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b<\u0010=\"\u001a\u0010C\u001a\u00020@*\u00020?8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u001c\u0010G\u001a\u0004\u0018\u00010D*\u00020%8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H" }, d2 = { "Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Ljava/lang/Class;", "n", "Ljava/lang/ClassLoader;", "classLoader", "Lkotlin/reflect/jvm/internal/impl/name/a;", "kotlinClassId", "", "arrayDimensions", "k", "", "packageName", "className", "j", "Lkotlin/reflect/jvm/internal/impl/descriptors/u;", "Lkotlin/reflect/x;", "o", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;", "", "", "d", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;", "m", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/g;", "", "p", "Lkotlin/reflect/jvm/internal/l;", "b", "Lkotlin/reflect/jvm/internal/u;", "c", "Lkotlin/reflect/jvm/internal/f;", "a", "Ljava/lang/reflect/Type;", "type", "e", "Lkotlin/reflect/jvm/internal/impl/protobuf/q;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/a;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/u;", "Lkotlin/s;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Ln6/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Ln6/a;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/name/b;", "Lkotlin/reflect/jvm/internal/impl/name/b;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/s;", "", "i", "(Lkotlin/reflect/s;)Z", "isInlineClassType", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
public final class k0
{
    @e
    private static final b a;
    
    static {
        a = new b("kotlin.jvm.JvmStatic");
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.f<?> a(@f final Object o) {
        Object o2;
        if (!(o instanceof kotlin.reflect.jvm.internal.f)) {
            o2 = null;
        }
        else {
            o2 = o;
        }
        kotlin.reflect.jvm.internal.f<?> f = (kotlin.reflect.jvm.internal.f<?>)o2;
        if (f == null) {
            f = b(o);
        }
        if (f == null) {
            f = c(o);
        }
        return f;
    }
    
    @f
    public static final l b(@f final Object o) {
        final boolean b = o instanceof l;
        final l l = null;
        Object o2;
        if (!b) {
            o2 = null;
        }
        else {
            o2 = o;
        }
        final l i = (l)o2;
        l j;
        if (i != null) {
            j = i;
        }
        else {
            Object o3 = o;
            if (!(o instanceof f0)) {
                o3 = null;
            }
            final f0 f0 = (f0)o3;
            c compute;
            if (f0 != null) {
                compute = f0.compute();
            }
            else {
                compute = null;
            }
            if (!(compute instanceof l)) {
                compute = l;
            }
            j = (l)compute;
        }
        return j;
    }
    
    @f
    public static final u<?> c(@f final Object o) {
        final boolean b = o instanceof u;
        final u<?> u = null;
        Object o2;
        if (!b) {
            o2 = null;
        }
        else {
            o2 = o;
        }
        final u<?> u2 = (u<?>)o2;
        u<?> u3;
        if (u2 != null) {
            u3 = u2;
        }
        else {
            Object o3 = o;
            if (!(o instanceof i1)) {
                o3 = null;
            }
            final i1 i1 = (i1)o3;
            c<?> compute;
            if (i1 != null) {
                compute = (c<?>)i1.compute();
            }
            else {
                compute = null;
            }
            if (!(compute instanceof u)) {
                compute = u;
            }
            u3 = (u<?>)compute;
        }
        return u3;
    }
    
    @e
    public static final List<Annotation> d(@e final a a) {
        kotlin.jvm.internal.k0.p(a, "$this$computeAnnotations");
        final g annotations = a.getAnnotations();
        final ArrayList<Annotation> list = new ArrayList<Annotation>();
        for (final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c : annotations) {
            final w0 k = c.k();
            final boolean b = k instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b;
            final Annotation annotation = null;
            Annotation annotation2;
            if (b) {
                annotation2 = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b)k).d();
            }
            else if (k instanceof m$a) {
                Object d;
                if (!((d = ((m$a)k).d()) instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c)) {
                    d = null;
                }
                final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c c2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c)d;
                annotation2 = annotation;
                if (c2 != null) {
                    annotation2 = c2.Q();
                }
            }
            else {
                annotation2 = m(c);
            }
            if (annotation2 != null) {
                list.add(annotation2);
            }
        }
        return list;
    }
    
    @f
    public static final Object e(@e final Type obj) {
        kotlin.jvm.internal.k0.p(obj, "type");
        Serializable s;
        if (obj instanceof Class && ((Class)obj).isPrimitive()) {
            if (kotlin.jvm.internal.k0.g(obj, Boolean.TYPE)) {
                s = Boolean.FALSE;
            }
            else if (kotlin.jvm.internal.k0.g(obj, Character.TYPE)) {
                s = 0;
            }
            else if (kotlin.jvm.internal.k0.g(obj, Byte.TYPE)) {
                s = 0;
            }
            else if (kotlin.jvm.internal.k0.g(obj, Short.TYPE)) {
                s = 0;
            }
            else if (kotlin.jvm.internal.k0.g(obj, Integer.TYPE)) {
                s = 0;
            }
            else if (kotlin.jvm.internal.k0.g(obj, Float.TYPE)) {
                s = 0.0f;
            }
            else if (kotlin.jvm.internal.k0.g(obj, Long.TYPE)) {
                s = 0L;
            }
            else if (kotlin.jvm.internal.k0.g(obj, Double.TYPE)) {
                s = 0.0;
            }
            else {
                if (kotlin.jvm.internal.k0.g(obj, Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown primitive: ");
                sb.append(obj);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        else {
            s = null;
        }
        return s;
    }
    
    @f
    public static final <M extends q, D extends kotlin.reflect.jvm.internal.impl.descriptors.a> D f(@e final Class<?> clazz, @e final M obj, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a a, @e final p<? super kotlin.reflect.jvm.internal.impl.serialization.deserialization.u, ? super M, ? extends D> p6) {
        kotlin.jvm.internal.k0.p(clazz, "moduleAnchor");
        kotlin.jvm.internal.k0.p(obj, "proto");
        kotlin.jvm.internal.k0.p(c, "nameResolver");
        kotlin.jvm.internal.k0.p(g, "typeTable");
        kotlin.jvm.internal.k0.p(a, "metadataVersion");
        kotlin.jvm.internal.k0.p(p6, "createDescriptor");
        final k b = c0.b(clazz);
        List list;
        if (obj instanceof a$i) {
            list = ((a$i)obj).f0();
        }
        else {
            if (!(obj instanceof a$n)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported message: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            list = ((a$n)obj).g0();
        }
        final j a2 = b.a();
        final e0 b2 = b.b();
        final i b3 = i.b.b();
        kotlin.jvm.internal.k0.o(list, "typeParameters");
        return (D)p6.invoke(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.u(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.l(a2, c, (m)b2, g, b3, a, (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g)null, (b0)null, list)), obj);
    }
    
    @f
    public static final t0 g(@e final kotlin.reflect.jvm.internal.impl.descriptors.a a) {
        kotlin.jvm.internal.k0.p(a, "$this$instanceReceiverParameter");
        t0 k0;
        if (a.j0() != null) {
            final m c = a.c();
            Objects.requireNonNull(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            k0 = ((kotlin.reflect.jvm.internal.impl.descriptors.e)c).K0();
        }
        else {
            k0 = null;
        }
        return k0;
    }
    
    @e
    public static final b h() {
        return k0.a;
    }
    
    public static final boolean i(@e final s s) {
        kotlin.jvm.internal.k0.p(s, "$this$isInlineClassType");
        s s2 = s;
        if (!(s instanceof x)) {
            s2 = null;
        }
        final x x = (x)s2;
        boolean b = true;
        if (x != null) {
            final kotlin.reflect.jvm.internal.impl.types.c0 v = x.v();
            if (v != null && kotlin.reflect.jvm.internal.impl.resolve.f.c(v)) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    private static final Class<?> j(final ClassLoader classLoader, String str, String str2, final int n) {
        if (kotlin.jvm.internal.k0.g(str, "kotlin")) {
            switch (str2.hashCode()) {
                case 2104330525: {
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
                }
                case 948852093: {
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                }
                case 601811914: {
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                }
                case 63537721: {
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                }
                case 22374632: {
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                }
                case -74930671: {
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                }
                case -755911549: {
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                }
                case -763279523: {
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                }
                case -901856463: {
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(kotlin.text.s.j2(str2, '.', '$', false, 4, (Object)null));
        str2 = (str = sb.toString());
        if (n > 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(kotlin.text.s.g2((CharSequence)"[", n));
            sb2.append('L');
            sb2.append(str2);
            sb2.append(';');
            str = sb2.toString();
        }
        return (Class<?>)kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(classLoader, str);
    }
    
    private static final Class<?> k(final ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.a a, final int n) {
        final kotlin.reflect.jvm.internal.impl.builtins.jvm.c a2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
        final kotlin.reflect.jvm.internal.impl.name.c j = a.b().j();
        kotlin.jvm.internal.k0.o(j, "kotlinClassId.asSingleFqName().toUnsafe()");
        final kotlin.reflect.jvm.internal.impl.name.a o = a2.o(j);
        if (o != null) {
            a = o;
        }
        final String b = a.h().b();
        kotlin.jvm.internal.k0.o(b, "javaClassId.packageFqName.asString()");
        final String b2 = a.i().b();
        kotlin.jvm.internal.k0.o(b2, "javaClassId.relativeClassName.asString()");
        return j(classLoader, b, b2, n);
    }
    
    static /* synthetic */ Class l(final ClassLoader classLoader, final kotlin.reflect.jvm.internal.impl.name.a a, int n, final int n2, final Object o) {
        if ((n2 & 0x4) != 0x0) {
            n = 0;
        }
        return k(classLoader, a, n);
    }
    
    private static final Annotation m(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c) {
        final kotlin.reflect.jvm.internal.impl.descriptors.e f = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f(c);
        Class<?> n;
        if (f != null) {
            n = n(f);
        }
        else {
            n = null;
        }
        Class<?> clazz = n;
        if (!(n instanceof Class)) {
            clazz = null;
        }
        if (clazz != null) {
            final Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> entrySet = c.b().entrySet();
            final ArrayList<s0<? extends K, ? extends V>> list = new ArrayList<s0<? extends K, ? extends V>>();
            for (final Map.Entry<kotlin.reflect.jvm.internal.impl.name.e, V> entry : entrySet) {
                final kotlin.reflect.jvm.internal.impl.name.e e = entry.getKey();
                final kotlin.reflect.jvm.internal.impl.resolve.constants.g g = (kotlin.reflect.jvm.internal.impl.resolve.constants.g)entry.getValue();
                final ClassLoader classLoader = clazz.getClassLoader();
                kotlin.jvm.internal.k0.o(classLoader, "annotationClass.classLoader");
                final Object p = p((kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>)g, classLoader);
                Serializable a;
                if (p != null) {
                    a = n1.a(e.d(), p);
                }
                else {
                    a = null;
                }
                if (a != null) {
                    list.add((s0<String, Object>)a);
                }
            }
            return (Annotation)kotlin.reflect.jvm.internal.calls.b.d(clazz, y0.B0((Iterable<? extends s0<?, ?>>)list), null, 4, null);
        }
        return null;
    }
    
    @f
    public static final Class<?> n(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        kotlin.jvm.internal.k0.p(e, "$this$toJavaClass");
        final w0 k = e.k();
        kotlin.jvm.internal.k0.o(k, "source");
        Class<?> clazz;
        if (k instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.q) {
            final o d = ((kotlin.reflect.jvm.internal.impl.load.kotlin.q)k).d();
            Objects.requireNonNull(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            clazz = (Class<?>)((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f)d).f();
        }
        else if (k instanceof m$a) {
            final n d2 = ((m$a)k).d();
            Objects.requireNonNull(d2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            clazz = (Class<?>)((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j)d2).U();
        }
        else {
            final kotlin.reflect.jvm.internal.impl.name.a h = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.h((h)e);
            if (h == null) {
                return null;
            }
            clazz = k(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.g((Class)e.getClass()), h, 0);
        }
        return clazz;
    }
    
    @f
    public static final kotlin.reflect.x o(@e final kotlin.reflect.jvm.internal.impl.descriptors.u u) {
        kotlin.jvm.internal.k0.p(u, "$this$toKVisibility");
        kotlin.reflect.x x;
        if (kotlin.jvm.internal.k0.g(u, t.e)) {
            x = kotlin.reflect.x.G;
        }
        else if (kotlin.jvm.internal.k0.g(u, t.c)) {
            x = kotlin.reflect.x.H;
        }
        else if (kotlin.jvm.internal.k0.g(u, t.d)) {
            x = kotlin.reflect.x.I;
        }
        else {
            if (!kotlin.jvm.internal.k0.g(u, t.a)) {
                if (!kotlin.jvm.internal.k0.g(u, t.b)) {
                    x = null;
                    return x;
                }
            }
            x = kotlin.reflect.x.J;
        }
        return x;
    }
    
    private static final Object p(final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g, final ClassLoader classLoader) {
        final boolean b = g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a;
        final Annotation annotation = null;
        Object obj;
        if (b) {
            obj = m((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c)((kotlin.reflect.jvm.internal.impl.resolve.constants.g)g).b());
        }
        else if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            final Iterable iterable = (Iterable)((kotlin.reflect.jvm.internal.impl.resolve.constants.g)g).b();
            final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)iterable, 10));
            final Iterator<? extends T> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                list.add(p((kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>)iterator.next(), classLoader));
            }
            obj = list.toArray(new Object[0]);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T>");
        }
        else if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j) {
            final s0 s0 = (s0)((kotlin.reflect.jvm.internal.impl.resolve.constants.g)g).b();
            final kotlin.reflect.jvm.internal.impl.name.a a = s0.a();
            final kotlin.reflect.jvm.internal.impl.name.e e = (kotlin.reflect.jvm.internal.impl.name.e)s0.b();
            final Class l = l(classLoader, a, 0, 4, null);
            obj = annotation;
            if (l != null) {
                obj = j0.a(l, e.d());
            }
        }
        else if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q) {
            final q$b q$b = (q$b)((kotlin.reflect.jvm.internal.impl.resolve.constants.g)g).b();
            if (q$b instanceof q$b$b) {
                final q$b$b q$b$b = (q$b$b)q$b;
                obj = k(classLoader, q$b$b.b(), q$b$b.a());
            }
            else {
                if (!(q$b instanceof q$b$a)) {
                    throw new h0();
                }
                h c;
                if (!((c = ((q$b$a)q$b).a().N0().c()) instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                    c = null;
                }
                final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
                obj = annotation;
                if (e2 != null) {
                    obj = n(e2);
                }
            }
        }
        else if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.k) {
            obj = annotation;
        }
        else if (g instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.s) {
            obj = annotation;
        }
        else {
            obj = g.b();
        }
        return obj;
    }
}
