// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c$b;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a$a;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.t;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.checker.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.i;
import kotlin.reflect.jvm.internal.impl.incremental.components.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;

public final class d
{
    @e
    private final j a;
    
    public d(@e final n n, @e final e0 e0, @e final k k, @e final f f, @e final b b, @e final kotlin.reflect.jvm.internal.impl.load.java.lazy.f f2, @e final g0 g0, @e final p p11, @e final c c, @e final i i, @e final l l) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)e0, "moduleDescriptor");
        k0.p((Object)k, "configuration");
        k0.p((Object)f, "classDataFinder");
        k0.p((Object)b, "annotationAndConstantLoader");
        k0.p((Object)f2, "packageFragmentProvider");
        k0.p((Object)g0, "notFoundClasses");
        k0.p((Object)p11, "errorReporter");
        k0.p((Object)c, "lookupTracker");
        k0.p((Object)i, "contractDeserializer");
        k0.p((Object)l, "kotlinTypeChecker");
        final KotlinBuiltIns w = e0.w();
        final boolean b2 = w instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.f;
        final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c c2 = null;
        kotlin.reflect.jvm.internal.impl.builtins.jvm.f f3;
        if (b2) {
            f3 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.f)w;
        }
        else {
            f3 = null;
        }
        final t.a a = t.a.a;
        final g a2 = g.a;
        final List e2 = v.E();
        Object u;
        if (f3 == null) {
            u = null;
        }
        else {
            u = f3.u();
        }
        Object a3 = u;
        if (u == null) {
            a3 = a$a.a;
        }
        Object o;
        if (f3 == null) {
            o = c2;
        }
        else {
            o = f3.u();
        }
        if (o == null) {
            o = c$b.a;
        }
        this.a = new j(n, e0, k, f, b, (i0)f2, a, p11, c, a2, e2, g0, i, (a)a3, (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c)o, h.a.a(), l, new u6.b(n, v.E()), null, 262144, null);
    }
    
    @e
    public final j a() {
        return this.a;
    }
}
