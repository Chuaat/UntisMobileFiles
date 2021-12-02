// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.y;

public abstract class a
{
    @e
    public final c a(@e final y y) {
        k0.p((Object)y, "functionDescriptor");
        for (final d d : this.b()) {
            if (!d.b(y)) {
                continue;
            }
            return d.a(y);
        }
        return c.a.b;
    }
    
    @e
    public abstract List<d> b();
}
