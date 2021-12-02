// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.flow.internal.w;
import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0000\"\u001c\u0010\u0015\u001a\u00020\u00118\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"\u001c\u0010\u0018\u001a\u00020\u00118\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u0012\u0004\b\u0017\u0010\u0014¨\u0006\u0019" }, d2 = { "T", "value", "Lkotlinx/coroutines/flow/f0;", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/f0;", "", "delta", "Lkotlin/j2;", "g", "Lkotlinx/coroutines/flow/v0;", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "Lkotlinx/coroutines/internal/k0;", "Lkotlinx/coroutines/internal/k0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class x0
{
    private static final k0 a;
    private static final k0 b;
    
    static {
        a = new k0("NONE");
        b = new k0("PENDING");
    }
    
    @e
    public static final <T> f0<T> a(T a) {
        if (a == null) {
            a = (T)w.a;
        }
        return new w0<T>(a);
    }
    
    @e
    public static final <T> i<T> d(@e final v0<? extends T> v0, @e final g g, final int n, @e final n n2) {
        if (kotlinx.coroutines.w0.b() && n == -1) {
            throw new AssertionError();
        }
        if (((n >= 0 && 1 >= n) || n == -2) && n2 == n.H) {
            return (i<T>)v0;
        }
        return m0.e((j0<? extends T>)v0, g, n, n2);
    }
    
    public static final void g(@e final f0<Integer> f0, final int n) {
        int intValue;
        do {
            intValue = f0.getValue().intValue();
        } while (!f0.compareAndSet(intValue, intValue + n));
    }
}
