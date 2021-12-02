// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.b1$a;
import kotlin.b1;
import kotlin.j2;
import n6.l;
import kotlinx.coroutines.flow.v0;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.flow.x0;
import kotlin.jvm.internal.k0;
import java.util.Arrays;
import kotlinx.coroutines.flow.f0;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b*\u0010 J\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\u0084\bR\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0014R$\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R>\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070&8F@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+" }, d2 = { "Lkotlinx/coroutines/flow/internal/b;", "Lkotlinx/coroutines/flow/internal/d;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "m", "()Lkotlinx/coroutines/flow/internal/d;", "", "size", "", "n", "(I)[Lkotlinx/coroutines/flow/internal/d;", "k", "slot", "Lkotlin/j2;", "p", "(Lkotlinx/coroutines/flow/internal/d;)V", "Lkotlin/Function1;", "block", "o", "I", "nextIndex", "<set-?>", "H", "q", "()I", "nCollectors", "G", "[Lkotlinx/coroutines/flow/internal/d;", "r", "()[Lkotlinx/coroutines/flow/internal/d;", "getSlots$annotations", "()V", "slots", "Lkotlinx/coroutines/flow/f0;", "J", "Lkotlinx/coroutines/flow/f0;", "_subscriptionCount", "Lkotlinx/coroutines/flow/v0;", "l", "()Lkotlinx/coroutines/flow/v0;", "subscriptionCount", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class b<S extends d<?>>
{
    @f
    private S[] G;
    private int H;
    private int I;
    private f0<Integer> J;
    
    public static final /* synthetic */ int e(final b b) {
        return b.H;
    }
    
    public static final /* synthetic */ d[] f(final b b) {
        return b.G;
    }
    
    @e
    protected final S k() {
        synchronized (this) {
            final S[] g = this.G;
            S[] n;
            if (g == null) {
                n = this.n(2);
                this.G = n;
            }
            else {
                n = g;
                if (this.H >= g.length) {
                    final S[] copy = Arrays.copyOf(g, g.length * 2);
                    k0.o((Object)copy, "java.util.Arrays.copyOf(this, newSize)");
                    this.G = copy;
                    n = copy;
                }
            }
            int i = this.I;
            d<?> m;
            int j;
            do {
                m = n[i];
                if (m == null) {
                    m = this.m();
                    n[i] = (S)m;
                }
                j = ++i;
                if (i >= n.length) {
                    j = 0;
                }
                if (m == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                }
                i = j;
            } while (!m.a(this));
            this.I = j;
            ++this.H;
            final f0<Integer> k = this.J;
            // monitorexit(this)
            if (k != null) {
                x0.g(k, 1);
            }
            return (S)m;
        }
    }
    
    @e
    public final v0<Integer> l() {
        synchronized (this) {
            f0<Integer> j = this.J;
            if (j == null) {
                j = x0.a(this.H);
                this.J = j;
            }
            return j;
        }
    }
    
    @e
    protected abstract S m();
    
    @e
    protected abstract S[] n(final int p0);
    
    protected final void o(@e final l<? super S, j2> l) {
        if (e(this) == 0) {
            return;
        }
        final d[] f = f(this);
        if (f != null) {
            for (final d d : f) {
                if (d != null) {
                    l.invoke((Object)d);
                }
            }
        }
    }
    
    protected final void p(@e final S n) {
        synchronized (this) {
            final int h = this.H - 1;
            this.H = h;
            final f0<Integer> j = this.J;
            int i = 0;
            if (h == 0) {
                this.I = 0;
            }
            if (n != null) {
                // monitorexit(this)
                for (kotlin.coroutines.d<j2>[] b = n.b(this); i < b.length; ++i) {
                    final kotlin.coroutines.d<j2> d = b[i];
                    if (d != null) {
                        final j2 a = j2.a;
                        final b1$a h2 = b1.H;
                        d.resumeWith(b1.b((Object)a));
                    }
                }
                if (j != null) {
                    x0.g(j, -1);
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
        }
    }
    
    protected final int q() {
        return this.H;
    }
    
    @f
    protected final S[] r() {
        return this.G;
    }
}
