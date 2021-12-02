// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.m;
import org.jetbrains.annotations.e;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0080\b*\n\u0010\n\"\u00020\u00042\u00020\u0004¨\u0006\u000b" }, d2 = { "", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "a", "other", "Lkotlin/j2;", "b", "CancellationException", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class u1
{
    @e
    public static final CancellationException a(@f final String message, @f final Throwable cause) {
        final CancellationException ex = new CancellationException(message);
        ex.initCause(cause);
        return ex;
    }
    
    public static final void b(@e final Throwable t, @e final Throwable t2) {
        m.a(t, t2);
    }
}
