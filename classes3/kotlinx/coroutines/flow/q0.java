// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b" }, d2 = { "Lkotlinx/coroutines/flow/q0;", "", "Lkotlinx/coroutines/flow/v0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/o0;", "a", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface q0
{
    @e
    public static final a a = q0.a.c;
    
    @e
    i<o0> a(@e final v0<Integer> p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010" }, d2 = { "kotlinx/coroutines/flow/q0$a", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/q0;", "a", "b", "Lkotlinx/coroutines/flow/q0;", "d", "()Lkotlinx/coroutines/flow/q0;", "Lazily", "c", "Eagerly", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a
    {
        @e
        private static final q0 a;
        @e
        private static final q0 b;
        static final /* synthetic */ a c;
        
        static {
            c = new a();
            a = new s0();
            b = new t0();
        }
        
        private a() {
        }
        
        @e
        public final q0 a(final long n, final long n2) {
            return new u0(n, n2);
        }
        
        @e
        public final q0 c() {
            return q0.a.a;
        }
        
        @e
        public final q0 d() {
            return q0.a.b;
        }
    }
}
