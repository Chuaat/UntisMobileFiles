// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0094@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015" }, d2 = { "Lkotlinx/coroutines/flow/internal/j;", "T", "Lkotlinx/coroutines/flow/internal/i;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/f;", "k", "Lkotlinx/coroutines/flow/i;", "m", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "t", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "flow", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class j<T> extends i<T, T>
{
    public j(@e final kotlinx.coroutines.flow.i<? extends T> i, @e final g g, final int n, @e final n n2) {
        super(i, g, n, n2);
    }
    
    @e
    @Override
    protected f<T> k(@e final g g, final int n, @e final n n2) {
        return (f<T>)new j(super.J, g, n, n2);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public kotlinx.coroutines.flow.i<T> m() {
        return (kotlinx.coroutines.flow.i<T>)super.J;
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object t(@e final kotlinx.coroutines.flow.j<? super T> j, @e final d<? super j2> d) {
        final Object c = super.J.c(j, d);
        if (c == b.h()) {
            return c;
        }
        return j2.a;
    }
}
