// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import n6.p;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.f0;
import kotlin.coroutines.e$b;
import kotlin.coroutines.g$c;
import kotlin.j2;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\bJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004@\u0005X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f" }, d2 = { "Lkotlinx/coroutines/flow/internal/i;", "S", "T", "Lkotlinx/coroutines/flow/internal/f;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "t", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "newContext", "s", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/f0;", "scope", "h", "(Lkotlinx/coroutines/channels/f0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "", "toString", "Lkotlinx/coroutines/flow/i;", "J", "Lkotlinx/coroutines/flow/i;", "flow", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class i<S, T> extends f<T>
{
    @d
    @e
    protected final kotlinx.coroutines.flow.i<S> J;
    
    public i(@e final kotlinx.coroutines.flow.i<? extends S> j, @e final g g, final int n, @e final n n2) {
        super(g, n, n2);
        this.J = (kotlinx.coroutines.flow.i<S>)j;
    }
    
    static /* synthetic */ Object q(final i i, final j j, final kotlin.coroutines.d d) {
        if (i.H == -3) {
            final g context = d.getContext();
            final g plus = context.plus(i.G);
            if (k0.g((Object)plus, (Object)context)) {
                final Object t = i.t(j, d);
                if (t == b.h()) {
                    return t;
                }
                return j2.a;
            }
            else {
                final e$b q = kotlin.coroutines.e.q;
                if (k0.g((Object)plus.get((g$c)q), (Object)context.get((g$c)q))) {
                    final Object s = i.s(j, plus, d);
                    if (s == b.h()) {
                        return s;
                    }
                    return j2.a;
                }
            }
        }
        final Object c = i.c(j, d);
        if (c == b.h()) {
            return c;
        }
        return j2.a;
    }
    
    static /* synthetic */ Object r(final i i, final f0 f0, final kotlin.coroutines.d d) {
        final Object t = i.t(new a0(f0), d);
        if (t == b.h()) {
            return t;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final j<? super T> j, @e final kotlin.coroutines.d<? super j2> d) {
        return q(this, j, d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object h(@e final f0<? super T> f0, @e final kotlin.coroutines.d<? super j2> d) {
        return r(this, f0, d);
    }
    
    @org.jetbrains.annotations.f
    protected abstract Object t(@e final j<? super T> p0, @e final kotlin.coroutines.d<? super j2> p1);
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.J);
        sb.append(" -> ");
        sb.append(super.toString());
        return sb.toString();
    }
}
