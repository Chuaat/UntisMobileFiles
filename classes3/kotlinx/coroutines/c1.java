// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "Lkotlinx/coroutines/c1;", "", "", "time", "Lkotlin/j2;", "F", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Lkotlinx/coroutines/o;", "continuation", "e", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/l1;", "D", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public interface c1
{
    @e
    l1 D(final long p0, @e final Runnable p1, @e final g p2);
    
    @f
    Object F(final long p0, @e final d<? super j2> p1);
    
    void e(final long p0, @e final o<? super j2> p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        @f
        public static Object a(@e final c1 c1, final long n, @e final d<? super j2> d) {
            if (n <= 0L) {
                return j2.a;
            }
            final p<Object> p3 = new p<Object>((kotlin.coroutines.d<? super Object>)b.d((d)d), 1);
            p3.H();
            c1.e(n, p3);
            final Object y = p3.y();
            if (y == b.h()) {
                h.c((d)d);
            }
            return y;
        }
        
        @e
        public static l1 b(@e final c1 c1, final long n, @e final Runnable runnable, @e final g g) {
            return z0.a().D(n, runnable, g);
        }
    }
}
