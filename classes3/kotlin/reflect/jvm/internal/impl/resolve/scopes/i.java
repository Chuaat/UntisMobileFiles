// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import org.jetbrains.annotations.f;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.name.e;

public abstract class i implements h
{
    @org.jetbrains.annotations.e
    @Override
    public Collection<? extends v0> a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return (Collection<? extends v0>)v.E();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Set<e> b() {
        final Collection<m> e = this.e(d.v, kotlin.reflect.jvm.internal.impl.utils.d.a());
        final LinkedHashSet<e> set = new LinkedHashSet<e>();
        for (final v0 next : e) {
            if (next instanceof v0) {
                final e name = ((f0)next).getName();
                k0.o((Object)name, "it.name");
                set.add(name);
            }
        }
        return set;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<? extends q0> c(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return (Collection<? extends q0>)v.E();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Set<e> d() {
        final Collection<m> e = this.e(d.w, kotlin.reflect.jvm.internal.impl.utils.d.a());
        final LinkedHashSet<e> set = new LinkedHashSet<e>();
        for (final v0 next : e) {
            if (next instanceof v0) {
                final e name = ((f0)next).getName();
                k0.o((Object)name, "it.name");
                set.add(name);
            }
        }
        return set;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<m> e(@org.jetbrains.annotations.e final d d, @org.jetbrains.annotations.e final l<? super e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        return (Collection<m>)v.E();
    }
    
    @f
    @Override
    public Set<e> f() {
        return null;
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return null;
    }
    
    @Override
    public void h(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        h.b.a(this, e, b);
    }
}
