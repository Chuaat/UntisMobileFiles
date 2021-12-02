// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.w;
import org.jetbrains.annotations.e;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.w0;
import org.jetbrains.annotations.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u001b\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u001d\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001f\u001a\u00020\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010!\u001a\u00028\u00008B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016¨\u0006$" }, d2 = { "Lkotlinx/coroutines/internal/g;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "k", "(Ln6/a;)Lkotlinx/coroutines/internal/g;", "value", "", "m", "(Lkotlinx/coroutines/internal/g;)Z", "Lkotlin/j2;", "b", "()V", "j", "()Z", "l", "e", "()Ljava/lang/Object;", "nextOrClosed", "c", "()Lkotlinx/coroutines/internal/g;", "leftmostAliveNode", "f", "prev", "d", "next", "i", "isTail", "g", "removed", "h", "rightmostAliveNode", "<init>", "(Lkotlinx/coroutines/internal/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class g<N extends g<N>>
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater a;
    private static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private volatile /* synthetic */ Object _next;
    private volatile /* synthetic */ Object _prev;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_next");
        b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_prev");
    }
    
    public g(@f final N prev) {
        this._next = null;
        this._prev = prev;
    }
    
    private final N c() {
        g<N> f;
        for (f = this.f(); f != null && f.g(); f = (g)f._prev) {}
        return (N)f;
    }
    
    private final Object e() {
        return this._next;
    }
    
    private final N h() {
        if (w0.b() && !(this.i() ^ true)) {
            throw new AssertionError();
        }
        g<N> g = this.d();
        while (true) {
            k0.m((Object)g);
            if (!g.g()) {
                break;
            }
            g = (g<N>)g.d();
        }
        return (N)g;
    }
    
    public final void b() {
        g.b.lazySet(this, null);
    }
    
    @f
    public final N d() {
        final Object a = this.e();
        if (a == kotlinx.coroutines.internal.f.b()) {
            return null;
        }
        return (N)a;
    }
    
    @f
    public final N f() {
        return (N)this._prev;
    }
    
    public abstract boolean g();
    
    public final boolean i() {
        return this.d() == null;
    }
    
    public final boolean j() {
        return g.a.compareAndSet(this, null, kotlinx.coroutines.internal.f.b());
    }
    
    @f
    public final N k(@e final a a) {
        final Object a2 = this.e();
        if (a2 != kotlinx.coroutines.internal.f.b()) {
            return (N)a2;
        }
        a.invoke();
        throw new w();
    }
    
    public final void l() {
        if (w0.b() && !this.g()) {
            throw new AssertionError();
        }
        if (w0.b()) {
            if (!(this.i() ^ true)) {
                throw new AssertionError();
            }
        }
        while (true) {
            final g<N> c = this.c();
            final g<N> h = (g<N>)this.h();
            if ((h._prev = c) != null) {
                c._next = h;
            }
            if (h.g()) {
                continue;
            }
            if (c != null && c.g()) {
                continue;
            }
            break;
        }
    }
    
    public final boolean m(@e final N n) {
        return g.a.compareAndSet(this, null, n);
    }
}
