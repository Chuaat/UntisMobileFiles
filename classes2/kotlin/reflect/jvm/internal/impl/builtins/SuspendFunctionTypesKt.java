// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.j0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.m;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.u;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.y;

public final class SuspendFunctionTypesKt
{
    @e
    private static final y a;
    @e
    private static final y b;
    
    static {
        final e0 q = u.q();
        k0.o(q, "getErrorModule()");
        final m m = new m(q, StandardNames.COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL);
        final f h = f.H;
        final kotlin.reflect.jvm.internal.impl.name.e g = StandardNames.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL.g();
        final w0 a2 = w0.a;
        final n e = kotlin.reflect.jvm.internal.impl.storage.f.e;
        final y a3 = new y(m, h, false, false, g, a2, e);
        final b0 k = b0.K;
        a3.N0(k);
        final kotlin.reflect.jvm.internal.impl.descriptors.u e2 = t.e;
        a3.P0(e2);
        final g.a r = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r;
        final g b2 = r.b();
        final k1 l = k1.L;
        a3.O0(v.k(j0.S0(a3, b2, false, l, kotlin.reflect.jvm.internal.impl.name.e.i("T"), 0, e)));
        a3.L0();
        a = a3;
        final e0 q2 = u.q();
        k0.o(q2, "getErrorModule()");
        final y b3 = new y(new m(q2, StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE), h, false, false, StandardNames.CONTINUATION_INTERFACE_FQ_NAME_RELEASE.g(), a2, e);
        b3.N0(k);
        b3.P0(e2);
        b3.O0(v.k(j0.S0(b3, r.b(), false, l, kotlin.reflect.jvm.internal.impl.name.e.i("T"), 0, e)));
        b3.L0();
        b = b3;
    }
    
    public static final boolean isContinuation(@org.jetbrains.annotations.f final b b, final boolean b2) {
        b b3;
        if (b2) {
            b3 = StandardNames.CONTINUATION_INTERFACE_FQ_NAME_RELEASE;
        }
        else {
            b3 = StandardNames.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL;
        }
        return k0.g(b, b3);
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.types.k0 transformSuspendFunctionToRuntimeFunctionType(@e final c0 c0, final boolean b) {
        k0.p(c0, "suspendFunType");
        FunctionTypesKt.isSuspendFunctionType(c0);
        final KotlinBuiltIns e = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(c0);
        final g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations();
        final c0 receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(c0);
        final List<y0> valueParameterTypesFromFunctionType = FunctionTypesKt.getValueParameterTypesFromFunctionType(c0);
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.types.k0>(v.Y((Iterable<?>)valueParameterTypesFromFunctionType, 10));
        final Iterator<Object> iterator = valueParameterTypesFromFunctionType.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().a());
        }
        final d0 a = d0.a;
        final g b2 = g.r.b();
        y y;
        if (b) {
            y = SuspendFunctionTypesKt.b;
        }
        else {
            y = SuspendFunctionTypesKt.a;
        }
        final kotlin.reflect.jvm.internal.impl.types.w0 l = y.l();
        k0.o(l, "if (isReleaseCoroutines) FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE.typeConstructor\n                    else FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL.typeConstructor");
        final List<kotlin.reflect.jvm.internal.impl.types.k0> r4 = v.r4((Collection<? extends kotlin.reflect.jvm.internal.impl.types.k0>)list, d0.i(b2, l, (List)v.k(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(FunctionTypesKt.getReturnTypeFromFunctionType(c0))), false, (kotlin.reflect.jvm.internal.impl.types.checker.g)null, 16, (Object)null));
        final kotlin.reflect.jvm.internal.impl.types.k0 nullableAnyType = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(c0).getNullableAnyType();
        k0.o(nullableAnyType, "suspendFunType.builtIns.nullableAnyType");
        return FunctionTypesKt.createFunctionType$default(e, annotations, receiverTypeFromFunctionType, r4, null, (c0)nullableAnyType, false, 64, null).U0(c0.O0());
    }
}
