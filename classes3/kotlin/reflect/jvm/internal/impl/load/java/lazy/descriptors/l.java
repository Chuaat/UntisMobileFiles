// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.r;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;

public abstract class l extends j
{
    public l(@e final g g) {
        k0.p((Object)g, "c");
        super(g, null, 2, null);
    }
    
    @f
    @Override
    protected t0 A() {
        return null;
    }
    
    @e
    @Override
    protected a I(@e final r r, @e final List<? extends b1> list, @e final c0 c0, @e final List<? extends e1> list2) {
        k0.p((Object)r, "method");
        k0.p((Object)list, "methodTypeParameters");
        k0.p((Object)c0, "returnType");
        k0.p((Object)list2, "valueParameters");
        return new a(c0, null, list2, list, false, v.E());
    }
    
    @Override
    protected void t(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final Collection<q0> collection) {
        k0.p((Object)e, "name");
        k0.p((Object)collection, "result");
    }
}
