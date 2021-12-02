// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlinx.coroutines.internal.g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/flow/internal/p;", "T", "Lkotlinx/coroutines/internal/g0;", "", "cause", "", "o0", "Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class p<T> extends g0<T>
{
    public p(@e final g g, @e final d<? super T> d) {
        super(g, d);
    }
    
    public boolean o0(@e final Throwable t) {
        return t instanceof m || this.j0(t);
    }
}
