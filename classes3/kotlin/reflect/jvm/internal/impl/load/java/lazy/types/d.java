// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.load.java.components.k;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.List;
import java.util.Objects;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import n6.a;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;

public final class d
{
    @e
    private static final b a;
    
    static {
        a = new b("java.lang.Class");
    }
    
    @e
    public static final c0 b(@e b1 b1, @f b1 b2, @e final a<? extends c0> a) {
        k0.p((Object)b1, "<this>");
        k0.p((Object)a, "defaultValue");
        if (b1 == b2) {
            return (c0)a.invoke();
        }
        final List upperBounds = b1.getUpperBounds();
        k0.o((Object)upperBounds, "upperBounds");
        final c0 c0 = (c0)v.o2(upperBounds);
        if (c0.N0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            k0.o((Object)c0, "firstUpperBound");
            return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.m(c0);
        }
        if (b2 != null) {
            b1 = b2;
        }
        h obj = c0.N0().c();
        while (true) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            b2 = (b1)obj;
            if (k0.g((Object)b2, (Object)b1)) {
                return (c0)a.invoke();
            }
            final List upperBounds2 = b2.getUpperBounds();
            k0.o((Object)upperBounds2, "current.upperBounds");
            final c0 c2 = (c0)v.o2(upperBounds2);
            if (c2.N0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                k0.o((Object)c2, "nextUpperBound");
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.m(c2);
            }
            obj = c2.N0().c();
        }
    }
    
    @e
    public static final y0 d(@e final b1 b1, @e final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a a) {
        k0.p((Object)b1, "typeParameter");
        k0.p((Object)a, "attr");
        z0 z0;
        if (a.d() == k.G) {
            z0 = new a1(q0.a(b1));
        }
        else {
            z0 = new p0(b1);
        }
        return z0;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a e(@e final k k, final boolean b, @f final b1 b2) {
        k0.p((Object)k, "<this>");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a(k, null, b, b2, 2, null);
    }
}
