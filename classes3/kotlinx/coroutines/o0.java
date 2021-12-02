// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.m;
import kotlin.coroutines.g$c;
import kotlin.coroutines.a;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.g;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\u0086\b¨\u0006\r" }, d2 = { "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/j2;", "b", "originalException", "thrownException", "c", "Lkotlin/Function2;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class o0
{
    @e
    public static final CoroutineExceptionHandler a(@e final p<? super g, ? super Throwable, j2> p) {
        return new CoroutineExceptionHandler() {
            public void handleException(@e final g g, @e final Throwable t) {
                p.invoke((Object)g, (Object)t);
            }
        };
    }
    
    @f2
    public static final void b(@e final g g, @e final Throwable t) {
        try {
            final CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler)g.get((g$c)CoroutineExceptionHandler.s);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(g, t);
                return;
            }
            n0.a(g, t);
        }
        finally {
            final Throwable t2;
            n0.a(g, c(t, t2));
        }
    }
    
    @e
    public static final Throwable c(@e final Throwable t, @e final Throwable cause) {
        if (t == cause) {
            return t;
        }
        final RuntimeException ex = new RuntimeException("Exception while trying to handle coroutine exception", cause);
        m.a((Throwable)ex, t);
        return ex;
    }
}
