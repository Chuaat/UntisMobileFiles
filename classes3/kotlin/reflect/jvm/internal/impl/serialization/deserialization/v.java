// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;

public final class v
{
    @e
    public static final a a(@e final c c, final int n) {
        k0.p((Object)c, "<this>");
        final a f = a.f(c.a(n), c.b(n));
        k0.o((Object)f, "fromString(getQualifiedClassName(index), isLocalClassName(index))");
        return f;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.name.e b(@e final c c, final int n) {
        k0.p((Object)c, "<this>");
        final kotlin.reflect.jvm.internal.impl.name.e h = kotlin.reflect.jvm.internal.impl.name.e.h(c.getString(n));
        k0.o((Object)h, "guessByFirstCharacter(getString(index))");
        return h;
    }
}
