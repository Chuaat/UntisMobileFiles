// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00038\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012" }, d2 = { "Lkotlinx/coroutines/scheduling/k;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "b", "()I", "mode", "", "G", "J", "submissionTime", "Lkotlinx/coroutines/scheduling/l;", "H", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "<init>", "(JLkotlinx/coroutines/scheduling/l;)V", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class k implements Runnable
{
    @d
    public long G;
    @d
    @e
    public l H;
    
    public k() {
        this(0L, i.H);
    }
    
    public k(final long g, @e final l h) {
        this.G = g;
        this.H = h;
    }
    
    public final int b() {
        return this.H.t();
    }
}
