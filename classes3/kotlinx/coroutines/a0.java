// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.b1;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r" }, d2 = { "T", "Lkotlinx/coroutines/y;", "Lkotlin/b1;", "result", "", "d", "(Lkotlinx/coroutines/y;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/k2;", "parent", "b", "value", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/y;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class a0
{
    @e
    public static final <T> y<T> a(final T t) {
        final z<T> z = new z<T>(null);
        z.T(t);
        return z;
    }
    
    @e
    public static final <T> y<T> b(@f final k2 k2) {
        return new z<T>(k2);
    }
    
    public static final <T> boolean d(@e final y<T> y, @e final Object o) {
        final Throwable e = b1.e(o);
        boolean b;
        if (e == null) {
            b = y.T((T)o);
        }
        else {
            b = y.f(e);
        }
        return b;
    }
}
