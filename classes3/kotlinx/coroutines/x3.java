// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0081\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\u0081\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\t\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\n\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0081\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a" }, d2 = { "", "a", "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "k", "Lkotlin/j2;", "g", "h", "e", "j", "", "blocker", "nanos", "d", "Ljava/lang/Thread;", "thread", "i", "Lkotlinx/coroutines/w3;", "Lkotlinx/coroutines/w3;", "b", "()Lkotlinx/coroutines/w3;", "f", "(Lkotlinx/coroutines/w3;)V", "timeSource", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class x3
{
    @f
    private static w3 a;
    
    @kotlin.internal.f
    private static final long a() {
        final w3 b = b();
        long n;
        if (b != null) {
            n = b.a();
        }
        else {
            n = System.currentTimeMillis();
        }
        return n;
    }
    
    @f
    public static final w3 b() {
        return x3.a;
    }
    
    @kotlin.internal.f
    private static final long c() {
        final w3 b = b();
        long n;
        if (b != null) {
            n = b.b();
        }
        else {
            n = System.nanoTime();
        }
        return n;
    }
    
    @kotlin.internal.f
    private static final void d(final Object blocker, final long nanos) {
        final w3 b = b();
        if (b != null) {
            b.g(blocker, nanos);
        }
        else {
            LockSupport.parkNanos(blocker, nanos);
        }
    }
    
    @kotlin.internal.f
    private static final void e() {
        final w3 b = b();
        if (b != null) {
            b.d();
        }
    }
    
    public static final void f(@f final w3 a) {
        x3.a = a;
    }
    
    @kotlin.internal.f
    private static final void g() {
        final w3 b = b();
        if (b != null) {
            b.i();
        }
    }
    
    @kotlin.internal.f
    private static final void h() {
        final w3 b = b();
        if (b != null) {
            b.e();
        }
    }
    
    @kotlin.internal.f
    private static final void i(final Thread thread) {
        final w3 b = b();
        if (b != null) {
            b.f(thread);
        }
        else {
            LockSupport.unpark(thread);
        }
    }
    
    @kotlin.internal.f
    private static final void j() {
        final w3 b = b();
        if (b != null) {
            b.h();
        }
    }
    
    @kotlin.internal.f
    private static final Runnable k(final Runnable runnable) {
        final w3 b = b();
        Runnable runnable2 = runnable;
        if (b != null) {
            final Runnable c = b.c(runnable);
            runnable2 = runnable;
            if (c != null) {
                runnable2 = c;
            }
        }
        return runnable2;
    }
}
