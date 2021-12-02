// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b;
import n6.p;
import org.jetbrains.annotations.e;
import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¨\u0006\u0005" }, d2 = { "Lkotlinx/coroutines/c3;", "Lkotlinx/coroutines/k2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@i(level = k.H, message = "This is internal API and may be removed in the future releases")
@f2
public interface c3 extends k2
{
    @f2
    @e
    CancellationException V();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        public static <R> R b(@e final c3 c3, final R r, @e final p<? super R, ? super g$b, ? extends R> p3) {
            return k2.a.d(c3, r, p3);
        }
        
        @f
        public static <E extends g$b> E c(@e final c3 c3, @e final g$c<E> g$c) {
            return k2.a.e(c3, g$c);
        }
        
        @e
        public static g d(@e final c3 c3, @e final g$c<?> g$c) {
            return k2.a.g(c3, g$c);
        }
        
        @e
        public static g e(@e final c3 c3, @e final g g) {
            return k2.a.h(c3, g);
        }
        
        @i(level = k.H, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @e
        public static k2 f(@e final c3 c3, @e final k2 k2) {
            return kotlinx.coroutines.k2.a.i(c3, k2);
        }
    }
}
