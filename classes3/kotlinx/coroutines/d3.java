// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/d3;", "Ljava/lang/Thread;", "Lkotlinx/coroutines/t3;", "G", "Lkotlinx/coroutines/t3;", "dispatcher", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "target", "", "name", "<init>", "(Lkotlinx/coroutines/t3;Ljava/lang/Runnable;Ljava/lang/String;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class d3 extends Thread
{
    @d
    @e
    public final t3 G;
    
    public d3(@e final t3 g, @e final Runnable target, @e final String name) {
        super(target, name);
        this.G = g;
        this.setDaemon(true);
    }
}
