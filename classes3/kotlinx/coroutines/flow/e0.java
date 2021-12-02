// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.z1;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H'R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "Lkotlinx/coroutines/flow/e0;", "T", "Lkotlinx/coroutines/flow/j0;", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/j2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "j", "(Ljava/lang/Object;)Z", "i", "Lkotlinx/coroutines/flow/v0;", "", "l", "()Lkotlinx/coroutines/flow/v0;", "subscriptionCount", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface e0<T> extends j0<T>, j<T>
{
    @f
    Object b(final T p0, @e final d<? super j2> p1);
    
    @z1
    void i();
    
    boolean j(final T p0);
    
    @e
    v0<Integer> l();
}
