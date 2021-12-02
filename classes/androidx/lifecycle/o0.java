// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.coroutines.g$c;
import kotlin.c1;
import kotlinx.coroutines.k2;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.i1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u001aF\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001aF\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u001aF\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\f\u001aN\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015" }, d2 = { "T", "Landroidx/lifecycle/y;", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "b", "(Landroidx/lifecycle/y;Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/s;", "a", "(Landroidx/lifecycle/s;Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "e", "d", "c", "Landroidx/lifecycle/s$c;", "minState", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/s$c;Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class o0
{
    @f
    public static final <T> Object a(@e final s s, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        return g(s, s.c.I, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    public static final <T> Object b(@e final y y, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        final s lifecycle = y.getLifecycle();
        k0.h((Object)lifecycle, "lifecycle");
        return a(lifecycle, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    public static final <T> Object c(@e final s s, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        return g(s, s.c.K, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    public static final <T> Object d(@e final y y, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        final s lifecycle = y.getLifecycle();
        k0.h((Object)lifecycle, "lifecycle");
        return c(lifecycle, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    public static final <T> Object e(@e final s s, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        return g(s, s.c.J, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    public static final <T> Object f(@e final y y, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        final s lifecycle = y.getLifecycle();
        k0.h((Object)lifecycle, "lifecycle");
        return e(lifecycle, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    public static final <T> Object g(@e final s s, @e final s.c c, @e final p<? super r0, ? super d<? super T>, ?> p4, @e final d<? super T> d) {
        return h.i((g)i1.e().M(), (p)new p<r0, d<? super T>, Object>(null) {
            private r0 G;
            Object H;
            Object I;
            Object J;
            Object K;
            int L;
            final /* synthetic */ s M;
            final /* synthetic */ s.c N;
            final /* synthetic */ p O;
            
            @e
            public final d<j2> create(@f final Object o, @e final d<?> d) {
                k0.q((Object)d, "completion");
                final p<r0, d<? super T>, Object> p2 = (p<r0, d<? super T>, Object>)new p<r0, d<? super T>, Object>(d) {
                    private r0 G;
                    Object H;
                    Object I;
                    Object J;
                    Object K;
                    int L;
                    final /* synthetic */ s M = this.M;
                    final /* synthetic */ s.c N = this.N;
                    final /* synthetic */ p O = this.O;
                };
                p2.G = (r0)o;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((o0$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@e Object k) {
                final Object h = b.h();
                final int l = this.L;
                Object o = null;
                Label_0198: {
                    if (l != 0) {
                        if (l == 1) {
                            o = this.K;
                            final n0 n0 = (n0)this.J;
                            final k2 k2 = (k2)this.I;
                            Object i = this.H;
                            try {
                                c1.n(k);
                                i = k;
                                break Label_0198;
                            }
                            finally {
                                break Label_0198;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(k);
                    final r0 g = this.G;
                    final k2 j = (k2)g.J().get((g$c)k2.t);
                    if (j == null) {
                        throw new IllegalStateException("when[State] methods should have a parent job".toString());
                    }
                    final n0 m = new n0();
                    k = new LifecycleController(this.M, this.N, m.H, j);
                    try {
                        final p o2 = this.O;
                        this.H = g;
                        this.I = j;
                        this.J = m;
                        this.K = k;
                        this.L = 1;
                        final Object i = kotlinx.coroutines.h.i((g)m, o2, (d)this);
                        if (i == h) {
                            return h;
                        }
                        o = k;
                        ((LifecycleController)o).d();
                        return i;
                    }
                    finally {
                        final Object o3 = k;
                        final Throwable t;
                        k = t;
                        o = o3;
                    }
                }
                ((LifecycleController)o).d();
                throw k;
            }
        }, (d)d);
    }
}
