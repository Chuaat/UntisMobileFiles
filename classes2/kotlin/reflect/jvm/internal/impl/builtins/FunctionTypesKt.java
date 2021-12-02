// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.j;
import kotlin.s0;
import kotlin.n1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import java.util.ArrayList;
import kotlin.collections.v;
import m6.h;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.d0;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.c;

public final class FunctionTypesKt
{
    private static final kotlin.reflect.jvm.internal.impl.builtins.functions.c a(final c c) {
        if (c.f() && !c.e()) {
            final kotlin.reflect.jvm.internal.impl.builtins.functions.c.a i = kotlin.reflect.jvm.internal.impl.builtins.functions.c.I;
            final String d = c.i().d();
            k0.o(d, "shortName().asString()");
            final b e = c.l().e();
            k0.o(e, "toSafe().parent()");
            return i.b(d, e);
        }
        return null;
    }
    
    private static final boolean b(final c0 c0) {
        return ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations().a0(StandardNames.FqNames.extensionFunctionType) != null;
    }
    
    @h
    @e
    public static final kotlin.reflect.jvm.internal.impl.types.k0 createFunctionType(@e final KotlinBuiltIns kotlinBuiltIns, @e final g g, @f final c0 c0, @e final List<? extends c0> list, @f final List<kotlin.reflect.jvm.internal.impl.name.e> list2, @e final c0 c2, final boolean b) {
        k0.p(kotlinBuiltIns, "builtIns");
        k0.p(g, "annotations");
        k0.p(list, "parameterTypes");
        k0.p(c2, "returnType");
        final List<y0> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(c0, list, list2, c2, kotlinBuiltIns);
        int size = list.size();
        if (c0 != null) {
            ++size;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor = getFunctionDescriptor(kotlinBuiltIns, size, b);
        g withExtensionFunctionAnnotation = g;
        if (c0 != null) {
            withExtensionFunctionAnnotation = withExtensionFunctionAnnotation(g, kotlinBuiltIns);
        }
        final d0 a = d0.a;
        return d0.g(withExtensionFunctionAnnotation, functionDescriptor, (List)functionTypeArgumentProjections);
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.name.e extractParameterNameFromFunctionTypeArgument(@e final c0 c0) {
        k0.p(c0, "<this>");
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a0 = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations().a0(StandardNames.FqNames.parameterName);
        if (a0 == null) {
            return null;
        }
        final Object v4 = v.V4((Iterable<?>)a0.b().values());
        Object o;
        if (v4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.v) {
            o = v4;
        }
        else {
            o = null;
        }
        String s = null;
        Label_0090: {
            if (o != null) {
                s = (String)((kotlin.reflect.jvm.internal.impl.resolve.constants.g)o).b();
                if (s != null) {
                    if (kotlin.reflect.jvm.internal.impl.name.e.k(s)) {
                        break Label_0090;
                    }
                }
            }
            s = null;
        }
        if (s == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.name.e.i(s);
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e getFunctionDescriptor(@e final KotlinBuiltIns kotlinBuiltIns, final int n, final boolean b) {
        k0.p(kotlinBuiltIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.descriptors.e e;
        if (b) {
            e = kotlinBuiltIns.getSuspendFunction(n);
        }
        else {
            e = kotlinBuiltIns.getFunction(n);
        }
        k0.o(e, "if (isSuspendFunction) builtIns.getSuspendFunction(parameterCount) else builtIns.getFunction(parameterCount)");
        return e;
    }
    
    @e
    public static final List<y0> getFunctionTypeArgumentProjections(@f final c0 c0, @e final List<? extends c0> list, @f final List<kotlin.reflect.jvm.internal.impl.name.e> list2, @e final c0 c2, @e final KotlinBuiltIns kotlinBuiltIns) {
        k0.p(list, "parameterTypes");
        k0.p(c2, "returnType");
        k0.p(kotlinBuiltIns, "builtIns");
        final int size = list.size();
        final int n = 0;
        int n2;
        if (c0 != null) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final ArrayList list3 = new ArrayList<y0>(size + n2 + 1);
        Object a;
        if (c0 == null) {
            a = null;
        }
        else {
            a = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(c0);
        }
        kotlin.reflect.jvm.internal.impl.utils.a.a((Collection)list3, a);
        final Iterator<c0> iterator = (Iterator<c0>)list.iterator();
        int n3 = n;
        while (iterator.hasNext()) {
            final c0 next = iterator.next();
            if (n3 < 0) {
                v.W();
            }
            final c0 c3 = next;
            kotlin.reflect.jvm.internal.impl.name.e e = null;
            Label_0158: {
                if (list2 != null) {
                    e = list2.get(n3);
                    if (e != null) {
                        if (!e.j()) {
                            break Label_0158;
                        }
                    }
                }
                e = null;
            }
            c0 l = c3;
            if (e != null) {
                final b parameterName = StandardNames.FqNames.parameterName;
                final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i("name");
                final String d = e.d();
                k0.o(d, "name.asString()");
                l = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.l(c3, g.r.a(v.n4((Iterable<? extends j>)((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c3).getAnnotations(), new j(kotlinBuiltIns, parameterName, (Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>)kotlin.collections.y0.k((s0<?, ?>)n1.a((K)i, (V)new kotlin.reflect.jvm.internal.impl.resolve.constants.v(d)))))));
            }
            list3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(l));
            ++n3;
        }
        list3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(c2));
        return (List<y0>)list3;
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.c getFunctionalClassKind(@e final m m) {
        k0.p(m, "<this>");
        if (!(m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            return null;
        }
        if (!KotlinBuiltIns.isUnderKotlinPackage(m)) {
            return null;
        }
        return a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j(m));
    }
    
    @f
    public static final c0 getReceiverTypeFromFunctionType(@e c0 a) {
        k0.p(a, "<this>");
        isBuiltinFunctionalType(a);
        if (b(a)) {
            a = v.o2((List<? extends y0>)a.M0()).a();
        }
        else {
            a = null;
        }
        return a;
    }
    
    @e
    public static final c0 getReturnTypeFromFunctionType(@e c0 a) {
        k0.p(a, "<this>");
        isBuiltinFunctionalType(a);
        a = v.c3((List<? extends y0>)a.M0()).a();
        k0.o(a, "arguments.last().type");
        return a;
    }
    
    @e
    public static final List<y0> getValueParameterTypesFromFunctionType(@e final c0 c0) {
        k0.p(c0, "<this>");
        isBuiltinFunctionalType(c0);
        final List m0 = c0.M0();
        return m0.subList(isBuiltinExtensionFunctionalType(c0) ? 1 : 0, m0.size() - 1);
    }
    
    public static final boolean isBuiltinExtensionFunctionalType(@e final c0 c0) {
        k0.p(c0, "<this>");
        return isBuiltinFunctionalType(c0) && b(c0);
    }
    
    public static final boolean isBuiltinFunctionalClassDescriptor(@e final m m) {
        k0.p(m, "<this>");
        final kotlin.reflect.jvm.internal.impl.builtins.functions.c functionalClassKind = getFunctionalClassKind(m);
        return functionalClassKind == kotlin.reflect.jvm.internal.impl.builtins.functions.c.J || functionalClassKind == kotlin.reflect.jvm.internal.impl.builtins.functions.c.K;
    }
    
    public static final boolean isBuiltinFunctionalType(@e final c0 c0) {
        k0.p(c0, "<this>");
        final kotlin.reflect.jvm.internal.impl.descriptors.h c2 = c0.N0().c();
        Object value;
        if (c2 == null) {
            value = null;
        }
        else {
            value = isBuiltinFunctionalClassDescriptor(c2);
        }
        return k0.g(value, Boolean.TRUE);
    }
    
    public static final boolean isFunctionType(@e final c0 c0) {
        k0.p(c0, "<this>");
        final kotlin.reflect.jvm.internal.impl.descriptors.h c2 = c0.N0().c();
        kotlin.reflect.jvm.internal.impl.builtins.functions.c functionalClassKind;
        if (c2 == null) {
            functionalClassKind = null;
        }
        else {
            functionalClassKind = getFunctionalClassKind(c2);
        }
        return functionalClassKind == kotlin.reflect.jvm.internal.impl.builtins.functions.c.J;
    }
    
    public static final boolean isSuspendFunctionType(@e final c0 c0) {
        k0.p(c0, "<this>");
        final kotlin.reflect.jvm.internal.impl.descriptors.h c2 = c0.N0().c();
        kotlin.reflect.jvm.internal.impl.builtins.functions.c functionalClassKind;
        if (c2 == null) {
            functionalClassKind = null;
        }
        else {
            functionalClassKind = getFunctionalClassKind(c2);
        }
        return functionalClassKind == kotlin.reflect.jvm.internal.impl.builtins.functions.c.K;
    }
    
    @e
    public static final g withExtensionFunctionAnnotation(@e g a, @e final KotlinBuiltIns kotlinBuiltIns) {
        k0.p(a, "<this>");
        k0.p(kotlinBuiltIns, "builtIns");
        final b extensionFunctionType = StandardNames.FqNames.extensionFunctionType;
        if (!a.B4(extensionFunctionType)) {
            a = g.r.a(v.n4((Iterable<? extends j>)a, new j(kotlinBuiltIns, extensionFunctionType, kotlin.collections.y0.z())));
        }
        return a;
    }
}
