// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.m0;
import kotlin.coroutines.g$c;
import kotlin.coroutines.a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.l0;
import kotlin.b;
import kotlin.coroutines.d;
import n6.p;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.r0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u009e\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b" }, d2 = { "E", "Lkotlinx/coroutines/channels/h0;", "", "capacity", "Lkotlinx/coroutines/u0;", "start", "Lkotlinx/coroutines/channels/j;", "b", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "cause", "Lkotlin/j2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/f0;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "a", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILkotlinx/coroutines/u0;Ln6/l;Ln6/p;)Lkotlinx/coroutines/channels/j;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class m
{
    @e
    public static final <E> j<E> a(@e final r0 r0, @e final g g, final int n, @e final u0 u0, @f final l<? super Throwable, j2> l, @b @e final p<? super f0<? super E>, ? super d<? super j2>, ?> p6) {
        final g d = l0.d(r0, g);
        final j<Object> a = k.a(n);
        kotlinx.coroutines.channels.l i;
        if (u0.f()) {
            i = new b0<Object>(d, a, p6);
        }
        else {
            i = new kotlinx.coroutines.channels.l<Object>(d, a, true);
        }
        if (l != null) {
            i.N(l);
        }
        i.x1(u0, (kotlinx.coroutines.channels.l<Object>)i, p6);
        return (j<E>)i;
    }
    
    @e
    public static final <E> j<E> b(@e final h0<? extends E> h0, final int n, @e final u0 u0) {
        return (j<E>)c(s0.m(s0.m(b2.G, (g)i1.g()), (g)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            public void handleException(@e final g g, @e final Throwable t) {
            }
        }), null, n, u0, (l)new l<Throwable, j2>() {
            public final void a(@f final Throwable t) {
                s.r(h0, t);
            }
        }, (p)new p<f0<? super E>, d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            Object H;
            int I;
            final /* synthetic */ h0 J;
            
            @e
            public final d<j2> create(@f final Object g, @e final d<?> d) {
                final p<f0<? super E>, d<? super j2>, Object> p2 = (p<f0<? super E>, d<? super j2>, Object>)new p<f0<? super E>, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    Object H;
                    int I;
                    final /* synthetic */ h0 J = this.J;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((m$c)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@e Object next) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                while (true) {
                    q<Object> q = null;
                    f0 f0 = null;
                    Object o = null;
                    Label_0157: {
                        q<Object> iterator;
                        if (i != 0) {
                            if (i == 1) {
                                q = (q<Object>)this.H;
                                f0 = (f0)this.G;
                                c1.n(next);
                                o = this;
                                break Label_0157;
                            }
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            iterator = (q<Object>)this.H;
                            f0 = (f0)this.G;
                            c1.n(next);
                        }
                        else {
                            c1.n(next);
                            f0 = (f0)this.G;
                            iterator = this.J.iterator();
                        }
                        final Object o2 = this;
                        q = iterator;
                        ((m$c)o2).G = f0;
                        ((m$c)o2).H = q;
                        ((m$c)o2).I = 1;
                        final Object a = q.a((d<? super Boolean>)o2);
                        if (a == h) {
                            return h;
                        }
                        o = o2;
                        next = a;
                    }
                    if (!(boolean)next) {
                        return j2.a;
                    }
                    next = q.next();
                    ((m$c)o).G = f0;
                    ((m$c)o).H = q;
                    ((m$c)o).I = 2;
                    if (f0.U(next, (d<? super j2>)o) == h) {
                        return h;
                    }
                    final Object o2 = o;
                    continue;
                }
            }
        }, 1, null);
    }
    
    public static /* synthetic */ j c(final r0 r0, g h, int n, u0 h2, l l, final p p8, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            h = (g)i.H;
        }
        if ((n2 & 0x2) != 0x0) {
            n = 1;
        }
        if ((n2 & 0x4) != 0x0) {
            h2 = u0.H;
        }
        if ((n2 & 0x8) != 0x0) {
            l = null;
        }
        return a(r0, h, n, h2, (l<? super Throwable, j2>)l, (n6.p<? super f0<? super Object>, ? super d<? super j2>, ?>)p8);
    }
}
