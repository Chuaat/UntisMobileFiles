// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.j;
import kotlin.coroutines.g;
import kotlinx.coroutines.channels.n;
import org.jetbrains.annotations.e;
import m6.d;
import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001c\u0010\u001c\u001a\u00020\u00188\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d" }, d2 = { "T", "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e0;", "a", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lkotlin/j2;", "h", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/j0;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/flow/i;", "e", "Lkotlinx/coroutines/internal/k0;", "Lkotlinx/coroutines/internal/k0;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class m0
{
    @d
    @e
    public static final k0 a;
    
    static {
        a = new k0("NO_VALUE");
    }
    
    @e
    public static final <T> e0<T> a(final int i, int j, @e final n obj) {
        final boolean b = true;
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("replay cannot be negative, but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (j < 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("extraBufferCapacity cannot be negative, but was ");
            sb2.append(j);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int n = b ? 1 : 0;
        if (i <= 0) {
            n = (b ? 1 : 0);
            if (j <= 0) {
                if (obj == kotlinx.coroutines.channels.n.G) {
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
        }
        if (n != 0) {
            if ((j += i) < 0) {
                j = Integer.MAX_VALUE;
            }
            return new kotlinx.coroutines.flow.k0<T>(i, j, obj);
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
        sb3.append(obj);
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    @e
    public static final <T> i<T> e(@e final j0<? extends T> j0, @e final g g, final int n, @e final n n2) {
        if ((n == 0 || n == -3) && n2 == n.G) {
            return (i<T>)j0;
        }
        return (i<T>)new j(j0, g, n, n2);
    }
    
    private static final Object f(final Object[] array, final long n) {
        return array[array.length - 1 & (int)n];
    }
    
    private static final void h(final Object[] array, final long n, final Object o) {
        array[array.length - 1 & (int)n] = o;
    }
}
