// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.i;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.collections.v;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public final class s0
{
    @e
    public static final a c;
    @e
    private static final s0 d;
    @e
    private final u0 a;
    private final boolean b;
    
    static {
        c = new a(null);
        d = new s0(u0.a.a, false);
    }
    
    public s0(@e final u0 a, final boolean b) {
        k0.p((Object)a, "reportStrategy");
        this.a = a;
        this.b = b;
    }
    
    private final void a(final g g, final g g2) {
        final HashSet<b> set = new HashSet<b>();
        final Iterator<c> iterator = ((Iterable<c>)g).iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().f());
        }
        for (final c c : g2) {
            if (set.contains(c.f())) {
                this.a.b(c);
            }
        }
    }
    
    private final void b(final c0 c0, final c0 c2) {
        final d1 f = d1.f(c2);
        k0.o((Object)f, "create(substitutedType)");
        final Iterator<y0> iterator = (Iterator<y0>)c2.M0().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final y0 next = iterator.next();
            if (n < 0) {
                v.W();
            }
            final y0 y0 = next;
            if (!y0.d()) {
                final c0 a = y0.a();
                k0.o((Object)a, "substitutedArgument.type");
                if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.c(a)) {
                    final y0 y2 = c0.M0().get(n);
                    final b1 b1 = c0.N0().getParameters().get(n);
                    if (this.b) {
                        final a c3 = s0.c;
                        final u0 a2 = this.a;
                        final c0 a3 = y2.a();
                        k0.o((Object)a3, "unsubstitutedArgument.type");
                        final c0 a4 = y0.a();
                        k0.o((Object)a4, "substitutedArgument.type");
                        k0.o((Object)b1, "typeParameter");
                        c3.c(a2, a3, a4, b1, f);
                    }
                }
            }
            ++n;
        }
    }
    
    private final r c(final r r, final g g) {
        return r.a1(this.h(r, g));
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 d(kotlin.reflect.jvm.internal.impl.types.k0 f, final g g) {
        if (!e0.a(f)) {
            f = c1.f(f, null, this.h(f, g), 1, null);
        }
        return f;
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 e(kotlin.reflect.jvm.internal.impl.types.k0 r, final c0 c0) {
        r = f1.r(r, c0.O0());
        k0.o((Object)r, "makeNullableIfNeeded(this, fromType.isMarkedNullable)");
        return r;
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 f(final kotlin.reflect.jvm.internal.impl.types.k0 k0, final c0 c0) {
        return this.d(this.e(k0, c0), ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations());
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 g(final t0 t0, final g g, final boolean b) {
        final d0 a = d0.a;
        final w0 l = ((kotlin.reflect.jvm.internal.impl.descriptors.h)t0.b()).l();
        k0.o((Object)l, "descriptor.typeConstructor");
        return d0.j(g, l, t0.a(), b, h.c.b);
    }
    
    private final g h(final c0 c0, final g g) {
        final boolean a = e0.a(c0);
        final g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)c0).getAnnotations();
        if (a) {
            return annotations;
        }
        return i.a(g, annotations);
    }
    
    private final y0 j(final y0 y0, final t0 t0, final int n) {
        final j1 q0 = y0.a().Q0();
        if (s.a(q0)) {
            return y0;
        }
        final kotlin.reflect.jvm.internal.impl.types.k0 a = c1.a(q0);
        y0 y2 = y0;
        if (!e0.a(a)) {
            if (!kotlin.reflect.jvm.internal.impl.types.typeUtil.a.n(a)) {
                y2 = y0;
            }
            else {
                final w0 n2 = a.N0();
                final kotlin.reflect.jvm.internal.impl.descriptors.h c = n2.c();
                n2.getParameters().size();
                a.M0().size();
                if (c instanceof b1) {
                    y2 = y0;
                }
                else if (c instanceof a1) {
                    final a1 a2 = (a1)c;
                    if (t0.d(a2)) {
                        this.a.d(a2);
                        return new kotlin.reflect.jvm.internal.impl.types.a1(k1.K, u.j(k0.C("Recursive type alias: ", (Object)((f0)a2).getName())));
                    }
                    final List<y0> m0 = a.M0();
                    final ArrayList list = new ArrayList<y0>(v.Y((Iterable)m0, 10));
                    int n3 = 0;
                    for (final y0 next : m0) {
                        if (n3 < 0) {
                            v.W();
                        }
                        list.add((y0)this.l(next, t0, n2.getParameters().get(n3), n + 1));
                        ++n3;
                    }
                    final kotlin.reflect.jvm.internal.impl.types.k0 k = this.k(t0.e.a(t0, a2, (List<? extends y0>)list), ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)a).getAnnotations(), a.O0(), n + 1, false);
                    final kotlin.reflect.jvm.internal.impl.types.k0 i = this.m(a, t0, n);
                    kotlin.reflect.jvm.internal.impl.types.k0 j;
                    if (s.a(k)) {
                        j = k;
                    }
                    else {
                        j = n0.j(k, i);
                    }
                    y2 = new kotlin.reflect.jvm.internal.impl.types.a1(y0.c(), j);
                }
                else {
                    final kotlin.reflect.jvm.internal.impl.types.k0 l = this.m(a, t0, n);
                    this.b(a, l);
                    y2 = new kotlin.reflect.jvm.internal.impl.types.a1(y0.c(), l);
                }
            }
        }
        return y2;
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 k(final t0 t0, final g g, final boolean b, final int n, final boolean b2) {
        final y0 l = this.l(new kotlin.reflect.jvm.internal.impl.types.a1(k1.K, t0.b().k0()), t0, null, n);
        final c0 a = l.a();
        k0.o((Object)a, "expandedProjection.type");
        final kotlin.reflect.jvm.internal.impl.types.k0 a2 = c1.a(a);
        if (e0.a(a2)) {
            return a2;
        }
        l.c();
        this.a(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)a2).getAnnotations(), g);
        final kotlin.reflect.jvm.internal.impl.types.k0 r = f1.r(this.d(a2, g), b);
        k0.o((Object)r, "expandedType.combineAnnotations(annotations).let { TypeUtils.makeNullableIfNeeded(it, isNullable) }");
        kotlin.reflect.jvm.internal.impl.types.k0 j = r;
        if (b2) {
            j = n0.j(r, this.g(t0, g, b));
        }
        return j;
    }
    
    private final y0 l(y0 s, final t0 t0, final b1 b1, final int n) {
        s0.c.b(n, t0.b());
        if (!s.d()) {
            final c0 a = s.a();
            k0.o((Object)a, "underlyingProjection.type");
            final y0 c = t0.c(a.N0());
            if (c == null) {
                return this.j(s, t0, n);
            }
            if (!c.d()) {
                final j1 q0 = c.a().Q0();
                final k1 c2 = c.c();
                k0.o((Object)c2, "argument.projectionKind");
                k1 c3 = s.c();
                k0.o((Object)c3, "underlyingProjection.projectionKind");
                if (c3 == c2) {
                    c3 = c2;
                }
                else {
                    final k1 k = k1.K;
                    if (c3 == k) {
                        c3 = c2;
                    }
                    else if (c2 != k) {
                        this.a.c(t0.b(), b1, q0);
                        c3 = c2;
                    }
                }
                k1 v;
                if (b1 == null) {
                    v = null;
                }
                else {
                    v = b1.v();
                }
                k1 i = v;
                if (v == null) {
                    i = k1.K;
                }
                k0.o((Object)i, "typeParameterDescriptor?.variance ?: Variance.INVARIANT");
                if (i != c3) {
                    final k1 j = k1.K;
                    if (i != j) {
                        if (c3 == j) {
                            c3 = j;
                        }
                        else {
                            this.a.c(t0.b(), b1, q0);
                        }
                    }
                }
                this.a(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)a).getAnnotations(), ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)q0).getAnnotations());
                j1 j2;
                if (q0 instanceof r) {
                    j2 = this.c((r)q0, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)a).getAnnotations());
                }
                else {
                    j2 = this.f(c1.a(q0), a);
                }
                return new kotlin.reflect.jvm.internal.impl.types.a1(c3, j2);
            }
        }
        k0.m((Object)b1);
        s = f1.s(b1);
        k0.o((Object)s, "makeStarProjection(typeParameterDescriptor!!)");
        return s;
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 m(final kotlin.reflect.jvm.internal.impl.types.k0 k0, final t0 t0, final int n) {
        final w0 n2 = k0.N0();
        final List<y0> m0 = k0.M0();
        final ArrayList list = new ArrayList<y0>(v.Y((Iterable)m0, 10));
        final Iterator<Object> iterator = m0.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            final y0 next = iterator.next();
            if (n3 < 0) {
                v.W();
            }
            final y0 y0 = next;
            y0 l = this.l(y0, t0, n2.getParameters().get(n3), n + 1);
            if (!l.d()) {
                l = new kotlin.reflect.jvm.internal.impl.types.a1(l.c(), f1.q(l.a(), y0.a().O0()));
            }
            list.add(l);
            ++n3;
        }
        return c1.f(k0, list, null, 2, null);
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.types.k0 i(@e final t0 t0, @e final g g) {
        k0.p((Object)t0, "typeAliasExpansion");
        k0.p((Object)g, "annotations");
        return this.k(t0, g, false, 0, true);
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final void b(final int n, final a1 a1) {
            if (n <= 100) {
                return;
            }
            throw new AssertionError((Object)k0.C("Too deep recursion while expanding type alias ", (Object)((f0)a1).getName()));
        }
        
        public final void c(@e final u0 u0, @e final c0 c0, @e final c0 c2, @e final b1 b1, @e final d1 d1) {
            k0.p((Object)u0, "reportStrategy");
            k0.p((Object)c0, "unsubstitutedArgument");
            k0.p((Object)c2, "typeArgument");
            k0.p((Object)b1, "typeParameterDescriptor");
            k0.p((Object)d1, "substitutor");
            final Iterator<c0> iterator = b1.getUpperBounds().iterator();
            while (iterator.hasNext()) {
                final c0 n = d1.n(iterator.next(), k1.K);
                k0.o((Object)n, "substitutor.safeSubstitute(bound, Variance.INVARIANT)");
                if (!f.a.d(c2, n)) {
                    u0.a(n, c0, c2, b1);
                }
            }
        }
    }
}
