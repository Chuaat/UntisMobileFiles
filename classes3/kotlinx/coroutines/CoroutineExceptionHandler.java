// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b$a;
import n6.p;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.g$b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n" }, d2 = { "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/j2;", "handleException", "s", "b", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface CoroutineExceptionHandler extends g$b
{
    @e
    public static final b s = b.G;
    
    void handleException(@e final g p0, @e final Throwable p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        public static <R> R a(@e final CoroutineExceptionHandler coroutineExceptionHandler, final R r, @e final p<? super R, ? super g$b, ? extends R> p3) {
            return (R)g$b$a.a((g$b)coroutineExceptionHandler, (Object)r, (p)p3);
        }
        
        @f
        public static <E extends g$b> E b(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final g$c<E> g$c) {
            return (E)g$b$a.b((g$b)coroutineExceptionHandler, (g$c)g$c);
        }
        
        @e
        public static g c(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final g$c<?> g$c) {
            return g$b$a.c((g$b)coroutineExceptionHandler, (g$c)g$c);
        }
        
        @e
        public static g d(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final g g) {
            return g$b$a.d((g$b)coroutineExceptionHandler, g);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "kotlinx/coroutines/CoroutineExceptionHandler$b", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class b implements g$c<CoroutineExceptionHandler>
    {
        static final /* synthetic */ b G;
        
        static {
            G = new b();
        }
        
        private b() {
        }
    }
}
