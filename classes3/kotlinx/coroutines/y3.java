// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import m6.d;
import kotlin.Metadata;
import java.util.concurrent.CancellationException;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\rJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000e" }, d2 = { "Lkotlinx/coroutines/y3;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/k0;", "b", "Lkotlinx/coroutines/k2;", "G", "Lkotlinx/coroutines/k2;", "coroutine", "", "message", "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/k2;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class y3 extends CancellationException implements k0<y3>
{
    @d
    @f
    public final k2 G;
    
    public y3(@e final String s) {
        this(s, (k2)null);
    }
    
    public y3(@e final String message, @f final k2 g) {
        super(message);
        this.G = g;
    }
    
    @f
    public y3 b() {
        String message = this.getMessage();
        if (message == null) {
            message = "";
        }
        final y3 y3 = new y3(message, this.G);
        y3.initCause(this);
        return y3;
    }
}
