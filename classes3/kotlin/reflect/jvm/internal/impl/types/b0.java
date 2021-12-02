// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.n;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import n6.l;
import kotlin.collections.v;
import kotlin.comparisons.a;
import java.util.Comparator;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import org.jetbrains.annotations.e;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.model.h;

public final class b0 implements w0, h
{
    @f
    private c0 a;
    @e
    private final LinkedHashSet<c0> b;
    private final int c;
    
    public b0(@e final Collection<? extends c0> c) {
        k0.p((Object)c, "typesToIntersect");
        c.isEmpty();
        final LinkedHashSet<c0> b = new LinkedHashSet<c0>(c);
        this.b = b;
        this.c = b.hashCode();
    }
    
    private b0(final Collection<? extends c0> collection, final c0 a) {
        this(collection);
        this.a = a;
    }
    
    private final String h(final Iterable<? extends c0> iterable) {
        return v.Z2((Iterable)v.h5((Iterable)iterable, (Comparator)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                return kotlin.comparisons.a.g((Comparable)((c0)t).toString(), (Comparable)((c0)t2).toString());
            }
        }), (CharSequence)" & ", (CharSequence)"{", (CharSequence)"}", 0, (CharSequence)null, (l)null, 56, (Object)null);
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
        return null;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h e() {
        return n.d.a("member scope for intersection type", this.b);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof b0 && k0.g((Object)this.b, (Object)((b0)o).b));
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.types.k0 f() {
        final d0 a = d0.a;
        return d0.k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), this, v.E(), false, this.e(), (l<? super g, ? extends kotlin.reflect.jvm.internal.impl.types.k0>)new l<g, kotlin.reflect.jvm.internal.impl.types.k0>() {
            final /* synthetic */ b0 G;
            
            @f
            public final kotlin.reflect.jvm.internal.impl.types.k0 a(@e final g g) {
                k0.p((Object)g, "kotlinTypeRefiner");
                return this.G.i(g).f();
            }
        });
    }
    
    @f
    public final c0 g() {
        return this.a;
    }
    
    @e
    @Override
    public List<b1> getParameters() {
        return (List<b1>)v.E();
    }
    
    @Override
    public int hashCode() {
        return this.c;
    }
    
    @e
    public b0 i(@e final g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        final Collection<c0> k = this.k();
        final ArrayList list = new ArrayList<c0>(v.Y((Iterable)k, 10));
        final Iterator<Object> iterator = k.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            list.add(iterator.next().P0(g));
            b = true;
        }
        final b0 b2 = null;
        final c0 c0 = null;
        b0 j;
        if (!b) {
            j = b2;
        }
        else {
            final c0 g2 = this.g();
            c0 p;
            if (g2 == null) {
                p = c0;
            }
            else {
                p = g2.P0(g);
            }
            j = new b0((Collection<? extends c0>)list).j(p);
        }
        b0 b3 = j;
        if (j == null) {
            b3 = this;
        }
        return b3;
    }
    
    @e
    public final b0 j(@f final c0 c0) {
        return new b0(this.b, c0);
    }
    
    @e
    @Override
    public Collection<c0> k() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        return this.h(this.b);
    }
    
    @e
    @Override
    public KotlinBuiltIns w() {
        final KotlinBuiltIns w = this.b.iterator().next().N0().w();
        k0.o((Object)w, "intersectedTypes.iterator().next().constructor.builtIns");
        return w;
    }
}
