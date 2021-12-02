// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.model.g;
import kotlin.reflect.jvm.internal.impl.types.model.n;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.model.k;
import kotlin.reflect.jvm.internal.impl.types.model.r;
import org.jetbrains.annotations.e;

public final class d
{
    @e
    public static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    private final boolean a(final r r, final k k, final k i) {
        if (r.h(k) != r.h(i) || r.I(k) != r.I(i) || r.a0(k) == null != (r.a0(i) == null) || r.f0(r.b(k), r.b(i))) {
            return false;
        }
        if (r.b0(k, i)) {
            return true;
        }
        final int h = r.h(k);
        if (h > 0) {
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                final n p3 = r.P(k, n);
                final n p4 = r.P(i, n);
                if (r.y(p3) != r.y(p4)) {
                    return false;
                }
                if (!r.y(p3)) {
                    if (r.S(p3) != r.S(p4)) {
                        return false;
                    }
                    if (!this.c(r, r.d0(p3), r.d0(p4))) {
                        return false;
                    }
                }
                if (n2 >= h) {
                    break;
                }
                n = n2;
            }
        }
        return true;
    }
    
    private final boolean c(final r r, final i i, final i j) {
        boolean b = true;
        if (i == j) {
            return true;
        }
        final k a = r.a(i);
        final k a2 = r.a(j);
        if (a != null && a2 != null) {
            return this.a(r, a, a2);
        }
        final g z = r.z(i);
        final g z2 = r.z(j);
        if (z != null && z2 != null) {
            if (!this.a(r, r.e(z), r.e(z2)) || !this.a(r, r.d(z), r.d(z2))) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final boolean b(@e final r r, @e final i i, @e final i j) {
        k0.p((Object)r, "context");
        k0.p((Object)i, "a");
        k0.p((Object)j, "b");
        return this.c(r, i, j);
    }
}
