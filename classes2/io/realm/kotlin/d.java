// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.kotlin;

import io.realm.RealmQuery;
import io.realm.j0;
import kotlinx.coroutines.flow.i;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.y1;
import kotlinx.coroutines.h;
import java.io.Closeable;
import kotlin.io.c;
import kotlinx.coroutines.s0;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import n6.l;
import kotlin.coroutines.g;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import io.realm.n0;
import org.jetbrains.annotations.e;
import io.realm.f0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b\u001a\u0019\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b\u001a \u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012*\u00020\u0002\u001aD\u0010\u001b\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00050\u0016H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Lio/realm/n0;", "T", "Lio/realm/f0;", "Lio/realm/RealmQuery;", "h", "Lkotlin/j2;", "d", "b", "(Lio/realm/f0;)Lio/realm/n0;", "", "primaryKeyValue", "c", "(Lio/realm/f0;Ljava/lang/Object;)Lio/realm/n0;", "parentObject", "", "parentProperty", "a", "(Lio/realm/f0;Lio/realm/n0;Ljava/lang/String;)Lio/realm/n0;", "Lkotlinx/coroutines/flow/i;", "g", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "realm", "transaction", "e", "(Lio/realm/f0;Lkotlin/coroutines/g;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "realm-kotlin-extensions_baseRelease" }, k = 2, mv = { 1, 4, 0 })
public final class d
{
    @f
    public static final Object e(@e f0 i, @e final g j, @e final l<? super f0, j2> k, @e final kotlin.coroutines.d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0053: {
            if (d instanceof d$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (d$a)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0053;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                Object J;
                Object K;
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return d.e(null, null, null, this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final l l = (l)d3.K;
            final g g2 = (g)d3.J;
            i = (f0)d3.I;
            c1.n(g);
        }
        else {
            c1.n(g);
            final p<r0, kotlin.coroutines.d<? super j2>, Object> p4 = new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                private r0 G;
                int H;
                final /* synthetic */ f0 I;
                final /* synthetic */ l J;
                
                @org.jetbrains.annotations.e
                @Override
                public final d<j2> create(@f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                    k0.q(d, "completion");
                    final p<r0, d<? super j2>, Object> p2 = new p<r0, d<? super j2>, Object>() {
                        private r0 G;
                        int H;
                        final /* synthetic */ f0 I = this.I;
                        final /* synthetic */ l J = this.J;
                    };
                    p2.G = (r0)o;
                    return (d<j2>)p2;
                }
                
                @Override
                public final Object invoke(final Object o, final Object o2) {
                    return ((d$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                    b.h();
                    if (this.H == 0) {
                        c1.n(o);
                        final r0 g = this.G;
                        final f0 q2 = f0.q2(this.I.D());
                        try {
                            if (s0.k(g)) {
                                final l j = this.J;
                                if ((o = j) != null) {
                                    o = new io.realm.kotlin.e(j);
                                }
                                q2.H1((f0.d)o);
                            }
                            final j2 a = j2.a;
                            c.a(q2, null);
                            return a;
                        }
                        finally {
                            try {}
                            finally {
                                c.a(q2, (Throwable)o);
                            }
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            };
            d3.I = i;
            d3.J = j;
            d3.K = k;
            d3.H = 1;
            if (h.i(j, (p)p4, (kotlin.coroutines.d)d3) == h2) {
                return h2;
            }
        }
        i.S();
        return j2.a;
    }
    
    @e
    public static final i<f0> g(@e final f0 f0) {
        k0.q(f0, "$this$toflow");
        final j0 d = f0.D();
        k0.h(d, "configuration");
        final i<f0> f2 = d.h().f(f0);
        k0.h(f2, "configuration.flowFactory.from(this)");
        return f2;
    }
}
