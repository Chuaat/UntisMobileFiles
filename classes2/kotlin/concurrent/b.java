// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.concurrent;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.internal.f;
import n6.a;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aJ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u001a5\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014" }, d2 = { "", "start", "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "Lkotlin/j2;", "block", "Ljava/lang/Thread;", "b", "", "T", "Ljava/lang/ThreadLocal;", "default", "a", "(Ljava/lang/ThreadLocal;Ln6/a;)Ljava/lang/Object;", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "ThreadsKt")
public final class b
{
    @f
    private static final <T> T a(final ThreadLocal<T> threadLocal, final a<? extends T> a) {
        final T value = threadLocal.get();
        T t;
        if (value != null) {
            t = value;
        }
        else {
            final T invoke = (T)a.invoke();
            threadLocal.set(invoke);
            t = invoke;
        }
        return t;
    }
    
    @e
    public static final Thread b(final boolean b, final boolean b2, @org.jetbrains.annotations.f final ClassLoader contextClassLoader, @org.jetbrains.annotations.f final String name, final int priority, @e final a<j2> a) {
        k0.p(a, "block");
        final Thread thread = new Thread() {
            @Override
            public void run() {
                a.invoke();
            }
        };
        if (b2) {
            thread.setDaemon(true);
        }
        if (priority > 0) {
            thread.setPriority(priority);
        }
        if (name != null) {
            thread.setName(name);
        }
        if (contextClassLoader != null) {
            thread.setContextClassLoader(contextClassLoader);
        }
        if (b) {
            thread.start();
        }
        return thread;
    }
}
