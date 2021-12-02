// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlinx.coroutines.w0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.f2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u001a\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e" }, d2 = { "Lkotlinx/coroutines/internal/d;", "T", "Lkotlinx/coroutines/internal/d0;", "", "decision", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "i", "failure", "Lkotlin/j2;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "a", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "f", "()Ljava/lang/Object;", "consensus", "", "h", "()Z", "isDecided", "", "g", "()J", "opSequence", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public abstract class d<T> extends d0
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater a;
    private volatile /* synthetic */ Object _consensus;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    }
    
    public d() {
        this._consensus = c.a;
    }
    
    @e
    @Override
    public d<?> a() {
        return this;
    }
    
    @f
    @Override
    public final Object c(@f final Object o) {
        Object o2;
        if ((o2 = this._consensus) == c.a) {
            o2 = this.e(this.i(o));
        }
        this.d(o, o2);
        return o2;
    }
    
    public abstract void d(final T p0, @f final Object p1);
    
    @f
    public final Object e(@f final Object o) {
        if (w0.b() && o == c.a) {
            throw new AssertionError();
        }
        final Object consensus = this._consensus;
        final Object a = c.a;
        if (consensus != a) {
            return consensus;
        }
        if (d.a.compareAndSet(this, a, o)) {
            return o;
        }
        return this._consensus;
    }
    
    @f
    public final Object f() {
        return this._consensus;
    }
    
    public long g() {
        return 0L;
    }
    
    public final boolean h() {
        return this._consensus != c.a;
    }
    
    @f
    public abstract Object i(final T p0);
}
