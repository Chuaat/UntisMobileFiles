// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import kotlin.j2;
import kotlinx.coroutines.x0;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.w3;
import kotlinx.coroutines.x3;
import kotlinx.coroutines.w0;
import java.util.concurrent.locks.LockSupport;
import kotlin.ranges.o;
import kotlin.jvm.internal.w;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.e;
import m6.d;
import kotlinx.coroutines.internal.k0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import java.io.Closeable;
import java.util.concurrent.Executor;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0003\\]^B+\u0012\u0006\u0010H\u001a\u00020\f\u0012\u0006\u0010I\u001a\u00020\f\u0012\b\b\u0002\u0010X\u001a\u00020\u000f\u0012\b\b\u0002\u0010T\u001a\u00020B¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0015J+\u0010'\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b0\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010GR\u0016\u0010I\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010GR\u0016\u0010L\u001a\u00020J8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010KR\u0017\u0010N\u001a\u00020\f8\u00c2\u0002@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0015R\u0016\u0010O\u001a\u00020J8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\"\u0010R\u001a\u000e\u0012\n\u0012\b\u0018\u00010\bR\u00020\u00000P8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010QR\u0016\u0010T\u001a\u00020B8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010SR\u0013\u0010U\u001a\u00020\u00058F@\u0006¢\u0006\u0006\u001a\u0004\bU\u0010\u001dR\u0017\u0010W\u001a\u00020\f8\u00c2\u0002@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0015R\u0016\u0010X\u001a\u00020\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010,¨\u0006_" }, d2 = { "Lkotlinx/coroutines/scheduling/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/k;", "task", "", "g", "(Lkotlinx/coroutines/scheduling/k;)Z", "Lkotlinx/coroutines/scheduling/a$b;", "G", "()Lkotlinx/coroutines/scheduling/a$b;", "worker", "", "F", "(Lkotlinx/coroutines/scheduling/a$b;)I", "", "state", "o", "(J)I", "j", "D", "()I", "s", "C", "()J", "Lkotlin/j2;", "r", "()V", "S", "()Z", "K", "skipUnpark", "N", "(Z)V", "T", "(J)Z", "W", "k", "tailDispatch", "R", "(Lkotlinx/coroutines/scheduling/a$b;Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;", "q", "oldIndex", "newIndex", "J", "(Lkotlinx/coroutines/scheduling/a$b;II)V", "H", "(Lkotlinx/coroutines/scheduling/a$b;)Z", "h", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "timeout", "M", "(J)V", "block", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "t", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "n", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;)Lkotlinx/coroutines/scheduling/k;", "Q", "", "toString", "()Ljava/lang/String;", "L", "(Lkotlinx/coroutines/scheduling/k;)V", "I", "corePoolSize", "maxPoolSize", "Lkotlinx/coroutines/scheduling/f;", "Lkotlinx/coroutines/scheduling/f;", "globalBlockingQueue", "x", "availableCpuPermits", "globalCpuQueue", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "workers", "Ljava/lang/String;", "schedulerName", "isTerminated", "y", "createdWorkers", "idleWorkerKeepAliveNs", "<init>", "(IIJLjava/lang/String;)V", "e0", "a", "b", "c", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class a implements Executor, Closeable
{
    private static final /* synthetic */ AtomicLongFieldUpdater N;
    static final /* synthetic */ AtomicLongFieldUpdater O;
    private static final /* synthetic */ AtomicIntegerFieldUpdater P;
    @d
    @e
    public static final k0 Q;
    private static final int R = -1;
    private static final int S = 0;
    private static final int T = 1;
    private static final int U = 21;
    private static final long V = 2097151L;
    private static final long W = 4398044413952L;
    private static final int X = 42;
    private static final long Y = 9223367638808264704L;
    public static final int Z = 1;
    public static final int a0 = 2097150;
    private static final long b0 = 2097151L;
    private static final long c0 = -2097152L;
    private static final long d0 = 2097152L;
    @e
    public static final a e0;
    @d
    @e
    public final f G;
    @d
    @e
    public final f H;
    @d
    @e
    public final AtomicReferenceArray<b> I;
    @d
    public final int J;
    @d
    public final int K;
    @d
    public final long L;
    @d
    @e
    public final String M;
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;
    
    static {
        e0 = new a(null);
        Q = new k0("NOT_IN_STACK");
        N = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
        O = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
        P = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    }
    
    public a(final int i, final int j, final long n, @e final String m) {
        this.J = i;
        this.K = j;
        this.L = n;
        this.M = m;
        if (i < 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Core pool size ");
            sb.append(i);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (j < i) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Max pool size ");
            sb2.append(j);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (j > 2097150) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Max pool size ");
            sb3.append(j);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (n > 0L) {
            this.G = new f();
            this.H = new f();
            this.parkedWorkersStack = 0L;
            this.I = new AtomicReferenceArray<b>(j + 1);
            this.controlState = (long)i << 42;
            this._isTerminated = 0;
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Idle worker keep alive time ");
        sb4.append(n);
        sb4.append(" must be positive");
        throw new IllegalArgumentException(sb4.toString().toString());
    }
    
    private final long C() {
        return a.O.addAndGet(this, 2097152L);
    }
    
    private final int D() {
        return (int)(a.O.incrementAndGet(this) & 0x1FFFFFL);
    }
    
    private final int F(b b) {
        int i;
        do {
            final Object g = b.g();
            if (g == a.Q) {
                return -1;
            }
            if (g == null) {
                return 0;
            }
            b = (b)g;
            i = b.f();
        } while (i == 0);
        return i;
    }
    
    private final b G() {
        while (true) {
            final long parkedWorkersStack = this.parkedWorkersStack;
            final b b = this.I.get((int)(0x1FFFFFL & parkedWorkersStack));
            if (b == null) {
                return null;
            }
            final int f = this.F(b);
            if (f < 0) {
                continue;
            }
            if (a.N.compareAndSet(this, parkedWorkersStack, (long)f | (2097152L + parkedWorkersStack & 0xFFFFFFFFFFE00000L))) {
                b.p(a.Q);
                return b;
            }
        }
    }
    
    private final long K() {
        return a.O.addAndGet(this, 4398046511104L);
    }
    
    private final void N(final boolean b) {
        final long addAndGet = a.O.addAndGet(this, 2097152L);
        if (b) {
            return;
        }
        if (this.W()) {
            return;
        }
        if (this.T(addAndGet)) {
            return;
        }
        this.W();
    }
    
    private final k R(final b b, final k k, final boolean b2) {
        if (b == null) {
            return k;
        }
        if (b.H == c.K) {
            return k;
        }
        if (k.H.t() == 0 && b.H == c.H) {
            return k;
        }
        b.L = true;
        return b.G.a(k, b2);
    }
    
    private final boolean S() {
        long controlState;
        do {
            controlState = this.controlState;
            if ((int)((0x7FFFFC0000000000L & controlState) >> 42) == 0) {
                return false;
            }
        } while (!a.O.compareAndSet(this, controlState, controlState - 4398046511104L));
        return true;
    }
    
    private final boolean T(final long n) {
        if (o.n((int)(0x1FFFFFL & n) - (int)((n & 0x3FFFFE00000L) >> 21), 0) < this.J) {
            final int k = this.k();
            if (k == 1 && this.J > 1) {
                this.k();
            }
            if (k > 0) {
                return true;
            }
        }
        return false;
    }
    
    static /* synthetic */ boolean V(final a a, long controlState, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            controlState = a.controlState;
        }
        return a.T(controlState);
    }
    
    private final boolean W() {
        b g;
        do {
            g = this.G();
            if (g != null) {
                continue;
            }
            return false;
        } while (!b.N.compareAndSet(g, -1, 0));
        LockSupport.unpark(g);
        return true;
    }
    
    private final boolean g(final k k) {
        final int t = k.H.t();
        boolean b = true;
        if (t != 1) {
            b = false;
        }
        f f;
        if (b) {
            f = this.H;
        }
        else {
            f = this.G;
        }
        return f.a(k);
    }
    
    private final int j(final long n) {
        return (int)((n & 0x3FFFFE00000L) >> 21);
    }
    
    private final int k() {
        synchronized (this.I) {
            int n;
            if (this.isTerminated()) {
                n = -1;
            }
            else {
                final long controlState = this.controlState;
                final int n2 = (int)(controlState & 0x1FFFFFL);
                final int n3 = (int)((controlState & 0x3FFFFE00000L) >> 21);
                final int n4 = 0;
                final int n5 = o.n(n2 - n3, 0);
                if (n5 >= this.J) {
                    return 0;
                }
                if (n2 >= this.K) {
                    return 0;
                }
                final int n6 = (int)(this.controlState & 0x1FFFFFL) + 1;
                if (n6 <= 0 || this.I.get(n6) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                final b newValue = new b(n6);
                this.I.set(n6, newValue);
                int n7 = n4;
                if (n6 == (int)(0x1FFFFFL & a.O.incrementAndGet(this))) {
                    n7 = 1;
                }
                if (n7 == 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                newValue.start();
                n = n5 + 1;
            }
            return n;
        }
    }
    
    private final int o(final long n) {
        return (int)(n & 0x1FFFFFL);
    }
    
    private final b q() {
        Thread currentThread = Thread.currentThread();
        final boolean b = currentThread instanceof b;
        final b b2 = null;
        if (!b) {
            currentThread = null;
        }
        final b b3 = (b)currentThread;
        b b4 = b2;
        if (b3 != null) {
            b4 = b2;
            if (kotlin.jvm.internal.k0.g((Object)b3.M, (Object)this)) {
                b4 = b3;
            }
        }
        return b4;
    }
    
    private final void r() {
        a.O.addAndGet(this, -2097152L);
    }
    
    private final int s() {
        return (int)(a.O.getAndDecrement(this) & 0x1FFFFFL);
    }
    
    public static /* synthetic */ void w(final a a, final Runnable runnable, l h, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            h = i.H;
        }
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        a.t(runnable, h, b);
    }
    
    private final int x() {
        return (int)((this.controlState & 0x7FFFFC0000000000L) >> 42);
    }
    
    private final int y() {
        return (int)(this.controlState & 0x1FFFFFL);
    }
    
    public final boolean H(@e final b b) {
        if (b.g() != a.Q) {
            return false;
        }
        long parkedWorkersStack;
        int f;
        do {
            parkedWorkersStack = this.parkedWorkersStack;
            final int i = (int)(0x1FFFFFL & parkedWorkersStack);
            f = b.f();
            if (w0.b() && f == 0) {
                throw new AssertionError();
            }
            b.p(this.I.get(i));
        } while (!a.N.compareAndSet(this, parkedWorkersStack, (long)f | (2097152L + parkedWorkersStack & 0xFFFFFFFFFFE00000L)));
        return true;
    }
    
    public final void J(@e final b b, final int n, final int n2) {
        while (true) {
            final long parkedWorkersStack = this.parkedWorkersStack;
            int f;
            if ((f = (int)(0x1FFFFFL & parkedWorkersStack)) == n) {
                if (n2 == 0) {
                    f = this.F(b);
                }
                else {
                    f = n2;
                }
            }
            if (f < 0) {
                continue;
            }
            if (a.N.compareAndSet(this, parkedWorkersStack, (2097152L + parkedWorkersStack & 0xFFFFFFFFFFE00000L) | (long)f)) {
                break;
            }
        }
    }
    
    public final void L(@e final k k) {
        while (true) {
            try {
                k.run();
                final w3 b = x3.b();
                if (b != null) {
                    b.e();
                }
            }
            finally {
                try {
                    final Thread currentThread = Thread.currentThread();
                    final Throwable t;
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
                    if (x3.b() != null) {
                        continue;
                    }
                }
                finally {
                    final w3 b2 = x3.b();
                    if (b2 != null) {
                        b2.e();
                    }
                }
            }
            break;
        }
    }
    
    public final void M(final long millis) {
        final AtomicIntegerFieldUpdater p = a.P;
        final int n = 0;
        if (!p.compareAndSet(this, 0, 1)) {
            return;
        }
        final b q = this.q();
        Object o = this.I;
        synchronized (o) {
            final int n2 = (int)(this.controlState & 0x1FFFFFL);
            // monitorexit(o)
            if (1 <= n2) {
                int i = 1;
                while (true) {
                    o = this.I.get(i);
                    kotlin.jvm.internal.k0.m(o);
                    final b thread = (b)o;
                    if (thread != q) {
                        while (thread.isAlive()) {
                            LockSupport.unpark(thread);
                            thread.join(millis);
                        }
                        o = thread.H;
                        if (w0.b() && o != c.K) {
                            throw new AssertionError();
                        }
                        thread.G.g(this.H);
                    }
                    if (i == n2) {
                        break;
                    }
                    ++i;
                }
            }
            this.H.b();
            this.G.b();
            while (true) {
                Label_0219: {
                    if (q != null) {
                        o = q.e(true);
                        if (o != null) {
                            break Label_0219;
                        }
                    }
                    o = this.G.g();
                }
                if (o == null) {
                    o = this.H.g();
                }
                if (o == null) {
                    break;
                }
                this.L((k)o);
            }
            if (q != null) {
                q.s(c.K);
            }
            if (w0.b()) {
                int n3 = n;
                if ((int)((this.controlState & 0x7FFFFC0000000000L) >> 42) == this.J) {
                    n3 = 1;
                }
                if (n3 == 0) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }
    
    public final void Q() {
        if (this.W()) {
            return;
        }
        if (V(this, 0L, 1, null)) {
            return;
        }
        this.W();
    }
    
    @Override
    public void close() {
        this.M(10000L);
    }
    
    @Override
    public void execute(@e final Runnable runnable) {
        w(this, runnable, null, false, 6, null);
    }
    
    public final int h(final long n) {
        return (int)((n & 0x7FFFFC0000000000L) >> 42);
    }
    
    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }
    
    @e
    public final k n(@e final Runnable runnable, @e final l h) {
        final long a = n.h.a();
        if (runnable instanceof k) {
            final k k = (k)runnable;
            k.G = a;
            k.H = h;
            return k;
        }
        return new m(runnable, a, h);
    }
    
    public final void t(@e final Runnable runnable, @e final l l, final boolean b) {
        final w3 b2 = x3.b();
        if (b2 != null) {
            b2.i();
        }
        final k n = this.n(runnable, l);
        final b q = this.q();
        final k r = this.R(q, n, b);
        if (r != null && !this.g(r)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.M);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        }
        final boolean b3 = b && q != null;
        if (n.H.t() == 0) {
            if (b3) {
                return;
            }
            this.Q();
        }
        else {
            this.N(b3);
        }
    }
    
    @e
    @Override
    public String toString() {
        final ArrayList<String> obj = new ArrayList<String>();
        final int length = this.I.length();
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        for (int i2 = 1; i2 < length; ++i2, i = n, j = n2, k = n3, l = n4, m = n5) {
            final b b = this.I.get(i2);
            n = i;
            n2 = j;
            n3 = k;
            n4 = l;
            n5 = m;
            if (b != null) {
                final int f = b.G.f();
                final int n6 = kotlinx.coroutines.scheduling.b.a[b.H.ordinal()];
                if (n6 != 1) {
                    StringBuilder sb;
                    String str;
                    if (n6 != 2) {
                        if (n6 != 3) {
                            if (n6 != 4) {
                                if (n6 != 5) {
                                    n = i;
                                    n2 = j;
                                    n3 = k;
                                    n4 = l;
                                    n5 = m;
                                    continue;
                                }
                                n5 = m + 1;
                                n = i;
                                n2 = j;
                                n3 = k;
                                n4 = l;
                                continue;
                            }
                            else {
                                ++l;
                                n = i;
                                n2 = j;
                                n3 = k;
                                n4 = l;
                                n5 = m;
                                if (f <= 0) {
                                    continue;
                                }
                                sb = new StringBuilder();
                                sb.append(String.valueOf(f));
                                str = "d";
                            }
                        }
                        else {
                            ++i;
                            sb = new StringBuilder();
                            sb.append(String.valueOf(f));
                            str = "c";
                        }
                    }
                    else {
                        ++j;
                        sb = new StringBuilder();
                        sb.append(String.valueOf(f));
                        str = "b";
                    }
                    sb.append(str);
                    obj.add(sb.toString());
                    n = i;
                    n2 = j;
                    n3 = k;
                    n4 = l;
                    n5 = m;
                }
                else {
                    n3 = k + 1;
                    n5 = m;
                    n4 = l;
                    n2 = j;
                    n = i;
                }
            }
        }
        final long controlState = this.controlState;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.M);
        sb2.append('@');
        sb2.append(x0.b(this));
        sb2.append('[');
        sb2.append("Pool Size {");
        sb2.append("core = ");
        sb2.append(this.J);
        sb2.append(", ");
        sb2.append("max = ");
        sb2.append(this.K);
        sb2.append("}, ");
        sb2.append("Worker States {");
        sb2.append("CPU = ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append("blocking = ");
        sb2.append(j);
        sb2.append(", ");
        sb2.append("parked = ");
        sb2.append(k);
        sb2.append(", ");
        sb2.append("dormant = ");
        sb2.append(l);
        sb2.append(", ");
        sb2.append("terminated = ");
        sb2.append(m);
        sb2.append("}, ");
        sb2.append("running workers queues = ");
        sb2.append(obj);
        sb2.append(", ");
        sb2.append("global CPU queue size = ");
        sb2.append(this.G.c());
        sb2.append(", ");
        sb2.append("global blocking queue size = ");
        sb2.append(this.H.c());
        sb2.append(", ");
        sb2.append("Control State {");
        sb2.append("created workers= ");
        sb2.append((int)(0x1FFFFFL & controlState));
        sb2.append(", ");
        sb2.append("blocking tasks = ");
        sb2.append((int)((0x3FFFFE00000L & controlState) >> 21));
        sb2.append(", ");
        sb2.append("CPUs acquired = ");
        sb2.append(this.J - (int)((0x7FFFFC0000000000L & controlState) >> 42));
        sb2.append("}]");
        return sb2.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00058\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\r\u001a\u00020\u00058\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018" }, d2 = { "kotlinx/coroutines/scheduling/a$a", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/k0;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/k0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a
    {
        private a() {
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010IB\u0011\b\u0016\u0012\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\bH\u0010JJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010.R\u0016\u00103\u001a\u0002008\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u00105R*\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u0011R\u0014\u0010?\u001a\u00020<8\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010.¨\u0006K" }, d2 = { "kotlinx/coroutines/scheduling/a$b", "Ljava/lang/Thread;", "", "q", "()Z", "Lkotlin/j2;", "n", "()V", "r", "j", "Lkotlinx/coroutines/scheduling/k;", "task", "c", "(Lkotlinx/coroutines/scheduling/k;)V", "", "taskMode", "b", "(I)V", "a", "l", "u", "mode", "i", "scanLocalQueue", "d", "(Z)Lkotlinx/coroutines/scheduling/k;", "m", "()Lkotlinx/coroutines/scheduling/k;", "blockingOnly", "t", "Lkotlinx/coroutines/scheduling/a$c;", "newState", "s", "(Lkotlinx/coroutines/scheduling/a$c;)Z", "run", "upperBound", "k", "(I)I", "e", "L", "Z", "mayHaveLocalTasks", "K", "I", "rngState", "", "J", "terminationDeadline", "Lkotlinx/coroutines/scheduling/o;", "G", "Lkotlinx/coroutines/scheduling/o;", "localQueue", "H", "Lkotlinx/coroutines/scheduling/a$c;", "state", "index", "indexInArray", "f", "()I", "o", "Lkotlinx/coroutines/scheduling/a;", "h", "()Lkotlinx/coroutines/scheduling/a;", "scheduler", "", "nextParkedWorker", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "<init>", "(Lkotlinx/coroutines/scheduling/a;)V", "(Lkotlinx/coroutines/scheduling/a;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public final class b extends Thread
    {
        static final /* synthetic */ AtomicIntegerFieldUpdater N;
        @d
        @e
        public final kotlinx.coroutines.scheduling.o G;
        @d
        @e
        public c H;
        private long I;
        private long J;
        private int K;
        @d
        public boolean L;
        final /* synthetic */ a M;
        private volatile int indexInArray;
        @org.jetbrains.annotations.f
        private volatile Object nextParkedWorker;
        @e
        volatile /* synthetic */ int workerCtl;
        
        static {
            N = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");
        }
        
        private b() {
            this.setDaemon(true);
            this.G = new kotlinx.coroutines.scheduling.o();
            this.H = c.J;
            this.workerCtl = 0;
            this.nextParkedWorker = a.Q;
            this.K = kotlin.random.f.H.l();
        }
        
        public b(final a a, final int n) {
            this();
            this.o(n);
        }
        
        private final void a(int n) {
            if (n == 0) {
                return;
            }
            a.O.addAndGet(a.this, -2097152L);
            final c h = this.H;
            if (h != c.K) {
                if (w0.b()) {
                    if (h == c.H) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n == 0) {
                        throw new AssertionError();
                    }
                }
                this.H = c.J;
            }
        }
        
        private final void b(final int n) {
            if (n == 0) {
                return;
            }
            if (this.s(c.H)) {
                a.this.Q();
            }
        }
        
        private final void c(final k k) {
            final int t = k.H.t();
            this.i(t);
            this.b(t);
            a.this.L(k);
            this.a(t);
        }
        
        private final k d(final boolean b) {
            if (b) {
                final boolean b2 = this.k(a.this.J * 2) == 0;
                if (b2) {
                    final k m = this.m();
                    if (m != null) {
                        return m;
                    }
                }
                final k h = this.G.h();
                if (h != null) {
                    return h;
                }
                if (!b2) {
                    final k i = this.m();
                    if (i != null) {
                        return i;
                    }
                }
            }
            else {
                final k j = this.m();
                if (j != null) {
                    return j;
                }
            }
            return this.t(false);
        }
        
        private final void i(int n) {
            this.I = 0L;
            if (this.H == c.I) {
                if (w0.b()) {
                    final int n2 = 1;
                    if (n == 1) {
                        n = n2;
                    }
                    else {
                        n = 0;
                    }
                    if (n == 0) {
                        throw new AssertionError();
                    }
                }
                this.H = c.H;
            }
        }
        
        private final boolean j() {
            return this.nextParkedWorker != a.Q;
        }
        
        private final void l() {
            if (this.I == 0L) {
                this.I = System.nanoTime() + a.this.L;
            }
            LockSupport.parkNanos(a.this.L);
            if (System.nanoTime() - this.I >= 0L) {
                this.I = 0L;
                this.u();
            }
        }
        
        private final k m() {
            f f;
            if (this.k(2) == 0) {
                final k k = a.this.G.g();
                if (k != null) {
                    return k;
                }
                f = a.this.H;
            }
            else {
                final k i = a.this.H.g();
                if (i != null) {
                    return i;
                }
                f = a.this.G;
            }
            return f.g();
        }
        
        private final void n() {
        Label_0000:
            while (true) {
                int n = 0;
                while (!a.this.isTerminated() && this.H != c.K) {
                    final k e = this.e(this.L);
                    if (e != null) {
                        this.J = 0L;
                        this.c(e);
                        continue Label_0000;
                    }
                    this.L = false;
                    if (this.J != 0L) {
                        if (n != 0) {
                            this.s(c.I);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.J);
                            this.J = 0L;
                            continue Label_0000;
                        }
                        n = 1;
                    }
                    else {
                        this.r();
                    }
                }
                break;
            }
            this.s(c.K);
        }
        
        private final boolean q() {
            final c h = this.H;
            final c g = c.G;
            boolean b = false;
            if (h != g) {
                final a m = a.this;
                while (true) {
                    long controlState;
                    do {
                        controlState = m.controlState;
                        if ((int)((0x7FFFFC0000000000L & controlState) >> 42) == 0) {
                            final boolean b2 = false;
                            if (b2) {
                                this.H = c.G;
                                return true;
                            }
                            return b;
                        }
                    } while (!a.O.compareAndSet(m, controlState, controlState - 4398046511104L));
                    final boolean b2 = true;
                    continue;
                }
            }
            b = true;
            return b;
        }
        
        private final void r() {
            if (!this.j()) {
                a.this.H(this);
                return;
            }
            if (w0.b() && this.G.f() != 0) {
                throw new AssertionError();
            }
            this.workerCtl = -1;
            while (this.j() && this.workerCtl == -1 && !a.this.isTerminated() && this.H != c.K) {
                this.s(c.I);
                Thread.interrupted();
                this.l();
            }
        }
        
        private final k t(final boolean b) {
            if (w0.b() && this.G.f() != 0) {
                throw new AssertionError();
            }
            final int d = a.this.y();
            if (d < 2) {
                return null;
            }
            int k = this.k(d);
            long n = Long.MAX_VALUE;
            long min;
            for (int i = 0; i < d; ++i, n = min) {
                if (++k > d) {
                    k = 1;
                }
                final b b2 = a.this.I.get(k);
                min = n;
                if (b2 != null) {
                    min = n;
                    if (b2 != this) {
                        if (w0.b() && this.G.f() != 0) {
                            throw new AssertionError();
                        }
                        final kotlinx.coroutines.scheduling.o g = this.G;
                        final kotlinx.coroutines.scheduling.o g2 = b2.G;
                        long b3;
                        if (b) {
                            b3 = g.k(g2);
                        }
                        else {
                            b3 = g.l(g2);
                        }
                        if (b3 == -1L) {
                            return this.G.h();
                        }
                        min = n;
                        if (b3 > 0L) {
                            min = Math.min(n, b3);
                        }
                    }
                }
            }
            if (n == Long.MAX_VALUE) {
                n = 0L;
            }
            this.J = n;
            return null;
        }
        
        private final void u() {
            synchronized (a.this.I) {
                if (a.this.isTerminated()) {
                    return;
                }
                if (a.this.y() <= a.this.J) {
                    return;
                }
                if (!b.N.compareAndSet(this, -1, 1)) {
                    return;
                }
                final int indexInArray = this.indexInArray;
                this.o(0);
                a.this.J(this, indexInArray, 0);
                final int n = (int)(a.O.getAndDecrement(a.this) & 0x1FFFFFL);
                if (n != indexInArray) {
                    final b value = a.this.I.get(n);
                    kotlin.jvm.internal.k0.m((Object)value);
                    final b newValue = value;
                    a.this.I.set(indexInArray, newValue);
                    newValue.o(indexInArray);
                    a.this.J(newValue, n, indexInArray);
                }
                a.this.I.set(n, null);
                final j2 a = j2.a;
                // monitorexit(this.M.I)
                this.H = c.K;
            }
        }
        
        @org.jetbrains.annotations.f
        public final k e(final boolean b) {
            if (this.q()) {
                return this.d(b);
            }
            k k = null;
            Label_0046: {
                if (b) {
                    k = this.G.h();
                    if (k != null) {
                        break Label_0046;
                    }
                }
                k = a.this.H.g();
            }
            if (k == null) {
                k = this.t(true);
            }
            return k;
        }
        
        public final int f() {
            return this.indexInArray;
        }
        
        @org.jetbrains.annotations.f
        public final Object g() {
            return this.nextParkedWorker;
        }
        
        @e
        public final a h() {
            return a.this;
        }
        
        public final int k(final int n) {
            final int k = this.K;
            final int n2 = k ^ k << 13;
            final int n3 = n2 ^ n2 >> 17;
            final int i = n3 ^ n3 << 5;
            this.K = i;
            final int n4 = n - 1;
            if ((n4 & n) == 0x0) {
                return i & n4;
            }
            return (i & Integer.MAX_VALUE) % n;
        }
        
        public final void o(final int n) {
            final StringBuilder sb = new StringBuilder();
            sb.append(a.this.M);
            sb.append("-worker-");
            String value;
            if (n == 0) {
                value = "TERMINATED";
            }
            else {
                value = String.valueOf(n);
            }
            sb.append(value);
            this.setName(sb.toString());
            this.indexInArray = n;
        }
        
        public final void p(@org.jetbrains.annotations.f final Object nextParkedWorker) {
            this.nextParkedWorker = nextParkedWorker;
        }
        
        @Override
        public void run() {
            this.n();
        }
        
        public final boolean s(@e final c h) {
            final c h2 = this.H;
            final boolean b = h2 == c.G;
            if (b) {
                a.O.addAndGet(a.this, 4398046511104L);
            }
            if (h2 != h) {
                this.H = h;
            }
            return b;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "kotlinx/coroutines/scheduling/a$c", "", "Lkotlinx/coroutines/scheduling/a$c;", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public enum c
    {
        G, 
        H, 
        I, 
        J, 
        K;
    }
}
