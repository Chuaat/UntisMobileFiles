// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.jvm.internal.h0;
import n6.a;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000H\u0000\u001a,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00060\u0005j\u0002`\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0080\b\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\"\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015*\f\b\u0000\u0010\u0017\"\u00020\u00052\u00020\u0005¨\u0006\u0018" }, d2 = { "E", "", "Lkotlinx/coroutines/internal/SubscribersList;", "d", "T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Lkotlin/Function0;", "action", "e", "(Ljava/util/concurrent/locks/ReentrantLock;Ln6/a;)Ljava/lang/Object;", "", "expectedSize", "", "b", "Ljava/util/concurrent/Executor;", "executor", "", "c", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "REMOVE_FUTURE_ON_CANCEL", "ReentrantLock", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class e
{
    private static final Method a;
    
    static {
        Method a2;
        try {
            ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        }
        finally {
            a2 = null;
        }
        a = a2;
    }
    
    @org.jetbrains.annotations.e
    public static final <E> Set<E> b(final int expectedMaxSize) {
        return Collections.newSetFromMap(new IdentityHashMap<E, Boolean>(expectedMaxSize));
    }
    
    public static final boolean c(@org.jetbrains.annotations.e final Executor executor) {
        Executor executor2 = executor;
        try {
            if (!(executor instanceof ScheduledThreadPoolExecutor)) {
                executor2 = null;
            }
            final ScheduledThreadPoolExecutor obj = (ScheduledThreadPoolExecutor)executor2;
            if (obj != null) {
                final Method a = e.a;
                if (a != null) {
                    a.invoke(obj, Boolean.TRUE);
                    return true;
                }
            }
            return false;
        }
        finally {
            return false;
        }
    }
    
    @org.jetbrains.annotations.e
    public static final <E> List<E> d() {
        return new CopyOnWriteArrayList<E>();
    }
    
    public static final <T> T e(@org.jetbrains.annotations.e final ReentrantLock reentrantLock, @org.jetbrains.annotations.e final a<? extends T> a) {
        reentrantLock.lock();
        try {
            return (T)a.invoke();
        }
        finally {
            h0.d(1);
            reentrantLock.unlock();
            h0.c(1);
        }
    }
}
