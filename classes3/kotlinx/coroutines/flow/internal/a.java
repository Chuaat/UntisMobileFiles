// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.w0;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.flow.j;
import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/flow/internal/a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "Lkotlinx/coroutines/flow/j;", "G", "Lkotlinx/coroutines/flow/j;", "a", "()Lkotlinx/coroutines/flow/j;", "owner", "<init>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class a extends CancellationException
{
    @e
    private final j<?> G;
    
    public a(@e final j<?> g) {
        super("Flow was aborted, no more elements needed");
        this.G = g;
    }
    
    @e
    public final j<?> a() {
        return this.G;
    }
    
    @e
    @Override
    public Throwable fillInStackTrace() {
        if (w0.d()) {
            return super.fillInStackTrace();
        }
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
