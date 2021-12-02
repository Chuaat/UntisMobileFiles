// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;
import v6.a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;

public final class d implements c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, g<?>>
{
    @e
    private final v6.a a;
    @e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.e b;
    
    public d(@e final e0 e0, @e final g0 g0, @e final v6.a a) {
        k0.p((Object)e0, "module");
        k0.p((Object)g0, "notFoundClasses");
        k0.p((Object)a, "protocol");
        this.a = a;
        this.b = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(e0, g0);
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.s s, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c) {
        k0.p((Object)s, "proto");
        k0.p((Object)c, "nameResolver");
        List<kotlin.reflect.jvm.internal.impl.metadata.a.b> e = ((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.s>)s).v(this.a.l());
        if (e == null) {
            e = (List<kotlin.reflect.jvm.internal.impl.metadata.a.b>)v.E();
        }
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>(v.Y((Iterable)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a(iterator.next(), c));
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)list;
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b(@e final x x, @e final q q, @e final b b, final int n, @e final kotlin.reflect.jvm.internal.impl.metadata.a.u u) {
        k0.p((Object)x, "container");
        k0.p((Object)q, "callableProto");
        k0.p((Object)b, "kind");
        k0.p((Object)u, "proto");
        List<kotlin.reflect.jvm.internal.impl.metadata.a.b> e = ((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.u>)u).v(this.a.g());
        if (e == null) {
            e = (List<kotlin.reflect.jvm.internal.impl.metadata.a.b>)v.E();
        }
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>(v.Y((Iterable)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a(iterator.next(), x.b()));
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)list;
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> c(@e final x.a a) {
        k0.p((Object)a, "container");
        List<kotlin.reflect.jvm.internal.impl.metadata.a.b> e = ((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.c>)a.f()).v(this.a.a());
        if (e == null) {
            e = (List<kotlin.reflect.jvm.internal.impl.metadata.a.b>)v.E();
        }
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>(v.Y((Iterable)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a(iterator.next(), a.b()));
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)list;
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> d(@e final kotlin.reflect.jvm.internal.impl.metadata.a.q q, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c) {
        k0.p((Object)q, "proto");
        k0.p((Object)c, "nameResolver");
        List<kotlin.reflect.jvm.internal.impl.metadata.a.b> e = ((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.q>)q).v(this.a.k());
        if (e == null) {
            e = (List<kotlin.reflect.jvm.internal.impl.metadata.a.b>)v.E();
        }
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>(v.Y((Iterable)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a(iterator.next(), c));
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)list;
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f(@e final x x, @e final kotlin.reflect.jvm.internal.impl.metadata.a.g g) {
        k0.p((Object)x, "container");
        k0.p((Object)g, "proto");
        List<kotlin.reflect.jvm.internal.impl.metadata.a.b> e = ((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.g>)g).v(this.a.d());
        if (e == null) {
            e = (List<kotlin.reflect.jvm.internal.impl.metadata.a.b>)v.E();
        }
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>(v.Y((Iterable)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a(iterator.next(), x.b()));
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)list;
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> g(@e final x x, @e final kotlin.reflect.jvm.internal.impl.metadata.a.n n) {
        k0.p((Object)x, "container");
        k0.p((Object)n, "proto");
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.E();
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> h(@e final x x, @e final q q, @e final b b) {
        k0.p((Object)x, "container");
        k0.p((Object)q, "proto");
        k0.p((Object)b, "kind");
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.E();
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> i(@e final x x, @e final kotlin.reflect.jvm.internal.impl.metadata.a.n n) {
        k0.p((Object)x, "container");
        k0.p((Object)n, "proto");
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)v.E();
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> j(@e final x x, @e final q q, @e final b b) {
        k0.p((Object)x, "container");
        k0.p((Object)q, "proto");
        k0.p((Object)b, "kind");
        i i;
        Object o;
        if (q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.d) {
            i = (kotlin.reflect.jvm.internal.impl.metadata.a.d)q;
            o = this.a.c();
        }
        else if (q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.i) {
            i = (kotlin.reflect.jvm.internal.impl.metadata.a.i)q;
            o = this.a.f();
        }
        else {
            if (!(q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.n)) {
                throw new IllegalStateException(k0.C("Unknown message: ", (Object)q).toString());
            }
            final int n = d.a.a[b.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                    }
                    i = (kotlin.reflect.jvm.internal.impl.metadata.a.n)q;
                    o = this.a.j();
                }
                else {
                    i = (kotlin.reflect.jvm.internal.impl.metadata.a.n)q;
                    o = this.a.i();
                }
            }
            else {
                i = (kotlin.reflect.jvm.internal.impl.metadata.a.n)q;
                o = this.a.h();
            }
        }
        List<kotlin.reflect.jvm.internal.impl.metadata.a.b> e = ((i.d<i.d>)i).v((i.g<i.d, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>>)o);
        if (e == null) {
            e = (List<kotlin.reflect.jvm.internal.impl.metadata.a.b>)v.E();
        }
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>(v.Y((Iterable)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(this.b.a(iterator.next(), x.b()));
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>)list;
    }
    
    @f
    public g<?> k(@e final x x, @e final kotlin.reflect.jvm.internal.impl.metadata.a.n n, @e final c0 c0) {
        k0.p((Object)x, "container");
        k0.p((Object)n, "proto");
        k0.p((Object)c0, "expectedType");
        final kotlin.reflect.jvm.internal.impl.metadata.a.b.b.c c2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(n, this.a.b());
        if (c2 == null) {
            return null;
        }
        return this.b.f(c0, c2, x.b());
    }
}
