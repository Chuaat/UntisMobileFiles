// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import kotlinx.coroutines.internal.p0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlinx.coroutines.internal.g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017" }, d2 = { "Lkotlinx/coroutines/c4;", "T", "Lkotlinx/coroutines/internal/g0;", "Lkotlin/coroutines/g;", "context", "", "oldValue", "Lkotlin/j2;", "B1", "", "A1", "state", "r1", "L", "Ljava/lang/Object;", "savedOldValue", "K", "Lkotlin/coroutines/g;", "savedContext", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class c4<T> extends g0<T>
{
    private g K;
    private Object L;
    
    public c4(@e final g g, @e final d<? super T> d) {
        final d4 g2 = d4.G;
        g plus = g;
        if (g.get((g$c)g2) == null) {
            plus = g.plus((g)g2);
        }
        super(plus, d);
    }
    
    public final boolean A1() {
        if (this.K == null) {
            return false;
        }
        this.K = null;
        this.L = null;
        return true;
    }
    
    public final void B1(@e final g k, @f final Object l) {
        this.K = k;
        this.L = l;
    }
    
    @Override
    protected void r1(@f Object f) {
        final g k = this.K;
        final Object o = null;
        if (k != null) {
            p0.a(k, this.L);
            this.K = null;
            this.L = null;
        }
        final Object a = j0.a(f, (kotlin.coroutines.d<? super Object>)super.J);
        final kotlin.coroutines.d<T> j = (kotlin.coroutines.d<T>)super.J;
        final g context = j.getContext();
        final Object c = p0.c(context, null);
        f = o;
        if (c != p0.a) {
            f = l0.f(j, context, c);
        }
        try {
            super.J.resumeWith(a);
            final j2 a2 = j2.a;
        }
        finally {
            if (f == null || ((c4)f).A1()) {
                p0.a(context, c);
            }
        }
    }
}
