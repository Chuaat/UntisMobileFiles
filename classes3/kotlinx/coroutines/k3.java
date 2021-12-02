// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import n6.p;
import kotlinx.coroutines.selects.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B<\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "Lkotlinx/coroutines/k3;", "T", "R", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/j2;", "J0", "Lkotlinx/coroutines/selects/f;", "K", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "<init>", "(Lkotlinx/coroutines/selects/f;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class k3<T, R> extends r2
{
    private final f<R> K;
    private final p<T, kotlin.coroutines.d<? super R>, Object> L;
    
    public k3(@org.jetbrains.annotations.e final f<? super R> k, @org.jetbrains.annotations.e final p<? super T, ? super kotlin.coroutines.d<? super R>, ?> l) {
        this.K = (f<R>)k;
        this.L = (p<T, kotlin.coroutines.d<? super R>, Object>)l;
    }
    
    @Override
    public void J0(@org.jetbrains.annotations.f final Throwable t) {
        if (this.K.l()) {
            this.K0().f1((f<? super Object>)this.K, (n6.p<? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)this.L);
        }
    }
}
