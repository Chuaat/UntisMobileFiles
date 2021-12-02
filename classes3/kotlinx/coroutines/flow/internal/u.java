// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.i;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlin.coroutines.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c2\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010" }, d2 = { "Lkotlinx/coroutines/flow/internal/u;", "Lkotlin/coroutines/d;", "", "Lkotlin/b1;", "result", "Lkotlin/j2;", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/g;", "G", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class u implements d<Object>
{
    @e
    private static final g G;
    @e
    public static final u H;
    
    static {
        H = new u();
        G = (g)i.H;
    }
    
    private u() {
    }
    
    @e
    public g getContext() {
        return u.G;
    }
    
    public void resumeWith(@e final Object o) {
    }
}
