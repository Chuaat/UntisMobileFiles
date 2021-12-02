// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.utils.i;
import java.util.Iterator;
import kotlin.collections.v;
import java.util.List;
import kotlin.s0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import m6.k;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public final class n extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a
{
    @e
    public static final a d;
    @e
    private final String b;
    @e
    private final h c;
    
    static {
        d = new a(null);
    }
    
    private n(final String b, final h c) {
        this.b = b;
        this.c = c;
    }
    
    @m6.k
    @e
    public static final h k(@e final String s, @e final Collection<? extends c0> collection) {
        return n.d.a(s, collection);
    }
    
    @e
    @Override
    public Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return kotlin.reflect.jvm.internal.impl.resolve.k.a((Collection<? extends v0>)super.a(e, b), (n6.l<? super v0, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a>)n$c.G);
    }
    
    @e
    @Override
    public Collection<q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return kotlin.reflect.jvm.internal.impl.resolve.k.a((Collection<? extends q0>)super.c(e, b), (n6.l<? super q0, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a>)n$d.G);
    }
    
    @e
    @Override
    public Collection<m> e(@e final d d, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        final Collection<m> e = super.e(d, l);
        final ArrayList<Object> list = new ArrayList<Object>();
        final ArrayList<Object> list2 = new ArrayList<Object>();
        for (final Object next : e) {
            if (((m)next) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                list.add(next);
            }
            else {
                list2.add(next);
            }
        }
        final s0 s0 = new s0((Object)list, (Object)list2);
        return (Collection<m>)v.q4((Collection)kotlin.reflect.jvm.internal.impl.resolve.k.a((Collection<?>)s0.a(), (n6.l<? super Object, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a>)n$b.G), (Iterable)s0.b());
    }
    
    @e
    @Override
    protected h j() {
        return this.c;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @m6.k
        @e
        public final h a(@e final String s, @e final Collection<? extends c0> collection) {
            k0.p((Object)s, "message");
            k0.p((Object)collection, "types");
            final ArrayList<h> list = new ArrayList<h>(v.Y((Iterable)collection, 10));
            final Iterator<c0> iterator = collection.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().x());
            }
            final i<h> b = x6.a.b(list);
            final h b2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.d.b(s, b);
            if (b.size() <= 1) {
                return b2;
            }
            return new n(s, b2, null);
        }
    }
}
