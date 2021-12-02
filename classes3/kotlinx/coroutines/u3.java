// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0007" }, d2 = { "", "name", "Lkotlinx/coroutines/v1;", "b", "", "nThreads", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class u3
{
    @b3
    @e
    public static final v1 a(final int i, @e final String s) {
        boolean b = true;
        if (i < 1) {
            b = false;
        }
        if (b) {
            return new t3(i, s);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected at least one thread, but ");
        sb.append(i);
        sb.append(" specified");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @b3
    @e
    public static final v1 b(@e final String s) {
        return a(1, s);
    }
}
