// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import java.util.Collection;

public final class o
{
    @e
    public static final b a(@e final Collection<? extends b> collection) {
        k0.p((Object)collection, "descriptors");
        collection.isEmpty();
        final b b = null;
        final Iterator<? extends b> iterator = collection.iterator();
        a0 a0 = (a0)b;
        while (iterator.hasNext()) {
            final b b2 = (b)iterator.next();
            if (a0 != null) {
                final Integer d = t.d(a0.getVisibility(), ((a0)b2).getVisibility());
                if (d == null || d >= 0) {
                    continue;
                }
            }
            a0 = (a0)b2;
        }
        k0.m((Object)a0);
        return (b)a0;
    }
}
