// 
// Decompiled by Procyon v0.5.36
// 

package x6;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.utils.i;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import java.util.Collection;

public final class a
{
    @f
    public static final <T> Collection<T> a(@f final Collection<? extends T> c, @e final Collection<? extends T> collection) {
        k0.p((Object)collection, "collection");
        if (collection.isEmpty()) {
            return (Collection<T>)c;
        }
        if (c == null) {
            return (Collection<T>)collection;
        }
        if (c instanceof LinkedHashSet) {
            ((LinkedHashSet<Object>)c).addAll(collection);
            return (Collection<T>)c;
        }
        final LinkedHashSet<Object> set = (LinkedHashSet<Object>)new LinkedHashSet<T>(c);
        set.addAll(collection);
        return (Collection<T>)set;
    }
    
    @e
    public static final i<h> b(@e final Iterable<? extends h> iterable) {
        k0.p((Object)iterable, "scopes");
        final i<h> i = new i<h>();
        for (final h next : iterable) {
            final h h = next;
            if (h != null && h != kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c.b) {
                i.add(next);
            }
        }
        return i;
    }
}
