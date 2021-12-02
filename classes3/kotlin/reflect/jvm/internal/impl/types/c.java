// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import java.util.Set;
import java.util.ArrayDeque;
import n6.l;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.model.d;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.model.o;
import kotlin.reflect.jvm.internal.impl.types.model.k;
import org.jetbrains.annotations.e;

public final class c
{
    @e
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    private final boolean c(final g g, final k k, final o o) {
        return g.B0(k) || (!g.I(k) && ((g.C0() && g.V(k)) || g.f0(g.b(k), o)));
    }
    
    private final boolean e(final g g, final k k, final k i) {
        if (f.b) {
            if (!g.C(k) && !g.K(g.b(k))) {
                g.v0(k);
            }
            if (!g.C(i)) {
                g.v0(i);
            }
        }
        return g.I(i) || g.x0(k) || (k instanceof d && g.i((d)k)) || this.a(g, k, (g.b)g.b.b.a) || (!g.x0(i) && !this.a(g, i, (g.b)kotlin.reflect.jvm.internal.impl.types.g.b.d.a) && !g.w0(k) && this.b(g, k, g.b(i)));
    }
    
    public final boolean a(@e final g g, @e final k k, @e final g.b b) {
        k0.p((Object)g, "<this>");
        k0.p((Object)k, "type");
        k0.p((Object)b, "supertypesPolicy");
        final boolean w0 = g.w0(k);
        boolean b2 = false;
        if ((!w0 || g.I(k)) && !g.x0(k)) {
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
                g.b a;
                if (g.I(i)) {
                    a = kotlin.reflect.jvm.internal.impl.types.g.b.c.a;
                }
                else {
                    a = b;
                }
                if (!(k0.g((Object)a, (Object)kotlin.reflect.jvm.internal.impl.types.g.b.c.a) ^ true)) {
                    a = null;
                }
                if (a == null) {
                    continue;
                }
                final Iterator<i> iterator = g.n(g.b(i)).iterator();
                while (iterator.hasNext()) {
                    final k a2 = a.a(g, iterator.next());
                    if ((g.w0(a2) && !g.I(a2)) || g.x0(a2)) {
                        g.m0();
                        return true;
                    }
                    r0.add(a2);
                }
            }
            g.m0();
            return b2;
        }
        b2 = true;
        return b2;
    }
    
    public final boolean b(@e final g g, @e final k k, @e final o o) {
        k0.p((Object)g, "<this>");
        k0.p((Object)k, "start");
        k0.p((Object)o, "end");
        final boolean c = this.c(g, k, o);
        boolean b = true;
        if (!c) {
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
                g.b b2;
                if (g.I(i)) {
                    b2 = kotlin.reflect.jvm.internal.impl.types.g.b.c.a;
                }
                else {
                    b2 = kotlin.reflect.jvm.internal.impl.types.g.b.b.a;
                }
                if (!(k0.g((Object)b2, (Object)kotlin.reflect.jvm.internal.impl.types.g.b.c.a) ^ true)) {
                    b2 = null;
                }
                if (b2 == null) {
                    continue;
                }
                final Iterator<i> iterator = g.n(g.b(i)).iterator();
                while (iterator.hasNext()) {
                    final k a = b2.a(g, iterator.next());
                    if (this.c(g, a, o)) {
                        g.m0();
                        return b;
                    }
                    r0.add(a);
                }
            }
            g.m0();
            b = false;
        }
        return b;
    }
    
    public final boolean d(@e final g g, @e final k k, @e final k i) {
        k0.p((Object)g, "context");
        k0.p((Object)k, "subType");
        k0.p((Object)i, "superType");
        return this.e(g, k, i);
    }
}
