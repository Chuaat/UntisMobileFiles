// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlinx.coroutines.x0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001c\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/internal/d0;", "", "affected", "c", "", "toString", "that", "", "b", "Lkotlinx/coroutines/internal/d;", "a", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class d0
{
    @f
    public abstract d<?> a();
    
    public final boolean b(@e final d0 d0) {
        final d<?> a = this.a();
        boolean b2;
        final boolean b = b2 = false;
        if (a != null) {
            final d<?> a2 = d0.a();
            b2 = b;
            if (a2 != null) {
                b2 = b;
                if (a.g() < a2.g()) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @f
    public abstract Object c(@f final Object p0);
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x0.a(this));
        sb.append('@');
        sb.append(x0.b(this));
        return sb.toString();
    }
}
