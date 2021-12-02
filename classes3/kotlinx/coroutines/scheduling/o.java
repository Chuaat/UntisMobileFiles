// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.e;
import kotlinx.coroutines.w0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0016\u0010%\u001a\u00020\"8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*" }, d2 = { "Lkotlinx/coroutines/scheduling/o;", "", "Lkotlinx/coroutines/scheduling/k;", "task", "c", "(Lkotlinx/coroutines/scheduling/k;)Lkotlinx/coroutines/scheduling/k;", "victim", "", "blockingOnly", "", "m", "(Lkotlinx/coroutines/scheduling/o;Z)J", "Lkotlinx/coroutines/scheduling/f;", "queue", "j", "(Lkotlinx/coroutines/scheduling/f;)Z", "i", "()Lkotlinx/coroutines/scheduling/k;", "Lkotlin/j2;", "d", "(Lkotlinx/coroutines/scheduling/k;)V", "h", "fair", "a", "(Lkotlinx/coroutines/scheduling/k;Z)Lkotlinx/coroutines/scheduling/k;", "l", "(Lkotlinx/coroutines/scheduling/o;)J", "k", "globalQueue", "g", "(Lkotlinx/coroutines/scheduling/f;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "f", "()I", "size", "e", "bufferSize", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class o
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private static final /* synthetic */ AtomicIntegerFieldUpdater c;
    private static final /* synthetic */ AtomicIntegerFieldUpdater d;
    private static final /* synthetic */ AtomicIntegerFieldUpdater e;
    private final AtomicReferenceArray<k> a;
    private volatile /* synthetic */ int blockingTasksInBuffer;
    private volatile /* synthetic */ int consumerIndex;
    private volatile /* synthetic */ Object lastScheduledTask;
    private volatile /* synthetic */ int producerIndex;
    
    static {
        b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater(o.class, "producerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater(o.class, "consumerIndex");
        e = AtomicIntegerFieldUpdater.newUpdater(o.class, "blockingTasksInBuffer");
    }
    
    public o() {
        this.a = new AtomicReferenceArray<k>(128);
        this.lastScheduledTask = null;
        this.producerIndex = 0;
        this.consumerIndex = 0;
        this.blockingTasksInBuffer = 0;
    }
    
    public static /* synthetic */ k b(final o o, final k k, boolean b, final int n, final Object o2) {
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        return o.a(k, b);
    }
    
    private final k c(final k newValue) {
        final int t = newValue.H.t();
        boolean b = true;
        if (t != 1) {
            b = false;
        }
        if (b) {
            o.e.incrementAndGet(this);
        }
        if (this.e() == 127) {
            return newValue;
        }
        final int n = this.producerIndex & 0x7F;
        while (this.a.get(n) != null) {
            Thread.yield();
        }
        this.a.lazySet(n, newValue);
        o.c.incrementAndGet(this);
        return null;
    }
    
    private final void d(final k k) {
        if (k != null) {
            final int t = k.H.t();
            final int n = 0;
            if (t == 1) {
                final int decrementAndGet = o.e.decrementAndGet(this);
                if (w0.b()) {
                    int n2 = n;
                    if (decrementAndGet >= 0) {
                        n2 = 1;
                    }
                    if (n2 == 0) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }
    
    private final k i() {
        while (true) {
            final int consumerIndex = this.consumerIndex;
            if (consumerIndex - this.producerIndex == 0) {
                return null;
            }
            if (!o.d.compareAndSet(this, consumerIndex, consumerIndex + 1)) {
                continue;
            }
            final k k = this.a.getAndSet(consumerIndex & 0x7F, null);
            if (k != null) {
                this.d(k);
                return k;
            }
        }
    }
    
    private final boolean j(final f f) {
        final k i = this.i();
        if (i != null) {
            f.a(i);
            return true;
        }
        return false;
    }
    
    private final long m(final o o, final boolean b) {
        k k;
        do {
            k = (k)o.lastScheduledTask;
            if (k == null) {
                return -2L;
            }
            if (b) {
                final int t = k.H.t();
                boolean b2 = true;
                if (t != 1) {
                    b2 = false;
                }
                if (!b2) {
                    return -2L;
                }
            }
            final long n = kotlinx.coroutines.scheduling.n.h.a() - k.G;
            final long c = kotlinx.coroutines.scheduling.n.c;
            if (n < c) {
                return c - n;
            }
        } while (!o.b.compareAndSet(o, k, null));
        b(this, k, false, 2, null);
        return -1L;
    }
    
    @org.jetbrains.annotations.f
    public final k a(@e k newValue, final boolean b) {
        if (b) {
            return this.c(newValue);
        }
        newValue = o.b.getAndSet(this, newValue);
        if (newValue != null) {
            return this.c(newValue);
        }
        return null;
    }
    
    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }
    
    public final int f() {
        int e;
        if (this.lastScheduledTask != null) {
            e = this.e() + 1;
        }
        else {
            e = this.e();
        }
        return e;
    }
    
    public final void g(@e final f f) {
        final k k = o.b.getAndSet(this, null);
        if (k != null) {
            f.a(k);
        }
        while (this.j(f)) {}
    }
    
    @org.jetbrains.annotations.f
    public final k h() {
        k i = o.b.getAndSet(this, null);
        if (i == null) {
            i = this.i();
        }
        return i;
    }
    
    public final long k(@e final o obj) {
        if (w0.b() && this.e() != 0) {
            throw new AssertionError();
        }
        int i = obj.consumerIndex;
        final int producerIndex = obj.producerIndex;
        final AtomicReferenceArray<k> a = obj.a;
        while (i != producerIndex) {
            final int n = i & 0x7F;
            if (obj.blockingTasksInBuffer == 0) {
                break;
            }
            final k expectedValue = a.get(n);
            if (expectedValue != null && expectedValue.H.t() == 1 && a.compareAndSet(n, expectedValue, null)) {
                o.e.decrementAndGet(obj);
                b(this, expectedValue, false, 2, null);
                return -1L;
            }
            ++i;
        }
        return this.m(obj, true);
    }
    
    public final long l(@e final o o) {
        final boolean b = w0.b();
        final int n = 1;
        if (b && this.e() != 0) {
            throw new AssertionError();
        }
        final k i = o.i();
        if (i != null) {
            final k b2 = b(this, i, false, 2, null);
            if (w0.b()) {
                int n2;
                if (b2 == null) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    throw new AssertionError();
                }
            }
            return -1L;
        }
        return this.m(o, false);
    }
}
