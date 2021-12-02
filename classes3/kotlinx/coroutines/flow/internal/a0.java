// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.f2;
import kotlin.Metadata;
import kotlinx.coroutines.flow.j;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/flow/internal/a0;", "T", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/j2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/l0;", "G", "Lkotlinx/coroutines/channels/l0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/l0;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public final class a0<T> implements j<T>
{
    private final l0<T> G;
    
    public a0(@e final l0<? super T> g) {
        this.G = (l0<T>)g;
    }
    
    @f
    @Override
    public Object b(final T t, @e final d<? super j2> d) {
        final Object u = this.G.U(t, d);
        if (u == b.h()) {
            return u;
        }
        return j2.a;
    }
}
