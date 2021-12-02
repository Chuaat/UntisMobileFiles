// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.reflect.jvm.internal.impl.types.b1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.s0;
import java.util.Collection;
import n6.l;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w;

public final class f extends w implements j0
{
    public f(@e final k0 k0, @e final k0 k2) {
        kotlin.jvm.internal.k0.p((Object)k0, "lowerBound");
        kotlin.jvm.internal.k0.p((Object)k2, "upperBound");
        this(k0, k2, false);
    }
    
    private f(final k0 k0, final k0 k2, final boolean b) {
        super(k0, k2);
        if (!b) {
            kotlin.reflect.jvm.internal.impl.types.checker.f.a.d(k0, k2);
        }
    }
    
    private static final boolean a1(final String s, final String s2) {
        return kotlin.jvm.internal.k0.g((Object)s, (Object)s.c4(s2, "out ")) || kotlin.jvm.internal.k0.g((Object)s2, (Object)"*");
    }
    
    private static final List<String> b1(final c c, final c0 c2) {
        final List<y0> m0 = c2.M0();
        final ArrayList list = new ArrayList<String>(v.Y((Iterable)m0, 10));
        final Iterator<Object> iterator = m0.iterator();
        while (iterator.hasNext()) {
            list.add(c.z(iterator.next()));
        }
        return (List<String>)list;
    }
    
    private static final String c1(final String s, final String str) {
        if (!s.U2(s, '<', false, 2, null)) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s.t5(s, '<', null, 2, null));
        sb.append('<');
        sb.append(str);
        sb.append('>');
        sb.append(s.p5(s, '>', null, 2, null));
        return sb.toString();
    }
    
    @e
    @Override
    public k0 U0() {
        return this.V0();
    }
    
    @e
    @Override
    public String X0(@e final c c, @e final kotlin.reflect.jvm.internal.impl.renderer.f f) {
        kotlin.jvm.internal.k0.p((Object)c, "renderer");
        kotlin.jvm.internal.k0.p((Object)f, "options");
        final String y = c.y(this.V0());
        final String y2 = c.y(this.W0());
        if (f.p()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("raw (");
            sb.append(y);
            sb.append("..");
            sb.append(y2);
            sb.append(')');
            return sb.toString();
        }
        if (this.W0().M0().isEmpty()) {
            return c.v(y, y2, a.e(this));
        }
        final List<String> b1 = b1(c, this.V0());
        final List<String> b2 = b1(c, this.W0());
        final String z2 = v.Z2((Iterable)b1, (CharSequence)", ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)f$a.G, 30, (Object)null);
        final List v5 = v.V5((Iterable)b1, (Iterable)b2);
        final boolean b3 = v5 instanceof Collection;
        final boolean b4 = true;
        int n = 0;
        Label_0245: {
            if (b3 && v5.isEmpty()) {
                n = (b4 ? 1 : 0);
            }
            else {
                final Iterator<s0> iterator = v5.iterator();
                s0 s0;
                do {
                    n = (b4 ? 1 : 0);
                    if (!iterator.hasNext()) {
                        break Label_0245;
                    }
                    s0 = iterator.next();
                } while (a1((String)s0.e(), (String)s0.f()));
                n = 0;
            }
        }
        String c2 = y2;
        if (n != 0) {
            c2 = c1(y2, z2);
        }
        final String c3 = c1(y, z2);
        if (kotlin.jvm.internal.k0.g((Object)c3, (Object)c2)) {
            return c3;
        }
        return c.v(c3, c2, a.e(this));
    }
    
    @e
    public f Y0(final boolean b) {
        return new f(this.V0().U0(b), this.W0().U0(b));
    }
    
    @e
    public w Z0(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return new f((k0)g.g(this.V0()), (k0)g.g(this.W0()), true);
    }
    
    @e
    public f d1(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "newAnnotations");
        return new f(this.V0().V0(g), this.W0().V0(g));
    }
    
    @e
    @Override
    public h x() {
        final kotlin.reflect.jvm.internal.impl.descriptors.h c = this.N0().c();
        kotlin.reflect.jvm.internal.impl.descriptors.e e;
        if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
        }
        else {
            e = null;
        }
        if (e != null) {
            final h e2 = e.e0((b1)kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e.c);
            kotlin.jvm.internal.k0.o((Object)e2, "classDescriptor.getMemberScope(RawSubstitution)");
            return e2;
        }
        throw new IllegalStateException(kotlin.jvm.internal.k0.C("Incorrect classifier: ", (Object)this.N0().c()).toString());
    }
}
