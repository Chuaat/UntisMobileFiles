// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.b1$a;
import kotlin.b1;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/g3;", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/j2;", "J0", "Lkotlin/coroutines/d;", "K", "Lkotlin/coroutines/d;", "continuation", "<init>", "(Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class g3 extends r2
{
    private final kotlin.coroutines.d<j2> K;
    
    public g3(@org.jetbrains.annotations.e final kotlin.coroutines.d<? super j2> k) {
        this.K = (kotlin.coroutines.d<j2>)k;
    }
    
    @Override
    public void J0(@f final Throwable t) {
        final kotlin.coroutines.d<j2> k = this.K;
        final j2 a = j2.a;
        final b1$a h = b1.H;
        k.resumeWith(b1.b((Object)a));
    }
}
