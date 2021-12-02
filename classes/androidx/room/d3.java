// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import kotlin.coroutines.g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k2$a;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b$a;
import n6.p;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.k2;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.e;
import androidx.annotation.t0;
import kotlin.Metadata;
import kotlin.coroutines.g$b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b" }, d2 = { "Landroidx/room/d3;", "Lkotlin/coroutines/g$b;", "Lkotlin/j2;", "e", "k", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "Ljava/util/concurrent/atomic/AtomicInteger;", "G", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Lkotlinx/coroutines/k2;", "H", "Lkotlinx/coroutines/k2;", "transactionThreadControlJob", "Lkotlin/coroutines/e;", "I", "Lkotlin/coroutines/e;", "i", "()Lkotlin/coroutines/e;", "transactionDispatcher", "<init>", "(Lkotlinx/coroutines/k2;Lkotlin/coroutines/e;)V", "J", "a", "room-ktx_release" }, k = 1, mv = { 1, 4, 2 })
@t0({ t0.a.H })
public final class d3 implements g$b
{
    @e
    public static final a J;
    private final AtomicInteger G;
    private final k2 H;
    @e
    private final kotlin.coroutines.e I;
    
    static {
        J = new a(null);
    }
    
    public d3(@e final k2 h, @e final kotlin.coroutines.e i) {
        k0.p((Object)h, "transactionThreadControlJob");
        k0.p((Object)i, "transactionDispatcher");
        this.H = h;
        this.I = i;
        this.G = new AtomicInteger(0);
    }
    
    public final void e() {
        this.G.incrementAndGet();
    }
    
    public <R> R fold(final R r, @e final p<? super R, ? super g$b, ? extends R> p2) {
        k0.p((Object)p2, "operation");
        return (R)g$b$a.a((g$b)this, (Object)r, (p)p2);
    }
    
    @f
    public <E extends g$b> E get(@e final g$c<E> g$c) {
        k0.p((Object)g$c, "key");
        return (E)g$b$a.b((g$b)this, (g$c)g$c);
    }
    
    @e
    public g$c<d3> getKey() {
        return (g$c<d3>)d3.J;
    }
    
    @e
    public final kotlin.coroutines.e i() {
        return this.I;
    }
    
    public final void k() {
        final int decrementAndGet = this.G.decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet == 0) {
                k2$a.b(this.H, (CancellationException)null, 1, (Object)null);
            }
            return;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    }
    
    @e
    public g minusKey(@e final g$c<?> g$c) {
        k0.p((Object)g$c, "key");
        return g$b$a.c((g$b)this, (g$c)g$c);
    }
    
    @e
    public g plus(@e final g g) {
        k0.p((Object)g, "context");
        return g$b$a.d((g$b)this, g);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "androidx/room/d3$a", "Lkotlin/coroutines/g$c;", "Landroidx/room/d3;", "<init>", "()V", "room-ktx_release" }, k = 1, mv = { 1, 4, 2 })
    public static final class a implements g$c<d3>
    {
        private a() {
        }
    }
}
