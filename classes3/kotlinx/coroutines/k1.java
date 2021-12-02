// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/k1;", "Lkotlinx/coroutines/l1;", "Lkotlin/j2;", "dispose", "", "toString", "Ljava/util/concurrent/Future;", "G", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class k1 implements l1
{
    private final Future<?> G;
    
    public k1(@e final Future<?> g) {
        this.G = g;
    }
    
    @Override
    public void dispose() {
        this.G.cancel(false);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DisposableFutureHandle[");
        sb.append(this.G);
        sb.append(']');
        return sb.toString();
    }
}
