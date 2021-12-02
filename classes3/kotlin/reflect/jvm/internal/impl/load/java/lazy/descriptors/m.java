// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Iterator;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.load.java.components.k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.List;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.d;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;

public final class m extends b
{
    @e
    private final g Q;
    @e
    private final y R;
    @e
    private final d S;
    
    public m(@e final g q, @e final y r, final int n, @e final kotlin.reflect.jvm.internal.impl.descriptors.m m) {
        k0.p((Object)q, "c");
        k0.p((Object)r, "javaTypeParameter");
        k0.p((Object)m, "containingDeclaration");
        super(q.e(), m, r.getName(), k1.K, false, n, w0.a, q.a().u());
        this.Q = q;
        this.R = r;
        this.S = new d(q, r, false, 4, null);
    }
    
    private final List<c0> N0() {
        final Collection<j> upperBounds = this.R.getUpperBounds();
        if (upperBounds.isEmpty()) {
            final d0 a = d0.a;
            final kotlin.reflect.jvm.internal.impl.types.k0 anyType = this.Q.d().w().getAnyType();
            k0.o((Object)anyType, "c.module.builtIns.anyType");
            final kotlin.reflect.jvm.internal.impl.types.k0 nullableAnyType = this.Q.d().w().getNullableAnyType();
            k0.o((Object)nullableAnyType, "c.module.builtIns.nullableAnyType");
            return (List<c0>)v.k((Object)d0.d(anyType, nullableAnyType));
        }
        final ArrayList list = new ArrayList<c0>(v.Y((Iterable)upperBounds, 10));
        final Iterator<Object> iterator = upperBounds.iterator();
        while (iterator.hasNext()) {
            list.add(this.Q.g().n(iterator.next(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(k.H, false, (b1)this, 1, null)));
        }
        return (List<c0>)list;
    }
    
    @e
    protected List<c0> G0(@e final List<? extends c0> list) {
        k0.p((Object)list, "bounds");
        return this.Q.a().q().g((b1)this, list, this.Q);
    }
    
    protected void L0(@e final c0 c0) {
        k0.p((Object)c0, "type");
    }
    
    @e
    protected List<c0> M0() {
        return this.N0();
    }
    
    @e
    public d O0() {
        return this.S;
    }
}
