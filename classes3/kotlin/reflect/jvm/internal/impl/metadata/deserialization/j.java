// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class j
{
    public static final boolean a(@e final a a) {
        k0.p((Object)a, "version");
        final int a2 = a.a();
        boolean b = true;
        if (a2 != 1 || a.b() < 4) {
            b = false;
        }
        return b;
    }
    
    public static final boolean b(@e final a a) {
        k0.p((Object)a, "version");
        return a(a);
    }
}
