// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import java.util.Collection;
import n6.l;
import java.util.Set;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class f extends i
{
    @e
    private final h b;
    
    public f(@e final h b) {
        k0.p((Object)b, "workerScope");
        this.b = b;
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
        return this.b.b();
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
        return this.b.d();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
        return this.b.f();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final kotlin.reflect.jvm.internal.impl.descriptors.h g = this.b.g(e, b);
        final kotlin.reflect.jvm.internal.impl.descriptors.h h = null;
        Object o;
        if (g == null) {
            o = h;
        }
        else {
            if (g instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                o = g;
            }
            else {
                o = null;
            }
            if (o == null) {
                o = h;
                if (g instanceof a1) {
                    o = g;
                }
            }
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.h)o;
    }
    
    @Override
    public void h(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.b.h(e, b);
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.descriptors.h> i(@e d p2, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)p2, "kindFilter");
        k0.p((Object)l, "nameFilter");
        p2 = p2.p(d.c.d());
        if (p2 == null) {
            return (List<kotlin.reflect.jvm.internal.impl.descriptors.h>)v.E();
        }
        final Collection<m> e = this.b.e(p2, l);
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.h>();
        for (final kotlin.reflect.jvm.internal.impl.descriptors.h next : e) {
            if (next instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) {
                list.add(next);
            }
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.h>)list;
    }
    
    @e
    @Override
    public String toString() {
        return k0.C("Classes from ", (Object)this.b);
    }
}
