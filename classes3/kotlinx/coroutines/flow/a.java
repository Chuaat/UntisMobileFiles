// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.f2;
import kotlin.c1;
import kotlinx.coroutines.flow.internal.x;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.j2;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.a2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/flow/a;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@a2
public abstract class a<T> implements i<T>, c<T>
{
    @f2
    @org.jetbrains.annotations.f
    @Override
    public final Object c(@e j<? super T> j, @e final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0050: {
            if (d instanceof a$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (a$a)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0050;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ a I;
                Object J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.c(null, (d<? super j2>)this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        Label_0151: {
            if (h3 != 0) {
                if (h3 == 1) {
                    j = (x)d3.J;
                    try {
                        c1.n(g);
                        break Label_0151;
                    }
                    finally {
                        break Label_0151;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(g);
            j = new x<Object>(j, ((d)d3).getContext());
            try {
                d3.J = j;
                d3.H = 1;
                if (this.e(j, (d<? super j2>)d3) == h2) {
                    return h2;
                }
                j.releaseIntercepted();
                return j2.a;
            }
            finally {}
        }
        j.releaseIntercepted();
        throw;
    }
    
    @org.jetbrains.annotations.f
    public abstract Object e(@e final j<? super T> p0, @e final d<? super j2> p1);
}
