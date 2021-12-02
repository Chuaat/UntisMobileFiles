// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlin.k;
import kotlin.i;
import kotlin.coroutines.d;
import kotlinx.coroutines.z1;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.selects.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J-\u0010\u0011\u001a\u00020\u00042#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\rH'R\u001c\u0010\u0016\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00178&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u00078&@'X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001b\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e" }, d2 = { "Lkotlinx/coroutines/channels/l0;", "E", "", "element", "Lkotlin/j2;", "U", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "", "cause", "I", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "handler", "K", "W", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Lkotlinx/coroutines/selects/e;", "A", "()Lkotlinx/coroutines/selects/e;", "onSend", "z", "isFull$annotations", "isFull", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface l0<E>
{
    @org.jetbrains.annotations.e
    e<E, l0<E>> A();
    
    boolean I(@f final Throwable p0);
    
    @z1
    void K(@org.jetbrains.annotations.e final l<? super Throwable, j2> p0);
    
    @f
    Object U(final E p0, @org.jetbrains.annotations.e final d<? super j2> p1);
    
    boolean W();
    
    boolean offer(final E p0);
    
    boolean z();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
    }
}
