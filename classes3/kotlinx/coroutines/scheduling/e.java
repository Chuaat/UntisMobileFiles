// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.y0;
import kotlin.coroutines.g;
import kotlinx.coroutines.m0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.f2;
import kotlin.Metadata;
import kotlinx.coroutines.v1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\u0006\u0010*\u001a\u00020\u000f\u0012\u0006\u0010'\u001a\u00020\u001b\u0012\b\b\u0002\u0010\"\u001a\u00020\r¢\u0006\u0004\b.\u0010/B'\b\u0016\u0012\b\b\u0002\u0010(\u001a\u00020\u000f\u0012\b\b\u0002\u0010*\u001a\u00020\u000f\u0012\b\b\u0002\u0010\"\u001a\u00020\r¢\u0006\u0004\b.\u00100B\u001d\b\u0017\u0012\b\b\u0002\u0010(\u001a\u00020\u000f\u0012\b\b\u0002\u0010*\u001a\u00020\u000f¢\u0006\u0004\b.\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ+\u0010\u0017\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u001aR\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0016\u0010-\u001a\u00020+8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010,¨\u00062" }, d2 = { "Lkotlinx/coroutines/scheduling/e;", "Lkotlinx/coroutines/v1;", "Lkotlinx/coroutines/scheduling/a;", "Z", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/j2;", "H", "J", "close", "", "toString", "", "parallelism", "Lkotlinx/coroutines/m0;", "S", "d0", "Lkotlinx/coroutines/scheduling/l;", "", "tailDispatch", "a0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "g0", "()V", "", "timeout", "f0", "(J)V", "e0", "M", "Ljava/lang/String;", "schedulerName", "I", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "L", "idleWorkerKeepAliveNs", "corePoolSize", "K", "maxPoolSize", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public class e extends v1
{
    private kotlinx.coroutines.scheduling.a I;
    private final int J;
    private final int K;
    private final long L;
    private final String M;
    
    public e(final int j, final int k, final long l, @org.jetbrains.annotations.e final String m) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.I = this.Z();
    }
    
    public e(final int n, final int n2, @org.jetbrains.annotations.e final String s) {
        this(n, n2, n.g, s);
    }
    
    private final kotlinx.coroutines.scheduling.a Z() {
        return new kotlinx.coroutines.scheduling.a(this.J, this.K, this.L, this.M);
    }
    
    @Override
    public void H(@org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final Runnable runnable) {
        try {
            kotlinx.coroutines.scheduling.a.w(this.I, runnable, null, false, 6, null);
        }
        catch (RejectedExecutionException ex) {
            y0.T.H(g, runnable);
        }
    }
    
    @Override
    public void J(@org.jetbrains.annotations.e final g g, @org.jetbrains.annotations.e final Runnable runnable) {
        try {
            kotlinx.coroutines.scheduling.a.w(this.I, runnable, null, true, 2, null);
        }
        catch (RejectedExecutionException ex) {
            y0.T.J(g, runnable);
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Executor M() {
        return this.I;
    }
    
    @org.jetbrains.annotations.e
    public final m0 S(final int i) {
        if (i > 0) {
            return new kotlinx.coroutines.scheduling.g(this, i, null, 1);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected positive parallelism level, but have ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final void a0(@org.jetbrains.annotations.e final Runnable runnable, @org.jetbrains.annotations.e final l l, final boolean b) {
        try {
            this.I.t(runnable, l, b);
        }
        catch (RejectedExecutionException ex) {
            y0.T.L0(this.I.n(runnable, l));
        }
    }
    
    @Override
    public void close() {
        this.I.close();
    }
    
    @org.jetbrains.annotations.e
    public final m0 d0(final int n) {
        final int n2 = 1;
        if (n <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected positive parallelism level, but have ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n3;
        if (n <= this.J) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            return new kotlinx.coroutines.scheduling.g(this, n, null, 0);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected parallelism level lesser than core pool size (");
        sb2.append(this.J);
        sb2.append("), but have ");
        sb2.append(n);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public final void e0() {
        this.g0();
    }
    
    public final void f0(final long n) {
        synchronized (this) {
            this.I.M(n);
        }
    }
    
    public final void g0() {
        synchronized (this) {
            this.I.M(1000L);
            this.I = this.Z();
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[scheduler = ");
        sb.append(this.I);
        sb.append(']');
        return sb.toString();
    }
}
