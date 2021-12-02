// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.o0;
import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.j2;
import kotlinx.coroutines.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00105\u001a\u000204\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b7\u00108J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0016\u0010\f\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0014J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J.\u0010\u0018\u001a\u00020\u00032#\u0010\u0017\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u0014H\u0097\u0001J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0001J\u001b\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00028\u0000H\u0096A\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\"\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010,\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)0(8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!R\u0016\u00100\u001a\u00020\b8\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b/\u0010!R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000)8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069" }, d2 = { "Lkotlinx/coroutines/channels/l;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/j2;", "Lkotlinx/coroutines/channels/f0;", "Lkotlinx/coroutines/channels/j;", "", "cause", "", "c", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d", "k0", "value", "A1", "(Lkotlin/j2;)V", "handled", "u1", "I", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "handler", "K", "element", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/h0;", "L", "U", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "W", "()Z", "isClosedForSend", "J", "Lkotlinx/coroutines/channels/j;", "z1", "()Lkotlinx/coroutines/channels/j;", "_channel", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/l0;", "A", "()Lkotlinx/coroutines/selects/e;", "onSend", "a", "isActive", "z", "isFull", "e", "()Lkotlinx/coroutines/channels/l0;", "channel", "Lkotlin/coroutines/g;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/j;Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
class l<E> extends a<j2> implements f0<E>, j<E>
{
    @e
    private final j<E> J;
    
    public l(@e final g g, @e final j<E> j, final boolean b) {
        super(g, b);
        this.J = j;
    }
    
    static /* synthetic */ Object B1(final l l, final Object o, final d d) {
        return l.J.U((E)o, (d<? super j2>)d);
    }
    
    @e
    public kotlinx.coroutines.selects.e<E, l0<E>> A() {
        return this.J.A();
    }
    
    protected void A1(@e final j2 j2) {
        l0.a.a(this.J, null, 1, null);
    }
    
    public boolean I(@f final Throwable t) {
        final boolean i = this.J.I(t);
        this.start();
        return i;
    }
    
    @z1
    public void K(@e final n6.l<? super Throwable, j2> l) {
        this.J.K(l);
    }
    
    @e
    @Override
    public h0<E> L() {
        return this.J.L();
    }
    
    @f
    public Object U(final E e, @e final d<? super j2> d) {
        return B1(this, e, d);
    }
    
    public boolean W() {
        return this.J.W();
    }
    
    @Override
    public boolean a() {
        return super.a();
    }
    
    @Override
    public final void d(@f CancellationException ex) {
        if (ex == null) {
            ex = new l2(s2.a0(this), null, this);
        }
        this.k0(ex);
    }
    
    @e
    @Override
    public l0<E> e() {
        return this;
    }
    
    @Override
    public void k0(@e final Throwable t) {
        final CancellationException k1 = s2.k1(this, t, null, 1, null);
        this.J.d(k1);
        this.i0(k1);
    }
    
    public boolean offer(final E e) {
        return this.J.offer(e);
    }
    
    @Override
    protected void u1(@e final Throwable t, final boolean b) {
        if (!this.J.I(t) && !b) {
            o0.b(this.getContext(), t);
        }
    }
    
    public boolean z() {
        return this.J.z();
    }
    
    @e
    protected final j<E> z1() {
        return this.J;
    }
}
