// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b;
import n6.p;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.selects.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/a1;", "T", "Lkotlinx/coroutines/k2;", "x", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "", "r", "Lkotlinx/coroutines/selects/d;", "o", "()Lkotlinx/coroutines/selects/d;", "onAwait", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface a1<T> extends k2
{
    @z1
    T j();
    
    @e
    d<T> o();
    
    @z1
    @f
    Throwable r();
    
    @f
    Object x(@e final kotlin.coroutines.d<? super T> p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        public static <T, R> R b(@e final a1<? extends T> a1, final R r, @e final p<? super R, ? super g$b, ? extends R> p3) {
            return k2.a.d(a1, r, p3);
        }
        
        @f
        public static <T, E extends g$b> E c(@e final a1<? extends T> a1, @e final g$c<E> g$c) {
            return k2.a.e(a1, g$c);
        }
        
        @e
        public static <T> g d(@e final a1<? extends T> a1, @e final g$c<?> g$c) {
            return k2.a.g(a1, g$c);
        }
        
        @e
        public static <T> g e(@e final a1<? extends T> a1, @e final g g) {
            return k2.a.h(a1, g);
        }
        
        @i(level = k.H, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @e
        public static <T> k2 f(@e final a1<? extends T> a1, @e final k2 k2) {
            return kotlinx.coroutines.k2.a.i(a1, k2);
        }
    }
}
