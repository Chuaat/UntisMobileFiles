// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import kotlin.jvm.internal.w;
import kotlin.coroutines.j;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\n\u001a\u00028\u0003\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\b*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t2\u0006\u0010\u0004\u001a\u00028\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0087\u0002\u0082\u0001\u0001\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "Lkotlin/g;", "T", "R", "", "value", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "U", "S", "Lkotlin/e;", "d", "(Lkotlin/e;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "<init>", "()V", "Lkotlin/h;", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@j
@e1(version = "1.4")
@q
public abstract class g<T, R>
{
    private g() {
    }
    
    @f
    public abstract Object b(final T p0, @e final d<? super R> p1);
    
    @f
    public abstract <U, S> Object d(@e final kotlin.e<U, S> p0, final U p1, @e final d<? super S> p2);
    
    @i(level = k.H, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @z0(expression = "this.callRecursive(value)", imports = {}))
    @e
    public final Void e(@e final kotlin.e<?, ?> e, @f final Object o) {
        k0.p(e, "$this$invoke");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
