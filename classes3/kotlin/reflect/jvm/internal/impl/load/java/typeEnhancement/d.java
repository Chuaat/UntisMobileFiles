// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.f;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.j1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import n6.l;
import kotlin.reflect.jvm.internal.impl.types.z;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.c;

public final class d
{
    @e
    private final c a;
    
    public d(@e final c a) {
        k0.p((Object)a, "javaResolverSettings");
        this.a = a;
    }
    
    private final c0 a(c0 a, c0 a2) {
        a2 = h1.a(a2);
        if ((a = h1.a(a)) == null) {
            if (a2 == null) {
                return null;
            }
            a = a2;
        }
        if (a2 == null) {
            return a;
        }
        final d0 a3 = d0.a;
        return d0.d(z.c(a), z.d(a2));
    }
    
    private final b c(final kotlin.reflect.jvm.internal.impl.types.k0 k0, final l<? super Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> l, int i, final p p5, final boolean b) {
        if (!q.a(p5) && k0.M0().isEmpty()) {
            return new b(k0, 1, false);
        }
        final h c = k0.N0().c();
        if (c == null) {
            return new b(k0, 1, false);
        }
        final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e e = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e)l.invoke((Object)i);
        final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c b2 = t.b(c, e, p5);
        final h h = b2.a();
        final g b3 = b2.b();
        final w0 j = h.l();
        k0.o((Object)j, "enhancedClassifier.typeConstructor");
        int m = i + 1;
        int n;
        if (b3 != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        final List<y0> m2 = k0.M0();
        final ArrayList list = new ArrayList<y0>(v.Y((Iterable)m2, 10));
        final Iterator<Object> iterator = m2.iterator();
        int n2 = 0;
        int n3 = n;
        while (iterator.hasNext()) {
            final y0 next = iterator.next();
            if (n2 < 0) {
                v.W();
            }
            final y0 y0 = next;
            y0 y2;
            int n4;
            if (y0.d()) {
                if (((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e)l.invoke((Object)m)).c() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.H && !b) {
                    final c0 j2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j(y0.a().Q0());
                    final k1 c2 = y0.c();
                    k0.o((Object)c2, "arg.projectionKind");
                    y2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.d(j2, c2, j.getParameters().get(n2));
                }
                else {
                    y2 = f1.s(h.l().getParameters().get(n2));
                    k0.o((Object)y2, "{\n                    TypeUtils.makeStarProjection(enhancedClassifier.typeConstructor.parameters[localArgIndex])\n                }");
                }
                n4 = m + 1;
            }
            else {
                final a e2 = this.e(y0.a().Q0(), l, m);
                int n5;
                if (n3 == 0 && !e2.d()) {
                    n5 = 0;
                }
                else {
                    n5 = 1;
                }
                final int n6 = m + e2.a();
                final c0 b4 = e2.b();
                final k1 c3 = y0.c();
                k0.o((Object)c3, "arg.projectionKind");
                y2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.d(b4, c3, j.getParameters().get(n2));
                n3 = n5;
                n4 = n6;
            }
            list.add(y2);
            ++n2;
            m = n4;
        }
        final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c c4 = t.c(k0, e, p5);
        final boolean booleanValue = c4.a();
        final g b5 = c4.b();
        final boolean b6 = n3 != 0 || b5 != null;
        final int n7 = m - i;
        if (!b6) {
            return new b(k0, n7, false);
        }
        final int n8 = 0;
        final g a = t.a(v.N((Object[])new g[] { ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.a)k0).getAnnotations(), b3, b5 }));
        final d0 a2 = d0.a;
        kotlin.reflect.jvm.internal.impl.types.k0 k3;
        final kotlin.reflect.jvm.internal.impl.types.k0 k2 = k3 = d0.i(a, j, list, booleanValue, null, 16, null);
        if (e.d()) {
            k3 = this.f(k2);
        }
        i = n8;
        if (b5 != null) {
            i = n8;
            if (e.e()) {
                i = 1;
            }
        }
        j1 d = k3;
        if (i != 0) {
            d = h1.d(k0, k3);
        }
        return new b((kotlin.reflect.jvm.internal.impl.types.k0)d, n7, true);
    }
    
    static /* synthetic */ b d(final d d, final kotlin.reflect.jvm.internal.impl.types.k0 k0, final l l, final int n, final p p8, boolean b, final int n2, final Object o) {
        if ((n2 & 0x8) != 0x0) {
            b = false;
        }
        return d.c(k0, (l<? super Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e>)l, n, p8, b);
    }
    
    private final a e(j1 d, final l<? super Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> l, final int n) {
        final boolean a = e0.a(d);
        boolean b = false;
        if (a) {
            return new a(d, 1, false);
        }
        Object d3;
        if (d instanceof w) {
            final boolean b2 = d instanceof j0;
            final w w = (w)d;
            final b c = this.c(w.V0(), l, n, p.G, b2);
            final b c2 = this.c(w.W0(), l, n, p.H, b2);
            ((a)c).a();
            ((a)c2).a();
            if (((a)c).d() || ((a)c2).d()) {
                b = true;
            }
            final c0 a2 = this.a(c.e(), c2.e());
            j1 d2 = d;
            if (b) {
                if (d instanceof f) {
                    d = new f(c.e(), c2.e());
                }
                else {
                    final d0 a3 = d0.a;
                    d = d0.d(c.e(), c2.e());
                }
                d2 = h1.d(d, a2);
            }
            d3 = new a(d2, ((a)c).a(), b);
        }
        else {
            if (!(d instanceof kotlin.reflect.jvm.internal.impl.types.k0)) {
                throw new h0();
            }
            d3 = d(this, (kotlin.reflect.jvm.internal.impl.types.k0)d, l, n, p.I, false, 8, null);
        }
        return (a)d3;
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 f(kotlin.reflect.jvm.internal.impl.types.k0 h) {
        if (this.a.a()) {
            h = n0.h(h, true);
        }
        else {
            h = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g(h);
        }
        return h;
    }
    
    @org.jetbrains.annotations.f
    public final c0 b(@e final c0 c0, @e final l<? super Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e> l) {
        k0.p((Object)c0, "<this>");
        k0.p((Object)l, "qualifiers");
        return this.e(c0.Q0(), l, 0).c();
    }
    
    private static class a
    {
        @e
        private final c0 a;
        private final int b;
        private final boolean c;
        
        public a(@e final c0 a, final int b, final boolean c) {
            k0.p((Object)a, "type");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public final int a() {
            return this.b;
        }
        
        @e
        public c0 b() {
            return this.a;
        }
        
        @org.jetbrains.annotations.f
        public final c0 c() {
            c0 b = this.b();
            if (!this.d()) {
                b = null;
            }
            return b;
        }
        
        public final boolean d() {
            return this.c;
        }
    }
    
    private static final class b extends a
    {
        @e
        private final kotlin.reflect.jvm.internal.impl.types.k0 d;
        
        public b(@e final kotlin.reflect.jvm.internal.impl.types.k0 d, final int n, final boolean b) {
            k0.p((Object)d, "type");
            super(d, n, b);
            this.d = d;
        }
        
        @e
        public kotlin.reflect.jvm.internal.impl.types.k0 e() {
            return this.d;
        }
    }
}
