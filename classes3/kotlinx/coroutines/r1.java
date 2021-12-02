// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0004R\u0016\u0010\f\u001a\u00020\t8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/p1;", "Lkotlin/j2;", "w0", "", "now", "Lkotlinx/coroutines/q1$c;", "delayedTask", "s0", "Ljava/lang/Thread;", "p0", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class r1 extends p1
{
    @e
    protected abstract Thread p0();
    
    protected final void s0(final long n, @e final q1.c c) {
        if (w0.b() && this == y0.T) {
            throw new AssertionError();
        }
        y0.T.W0(n, c);
    }
    
    protected final void w0() {
        final Thread p0 = this.p0();
        if (Thread.currentThread() != p0) {
            final w3 b = x3.b();
            if (b != null) {
                b.f(p0);
            }
            else {
                LockSupport.unpark(p0);
            }
        }
    }
}
