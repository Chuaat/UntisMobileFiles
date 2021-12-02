// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.i;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import n6.p;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import n6.a;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\f\"\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\f\"\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "T", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/g;Ln6/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "coroutineContext", "d", "(Lkotlin/coroutines/g;Ln6/a;)Ljava/lang/Object;", "", "a", "I", "WORKING", "FINISHED", "INTERRUPTED", "c", "INTERRUPTING", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class g2
{
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    
    @org.jetbrains.annotations.f
    public static final <T> Object b(@e final g g, @e final a<? extends T> a, @e final d<? super T> d) {
        return h.i(g, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)new p<r0, d<? super T>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ a I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                final p<r0, d<? super T>, Object> p2 = (p<r0, d<? super T>, Object>)new p<r0, d<? super T>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ a I = this.I;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((g2$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.H == 0) {
                    c1.n(o);
                    return d(((r0)this.G).J(), (n6.a<?>)this.I);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d<? super Object>)d);
    }
    
    private static final <T> T d(final g g, final a<? extends T> a) {
        try {
            final v3 v3 = new v3(o2.C(g));
            v3.g();
            try {
                return (T)a.invoke();
            }
            finally {
                v3.a();
            }
        }
        catch (InterruptedException cause) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(cause);
        }
    }
}
