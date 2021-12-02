// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.h0;
import java.util.Iterator;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlinx.coroutines.flow.j;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.channels.l0;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.f0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.flow.i;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019" }, d2 = { "Lkotlinx/coroutines/flow/internal/l;", "T", "Lkotlinx/coroutines/flow/internal/f;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "k", "Lkotlinx/coroutines/r0;", "scope", "Lkotlinx/coroutines/channels/h0;", "p", "Lkotlinx/coroutines/channels/f0;", "Lkotlin/j2;", "h", "(Lkotlinx/coroutines/channels/f0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/flow/i;", "J", "Ljava/lang/Iterable;", "flows", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class l<T> extends f<T>
{
    private final Iterable<i<T>> J;
    
    public l(@e final Iterable<? extends i<? extends T>> j, @e final g g, final int n, @e final n n2) {
        super(g, n, n2);
        this.J = (Iterable<i<T>>)j;
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object h(@e final f0<? super T> f0, @e final d<? super j2> d) {
        final a0 a0 = new a0((l0<? super T>)f0);
        final Iterator<i<T>> iterator = this.J.iterator();
        while (iterator.hasNext()) {
            h.f(f0, null, null, (p)new p<r0, d<? super j2>, Object>(f0) {
                int G;
                final /* synthetic */ i H;
                final /* synthetic */ f0 I;
                final /* synthetic */ a0 J;
                
                @e
                public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                    return (d<j2>)new p<r0, d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ i H = this.H;
                        final /* synthetic */ f0 I = this.I;
                        final /* synthetic */ a0 J = this.J;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((l$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object o) {
                    final Object h = b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final i h2 = this.H;
                        final a0 j = this.J;
                        this.G = 1;
                        if (h2.c(j, (d)this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, null);
        }
        return j2.a;
    }
    
    @e
    @Override
    protected f<T> k(@e final g g, final int n, @e final n n2) {
        return new l(this.J, g, n, n2);
    }
    
    @e
    @Override
    public h0<T> p(@e final r0 r0) {
        return q.a(r0, super.G, super.H, (n6.p<? super f0<? super T>, ? super d<? super j2>, ?>)this.n());
    }
}
