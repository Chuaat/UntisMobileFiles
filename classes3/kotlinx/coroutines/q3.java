// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b$a;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlin.coroutines.g$b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "Lkotlinx/coroutines/q3;", "S", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "context", "X", "(Lkotlin/coroutines/g;)Ljava/lang/Object;", "oldState", "Lkotlin/j2;", "Q", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface q3<S> extends g$b
{
    void Q(@e final g p0, final S p1);
    
    S X(@e final g p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        public static <S, R> R a(@e final q3<S> q3, final R r, @e final p<? super R, ? super g$b, ? extends R> p3) {
            return (R)g$b$a.a((g$b)q3, (Object)r, (p)p3);
        }
        
        @f
        public static <S, E extends g$b> E b(@e final q3<S> q3, @e final g$c<E> g$c) {
            return (E)g$b$a.b((g$b)q3, (g$c)g$c);
        }
        
        @e
        public static <S> g c(@e final q3<S> q3, @e final g$c<?> g$c) {
            return g$b$a.c((g$b)q3, (g$c)g$c);
        }
        
        @e
        public static <S> g d(@e final q3<S> q3, @e final g g) {
            return g$b$a.d((g$b)q3, g);
        }
    }
}
