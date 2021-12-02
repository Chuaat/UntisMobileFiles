// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.internal.u0;
import kotlin.ranges.o;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.internal.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0004¢\u0006\u0004\b,\u0010\rR$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00118T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010#R\u0016\u00106\u001a\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010/¨\u0006<" }, d2 = { "Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/c1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "M0", "(Ljava/lang/Runnable;)Z", "H0", "()Ljava/lang/Runnable;", "Lkotlin/j2;", "G0", "()V", "Lkotlinx/coroutines/q1$c;", "e1", "(Lkotlinx/coroutines/q1$c;)Z", "", "now", "delayedTask", "", "Z0", "(JLkotlinx/coroutines/q1$c;)I", "N0", "shutdown", "timeMillis", "Lkotlinx/coroutines/o;", "continuation", "e", "(JLkotlinx/coroutines/o;)V", "block", "Lkotlinx/coroutines/l1;", "a1", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/l1;", "i0", "()J", "Lkotlin/coroutines/g;", "context", "H", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V", "L0", "(Ljava/lang/Runnable;)V", "W0", "(JLkotlinx/coroutines/q1$c;)V", "Q0", "value", "g", "()Z", "d1", "(Z)V", "isCompleted", "a0", "nextTime", "f0", "isEmpty", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class q1 extends r1 implements c1
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater K;
    private static final /* synthetic */ AtomicReferenceFieldUpdater L;
    private volatile /* synthetic */ Object _delayed;
    private volatile /* synthetic */ int _isCompleted;
    private volatile /* synthetic */ Object _queue;
    
    static {
        K = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_queue");
        L = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_delayed");
    }
    
    public q1() {
        this._queue = null;
        this._delayed = null;
        this._isCompleted = 0;
    }
    
    private final void G0() {
        if (w0.b()) {
            if (!this.g()) {
                throw new AssertionError();
            }
        }
        while (true) {
            final Object queue = this._queue;
            if (queue == null) {
                if (q1.K.compareAndSet(this, null, t1.a())) {
                    return;
                }
                continue;
            }
            else {
                if (queue instanceof w) {
                    ((w)queue).d();
                    return;
                }
                if (queue == t1.a()) {
                    return;
                }
                final w<Runnable> w = new w<Runnable>(8, true);
                w.a((Runnable)queue);
                if (q1.K.compareAndSet(this, queue, w)) {
                    return;
                }
                continue;
            }
        }
    }
    
    private final Runnable H0() {
        while (true) {
            final Object queue = this._queue;
            if (queue == null) {
                return null;
            }
            if (queue instanceof w) {
                final w w = (w)queue;
                final Object l = w.l();
                if (l != kotlinx.coroutines.internal.w.s) {
                    return (Runnable)l;
                }
                q1.K.compareAndSet(this, queue, w.k());
            }
            else {
                if (queue == t1.a()) {
                    return null;
                }
                if (q1.K.compareAndSet(this, queue, null)) {
                    return (Runnable)queue;
                }
                continue;
            }
        }
    }
    
    private final boolean M0(final Runnable runnable) {
        while (true) {
            final Object queue = this._queue;
            if (this.g()) {
                return false;
            }
            if (queue == null) {
                if (q1.K.compareAndSet(this, null, runnable)) {
                    return true;
                }
                continue;
            }
            else if (queue instanceof w) {
                final w<Runnable> w = (w<Runnable>)queue;
                final int a = w.a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a != 1) {
                    if (a != 2) {
                        continue;
                    }
                    return false;
                }
                else {
                    q1.K.compareAndSet(this, queue, w.k());
                }
            }
            else {
                if (queue == t1.a()) {
                    return false;
                }
                final w<Runnable> w2 = new w<Runnable>(8, true);
                w2.a((Runnable)queue);
                w2.a(runnable);
                if (q1.K.compareAndSet(this, queue, w2)) {
                    return true;
                }
                continue;
            }
        }
    }
    
    private final void N0() {
        final w3 b = x3.b();
        long n;
        if (b != null) {
            n = b.b();
        }
        else {
            n = System.nanoTime();
        }
        while (true) {
            final d d = (d)this._delayed;
            if (d == null) {
                break;
            }
            final c c = d.m();
            if (c == null) {
                break;
            }
            this.s0(n, c);
        }
    }
    
    private final int Z0(final long n, final c c) {
        if (this.g()) {
            return 1;
        }
        d d = (d)this._delayed;
        if (d == null) {
            q1.L.compareAndSet(this, null, new d(n));
            final Object delayed = this._delayed;
            k0.m(delayed);
            d = (d)delayed;
        }
        return c.h(n, d, this);
    }
    
    private final void d1(final boolean isCompleted) {
        this._isCompleted = (isCompleted ? 1 : 0);
    }
    
    private final boolean e1(final c c) {
        final d d = (d)this._delayed;
        c c2;
        if (d != null) {
            c2 = d.h();
        }
        else {
            c2 = null;
        }
        return c2 == c;
    }
    
    private final boolean g() {
        return this._isCompleted != 0;
    }
    
    @e
    @Override
    public l1 D(final long n, @e final Runnable runnable, @e final g g) {
        return c1.a.b(this, n, runnable, g);
    }
    
    @f
    @Override
    public Object F(final long n, @e final kotlin.coroutines.d<? super j2> d) {
        return c1.a.a(this, n, d);
    }
    
    @Override
    public final void H(@e final g g, @e final Runnable runnable) {
        this.L0(runnable);
    }
    
    public final void L0(@e final Runnable runnable) {
        if (this.M0(runnable)) {
            this.w0();
        }
        else {
            y0.T.L0(runnable);
        }
    }
    
    protected final void Q0() {
        this._queue = null;
        this._delayed = null;
    }
    
    public final void W0(final long n, @e final c c) {
        final int z0 = this.Z0(n, c);
        if (z0 != 0) {
            if (z0 != 1) {
                if (z0 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
            }
            else {
                this.s0(n, c);
            }
        }
        else if (this.e1(c)) {
            this.w0();
        }
    }
    
    @Override
    protected long a0() {
        if (super.a0() == 0L) {
            return 0L;
        }
        final Object queue = this._queue;
        if (queue != null) {
            if (queue instanceof w) {
                if (!((w)queue).h()) {
                    return 0L;
                }
            }
            else {
                if (queue == t1.a()) {
                    return Long.MAX_VALUE;
                }
                return 0L;
            }
        }
        final d d = (d)this._delayed;
        if (d != null) {
            final c c = d.h();
            if (c != null) {
                final long i = c.I;
                final w3 b = x3.b();
                long n;
                if (b != null) {
                    n = b.b();
                }
                else {
                    n = System.nanoTime();
                }
                return o.o(i - n, 0L);
            }
        }
        return Long.MAX_VALUE;
    }
    
    @e
    protected final l1 a1(long n, @e final Runnable runnable) {
        final long d = t1.d(n);
        l1 g;
        if (d < 4611686018427387903L) {
            final w3 b = x3.b();
            if (b != null) {
                n = b.b();
            }
            else {
                n = System.nanoTime();
            }
            g = new b(d + n, runnable);
            this.W0(n, (c)g);
        }
        else {
            g = z2.G;
        }
        return g;
    }
    
    @Override
    public void e(long n, @e final kotlinx.coroutines.o<? super j2> o) {
        final long d = t1.d(n);
        if (d < 4611686018427387903L) {
            final w3 b = x3.b();
            if (b != null) {
                n = b.b();
            }
            else {
                n = System.nanoTime();
            }
            final a a = new a(d + n, o);
            r.a(o, a);
            this.W0(n, (c)a);
        }
    }
    
    @Override
    protected boolean f0() {
        final boolean h0 = this.h0();
        boolean h2 = false;
        if (!h0) {
            return false;
        }
        final d d = (d)this._delayed;
        if (d != null && !d.g()) {
            return false;
        }
        final Object queue = this._queue;
        if (queue != null) {
            if (queue instanceof w) {
                h2 = ((w)queue).h();
                return h2;
            }
            if (queue != t1.a()) {
                return h2;
            }
        }
        h2 = true;
        return h2;
    }
    
    @Override
    public long i0() {
        if (this.j0()) {
            return 0L;
        }
        final d d = (d)this._delayed;
        if (d != null && !d.g()) {
            final w3 b = x3.b();
            long n;
            if (b != null) {
                n = b.b();
            }
            else {
                n = System.nanoTime();
            }
            while (true) {
                synchronized (d) {
                    final c e = d.e();
                    Runnable k;
                    final Runnable runnable = k = null;
                    if (e != null) {
                        final c c = e;
                        final boolean b2 = c.j(n) && this.M0(c);
                        k = runnable;
                        if (b2) {
                            k = ((t0<Runnable>)d).k(0);
                        }
                    }
                    // monitorexit(d)
                    if (k != null) {
                        continue;
                    }
                }
                break;
            }
        }
        final Runnable h0 = this.H0();
        if (h0 != null) {
            h0.run();
            return 0L;
        }
        return this.a0();
    }
    
    @Override
    protected void shutdown() {
        s3.b.c();
        this.d1(true);
        this.G0();
        while (this.i0() <= 0L) {}
        this.N0();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e" }, d2 = { "kotlinx/coroutines/q1$a", "Lkotlinx/coroutines/q1$c;", "Lkotlin/j2;", "run", "", "toString", "Lkotlinx/coroutines/o;", "J", "Lkotlinx/coroutines/o;", "cont", "", "nanoTime", "<init>", "(Lkotlinx/coroutines/q1;JLkotlinx/coroutines/o;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class a extends c
    {
        private final kotlinx.coroutines.o<j2> J;
        
        public a(@e final long n, final kotlinx.coroutines.o<? super j2> j) {
            super(n);
            this.J = (kotlinx.coroutines.o<j2>)j;
        }
        
        @Override
        public void run() {
            this.J.F(q1.this, j2.a);
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.J.toString());
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f" }, d2 = { "kotlinx/coroutines/q1$b", "Lkotlinx/coroutines/q1$c;", "Lkotlin/j2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "J", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class b extends c
    {
        private final Runnable J;
        
        public b(final long n, @e final Runnable j) {
            super(n);
            this.J = j;
        }
        
        @Override
        public void run() {
            this.J.run();
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.J.toString());
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0096\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0015H\u0016R0\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-" }, d2 = { "kotlinx/coroutines/q1$c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/q1$c;", "Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/internal/u0;", "other", "", "g", "", "now", "", "j", "Lkotlinx/coroutines/q1$d;", "delayed", "Lkotlinx/coroutines/q1;", "eventLoop", "h", "Lkotlin/j2;", "dispose", "", "toString", "Lkotlinx/coroutines/internal/t0;", "value", "d", "()Lkotlinx/coroutines/internal/t0;", "b", "(Lkotlinx/coroutines/internal/t0;)V", "heap", "H", "I", "i", "()I", "f", "(I)V", "index", "J", "nanoTime", "", "G", "Ljava/lang/Object;", "_heap", "<init>", "(J)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public abstract static class c implements Runnable, Comparable<c>, l1, u0
    {
        private Object G;
        private int H;
        @m6.d
        public long I;
        
        public c(final long i) {
            this.I = i;
            this.H = -1;
        }
        
        @Override
        public void b(@f final t0<?> g) {
            if (this.G != t1.b()) {
                this.G = g;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        
        @f
        @Override
        public t0<?> d() {
            Object g;
            if (!((g = this.G) instanceof t0)) {
                g = null;
            }
            return (t0<?>)g;
        }
        
        @Override
        public final void dispose() {
            synchronized (this) {
                final Object g = this.G;
                if (g == t1.b()) {
                    return;
                }
                Object o = g;
                if (!(g instanceof d)) {
                    o = null;
                }
                final d d = (d)o;
                if (d != null) {
                    d.j(this);
                }
                this.G = t1.b();
            }
        }
        
        @Override
        public void f(final int h) {
            this.H = h;
        }
        
        public int g(@e final c c) {
            final long n = lcmp(this.I - c.I, 0L);
            int n2;
            if (n > 0) {
                n2 = 1;
            }
            else if (n < 0) {
                n2 = -1;
            }
            else {
                n2 = 0;
            }
            return n2;
        }
        
        public final int h(long b, @e final d d, @e final q1 q1) {
            synchronized (this) {
                int n;
                if (this.G == t1.b()) {
                    n = 2;
                }
                else {
                    synchronized (d) {
                        final c c = d.e();
                        if (q1.g()) {
                            return 1;
                        }
                        Label_0106: {
                            if (c != null) {
                                final long i = c.I;
                                if (i - b < 0L) {
                                    b = i;
                                }
                                if (b - d.b <= 0L) {
                                    break Label_0106;
                                }
                            }
                            d.b = b;
                        }
                        final long j = this.I;
                        b = d.b;
                        if (j - b < 0L) {
                            this.I = b;
                        }
                        d.a(this);
                        // monitorexit(d)
                        n = 0;
                        return n;
                    }
                }
                return n;
            }
        }
        
        @Override
        public int i() {
            return this.H;
        }
        
        public final boolean j(final long n) {
            return n - this.I >= 0L;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Delayed[nanos=");
            sb.append(this.I);
            sb.append(']');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t" }, d2 = { "kotlinx/coroutines/q1$d", "Lkotlinx/coroutines/internal/t0;", "Lkotlinx/coroutines/q1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class d extends t0<c>
    {
        @m6.d
        public long b;
        
        public d(final long b) {
            this.b = b;
        }
    }
}
