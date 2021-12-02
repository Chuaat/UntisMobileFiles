// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.internal.r0;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.internal.q0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001H\u0086H\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001H\u0086H\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b" }, d2 = { "T", "Ljava/lang/ThreadLocal;", "value", "Lkotlinx/coroutines/q3;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/q3;", "", "e", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/j2;", "c", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class r3
{
    @e
    public static final <T> q3<T> a(@e final ThreadLocal<T> threadLocal, final T t) {
        return new q0<T>(t, threadLocal);
    }
    
    @f
    public static final Object c(@e final ThreadLocal<?> obj, @e final d<? super j2> d) {
        if (b.a(d.getContext().get((g$c)new r0(obj)) != null)) {
            return j2.a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ThreadLocal ");
        sb.append(obj);
        sb.append(" is missing from context ");
        sb.append(d.getContext());
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @f
    private static final Object d(@e final ThreadLocal threadLocal, @e final d d) {
        h0.e(3);
        throw null;
    }
    
    @f
    public static final Object e(@e final ThreadLocal<?> threadLocal, @e final d<? super Boolean> d) {
        return b.a(d.getContext().get((g$c)new r0(threadLocal)) != null);
    }
    
    @f
    private static final Object f(@e final ThreadLocal threadLocal, @e final d d) {
        h0.e(3);
        throw null;
    }
}
