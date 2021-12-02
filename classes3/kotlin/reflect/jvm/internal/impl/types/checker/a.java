// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.j1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.model.m;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.model.o;
import kotlin.reflect.jvm.internal.impl.resolve.constants.n;
import kotlin.reflect.jvm.internal.impl.types.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.model.d;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.model.k;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.model.p;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.g;

public class a extends g implements c
{
    @e
    public static final a i;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    @e
    private final kotlin.reflect.jvm.internal.impl.types.checker.g h;
    
    static {
        i = new a(null);
    }
    
    public a(final boolean e, final boolean f, final boolean g, @e final kotlin.reflect.jvm.internal.impl.types.checker.g h) {
        k0.p((Object)h, "kotlinTypeRefiner");
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.model.w A(@e final p p) {
        return a.w(this, p);
    }
    
    @e
    @Override
    public i B(@e final List<? extends i> list) {
        return a.z(this, list);
    }
    
    @Override
    public boolean C(@e final k k) {
        return a.O(this, k);
    }
    
    @Override
    public boolean C0() {
        return this.f;
    }
    
    @e
    @Override
    public i D(@e final i i) {
        return a.V(this, i);
    }
    
    @e
    @Override
    public i D0(@e final i i) {
        k0.p((Object)i, "type");
        if (i instanceof c0) {
            return l.b.a().h(((c0)i).Q0());
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.types.checker.b.a(i).toString());
    }
    
    @e
    @Override
    public i E0(@e final i i) {
        k0.p((Object)i, "type");
        if (i instanceof c0) {
            return this.h.g((c0)i);
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.types.checker.b.a(i).toString());
    }
    
    @f
    @Override
    public i G(@e final kotlin.reflect.jvm.internal.impl.types.model.d d) {
        return a.U(this, d);
    }
    
    public boolean G0(@e final w0 w0, @e final w0 w2) {
        k0.p((Object)w0, "a");
        k0.p((Object)w2, "b");
        boolean b;
        if (w0 instanceof n) {
            b = ((n)w0).i(w2);
        }
        else if (w2 instanceof n) {
            b = ((n)w2).i(w0);
        }
        else {
            b = k0.g((Object)w0, (Object)w2);
        }
        return b;
    }
    
    @Override
    public boolean H(@e final o o) {
        return a.B(this, o);
    }
    
    @e
    public g.b.a H0(@e final k k) {
        k0.p((Object)k, "type");
        return a.i.a(this, k);
    }
    
    @Override
    public boolean I(@e final k k) {
        return a.J(this, k);
    }
    
    @Override
    public boolean J(@e final i i) {
        return a.E(this, i);
    }
    
    @Override
    public boolean K(@e final o o) {
        return a.H(this, o);
    }
    
    @Override
    public boolean L(@e final o o) {
        return a.F(this, o);
    }
    
    @f
    @Override
    public i M(@e final i i) {
        return a.s(this, i);
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.model.n N(@e final i i) {
        return a.i(this, i);
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.types.model.d O(@e final k k) {
        return a.d(this, k);
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.model.n P(@e final i i, final int n) {
        return a.m(this, i, n);
    }
    
    @f
    @Override
    public PrimitiveType R(@e final o o) {
        return a.q(this, o);
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.model.w S(@e final kotlin.reflect.jvm.internal.impl.types.model.n n) {
        return a.v(this, n);
    }
    
    @Override
    public boolean T(@e final o o) {
        return a.A(this, o);
    }
    
    @Override
    public boolean U(@e final i i, @e final kotlin.reflect.jvm.internal.impl.name.b b) {
        return a.x(this, i, b);
    }
    
    @Override
    public boolean V(@e final k k) {
        return a.Q(this, k);
    }
    
    @Override
    public boolean X(@e final i i) {
        return a.L(this, i);
    }
    
    @Override
    public boolean Y(@e final o o) {
        return a.G(this, o);
    }
    
    @f
    @Override
    public k Z(@e final k k, @e final kotlin.reflect.jvm.internal.impl.types.model.b b) {
        return a.j(this, k, b);
    }
    
    @f
    @Override
    public k a(@e final i i) {
        return a.h(this, i);
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.types.model.e a0(@e final k k) {
        return a.e(this, k);
    }
    
    @e
    @Override
    public o b(@e final k k) {
        return a.e0(this, k);
    }
    
    @Override
    public boolean b0(@e final k k, @e final k i) {
        return a.y(this, k, i);
    }
    
    @e
    @Override
    public k c(@e final k k, final boolean b) {
        return a.i0(this, k, b);
    }
    
    @Override
    public boolean c0(@e final o o) {
        return a.C(this, o);
    }
    
    @e
    @Override
    public k d(@e final kotlin.reflect.jvm.internal.impl.types.model.g g) {
        return a.f0(this, g);
    }
    
    @e
    @Override
    public i d0(@e final kotlin.reflect.jvm.internal.impl.types.model.n n) {
        return a.t(this, n);
    }
    
    @e
    @Override
    public k e(@e final kotlin.reflect.jvm.internal.impl.types.model.g g) {
        return a.S(this, g);
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.types.model.f e0(@e final kotlin.reflect.jvm.internal.impl.types.model.g g) {
        return a.f(this, g);
    }
    
    @Override
    public int f(@e final o o) {
        return a.Z(this, o);
    }
    
    @Override
    public boolean f0(@e final o o, @e final o o2) {
        k0.p((Object)o, "c1");
        k0.p((Object)o2, "c2");
        if (!(o instanceof w0)) {
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.types.checker.b.a(o).toString());
        }
        if (o2 instanceof w0) {
            return this.G0((w0)o, (w0)o2);
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.types.checker.b.a(o2).toString());
    }
    
    @Override
    public boolean g(@e final o o) {
        return a.R(this, o);
    }
    
    @e
    @Override
    public i g0(@e final i i) {
        return a.W(this, i);
    }
    
    @Override
    public int h(@e final i i) {
        return a.b(this, i);
    }
    
    @Override
    public boolean h0(@e final k k) {
        return a.M(this, k);
    }
    
    @Override
    public boolean i(@e final kotlin.reflect.jvm.internal.impl.types.model.d d) {
        return a.N(this, d);
    }
    
    @f
    @Override
    public PrimitiveType j(@e final o o) {
        return a.p(this, o);
    }
    
    @e
    @Override
    public i k(@e final p p) {
        return a.r(this, p);
    }
    
    @Override
    public boolean l(@e final o o) {
        return a.K(this, o);
    }
    
    @e
    @Override
    public m m(@e final k k) {
        return a.c(this, k);
    }
    
    @e
    @Override
    public Collection<i> n(@e final o o) {
        return a.c0(this, o);
    }
    
    @e
    @Override
    public Collection<i> p(@e final k k) {
        return a.a0(this, k);
    }
    
    @Override
    public boolean r(@e final o o) {
        return a.D(this, o);
    }
    
    @e
    @Override
    public p s(@e final o o, final int n) {
        return a.o(this, o, n);
    }
    
    @e
    @Override
    public i t(@e final k k, @e final k i) {
        return a.k(this, k, i);
    }
    
    @f
    @Override
    public p u(@e final o o) {
        return a.u(this, o);
    }
    
    @e
    @Override
    public i v(@e final i i, final boolean b) {
        return a.h0(this, i, b);
    }
    
    @Override
    public boolean v0(@e final i i) {
        k0.p((Object)i, "<this>");
        return i instanceof j1 && this.g && ((j1)i).N0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.n;
    }
    
    @e
    @Override
    public k w(@e final kotlin.reflect.jvm.internal.impl.types.model.e e) {
        return a.Y(this, e);
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.c x(@e final o o) {
        return a.n(this, o);
    }
    
    @Override
    public boolean y(@e final kotlin.reflect.jvm.internal.impl.types.model.n n) {
        return a.P(this, n);
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.types.model.g z(@e final i i) {
        return a.g(this, i);
    }
    
    @Override
    public boolean z0() {
        return this.e;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final g.b.a a(@e final c c, @e final k k) {
            k0.p((Object)c, "<this>");
            k0.p((Object)k, "type");
            if (k instanceof kotlin.reflect.jvm.internal.impl.types.k0) {
                return new g.b.a() {
                    final /* synthetic */ d1 b = x0.c.a((c0)k).c();
                    
                    @e
                    @Override
                    public k a(@e final g g, @e final i i) {
                        k0.p((Object)g, "context");
                        k0.p((Object)i, "type");
                        final c a = c;
                        final c0 n = this.b.n((c0)a.Q(i), k1.K);
                        k0.o((Object)n, "substitutor.safeSubstitute(\n                        type.lowerBoundIfFlexible() as KotlinType,\n                        Variance.INVARIANT\n                    )");
                        final k a2 = a.a(n);
                        k0.m((Object)a2);
                        return a2;
                    }
                };
            }
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.types.checker.b.a(k).toString());
        }
    }
}
