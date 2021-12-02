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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0001\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t" }, d2 = { "Lkotlinx/coroutines/y;", "T", "Lkotlinx/coroutines/a1;", "value", "", "(Ljava/lang/Object;)Z", "", "exception", "f", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface y<T> extends a1<T>
{
    boolean T(final T p0);
    
    boolean f(@e final Throwable p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        public static <T, R> R b(@e final y<T> y, final R r, @e final p<? super R, ? super g$b, ? extends R> p3) {
            return a1.a.b((a1<?>)y, r, p3);
        }
        
        @f
        public static <T, E extends g$b> E c(@e final y<T> y, @e final g$c<E> g$c) {
            return a1.a.c((a1<?>)y, g$c);
        }
        
        @e
        public static <T> g d(@e final y<T> y, @e final g$c<?> g$c) {
            return a1.a.d((a1<?>)y, g$c);
        }
        
        @e
        public static <T> g e(@e final y<T> y, @e final g g) {
            return a1.a.e((a1<?>)y, g);
        }
        
        @i(level = k.H, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @e
        public static <T> k2 f(@e final y<T> y, @e final k2 k2) {
            return a1.a.f((a1<?>)y, k2);
        }
    }
}
