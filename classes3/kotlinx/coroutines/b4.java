// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g$c;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/b4;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/g;", "context", "", "K", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/j2;", "H", "", "toString", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class b4 extends m0
{
    @e
    public static final b4 H;
    
    static {
        H = new b4();
    }
    
    private b4() {
    }
    
    @Override
    public void H(@e final g g, @e final Runnable runnable) {
        final e4 e4 = (e4)g.get((g$c)kotlinx.coroutines.e4.H);
        if (e4 != null) {
            e4.G = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
    
    @Override
    public boolean K(@e final g g) {
        return false;
    }
    
    @e
    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
