// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/m2;", "Lkotlinx/coroutines/u;", "", "cause", "Lkotlin/j2;", "J0", "", "p", "Lkotlinx/coroutines/w;", "K", "Lkotlinx/coroutines/w;", "childJob", "<init>", "(Lkotlinx/coroutines/w;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class v extends m2 implements u
{
    @m6.d
    @org.jetbrains.annotations.e
    public final w K;
    
    public v(@org.jetbrains.annotations.e final w k) {
        this.K = k;
    }
    
    @Override
    public void J0(@f final Throwable t) {
        this.K.y(this.K0());
    }
    
    @Override
    public boolean p(@org.jetbrains.annotations.e final Throwable t) {
        return this.K0().o0(t);
    }
}
