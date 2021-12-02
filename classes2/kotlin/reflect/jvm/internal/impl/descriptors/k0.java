// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;

public final class k0
{
    public static final void a(@e final i0 i0, @e final b b, @e final Collection<h0> collection) {
        kotlin.jvm.internal.k0.p(i0, "<this>");
        kotlin.jvm.internal.k0.p(b, "fqName");
        kotlin.jvm.internal.k0.p(collection, "packageFragments");
        if (i0 instanceof l0) {
            ((l0)i0).b(b, collection);
        }
        else {
            collection.addAll(i0.a(b));
        }
    }
    
    @e
    public static final List<h0> b(@e final i0 i0, @e final b b) {
        kotlin.jvm.internal.k0.p(i0, "<this>");
        kotlin.jvm.internal.k0.p(b, "fqName");
        final ArrayList<h0> list = new ArrayList<h0>();
        a(i0, b, list);
        return list;
    }
}
