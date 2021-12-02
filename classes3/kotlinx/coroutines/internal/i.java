// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlinx.coroutines.r0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/internal/i;", "Lkotlinx/coroutines/r0;", "", "toString", "Lkotlin/coroutines/g;", "G", "Lkotlin/coroutines/g;", "J", "()Lkotlin/coroutines/g;", "coroutineContext", "context", "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class i implements r0
{
    @e
    private final g G;
    
    public i(@e final g g) {
        this.G = g;
    }
    
    @e
    @Override
    public g J() {
        return this.G;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoroutineScope(coroutineContext=");
        sb.append(this.J());
        sb.append(')');
        return sb.toString();
    }
}
