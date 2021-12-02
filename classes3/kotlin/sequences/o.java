// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.b;
import java.util.Collection;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.e1;
import kotlin.coroutines.j;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015" }, d2 = { "Lkotlin/sequences/o;", "T", "", "value", "Lkotlin/j2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "iterator", "e", "(Ljava/util/Iterator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "elements", "d", "(Ljava/lang/Iterable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/sequences/m;", "sequence", "f", "(Lkotlin/sequences/m;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@j
@e1(version = "1.3")
public abstract class o<T>
{
    @f
    public abstract Object b(final T p0, @e final d<? super j2> p1);
    
    @f
    public final Object d(@e final Iterable<? extends T> iterable, @e final d<? super j2> d) {
        if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
            return j2.a;
        }
        final Object e = this.e(iterable.iterator(), d);
        if (e == b.h()) {
            return e;
        }
        return j2.a;
    }
    
    @f
    public abstract Object e(@e final Iterator<? extends T> p0, @e final d<? super j2> p1);
    
    @f
    public final Object f(@e final m<? extends T> m, @e final d<? super j2> d) {
        final Object e = this.e(m.iterator(), d);
        if (e == b.h()) {
            return e;
        }
        return j2.a;
    }
}
