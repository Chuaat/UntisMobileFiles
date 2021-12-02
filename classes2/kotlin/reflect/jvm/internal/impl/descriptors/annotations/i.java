// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class i
{
    @e
    public static final g a(@e g g, @e final g g2) {
        k0.p(g, "first");
        k0.p(g2, "second");
        if (g.isEmpty()) {
            g = g2;
        }
        else if (!g2.isEmpty()) {
            g = new k(new g[] { g, g2 });
        }
        return g;
    }
}
