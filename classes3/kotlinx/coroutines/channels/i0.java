// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import org.jetbrains.annotations.e;
import kotlinx.coroutines.internal.k0;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.internal.t;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010" }, d2 = { "Lkotlinx/coroutines/channels/i0;", "E", "", "value", "Lkotlinx/coroutines/internal/t$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "otherOp", "Lkotlinx/coroutines/internal/k0;", "b0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/t$d;)Lkotlinx/coroutines/internal/k0;", "Lkotlin/j2;", "A", "(Ljava/lang/Object;)V", "j", "()Ljava/lang/Object;", "offerResult", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface i0<E>
{
    void A(final E p0);
    
    @f
    k0 b0(final E p0, @f final t.d p1);
    
    @e
    Object j();
}
