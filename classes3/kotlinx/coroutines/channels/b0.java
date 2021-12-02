// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import c7.a;
import kotlin.coroutines.intrinsics.b;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f¢\u0006\u0002\b\u0012\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016" }, d2 = { "Lkotlinx/coroutines/channels/b0;", "E", "Lkotlinx/coroutines/channels/l;", "Lkotlinx/coroutines/channels/h0;", "L", "Lkotlin/j2;", "w1", "Lkotlin/coroutines/d;", "K", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/g;", "parentContext", "Lkotlinx/coroutines/channels/j;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/f0;", "", "Lkotlin/s;", "block", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/j;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class b0<E> extends l<E>
{
    private final d<j2> K;
    
    public b0(@e final g g, @e final j<E> j, @e final p<? super f0<? super E>, ? super d<? super j2>, ?> p3) {
        super(g, j, false);
        this.K = (d<j2>)b.c((p)p3, (Object)this, (d)this);
    }
    
    @e
    @Override
    public h0<E> L() {
        final h0<E> l = this.z1().L();
        this.start();
        return l;
    }
    
    @Override
    protected void w1() {
        a.b(this.K, (d<?>)this);
    }
}
