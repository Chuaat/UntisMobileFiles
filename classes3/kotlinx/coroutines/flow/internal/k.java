// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.h;
import kotlinx.coroutines.u0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k2;
import kotlin.jvm.internal.j1$h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlin.coroutines.jvm.internal.b;
import kotlinx.coroutines.w0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.j;
import n6.q;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Lkotlinx/coroutines/flow/internal/k;", "T", "R", "Lkotlinx/coroutines/flow/internal/i;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/f;", "k", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/j2;", "t", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/t0;", "name", "value", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "transform", "Lkotlinx/coroutines/flow/i;", "flow", "<init>", "(Ln6/q;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class k<T, R> extends i<T, R>
{
    private final q<j<? super R>, T, d<? super j2>, Object> K;
    
    public k(@e final q<? super j<? super R>, ? super T, ? super d<? super j2>, ?> k, @e final kotlinx.coroutines.flow.i<? extends T> i, @e final g g, final int n, @e final n n2) {
        super(i, g, n, n2);
        this.K = (q<j<? super R>, T, d<? super j2>, Object>)k;
    }
    
    public static final /* synthetic */ q u(final k k) {
        return k.K;
    }
    
    @e
    @Override
    protected f<R> k(@e final g g, final int n, @e final n n2) {
        return (f<R>)new k((n6.q<? super j<? super Object>, ? super Object, ? super d<? super j2>, ?>)this.K, super.J, g, n, n2);
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object t(@e final j<? super R> j, @e final d<? super j2> d) {
        if (w0.b() && !b.a(j instanceof a0)) {
            throw new AssertionError();
        }
        final Object c = kotlinx.coroutines.flow.internal.q.c((n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)new p<r0, d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ k I;
            final /* synthetic */ j J;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ k I = this.I;
                    final /* synthetic */ j J = this.J;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((k$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final r0 r0 = (r0)this.G;
                    final j1$h j1$h = new j1$h();
                    j1$h.G = null;
                    final kotlinx.coroutines.flow.i<S> j = this.I.J;
                    final j<T> i = new j<T>() {
                        final /* synthetic */ k$a G;
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public Object b(Object k, @e final d d) {
                            kotlin.coroutines.jvm.internal.d d3 = null;
                            Label_0050: {
                                if (d instanceof k$a$a$a) {
                                    final kotlin.coroutines.jvm.internal.d d2 = (k$a$a$a)d;
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
                                    final /* synthetic */ k$a$a I;
                                    Object J;
                                    Object K;
                                    Object L;
                                    
                                    @org.jetbrains.annotations.f
                                    public final Object invokeSuspend(@e final Object g) {
                                        this.G = g;
                                        this.H |= Integer.MIN_VALUE;
                                        return this.I.b(null, (d)this);
                                    }
                                };
                            }
                            final Object g = d3.G;
                            final Object h2 = kotlin.coroutines.intrinsics.b.h();
                            final int h3 = d3.H;
                            j<T> j;
                            if (h3 != 0) {
                                if (h3 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                final k2 k2 = (k2)d3.L;
                                k = d3.K;
                                j = (k$a$a)d3.J;
                                c1.n(g);
                            }
                            else {
                                c1.n(g);
                                final k2 l = (k2)j1$h.G;
                                if (l != null) {
                                    l.d(new m());
                                    d3.J = this;
                                    d3.K = k;
                                    d3.L = l;
                                    d3.H = 1;
                                    if (l.s((d<? super j2>)d3) == h2) {
                                        return h2;
                                    }
                                }
                                j = this;
                            }
                            j1$h.G = kotlinx.coroutines.h.f(r0, null, u0.J, (p)new p<r0, d<? super j2>, Object>(j) {
                                int G;
                                final /* synthetic */ Object H;
                                final /* synthetic */ k$a$a I;
                                
                                @e
                                public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                                    return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                        int G;
                                        final /* synthetic */ Object H = this.H;
                                        final /* synthetic */ k$a$a I = this.I;
                                    };
                                }
                                
                                public final Object invoke(final Object o, final Object o2) {
                                    return ((k$a$a$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                                }
                                
                                @org.jetbrains.annotations.f
                                public final Object invokeSuspend(@e Object h) {
                                    final Object h2 = kotlin.coroutines.intrinsics.b.h();
                                    final int g = this.G;
                                    if (g != 0) {
                                        if (g != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        c1.n(h);
                                    }
                                    else {
                                        c1.n(h);
                                        final q u = k.u(this.I.G.I);
                                        final j j = this.I.G.J;
                                        h = this.H;
                                        this.G = 1;
                                        if (u.invoke((Object)j, h, (Object)this) == h2) {
                                            return h2;
                                        }
                                    }
                                    return j2.a;
                                }
                            }, 1, null);
                            return j2.a;
                        }
                    };
                    this.H = 1;
                    if (j.c((j<? super S>)i, (d<? super j2>)this) == h) {
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
}
