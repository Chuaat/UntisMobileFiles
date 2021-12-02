// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlinx.coroutines.internal.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0014R\u0013\u0010\u0012\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0013\u0010\u001f\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0013\u0010!\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\f¨\u0006&" }, d2 = { "Lkotlinx/coroutines/p1;", "Lkotlinx/coroutines/m0;", "", "unconfined", "", "W", "i0", "j0", "m0", "Lkotlinx/coroutines/f1;", "task", "Lkotlin/j2;", "Z", "d0", "M", "shutdown", "h0", "()Z", "isUnconfinedQueueEmpty", "H", "J", "useCount", "f0", "isEmpty", "a0", "()J", "nextTime", "Lkotlinx/coroutines/internal/a;", "Lkotlinx/coroutines/internal/a;", "unconfinedQueue", "g0", "isUnconfinedLoopActive", "a", "isActive", "I", "shared", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class p1 extends m0
{
    private long H;
    private boolean I;
    private kotlinx.coroutines.internal.a<f1<?>> J;
    
    private final long W(final boolean b) {
        long n;
        if (b) {
            n = 4294967296L;
        }
        else {
            n = 1L;
        }
        return n;
    }
    
    public final void M(final boolean b) {
        final long h = this.H - this.W(b);
        this.H = h;
        if (h > 0L) {
            return;
        }
        if (w0.b() && this.H != 0L) {
            throw new AssertionError();
        }
        if (this.I) {
            this.shutdown();
        }
    }
    
    public final void Z(@e final f1<?> f1) {
        kotlinx.coroutines.internal.a<f1<?>> j = this.J;
        if (j == null) {
            j = new kotlinx.coroutines.internal.a<f1<?>>();
            this.J = j;
        }
        j.a(f1);
    }
    
    public final boolean a() {
        return this.H > 0L;
    }
    
    protected long a0() {
        final kotlinx.coroutines.internal.a<f1<?>> j = this.J;
        long n = Long.MAX_VALUE;
        if (j != null) {
            if (j.d()) {
                n = n;
            }
            else {
                n = 0L;
            }
        }
        return n;
    }
    
    public final void d0(final boolean b) {
        this.H += this.W(b);
        if (!b) {
            this.I = true;
        }
    }
    
    protected boolean f0() {
        return this.h0();
    }
    
    public final boolean g0() {
        final long h = this.H;
        boolean b = true;
        if (h < this.W(true)) {
            b = false;
        }
        return b;
    }
    
    public final boolean h0() {
        final kotlinx.coroutines.internal.a<f1<?>> j = this.J;
        return j == null || j.d();
    }
    
    public long i0() {
        if (!this.j0()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }
    
    public final boolean j0() {
        final kotlinx.coroutines.internal.a<f1<?>> j = this.J;
        if (j != null) {
            final f1<?> f1 = j.e();
            if (f1 != null) {
                f1.run();
                return true;
            }
        }
        return false;
    }
    
    public boolean m0() {
        return false;
    }
    
    protected void shutdown() {
    }
}
