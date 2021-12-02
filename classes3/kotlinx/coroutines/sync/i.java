// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlinx.coroutines.internal.h0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f" }, d2 = { "Lkotlinx/coroutines/sync/i;", "Lkotlinx/coroutines/internal/h0;", "", "index", "", "u", "(I)Ljava/lang/Object;", "value", "Lkotlin/j2;", "w", "(ILjava/lang/Object;)V", "expected", "", "t", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "v", "(ILjava/lang/Object;)Ljava/lang/Object;", "s", "(I)V", "", "toString", "()Ljava/lang/String;", "p", "()I", "maxSlots", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/sync/i;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class i extends h0<i>
{
    @e
    /* synthetic */ AtomicReferenceArray e;
    
    public i(final long n, @f final i i, final int n2) {
        super(n, i, n2);
        this.e = new AtomicReferenceArray(h.h());
    }
    
    @Override
    public int p() {
        return h.h();
    }
    
    public final void s(final int i) {
        this.e.set(i, h.e());
        this.q();
    }
    
    public final boolean t(final int i, @f final Object expectedValue, @f final Object newValue) {
        return this.e.compareAndSet(i, expectedValue, newValue);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SemaphoreSegment[id=");
        sb.append(this.o());
        sb.append(", hashCode=");
        sb.append(this.hashCode());
        sb.append(']');
        return sb.toString();
    }
    
    @f
    public final Object u(final int i) {
        return this.e.get(i);
    }
    
    @f
    public final Object v(final int i, @f final Object newValue) {
        return this.e.getAndSet(i, newValue);
    }
    
    public final void w(final int i, @f final Object newValue) {
        this.e.set(i, newValue);
    }
}
