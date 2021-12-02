// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.Collection;
import java.util.ArrayDeque;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.b;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class x
{
    private static final c0 a(final c0 c0) {
        return b.a(c0).d();
    }
    
    private static final String b(final w0 w0) {
        final StringBuilder sb = new StringBuilder();
        c(k0.C("type: ", (Object)w0), sb);
        c(k0.C("hashCode: ", (Object)w0.hashCode()), sb);
        c(k0.C("javaClass: ", (Object)w0.getClass().getCanonicalName()), sb);
        for (Object o = w0.c(); o != null; o = ((m)o).c()) {
            c(k0.C("fqName: ", (Object)c.g.s((m)o)), sb);
            c(k0.C("javaClass: ", (Object)((m)o).getClass().getCanonicalName()), sb);
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    private static final StringBuilder c(final String str, final StringBuilder sb) {
        k0.p((Object)str, "<this>");
        k0.p((Object)sb, "$this_anonymous");
        sb.append(str);
        k0.o((Object)sb, "append(value)");
        sb.append('\n');
        k0.o((Object)sb, "append('\\n')");
        return sb;
    }
    
    @f
    public static final c0 d(@e c0 c0, @e final c0 c2, @e final v v) {
        k0.p((Object)c0, "subtype");
        k0.p((Object)c2, "supertype");
        k0.p((Object)v, "typeCheckingProcedureCallbacks");
        final ArrayDeque<s> arrayDeque = new ArrayDeque<s>();
        arrayDeque.add(new s(c0, null));
        final w0 n0 = c2.N0();
        while (!arrayDeque.isEmpty()) {
            s a = arrayDeque.poll();
            c0 = a.b();
            final w0 n2 = c0.N0();
            if (v.a(n2, n0)) {
                boolean o0 = c0.O0();
                while (true) {
                    a = a.a();
                    if (a == null) {
                        break;
                    }
                    final c0 b = a.b();
                    final List<y0> m0 = b.M0();
                    boolean b2 = false;
                    Label_0192: {
                        if (!(m0 instanceof Collection) || !m0.isEmpty()) {
                            final Iterator<Object> iterator = m0.iterator();
                            while (iterator.hasNext()) {
                                if (iterator.next().c() != k1.K) {
                                    b2 = true;
                                    break Label_0192;
                                }
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        c0 = d.f(x0.c.a(b), false, 1, null).c().n(c0, k1.K);
                        k0.o((Object)c0, "TypeConstructorSubstitution.create(currentType)\n                            .wrapWithCapturingSubstitution().buildSubstitutor()\n                            .safeSubstitute(substituted, Variance.INVARIANT)");
                        c0 = a(c0);
                    }
                    else {
                        c0 = x0.c.a(b).c().n(c0, k1.K);
                        k0.o((Object)c0, "{\n                    TypeConstructorSubstitution.create(currentType)\n                            .buildSubstitutor()\n                            .safeSubstitute(substituted, Variance.INVARIANT)\n                }");
                    }
                    o0 = (o0 || b.O0());
                }
                final w0 n3 = c0.N0();
                if (v.a(n3, n0)) {
                    return f1.p(c0, o0);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Type constructors should be equals!\nsubstitutedSuperType: ");
                sb.append(b(n3));
                sb.append(", \n\nsupertype: ");
                sb.append(b(n0));
                sb.append(" \n");
                sb.append(v.a(n3, n0));
                throw new AssertionError((Object)sb.toString());
            }
            else {
                final Iterator<c0> iterator2 = n2.k().iterator();
                while (iterator2.hasNext()) {
                    c0 = iterator2.next();
                    k0.o((Object)c0, "immediateSupertype");
                    arrayDeque.add(new s(c0, a));
                }
            }
        }
        return null;
    }
}
