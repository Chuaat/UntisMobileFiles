// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.internal.p0;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import kotlin.Metadata;
import kotlinx.coroutines.flow.j;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "Lkotlinx/coroutines/flow/internal/c0;", "T", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/j2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "I", "Lkotlin/coroutines/g;", "emitContext", "", "G", "Ljava/lang/Object;", "countOrElement", "downstream", "<init>", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class c0<T> implements j<T>
{
    private final Object G;
    private final p<T, d<? super j2>, Object> H;
    private final g I;
    
    public c0(@e final j<? super T> j, @e final g i) {
        this.I = i;
        this.G = p0.b(i);
        this.H = (p<T, d<? super j2>, Object>)new p<T, d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ j I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                final p<T, d<? super j2>, Object> p2 = (p<T, d<? super j2>, Object>)new p<T, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ j I = this.I;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((c0$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e Object g) {
                final Object h = b.h();
                final int h2 = this.H;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(g);
                }
                else {
                    c1.n(g);
                    g = this.G;
                    final j i = this.I;
                    this.H = 1;
                    if (i.b(g, (d<? super j2>)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        };
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(final T t, @e final d<? super j2> d) {
        final Object c = kotlinx.coroutines.flow.internal.g.c(this.I, t, this.G, (n6.p<? super T, ? super kotlin.coroutines.d<? super Object>, ?>)this.H, (kotlin.coroutines.d<? super Object>)d);
        if (c == b.h()) {
            return c;
        }
        return j2.a;
    }
}
