// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.t;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import java.util.List;

public final class g
{
    @e
    private final List<a.q> a;
    
    public g(@e final a.t t) {
        k0.p((Object)t, "typeTable");
        List<a.q> d = t.D();
        if (t.E()) {
            final int z = t.z();
            final List<a.q> d2 = t.D();
            k0.o((Object)d2, "typeTable.typeList");
            d = new ArrayList<a.q>(v.Y((Iterable)d2, 10));
            int n = 0;
            for (final a.q next : d2) {
                if (n < 0) {
                    v.W();
                }
                t b;
                final a.q q = (a.q)(b = next);
                if (n >= z) {
                    b = q.C0().d0(true).B();
                }
                d.add((a.q)b);
                ++n;
            }
        }
        k0.o((Object)d, "run {\n        val originalTypes = typeTable.typeList\n        if (typeTable.hasFirstNullable()) {\n            val firstNullable = typeTable.firstNullable\n            typeTable.typeList.mapIndexed { i, type ->\n                if (i >= firstNullable) {\n                    type.toBuilder().setNullable(true).build()\n                } else type\n            }\n        } else originalTypes\n    }");
        this.a = d;
    }
    
    @e
    public final a.q a(final int n) {
        return this.a.get(n);
    }
}
