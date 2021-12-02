// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import kotlin.sequences.p;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import n6.l;
import java.util.Iterator;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;

public final class k implements g
{
    @e
    private final List<g> G;
    
    public k(@e final List<? extends g> g) {
        k0.p(g, "delegates");
        this.G = (List<g>)g;
    }
    
    public k(@e final g... array) {
        k0.p(array, "delegates");
        this(m.ey(array));
    }
    
    @Override
    public boolean B4(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(b, "fqName");
        final Iterator iterator = v.n1((Iterable<?>)this.G).iterator();
        while (iterator.hasNext()) {
            if (iterator.next().B4(b)) {
                return true;
            }
        }
        return false;
    }
    
    @f
    @Override
    public c a0(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(b, "fqName");
        return (c)p.y0(p.i1((kotlin.sequences.m)v.n1((Iterable<?>)this.G), (l)new l<g, c>() {
            @f
            public final c a(@e final g g) {
                k0.p(g, "it");
                return g.a0(b);
            }
        }));
    }
    
    @Override
    public boolean isEmpty() {
        final List<g> g = this.G;
        final boolean b = g instanceof Collection;
        final boolean b2 = true;
        boolean b3;
        if (b && g.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator<Object> iterator = g.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (iterator.next().isEmpty());
            b3 = false;
        }
        return b3;
    }
    
    @e
    @Override
    public Iterator<c> iterator() {
        return (Iterator<c>)p.A0((kotlin.sequences.m)v.n1((Iterable<?>)this.G), (l)k$b.G).iterator();
    }
}
