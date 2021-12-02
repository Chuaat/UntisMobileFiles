// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.resolve.constants.a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.collections.y0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.constants.b;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import n6.l;
import kotlin.n1;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.e;

public final class f
{
    @org.jetbrains.annotations.e
    private static final e a;
    @org.jetbrains.annotations.e
    private static final e b;
    @org.jetbrains.annotations.e
    private static final e c;
    @org.jetbrains.annotations.e
    private static final e d;
    @org.jetbrains.annotations.e
    private static final e e;
    
    static {
        final e i = kotlin.reflect.jvm.internal.impl.name.e.i("message");
        k0.o(i, "identifier(\"message\")");
        a = i;
        final e j = kotlin.reflect.jvm.internal.impl.name.e.i("replaceWith");
        k0.o(j, "identifier(\"replaceWith\")");
        b = j;
        final e k = kotlin.reflect.jvm.internal.impl.name.e.i("level");
        k0.o(k, "identifier(\"level\")");
        c = k;
        final e l = kotlin.reflect.jvm.internal.impl.name.e.i("expression");
        k0.o(l, "identifier(\"expression\")");
        d = l;
        final e m = kotlin.reflect.jvm.internal.impl.name.e.i("imports");
        k0.o(m, "identifier(\"imports\")");
        e = m;
    }
    
    @org.jetbrains.annotations.e
    public static final c a(@org.jetbrains.annotations.e final KotlinBuiltIns kotlinBuiltIns, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3) {
        k0.p(kotlinBuiltIns, "<this>");
        k0.p(s, "message");
        k0.p(s2, "replaceWith");
        k0.p(s3, "level");
        final j j = new j(kotlinBuiltIns, StandardNames.FqNames.replaceWith, y0.W(n1.a(f.d, new v(s2)), n1.a(f.e, new b((List)kotlin.collections.v.E(), (l)new l<e0, c0>() {
            @org.jetbrains.annotations.e
            public final c0 a(@org.jetbrains.annotations.e final e0 e0) {
                k0.p(e0, "module");
                final kotlin.reflect.jvm.internal.impl.types.k0 arrayType = e0.w().getArrayType(k1.K, (c0)kotlinBuiltIns.getStringType());
                k0.o(arrayType, "module.builtIns.getArrayType(Variance.INVARIANT, stringType)");
                return (c0)arrayType;
            }
        }))));
        final kotlin.reflect.jvm.internal.impl.name.b deprecated = StandardNames.FqNames.deprecated;
        final s0<e, v> a = n1.a(f.a, new v(s));
        final s0<e, a> a2 = n1.a(f.b, new a((c)j));
        final e c = f.c;
        final kotlin.reflect.jvm.internal.impl.name.a m = kotlin.reflect.jvm.internal.impl.name.a.m(StandardNames.FqNames.deprecationLevel);
        k0.o(m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        final e i = kotlin.reflect.jvm.internal.impl.name.e.i(s3);
        k0.o(i, "identifier(level)");
        return new j(kotlinBuiltIns, deprecated, (Map<e, ? extends g<?>>)y0.W(a, a2, n1.a(c, new kotlin.reflect.jvm.internal.impl.resolve.constants.j(m, i))));
    }
}
