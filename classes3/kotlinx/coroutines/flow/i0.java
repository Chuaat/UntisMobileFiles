// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012-\u0010\f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000b\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/flow/i0;", "T", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "e", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "<init>", "(Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class i0<T> extends a<T>
{
    private final p<j<? super T>, d<? super j2>, Object> G;
    
    public i0(@e final p<? super j<? super T>, ? super d<? super j2>, ?> g) {
        this.G = (p<j<? super T>, d<? super j2>, Object>)g;
    }
    
    @f
    @Override
    public Object e(@e final j<? super T> j, @e final d<? super j2> d) {
        final Object invoke = this.G.invoke((Object)j, (Object)d);
        if (invoke == b.h()) {
            return invoke;
        }
        return j2.a;
    }
}
