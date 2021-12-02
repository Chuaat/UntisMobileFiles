// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.d;
import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.internal.i0;
import kotlinx.coroutines.internal.h0;
import kotlinx.coroutines.o;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\f\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/sync/g;", "Lkotlinx/coroutines/sync/f;", "Lkotlinx/coroutines/o;", "Lkotlin/j2;", "cont", "", "g", "(Lkotlinx/coroutines/o;)Z", "i", "()Z", "h", "c", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "release", "()V", "", "I", "permits", "a", "()I", "availablePermits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class g implements f
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater c;
    private static final /* synthetic */ AtomicLongFieldUpdater d;
    private static final /* synthetic */ AtomicReferenceFieldUpdater e;
    private static final /* synthetic */ AtomicLongFieldUpdater f;
    static final /* synthetic */ AtomicIntegerFieldUpdater g;
    volatile /* synthetic */ int _availablePermits;
    private final l<Throwable, j2> a;
    private final int b;
    private volatile /* synthetic */ long deqIdx;
    private volatile /* synthetic */ long enqIdx;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;
    
    static {
        c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head");
        d = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx");
        e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail");
        f = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx");
        g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits");
    }
    
    public g(final int i, final int n) {
        this.b = i;
        this.deqIdx = 0L;
        this.enqIdx = 0L;
        final int n2 = 1;
        if (i <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Semaphore should have at least 1 permit, but had ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n3 = 0;
        Label_0060: {
            if (n >= 0) {
                if (i >= n) {
                    n3 = n2;
                    break Label_0060;
                }
            }
            n3 = 0;
        }
        if (n3 != 0) {
            final i j = new i(0L, null, 2);
            this.head = j;
            this.tail = j;
            this._availablePermits = i - n;
            this.a = (l<Throwable, j2>)new l<Throwable, j2>() {
                final /* synthetic */ g G;
                
                public final void a(@e final Throwable t) {
                    this.G.release();
                }
            };
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("The number of acquired permits should be in 0..");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public static final /* synthetic */ l e(final g g) {
        return g.a;
    }
    
    private final boolean g(final o<? super j2> newValue) {
        final i i = (i)this.tail;
        final long andIncrement = kotlinx.coroutines.sync.g.f.getAndIncrement(this);
        final long n = andIncrement / h.h();
        Object b2 = null;
        int n2 = 0;
    Label_0122_Outer:
        while (true) {
            Object o = i;
            Object b;
            while (true) {
                if (((h0)o).o() >= n) {
                    b = o;
                    if (!((h0)o).g()) {
                        break;
                    }
                }
                final Object a = kotlinx.coroutines.internal.g.a((kotlinx.coroutines.internal.g<kotlinx.coroutines.internal.g>)o);
                if (a == kotlinx.coroutines.internal.f.b()) {
                    b = kotlinx.coroutines.internal.f.b();
                    break;
                }
                h0 h0 = (h0)a;
                if (h0 == null) {
                    final i c = h.c(((h0)o).o() + 1L, (i)o);
                    if (!((kotlinx.coroutines.internal.g<h0<kotlinx.coroutines.internal.g>>)o).m((h0<kotlinx.coroutines.internal.g>)c)) {
                        continue Label_0122_Outer;
                    }
                    h0 = c;
                    if (((h0)o).g()) {
                        ((kotlinx.coroutines.internal.g)o).l();
                        h0 = c;
                    }
                }
                o = h0;
            }
            b2 = i0.b(b);
            final boolean h2 = i0.h(b2);
            n2 = 1;
            if (h2) {
                break;
            }
            final h0 f = i0.f(b2);
            boolean b3 = false;
        Label_0172:
            while (true) {
                h0 h3 = null;
                Block_5: {
                    Block_4: {
                        while (true) {
                            h3 = (h0)this.tail;
                            if (h3.o() >= f.o()) {
                                break;
                            }
                            if (!f.r()) {
                                break Block_4;
                            }
                            if (kotlinx.coroutines.sync.g.e.compareAndSet(this, h3, f)) {
                                break Block_5;
                            }
                            if (!f.n()) {
                                continue Label_0122_Outer;
                            }
                            f.l();
                        }
                        b3 = true;
                        break Label_0172;
                    }
                    b3 = false;
                    break Label_0172;
                }
                if (h3.n()) {
                    h3.l();
                }
                continue;
            }
            if (b3) {
                break;
            }
        }
        final i j = i0.f(b2);
        final int k = (int)(andIncrement % h.h());
        if (j.e.compareAndSet(k, null, newValue)) {
            newValue.t((l<? super Throwable, j2>)new a(j, k));
            return true;
        }
        if (j.e.compareAndSet(k, h.g(), h.i())) {
            newValue.Z(j2.a, this.a);
            return true;
        }
        if (w0.b()) {
            int n3;
            if (j.e.get(k) == h.d()) {
                n3 = n2;
            }
            else {
                n3 = 0;
            }
            if (n3 == 0) {
                throw new AssertionError();
            }
        }
        return false;
    }
    
    private final boolean h(final o<? super j2> o) {
        final Object s = o.S(j2.a, null, this.a);
        if (s != null) {
            o.f0(s);
            return true;
        }
        return false;
    }
    
    private final boolean i() {
        final i i = (i)this.head;
        final long andIncrement = kotlinx.coroutines.sync.g.d.getAndIncrement(this);
        final long n = andIncrement / h.h();
        Object b2 = null;
        int n2 = 0;
    Label_0122_Outer:
        while (true) {
            Object o = i;
            Object b;
            while (true) {
                if (((h0)o).o() >= n) {
                    b = o;
                    if (!((h0)o).g()) {
                        break;
                    }
                }
                final Object a = kotlinx.coroutines.internal.g.a((kotlinx.coroutines.internal.g<kotlinx.coroutines.internal.g>)o);
                if (a == kotlinx.coroutines.internal.f.b()) {
                    b = kotlinx.coroutines.internal.f.b();
                    break;
                }
                h0 h0 = (h0)a;
                if (h0 == null) {
                    final i c = h.c(((h0)o).o() + 1L, (i)o);
                    if (!((kotlinx.coroutines.internal.g<h0<kotlinx.coroutines.internal.g>>)o).m((h0<kotlinx.coroutines.internal.g>)c)) {
                        continue Label_0122_Outer;
                    }
                    h0 = c;
                    if (((h0)o).g()) {
                        ((kotlinx.coroutines.internal.g)o).l();
                        h0 = c;
                    }
                }
                o = h0;
            }
            b2 = i0.b(b);
            final boolean h2 = i0.h(b2);
            n2 = 0;
            if (h2) {
                break;
            }
            final h0 f = i0.f(b2);
            boolean b3 = false;
        Label_0172:
            while (true) {
                h0 h3 = null;
                Block_5: {
                    Block_4: {
                        while (true) {
                            h3 = (h0)this.head;
                            if (h3.o() >= f.o()) {
                                break;
                            }
                            if (!f.r()) {
                                break Block_4;
                            }
                            if (kotlinx.coroutines.sync.g.c.compareAndSet(this, h3, f)) {
                                break Block_5;
                            }
                            if (!f.n()) {
                                continue Label_0122_Outer;
                            }
                            f.l();
                        }
                        b3 = true;
                        break Label_0172;
                    }
                    b3 = false;
                    break Label_0172;
                }
                if (h3.n()) {
                    h3.l();
                }
                continue;
            }
            if (b3) {
                break;
            }
        }
        final i j = i0.f(b2);
        j.b();
        if (j.o() > n) {
            return false;
        }
        final int k = (int)(andIncrement % h.h());
        final k0 andSet = j.e.getAndSet(k, h.g());
        if (andSet == null) {
            for (int f2 = h.f(), l = n2; l < f2; ++l) {
                if (j.e.get(k) == h.i()) {
                    return true;
                }
            }
            return j.e.compareAndSet(k, h.g(), h.d()) ^ true;
        }
        return andSet != h.e() && this.h((o<? super j2>)andSet);
    }
    
    @Override
    public int a() {
        return Math.max(this._availablePermits, 0);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(@e final d<? super j2> d) {
        if (kotlinx.coroutines.sync.g.g.getAndDecrement(this) > 0) {
            return j2.a;
        }
        final Object f = this.f(d);
        if (f == kotlin.coroutines.intrinsics.b.h()) {
            return f;
        }
        return j2.a;
    }
    
    @Override
    public boolean c() {
        int availablePermits;
        do {
            availablePermits = this._availablePermits;
            if (availablePermits <= 0) {
                return false;
            }
        } while (!kotlinx.coroutines.sync.g.g.compareAndSet(this, availablePermits, availablePermits - 1));
        return true;
    }
    
    final /* synthetic */ Object f(final d<? super j2> d) {
        final p<j2> b = (p<j2>)r.b((kotlin.coroutines.d<? super Object>)kotlin.coroutines.intrinsics.b.d((d)d));
        while (true) {
            while (!this.g(b)) {
                if (kotlinx.coroutines.sync.g.g.getAndDecrement(this) > 0) {
                    b.Z(j2.a, (l<? super Throwable, j2>)e(this));
                    final Object y = b.y();
                    if (y == kotlin.coroutines.intrinsics.b.h()) {
                        kotlin.coroutines.jvm.internal.h.c((d)d);
                    }
                    return y;
                }
            }
            continue;
        }
    }
    
    @Override
    public void release() {
        while (true) {
            final int availablePermits = this._availablePermits;
            if (availablePermits >= this.b) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The number of released permits cannot be greater than ");
                sb.append(this.b);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (!kotlinx.coroutines.sync.g.g.compareAndSet(this, availablePermits, availablePermits + 1)) {
                continue;
            }
            if (availablePermits >= 0) {
                return;
            }
            if (this.i()) {
                return;
            }
        }
    }
}
