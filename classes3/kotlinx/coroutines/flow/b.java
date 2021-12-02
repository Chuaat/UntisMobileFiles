// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlin.c1;
import kotlin.coroutines.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.f0;
import n6.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0014\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017" }, d2 = { "Lkotlinx/coroutines/flow/b;", "T", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/f0;", "scope", "Lkotlin/j2;", "h", "(Lkotlinx/coroutines/channels/f0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/f;", "k", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "<init>", "(Ln6/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class b<T> extends f<T>
{
    private final p<f0<? super T>, d<? super j2>, Object> K;
    
    public b(@e final p<? super f0<? super T>, ? super d<? super j2>, ?> k, @e final g g, final int n, @e final n n2) {
        super(k, g, n, n2);
        this.K = (p<f0<? super T>, d<? super j2>, Object>)k;
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object h(@e final f0<? super T> j, @e final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0050: {
            if (d instanceof b$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (b$a)d;
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
                final /* synthetic */ b I;
                Object J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.h(null, (d<? super j2>)this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = d3.H;
        f0<? super T> f0;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0 = (f0<? super T>)d3.J;
            c1.n(g);
        }
        else {
            c1.n(g);
            d3.J = j;
            d3.H = 1;
            f0 = j;
            if (super.h(j, (d<? super j2>)d3) == h2) {
                return h2;
            }
        }
        if (f0.W()) {
            return j2.a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }
    
    @e
    @Override
    protected kotlinx.coroutines.flow.internal.f<T> k(@e final g g, final int n, @e final n n2) {
        return new b(this.K, g, n, n2);
    }
}
