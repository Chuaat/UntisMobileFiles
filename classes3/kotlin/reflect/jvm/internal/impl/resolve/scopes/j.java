// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.v;
import java.util.HashSet;
import kotlin.jvm.internal.k0;
import java.util.Set;
import org.jetbrains.annotations.e;

public final class j
{
    @f
    public static final Set<kotlin.reflect.jvm.internal.impl.name.e> a(@e final Iterable<? extends h> iterable) {
        k0.p((Object)iterable, "<this>");
        final HashSet<kotlin.reflect.jvm.internal.impl.name.e> set = new HashSet<kotlin.reflect.jvm.internal.impl.name.e>();
        final Iterator<? extends h> iterator = iterable.iterator();
        HashSet<kotlin.reflect.jvm.internal.impl.name.e> set2;
        while (true) {
            set2 = set;
            if (!iterator.hasNext()) {
                break;
            }
            final Set<kotlin.reflect.jvm.internal.impl.name.e> f = ((h)iterator.next()).f();
            if (f == null) {
                set2 = null;
                break;
            }
            v.q0((Collection)set, (Iterable)f);
        }
        return set2;
    }
}
