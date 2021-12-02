// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t" }, d2 = { "Lkotlinx/coroutines/sync/b;", "", "", "toString", "a", "Ljava/lang/Object;", "locked", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class b
{
    @d
    @e
    public final Object a;
    
    public b(@e final Object a) {
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Empty[");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
