// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b;
import n6.p;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007" }, d2 = { "Lkotlinx/coroutines/b0;", "Lkotlinx/coroutines/k2;", "", "b", "", "exception", "f", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface b0 extends k2
{
    boolean b();
    
    boolean f(@e final Throwable p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        public static <R> R b(@e final b0 b0, final R r, @e final p<? super R, ? super g$b, ? extends R> p3) {
            return k2.a.d(b0, r, p3);
        }
        
        @f
        public static <E extends g$b> E c(@e final b0 b0, @e final g$c<E> g$c) {
            return k2.a.e(b0, g$c);
        }
        
        @e
        public static g d(@e final b0 b0, @e final g$c<?> g$c) {
            return k2.a.g(b0, g$c);
        }
        
        @e
        public static g e(@e final b0 b0, @e final g g) {
            return k2.a.h(b0, g);
        }
        
        @i(level = k.H, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @e
        public static k2 f(@e final b0 b0, @e final k2 k2) {
            return kotlinx.coroutines.k2.a.i(b0, k2);
        }
    }
}
