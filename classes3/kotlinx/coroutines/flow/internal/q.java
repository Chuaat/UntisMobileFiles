// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.c1;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.channels.o;
import n6.l;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.channels.h0;
import kotlin.b;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.f0;
import n6.p;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.r0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0080@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aU\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000025\b\u0001\u0010\u0006\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u0005H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u000f*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122/\b\u0001\u0010\u0006\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018" }, d2 = { "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "c", "(Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/j2;", "Lkotlinx/coroutines/flow/i;", "d", "(Ln6/q;)Lkotlinx/coroutines/flow/i;", "T", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/f0;", "Lkotlinx/coroutines/channels/h0;", "a", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILn6/p;)Lkotlinx/coroutines/channels/h0;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class q
{
    @e
    public static final <T> h0<T> a(@e final r0 r0, @e final g g, final int n, @b @e final p<? super f0<? super T>, ? super d<? super j2>, ?> p4) {
        final s<Object> s = (s<Object>)new s<T>(l0.d(r0, g), r.d(n, null, null, 6, null));
        s.x1(u0.I, s, (n6.p<? super s<Object>, ? super kotlin.coroutines.d<? super Object>, ?>)p4);
        return (h0<T>)s;
    }
    
    @f
    public static final <R> Object c(@b @e final p<? super r0, ? super d<? super R>, ?> p2, @e final d<? super R> d) {
        final kotlinx.coroutines.flow.internal.p<Object> p3 = new kotlinx.coroutines.flow.internal.p<Object>(d.getContext(), (kotlin.coroutines.d<? super Object>)d);
        final Object f = c7.b.f((g0<? super Object>)p3, p3, (n6.p<? super kotlinx.coroutines.flow.internal.p<Object>, ? super kotlin.coroutines.d<? super Object>, ?>)p2);
        if (f == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return f;
    }
    
    @e
    public static final <R> i<R> d(@b @e final n6.q<? super r0, ? super j<? super R>, ? super d<? super j2>, ?> q) {
        return new i<R>() {
            @f
            @Override
            public Object c(@e final j j, @e final d d) {
                final Object c = q.c((n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)new p<r0, d<? super j2>, Object>(this) {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ j I;
                    final /* synthetic */ q$a J;
                    
                    @e
                    public final d<j2> create(@f final Object g, @e final d<?> d) {
                        final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                            private /* synthetic */ Object G;
                            int H;
                            final /* synthetic */ j I = this.I;
                            final /* synthetic */ q$a J = this.J;
                        };
                        p2.G = g;
                        return (d<j2>)p2;
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        return ((q$a$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                    }
                    
                    @f
                    public final Object invokeSuspend(@e Object invoke) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int h2 = this.H;
                        if (h2 != 0) {
                            if (h2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(invoke);
                        }
                        else {
                            c1.n(invoke);
                            final r0 r0 = (r0)this.G;
                            final n6.q g = q;
                            final j i = this.I;
                            this.H = 1;
                            kotlin.jvm.internal.h0.e(6);
                            invoke = g.invoke((Object)r0, (Object)i, (Object)this);
                            kotlin.jvm.internal.h0.e(7);
                            if (invoke == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, (kotlin.coroutines.d<? super Object>)d);
                if (c == kotlin.coroutines.intrinsics.b.h()) {
                    return c;
                }
                return j2.a;
            }
        };
    }
}
