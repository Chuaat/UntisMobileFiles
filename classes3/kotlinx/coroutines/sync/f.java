// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0002H&R\u0016\u0010\u000b\u001a\u00020\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/sync/f;", "", "Lkotlin/j2;", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "c", "release", "", "a", "()I", "availablePermits", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface f
{
    int a();
    
    @org.jetbrains.annotations.f
    Object b(@e final d<? super j2> p0);
    
    boolean c();
    
    void release();
}
