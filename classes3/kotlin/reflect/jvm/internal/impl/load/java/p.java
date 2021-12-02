// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.resolve.e;

public final class p implements e
{
    @org.jetbrains.annotations.e
    @Override
    public a a() {
        return a.I;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a2, @f final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)a, "superDescriptor");
        k0.p((Object)a2, "subDescriptor");
        if (!(a2 instanceof q0) || !(a instanceof q0)) {
            return b.J;
        }
        final q0 q0 = (q0)a2;
        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)q0).getName();
        final q0 q2 = (q0)a;
        if (!k0.g((Object)name, (Object)((f0)q2).getName())) {
            return b.J;
        }
        if (c.a(q0) && c.a(q2)) {
            return b.G;
        }
        if (!c.a(q0) && !c.a(q2)) {
            return b.J;
        }
        return b.I;
    }
}
