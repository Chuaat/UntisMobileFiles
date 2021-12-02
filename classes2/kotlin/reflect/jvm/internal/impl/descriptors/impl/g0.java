// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.collections.j1;
import java.util.Set;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.utils.a;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c$b;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.Collection;
import n6.l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.i;

public class g0 extends i
{
    @e
    private final e0 b;
    @e
    private final b c;
    
    public g0(@e final e0 b, @e final b c) {
        k0.p(b, "moduleDescriptor");
        k0.p(c, "fqName");
        this.b = b;
        this.c = c;
    }
    
    @e
    public Collection<m> e(@e final d d, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p(d, "kindFilter");
        k0.p(l, "nameFilter");
        if (!d.a(d.c.g())) {
            return (Collection<m>)v.E();
        }
        if (this.c.d() && d.n().contains(c$b.a)) {
            return (Collection<m>)v.E();
        }
        final Collection<b> z = this.b.z(this.c, l);
        final ArrayList list = new ArrayList<m>(z.size());
        final Iterator<b> iterator = z.iterator();
        while (iterator.hasNext()) {
            final kotlin.reflect.jvm.internal.impl.name.e g = iterator.next().g();
            k0.o(g, "subFqName.shortName()");
            if (l.invoke(g)) {
                a.a((Collection)list, (Object)this.i(g));
            }
        }
        return (Collection<m>)list;
    }
    
    @e
    public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
        return j1.k();
    }
    
    @f
    protected final m0 i(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(e, "name");
        if (e.j()) {
            return null;
        }
        final e0 b = this.b;
        final b c = this.c.c(e);
        k0.o(c, "fqName.child(name)");
        final m0 r = b.R(c);
        if (r.isEmpty()) {
            return null;
        }
        return r;
    }
}
