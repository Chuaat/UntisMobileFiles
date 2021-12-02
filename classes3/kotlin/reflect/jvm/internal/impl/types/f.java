// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.types.model.n;
import kotlin.reflect.jvm.internal.impl.types.model.m;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.model.w;
import kotlin.reflect.jvm.internal.impl.types.model.a;
import java.util.Set;
import java.util.ArrayDeque;
import n6.l;
import kotlin.reflect.jvm.internal.impl.types.model.b;
import kotlin.collections.v;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.model.r;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.model.o;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.model.h;
import kotlin.reflect.jvm.internal.impl.types.model.k;
import m6.d;
import org.jetbrains.annotations.e;

public final class f
{
    @e
    public static final f a;
    @d
    public static boolean b;
    
    static {
        a = new f();
    }
    
    private f() {
    }
    
    private final Boolean a(final g g, final k k, final k i) {
        if (!g.A0(k) && !g.A0(i)) {
            return null;
        }
        if (g.A0(k) && g.A0(i)) {
            return Boolean.TRUE;
        }
        if (g.A0(k)) {
            if (c(g, this, k, i, false)) {
                return Boolean.TRUE;
            }
        }
        else if (g.A0(i) && (b(g, k) || c(g, this, i, k, true))) {
            return Boolean.TRUE;
        }
        return null;
    }
    
    private static final boolean b(final g g, k a) {
        final o b = g.b(a);
        final boolean b2 = b instanceof h;
        boolean b3 = true;
        if (b2) {
            final Collection<i> n = g.n(b);
            boolean b4 = false;
            Label_0115: {
                if (!(n instanceof Collection) || !n.isEmpty()) {
                    final Iterator<Object> iterator = n.iterator();
                    while (iterator.hasNext()) {
                        a = g.a(iterator.next());
                        Object value;
                        if (a == null) {
                            value = null;
                        }
                        else {
                            value = g.A0(a);
                        }
                        if (k0.g(value, (Object)Boolean.TRUE)) {
                            b4 = true;
                            break Label_0115;
                        }
                    }
                }
                b4 = false;
            }
            if (b4) {
                return b3;
            }
        }
        b3 = false;
        return b3;
    }
    
    private static final boolean c(final g g, final f f, final k k, final k i, final boolean b) {
        final Collection<i> p5 = g.p(k);
        final boolean b2 = p5 instanceof Collection;
        final boolean b3 = true;
        if (!b2 || !p5.isEmpty()) {
            for (final i j : p5) {
                if (k0.g((Object)g.q(j), (Object)g.b(i)) || (b && o(f, g, i, j, false, 8, null))) {
                    return b3;
                }
            }
        }
        return false;
    }
    
