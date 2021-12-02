// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004" }, d2 = { "Lkotlinx/coroutines/p1;", "a", "", "b", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class s1
{
    @e
    public static final p1 a() {
        return new g(Thread.currentThread());
    }
    
    @f2
    public static final long b() {
        final p1 a = s3.b.a();
        long i0;
        if (a != null) {
            i0 = a.i0();
        }
        else {
            i0 = Long.MAX_VALUE;
        }
        return i0;
    }
}
