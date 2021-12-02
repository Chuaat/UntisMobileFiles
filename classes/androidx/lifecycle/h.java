// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlin.coroutines.i;
import androidx.annotation.p0;
import java.time.Duration;
import kotlin.coroutines.g;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aa\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2/\b\u0001\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aa\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142/\b\u0001\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0016\u0010\u0019\u001a\u00020\t8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018*`\b\u0000\u0010\u001a\u001a\u0004\b\u0000\u0010\u0000\")\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u00102)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0002\b\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b" }, d2 = { "T", "Landroidx/lifecycle/i0;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/l;", "a", "(Landroidx/lifecycle/i0;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/g0;", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "", "Lkotlin/s;", "block", "b", "(Lkotlin/coroutines/g;JLn6/p;)Landroidx/lifecycle/LiveData;", "Ljava/time/Duration;", "timeout", "c", "(Lkotlin/coroutines/g;Ljava/time/Duration;Ln6/p;)Landroidx/lifecycle/LiveData;", "J", "DEFAULT_TIMEOUT", "Block", "lifecycle-livedata-ktx_release" }, k = 2, mv = { 1, 4, 1 })
public final class h
{
    public static final long a = 5000L;
    
    @org.jetbrains.annotations.f
    public static final <T> Object a(@e final i0<T> i0, @e final LiveData<T> liveData, @e final d<? super l> d) {
        return kotlinx.coroutines.h.i((g)i1.e().M(), (p)new p<r0, d<? super l>, Object>() {
            int G;
            final /* synthetic */ i0 H;
            final /* synthetic */ LiveData I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.p((Object)d, "completion");
                return (d<j2>)new p<r0, d<? super l>, Object>() {
                    int G;
                    final /* synthetic */ i0 H = this.H;
                    final /* synthetic */ LiveData I = this.I;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((h$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    this.H.r(this.I, new l0<T>() {
                        final /* synthetic */ h$a G;
                        
                        @Override
                        public final void a(final T t) {
                            this.G.H.q(t);
                        }
                    });
                    return new l(this.I, this.H);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
    }
    
    @e
    public static final <T> LiveData<T> b(@e final g g, final long n, @kotlin.b @e final p<? super g0<T>, ? super d<? super j2>, ?> p3) {
        k0.p((Object)g, "context");
        k0.p((Object)p3, "block");
        return new androidx.lifecycle.g<T>(g, n, p3);
    }
    
    @p0(26)
    @e
    public static final <T> LiveData<T> c(@e final g g, @e final Duration duration, @kotlin.b @e final p<? super g0<T>, ? super d<? super j2>, ?> p3) {
        k0.p((Object)g, "context");
        k0.p((Object)duration, "timeout");
        k0.p((Object)p3, "block");
        return new androidx.lifecycle.g<T>(g, duration.toMillis(), p3);
    }
}
