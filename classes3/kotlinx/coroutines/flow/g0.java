// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.f2;
import kotlin.j2;
import kotlin.coroutines.d;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.t;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0097A\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019" }, d2 = { "Lkotlinx/coroutines/flow/g0;", "T", "Lkotlinx/coroutines/flow/j0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/t;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "()Ljava/util/List;", "replayCache", "flow", "<init>", "(Lkotlinx/coroutines/flow/j0;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class g0<T> implements j0<T>, c<T>, t<T>
{
    private final /* synthetic */ j0<? extends T> G;
    
    public g0(@e final j0<? extends T> g) {
        this.G = g;
    }
    
    @e
    @Override
    public List<T> a() {
        return (List<T>)this.G.a();
    }
    
    @f2
    @f
    @Override
    public Object c(@e final j<? super T> j, @e final d<? super j2> d) {
        return this.G.c(j, d);
    }
    
    @e
    @Override
    public i<T> d(@e final g g, final int n, @e final n n2) {
        return m0.e((j0<? extends T>)this, g, n, n2);
    }
}