    private final Boolean d(final g g, final k k, final k i) {
        final boolean j = g.J(k);
        boolean b = false;
        boolean b2;
        if (!j && !g.J(i)) {
            if (!g.V(k) && !g.V(i)) {
                final kotlin.reflect.jvm.internal.impl.types.model.e a0 = g.a0(i);
                k w;
                if (a0 == null) {
                    w = i;
                }
                else {
                    w = g.w(a0);
                }
                final kotlin.reflect.jvm.internal.impl.types.model.d o = g.O(w);
                i g2;
                if (o == null) {
                    g2 = null;
                }
                else {
                    g2 = g.G(o);
                }
                if (o != null && g2 != null) {
                    i l;
                    if (g.I(i)) {
                        l = g.v(g2, true);
                    }
                    else {
                        l = g2;
                        if (g.x0(i)) {
                            l = g.D(g2);
                        }
                    }
                    final int n = f.a.b[g.q0(k, o).ordinal()];
                    if (n == 1) {
                        b2 = o(this, g, k, l, false, 8, null);
                        return b2;
                    }
                    if (n == 2) {
                        if (o(this, g, k, l, false, 8, null)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                final o b3 = g.b(i);
                if (g.K(b3)) {
                    g.I(i);
                    final Collection<i> n2 = g.n(b3);
                    if (!(n2 instanceof Collection) || !n2.isEmpty()) {
                        final Iterator<Object> iterator = n2.iterator();
                        while (iterator.hasNext()) {
                            if (!o(this, g, k, iterator.next(), false, 8, null)) {
                                return b;
                            }
                        }
                    }
                    b = true;
                    return b;
                }
                return null;
            }
            else {
                b2 = g.C0();
            }
        }
        else {
            if (g.z0()) {
                return Boolean.TRUE;
            }
            if (g.I(k) && !g.I(i)) {
                return Boolean.FALSE;
            }
            b2 = kotlin.reflect.jvm.internal.impl.types.d.a.b(g, g.c(k, false), g.c(i, false));
        }
        return b2;
    }
    
    private final List<k> e(final g g, k k, final o o) {
        List<k> o2;
        if ((o2 = g.o0(k, o)) == null) {
            if (!g.H(o) && g.w0(k)) {
                return (List<k>)v.E();
            }
            if (g.c0(o)) {
                List list;
                if (g.f0(g.b(k), o)) {
                    final k z = g.Z(k, kotlin.reflect.jvm.internal.impl.types.model.b.G);
                    if (z != null) {
                        k = z;
                    }
                    list = v.k((Object)k);
                }
                else {
                    list = v.E();
                }
                return (List<k>)list;
            }
            final kotlin.reflect.jvm.internal.impl.utils.i<k> i = new kotlin.reflect.jvm.internal.impl.utils.i<k>();
            g.u0();
            final ArrayDeque<k> r0 = g.r0();
            k0.m((Object)r0);
            final Set<k> s0 = g.s0();
            k0.m((Object)s0);
            r0.push(k);
            while (r0.isEmpty() ^ true) {
                if (s0.size() > 1000) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Too many supertypes for type: ");
                    sb.append(k);
                    sb.append(". Supertypes = ");
                    sb.append(v.Z2((Iterable)s0, (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 63, (Object)null));
                    throw new IllegalStateException(sb.toString().toString());
                }
                final k j = r0.pop();
                k0.o((Object)j, "current");
                if (!s0.add(j)) {
                    continue;
                }
                k z2;
                if ((z2 = g.Z(j, kotlin.reflect.jvm.internal.impl.types.model.b.G)) == null) {
                    z2 = j;
                }
                g.b b;
                if (g.f0(g.b(z2), o)) {
                    i.add(z2);
                    b = kotlin.reflect.jvm.internal.impl.types.g.b.c.a;
                }
                else if (g.h(z2) == 0) {
                    b = kotlin.reflect.jvm.internal.impl.types.g.b.b.a;
                }
                else {
                    b = g.F0(z2);
                }
                if (!(k0.g((Object)b, (Object)kotlin.reflect.jvm.internal.impl.types.g.b.c.a) ^ true)) {
                    b = null;
                }
                if (b == null) {
                    continue;
                }
                final Iterator<i> iterator = g.n(g.b(j)).iterator();
                while (iterator.hasNext()) {
                    r0.add(b.a(g, iterator.next()));
                }
            }
            g.m0();
            o2 = i;
        }
        return o2;
    }
    
    private final List<k> f(final g g, final k k, final o o) {
        return this.q(g, this.e(g, k, o));
    }
    
    private final boolean g(final g g, final i i, final i j, final boolean b) {
        final Boolean d = this.d(g, g.Q(i), g.F(j));
        if (d != null) {
            final boolean booleanValue = d;
            g.k0(i, j, b);
            return booleanValue;
        }
        final Boolean k0 = g.k0(i, j, b);
        if (k0 == null) {
            return this.p(g, g.Q(i), g.F(j));
        }
        return k0;
    }
    
    private final boolean k(final g g, final k k) {
        final o b = g.b(k);
        if (g.H(b)) {
            return g.l(b);
        }
        final boolean l = g.l(g.b(k));
        boolean b2 = true;
        if (!l) {
            g.u0();
            final ArrayDeque<k> r0 = g.r0();
            k0.m((Object)r0);
            final Set<k> s0 = g.s0();
            k0.m((Object)s0);
            r0.push(k);
            while (r0.isEmpty() ^ true) {
                if (s0.size() > 1000) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Too many supertypes for type: ");
                    sb.append(k);
                    sb.append(". Supertypes = ");
                    sb.append(v.Z2((Iterable)s0, (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 63, (Object)null));
                    throw new IllegalStateException(sb.toString().toString());
                }
                final k i = r0.pop();
                k0.o((Object)i, "current");
                if (!s0.add(i)) {
                    continue;
                }
                g.b b3;
                if (g.w0(i)) {
                    b3 = kotlin.reflect.jvm.internal.impl.types.g.b.c.a;
                }
                else {
                    b3 = kotlin.reflect.jvm.internal.impl.types.g.b.b.a;
                }
                if (!(k0.g((Object)b3, (Object)kotlin.reflect.jvm.internal.impl.types.g.b.c.a) ^ true)) {
                    b3 = null;
                }
                if (b3 == null) {
                    continue;
                }
                final Iterator<i> iterator = g.n(g.b(i)).iterator();
                while (iterator.hasNext()) {
                    final k a = b3.a(g, iterator.next());
                    if (g.l(g.b(a))) {
                        g.m0();
                        return b2;
                    }
                    r0.add(a);
                }
            }
            g.m0();
            b2 = false;
        }
        return b2;
    }
    
    private final boolean l(final g g, final i i) {
        return g.r(g.q(i)) && !g.y0(i) && !g.x0(i) && k0.g((Object)g.b(g.Q(i)), (Object)g.b(g.F(i)));
    }
    
    public static /* synthetic */ boolean o(final f f, final g g, final i i, final i j, boolean b, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            b = false;
        }
        return f.n(g, i, j, b);
    }
    
    private final boolean p(final g g, final k obj, final k obj2) {
        if (f.b) {
            if (!g.C(obj) && !g.K(g.b(obj))) {
                g.v0(obj);
            }
            if (!g.C(obj2)) {
                g.v0(obj2);
            }
        }
        if (!c.a.d(g, obj, obj2)) {
            return false;
        }
        final Boolean a = this.a(g, g.Q(obj), g.F(obj2));
        if (a != null) {
            final boolean booleanValue = a;
            g.l0(g, obj, obj2, false, 4, null);
            return booleanValue;
        }
        final o b = g.b(obj2);
        if (g.f0(g.b(obj), b) && g.f(b) == 0) {
            return true;
        }
        if (g.T(g.b(obj2))) {
            return true;
        }
        final List<k> j = this.j(g, obj, b);
        final int size = j.size();
        if (size == 0) {
            return this.k(g, obj);
        }
        if (size == 1) {
            return this.m(g, g.m((k)v.o2((List)j)), obj2);
        }
        final kotlin.reflect.jvm.internal.impl.types.model.a a2 = new kotlin.reflect.jvm.internal.impl.types.model.a(g.f(b));
        final int f = g.f(b);
        int n2;
        if (f > 0) {
            int n = 0;
            n2 = 0;
            while (true) {
                final int n3 = n + 1;
                if (n2 == 0 && g.A(g.s(b, n)) == w.I) {
                    n2 = 0;
                }
                else {
                    n2 = 1;
                }
                if (n2 == 0) {
                    final ArrayList list = new ArrayList<i>(v.Y((Iterable)j, 10));
                    for (final k obj3 : j) {
                        n p3 = g.p0(obj3, n);
                        if (p3 == null || g.S(p3) != w.J) {
                            p3 = null;
                        }
                        if (p3 == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Incorrect type: ");
                            sb.append(obj3);
                            sb.append(", subType: ");
                            sb.append(obj);
                            sb.append(", superType: ");
                            sb.append(obj2);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                        list.add(g.d0(p3));
                    }
                    a2.add(g.N(g.B((List<? extends i>)list)));
                }
                if (n3 >= f) {
                    break;
                }
                n = n3;
            }
        }
        else {
            n2 = 0;
        }
        if (n2 == 0 && this.m(g, a2, obj2)) {
            return true;
        }
        if (!j.isEmpty()) {
            final Iterator<Object> iterator2 = j.iterator();
            while (iterator2.hasNext()) {
                if (this.m(g, g.m(iterator2.next()), obj2)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final List<k> q(final g g, List<? extends k> list) {
        if (list.size() < 2) {
            return (List<k>)list;
        }
        final ArrayList<Object> list2 = new ArrayList<Object>();
        final Iterator<k> iterator = list.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final int n = 1;
            if (!hasNext) {
                break;
            }
            final k next = iterator.next();
            final m m = g.m(next);
            final int e = g.E(m);
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= e) {
                    break;
                }
                if (g.z(g.d0(g.o(m, n2))) != null) {
                    n3 = 0;
                    break;
                }
                ++n2;
            }
            if (n3 == 0) {
                continue;
            }
            list2.add(next);
        }
        if (list2.isEmpty() ^ true) {
            list = list2;
        }
        return (List<k>)list;
    }
    
    @org.jetbrains.annotations.f
    public final w h(@e final w w, @e final w w2) {
        k0.p((Object)w, "declared");
        k0.p((Object)w2, "useSite");
        final w j = w.J;
        if (w == j) {
            return w2;
        }
        if (w2 == j) {
            return w;
        }
        if (w == w2) {
            return w;
        }
        return null;
    }
    
    public final boolean i(@e final g g, @e final i i, @e final i j) {
        k0.p((Object)g, "context");
        k0.p((Object)i, "a");
        k0.p((Object)j, "b");
        boolean b = true;
        final boolean b2 = true;
        if (i == j) {
            return true;
        }
        if (this.l(g, i) && this.l(g, j)) {
            final i e0 = g.E0(i);
            final i e2 = g.E0(j);
            final k q = g.Q(e0);
            if (!g.f0(g.q(e0), g.q(e2))) {
                return false;
            }
            if (g.h(q) == 0) {
                boolean b3 = b2;
                if (!g.t0(e0)) {
                    if (g.t0(e2)) {
                        b3 = b2;
                    }
                    else {
                        b3 = (g.I(q) == g.I(g.Q(e2)) && b2);
                    }
                }
                return b3;
            }
        }
        if (!o(this, g, i, j, false, 8, null) || !o(this, g, j, i, false, 8, null)) {
            b = false;
        }
        return b;
    }
    
    @e
    public final List<k> j(@e final g g, @e final k k, @e final o o) {
        k0.p((Object)g, "<this>");
        k0.p((Object)k, "subType");
        k0.p((Object)o, "superConstructor");
        if (g.w0(k)) {
            return this.f(g, k, o);
        }
        if (!g.H(o) && !g.Y(o)) {
            return this.e(g, k, o);
        }
        final kotlin.reflect.jvm.internal.impl.utils.i<k> i = new kotlin.reflect.jvm.internal.impl.utils.i<k>();
        g.u0();
        final ArrayDeque<k> r0 = g.r0();
        k0.m((Object)r0);
        final Set<k> s0 = g.s0();
        k0.m((Object)s0);
        r0.push(k);
        while (r0.isEmpty() ^ true) {
            if (s0.size() > 1000) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(k);
                sb.append(". Supertypes = ");
                sb.append(v.Z2((Iterable)s0, (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 63, (Object)null));
                throw new IllegalStateException(sb.toString().toString());
            }
            final k j = r0.pop();
            k0.o((Object)j, "current");
            if (!s0.add(j)) {
                continue;
            }
            g.b b;
            if (g.w0(j)) {
                i.add(j);
                b = kotlin.reflect.jvm.internal.impl.types.g.b.c.a;
            }
            else {
                b = kotlin.reflect.jvm.internal.impl.types.g.b.b.a;
            }
            if (!(k0.g((Object)b, (Object)kotlin.reflect.jvm.internal.impl.types.g.b.c.a) ^ true)) {
                b = null;
            }
            if (b == null) {
                continue;
            }
            final Iterator<i> iterator = g.n(g.b(j)).iterator();
            while (iterator.hasNext()) {
                r0.add(b.a(g, iterator.next()));
            }
        }
        g.m0();
        final ArrayList list = new ArrayList();
        for (final k l : i) {
            k0.o((Object)l, "it");
            v.q0((Collection)list, (Iterable)this.f(g, l, o));
        }
        return (List<k>)list;
    }
    
    public final boolean m(@e final g g, @e final m m, @e final k k) {
        k0.p((Object)g, "<this>");
        k0.p((Object)m, "capturedSubArguments");
        k0.p((Object)k, "superType");
        final o b = g.b(k);
        final int f = g.f(b);
        if (f > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                final n p3 = g.P(k, n);
                if (!g.y(p3)) {
                    i d0 = g.d0(p3);
                    final n o = g.o(m, n);
                    g.S(o);
                    final w j = w.J;
                    final i d2 = g.d0(o);
                    final w h = this.h(g.A(g.s(b, n)), g.S(p3));
                    if (h == null) {
                        return g.z0();
                    }
                    if (g.i0(g) > 100) {
                        throw new IllegalStateException(k0.C("Arguments depth is too high. Some related argument: ", (Object)d2).toString());
                    }
                    g.j0(g, g.i0(g) + 1);
                    final int n3 = kotlin.reflect.jvm.internal.impl.types.f.a.a[h.ordinal()];
                    boolean b2;
                    if (n3 != 1) {
                        i i;
                        if (n3 != 2) {
                            if (n3 != 3) {
                                throw new h0();
                            }
                            i = d0;
                            d0 = d2;
                        }
                        else {
                            i = d2;
                        }
                        b2 = o(this, g, i, d0, false, 8, null);
                    }
                    else {
                        b2 = this.i(g, d2, d0);
                    }
                    g.j0(g, g.i0(g) - 1);
                    if (!b2) {
                        return false;
                    }
                }
                if (n2 >= f) {
                    break;
                }
                n = n2;
            }
        }
        return true;
    }
    
    public final boolean n(@e final g g, @e final i i, @e final i j, final boolean b) {
        k0.p((Object)g, "context");
        k0.p((Object)i, "subType");
        k0.p((Object)j, "superType");
        return i == j || (g.n0(i, j) && this.g(g, g.D0(g.E0(i)), g.D0(g.E0(j)), b));
    }
}
