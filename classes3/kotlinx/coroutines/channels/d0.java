// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.z1;
import kotlin.coroutines.jvm.internal.h;
import kotlin.b1$a;
import kotlin.b1;
import kotlinx.coroutines.o;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlinx.coroutines.p;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.k2;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.d;
import kotlin.j2;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0087@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aª\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\"" }, d2 = { "Lkotlinx/coroutines/channels/f0;", "Lkotlin/Function0;", "Lkotlin/j2;", "block", "a", "(Lkotlinx/coroutines/channels/f0;Ln6/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "E", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "Lkotlinx/coroutines/channels/h0;", "e", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILn6/p;)Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/u0;", "start", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILkotlinx/coroutines/u0;Ln6/l;Ln6/p;)Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "d", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/n;Lkotlinx/coroutines/u0;Ln6/l;Ln6/p;)Lkotlinx/coroutines/channels/h0;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class d0
{
    @z1
    @org.jetbrains.annotations.f
    public static final Object a(@e final f0<?> i, @e final a<j2> j, @e d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d2 = null;
        Label_0047: {
            if (d instanceof d0$a) {
                d2 = (d0$a)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            d2 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                Object J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return d0.a(null, null, (d<? super j2>)this);
                }
            };
        }
        final Object g = d2.G;
        final Object h2 = b.h();
        final int h3 = d2.H;
        final a<j2> a2;
        Label_0265: {
            if (h3 != 0) {
                if (h3 == 1) {
                    final a a = (a)d2.J;
                    final f0 f0 = (f0)d2.I;
                    d = (d)a;
                    Label_0276: {
                        try {
                            c1.n(g);
                            break Label_0265;
                        }
                        finally {
                            break Label_0276;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ((a)d).invoke();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(g);
            if ((k2)((d)d2).getContext().get((g$c)k2.t) != i) {
                throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
            }
            d2.I = i;
            d2.J = j;
            d2.H = 1;
            final p p2 = new p((kotlin.coroutines.d<? super Object>)b.d((d)d2), 1);
            p2.H();
            i.K((l)new l<Throwable, j2>() {
                public final void a(@org.jetbrains.annotations.f final Throwable t) {
                    final o g = p2;
                    final j2 a = j2.a;
                    final b1$a h = b1.H;
                    ((d)g).resumeWith(b1.b((Object)a));
                }
            });
            final Object y = p2.y();
            if (y == b.h()) {
                h.c((d)d2);
            }
            a2 = j;
            if (y == h2) {
                return h2;
            }
        }
        a2.invoke();
        return j2.a;
    }
    
    @f2
    @e
    public static final <E> h0<E> c(@e final r0 r0, @e final g g, final int n, @e final u0 u0, @org.jetbrains.annotations.f final l<? super Throwable, j2> l, @kotlin.b @e final n6.p<? super f0<? super E>, ? super d<? super j2>, ?> p6) {
        return d(r0, g, n, n.G, u0, l, p6);
    }
    
    @e
    public static final <E> h0<E> d(@e final r0 r0, @e final g g, final int n, @e final n n2, @e final u0 u0, @org.jetbrains.annotations.f final l<? super Throwable, j2> l, @kotlin.b @e final n6.p<? super f0<? super E>, ? super d<? super j2>, ?> p7) {
        final e0<Object> e0 = (e0<Object>)new e0<E>(l0.d(r0, g), r.d(n, n2, null, 4, null));
        if (l != null) {
            e0.N(l);
        }
        e0.x1(u0, e0, (n6.p<? super e0<Object>, ? super kotlin.coroutines.d<? super Object>, ?>)p7);
        return (h0<E>)e0;
    }
    
    @z1
    @e
    public static final <E> h0<E> e(@e final r0 r0, @e final g g, final int n, @kotlin.b @e final n6.p<? super f0<? super E>, ? super d<? super j2>, ?> p4) {
        return d(r0, g, n, n.G, u0.G, (l<? super Throwable, j2>)null, p4);
    }
}
