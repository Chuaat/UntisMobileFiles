// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.types.b1;
import kotlin.d0;
import n6.l;
import kotlin.jvm.internal.m0;
import java.util.Collection;
import n6.a;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import org.jetbrains.annotations.f;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.d1;
import org.jetbrains.annotations.e;

public final class m implements h
{
    @e
    private final h b;
    @e
    private final d1 c;
    @f
    private Map<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> d;
    @e
    private final b0 e;
    
    public m(@e final h b, @e final d1 d1) {
        k0.p((Object)b, "workerScope");
        k0.p((Object)d1, "givenSubstitutor");
        this.b = b;
        final b1 j = d1.j();
        k0.o((Object)j, "givenSubstitutor.substitution");
        this.c = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.f(j, false, 1, null).c();
        this.e = d0.c((n6.a)new n6.a<Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>>() {
            final /* synthetic */ m G;
            
            @e
            public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> a() {
                final m g = this.G;
                return g.l((Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.m>)k.a.a(m.i(g), null, null, 3, null));
            }
        });
    }
    
    public static final /* synthetic */ h i(final m m) {
        return m.b;
    }
    
    private final Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> k() {
        return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.m>)this.e.getValue();
    }
    
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> Collection<D> l(final Collection<? extends D> collection) {
        if (this.c.k()) {
            return (Collection<D>)collection;
        }
        if (collection.isEmpty()) {
            return (Collection<D>)collection;
        }
        final LinkedHashSet<D> g = kotlin.reflect.jvm.internal.impl.utils.a.g(collection.size());
        final Iterator<D> iterator = collection.iterator();
        while (iterator.hasNext()) {
            g.add(this.m(iterator.next()));
        }
        return g;
    }
    
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> D m(final D obj) {
        if (this.c.k()) {
            return obj;
        }
        if (this.d == null) {
            this.d = new HashMap<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m>();
        }
        final Map<kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.m> d = this.d;
        k0.m((Object)d);
        Object o;
        if ((o = d.get(obj)) == null) {
            if (!(obj instanceof y0)) {
                throw new IllegalStateException(k0.C("Unknown descriptor in scope: ", (Object)obj).toString());
            }
            o = ((y0)obj).d(this.c);
            if (o == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                sb.append(obj);
                sb.append(" substitution fails");
                throw new AssertionError((Object)sb.toString());
            }
            d.put(obj, (D)o);
        }
        return (D)o;
    }
    
    @e
    @Override
    public Collection<? extends v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return this.l(this.b.a(e, b));
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
        return this.b.b();
    }
    
    @e
    @Override
    public Collection<? extends q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return this.l(this.b.c(e, b));
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
        return this.b.d();
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> e(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.d d, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        return this.k();
    }
    
    @f
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
        return this.b.f();
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        final kotlin.reflect.jvm.internal.impl.descriptors.h g = this.b.g(e, b);
        kotlin.reflect.jvm.internal.impl.descriptors.h h;
        if (g == null) {
            h = null;
        }
        else {
            h = this.m(g);
        }
        return h;
    }
    
    @Override
    public void h(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        h.b.a(this, e, b);
    }
}
