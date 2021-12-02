// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.h0;
import n6.a;
import kotlinx.coroutines.internal.j0;
import kotlin.b1$a;
import kotlin.j2;
import kotlinx.coroutines.internal.p0;
import java.util.Objects;
import kotlin.c1;
import kotlin.b1;
import kotlin.y0;
import kotlin.coroutines.g;
import kotlin.coroutines.d;
import kotlinx.coroutines.internal.j;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a'\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0080\b\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b\"\u0016\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001a\u001a\u00020\u00028\u0000@\u0001X\u0081T¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001c\u001a\u00020\b*\u00020\u00028@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001b\"\u0016\u0010\u001e\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015\"\u0016\u0010\u001f\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015\"\u001a\u0010 \u001a\u00020\b*\u00020\u00028@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\"\u0016\u0010!\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\"" }, d2 = { "T", "Lkotlinx/coroutines/f1;", "", "mode", "Lkotlin/j2;", "a", "Lkotlin/coroutines/d;", "delegate", "", "undispatched", "e", "f", "Lkotlinx/coroutines/p1;", "eventLoop", "Lkotlin/Function0;", "block", "h", "", "exception", "g", "d", "I", "MODE_UNDISPATCHED", "b", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE", "(I)Z", "isReusableMode", "c", "MODE_CANCELLABLE_REUSABLE", "MODE_ATOMIC", "isCancellableMode", "MODE_UNINITIALIZED", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class g1
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = -1;
    
    public static final <T> void a(@e final f1<? super T> f1, final int n) {
        final boolean b = w0.b();
        boolean b2 = true;
        if (b && n == -1) {
            throw new AssertionError();
        }
        final kotlin.coroutines.d<? super Object> e = f1.e();
        if (n != 4) {
            b2 = false;
        }
        if (!b2 && e instanceof j && c(n) == c(f1.I)) {
            final m0 l = ((j)e).L;
            final g context = e.getContext();
            if (l.K(context)) {
                l.H(context, f1);
            }
            else {
                f(f1);
            }
        }
        else {
            e((f1<? super Object>)f1, e, b2);
        }
    }
    
    public static final boolean c(final int n) {
        boolean b = true;
        if (n != 1) {
            b = (n == 2 && b);
        }
        return b;
    }
    
    public static final boolean d(final int n) {
        return n == 2;
    }
    
    public static final <T> void e(@e f1<? super T> f, @e d<? super T> context, final boolean b) {
        final Object j = ((f1)f).j();
        final Throwable f2 = ((f1)f).f(j);
        Object o;
        if (f2 != null) {
            final b1$a h = b1.H;
            o = c1.a(f2);
        }
        else {
            final b1$a h2 = b1.H;
            o = ((f1)f).h(j);
        }
        final Object b2 = b1.b(o);
        if (b) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            final j i = (j)context;
            final d<T> m = i.M;
            final Object k = i.K;
            context = m.getContext();
            final Object c = p0.c(context, k);
            if (c != p0.a) {
                f = l0.f(m, context, c);
            }
            else {
                f = null;
            }
            try {
                i.M.resumeWith(b2);
                final j2 a = j2.a;
                return;
            }
            finally {
                if (f == null || ((c4)f).A1()) {
                    p0.a(context, c);
                }
            }
        }
        ((d)context).resumeWith(b2);
    }
    
    private static final void f(final f1<?> f1) {
        final p1 b = s3.b.b();
        if (b.g0()) {
            b.Z(f1);
            return;
        }
        b.d0(true);
        final Throwable t2;
        try {
            e((f1<? super Object>)f1, f1.e(), true);
            while (b.j0()) {}
            return;
        }
        finally {
            final f1<? super Object> f2 = (f1<? super Object>)f1;
            final Throwable t = t2;
            final Throwable t3 = null;
            f2.i(t, t3);
        }
        try {
            final f1<? super Object> f2 = (f1<? super Object>)f1;
            final Throwable t = t2;
            final Throwable t3 = null;
            f2.i(t, t3);
        }
        finally {
            b.M(true);
        }
    }
    
    public static final void g(@e final d<?> d, @e final Throwable t) {
        final b1$a h = b1.H;
        Throwable c = t;
        if (w0.e()) {
            if (!(d instanceof kotlin.coroutines.jvm.internal.e)) {
                c = t;
            }
            else {
                c = j0.c(t, (kotlin.coroutines.jvm.internal.e)d);
            }
        }
        d.resumeWith(b1.b(c1.a(c)));
    }
    
    public static final void h(@e final f1<?> f1, @e final p1 p3, @e final a<j2> a) {
        p3.d0(true);
        final Throwable t2;
        try {
            a.invoke();
            while (p3.j0()) {}
            return;
        }
        finally {
            final f1<?> f2 = f1;
            final Throwable t = t2;
            final Throwable t3 = null;
            f2.i(t, t3);
        }
        try {
            final f1<?> f2 = f1;
            final Throwable t = t2;
            final Throwable t3 = null;
            f2.i(t, t3);
        }
        finally {
            h0.d(1);
            p3.M(true);
            h0.c(1);
        }
    }
}
