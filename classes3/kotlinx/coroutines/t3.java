// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.ExecutorService;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u00020\u00118\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0018" }, d2 = { "Lkotlinx/coroutines/t3;", "Lkotlinx/coroutines/w1;", "Lkotlin/j2;", "close", "", "toString", "Ljava/util/concurrent/atomic/AtomicInteger;", "J", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNo", "", "L", "I", "nThreads", "M", "Ljava/lang/String;", "name", "Ljava/util/concurrent/Executor;", "K", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(ILjava/lang/String;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class t3 extends w1
{
    private final AtomicInteger J;
    @e
    private final Executor K;
    private final int L;
    private final String M;
    
    public t3(final int n, @e final String m) {
        this.L = n;
        this.M = m;
        this.J = new AtomicInteger();
        this.K = Executors.newScheduledThreadPool(n, new ThreadFactory() {
            final /* synthetic */ t3 G;
            
            @Override
            public final Thread newThread(final Runnable runnable) {
                final t3 g = this.G;
                String s;
                if (t3.a0(g) == 1) {
                    s = t3.d0(this.G);
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(t3.d0(this.G));
                    sb.append("-");
                    sb.append(t3.e0(this.G).incrementAndGet());
                    s = sb.toString();
                }
                return new d3(g, runnable, s);
            }
        });
        this.W();
    }
    
    public static final /* synthetic */ int a0(final t3 t3) {
        return t3.L;
    }
    
    public static final /* synthetic */ String d0(final t3 t3) {
        return t3.M;
    }
    
    public static final /* synthetic */ AtomicInteger e0(final t3 t3) {
        return t3.J;
    }
    
    @e
    @Override
    public Executor M() {
        return this.K;
    }
    
    @Override
    public void close() {
        final Executor m = this.M();
        Objects.requireNonNull(m, "null cannot be cast to non-null type java.util.concurrent.ExecutorService");
        ((ExecutorService)m).shutdown();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ThreadPoolDispatcher[");
        sb.append(this.L);
        sb.append(", ");
        sb.append(this.M);
        sb.append(']');
        return sb.toString();
    }
}
