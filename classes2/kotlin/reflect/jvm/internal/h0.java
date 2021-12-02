// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.protobuf.q;
import java.lang.reflect.Constructor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.m;
import kotlin.reflect.jvm.internal.impl.resolve.f;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.reflect.jvm.internal.impl.metadata.a$i;
import kotlin.reflect.jvm.internal.impl.protobuf.i$g;
import kotlin.reflect.jvm.internal.impl.metadata.a$n;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i$d;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.load.java.x;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.load.java.b0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e$b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\u00128B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Lkotlin/reflect/jvm/internal/h0;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "descriptor", "", "b", "Lkotlin/reflect/jvm/internal/d$e;", "d", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "", "e", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/d;", "g", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/e;", "f", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/a;", "c", "a", "Lkotlin/reflect/jvm/internal/impl/name/a;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "<init>", "()V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class h0
{
    private static final a a;
    @e
    public static final h0 b;
    
    static {
        b = new h0();
        final a m = kotlin.reflect.jvm.internal.impl.name.a.m(new b("java.lang.Void"));
        k0.o(m, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        a = m;
    }
    
    private h0() {
    }
    
    private final PrimitiveType a(final Class<?> clazz) {
        PrimitiveType i;
        if (clazz.isPrimitive()) {
            final d d = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(clazz.getSimpleName());
            k0.o(d, "JvmPrimitiveType.get(simpleName)");
            i = d.i();
        }
        else {
            i = null;
        }
        return i;
    }
    
    private final boolean b(final y y) {
        return c.m(y) || c.n(y) || (k0.g(y.getName(), kotlin.reflect.jvm.internal.impl.builtins.jvm.a.e.a()) && y.m().isEmpty());
    }
    
    private final kotlin.reflect.jvm.internal.d.e d(final y y) {
        return new kotlin.reflect.jvm.internal.d.e(new e$b(this.e(y), t.c(y, false, false, 1, (Object)null)));
    }
    
    private final String e(final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
        final String b2 = b0.b(b);
        String s;
        if (b2 != null) {
            s = b2;
        }
        else if (b instanceof r0) {
            final String d = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.o(b).getName().d();
            k0.o(d, "descriptor.propertyIfAccessor.name.asString()");
            s = x.a(d);
        }
        else if (b instanceof s0) {
            final String d2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.o(b).getName().d();
            k0.o(d2, "descriptor.propertyIfAccessor.name.asString()");
            s = x.d(d2);
        }
        else {
            s = b.getName().d();
            k0.o(s, "descriptor.name.asString()");
        }
        return s;
    }
    
    @e
    public final a c(@e final Class<?> clazz) {
        k0.p(clazz, "klass");
        if (clazz.isArray()) {
            final Class<?> componentType = clazz.getComponentType();
            k0.o(componentType, "klass.componentType");
            final PrimitiveType a = this.a(componentType);
            if (a != null) {
                return new a(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, a.getArrayTypeName());
            }
            final a m = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.FqNames.array.l());
            k0.o(m, "ClassId.topLevel(Standar\u2026s.FqNames.array.toSafe())");
            return m;
        }
        else {
            if (k0.g(clazz, Void.TYPE)) {
                return h0.a;
            }
            final PrimitiveType a2 = this.a(clazz);
            if (a2 != null) {
                return new a(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, a2.getTypeName());
            }
            final a b = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b((Class)clazz);
            if (!b.k()) {
                final kotlin.reflect.jvm.internal.impl.builtins.jvm.c a3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a;
                final b b2 = b.b();
                k0.o(b2, "classId.asSingleFqName()");
                final a n = a3.n(b2);
                if (n != null) {
                    return n;
                }
            }
            return b;
        }
    }
    
    @e
    public final kotlin.reflect.jvm.internal.e f(@e final q0 q0) {
        k0.p(q0, "possiblyOverriddenProperty");
        final kotlin.reflect.jvm.internal.impl.descriptors.b l = kotlin.reflect.jvm.internal.impl.resolve.d.L((kotlin.reflect.jvm.internal.impl.descriptors.b)q0);
        k0.o(l, "DescriptorUtils.unwrapFa\u2026ssiblyOverriddenProperty)");
        final q0 b = ((q0)l).b();
        k0.o(b, "DescriptorUtils.unwrapFa\u2026rriddenProperty).original");
        final boolean b2 = b instanceof k;
        kotlin.reflect.jvm.internal.d.e d = null;
        final Method method = null;
        if (b2) {
            final k k = (k)b;
            final a$n d2 = k.d1();
            final i$g d3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d;
            k0.o(d3, "JvmProtoBuf.propertySignature");
            final a$d a$d = (a$d)kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((i$d)d2, d3);
            if (a$d != null) {
                return new kotlin.reflect.jvm.internal.e.c(b, d2, a$d, k.d0(), k.W());
            }
        }
        else if (b instanceof g) {
            Object i;
            if (!((i = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.k)b).k()) instanceof s6.a)) {
                i = null;
            }
            final s6.a a = (s6.a)i;
            Object b3;
            if (a != null) {
                b3 = a.b();
            }
            else {
                b3 = null;
            }
            kotlin.reflect.jvm.internal.e e;
            if (b3 instanceof p) {
                e = new kotlin.reflect.jvm.internal.e.a(((p)b3).V());
            }
            else {
                if (!(b3 instanceof s)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Incorrect resolution sequence for Java field ");
                    sb.append(b);
                    sb.append(" (source = ");
                    sb.append(b3);
                    sb.append(')');
                    throw new kotlin.reflect.jvm.internal.b0(sb.toString());
                }
                final Method v = ((s)b3).V();
                final s0 h = b.h();
                Object j;
                if (h != null) {
                    j = h.k();
                }
                else {
                    j = null;
                }
                Object o = j;
                if (!(j instanceof s6.a)) {
                    o = null;
                }
                final s6.a a2 = (s6.a)o;
                Object b4;
                if (a2 != null) {
                    b4 = a2.b();
                }
                else {
                    b4 = null;
                }
                Object o2 = b4;
                if (!(b4 instanceof s)) {
                    o2 = null;
                }
                final s s = (s)o2;
                Method v2 = method;
                if (s != null) {
                    v2 = s.V();
                }
                e = new kotlin.reflect.jvm.internal.e.b(v, v2);
            }
            return e;
        }
        final r0 e2 = b.e();
        k0.m(e2);
        final kotlin.reflect.jvm.internal.d.e d4 = this.d(e2);
        final s0 h2 = b.h();
        if (h2 != null) {
            d = this.d(h2);
        }
        return new kotlin.reflect.jvm.internal.e.d(d4, d);
    }
    
    @e
    public final kotlin.reflect.jvm.internal.d g(@e final y y) {
        k0.p(y, "possiblySubstitutedFunction");
        final kotlin.reflect.jvm.internal.impl.descriptors.b l = kotlin.reflect.jvm.internal.impl.resolve.d.L((kotlin.reflect.jvm.internal.impl.descriptors.b)y);
        k0.o(l, "DescriptorUtils.unwrapFa\u2026siblySubstitutedFunction)");
        final y b = ((y)l).b();
        k0.o(b, "DescriptorUtils.unwrapFa\u2026titutedFunction).original");
        if (b instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c) {
            final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c c = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c)b;
            final q j = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h)c).J();
            if (j instanceof a$i) {
                final e$b e = h.a.e((a$i)j, ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h)c).d0(), ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h)c).W());
                if (e != null) {
                    return new kotlin.reflect.jvm.internal.d.e(e);
                }
            }
            if (j instanceof kotlin.reflect.jvm.internal.impl.metadata.a$d) {
                final e$b b2 = h.a.b((kotlin.reflect.jvm.internal.impl.metadata.a$d)j, ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h)c).d0(), ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h)c).W());
                if (b2 != null) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.m c2 = y.c();
                    k0.o(c2, "possiblySubstitutedFunction.containingDeclaration");
                    kotlin.reflect.jvm.internal.d d;
                    if (f.b(c2)) {
                        d = new kotlin.reflect.jvm.internal.d.e(b2);
                    }
                    else {
                        d = new kotlin.reflect.jvm.internal.d.d(b2);
                    }
                    return d;
                }
            }
            return this.d(b);
        }
        final boolean b3 = b instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.f;
        final m m = null;
        final s s = null;
        if (b3) {
            Object k;
            if (!((k = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.k)b).k()) instanceof s6.a)) {
                k = null;
            }
            final s6.a a = (s6.a)k;
            Object b4;
            if (a != null) {
                b4 = a.b();
            }
            else {
                b4 = null;
            }
            if (!(b4 instanceof s)) {
                b4 = s;
            }
            final s s2 = (s)b4;
            if (s2 != null) {
                final Method v = s2.V();
                if (v != null) {
                    return new kotlin.reflect.jvm.internal.d.c(v);
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Incorrect resolution sequence for Java method ");
            sb.append(b);
            throw new kotlin.reflect.jvm.internal.b0(sb.toString());
        }
        if (b instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c) {
            Object i;
            if (!((i = ((kotlin.reflect.jvm.internal.impl.descriptors.impl.k)b).k()) instanceof s6.a)) {
                i = null;
            }
            final s6.a a2 = (s6.a)i;
            Object b5 = m;
            if (a2 != null) {
                b5 = a2.b();
            }
            if (!(b5 instanceof m)) {
                if (b5 instanceof j) {
                    final j j2 = (j)b5;
                    if (j2.p()) {
                        return new kotlin.reflect.jvm.internal.d.a(j2.U());
                    }
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Incorrect resolution sequence for Java constructor ");
                sb2.append(b);
                sb2.append(" (");
                sb2.append(b5);
                sb2.append(')');
                throw new kotlin.reflect.jvm.internal.b0(sb2.toString());
            }
            return new kotlin.reflect.jvm.internal.d.b(((m)b5).V());
        }
        if (this.b(b)) {
            return this.d(b);
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown origin of ");
        sb3.append(b);
        sb3.append(" (");
        sb3.append(b.getClass());
        sb3.append(')');
        throw new kotlin.reflect.jvm.internal.b0(sb3.toString());
    }
}
