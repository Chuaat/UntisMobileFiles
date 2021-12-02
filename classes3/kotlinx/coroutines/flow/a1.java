// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f¢\u0006\u0002\b\u0012\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016" }, d2 = { "Lkotlinx/coroutines/flow/a1;", "T", "Lkotlinx/coroutines/flow/j0;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "G", "Lkotlinx/coroutines/flow/j0;", "sharedFlow", "", "a", "()Ljava/util/List;", "replayCache", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "action", "<init>", "(Lkotlinx/coroutines/flow/j0;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class a1<T> implements j0<T>
{
    private final j0<T> G;
    private final p<j<? super T>, d<? super j2>, Object> H;
    
    public a1(@e final j0<? extends T> g, @e final p<? super j<? super T>, ? super d<? super j2>, ?> h) {
        this.G = (j0<T>)g;
        this.H = (p<j<? super T>, d<? super j2>, Object>)h;
    }
    
    @e
    @Override
    public List<T> a() {
        return this.G.a();
    }
    
    @f
    @Override
    public Object c(@e final j<? super T> j, @e final d<? super j2> d) {
        final Object c = this.G.c(new z0<Object>((j<? super Object>)j, this.H), d);
        if (c == b.h()) {
            return c;
        }
        return j2.a;
    }
}
