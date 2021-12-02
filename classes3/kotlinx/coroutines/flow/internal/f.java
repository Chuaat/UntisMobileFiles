// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.collections.v;
import kotlinx.coroutines.x0;
import java.util.ArrayList;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.channels.f0;
import kotlinx.coroutines.channels.m;
import kotlinx.coroutines.u0;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.flow.l;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.channels.n;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.coroutines.g;
import kotlinx.coroutines.f2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\n\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001f\u001a\u00020\u001dH\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00078B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010'R;\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0)\u0012\u0006\u0012\u0004\u0018\u00010*0(8@@\u0000X\u0080\u0004\u00f8\u0001\u0000¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060" }, d2 = { "Lkotlinx/coroutines/flow/internal/f;", "T", "Lkotlinx/coroutines/flow/internal/t;", "Lkotlinx/coroutines/flow/i;", "m", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "d", "k", "Lkotlinx/coroutines/channels/f0;", "scope", "Lkotlin/j2;", "h", "(Lkotlinx/coroutines/channels/f0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/r0;", "Lkotlinx/coroutines/u0;", "start", "Lkotlinx/coroutines/channels/j;", "f", "Lkotlinx/coroutines/channels/h0;", "p", "Lkotlinx/coroutines/flow/j;", "collector", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "toString", "H", "I", "G", "Lkotlin/coroutines/g;", "o", "()I", "produceCapacity", "Lkotlinx/coroutines/channels/n;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "n", "()Ln6/p;", "collectToFun", "<init>", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public abstract class f<T> implements t<T>
{
    @d
    @e
    public final g G;
    @d
    public final int H;
    @d
    @e
    public final n I;
    
    public f(@e final g g, int h, @e final n i) {
        this.G = g;
        this.H = h;
        this.I = i;
        if (w0.b()) {
            if (h != -1) {
                h = 1;
            }
            else {
                h = 0;
            }
            if (h == 0) {
                throw new AssertionError();
            }
        }
    }
    
    static /* synthetic */ Object g(final f f, final j j, final kotlin.coroutines.d d) {
        final Object g = s0.g((n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ f I;
            final /* synthetic */ j J;
            
            @e
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object g, @e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super j2>, Object> p2 = (p<r0, kotlin.coroutines.d<? super j2>, Object>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ f I = this.I;
                    final /* synthetic */ j J = this.J;
                };
                p2.G = g;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((f$a)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
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
                    final r0 r0 = (r0)this.G;
                    final j j = this.J;
                    final h0<T> p = this.I.p(r0);
                    this.H = 1;
                    if (l.q0((j<? super Object>)j, (h0<?>)p, (kotlin.coroutines.d<? super j2>)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d<? super Object>)d);
        if (g == b.h()) {
            return g;
        }
        return j2.a;
    }
    
    private final int o() {
        int h;
        if ((h = this.H) == -3) {
            h = -2;
        }
        return h;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final j<? super T> j, @e final kotlin.coroutines.d<? super j2> d) {
        return g(this, j, d);
    }
    
    @e
    @Override
    public i<T> d(@e g plus, int n, @e n i) {
        final boolean b = w0.b();
        final int n2 = 1;
        if (b && n == -1) {
            throw new AssertionError();
        }
        plus = plus.plus(this.G);
        if (i == n.G) {
            final int h = this.H;
            if (h != -3) {
                if (n == -3) {
                    n = h;
                }
                else if (h != -2) {
                    if (n == -2) {
                        n = h;
                    }
                    else {
                        if (w0.b() && this.H < 0) {
                            throw new AssertionError();
                        }
                        if (w0.b()) {
                            int n3;
                            if (n >= 0) {
                                n3 = n2;
                            }
                            else {
                                n3 = 0;
                            }
                            if (n3 == 0) {
                                throw new AssertionError();
                            }
                        }
                        n += this.H;
                        if (n < 0) {
                            n = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i = this.I;
        }
        if (k0.g((Object)plus, (Object)this.G) && n == this.H && i == this.I) {
            return this;
        }
        return this.k(plus, n, i);
    }
    
    @org.jetbrains.annotations.f
    protected String e() {
        return null;
    }
    
    @e
    public kotlinx.coroutines.channels.j<T> f(@e final r0 r0, @e final u0 u0) {
        final int n = kotlinx.coroutines.flow.internal.e.a[this.I.ordinal()];
        int o;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new kotlin.h0();
                }
                throw new IllegalArgumentException("Broadcast channel does not support BufferOverflow.DROP_LATEST");
            }
            else {
                o = -1;
            }
        }
        else {
            o = this.o();
        }
        return (kotlinx.coroutines.channels.j<T>)m.c(r0, this.G, o, u0, null, this.n(), 8, null);
    }
    
    @org.jetbrains.annotations.f
    protected abstract Object h(@e final f0<? super T> p0, @e final kotlin.coroutines.d<? super j2> p1);
    
    @e
    protected abstract f<T> k(@e final g p0, final int p1, @e final n p2);
    
    @org.jetbrains.annotations.f
    public i<T> m() {
        return null;
    }
    
    @e
    public final p<f0<? super T>, kotlin.coroutines.d<? super j2>, Object> n() {
        return (p<f0<? super T>, kotlin.coroutines.d<? super j2>, Object>)new p<f0<? super T>, kotlin.coroutines.d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ f I;
            
            @e
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object g, @e final kotlin.coroutines.d<?> d) {
                final p<f0<? super T>, kotlin.coroutines.d<? super j2>, Object> p2 = (p<f0<? super T>, kotlin.coroutines.d<? super j2>, Object>)new p<f0<? super T>, kotlin.coroutines.d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ f I = this.I;
                };
                p2.G = g;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((f$b)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
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
                    final f0 f0 = (f0)this.G;
                    final f i = this.I;
                    this.H = 1;
                    if (i.h(f0, (kotlin.coroutines.d<? super j2>)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        };
    }
    
    @e
    public h0<T> p(@e final r0 r0) {
        return (h0<T>)d0.g(r0, this.G, this.o(), this.I, u0.I, null, this.n(), 16, null);
    }
    
    @e
    @Override
    public String toString() {
        final ArrayList<String> list = new ArrayList<String>(4);
        final String e = this.e();
        if (e != null) {
            list.add(e);
        }
        if (this.G != kotlin.coroutines.i.H) {
            final StringBuilder sb = new StringBuilder();
            sb.append("context=");
            sb.append(this.G);
            list.add(sb.toString());
        }
        if (this.H != -3) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("capacity=");
            sb2.append(this.H);
            list.add(sb2.toString());
        }
        if (this.I != n.G) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("onBufferOverflow=");
            sb3.append(this.I);
            list.add(sb3.toString());
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(x0.a(this));
        sb4.append('[');
        sb4.append(v.Z2((Iterable)list, (CharSequence)", ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (n6.l)null, 62, (Object)null));
        sb4.append(']');
        return sb4.toString();
    }
}
