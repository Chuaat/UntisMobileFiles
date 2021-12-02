// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlinx.coroutines.b3;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.b2;
import kotlin.coroutines.g;
import kotlinx.coroutines.w3;
import kotlin.ranges.o;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.x3;
import kotlinx.coroutines.d1;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.d;
import kotlin.j2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f" }, d2 = { "", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/channels/q0;", "mode", "Lkotlinx/coroutines/channels/h0;", "Lkotlin/j2;", "c", "Lkotlinx/coroutines/channels/l0;", "channel", "b", "(JJLkotlinx/coroutines/channels/l0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class p0
{
    static final /* synthetic */ Object a(long i, long j, l0<? super j2> k, final d<? super j2> d) {
        Object o = null;
        Label_0058: {
            if (d instanceof p0$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (p0$a)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    o = d2;
                    break Label_0058;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                long I;
                Object J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return p0.a(0L, 0L, null, (d<? super j2>)this);
                }
            };
        }
        final Object g = ((p0$a)o).G;
        final Object h2 = b.h();
        final int h3 = ((p0$a)o).H;
        while (true) {
            Label_0281: {
                kotlin.coroutines.jvm.internal.d d3 = null;
                Label_0234: {
                    if (h3 != 0) {
                        if (h3 == 1) {
                            i = ((p0$a)o).I;
                            k = (l0)((p0$a)o).J;
                            c1.n(g);
                            d3 = (p0$a)o;
                            break Label_0234;
                        }
                        if (h3 == 2) {
                            i = ((p0$a)o).I;
                            k = (l0)((p0$a)o).J;
                            c1.n(g);
                            break Label_0281;
                        }
                        if (h3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = ((p0$a)o).I;
                        k = (l0)((p0$a)o).J;
                        c1.n(g);
                        d3 = (p0$a)o;
                    }
                    else {
                        c1.n(g);
                        ((p0$a)o).J = k;
                        ((p0$a)o).I = i;
                        ((p0$a)o).H = 1;
                        d3 = (p0$a)o;
                        if (d1.b(j, (d<? super j2>)o) == h2) {
                            return h2;
                        }
                        break Label_0234;
                    }
                    i = j;
                }
                final j2 a = j2.a;
                d3.J = k;
                d3.I = i;
                d3.H = 2;
                if (k.U(a, (d<? super j2>)d3) == h2) {
                    return h2;
                }
                o = d3;
            }
            ((p0$a)o).J = k;
            ((p0$a)o).I = i;
            ((p0$a)o).H = 3;
            kotlin.coroutines.jvm.internal.d d3 = (kotlin.coroutines.jvm.internal.d)o;
            j = i;
            if (d1.b(i, (d<? super j2>)o) == h2) {
                return h2;
            }
            continue;
        }
    }
    
    static final /* synthetic */ Object b(long j, long i, l0<? super j2> l0, final d<? super j2> d) {
        Object o = null;
        Label_0058: {
            if (d instanceof p0$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (p0$b)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    o = d2;
                    break Label_0058;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                long I;
                long J;
                Object K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return p0.b(0L, 0L, null, (d<? super j2>)this);
                }
            };
        }
        final Object g = ((p0$b)o).G;
        final Object h2 = b.h();
        final int h3 = ((p0$b)o).H;
        while (true) {
            kotlin.coroutines.jvm.internal.d d3 = null;
            Label_0546: {
                Label_0414: {
                    if (h3 != 0) {
                        if (h3 != 1) {
                            if (h3 == 2) {
                                j = ((p0$b)o).J;
                                i = ((p0$b)o).I;
                                l0 = (l0)((p0$b)o).K;
                                c1.n(g);
                                break Label_0414;
                            }
                            if (h3 == 3) {
                                j = ((p0$b)o).J;
                                i = ((p0$b)o).I;
                                l0 = (l0)((p0$b)o).K;
                                c1.n(g);
                                d3 = (p0$b)o;
                                break Label_0546;
                            }
                            if (h3 == 4) {
                                j = ((p0$b)o).J;
                                i = ((p0$b)o).I;
                                l0 = (l0)((p0$b)o).K;
                                c1.n(g);
                                d3 = (p0$b)o;
                                break Label_0546;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            j = ((p0$b)o).J;
                            i = ((p0$b)o).I;
                            l0 = (l0)((p0$b)o).K;
                            c1.n(g);
                        }
                    }
                    else {
                        c1.n(g);
                        final w3 b = x3.b();
                        long n = 0L;
                        Label_0291: {
                            if (b != null) {
                                final Long g2 = kotlin.coroutines.jvm.internal.b.g(b.b());
                                if (g2 != null) {
                                    n = g2;
                                    break Label_0291;
                                }
                            }
                            n = System.nanoTime();
                        }
                        final long k = n + t1.d(i);
                        ((p0$b)o).K = l0;
                        ((p0$b)o).I = j;
                        ((p0$b)o).J = k;
                        ((p0$b)o).H = 1;
                        if (d1.b(i, (d<? super j2>)o) == h2) {
                            return h2;
                        }
                        i = j;
                        j = k;
                    }
                    i = t1.d(i);
                    final long n2 = j;
                    final long m = n2 + i;
                    final j2 a = j2.a;
                    ((p0$b)o).K = l0;
                    ((p0$b)o).I = m;
                    ((p0$b)o).J = i;
                    ((p0$b)o).H = 2;
                    if (l0.U(a, (d<? super j2>)o) == h2) {
                        return h2;
                    }
                    j = i;
                    i = m;
                }
                final w3 b2 = x3.b();
                long n3 = 0L;
                Label_0456: {
                    if (b2 != null) {
                        final Long g3 = kotlin.coroutines.jvm.internal.b.g(b2.b());
                        if (g3 != null) {
                            n3 = g3;
                            break Label_0456;
                        }
                    }
                    n3 = System.nanoTime();
                }
                final long o2 = kotlin.ranges.o.o(i - n3, 0L);
                if (o2 == 0L && j != 0L) {
                    final long n4 = j - (n3 - i) % j;
                    i = n3 + n4;
                    final long c = t1.c(n4);
                    ((p0$b)o).K = l0;
                    ((p0$b)o).I = i;
                    ((p0$b)o).J = j;
                    ((p0$b)o).H = 3;
                    d3 = (p0$b)o;
                    if (d1.b(c, (d<? super j2>)o) == h2) {
                        return h2;
                    }
                }
                else {
                    final long c2 = t1.c(o2);
                    ((p0$b)o).K = l0;
                    ((p0$b)o).I = i;
                    ((p0$b)o).J = j;
                    ((p0$b)o).H = 4;
                    d3 = (p0$b)o;
                    if (d1.b(c2, (d<? super j2>)o) == h2) {
                        return h2;
                    }
                }
            }
            o = d3;
            final long n2 = i;
            i = j;
            continue;
        }
    }
    
    @b3
    @e
    public static final h0<j2> c(final long lng, final long lng2, @e final g g, @e final q0 q0) {
        final int n = 1;
        if (lng < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected non-negative delay, but has ");
            sb.append(lng);
            sb.append(" ms");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n2;
        if (lng2 >= 0L) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            return d0.e((r0)b2.G, i1.g().plus(g), 0, (n6.p<? super f0<? super j2>, ? super d<? super j2>, ?>)new p<f0<? super j2>, d<? super j2>, Object>(null) {
                private /* synthetic */ Object G;
                int H;
                final /* synthetic */ q0 I;
                final /* synthetic */ long J;
                final /* synthetic */ long K;
                
                @e
                public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                    final p<f0<? super j2>, d<? super j2>, Object> p2 = (p<f0<? super j2>, d<? super j2>, Object>)new p<f0<? super j2>, d<? super j2>, Object>(d) {
                        private /* synthetic */ Object G;
                        int H;
                        final /* synthetic */ q0 I = this.I;
                        final /* synthetic */ long J = this.J;
                        final /* synthetic */ long K = this.K;
                    };
                    p2.G = g;
                    return (d<j2>)p2;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((p0$c)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object o) {
                    final Object h = b.h();
                    final int h2 = this.H;
                    if (h2 != 0) {
                        if (h2 != 1 && h2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final f0 f0 = (f0)this.G;
                        final int n = o0.a[this.I.ordinal()];
                        if (n != 1) {
                            if (n == 2) {
                                final long j = this.J;
                                final long k = this.K;
                                final l0<? super j2> e = f0.e();
                                this.H = 2;
                                if (p0.a(j, k, e, (d<? super j2>)this) == h) {
                                    return h;
                                }
                            }
                        }
                        else {
                            final long i = this.J;
                            final long l = this.K;
                            final l0<? super j2> e2 = f0.e();
                            this.H = 1;
                            if (p0.b(i, l, e2, (d<? super j2>)this) == h) {
                                return h;
                            }
                        }
                    }
                    return j2.a;
                }
            });
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected non-negative initial delay, but has ");
        sb2.append(lng2);
        sb2.append(" ms");
        throw new IllegalArgumentException(sb2.toString().toString());
    }
}
