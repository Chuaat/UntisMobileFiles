// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.f0;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0094@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018" }, d2 = { "Lkotlinx/coroutines/flow/f;", "T", "Lkotlinx/coroutines/flow/internal/f;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "k", "Lkotlinx/coroutines/channels/f0;", "scope", "Lkotlin/j2;", "h", "(Lkotlinx/coroutines/channels/f0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "<init>", "(Ln6/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
class f<T> extends kotlinx.coroutines.flow.internal.f<T>
{
    private final p<f0<? super T>, d<? super j2>, Object> J;
    
    public f(@e final p<? super f0<? super T>, ? super d<? super j2>, ?> j, @e final g g, final int n, @e final n n2) {
        super(g, n, n2);
        this.J = (p<f0<? super T>, d<? super j2>, Object>)j;
    }
    
    static /* synthetic */ Object q(final f f, final f0 f2, final d d) {
        final Object invoke = f.J.invoke((Object)f2, (Object)d);
        if (invoke == b.h()) {
            return invoke;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object h(@e final f0<? super T> f0, @e final d<? super j2> d) {
        return q(this, f0, d);
    }
    
    @e
    @Override
    protected kotlinx.coroutines.flow.internal.f<T> k(@e final g g, final int n, @e final n n2) {
        return new f(this.J, g, n, n2);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("block[");
        sb.append(this.J);
        sb.append("] -> ");
        sb.append(super.toString());
        return sb.toString();
    }
}
