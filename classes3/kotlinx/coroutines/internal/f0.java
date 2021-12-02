// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00060\u0004j\u0002`\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lkotlinx/coroutines/internal/f0;", "", "", "toString", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/internal/Node;", "a", "Lkotlinx/coroutines/internal/t;", "ref", "<init>", "(Lkotlinx/coroutines/internal/t;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class f0
{
    @d
    @e
    public final t a;
    
    public f0(@e final t a) {
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Removed[");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
