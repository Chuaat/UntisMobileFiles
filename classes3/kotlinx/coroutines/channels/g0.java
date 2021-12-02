// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;
import kotlinx.coroutines.internal.t;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&J%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013" }, d2 = { "Lkotlinx/coroutines/channels/g0;", "E", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/channels/i0;", "Lkotlinx/coroutines/channels/v;", "closed", "Lkotlin/j2;", "L0", "value", "Lkotlin/Function1;", "", "K0", "(Ljava/lang/Object;)Ln6/l;", "Lkotlinx/coroutines/internal/k0;", "J0", "()Lkotlinx/coroutines/internal/k0;", "offerResult", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class g0<E> extends t implements i0<E>
{
    @org.jetbrains.annotations.e
    public k0 J0() {
        return kotlinx.coroutines.channels.b.e;
    }
    
    @f
    public l<Throwable, j2> K0(final E e) {
        return null;
    }
    
    public abstract void L0(@org.jetbrains.annotations.e final v<?> p0);
}
