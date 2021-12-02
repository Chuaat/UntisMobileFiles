// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006" }, d2 = { "Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/scheduling/j;", "", "a", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class h extends j
{
    @e
    public static final h a;
    
    static {
        a = new h();
    }
    
    private h() {
    }
    
    @Override
    public long a() {
        return System.nanoTime();
    }
}
