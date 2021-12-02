// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.f;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import java.util.concurrent.Executor;
import kotlinx.coroutines.v1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020\u001a\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b-\u0010.J#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\f\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001f\u001a\u00020\u001a8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0016\u0010$\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001cR \u0010'\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010+¨\u0006/" }, d2 = { "Lkotlinx/coroutines/scheduling/g;", "Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/scheduling/l;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "tailDispatch", "Lkotlin/j2;", "S", "(Ljava/lang/Runnable;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lkotlin/coroutines/g;", "context", "H", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "J", "", "toString", "()Ljava/lang/String;", "k", "", "M", "I", "t", "()I", "taskMode", "Lkotlinx/coroutines/scheduling/e;", "Lkotlinx/coroutines/scheduling/e;", "dispatcher", "K", "parallelism", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "L", "Ljava/lang/String;", "name", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lkotlinx/coroutines/scheduling/e;ILjava/lang/String;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class g extends v1 implements l, Executor
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater N;
    private final ConcurrentLinkedQueue<Runnable> I;
    private final e J;
    private final int K;
    private final String L;
    private final int M;
    private volatile /* synthetic */ int inFlightTasks;
    
    static {
        N = AtomicIntegerFieldUpdater.newUpdater(g.class, "inFlightTasks");
    }
    
    public g(@org.jetbrains.annotations.e final e j, final int k, @f final String l, final int m) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.I = new ConcurrentLinkedQueue<Runnable>();
        this.inFlightTasks = 0;
    }
    
    private final void S(Runnable e, final boolean b) {
        while (true) {
            final AtomicIntegerFieldUpdater n = g.N;
            if (n.incrementAndGet(this) <= this.K) {
                this.J.a0(e, this, b);
                return;
            }
            this.I.add(e);
            if (n.decrementAndGet(this) >= this.K) {
                return;
            }
            e = this.I.poll();
            if (e != null) {
                continue;
            }
        }
    }
    
    @Override
    public void H(@org.jetbrains.annotations.e final kotlin.coroutines.g g, @org.jetbrains.annotations.e final Runnable runnable) {
        this.S(runnable, false);
    }
    
    @Override
    public void J(@org.jetbrains.annotations.e final kotlin.coroutines.g g, @org.jetbrains.annotations.e final Runnable runnable) {
        this.S(runnable, true);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Executor M() {
        return this;
    }
    
    @Override
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }
    
    @Override
    public void execute(@org.jetbrains.annotations.e final Runnable runnable) {
        this.S(runnable, false);
    }
    
    @Override
    public void k() {
        final Runnable runnable = this.I.poll();
        if (runnable != null) {
            this.J.a0(runnable, this, true);
            return;
        }
        g.N.decrementAndGet(this);
        final Runnable runnable2 = this.I.poll();
        if (runnable2 != null) {
            this.S(runnable2, true);
        }
    }
    
    @Override
    public int t() {
        return this.M;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        String s = this.L;
        if (s == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[dispatcher = ");
            sb.append(this.J);
            sb.append(']');
            s = sb.toString();
        }
        return s;
    }
}
