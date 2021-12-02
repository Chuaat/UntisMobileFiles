// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.HashSet;
import n6.l;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;

public final class i implements l0
{
    @e
    private final List<i0> a;
    
    public i(@e final List<? extends i0> a) {
        k0.p(a, "providers");
        (this.a = (List<i0>)a).size();
        v.N5((Iterable<?>)a).size();
    }
    
    @e
    @Override
    public List<h0> a(@e final b b) {
        k0.p(b, "fqName");
        final ArrayList<h0> list = new ArrayList<h0>();
        final Iterator<i0> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.k0.a(iterator.next(), b, list);
        }
        return (List<h0>)v.I5((Iterable<?>)list);
    }
    
    @Override
    public void b(@e final b b, @e final Collection<h0> collection) {
        k0.p(b, "fqName");
        k0.p(collection, "packageFragments");
        final Iterator<i0> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.k0.a(iterator.next(), b, collection);
        }
    }
    
    @e
    @Override
    public Collection<b> z(@e final b b, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p(b, "fqName");
        k0.p(l, "nameFilter");
        final HashSet<Object> set = (HashSet<Object>)new HashSet<b>();
        final Iterator<i0> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            set.addAll(iterator.next().z(b, l));
        }
        return (Collection<b>)set;
    }
}
