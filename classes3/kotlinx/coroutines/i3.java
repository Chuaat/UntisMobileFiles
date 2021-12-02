// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\b\u0004\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\b*\n\u0010\u0006\"\u00020\u00032\u00020\u0003¨\u0006\u0007" }, d2 = { "Lkotlin/Function0;", "Lkotlin/j2;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "a", "Runnable", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class i3
{
    @e
    public static final Runnable a(@e final a<j2> a) {
        return new Runnable() {
            @Override
            public final void run() {
                a.invoke();
            }
        };
    }
}
