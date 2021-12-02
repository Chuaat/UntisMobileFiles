// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.collections.v;
import n6.p;
import kotlinx.coroutines.d1;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.q;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017" }, d2 = { "Lkotlinx/coroutines/flow/u0;", "Lkotlinx/coroutines/flow/q0;", "Lkotlinx/coroutines/flow/v0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/o0;", "a", "", "toString", "", "other", "", "equals", "hashCode", "", "c", "J", "replayExpiration", "b", "stopTimeout", "<init>", "(JJ)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class u0 implements q0
{
    private final long b;
    private final long c;
    
    public u0(final long n, final long n2) {
        this.b = n;
        this.c = n2;
        final int n3 = 1;
        if (n < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("stopTimeout(");
            sb.append(n);
            sb.append(" ms) cannot be negative");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n4;
        if (n2 >= 0L) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("replayExpiration(");
        sb2.append(n2);
        sb2.append(" ms) cannot be negative");
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public static final /* synthetic */ long b(final u0 u0) {
        return u0.c;
    }
    
    public static final /* synthetic */ long c(final u0 u0) {
        return u0.b;
    }
    
    @e
    @Override
    public i<o0> a(@e final v0<Integer> v0) {
        return l.l0(l.p0(l.m2((i<?>)v0, (n6.q<? super j<? super o0>, ? super Object, ? super d<? super j2>, ?>)new q<j<? super o0>, Integer, d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            private /* synthetic */ int H;
            int I;
            final /* synthetic */ u0 J;
            
            public final Object invoke(final Object o, final Object o2, final Object o3) {
                return ((u0$a)this.n((j<? super o0>)o, ((Number)o2).intValue(), (d<? super j2>)o3)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                j<o0> g = null;
                Label_0264: {
                    Label_0232: {
                        j k = null;
                        Label_0184: {
                            if (i != 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        final j j = (j)this.G;
                                        c1.n(o);
                                        k = j;
                                        break Label_0184;
                                    }
                                    if (i == 3) {
                                        g = (j<o0>)this.G;
                                        c1.n(o);
                                        break Label_0232;
                                    }
                                    if (i == 4) {
                                        g = (j<o0>)this.G;
                                        c1.n(o);
                                        break Label_0264;
                                    }
                                    if (i != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }
                                c1.n(o);
                                return j2.a;
                            }
                            c1.n(o);
                            k = (j)this.G;
                            if (this.H > 0) {
                                final o0 g2 = o0.G;
                                this.I = 1;
                                if (k.b(g2, (d<? super j2>)this) == h) {
                                    return h;
                                }
                                return j2.a;
                            }
                            else {
                                final long c = u0.c(this.J);
                                this.G = k;
                                this.I = 2;
                                if (d1.b(c, (d<? super j2>)this) == h) {
                                    return h;
                                }
                            }
                        }
                        g = (j<o0>)k;
                        if (u0.b(this.J) <= 0L) {
                            break Label_0264;
                        }
                        final o0 h2 = o0.H;
                        this.G = k;
                        this.I = 3;
                        g = (j<o0>)k;
                        if (k.b(h2, (d<? super j2>)this) == h) {
                            return h;
                        }
                    }
                    final long b = u0.b(this.J);
                    this.G = g;
                    this.I = 4;
                    if (d1.b(b, (d<? super j2>)this) == h) {
                        return h;
                    }
                }
                final o0 l = o0.I;
                this.G = null;
                this.I = 5;
                if (g.b(l, (d<? super j2>)this) == h) {
                    return h;
                }
                return j2.a;
            }
            
            @e
            public final d<j2> n(@e final j<? super o0> g, final int h, @e final d<? super j2> d) {
                final q<j<? super o0>, Integer, d<? super j2>, Object> q = (q<j<? super o0>, Integer, d<? super j2>, Object>)new q<j<? super o0>, Integer, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    private /* synthetic */ int H;
                    int I;
                    final /* synthetic */ u0 J = this.J;
                    
                    public final Object invoke(final Object o, final Object o2, final Object o3) {
                        return ((u0$a)this.n((j<? super o0>)o, ((Number)o2).intValue(), (d<? super j2>)o3)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int i = this.I;
                        j<o0> g = null;
                        Label_0264: {
                            Label_0232: {
                                j k = null;
                                Label_0184: {
                                    if (i != 0) {
                                        if (i != 1) {
                                            if (i == 2) {
                                                final j j = (j)this.G;
                                                c1.n(o);
                                                k = j;
                                                break Label_0184;
                                            }
                                            if (i == 3) {
                                                g = (j<o0>)this.G;
                                                c1.n(o);
                                                break Label_0232;
                                            }
                                            if (i == 4) {
                                                g = (j<o0>)this.G;
                                                c1.n(o);
                                                break Label_0264;
                                            }
                                            if (i != 5) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        }
                                        c1.n(o);
                                        return j2.a;
                                    }
                                    c1.n(o);
                                    k = (j)this.G;
                                    if (this.H > 0) {
                                        final o0 g2 = o0.G;
                                        this.I = 1;
                                        if (k.b(g2, (d<? super j2>)this) == h) {
                                            return h;
                                        }
                                        return j2.a;
                                    }
                                    else {
                                        final long c = u0.c(this.J);
                                        this.G = k;
                                        this.I = 2;
                                        if (d1.b(c, (d<? super j2>)this) == h) {
                                            return h;
                                        }
                                    }
                                }
                                g = (j<o0>)k;
                                if (u0.b(this.J) <= 0L) {
                                    break Label_0264;
                                }
                                final o0 h2 = o0.H;
                                this.G = k;
                                this.I = 3;
                                g = (j<o0>)k;
                                if (k.b(h2, (d<? super j2>)this) == h) {
                                    return h;
                                }
                            }
                            final long b = u0.b(this.J);
                            this.G = g;
                            this.I = 4;
                            if (d1.b(b, (d<? super j2>)this) == h) {
                                return h;
                            }
                        }
                        final o0 l = o0.I;
                        this.G = null;
                        this.I = 5;
                        if (g.b(l, (d<? super j2>)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                };
                q.G = g;
                q.H = h;
                return (d<j2>)q;
            }
        }), (n6.p<? super o0, ? super d<? super Boolean>, ?>)new p<o0, d<? super Boolean>, Object>(null) {
            private /* synthetic */ Object G;
            int H;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                final p<o0, d<? super Boolean>, Object> p2 = (p<o0, d<? super Boolean>, Object>)new p<o0, d<? super Boolean>, Object>(d) {
                    private /* synthetic */ Object G;
                    int H;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((u0$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.H == 0) {
                    c1.n(o);
                    return kotlin.coroutines.jvm.internal.b.a(this.G != o0.G);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }));
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (o instanceof u0) {
            final long b = this.b;
            final u0 u0 = (u0)o;
            if (b == u0.b && this.c == u0.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Long.valueOf(this.b).hashCode() * 31 + Long.valueOf(this.c).hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final List j = v.j(2);
        if (this.b > 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("stopTimeout=");
            sb.append(this.b);
            sb.append("ms");
            j.add(sb.toString());
        }
        if (this.c < Long.MAX_VALUE) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("replayExpiration=");
            sb2.append(this.c);
            sb2.append("ms");
            j.add(sb2.toString());
        }
        final List a = v.a(j);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("SharingStarted.WhileSubscribed(");
        sb3.append(v.Z2((Iterable)a, (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (n6.l)null, 63, (Object)null));
        sb3.append(')');
        return sb3.toString();
    }
}
