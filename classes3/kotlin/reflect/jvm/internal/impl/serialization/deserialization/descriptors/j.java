// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.collections.j1;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Iterator;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;

public class j extends i
{
    @e
    private final h0 g;
    @e
    private final kotlin.reflect.jvm.internal.impl.name.b h;
    
    public j(@e final h0 g, @e final kotlin.reflect.jvm.internal.impl.metadata.a.l l, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a a, @f final g g2, @e final kotlin.reflect.jvm.internal.impl.serialization.deserialization.j j, @e final n6.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.e>> a2) {
        k0.p((Object)g, "packageDescriptor");
        k0.p((Object)l, "proto");
        k0.p((Object)c, "nameResolver");
        k0.p((Object)a, "metadataVersion");
        k0.p((Object)j, "components");
        k0.p((Object)a2, "classNames");
        final kotlin.reflect.jvm.internal.impl.metadata.a.t x = l.X();
        k0.o((Object)x, "proto.typeTable");
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g3 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(x);
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.a b = kotlin.reflect.jvm.internal.impl.metadata.deserialization.i.b;
        final kotlin.reflect.jvm.internal.impl.metadata.a.w y = l.Y();
        k0.o((Object)y, "proto.versionRequirementTable");
        final l a3 = j.a(g, c, g3, b.a(y), a, g2);
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.i> q = l.Q();
        k0.o((Object)q, "proto.functionList");
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.n> t = l.T();
        k0.o((Object)t, "proto.propertyList");
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.r> w = l.W();
        k0.o((Object)w, "proto.typeAliasList");
        super(a3, q, t, w, a2);
        this.g = g;
        this.h = g.f();
    }
    
    @e
    public List<m> A(@e final d d, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        final Collection<m> i = this.l(d, l, kotlin.reflect.jvm.internal.impl.incremental.components.d.S);
        final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> k = this.r().c().k();
        final ArrayList list = new ArrayList();
        final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> iterator = k.iterator();
        while (iterator.hasNext()) {
            v.q0((Collection)list, (Iterable)iterator.next().a(this.h));
        }
        return (List<m>)v.q4((Collection)i, (Iterable)list);
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.h(e, b);
        return super.g(e, b);
    }
    
    @Override
    public void h(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        r6.a.b(this.r().c().o(), b, this.g, e);
    }
    
    @Override
    protected void k(@e final Collection<m> collection, @e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)collection, "result");
        k0.p((Object)l, "nameFilter");
    }
    
    @e
    @Override
    protected kotlin.reflect.jvm.internal.impl.name.a o(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        return new kotlin.reflect.jvm.internal.impl.name.a(this.h, e);
    }
    
    @f
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> u() {
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
    }
    
    @e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> v() {
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
    }
    
    @e
    @Override
    protected Set<kotlin.reflect.jvm.internal.impl.name.e> w() {
        return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
    }
    
    @Override
    protected boolean y(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        final boolean y = super.y(e);
        boolean b = true;
        if (!y) {
            final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> k = this.r().c().k();
            boolean b2 = false;
            Label_0105: {
                if (!(k instanceof Collection) || !((Collection<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b>)k).isEmpty()) {
                    final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> iterator = (Iterator<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b>)k.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().b(this.h, e)) {
                            b2 = true;
                            break Label_0105;
                        }
                    }
                }
                b2 = false;
            }
            b = (b2 && b);
        }
        return b;
    }
}
