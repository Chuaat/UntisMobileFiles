// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.ExecutorService;
import m6.g;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005¨\u0006\t" }, d2 = { "Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/v1;", "c", "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/v1;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/m0;", "b", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/m0;", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class y1
{
    @e
    public static final Executor a(@e final m0 m0) {
        m0 m2;
        if (!(m0 instanceof v1)) {
            m2 = null;
        }
        else {
            m2 = m0;
        }
        final v1 v1 = (v1)m2;
        if (v1 != null) {
            final Executor i = v1.M();
            if (i != null) {
                return i;
            }
        }
        return new h1(m0);
    }
    
    @g(name = "from")
    @e
    public static final m0 b(@e final Executor executor) {
        Executor executor2;
        if (!(executor instanceof h1)) {
            executor2 = null;
        }
        else {
            executor2 = executor;
        }
        final h1 h1 = (h1)executor2;
        if (h1 != null) {
            final m0 g = h1.G;
            if (g != null) {
                return g;
            }
        }
        return new x1(executor);
    }
    
    @g(name = "from")
    @e
    public static final v1 c(@e final ExecutorService executorService) {
        return new x1(executorService);
    }
}
