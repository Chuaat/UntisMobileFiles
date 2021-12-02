// 
// Decompiled by Procyon v0.5.36
// 

package g6;

import kotlin.internal.f;
import kotlin.e1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b\u001a\u0017\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b*\u001a\b\u0007\u0010\u000b\"\u00020\u00042\u00020\u0004B\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¨\u0006\f" }, d2 = { "", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "a", "b", "Lkotlin/e1;", "version", "1.4", "CancellationException", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    @e1(version = "1.4")
    @f
    private static final CancellationException a(final String message, final Throwable cause) {
        final CancellationException ex = new CancellationException(message);
        ex.initCause(cause);
        return ex;
    }
    
    @e1(version = "1.4")
    @f
    private static final CancellationException b(final Throwable cause) {
        String string;
        if (cause != null) {
            string = cause.toString();
        }
        else {
            string = null;
        }
        final CancellationException ex = new CancellationException(string);
        ex.initCause(cause);
        return ex;
    }
}
