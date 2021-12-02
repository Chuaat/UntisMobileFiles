// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0014@\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n" }, d2 = { "Lkotlinx/coroutines/g;", "Lkotlinx/coroutines/q1;", "Ljava/lang/Thread;", "M", "Ljava/lang/Thread;", "p0", "()Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class g extends q1
{
    @e
    private final Thread M;
    
    public g(@e final Thread m) {
        this.M = m;
    }
    
    @e
    @Override
    protected Thread p0() {
        return this.M;
    }
}
