// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\u001f\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&R\u0016\u0010\f\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "Lkotlinx/coroutines/sync/c;", "", "owner", "", "a", "Lkotlin/j2;", "c", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "d", "b", "()Z", "isLocked", "Lkotlinx/coroutines/selects/e;", "f", "()Lkotlinx/coroutines/selects/e;", "onLock", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface c
{
    boolean a(@f final Object p0);
    
    boolean b();
    
    @f
    Object c(@f final Object p0, @e final d<? super j2> p1);
    
    void d(@f final Object p0);
    
    boolean e(@e final Object p0);
    
    @e
    kotlinx.coroutines.selects.e<Object, c> f();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
    }
}
