// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import org.jetbrains.annotations.e;
import kotlinx.coroutines.z1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005" }, d2 = { "E", "", "capacity", "Lkotlinx/coroutines/channels/j;", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class k
{
    @z1
    @e
    public static final <E> j<E> a(final int n) {
        Object o;
        if (n != -2) {
            if (n != -1) {
                if (n == 0) {
                    throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
                }
                if (n == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                }
                o = new g<E>(n);
            }
            else {
                o = new y();
            }
        }
        else {
            o = new g<E>(kotlinx.coroutines.channels.o.u.a());
        }
        return (j<E>)o;
    }
}
