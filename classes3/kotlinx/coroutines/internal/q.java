// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\".\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00028\u00c0\u0002@\u00c0\u0002X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlinx/coroutines/internal/LocalAtomicInt;", "", "value", "a", "(Ljava/util/concurrent/atomic/AtomicInteger;)I", "b", "(Ljava/util/concurrent/atomic/AtomicInteger;I)V", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class q
{
    public static final int a(@e final AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }
    
    public static final void b(@e final AtomicInteger atomicInteger, final int newValue) {
        atomicInteger.set(newValue);
    }
}
