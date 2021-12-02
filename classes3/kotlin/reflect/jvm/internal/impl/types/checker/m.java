// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.h0;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.d0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.resolve.constants.p;
import kotlin.reflect.jvm.internal.impl.types.model.b;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.f;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.j;
import org.jetbrains.annotations.e;

public final class m implements l
{
    @e
    private final g c;
    @e
    private final j d;
    
    public m(@e final g c) {
        k0.p((Object)c, "kotlinTypeRefiner");
        this.c = c;
        final j p = j.p(this.c());
        k0.o((Object)p, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.d = p;
    }
    
    @e
    @Override
    public j a() {
        return this.d;
    }
    
    @Override
    public boolean b(@e final c0 c0, @e final c0 c2) {
        k0.p((Object)c0, "a");
        k0.p((Object)c2, "b");
        return this.e(new kotlin.reflect.jvm.internal.impl.types.checker.a(false, false, false, this.c(), 6, null), c0.Q0(), c2.Q0());
    }
    
    @e
    @Override
    public g c() {
        return this.c;
    }
    
    @Override
    public boolean d(@e final c0 c0, @e final c0 c2) {
        k0.p((Object)c0, "subtype");
        k0.p((Object)c2, "supertype");
        return this.f(new kotlin.reflect.jvm.internal.impl.types.checker.a(true, false, false, this.c(), 6, null), c0.Q0(), c2.Q0());
    }
    
    public final boolean e(@e final kotlin.reflect.jvm.internal.impl.types.checker.a a, @e final j1 j1, @e final j1 j2) {
        k0.p((Object)a, "<this>");
        k0.p((Object)j1, "a");
        k0.p((Object)j2, "b");
        return kotlin.reflect.jvm.internal.impl.types.f.a.i(a, j1, j2);
    }
    
    public final boolean f(@e final kotlin.reflect.jvm.internal.impl.types.checker.a a, @e final j1 j1, @e final j1 j2) {
        k0.p((Object)a, "<this>");
        k0.p((Object)j1, "subType");
        k0.p((Object)j2, "superType");
        return kotlin.reflect.jvm.internal.impl.types.f.o(kotlin.reflect.jvm.internal.impl.types.f.a, a, j1, j2, false, 8, null);
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.types.k0 g(@e final kotlin.reflect.jvm.internal.impl.types.k0 k0) {
        k0.p((Object)k0, "type");
        final w0 n0 = k0.N0();
        final boolean b = n0 instanceof c;
        final int n2 = 1;
        boolean b2 = false;
        final c0 c0 = null;
        final b0 b3 = null;
        final j1 j1 = null;
        if (b) {
            final c c2 = (c)n0;
            y0 a = c2.a();
            int n3;
            if (a.c() == k1.L) {
                n3 = n2;
            }
            else {
                n3 = 0;
            }
            if (n3 == 0) {
                a = null;
            }
            j1 q0;
            if (a == null) {
                q0 = j1;
            }
            else {
                final c0 a2 = a.a();
                if (a2 == null) {
                    q0 = j1;
                }
                else {
                    q0 = a2.Q0();
                }
            }
            if (c2.f() == null) {
                final y0 a3 = c2.a();
                final Collection<c0> i = c2.k();
                final ArrayList list = new ArrayList<j1>(v.Y((Iterable)i, 10));
                final Iterator<Object> iterator = i.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().Q0());
                }
                c2.h(new kotlin.reflect.jvm.internal.impl.types.checker.j(a3, list, null, 4, null));
            }
            final b g = kotlin.reflect.jvm.internal.impl.types.model.b.G;
            final kotlin.reflect.jvm.internal.impl.types.checker.j f = c2.f();
            k0.m((Object)f);
            return new kotlin.reflect.jvm.internal.impl.types.checker.i(g, f, q0, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)k0).getAnnotations(), k0.O0(), false, 32, null);
        }
        if (n0 instanceof p) {
            final Collection<c0> l = ((p)n0).k();
            final ArrayList list2 = new ArrayList<c0>(v.Y((Iterable)l, 10));
            final Iterator<Object> iterator2 = l.iterator();
            while (iterator2.hasNext()) {
                final c0 p = f1.p(iterator2.next(), k0.O0());
                k0.o((Object)p, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                list2.add(p);
            }
            final b0 b4 = new b0((Collection<? extends c0>)list2);
            final d0 a4 = d0.a;
            return d0.j(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)k0).getAnnotations(), b4, v.E(), false, k0.x());
        }
        kotlin.reflect.jvm.internal.impl.types.k0 f2 = k0;
        if (n0 instanceof b0) {
            f2 = k0;
            if (k0.O0()) {
                final b0 b5 = (b0)n0;
                final Collection<c0> m = b5.k();
                final ArrayList list3 = new ArrayList<c0>(v.Y((Iterable)m, 10));
                final Iterator<Object> iterator3 = m.iterator();
                while (iterator3.hasNext()) {
                    list3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.k(iterator3.next()));
                    b2 = true;
                }
                b0 j2;
                if (!b2) {
                    j2 = b3;
                }
                else {
                    final c0 g2 = b5.g();
                    c0 k2;
                    if (g2 == null) {
                        k2 = c0;
                    }
                    else {
                        k2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.k(g2);
                    }
                    j2 = new b0((Collection<? extends c0>)list3).j(k2);
                }
                if (j2 == null) {
                    j2 = b5;
                }
                f2 = j2.f();
            }
        }
        return f2;
    }
    
    @e
    public j1 h(@e final j1 j1) {
        k0.p((Object)j1, "type");
        j1 j2;
        if (j1 instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
            j2 = this.g((kotlin.reflect.jvm.internal.impl.types.k0)j1);
        }
        else {
            if (!(j1 instanceof kotlin.reflect.jvm.internal.impl.types.w)) {
                throw new h0();
            }
            final kotlin.reflect.jvm.internal.impl.types.w w = (kotlin.reflect.jvm.internal.impl.types.w)j1;
            final kotlin.reflect.jvm.internal.impl.types.k0 g = this.g(w.V0());
            final kotlin.reflect.jvm.internal.impl.types.k0 g2 = this.g(w.W0());
            if (g == w.V0() && g2 == w.W0()) {
                j2 = j1;
            }
            else {
                final d0 a = d0.a;
                j2 = d0.d(g, g2);
            }
        }
        return h1.b(j2, j1);
    }
}
