// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n" }, d2 = { "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/w1;", "Ljava/util/concurrent/Executor;", "J", "Ljava/util/concurrent/Executor;", "M", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class x1 extends w1
{
    @e
    private final Executor J;
    
    public x1(@e final Executor j) {
        this.J = j;
        this.W();
    }
    
    @e
    @Override
    public Executor M() {
        return this.J;
    }
}
