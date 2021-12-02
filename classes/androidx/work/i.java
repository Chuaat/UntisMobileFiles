// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import androidx.annotation.t0;
import kotlin.Metadata;
import java.util.concurrent.Executor;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016j\u0002\b\u000b¨\u0006\f" }, d2 = { "Landroidx/work/i;", "", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/j2;", "execute", "", "toString", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "work-runtime-ktx_release" }, k = 1, mv = { 1, 4, 1 })
@t0({ t0.a.H })
public enum i implements Executor
{
    G;
    
    @Override
    public void execute(@e final Runnable runnable) {
        k0.p((Object)runnable, "command");
        runnable.run();
    }
    
    @e
    @Override
    public String toString() {
        return "DirectExecutor";
    }
}
