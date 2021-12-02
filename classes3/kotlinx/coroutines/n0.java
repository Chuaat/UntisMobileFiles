// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import java.util.Iterator;
import kotlin.sequences.p;
import java.util.ServiceLoader;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n" }, d2 = { "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/j2;", "a", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class n0
{
    private static final List<CoroutineExceptionHandler> a;
    
    static {
        a = p.V2(p.h((Iterator<? extends CoroutineExceptionHandler>)ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));
    }
    
    public static final void a(@e final g g, @e final Throwable t) {
        for (final CoroutineExceptionHandler coroutineExceptionHandler : n0.a) {
            try {
                coroutineExceptionHandler.handleException(g, t);
            }
            finally {
                final Thread currentThread = Thread.currentThread();
                final Throwable t2;
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, o0.c(t, t2));
            }
        }
        final Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, t);
    }
}
