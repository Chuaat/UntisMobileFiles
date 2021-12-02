// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.test;

import kotlin.jvm.internal.w;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.Collection;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\u0007" }, d2 = { "Lkotlinx/coroutines/test/a;", "testContext", "Lkotlin/Function1;", "Lkotlin/j2;", "Lkotlin/s;", "testBody", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class b
{
    @i(level = k.G, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @z0(expression = "testContext.runBlockingTest(testBody)", imports = { "kotlin.coroutines.test" }))
    public static final void a(@e final a a, @e final l<? super a, j2> l) {
        l.invoke((Object)a);
        final List<Throwable> i = a.L();
        final boolean b = i instanceof Collection;
        final boolean b2 = true;
        int n = 0;
        Label_0076: {
            if (b && i.isEmpty()) {
                n = (b2 ? 1 : 0);
            }
            else {
                final Iterator<Object> iterator = i.iterator();
                do {
                    n = (b2 ? 1 : 0);
                    if (iterator.hasNext()) {
                        continue;
                    }
                    break Label_0076;
                } while (((Throwable)iterator.next()) instanceof CancellationException);
                n = 0;
            }
        }
        if (n != 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Coroutine encountered unhandled exceptions:\n");
        sb.append(a.L());
        throw new AssertionError((Object)sb.toString());
    }
}
