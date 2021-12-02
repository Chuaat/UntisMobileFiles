// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/z2;", "Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/u;", "Lkotlin/j2;", "dispose", "", "cause", "", "p", "", "toString", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public final class z2 implements l1, u
{
    @e
    public static final z2 G;
    
    static {
        G = new z2();
    }
    
    private z2() {
    }
    
    @Override
    public void dispose() {
    }
    
    @Override
    public boolean p(@e final Throwable t) {
        return false;
    }
    
    @e
    @Override
    public String toString() {
        return "NonDisposableHandle";
    }
}
