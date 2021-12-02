// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import u6.a;
import kotlin.reflect.jvm.internal.impl.load.java.q;
import kotlin.reflect.jvm.internal.impl.load.java.r;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.z0$a;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.components.g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.i;
import kotlin.reflect.jvm.internal.impl.incremental.components.c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class l
{
    @e
    public static final d a(@e final e0 e0, @e final n n, @e final g0 g0, @e final f f, @e final m m, @e final kotlin.reflect.jvm.internal.impl.load.kotlin.e e2) {
        k0.p((Object)e0, "module");
        k0.p((Object)n, "storageManager");
        k0.p((Object)g0, "notFoundClasses");
        k0.p((Object)f, "lazyJavaPackageFragmentProvider");
        k0.p((Object)m, "reflectKotlinClassFinder");
        k0.p((Object)e2, "deserializedDescriptorResolver");
        return new d(n, e0, k.a.a, new kotlin.reflect.jvm.internal.impl.load.kotlin.f(m, e2), new b(e0, g0, n, m), f, g0, j.b, c.a.a, i.a.a(), kotlin.reflect.jvm.internal.impl.types.checker.l.b.a());
    }
    
    @e
    public static final f b(@e final ClassLoader classLoader, @e final e0 e0, @e final n n, @e final g0 g0, @e final m m, @e final kotlin.reflect.jvm.internal.impl.load.kotlin.e e2, @e final kotlin.reflect.jvm.internal.impl.load.java.lazy.i i, @e final u u) {
        k0.p((Object)classLoader, "classLoader");
        k0.p((Object)e0, "module");
        k0.p((Object)n, "storageManager");
        k0.p((Object)g0, "notFoundClasses");
        k0.p((Object)m, "reflectKotlinClassFinder");
        k0.p((Object)e2, "deserializedDescriptorResolver");
        k0.p((Object)i, "singleModuleClassResolver");
        k0.p((Object)u, "packagePartProvider");
        final kotlin.reflect.jvm.internal.impl.utils.e l = kotlin.reflect.jvm.internal.impl.utils.e.l;
        final kotlin.reflect.jvm.internal.impl.load.java.c c = new kotlin.reflect.jvm.internal.impl.load.java.c(n, l);
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.d d = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.d(classLoader);
        final kotlin.reflect.jvm.internal.impl.load.java.components.j a = kotlin.reflect.jvm.internal.impl.load.java.components.j.a;
        k0.o((Object)a, "DO_NOTHING");
        final j b = j.b;
        final g a2 = g.a;
        k0.o((Object)a2, "EMPTY");
        final kotlin.reflect.jvm.internal.impl.load.java.components.f.a a3 = kotlin.reflect.jvm.internal.impl.load.java.components.f.a.a;
        final u6.b b2 = new u6.b(n, v.E());
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.m a4 = m.a;
        final z0$a a5 = z0$a.a;
        final c.a a6 = kotlin.reflect.jvm.internal.impl.incremental.components.c.a.a;
        final ReflectionTypes reflectionTypes = new ReflectionTypes(e0, g0);
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.c.b b3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.c.b.b;
        return new f(new kotlin.reflect.jvm.internal.impl.load.java.lazy.b(n, d, m, e2, a, b, a2, a3, b2, a4, i, u, (z0)a5, a6, e0, reflectionTypes, c, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l(c, l, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d(b3)), r.a.a, b3, kotlin.reflect.jvm.internal.impl.types.checker.l.b.a(), l));
    }
}
