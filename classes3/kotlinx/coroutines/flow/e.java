// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.flow.internal.a0;
import kotlinx.coroutines.channels.f0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.r0;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import kotlinx.coroutines.channels.h0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.f;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0006\u0010(\u001a\u00020%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0094@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006." }, d2 = { "Lkotlinx/coroutines/flow/e;", "T", "Lkotlinx/coroutines/flow/internal/f;", "Lkotlin/j2;", "q", "()V", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "k", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)Lkotlinx/coroutines/flow/internal/f;", "Lkotlinx/coroutines/flow/i;", "m", "()Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/channels/f0;", "scope", "h", "(Lkotlinx/coroutines/channels/f0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/u0;", "start", "Lkotlinx/coroutines/channels/j;", "f", "(Lkotlinx/coroutines/r0;Lkotlinx/coroutines/u0;)Lkotlinx/coroutines/channels/j;", "Lkotlinx/coroutines/channels/h0;", "p", "(Lkotlinx/coroutines/r0;)Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/flow/j;", "collector", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "()Ljava/lang/String;", "", "K", "Z", "consume", "J", "Lkotlinx/coroutines/channels/h0;", "channel", "<init>", "(Lkotlinx/coroutines/channels/h0;ZLkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class e<T> extends f<T>
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater L;
    private final h0<T> J;
    private final boolean K;
    private volatile /* synthetic */ int consumed;
    
    static {
        L = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed");
    }
    
    public e(@org.jetbrains.annotations.e final h0<? extends T> j, final boolean k, @org.jetbrains.annotations.e final g g, final int n, @org.jetbrains.annotations.e final n n2) {
        super(g, n, n2);
        this.J = (h0<T>)j;
        this.K = k;
        this.consumed = 0;
    }
    
    private final void q() {
        if (this.K) {
            final AtomicIntegerFieldUpdater l = e.L;
            boolean b = true;
            if (l.getAndSet(this, 1) != 0) {
                b = false;
            }
            if (!b) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@org.jetbrains.annotations.e final j<? super T> j, @org.jetbrains.annotations.e final d<? super j2> d) {
        if (super.H == -3) {
            this.q();
            final Object f = kotlinx.coroutines.flow.n.f((j<? super Object>)j, (h0<?>)this.J, this.K, d);
            if (f == b.h()) {
                return f;
            }
        }
        else {
            final Object c = super.c(j, d);
            if (c == b.h()) {
                return c;
            }
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected String e() {
        final StringBuilder sb = new StringBuilder();
        sb.append("channel=");
        sb.append(this.J);
        return sb.toString();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlinx.coroutines.channels.j<T> f(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.e final u0 u0) {
        this.q();
        return super.f(r0, u0);
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object h(@org.jetbrains.annotations.e final f0<? super T> f0, @org.jetbrains.annotations.e final d<? super j2> d) {
        final Object f2 = kotlinx.coroutines.flow.n.f((j<? super Object>)new a0<Object>((l0<? super Object>)f0), (h0<?>)this.J, this.K, d);
        if (f2 == b.h()) {
            return f2;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected f<T> k(@org.jetbrains.annotations.e final g g, final int n, @org.jetbrains.annotations.e final n n2) {
        return new e(this.J, this.K, g, n, n2);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public i<T> m() {
        return new e(this.J, this.K, null, 0, null, 28, null);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public h0<T> p(@org.jetbrains.annotations.e final r0 r0) {
        this.q();
        h0<T> h0;
        if (super.H == -3) {
            h0 = this.J;
        }
        else {
            h0 = super.p(r0);
        }
        return h0;
    }
}
