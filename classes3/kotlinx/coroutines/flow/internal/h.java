// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.u0;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.o2;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.channels.l0;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.k2;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.f0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.flow.i;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0014R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Lkotlinx/coroutines/flow/internal/h;", "T", "Lkotlinx/coroutines/flow/internal/f;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "k", "Lkotlinx/coroutines/r0;", "scope", "Lkotlinx/coroutines/channels/h0;", "p", "Lkotlinx/coroutines/channels/f0;", "Lkotlin/j2;", "h", "(Lkotlinx/coroutines/channels/f0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "Lkotlinx/coroutines/flow/i;", "J", "Lkotlinx/coroutines/flow/i;", "flow", "K", "I", "concurrency", "<init>", "(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class h<T> extends f<T>
{
    private final i<i<T>> J;
    private final int K;
    
    public h(@e final i<? extends i<? extends T>> j, final int k, @e final g g, final int n, @e final n n2) {
        super(g, n, n2);
        this.J = (i<i<T>>)j;
        this.K = k;
    }
    
    @e
    @Override
    protected String e() {
        final StringBuilder sb = new StringBuilder();
        sb.append("concurrency=");
        sb.append(this.K);
        return sb.toString();
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object h(@e final f0<? super T> f0, @e final d<? super j2> d) {
        final Object c = this.J.c((j<? super i<T>>)new j<i<? extends T>>() {
            final /* synthetic */ k2 G = (k2)d.getContext().get((g$c)k2.t);
            final /* synthetic */ kotlinx.coroutines.sync.f H = kotlinx.coroutines.sync.h.b(h.this.K, 0, 2, null);
            final /* synthetic */ a0 J = new a0((l0<? super T>)f0);
            
            @org.jetbrains.annotations.f
            @Override
            public Object b(final Object o, @e final d d) {
                kotlin.coroutines.jvm.internal.d d3 = null;
                Label_0050: {
                    if (d instanceof h$a$a) {
                        final kotlin.coroutines.jvm.internal.d d2 = (h$a$a)d;
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
                        final /* synthetic */ h$a I;
                        Object J;
                        Object K;
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@e final Object g) {
                            this.G = g;
                            this.H |= Integer.MIN_VALUE;
                            return this.I.b(null, (d)this);
                        }
                    };
                }
                final Object g = d3.G;
                final Object h2 = b.h();
                final int h3 = d3.H;
                i k;
                j<i<? extends T>> j;
                if (h3 != 0) {
                    if (h3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k = (i)d3.K;
                    j = (h$a)d3.J;
                    c1.n(g);
                }
                else {
                    c1.n(g);
                    k = (i)o;
                    final k2 g2 = this.G;
                    if (g2 != null) {
                        o2.B(g2);
                    }
                    final kotlinx.coroutines.sync.f h4 = this.H;
                    d3.J = this;
                    d3.K = k;
                    d3.H = 1;
                    if (h4.b((d<? super j2>)d3) == h2) {
                        return h2;
                    }
                    j = this;
                }
                kotlinx.coroutines.h.f(f0, null, null, (p)new p<r0, d<? super j2>, Object>(j) {
                    int G;
                    final /* synthetic */ i H;
                    final /* synthetic */ h$a I;
                    
                    @e
                    public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                        return (d<j2>)new p<r0, d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ i H = this.H;
                            final /* synthetic */ h$a I = this.I;
                        };
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        return ((h$a$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@e Object c) {
                        final Object h = b.h();
                        final int g = this.G;
                        Label_0079: {
                            if (g != 0) {
                                if (g == 1) {
                                    Label_0095: {
                                        try {
                                            c1.n(c);
                                            break Label_0079;
                                        }
                                        finally {
                                            break Label_0095;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    this.I.H.release();
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(c);
                            final i h2 = this.H;
                            final a0 j = this.I.J;
                            this.G = 1;
                            c = h2.c(j, (d)this);
                            if (c == h) {
                                return h;
                            }
                        }
                        this.I.H.release();
                        return j2.a;
                    }
                }, 3, null);
                return j2.a;
            }
        }, d);
        if (c == b.h()) {
            return c;
        }
        return j2.a;
    }
    
    @e
    @Override
    protected f<T> k(@e final g g, final int n, @e final n n2) {
        return new h(this.J, this.K, g, n, n2);
    }
    
    @e
    @Override
    public h0<T> p(@e final r0 r0) {
        return q.a(r0, super.G, super.H, (n6.p<? super f0<? super T>, ? super d<? super j2>, ?>)this.n());
    }
}
