// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.model.p;
import kotlin.reflect.jvm.internal.impl.types.model.k;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.model.o;
import java.util.HashSet;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import org.jetbrains.annotations.e;

public final class v
{
    @f
    public static final i a(@e final e1 e1, @e final i i) {
        k0.p((Object)e1, "<this>");
        k0.p((Object)i, "inlineClassType");
        return b(e1, i, new HashSet<o>());
    }
    
    private static final i b(final e1 e1, final i i, final HashSet<o> set) {
        final o q = e1.q(i);
        if (!set.add(q)) {
            return null;
        }
        final p u = e1.u(q);
        i b2;
        if (u != null) {
            final i b = b(e1, e1.k(u), set);
            if (b == null) {
                return null;
            }
            b2 = b;
            if (!e1.X(b)) {
                if (e1.W(i)) {
                    return e1.g0(b);
                }
                b2 = b;
            }
        }
        else {
            i j = i;
            if (!e1.L(q)) {
                return j;
            }
            final i m = e1.M(i);
            if (m == null) {
                return null;
            }
            b2 = b(e1, m, set);
            if (b2 == null) {
                return null;
            }
            if (e1.X(i)) {
                if (e1.X(b2)) {
                    j = i;
                    return j;
                }
                if (b2 instanceof k && e1.h0((k)b2)) {
                    j = i;
                    return j;
                }
                j = e1.g0(b2);
                return j;
            }
        }
        return b2;
    }
}
