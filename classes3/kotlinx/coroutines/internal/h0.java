// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import org.jetbrains.annotations.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/internal/h0;", "S", "Lkotlinx/coroutines/internal/g;", "", "r", "()Z", "n", "Lkotlin/j2;", "q", "()V", "", "p", "()I", "maxSlots", "", "c", "J", "o", "()J", "id", "g", "removed", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/internal/h0;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class h0<S extends h0<S>> extends g<S>
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater d;
    private final long c;
    private volatile /* synthetic */ int cleanedAndPointers;
    
    static {
        d = AtomicIntegerFieldUpdater.newUpdater(h0.class, "cleanedAndPointers");
    }
    
    public h0(final long c, @f final S n, final int n2) {
        super(n);
        this.c = c;
        this.cleanedAndPointers = n2 << 16;
    }
    
    @Override
    public boolean g() {
        return this.cleanedAndPointers == this.p() && !this.i();
    }
    
    public final boolean n() {
        return h0.d.addAndGet(this, -65536) == this.p() && !this.i();
    }
    
    public final long o() {
        return this.c;
    }
    
    public abstract int p();
    
    public final void q() {
        if (h0.d.incrementAndGet(this) == this.p() && !this.i()) {
            this.l();
        }
    }
    
    public final boolean r() {
        int cleanedAndPointers;
        do {
            cleanedAndPointers = this.cleanedAndPointers;
            final int p = this.p();
            final boolean b = false;
            if (cleanedAndPointers == p && !this.i()) {
                return b;
            }
        } while (!h0.d.compareAndSet(this, cleanedAndPointers, 65536 + cleanedAndPointers));
        return true;
    }
}
