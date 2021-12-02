// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.flow.internal.c;
import org.jetbrains.annotations.f;
import kotlin.b1$a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.b1;
import kotlinx.coroutines.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013" }, d2 = { "Lkotlinx/coroutines/flow/y0;", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/w0;", "flow", "", "c", "(Lkotlinx/coroutines/flow/w0;)Z", "", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "e", "(Lkotlinx/coroutines/flow/w0;)[Lkotlin/coroutines/d;", "f", "()V", "g", "()Z", "d", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class y0 extends d<w0<?>>
{
    static final /* synthetic */ AtomicReferenceFieldUpdater a;
    volatile /* synthetic */ Object _state;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_state");
    }
    
    public y0() {
        this._state = null;
    }
    
    public boolean c(@e final w0<?> w0) {
        if (this._state != null) {
            return false;
        }
        this._state = x0.b();
        return true;
    }
    
    @f
    public final Object d(@e final kotlin.coroutines.d<? super j2> d) {
        final kotlin.coroutines.d d2 = b.d((kotlin.coroutines.d)d);
        boolean b = true;
        final p p = new p((kotlin.coroutines.d<? super Object>)d2, 1);
        p.H();
        if (kotlinx.coroutines.w0.b() && !kotlin.coroutines.jvm.internal.b.a(this._state instanceof p ^ true)) {
            throw new AssertionError();
        }
        if (!y0.a.compareAndSet(this, x0.b(), p)) {
            if (kotlinx.coroutines.w0.b()) {
                if (this._state != x0.c()) {
                    b = false;
                }
                if (!kotlin.coroutines.jvm.internal.b.a(b)) {
                    throw new AssertionError();
                }
            }
            final j2 a = j2.a;
            final b1$a h = b1.H;
            ((kotlin.coroutines.d)p).resumeWith(b1.b((Object)a));
        }
        final Object y = p.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((kotlin.coroutines.d)d);
        }
        return y;
    }
    
    @e
    public kotlin.coroutines.d<j2>[] e(@e final w0<?> w0) {
        this._state = null;
        return c.a;
    }
    
    public final void f() {
        while (true) {
            final Object state = this._state;
            if (state == null) {
                return;
            }
            if (state == x0.c()) {
                return;
            }
            if (state == x0.b()) {
                if (y0.a.compareAndSet(this, state, x0.c())) {
                    return;
                }
                continue;
            }
            else {
                if (y0.a.compareAndSet(this, state, x0.b())) {
                    final p p = (p)state;
                    final j2 a = j2.a;
                    final b1$a h = b1.H;
                    ((kotlin.coroutines.d)p).resumeWith(b1.b((Object)a));
                    return;
                }
                continue;
            }
        }
    }
    
    public final boolean g() {
        final k0 andSet = y0.a.getAndSet(this, x0.b());
        kotlin.jvm.internal.k0.m((Object)andSet);
        final boolean b = kotlinx.coroutines.w0.b();
        boolean b2 = true;
        if (b && !(andSet instanceof p ^ true)) {
            throw new AssertionError();
        }
        if (andSet != x0.c()) {
            b2 = false;
        }
        return b2;
    }
}
