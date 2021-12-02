// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019" }, d2 = { "Lkotlinx/coroutines/f;", "T", "Lkotlinx/coroutines/a;", "", "state", "Lkotlin/j2;", "e0", "z1", "()Ljava/lang/Object;", "", "L0", "()Z", "isScopedCoroutine", "Ljava/lang/Thread;", "J", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/p1;", "K", "Lkotlinx/coroutines/p1;", "eventLoop", "Lkotlin/coroutines/g;", "parentContext", "<init>", "(Lkotlin/coroutines/g;Ljava/lang/Thread;Lkotlinx/coroutines/p1;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class f<T> extends a<T>
{
    private final Thread J;
    private final p1 K;
    
    public f(@e final g g, @e final Thread j, @org.jetbrains.annotations.f final p1 k) {
        super(g, true);
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected boolean L0() {
        return true;
    }
    
    @Override
    protected void e0(@org.jetbrains.annotations.f final Object o) {
        if (k0.g((Object)Thread.currentThread(), (Object)this.J) ^ true) {
            final Thread j = this.J;
            final w3 b = x3.b();
            if (b != null) {
                b.f(j);
            }
            else {
                LockSupport.unpark(j);
            }
        }
    }
    
    public final T z1() {
        final w3 b = x3.b();
        if (b != null) {
            b.d();
        }
        try {
            final p1 k = this.K;
            d0 d0 = null;
            if (k != null) {
                p1.e0(k, false, 1, null);
            }
            try {
                while (!Thread.interrupted()) {
                    final p1 i = this.K;
                    long i2;
                    if (i != null) {
                        i2 = i.i0();
                    }
                    else {
                        i2 = Long.MAX_VALUE;
                    }
                    if (this.g()) {
                        final p1 j = this.K;
                        if (j != null) {
                            p1.S(j, false, 1, null);
                        }
                        final w3 b2 = x3.b();
                        if (b2 != null) {
                            b2.h();
                        }
                        final Object o = t2.o(this.F0());
                        if (o instanceof d0) {
                            d0 = (d0)o;
                        }
                        final d0 d2 = d0;
                        if (d2 == null) {
                            return (T)o;
                        }
                        throw d2.a;
                    }
                    else {
                        final w3 b3 = x3.b();
                        if (b3 != null) {
                            b3.g(this, i2);
                        }
                        else {
                            LockSupport.parkNanos(this, i2);
                        }
                    }
                }
                final InterruptedException ex = new InterruptedException();
                this.i0(ex);
                throw ex;
            }
            finally {
                final p1 l = this.K;
                if (l != null) {
                    p1.S(l, false, 1, null);
                }
            }
        }
        finally {
            final w3 b4 = x3.b();
            if (b4 != null) {
                b4.h();
            }
        }
    }
}
