// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlin.coroutines.g;
import kotlinx.coroutines.channels.n;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "Lkotlinx/coroutines/flow/p0;", "T", "", "Lkotlin/coroutines/g;", "d", "Lkotlin/coroutines/g;", "context", "", "b", "I", "extraBufferCapacity", "Lkotlinx/coroutines/flow/i;", "a", "Lkotlinx/coroutines/flow/i;", "upstream", "Lkotlinx/coroutines/channels/n;", "c", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/i;ILkotlinx/coroutines/channels/n;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class p0<T>
{
    @d
    @e
    public final i<T> a;
    @d
    public final int b;
    @d
    @e
    public final n c;
    @d
    @e
    public final g d;
    
    public p0(@e final i<? extends T> a, final int b, @e final n c, @e final g d) {
        this.a = (i<T>)a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
