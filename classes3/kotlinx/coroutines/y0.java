// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.ranges.o;
import kotlin.coroutines.g;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u00c0\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b5\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u000f\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0013R\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010)\u001a\u00020\u00068B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001cR\u0016\u0010-\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0016\u00100\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u001a8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u0016\u00104\u001a\u00020\u00068@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010(¨\u00066" }, d2 = { "Lkotlinx/coroutines/y0;", "Lkotlinx/coroutines/q1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Thread;", "g1", "", "t1", "Lkotlin/j2;", "f1", "", "timeMillis", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/l1;", "D", "run", "k1", "()V", "timeout", "v1", "", "M", "Ljava/lang/String;", "THREAD_NAME", "", "Q", "I", "ACTIVE", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "debugStatus", "N", "J", "DEFAULT_KEEP_ALIVE", "O", "KEEP_ALIVE_NANOS", "p1", "()Z", "isShutdownRequested", "S", "SHUTDOWN_ACK", "P", "FRESH", "p0", "()Ljava/lang/Thread;", "thread", "R", "SHUTDOWN_REQ", "q1", "isThreadPresent", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class y0 extends q1 implements Runnable
{
    @e
    public static final String M = "kotlinx.coroutines.DefaultExecutor";
    private static final long N = 1000L;
    private static final long O;
    private static final int P = 0;
    private static final int Q = 1;
    private static final int R = 2;
    private static final int S = 3;
    @e
    public static final y0 T;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    
    static {
        p1.e0(T = new y0(), false, 1, null);
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        Long n;
        try {
            n = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (SecurityException ex) {
            n = 1000L;
        }
        O = milliseconds.toNanos(n);
    }
    
    private y0() {
    }
    
    private final void f1() {
        synchronized (this) {
            if (!this.p1()) {
                return;
            }
            y0.debugStatus = 3;
            this.Q0();
            this.notifyAll();
        }
    }
    
    private final Thread g1() {
        synchronized (this) {
            Thread thread = y0._thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                (y0._thread = thread).setDaemon(true);
                thread.start();
            }
            return thread;
        }
    }
    
    private final boolean p1() {
        final int debugStatus = y0.debugStatus;
        return debugStatus == 2 || debugStatus == 3;
    }
    
    private final boolean t1() {
        synchronized (this) {
            if (this.p1()) {
                return false;
            }
            y0.debugStatus = 1;
            this.notifyAll();
            return true;
        }
    }
    
    @e
    @Override
    public l1 D(final long n, @e final Runnable runnable, @e final g g) {
        return this.a1(n, runnable);
    }
    
    public final void k1() {
        synchronized (this) {
            final boolean b = w0.b();
            final boolean b2 = true;
            if (b && y0._thread != null) {
                throw new AssertionError();
            }
            if (w0.b()) {
                int n = b2 ? 1 : 0;
                if (y0.debugStatus != 0) {
                    if (y0.debugStatus == 3) {
                        n = (b2 ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                }
                if (n == 0) {
                    throw new AssertionError();
                }
            }
            y0.debugStatus = 0;
            this.g1();
            while (y0.debugStatus == 0) {
                this.wait();
            }
        }
    }
    
    @e
    @Override
    protected Thread p0() {
        Thread thread = y0._thread;
        if (thread == null) {
            thread = this.g1();
        }
        return thread;
    }
    
    public final boolean q1() {
        return y0._thread != null;
    }
    
    @Override
    public void run() {
        s3.b.d(this);
        final w3 b = x3.b();
        if (b != null) {
            b.d();
        }
        try {
            if (!this.t1()) {
                return;
            }
            long n = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                final long i0 = this.i0();
                long n3;
                long v;
                if (i0 == Long.MAX_VALUE) {
                    final w3 b2 = x3.b();
                    long n2;
                    if (b2 != null) {
                        n2 = b2.b();
                    }
                    else {
                        n2 = System.nanoTime();
                    }
                    n3 = n;
                    if (n == Long.MAX_VALUE) {
                        n3 = y0.O + n2;
                    }
                    final long n4 = n3 - n2;
                    if (n4 <= 0L) {
                        return;
                    }
                    v = o.v(i0, n4);
                }
                else {
                    n3 = Long.MAX_VALUE;
                    v = i0;
                }
                n = n3;
                if (v > 0L) {
                    if (this.p1()) {
                        return;
                    }
                    final w3 b3 = x3.b();
                    if (b3 != null) {
                        b3.g(this, v);
                        n = n3;
                    }
                    else {
                        LockSupport.parkNanos(this, v);
                        n = n3;
                    }
                }
            }
        }
        finally {
            y0._thread = null;
            this.f1();
            final w3 b4 = x3.b();
            if (b4 != null) {
                b4.h();
            }
            if (!this.f0()) {
                this.p0();
            }
        }
    }
    
    public final void v1(final long n) {
        synchronized (this) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (!this.p1()) {
                y0.debugStatus = 2;
            }
            while (y0.debugStatus != 3 && y0._thread != null) {
                final Thread thread = y0._thread;
                if (thread != null) {
                    final w3 b = x3.b();
                    if (b != null) {
                        b.f(thread);
                    }
                    else {
                        LockSupport.unpark(thread);
                    }
                }
                if (currentTimeMillis + n - System.currentTimeMillis() <= 0L) {
                    break;
                }
                this.wait(n);
            }
            y0.debugStatus = 0;
        }
    }
}
