// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.internal.k;
import kotlin.coroutines.intrinsics.b;
import kotlinx.coroutines.internal.j;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.coroutines.g$c;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\f\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005" }, d2 = { "Lkotlin/j2;", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class f4
{
    public static final void a(@e final g g) {
        final k2 k2 = (k2)g.get((g$c)kotlinx.coroutines.k2.t);
        if (k2 != null && !k2.a()) {
            throw k2.w();
        }
    }
    
    @f
    public static final Object b(@e final d<? super j2> d) {
        final g context = d.getContext();
        a(context);
        Object d2;
        if (!((d2 = b.d((d)d)) instanceof j)) {
            d2 = null;
        }
        final j<j2> j = (j<j2>)d2;
        Object o = null;
        Label_0112: {
            if (j != null) {
                if (j.L.K(context)) {
                    j.n(context, j2.a);
                }
                else {
                    final e4 e4 = new e4();
                    final g plus = context.plus((g)e4);
                    o = j2.a;
                    j.n(plus, (j2)o);
                    if (e4.G && !k.h(j)) {
                        break Label_0112;
                    }
                }
                o = b.h();
            }
            else {
                o = j2.a;
            }
        }
        if (o == b.h()) {
            h.c((d)d);
        }
        if (o == b.h()) {
            return o;
        }
        return j2.a;
    }
}
