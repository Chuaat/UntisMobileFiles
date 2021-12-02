// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.b3;
import kotlin.z0;
import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.z1;
import n6.l;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.j2;
import kotlinx.coroutines.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B%\u0012\u0006\u0010?\u001a\u00020>\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010@\u001a\u00020\b¢\u0006\u0004\bA\u0010BJ\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0016\u0010\f\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0013\u0010\u000e\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0001J.\u0010\u0013\u001a\u00020\u00032#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\u000fH\u0097\u0001J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0003J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00028\u0000H\u0096A\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0097A\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0097A\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ\u001b\u0010 \u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00028\u0000H\u0096A\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!R\"\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R%\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0'8\u0016@\u0017X\u0097\u0005\u00f8\u0001\u0000¢\u0006\u0006\u001a\u0004\b(\u0010)R(\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0019\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b0\u0010%R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000'8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u0010)R\u001e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'8\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u0010)R\u0016\u00108\u001a\u00020\b8\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\b8\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b9\u00107R\u0016\u0010<\u001a\u00020\b8\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b;\u00107R\u0016\u0010=\u001a\u00020\b8\u0016@\u0017X\u0097\u0005¢\u0006\u0006\u001a\u0004\b=\u00107\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006C" }, d2 = { "Lkotlinx/coroutines/channels/p;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/j2;", "Lkotlinx/coroutines/channels/o;", "cancel", "", "cause", "", "c", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d", "k0", "I", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "handler", "K", "Lkotlinx/coroutines/channels/q;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "B", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/r0;", "O", "v", "U", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "J", "Lkotlinx/coroutines/channels/o;", "z1", "()Lkotlinx/coroutines/channels/o;", "_channel", "Lkotlinx/coroutines/selects/d;", "M", "()Lkotlinx/coroutines/selects/d;", "onReceiveOrClosed", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/l0;", "A", "()Lkotlinx/coroutines/selects/e;", "onSend", "e", "channel", "m", "onReceive", "p", "onReceiveOrNull", "W", "()Z", "isClosedForSend", "l", "isClosedForReceive", "z", "isFull", "isEmpty", "Lkotlin/coroutines/g;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/o;Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class p<E> extends a<j2> implements o<E>
{
    @e
    private final o<E> J;
    
    public p(@e final g g, @e final o<E> j, final boolean b) {
        super(g, b);
        this.J = j;
    }
    
    static /* synthetic */ Object A1(final p p2, final d d) {
        return p2.J.B((kotlin.coroutines.d<? super Object>)d);
    }
    
    static /* synthetic */ Object B1(final p p2, final d d) {
        return p2.J.O((kotlin.coroutines.d<? super kotlinx.coroutines.channels.r0<?>>)d);
    }
    
    static /* synthetic */ Object C1(final p p2, final d d) {
        return p2.J.v((kotlin.coroutines.d<? super Object>)d);
    }
    
    static /* synthetic */ Object D1(final p p3, final Object o, final d d) {
        return p3.J.U((E)o, (d<? super j2>)d);
    }
    
    @e
    public kotlinx.coroutines.selects.e<E, l0<E>> A() {
        return this.J.A();
    }
    
    @f
    public Object B(@e final d<? super E> d) {
        return A1(this, d);
    }
    
    public boolean I(@f final Throwable t) {
        return this.J.I(t);
    }
    
    @z1
    public void K(@e final l<? super Throwable, j2> l) {
        this.J.K(l);
    }
    
    @e
    public kotlinx.coroutines.selects.d<kotlinx.coroutines.channels.r0<E>> M() {
        return this.J.M();
    }
    
    @f2
    @f
    public Object O(@e final d<? super kotlinx.coroutines.channels.r0<? extends E>> d) {
        return B1(this, d);
    }
    
    @f
    public Object U(final E e, @e final d<? super j2> d) {
        return D1(this, e, d);
    }
    
    public boolean W() {
        return this.J.W();
    }
    
    @Override
    public final void d(@f CancellationException ex) {
        if (this.isCancelled()) {
            return;
        }
        if (ex == null) {
            ex = new l2(s2.a0(this), null, this);
        }
        this.k0(ex);
    }
    
    @e
    public final o<E> e() {
        return this;
    }
    
    public boolean isEmpty() {
        return this.J.isEmpty();
    }
    
    @e
    public q<E> iterator() {
        return this.J.iterator();
    }
    
    @Override
    public void k0(@e final Throwable t) {
        final CancellationException k1 = s2.k1(this, t, null, 1, null);
        this.J.d(k1);
        this.i0(k1);
    }
    
    public boolean l() {
        return this.J.l();
    }
    
    @e
    public kotlinx.coroutines.selects.d<E> m() {
        return this.J.m();
    }
    
    public boolean offer(final E e) {
        return this.J.offer(e);
    }
    
    @e
    public kotlinx.coroutines.selects.d<E> p() {
        return this.J.p();
    }
    
    @f
    public E poll() {
        return this.J.poll();
    }
    
    @i(level = k.G, message = "Deprecated in favor of receiveOrClosed and receiveOrNull extension", replaceWith = @z0(expression = "receiveOrNull", imports = { "kotlinx.coroutines.channels.receiveOrNull" }))
    @kotlin.internal.g
    @b3
    @f
    public Object v(@e final d<? super E> d) {
        return C1(this, d);
    }
    
    public boolean z() {
        return this.J.z();
    }
    
    @e
    protected final o<E> z1() {
        return this.J;
    }
}
