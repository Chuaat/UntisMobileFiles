// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import c7.a;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import n6.l;
import kotlinx.coroutines.selects.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B6\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "Lkotlinx/coroutines/l3;", "R", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/j2;", "J0", "Lkotlinx/coroutines/selects/f;", "K", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "<init>", "(Lkotlinx/coroutines/selects/f;Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class l3<R> extends r2
{
    private final f<R> K;
    private final l<kotlin.coroutines.d<? super R>, Object> L;
    
    public l3(@org.jetbrains.annotations.e final f<? super R> k, @org.jetbrains.annotations.e final l<? super kotlin.coroutines.d<? super R>, ?> l) {
        this.K = (f<R>)k;
        this.L = (l<kotlin.coroutines.d<? super R>, Object>)l;
    }
    
    @Override
    public void J0(@org.jetbrains.annotations.f final Throwable t) {
        if (this.K.l()) {
            c7.a.c((n6.l<? super kotlin.coroutines.d<? super Object>, ?>)this.L, (kotlin.coroutines.d<? super Object>)this.K.w());
        }
    }
}
