// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/j2;", "J0", "Lkotlinx/coroutines/l1;", "K", "Lkotlinx/coroutines/l1;", "handle", "<init>", "(Lkotlinx/coroutines/l1;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class n1 extends r2
{
    private final l1 K;
    
    public n1(@org.jetbrains.annotations.e final l1 k) {
        this.K = k;
    }
    
    @Override
    public void J0(@f final Throwable t) {
        this.K.dispose();
    }
}
