// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.t;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.a;

public final class f
{
    @org.jetbrains.annotations.f
    public static final a.q a(@e a.q q, @e final g g) {
        k0.p((Object)q, "<this>");
        k0.p((Object)g, "typeTable");
        if (q.l0()) {
            q = q.T();
        }
        else if (q.m0()) {
            q = g.a(q.U());
        }
        else {
            q = null;
        }
        return q;
    }
    
    @e
    public static final a.q b(@e final a.r r, @e final g g) {
        k0.p((Object)r, "<this>");
        k0.p((Object)g, "typeTable");
        a.q q;
        if (r.f0()) {
            q = r.V();
            k0.o((Object)q, "expandedType");
        }
        else {
            if (!r.g0()) {
                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
            }
            q = g.a(r.W());
        }
        return q;
    }
    
    @org.jetbrains.annotations.f
    public static final a.q c(@e a.q q, @e final g g) {
        k0.p((Object)q, "<this>");
        k0.p((Object)g, "typeTable");
        if (q.q0()) {
            q = q.d0();
        }
        else if (q.r0()) {
            q = g.a(q.e0());
        }
        else {
            q = null;
        }
        return q;
    }
    
    public static final boolean d(@e final a.i i) {
        k0.p((Object)i, "<this>");
        return i.p0() || i.q0();
    }
    
    public static final boolean e(@e final a.n n) {
        k0.p((Object)n, "<this>");
        return n.m0() || n.n0();
    }
    
    @org.jetbrains.annotations.f
    public static final a.q f(@e a.q q, @e final g g) {
        k0.p((Object)q, "<this>");
        k0.p((Object)g, "typeTable");
        if (q.t0()) {
            q = q.g0();
        }
        else if (q.u0()) {
            q = g.a(q.h0());
        }
        else {
            q = null;
        }
        return q;
    }
    
    @org.jetbrains.annotations.f
    public static final a.q g(@e final a.i i, @e final g g) {
        k0.p((Object)i, "<this>");
        k0.p((Object)g, "typeTable");
        a.q q;
        if (i.p0()) {
            q = i.Z();
        }
        else if (i.q0()) {
            q = g.a(i.a0());
        }
        else {
            q = null;
        }
        return q;
    }
    
    @org.jetbrains.annotations.f
    public static final a.q h(@e final a.n n, @e final g g) {
        k0.p((Object)n, "<this>");
        k0.p((Object)g, "typeTable");
        a.q q;
        if (n.m0()) {
            q = n.Y();
        }
        else if (n.n0()) {
            q = g.a(n.Z());
        }
        else {
            q = null;
        }
        return q;
    }
    
    @e
    public static final a.q i(@e final a.i i, @e final g g) {
        k0.p((Object)i, "<this>");
        k0.p((Object)g, "typeTable");
        a.q q;
        if (i.r0()) {
            q = i.b0();
            k0.o((Object)q, "returnType");
        }
        else {
            if (!i.s0()) {
                throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
            }
            q = g.a(i.c0());
        }
        return q;
    }
    
    @e
    public static final a.q j(@e final a.n n, @e final g g) {
        k0.p((Object)n, "<this>");
        k0.p((Object)g, "typeTable");
        a.q q;
        if (n.o0()) {
            q = n.a0();
            k0.o((Object)q, "returnType");
        }
        else {
            if (!n.p0()) {
                throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
            }
            q = g.a(n.b0());
        }
        return q;
    }
    
    @e
    public static final List<a.q> k(@e final a.c c, @e final g g) {
        k0.p((Object)c, "<this>");
        k0.p((Object)g, "typeTable");
        List<a.q> b0 = c.B0();
        if (!(b0.isEmpty() ^ true)) {
            b0 = null;
        }
        List<a.q> list = b0;
        if (b0 == null) {
            final List<Integer> a0 = c.A0();
            k0.o((Object)a0, "supertypeIdList");
            final ArrayList list2 = new ArrayList<a.q>(v.Y((Iterable)a0, 10));
            final Iterator<Object> iterator = a0.iterator();
            while (true) {
                list = (List<a.q>)list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final Integer n = iterator.next();
                k0.o((Object)n, "it");
                list2.add(g.a(n));
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    public static final a.q l(@e final a.q.b b, @e final g g) {
        k0.p((Object)b, "<this>");
        k0.p((Object)g, "typeTable");
        t t;
        if (b.E()) {
            t = b.B();
        }
        else if (b.F()) {
            t = g.a(b.C());
        }
        else {
            t = null;
        }
        return (a.q)t;
    }
    
    @e
    public static final a.q m(@e final a.u u, @e final g g) {
        k0.p((Object)u, "<this>");
        k0.p((Object)g, "typeTable");
        a.q q;
        if (u.U()) {
            q = u.O();
            k0.o((Object)q, "type");
        }
        else {
            if (!u.V()) {
                throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
            }
            q = g.a(u.P());
        }
        return q;
    }
    
    @e
    public static final a.q n(@e final a.r r, @e final g g) {
        k0.p((Object)r, "<this>");
        k0.p((Object)g, "typeTable");
        a.q q;
        if (r.j0()) {
            q = r.c0();
            k0.o((Object)q, "underlyingType");
        }
        else {
            if (!r.k0()) {
                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
            }
            q = g.a(r.d0());
        }
        return q;
    }
    
    @e
    public static final List<a.q> o(@e final a.s s, @e final g g) {
        k0.p((Object)s, "<this>");
        k0.p((Object)g, "typeTable");
        List<a.q> u = s.U();
        if (!(u.isEmpty() ^ true)) {
            u = null;
        }
        List<a.q> list = u;
        if (u == null) {
            final List<Integer> t = s.T();
            k0.o((Object)t, "upperBoundIdList");
            final ArrayList list2 = new ArrayList<a.q>(v.Y((Iterable)t, 10));
            final Iterator<Object> iterator = t.iterator();
            while (true) {
                list = (List<a.q>)list2;
                if (!iterator.hasNext()) {
                    break;
                }
                final Integer n = iterator.next();
                k0.o((Object)n, "it");
                list2.add(g.a(n));
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    public static final a.q p(@e final a.u u, @e final g g) {
        k0.p((Object)u, "<this>");
        k0.p((Object)g, "typeTable");
        a.q q;
        if (u.W()) {
            q = u.Q();
        }
        else if (u.X()) {
            q = g.a(u.R());
        }
        else {
            q = null;
        }
        return q;
    }
}
