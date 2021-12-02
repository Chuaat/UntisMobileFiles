// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.calls;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\rH\u0000\u001a\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r*\u00020\u00038B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016" }, d2 = { "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "", "isDefault", "b", "g", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "f", "d", "Lkotlin/reflect/jvm/internal/impl/types/c0;", "i", "Lkotlin/reflect/jvm/internal/impl/descriptors/m;", "h", "", "a", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
public final class h
{
    @f
    public static final Object a(@f final Object obj, @e final b b) {
        k0.p(b, "descriptor");
        if (b instanceof q0 && kotlin.reflect.jvm.internal.impl.resolve.f.d((g1)b)) {
            return obj;
        }
        final c0 e = e(b);
        Object invoke = obj;
        if (e != null) {
            final Class<?> i = i(e);
            invoke = obj;
            if (i != null) {
                final Method f = f(i, b);
                invoke = obj;
                if (f != null) {
                    invoke = f.invoke(obj, new Object[0]);
                }
            }
        }
        return invoke;
    }
    
    @e
    public static final <M extends Member> d<M> b(@e final d<? extends M> d, @e final b b, final boolean b2) {
        k0.p(d, "$this$createInlineClassAwareCallerIfNeeded");
        k0.p(b, "descriptor");
        final boolean a = kotlin.reflect.jvm.internal.impl.resolve.f.a((a)b);
        final boolean b3 = false;
        int n = 0;
        Label_0180: {
            if (!a) {
                final List<e1> m = b.m();
                k0.o(m, "descriptor.valueParameters");
                boolean b4 = false;
                Label_0128: {
                    if (!(m instanceof Collection) || !m.isEmpty()) {
                        for (final e1 e1 : m) {
                            k0.o(e1, "it");
                            final c0 a2 = e1.a();
                            k0.o(a2, "it.type");
                            if (kotlin.reflect.jvm.internal.impl.resolve.f.c(a2)) {
                                b4 = true;
                                break Label_0128;
                            }
                        }
                    }
                    b4 = false;
                }
                if (!b4) {
                    final c0 returnType = b.getReturnType();
                    if (returnType == null || !kotlin.reflect.jvm.internal.impl.resolve.f.c(returnType)) {
                        n = (b3 ? 1 : 0);
                        if (d instanceof c) {
                            break Label_0180;
                        }
                        n = (b3 ? 1 : 0);
                        if (!g(b)) {
                            break Label_0180;
                        }
                    }
                }
            }
            n = 1;
        }
        d<M> d2 = (d<M>)d;
        if (n != 0) {
            d2 = new g<M>(b, d, b2);
        }
        return d2;
    }
    
    @e
    public static final Method d(@e final Class<?> obj, @e final b obj2) {
        k0.p(obj, "$this$getBoxMethod");
        k0.p(obj2, "descriptor");
        try {
            final Method declaredMethod = obj.getDeclaredMethod("box-impl", f(obj, obj2).getReturnType());
            k0.o(declaredMethod, "getDeclaredMethod(\"box\" \u2026d(descriptor).returnType)");
            return declaredMethod;
        }
        catch (NoSuchMethodException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No box method found in inline class: ");
            sb.append(obj);
            sb.append(" (calling ");
            sb.append(obj2);
            sb.append(')');
            throw new b0(sb.toString());
        }
    }
    
    private static final c0 e(final b b) {
        final t0 q0 = b.q0();
        final t0 j0 = b.j0();
        final c0 c0 = null;
        Object o;
        if (q0 != null) {
            o = q0.a();
        }
        else if (j0 == null) {
            o = c0;
        }
        else if (b instanceof l) {
            o = j0.a();
        }
        else {
            m c2;
            if (!((c2 = b.c()) instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                c2 = null;
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c2;
            o = c0;
            if (e != null) {
                o = e.A();
            }
        }
        return (c0)o;
    }
    
    @e
    public static final Method f(@e final Class<?> obj, @e final b obj2) {
        k0.p(obj, "$this$getUnboxMethod");
        k0.p(obj2, "descriptor");
        try {
            final Method declaredMethod = obj.getDeclaredMethod("unbox-impl", (Class[])new Class[0]);
            k0.o(declaredMethod, "getDeclaredMethod(\"unbox\u2026FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        }
        catch (NoSuchMethodException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No unbox method found in inline class: ");
            sb.append(obj);
            sb.append(" (calling ");
            sb.append(obj2);
            sb.append(')');
            throw new b0(sb.toString());
        }
    }
    
    private static final boolean g(final b b) {
        final c0 e = e(b);
        boolean b2 = true;
        if (e == null || !kotlin.reflect.jvm.internal.impl.resolve.f.c(e)) {
            b2 = false;
        }
        return b2;
    }
    
    @f
    public static final Class<?> h(@f final m m) {
        Class<?> clazz;
        if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e && kotlin.reflect.jvm.internal.impl.resolve.f.b(m)) {
            final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)m;
            final Class<?> n = kotlin.reflect.jvm.internal.k0.n(e);
            if (n == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Class object for the class ");
                sb.append(e.getName());
                sb.append(" cannot be found (classId=");
                sb.append(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.h((kotlin.reflect.jvm.internal.impl.descriptors.h)m));
                sb.append(')');
                throw new b0(sb.toString());
            }
            clazz = n;
        }
        else {
            clazz = null;
        }
        return clazz;
    }
    
    @f
    public static final Class<?> i(@e final c0 c0) {
        k0.p(c0, "$this$toInlineClass");
        return h(c0.N0().c());
    }
}
