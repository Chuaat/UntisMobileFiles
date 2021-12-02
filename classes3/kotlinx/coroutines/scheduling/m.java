// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.x0;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011" }, d2 = { "Lkotlinx/coroutines/scheduling/m;", "Lkotlinx/coroutines/scheduling/k;", "Lkotlin/j2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "I", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class m extends k
{
    @d
    @e
    public final Runnable I;
    
    public m(@e final Runnable i, final long n, @e final l l) {
        super(n, l);
        this.I = i;
    }
    
    @Override
    public void run() {
        try {
            this.I.run();
        }
        finally {
            super.H.k();
        }
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        sb.append(x0.a(this.I));
        sb.append('@');
        sb.append(x0.b(this.I));
        sb.append(", ");
        sb.append(super.G);
        sb.append(", ");
        sb.append(super.H);
        sb.append(']');
        return sb.toString();
    }
}
