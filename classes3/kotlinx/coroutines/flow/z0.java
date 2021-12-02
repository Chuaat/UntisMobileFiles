// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.x;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0010\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000f\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0096A\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013" }, d2 = { "Lkotlinx/coroutines/flow/z0;", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/j2;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "G", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "action", "<init>", "(Lkotlinx/coroutines/flow/j;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class z0<T> implements j<T>
{
    private final j<T> G;
    private final p<j<? super T>, d<? super j2>, Object> H;
    
    public z0(@e final j<? super T> g, @e final p<? super j<? super T>, ? super d<? super j2>, ?> h) {
        this.G = (j<T>)g;
        this.H = (p<j<? super T>, d<? super j2>, Object>)h;
    }
    
    @org.jetbrains.annotations.f
    public final Object a(@e final d<? super j2> d) {
        Object g = null;
        kotlin.coroutines.jvm.internal.d d2 = null;
        Label_0047: {
            if (d instanceof z0$a) {
                g = d;
                final int h = ((z0$a)g).H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    ((z0$a)g).H = h + Integer.MIN_VALUE;
                    d2 = (z0$a)g;
                    break Label_0047;
                }
            }
            d2 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ z0 I;
                Object J;
                Object K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.a((d<? super j2>)this);
                }
            };
        }
        final Object g2 = d2.G;
        final Object h2 = b.h();
        final int h3 = d2.H;
        Label_0192: {
            if (h3 != 0) {
                if (h3 != 1) {
                    if (h3 == 2) {
                        c1.n(g2);
                        break Label_0192;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    g = d2.K;
                    final z0 z0 = (z0)d2.J;
                    try {
                        c1.n(g2);
                        break Label_0192;
                    }
                    finally {
                        break Label_0192;
                    }
                }
            }
            c1.n(g2);
            g = new x((j<? super Object>)this.G, ((d)d2).getContext());
            try {
                final p<j<? super T>, d<? super j2>, Object> h4 = this.H;
                d2.J = this;
                d2.K = g;
                d2.H = 1;
                if (h4.invoke(g, (Object)d2) == h2) {
                    return h2;
                }
                final z0 z0 = this;
                ((x)g).releaseIntercepted();
                g = z0.G;
                if (g instanceof z0) {
                    g = g;
                    d2.J = null;
                    d2.K = null;
                    d2.H = 2;
                    if (((z0)g).a((d)d2) == h2) {
                        return h2;
                    }
                }
                return j2.a;
            }
            finally {}
        }
        ((x)g).releaseIntercepted();
        throw d2;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(final T t, @e final d<? super j2> d) {
        return this.G.b(t, d);
    }
}
