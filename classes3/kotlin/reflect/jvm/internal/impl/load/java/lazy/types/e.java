// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.types.z;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.n1;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.jvm.internal.m0;
import n6.l;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.load.java.components.k;
import kotlin.reflect.jvm.internal.impl.types.b1;

public final class e extends b1
{
    @org.jetbrains.annotations.e
    public static final e c;
    @org.jetbrains.annotations.e
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a d;
    @org.jetbrains.annotations.e
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a e;
    
    static {
        c = new e();
        final k h = k.H;
        d = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(h, false, null, 3, null).g(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.I);
        e = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(h, false, null, 3, null).g(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.H);
    }
    
    private e() {
    }
    
    public static /* synthetic */ y0 j(final e e, final kotlin.reflect.jvm.internal.impl.descriptors.b1 b1, final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a a, c0 c, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            c = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.c(b1, null, null, 3, null);
        }
        return e.i(b1, a, c);
    }
    
    private final s0<k0, Boolean> k(k0 k0, final kotlin.reflect.jvm.internal.impl.descriptors.e e, final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a a) {
        if (!k0.N0().getParameters().isEmpty()) {
            if (KotlinBuiltIns.isArray((c0)k0)) {
                final y0 y0 = k0.M0().get(0);
                final k1 c = y0.c();
                final c0 a2 = y0.a();
                kotlin.jvm.internal.k0.o((Object)a2, "componentTypeProjection.type");
                final List i = v.k((Object)new a1(c, this.l(a2)));
                final d0 a3 = d0.a;
                k0 = d0.i(((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)k0).getAnnotations(), k0.N0(), i, k0.O0(), null, 16, null);
            }
            else {
                if (!e0.a(k0)) {
                    final kotlin.reflect.jvm.internal.impl.resolve.scopes.h e2 = e.e0((b1)this);
                    kotlin.jvm.internal.k0.o((Object)e2, "declaration.getMemberScope(RawSubstitution)");
                    final d0 a4 = d0.a;
                    final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)k0).getAnnotations();
                    final w0 l = ((h)e).l();
                    kotlin.jvm.internal.k0.o((Object)l, "declaration.typeConstructor");
                    final List<kotlin.reflect.jvm.internal.impl.descriptors.b1> parameters = ((h)e).l().getParameters();
                    kotlin.jvm.internal.k0.o((Object)parameters, "declaration.typeConstructor.parameters");
                    final ArrayList list = new ArrayList<y0>(v.Y((Iterable)parameters, 10));
                    for (final kotlin.reflect.jvm.internal.impl.descriptors.b1 b1 : parameters) {
                        kotlin.jvm.internal.k0.o((Object)b1, "parameter");
                        list.add(j(this, b1, a, null, 4, null));
                    }
                    k0 = d0.k(annotations, l, (List<? extends y0>)list, k0.O0(), e2, (l<? super g, ? extends k0>)new l<g, k0>() {
                        @f
                        public final k0 a(@org.jetbrains.annotations.e final g g) {
                            kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
                            Object g2 = e;
                            if (!(g2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                                g2 = null;
                            }
                            kotlin.reflect.jvm.internal.impl.name.a h;
                            if (g2 == null) {
                                h = null;
                            }
                            else {
                                h = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.h((h)g2);
                            }
                            if (h == null) {
                                return null;
                            }
                            final kotlin.reflect.jvm.internal.impl.descriptors.e a = g.a(h);
                            if (a == null) {
                                return null;
                            }
                            if (kotlin.jvm.internal.k0.g((Object)a, (Object)e)) {
                                return null;
                            }
                            return (k0)kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e.this.k(k0, a, a).e();
                        }
                    });
                    final Boolean b2 = Boolean.TRUE;
                    return (s0<k0, Boolean>)n1.a((Object)k0, (Object)b2);
                }
                k0 = u.j(kotlin.jvm.internal.k0.C("Raw error type: ", (Object)k0.N0()));
                kotlin.jvm.internal.k0.o((Object)k0, "createErrorType(\"Raw error type: ${type.constructor}\")");
            }
        }
        final Boolean b2 = Boolean.FALSE;
        return (s0<k0, Boolean>)n1.a((Object)k0, (Object)b2);
    }
    
    private final c0 l(c0 c0) {
        final h c2 = c0.N0().c();
        if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b1) {
            c0 = this.l(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.c((kotlin.reflect.jvm.internal.impl.descriptors.b1)c2, null, null, 3, null));
        }
        else {
            if (!(c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                throw new IllegalStateException(kotlin.jvm.internal.k0.C("Unexpected declaration kind: ", (Object)c2).toString());
            }
            final h c3 = z.d(c0).N0().c();
            if (!(c3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("For some reason declaration for upper bound is not a class but \"");
                sb.append(c3);
                sb.append("\" while for lower it's \"");
                sb.append(c2);
                sb.append('\"');
                throw new IllegalStateException(sb.toString().toString());
            }
            final s0<k0, Boolean> k = this.k(z.c(c0), (kotlin.reflect.jvm.internal.impl.descriptors.e)c2, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e.d);
            final k0 k2 = (k0)k.a();
            final boolean booleanValue = (boolean)k.b();
            final s0<k0, Boolean> i = this.k(z.d(c0), (kotlin.reflect.jvm.internal.impl.descriptors.e)c3, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e.e);
            final k0 k3 = (k0)i.a();
            final boolean booleanValue2 = (boolean)i.b();
            if (!booleanValue && !booleanValue2) {
                final d0 a = d0.a;
                c0 = d0.d(k2, k3);
            }
            else {
                c0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f(k2, k3);
            }
        }
        return c0;
    }
    
    @Override
    public boolean f() {
        return false;
    }
    
    @org.jetbrains.annotations.e
    public final y0 i(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b1 b1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a a, @org.jetbrains.annotations.e final c0 c0) {
        kotlin.jvm.internal.k0.p((Object)b1, "parameter");
        kotlin.jvm.internal.k0.p((Object)a, "attr");
        kotlin.jvm.internal.k0.p((Object)c0, "erasedUpperBound");
        final int n = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e.a.a[a.c().ordinal()];
        y0 d;
        if (n != 1) {
            if (n != 2 && n != 3) {
                throw new h0();
            }
            if (!b1.v().b()) {
                d = new a1(k1.K, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)b1).getNothingType());
            }
            else {
                final List<kotlin.reflect.jvm.internal.impl.descriptors.b1> parameters = c0.N0().getParameters();
                kotlin.jvm.internal.k0.o((Object)parameters, "erasedUpperBound.constructor.parameters");
                if (parameters.isEmpty() ^ true) {
                    d = new a1(k1.M, c0);
                }
                else {
                    d = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.d(b1, a);
                }
            }
        }
        else {
            d = new a1(k1.K, c0);
        }
        return d;
    }
    
    @org.jetbrains.annotations.e
    public a1 m(@org.jetbrains.annotations.e final c0 c0) {
        kotlin.jvm.internal.k0.p((Object)c0, "key");
        return new a1(this.l(c0));
    }
}
