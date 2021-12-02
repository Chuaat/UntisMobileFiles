// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.i;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;
import java.util.concurrent.Executor;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/h1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/j2;", "execute", "", "toString", "Lkotlinx/coroutines/m0;", "G", "Lkotlinx/coroutines/m0;", "dispatcher", "<init>", "(Lkotlinx/coroutines/m0;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class h1 implements Executor
{
    @d
    @e
    public final m0 G;
    
    public h1(@e final m0 g) {
        this.G = g;
    }
    
    @Override
    public void execute(@e final Runnable runnable) {
        this.G.H((g)i.H, runnable);
    }
    
    @e
    @Override
    public String toString() {
        return this.G.toString();
    }
}
