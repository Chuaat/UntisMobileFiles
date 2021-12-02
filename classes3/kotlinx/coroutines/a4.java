// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.c1;
import kotlin.jvm.internal.j1$h;
import kotlin.time.j;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.internal.g0;
import c7.b;
import kotlin.coroutines.d;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0087@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\u000e\u001aL\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\n\u001aR\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0087@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001aa\u0010\u0014\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0011\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0017H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a" }, d2 = { "T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "c", "(JLn6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/time/d;", "timeout", "d", "(DLn6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "f", "U", "Lkotlinx/coroutines/z3;", "coroutine", "b", "(Lkotlinx/coroutines/z3;Ln6/p;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/y3;", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class a4
{
    @e
    public static final y3 a(final long lng, @e final k2 k2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Timed out waiting for ");
        sb.append(lng);
        sb.append(" ms");
        return new y3(sb.toString(), k2);
    }
    
    private static final <U, T extends U> Object b(final z3<U, ? super T> z3, final p<? super r0, ? super d<? super T>, ?> p2) {
        o2.z(z3, d1.d(z3.J.getContext()).D(z3.K, z3, z3.getContext()));
        return b.g((g0<? super Object>)z3, (z3)z3, (n6.p<? super z3, ? super kotlin.coroutines.d<? super Object>, ?>)p2);
    }
    
    @f
    public static final <T> Object c(final long n, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        if (n > 0L) {
            final Object b = b((z3<Object, ? super Object>)new z3<Object, Object>(n, (kotlin.coroutines.d<? super Object>)d), (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3);
            if (b == kotlin.coroutines.intrinsics.b.h()) {
                h.c((d)d);
            }
            return b;
        }
        throw new y3("Timed out immediately");
    }
    
    @j
    @f
    public static final <T> Object d(final double n, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        return c(d1.e(n), (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    public static final <T> Object e(final long i, @e p<? super r0, ? super d<? super T>, ?> b, @e final d<? super T> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0053: {
            if (d instanceof a4$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (a4$a)d;
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
                long I;
                Object J;
                Object K;
                
                @f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return a4.e(0L, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)null, (kotlin.coroutines.d<? super Object>)this);
                }
            };
        }
        Object g = d3.G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = d3.H;
        y3 y3 = null;
        Label_0231: {
            if (h3 != 0) {
                if (h3 == 1) {
                    b = d3.K;
                    final p p3 = (p)d3.J;
                    try {
                        c1.n(g);
                        b = g;
                        return b;
                    }
                    catch (y3 y4) {
                        y3 = y4;
                        break Label_0231;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(g);
            if (i <= 0L) {
                return null;
            }
            g = new j1$h();
            ((j1$h)g).G = null;
            try {
                d3.J = b;
                d3.K = g;
                d3.I = i;
                d3.H = 1;
                final z3 g2 = new z3<Object, Object>(i, (d)d3);
                ((j1$h)g).G = g2;
                b = b((z3<Object, ? super Object>)g2, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)b);
                if (b == kotlin.coroutines.intrinsics.b.h()) {
                    h.c((d)d3);
                }
                if (b == h2) {
                    return h2;
                }
                return b;
            }
            catch (y3 y5) {
                final j1$h j1$h = (j1$h)g;
                y3 = y5;
                b = j1$h;
            }
        }
        if (y3.G == ((j1$h)b).G) {
            return null;
        }
        throw y3;
    }
    
    @j
    @f
    public static final <T> Object f(final double n, @e final p<? super r0, ? super d<? super T>, ?> p3, @e final d<? super T> d) {
        return e(d1.e(n), (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
}
