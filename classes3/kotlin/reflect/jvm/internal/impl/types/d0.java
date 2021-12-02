// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.jvm.internal.m0;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.resolve.constants.n;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.u;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import m6.k;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import n6.l;
import org.jetbrains.annotations.e;

public final class d0
{
    @e
    public static final d0 a;
    @e
    private static final l<g, k0> b;
    
    static {
        a = new d0();
        b = (l)d0$a.G;
    }
    
    private d0() {
    }
    
    @k
    @e
    public static final k0 b(@e final a1 a1, @e final List<? extends y0> list) {
        kotlin.jvm.internal.k0.p((Object)a1, "<this>");
        kotlin.jvm.internal.k0.p((Object)list, "arguments");
        return new s0(u0.a.a, false).i(t0.e.a(null, a1, list), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b());
    }
    
    private final h c(final w0 obj, final List<? extends y0> list, final g g) {
        final kotlin.reflect.jvm.internal.impl.descriptors.h c = obj.c();
        h h;
        if (c instanceof b1) {
            h = c.A().x();
        }
        else if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            g k;
            if ((k = g) == null) {
                k = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.k(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.l((m)c));
            }
            final boolean empty = list.isEmpty();
            final kotlin.reflect.jvm.internal.impl.descriptors.e e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
            if (empty) {
                h = u.b(e, k);
            }
            else {
                h = u.a(e, x0.c.b(obj, list), k);
            }
        }
        else if (c instanceof a1) {
            h = kotlin.reflect.jvm.internal.impl.types.u.i(kotlin.jvm.internal.k0.C("Scope for abbreviation: ", (Object)((f0)c).getName()), true);
            kotlin.jvm.internal.k0.o((Object)h, "createErrorScope(\"Scope for abbreviation: ${descriptor.name}\", true)");
        }
        else {
            if (obj instanceof b0) {
                return ((b0)obj).e();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unsupported classifier: ");
            sb.append(c);
            sb.append(" for constructor: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString());
        }
        return h;
    }
    
    @k
    @e
    public static final j1 d(@e final k0 k0, @e final k0 k2) {
        kotlin.jvm.internal.k0.p((Object)k0, "lowerBound");
        kotlin.jvm.internal.k0.p((Object)k2, "upperBound");
        if (kotlin.jvm.internal.k0.g((Object)k0, (Object)k2)) {
            return k0;
        }
        return new x(k0, k2);
    }
    
    @k
    @e
    public static final k0 e(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final n n, final boolean b) {
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)n, "constructor");
        final List e = v.E();
        final h i = kotlin.reflect.jvm.internal.impl.types.u.i("Scope for integer literal type", true);
        kotlin.jvm.internal.k0.o((Object)i, "createErrorScope(\"Scope for integer literal type\", true)");
        return j(g, n, e, b, i);
    }
    
    private final b f(w0 b, final g g, final List<? extends y0> list) {
        final kotlin.reflect.jvm.internal.impl.descriptors.h c = b.c();
        kotlin.reflect.jvm.internal.impl.descriptors.h e;
        if (c == null) {
            e = null;
        }
        else {
            e = g.e((m)c);
        }
        if (e == null) {
            return null;
        }
        if (e instanceof a1) {
            return new b(b((a1)e, list), null);
        }
        b = e.l().b(g);
        kotlin.jvm.internal.k0.o((Object)b, "descriptor.typeConstructor.refine(kotlinTypeRefiner)");
        return new b(null, b);
    }
    
    @k
    @e
    public static final k0 g(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final List<? extends y0> list) {
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)e, "descriptor");
        kotlin.jvm.internal.k0.p((Object)list, "arguments");
        final w0 l = ((kotlin.reflect.jvm.internal.impl.descriptors.h)e).l();
        kotlin.jvm.internal.k0.o((Object)l, "descriptor.typeConstructor");
        return i(g, l, list, false, null, 16, null);
    }
    
    @k
    @m6.h
    @e
    public static final k0 h(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final w0 w0, @e final List<? extends y0> list, final boolean b, @f final g g2) {
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)w0, "constructor");
        kotlin.jvm.internal.k0.p((Object)list, "arguments");
        if (g.isEmpty() && list.isEmpty() && !b && w0.c() != null) {
            final kotlin.reflect.jvm.internal.impl.descriptors.h c = w0.c();
            kotlin.jvm.internal.k0.m((Object)c);
            final k0 a = c.A();
            kotlin.jvm.internal.k0.o((Object)a, "constructor.declarationDescriptor!!.defaultType");
            return a;
        }
        final d0 a2 = d0.a;
        return k(g, w0, list, b, a2.c(w0, list, g2), (l<? super g, ? extends k0>)new l<g, k0>() {
            @f
            public final k0 a(@e final g g) {
                kotlin.jvm.internal.k0.p((Object)g, "refiner");
                final b a = d0.this.f(w0, g, list);
                if (a == null) {
                    return null;
                }
                final k0 a2 = a.a();
                if (a2 == null) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g j = g;
                    final w0 b = a.b();
                    kotlin.jvm.internal.k0.m((Object)b);
                    return d0.h(j, b, list, b, g);
                }
                return a2;
            }
        });
    }
    
    public static /* synthetic */ k0 i(final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, final w0 w0, final List list, final boolean b, g g2, final int n, final Object o) {
        if ((n & 0x10) != 0x0) {
            g2 = null;
        }
        return h(g, w0, list, b, g2);
    }
    
    @k
    @e
    public static final k0 j(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final w0 w0, @e final List<? extends y0> list, final boolean b, @e final h h) {
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)w0, "constructor");
        kotlin.jvm.internal.k0.p((Object)list, "arguments");
        kotlin.jvm.internal.k0.p((Object)h, "memberScope");
        final l0 l0 = new l0(w0, list, b, h, (l<? super g, ? extends k0>)new l<g, k0>() {
            final /* synthetic */ d0 G = d0.a;
            
            @f
            public final k0 a(@e final g g) {
                kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
                final b a = d0.this.f(w0, g, list);
                if (a == null) {
                    return null;
                }
                final k0 a2 = a.a();
                if (a2 == null) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g j = g;
                    final w0 b = a.b();
                    kotlin.jvm.internal.k0.m((Object)b);
                    return d0.j(j, b, list, b, h);
                }
                return a2;
            }
        });
        k0 k0;
        if (g.isEmpty()) {
            k0 = l0;
        }
        else {
            k0 = new i(l0, g);
        }
        return k0;
    }
    
    @k
    @e
    public static final k0 k(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final w0 w0, @e final List<? extends y0> list, final boolean b, @e final h h, @e final l<? super g, ? extends k0> l) {
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)w0, "constructor");
        kotlin.jvm.internal.k0.p((Object)list, "arguments");
        kotlin.jvm.internal.k0.p((Object)h, "memberScope");
        kotlin.jvm.internal.k0.p((Object)l, "refinedTypeFactory");
        final l0 l2 = new l0(w0, list, b, h, l);
        k0 k0;
        if (g.isEmpty()) {
            k0 = l2;
        }
        else {
            k0 = new i(l2, g);
        }
        return k0;
    }
    
    private static final class b
    {
        @f
        private final k0 a;
        @f
        private final w0 b;
        
        public b(@f final k0 a, @f final w0 b) {
            this.a = a;
            this.b = b;
        }
        
        @f
        public final k0 a() {
            return this.a;
        }
        
        @f
        public final w0 b() {
            return this.b;
        }
    }
}
