// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import org.jetbrains.annotations.e;
import kotlinx.coroutines.w0;
import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007" }, d2 = { "Lkotlinx/coroutines/flow/internal/m;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class m extends CancellationException
{
    public m() {
        super("Child of the scoped flow was cancelled");
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
