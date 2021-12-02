// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.z;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.storage.j;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.o;
import org.jetbrains.annotations.e;

public final class i0 extends p implements h0
{
    @e
    public static final a n0;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.n j0;
    @e
    private final a1 k0;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.j l0;
    @e
    private d m0;
    
    static {
        n0 = new a(null);
        o0 = new o[] { k1.r(new f1(k1.d(i0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;")) };
    }
    
    private i0(final kotlin.reflect.jvm.internal.impl.storage.n j0, final a1 k0, final d m0, final h0 h0, final g g, final kotlin.reflect.jvm.internal.impl.descriptors.b.a a, final w0 w0) {
        super(k0, h0, g, kotlin.reflect.jvm.internal.impl.name.e.l("<init>"), a, w0);
        this.j0 = j0;
        this.k0 = k0;
        this.W0(this.p1().F0());
        this.l0 = j0.e((n6.a)new n6.a<i0>() {
            final /* synthetic */ i0 G;
            
            @f
            public final i0 a() {
                final kotlin.reflect.jvm.internal.impl.storage.n l0 = this.G.l0();
                final a1 p1 = this.G.p1();
                final d h = m0;
                final i0 g = this.G;
                final g annotations = h.getAnnotations();
                final b.a n = m0.n();
                kotlin.jvm.internal.k0.o(n, "underlyingConstructorDescriptor.kind");
                final w0 k = this.G.p1().k();
                kotlin.jvm.internal.k0.o(k, "typeAliasDescriptor.source");
                final i0 i0 = new i0(l0, p1, h, g, annotations, n, k, null);
                final i0 g2 = this.G;
                final d h2 = m0;
                final d1 a = kotlin.reflect.jvm.internal.impl.descriptors.impl.i0.n0.c(g2.p1());
                if (a == null) {
                    return null;
                }
                final t0 j0 = h2.j0();
                t0 d;
                if (j0 == null) {
                    d = null;
                }
                else {
                    d = j0.d(a);
                }
                i0.S0(null, d, g2.p1().C(), g2.m(), g2.getReturnType(), kotlin.reflect.jvm.internal.impl.descriptors.b0.H, g2.p1().getVisibility());
                return i0;
            }
        });
        this.m0 = m0;
    }
    
    @Override
    public boolean H() {
        return this.t0().H();
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.e I() {
        final kotlin.reflect.jvm.internal.impl.descriptors.e i = this.t0().I();
        kotlin.jvm.internal.k0.o(i, "underlyingConstructorDescriptor.constructedClass");
        return i;
    }
    
    @e
    @Override
    public c0 getReturnType() {
        final c0 returnType = super.getReturnType();
        kotlin.jvm.internal.k0.m(returnType);
        return returnType;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.storage.n l0() {
        return this.j0;
    }
    
    @e
    public h0 l1(@e final m m, @e final b0 b0, @e final u u, @e final kotlin.reflect.jvm.internal.impl.descriptors.b.a a, final boolean b2) {
        kotlin.jvm.internal.k0.p(m, "newOwner");
        kotlin.jvm.internal.k0.p(b0, "modality");
        kotlin.jvm.internal.k0.p(u, "visibility");
        kotlin.jvm.internal.k0.p(a, "kind");
        final y h = (y)this.B().o(m).c(b0).n(u).q(a).j(b2).h();
        Objects.requireNonNull(h, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (h0)h;
    }
    
    @e
    protected i0 m1(@e final m m, @f final y y, @e final kotlin.reflect.jvm.internal.impl.descriptors.b.a a, @f final kotlin.reflect.jvm.internal.impl.name.e e, @e final g g, @e final w0 w0) {
        kotlin.jvm.internal.k0.p(m, "newOwner");
        kotlin.jvm.internal.k0.p(a, "kind");
        kotlin.jvm.internal.k0.p(g, "annotations");
        kotlin.jvm.internal.k0.p(w0, "source");
        final kotlin.reflect.jvm.internal.impl.descriptors.b.a g2 = b.a.G;
        if (a != g2) {
            final kotlin.reflect.jvm.internal.impl.descriptors.b.a j = b.a.J;
        }
        return new i0(this.j0, this.p1(), this.t0(), this, g, g2, w0);
    }
    
    @e
    public a1 n1() {
        return this.p1();
    }
    
    @e
    public h0 o1() {
        return (h0)super.b();
    }
    
    @e
    public a1 p1() {
        return this.k0;
    }
    
    @f
    public h0 q1(@e final d1 d1) {
        kotlin.jvm.internal.k0.p(d1, "substitutor");
        final y d2 = super.d(d1);
        Objects.requireNonNull(d2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        final i0 i0 = (i0)d2;
        final d1 f = d1.f(i0.getReturnType());
        kotlin.jvm.internal.k0.o(f, "create(substitutedTypeAliasConstructor.returnType)");
        final d d3 = this.t0().b().d(f);
        if (d3 == null) {
            return null;
        }
        i0.m0 = d3;
        return i0;
    }
    
    @e
    @Override
    public d t0() {
        return this.m0;
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final d1 c(final a1 a1) {
            if (a1.y() == null) {
                return null;
            }
            return d1.f((c0)a1.Z());
        }
        
        @f
        public final h0 b(@e final kotlin.reflect.jvm.internal.impl.storage.n n, @e final a1 a1, @e final d d) {
            kotlin.jvm.internal.k0.p(n, "storageManager");
            kotlin.jvm.internal.k0.p(a1, "typeAliasDescriptor");
            kotlin.jvm.internal.k0.p(d, "constructor");
            final d1 c = this.c(a1);
            final t0 t0 = null;
            if (c == null) {
                return null;
            }
            final d d2 = d.d(c);
            if (d2 == null) {
                return null;
            }
            final g annotations = d.getAnnotations();
            final kotlin.reflect.jvm.internal.impl.descriptors.b.a n2 = d.n();
            kotlin.jvm.internal.k0.o(n2, "constructor.kind");
            final w0 k = a1.k();
            kotlin.jvm.internal.k0.o(k, "typeAliasDescriptor.source");
            final i0 i0 = new i0(n, a1, d2, null, annotations, n2, k, null);
            final List<kotlin.reflect.jvm.internal.impl.descriptors.e1> p3 = p.P0(i0, d.m(), c);
            if (p3 == null) {
                return null;
            }
            final kotlin.reflect.jvm.internal.impl.types.k0 c2 = z.c((c0)d2.getReturnType().Q0());
            final kotlin.reflect.jvm.internal.impl.types.k0 a2 = a1.A();
            kotlin.jvm.internal.k0.o(a2, "typeAliasDescriptor.defaultType");
            final kotlin.reflect.jvm.internal.impl.types.k0 j = kotlin.reflect.jvm.internal.impl.types.n0.j(c2, a2);
            final t0 j2 = d.j0();
            t0 f;
            if (j2 == null) {
                f = t0;
            }
            else {
                f = kotlin.reflect.jvm.internal.impl.resolve.c.f((kotlin.reflect.jvm.internal.impl.descriptors.a)i0, c.n(j2.a(), kotlin.reflect.jvm.internal.impl.types.k1.K), g.r.b());
            }
            i0.S0(f, null, a1.C(), p3, (c0)j, kotlin.reflect.jvm.internal.impl.descriptors.b0.H, a1.getVisibility());
            return i0;
        }
    }
}
