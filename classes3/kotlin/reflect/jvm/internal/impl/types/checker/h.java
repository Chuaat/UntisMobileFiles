// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;

public final class h
{
    @e
    private static final d0<p<g>> a;
    
    static {
        a = new d0("KotlinTypeRefiner");
    }
    
    @e
    public static final d0<p<g>> a() {
        return h.a;
    }
    
    @e
    public static final List<c0> b(@e final g g, @e final Iterable<? extends c0> iterable) {
        k0.p((Object)g, "<this>");
        k0.p((Object)iterable, "types");
        final ArrayList<c0> list = new ArrayList<c0>(v.Y((Iterable)iterable, 10));
        final Iterator<? extends c0> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(g.g((c0)iterator.next()));
        }
        return list;
    }
}
