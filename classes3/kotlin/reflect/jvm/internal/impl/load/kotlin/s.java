// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class s
{
    @e
    public static final String a(@e final v v, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final String s) {
        k0.p((Object)v, "<this>");
        k0.p((Object)e, "classDescriptor");
        k0.p((Object)s, "jvmDescriptor");
        return v.k(t.f(e), s);
    }
}
