// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import m6.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0005" }, d2 = { "Ljava/lang/Thread;", "thread", "", "a", "b", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class c
{
    @g(name = "isSchedulerWorker")
    public static final boolean a(@e final Thread thread) {
        return thread instanceof a.b;
    }
    
    @g(name = "mayNotBlock")
    public static final boolean b(@e final Thread thread) {
        return thread instanceof a.b && ((a.b)thread).H == a.c.G;
    }
}
