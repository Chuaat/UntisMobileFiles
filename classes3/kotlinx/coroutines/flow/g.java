// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.f2;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.flow.internal.w;
import kotlin.jvm.internal.j1$h;
import kotlin.j2;
import n6.p;
import org.jetbrains.annotations.e;
import m6.d;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012:\u0010\u0014\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000e¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0097@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017" }, d2 = { "Lkotlinx/coroutines/flow/g;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "G", "Lkotlinx/coroutines/flow/i;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "old", "new", "", "areEquivalent", "<init>", "(Lkotlinx/coroutines/flow/i;Ln6/l;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class g<T> implements i<T>
{
    private final i<T> G;
    @d
    @e
    public final l<T, Object> H;
    @d
    @e
    public final p<Object, Object, Boolean> I;
    
    public g(@e final i<? extends T> g, @e final l<? super T, ?> h, @e final p<Object, Object, Boolean> i) {
        this.G = (i<T>)g;
        this.H = (l<T, Object>)h;
        this.I = i;
    }
    
    @f2
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final j<? super T> j, @e final kotlin.coroutines.d<? super j2> d) {
        final j1$h j1$h = new j1$h();
        j1$h.G = w.a;
        final Object c = this.G.c(new j<T>() {
            final /* synthetic */ g G;
            
            @org.jetbrains.annotations.f
            @Override
            public Object b(final Object o, @e final kotlin.coroutines.d d) {
                Object o2 = null;
                Label_0050: {
                    if (d instanceof g$a$a) {
                        final kotlin.coroutines.jvm.internal.d d2 = (g$a$a)d;
                        final int h = d2.H;
                        if ((h & Integer.MIN_VALUE) != 0x0) {
                            d2.H = h + Integer.MIN_VALUE;
                            o2 = d2;
                            break Label_0050;
                        }
                    }
                    o2 = new kotlin.coroutines.jvm.internal.d(d) {
                        /* synthetic */ Object G;
                        int H;
                        final /* synthetic */ g$a I;
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@e final Object g) {
                            this.G = g;
                            this.H |= Integer.MIN_VALUE;
                            return this.I.b(null, (kotlin.coroutines.d)this);
                        }
                    };
                }
                final Object g = ((g$a$a)o2).G;
                final Object h2 = b.h();
                final int h3 = ((g$a$a)o2).H;
                if (h3 != 0) {
                    if (h3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(g);
                }
                else {
                    c1.n(g);
                    final Object invoke = this.G.H.invoke(o);
                    final Object g2 = j1$h.G;
                    if (g2 == w.a || !(boolean)this.G.I.invoke(g2, invoke)) {
                        j1$h.G = invoke;
                        final j i = j;
                        ((g$a$a)o2).H = 1;
                        if (i.b(o, (kotlin.coroutines.d<? super j2>)o2) == h2) {
                            return h2;
                        }
                    }
                }
                return j2.a;
            }
        }, d);
        if (c == b.h()) {
            return c;
        }
        return j2.a;
    }
}
