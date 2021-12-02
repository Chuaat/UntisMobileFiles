// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.e;
import kotlin.reflect.jvm.internal.impl.name.c;
import kotlin.reflect.jvm.internal.impl.name.b;

public final class h
{
    private static final b c(b c, final String s) {
        c = c.c(e.i(s));
        k0.o((Object)c, "child(Name.identifier(name))");
        return c;
    }
    
    private static final b d(final c c, final String s) {
        final b l = c.c(e.i(s)).l();
        k0.o((Object)l, "child(Name.identifier(name)).toSafe()");
        return l;
    }
}
