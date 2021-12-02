// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.z1;
import kotlinx.coroutines.b3;
import kotlin.internal.g;
import kotlin.z0;
import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H§@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH¦\u0002J\u001a\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&J\b\u0010\u0011\u001a\u00020\u000fH\u0017J\u0014\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0012H'R+\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00158&@'X§\u0004\u00f8\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u001d\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u001eR$\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158&@'X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&" }, d2 = { "Lkotlinx/coroutines/channels/h0;", "E", "", "B", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "v", "Lkotlinx/coroutines/channels/r0;", "O", "poll", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/q;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/j2;", "d", "cancel", "", "", "c", "Lkotlinx/coroutines/selects/d;", "M", "()Lkotlinx/coroutines/selects/d;", "getOnReceiveOrClosed$annotations", "()V", "onReceiveOrClosed", "m", "onReceive", "isEmpty", "()Z", "isEmpty$annotations", "l", "isClosedForReceive$annotations", "isClosedForReceive", "p", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface h0<E>
{
    @f
    Object B(@e final d<? super E> p0);
    
    @e
    kotlinx.coroutines.selects.d<r0<E>> M();
    
    @f2
    @f
    Object O(@e final d<? super r0<? extends E>> p0);
    
    void d(@f final CancellationException p0);
    
    boolean isEmpty();
    
    @e
    q<E> iterator();
    
    boolean l();
    
    @e
    kotlinx.coroutines.selects.d<E> m();
    
    @e
    kotlinx.coroutines.selects.d<E> p();
    
    @f
    E poll();
    
    @i(level = k.G, message = "Deprecated in favor of receiveOrClosed and receiveOrNull extension", replaceWith = @z0(expression = "receiveOrNull", imports = { "kotlinx.coroutines.channels.receiveOrNull" }))
    @g
    @b3
    @f
    Object v(@e final d<? super E> p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
    }
}
