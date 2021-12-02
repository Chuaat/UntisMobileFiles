// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlinx.coroutines.c4;
import kotlinx.coroutines.f2;
import kotlin.coroutines.g;
import kotlin.b1$a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.l0;
import kotlin.c1;
import kotlin.b1;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.j0;
import org.jetbrains.annotations.f;
import n6.l;
import kotlinx.coroutines.p1;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.s3;
import kotlinx.coroutines.w0;
import kotlin.j2;
import n6.a;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0082\b\"\u001c\u0010\u001d\u001a\u00020\u00188\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\"\u001c\u0010\u001f\u001a\u00020\u00188\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001e\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 " }, d2 = { "T", "Lkotlin/coroutines/d;", "Lkotlin/b1;", "result", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "cause", "Lkotlin/j2;", "onCancellation", "f", "(Lkotlin/coroutines/d;Ljava/lang/Object;Ln6/l;)V", "Lkotlinx/coroutines/internal/j;", "", "h", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "b", "Lkotlinx/coroutines/internal/k0;", "a", "Lkotlinx/coroutines/internal/k0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class k
{
    private static final k0 a;
    @d
    @e
    public static final k0 b;
    
    static {
        a = new k0("UNDEFINED");
        b = new k0("REUSABLE_CLAIMED");
    }
    
    private static final boolean b(final j<?> j, final Object i, final int k, final boolean b, final a<j2> a) {
        final boolean b2 = w0.b();
        final boolean b3 = false;
        if (b2 && k == -1) {
            throw new AssertionError();
        }
        final p1 b4 = s3.b.b();
        if (b && b4.h0()) {
            return false;
        }
        if (b4.g0()) {
            j.J = i;
            j.I = k;
            b4.Z(j);
            return true;
        }
        b4.d0(true);
        Label_0128: {
            final Throwable t2;
            try {
                a.invoke();
                while (b4.j0()) {}
                break Label_0128;
            }
            finally {
                final j<?> l = j;
                final Throwable t = t2;
                final Throwable t3 = null;
                l.i(t, t3);
            }
            try {
                final j<?> l = j;
                final Throwable t = t2;
                final Throwable t3 = null;
                l.i(t, t3);
                h0.d(1);
                b4.M(true);
                h0.c(1);
                return b3;
            }
            finally {
                h0.d(1);
                b4.M(true);
                h0.c(1);
            }
        }
    }
    
    @f2
    public static final <T> void f(@e kotlin.coroutines.d<? super T> f, @e final Object o, @f l<? super Throwable, j2> b) {
        if (f instanceof j) {
            final j<?> j = (j<?>)f;
            final Object c = j0.c(o, (l<? super Throwable, j2>)b);
            if (j.L.K(j.getContext())) {
                j.J = c;
                j.I = 1;
                j.L.H(j.getContext(), j);
                return;
            }
            w0.b();
            b = s3.b.b();
            if (b.g0()) {
                j.J = c;
                j.I = 1;
                b.Z(j);
                return;
            }
            b.d0(true);
            final Throwable t2;
            try {
                final k2 k2 = (k2)j.getContext().get((g$c)kotlinx.coroutines.k2.t);
                boolean b2;
                if (k2 != null && !k2.a()) {
                    final CancellationException w = k2.w();
                    j.d(c, w);
                    final b1$a h = b1.H;
                    ((kotlin.coroutines.d)j).resumeWith(b1.b(c1.a((Throwable)w)));
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (!b2) {
                    final kotlin.coroutines.d<?> m = j.M;
                    final Object i = j.K;
                    final g context = m.getContext();
                    final Object c2 = p0.c(context, i);
                    if (c2 != p0.a) {
                        f = l0.f(m, context, c2);
                    }
                    else {
                        f = null;
                    }
                    try {
                        j.M.resumeWith(o);
                        final j2 a = j2.a;
                    }
                    finally {
                        if (f == null || ((c4)f).A1()) {
                            p0.a(context, c2);
                        }
                    }
                }
                while (b.j0()) {}
                return;
            }
            finally {
                final j<?> l = j;
                final Throwable t = t2;
                final Throwable t3 = null;
                l.i(t, t3);
            }
            try {
                final j<?> l = j;
                final Throwable t = t2;
                final Throwable t3 = null;
                l.i(t, t3);
                return;
            }
            finally {
                b.M(true);
            }
        }
        ((kotlin.coroutines.d)f).resumeWith(o);
    }
    
    public static final boolean h(@e final j<? super j2> j) {
        final j2 a = j2.a;
        w0.b();
        final p1 b = s3.b.b();
        final boolean h0 = b.h0();
        boolean b2 = false;
        if (h0) {
            return b2;
        }
        if (b.g0()) {
            j.J = a;
            j.I = 1;
            b.Z(j);
            b2 = true;
            return b2;
        }
        b.d0(true);
        final Throwable t2;
        try {
            j.run();
            while (b.j0()) {}
            return b2;
        }
        finally {
            final j<?> i = j;
            final Throwable t = t2;
            final Throwable t3 = null;
            i.i(t, t3);
        }
        try {
            final j<?> i = j;
            final Throwable t = t2;
            final Throwable t3 = null;
            i.i(t, t3);
            return b2;
        }
        finally {
            b.M(true);
        }
    }
}
