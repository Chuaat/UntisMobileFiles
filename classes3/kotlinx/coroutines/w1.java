// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.coroutines.d;
import java.util.concurrent.Future;
import org.jetbrains.annotations.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b#\u0010\u0011J*\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u000f\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u001e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0016J$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010 \u001a\u00020\u001fH\u0016R\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u000b¨\u0006$" }, d2 = { "Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/c1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "Z", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "Lkotlin/j2;", "S", "W", "()V", "H", "Lkotlinx/coroutines/o;", "continuation", "e", "Lkotlinx/coroutines/l1;", "D", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "I", "removesFutureOnCancellation", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class w1 extends v1 implements c1
{
    private boolean I;
    
    private final void S(final g g, final RejectedExecutionException ex) {
        o2.g(g, u1.a("The task was rejected", ex));
    }
    
    private final ScheduledFuture<?> Z(final Runnable runnable, final g g, final long n) {
        final ScheduledFuture<?> scheduledFuture = null;
        ScheduledFuture<?> schedule;
        try {
            Executor m;
            if (!((m = this.M()) instanceof ScheduledExecutorService)) {
                m = null;
            }
            final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)m;
            schedule = scheduledFuture;
            if (scheduledExecutorService != null) {
                schedule = scheduledExecutorService.schedule(runnable, n, TimeUnit.MILLISECONDS);
            }
        }
        catch (RejectedExecutionException ex) {
            this.S(g, ex);
            schedule = scheduledFuture;
        }
        return schedule;
    }
    
    @e
    @Override
    public l1 D(final long n, @e final Runnable runnable, @e final g g) {
        ScheduledFuture<?> z;
        if (this.I) {
            z = this.Z(runnable, g, n);
        }
        else {
            z = null;
        }
        l1 d;
        if (z != null) {
            d = new k1(z);
        }
        else {
            d = y0.T.D(n, runnable, g);
        }
        return d;
    }
    
    @f
    @Override
    public Object F(final long n, @e final d<? super j2> d) {
        return c1.a.a(this, n, d);
    }
    
    @Override
    public void H(@e final g g, @e final Runnable runnable) {
        try {
            final Executor m = this.M();
            final w3 b = x3.b();
            Runnable c = null;
            Label_0036: {
                if (b != null) {
                    c = b.c(runnable);
                    if (c != null) {
                        break Label_0036;
                    }
                }
                c = runnable;
            }
            m.execute(c);
        }
        catch (RejectedExecutionException ex) {
            final w3 b2 = x3.b();
            if (b2 != null) {
                b2.e();
            }
            this.S(g, ex);
            i1.c().H(g, runnable);
        }
    }
    
    public final void W() {
        this.I = kotlinx.coroutines.internal.e.c(this.M());
    }
    
    @Override
    public void close() {
        Executor m;
        if (!((m = this.M()) instanceof ExecutorService)) {
            m = null;
        }
        final ExecutorService executorService = (ExecutorService)m;
        if (executorService != null) {
            executorService.shutdown();
        }
    }
    
    @Override
    public void e(final long n, @e final o<? super j2> o) {
        ScheduledFuture<?> z;
        if (this.I) {
            z = this.Z(new h3(this, o), ((d)o).getContext(), n);
        }
        else {
            z = null;
        }
        if (z != null) {
            o2.x(o, z);
            return;
        }
        y0.T.e(n, o);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof w1 && ((w1)o).M() == this.M();
    }
    
    @Override
    public int hashCode() {
        return System.identityHashCode(this.M());
    }
    
    @e
    @Override
    public String toString() {
        return this.M().toString();
    }
}
