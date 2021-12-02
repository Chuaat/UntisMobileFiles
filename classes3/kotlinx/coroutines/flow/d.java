// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import kotlinx.coroutines.o2;
import kotlin.j2;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e" }, d2 = { "Lkotlinx/coroutines/flow/d;", "T", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", "G", "Lkotlinx/coroutines/flow/i;", "flow", "<init>", "(Lkotlinx/coroutines/flow/i;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class d<T> implements c<T>
{
    private final i<T> G;
    
    public d(@e final i<? extends T> g) {
        this.G = (i<T>)g;
    }
    
    @f
    @Override
    public Object c(@e final j<? super T> j, @e final kotlin.coroutines.d<? super j2> d) {
        final Object c = this.G.c(new j<T>() {
            @f
            @Override
            public Object b(Object b, @e final kotlin.coroutines.d d) {
                o2.A(d.getContext());
                b = j.b(b, d);
                if (b == b.h()) {
                    return b;
                }
                return j2.a;
            }
        }, d);
        if (c == b.h()) {
            return c;
        }
        return j2.a;
    }
}
