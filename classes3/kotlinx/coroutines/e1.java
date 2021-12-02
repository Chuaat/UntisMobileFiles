// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import n6.l;
import kotlinx.coroutines.internal.k;
import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.internal.g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015" }, d2 = { "Lkotlinx/coroutines/e1;", "T", "Lkotlinx/coroutines/internal/g0;", "", "C1", "()Z", "B1", "", "state", "Lkotlin/j2;", "e0", "(Ljava/lang/Object;)V", "r1", "A1", "()Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class e1<T> extends g0<T>
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater K;
    private volatile /* synthetic */ int _decision;
    
    static {
        K = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_decision");
    }
    
    public e1(@e final g g, @e final d<? super T> d) {
        super(g, d);
        this._decision = 0;
    }
    
    private final boolean B1() {
        do {
            final int decision = this._decision;
            if (decision != 0) {
                if (decision == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!e1.K.compareAndSet(this, 0, 2));
        return true;
    }
    
    private final boolean C1() {
        do {
            final int decision = this._decision;
            if (decision != 0) {
                if (decision == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!e1.K.compareAndSet(this, 0, 1));
        return true;
    }
    
    @f
    public final Object A1() {
        if (this.C1()) {
            return b.h();
        }
        final Object o = t2.o(this.F0());
        if (!(o instanceof d0)) {
            return o;
        }
        throw ((d0)o).a;
    }
    
    @Override
    protected void e0(@f final Object o) {
        this.r1(o);
    }
    
    @Override
    protected void r1(@f final Object o) {
        if (this.B1()) {
            return;
        }
        k.g(b.d(super.J), j0.a(o, (kotlin.coroutines.d<? super Object>)super.J), null, 2, null);
    }
}
