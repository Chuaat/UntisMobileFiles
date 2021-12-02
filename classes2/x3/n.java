// 
// Decompiled by Procyon v0.5.36
// 

package x3;

import y3.a;
import java.util.List;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import y3.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Lx3/m;", "Ly3/c;", "a", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class n
{
    @e
    public static final c a(@e final m m) {
        k0.p(m, "<this>");
        final List<a> b = m.b();
        Object i5;
        if (b == null) {
            i5 = null;
        }
        else {
            i5 = v.I5((Iterable<?>)b);
        }
        Object e = i5;
        if (i5 == null) {
            e = v.E();
        }
        return new c((List<a>)e);
    }
}
