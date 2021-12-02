// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlin.jvm.internal.j1$a;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/flow/t0;", "Lkotlinx/coroutines/flow/q0;", "Lkotlinx/coroutines/flow/v0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/o0;", "a", "", "toString", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class t0 implements q0
{
    public t0() {
    }
    
    @e
    @Override
    public i<o0> a(@e final v0<Integer> v0) {
        return l.N0((n6.p<? super j<? super o0>, ? super d<? super j2>, ?>)new p<j<? super o0>, d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ v0 I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                final p<j<? super o0>, d<? super j2>, Object> p2 = (p<j<? super o0>, d<? super j2>, Object>)new p<j<? super o0>, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ v0 I = this.I;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((t0$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = b.h();
                final int h2 = this.H;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final j j = (j)this.G;
                    final j1$a j1$a = new j1$a();
                    j1$a.G = false;
                    final v0 i = this.I;
                    final j<Integer> k = new j<Integer>() {
                        @org.jetbrains.annotations.f
                        @Override
                        public Object b(final Object o, @e final d d) {
                            Object o2 = null;
                            Label_0050: {
                                if (d instanceof t0$a$a$a) {
                                    final kotlin.coroutines.jvm.internal.d d2 = (t0$a$a$a)d;
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
                                    final /* synthetic */ t0$a$a I;
                                    
                                    @org.jetbrains.annotations.f
                                    public final Object invokeSuspend(@e final Object g) {
                                        this.G = g;
                                        this.H |= Integer.MIN_VALUE;
                                        return this.I.b(null, (d)this);
                                    }
                                };
                            }
                            final Object g = ((t0$a$a$a)o2).G;
                            final Object h2 = b.h();
                            final int h3 = ((t0$a$a$a)o2).H;
                            if (h3 != 0) {
                                if (h3 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c1.n(g);
                            }
                            else {
                                c1.n(g);
                                if (((Number)o).intValue() > 0) {
                                    final j1$a h4 = j1$a;
                                    if (!h4.G) {
                                        h4.G = true;
                                        final j g2 = j;
                                        final o0 g3 = o0.G;
                                        ((t0$a$a$a)o2).H = 1;
                                        if (g2.b(g3, (d<? super j2>)o2) == h2) {
                                            return h2;
                                        }
                                    }
                                }
                            }
                            return j2.a;
                        }
                    };
                    this.H = 1;
                    if (i.c(k, (d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
