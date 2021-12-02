// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.m0;
import kotlin.sequences.m;
import kotlin.sequences.p;
import kotlin.collections.v;
import n6.l;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Collection;

public final class j0 implements l0
{
    @e
    private final Collection<h0> a;
    
    public j0(@e final Collection<? extends h0> a) {
        k0.p(a, "packageFragments");
        this.a = (Collection<h0>)a;
    }
    
    @e
    @Override
    public List<h0> a(@e final b b) {
        k0.p(b, "fqName");
        final Collection<h0> a = this.a;
        final ArrayList<h0> list = new ArrayList<h0>();
        for (final h0 next : a) {
            if (k0.g(next.f(), b)) {
                list.add(next);
            }
        }
        return list;
    }
    
    @Override
    public void b(@e final b b, @e final Collection<h0> collection) {
        k0.p(b, "fqName");
        k0.p(collection, "packageFragments");
        for (final h0 next : this.a) {
            if (k0.g(next.f(), b)) {
                collection.add(next);
            }
        }
    }
    
    @e
    @Override
    public Collection<b> z(@e final b b, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p(b, "fqName");
        k0.p(l, "nameFilter");
        return (Collection<b>)p.V2(p.i0(p.d1((m)v.n1((Iterable<?>)this.a), (l)j0$a.G), (l)new l<b, Boolean>() {
            public final boolean a(@e final b b) {
                k0.p(b, "it");
                return !b.d() && k0.g(b.e(), b);
            }
        }));
    }
}
