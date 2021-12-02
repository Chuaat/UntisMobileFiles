// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.b1$a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlinx.coroutines.scheduling.l;
import kotlin.j2;
import kotlin.c1;
import kotlinx.coroutines.internal.j0;
import kotlin.b1;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.internal.j;
import kotlin.jvm.internal.k0;
import kotlin.m;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import m6.d;
import kotlin.Metadata;
import kotlinx.coroutines.scheduling.k;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0017R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Lkotlinx/coroutines/f1;", "T", "Lkotlinx/coroutines/scheduling/k;", "Lkotlinx/coroutines/SchedulerTask;", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "Lkotlin/j2;", "d", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "i", "", "I", "resumeMode", "Lkotlin/coroutines/d;", "e", "()Lkotlin/coroutines/d;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class f1<T> extends k
{
    @d
    public int I;
    
    public f1(final int i) {
        this.I = i;
    }
    
    public void d(@f final Object o, @e final Throwable t) {
    }
    
    @e
    public abstract kotlin.coroutines.d<T> e();
    
    @f
    public Throwable f(@f Object o) {
        final boolean b = o instanceof d0;
        final Throwable t = null;
        if (!b) {
            o = null;
        }
        final d0 d0 = (d0)o;
        Throwable a = t;
        if (d0 != null) {
            a = d0.a;
        }
        return a;
    }
    
    public <T> T h(@f final Object o) {
        return (T)o;
    }
    
    public final void i(@f Throwable t, @f final Throwable t2) {
        if (t == null && t2 == null) {
            return;
        }
        if (t != null && t2 != null) {
            m.a(t, t2);
        }
        if (t == null) {
            t = t2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". ");
        sb.append("Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        final String string = sb.toString();
        k0.m((Object)t);
        o0.b(this.e().getContext(), new v0(string, t));
    }
    
    @f
    public abstract Object j();
    
    @Override
    public final void run() {
        if (w0.b() && this.I == -1) {
            throw new AssertionError();
        }
        final l h = super.H;
        try {
            final kotlin.coroutines.d<T> e = this.e();
            if (e != null) {
                final j j = (j)e;
                final kotlin.coroutines.d<T> m = j.M;
                final Object k = j.K;
                final g context = m.getContext();
                final Object c = p0.c(context, k);
                Object f;
                if (c != p0.a) {
                    f = l0.f(m, context, c);
                }
                else {
                    f = null;
                }
                try {
                    final g context2 = m.getContext();
                    final Object i = this.j();
                    final Throwable f2 = this.f(i);
                    k2 k2;
                    if (f2 == null && g1.c(this.I)) {
                        k2 = (k2)context2.get((g$c)kotlinx.coroutines.k2.t);
                    }
                    else {
                        k2 = null;
                    }
                    Object o;
                    if (k2 != null && !k2.a()) {
                        final CancellationException w = k2.w();
                        this.d(i, w);
                        final b1$a h2 = b1.H;
                        Throwable c2 = w;
                        if (w0.e()) {
                            if (!(m instanceof kotlin.coroutines.jvm.internal.e)) {
                                c2 = w;
                            }
                            else {
                                c2 = j0.c(w, (kotlin.coroutines.jvm.internal.e)m);
                            }
                        }
                        o = b1.b(c1.a(c2));
                    }
                    else if (f2 != null) {
                        final b1$a h3 = b1.H;
                        o = b1.b(c1.a(f2));
                    }
                    else {
                        final Object h4 = this.h(i);
                        final b1$a h5 = b1.H;
                        o = b1.b(h4);
                    }
                    m.resumeWith(o);
                    final j2 a = j2.a;
                    if (f == null || ((c4)f).A1()) {
                        p0.a(context, c);
                    }
                    Object b = null;
                    try {
                        final b1$a h6 = b1.H;
                        h.k();
                        b1.b((Object)a);
                    }
                    finally {
                        final b1$a h7 = b1.H;
                        b = b1.b(c1.a((Throwable)f));
                    }
                    this.i(null, b1.e(b));
                    return;
                }
                finally {
                    if (f == null || ((c4)f).A1()) {
                        p0.a(context, c);
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
        }
        finally {
            Object b2;
            try {
                final b1$a h8 = b1.H;
                h.k();
                b1.b((Object)j2.a);
            }
            finally {
                final b1$a h9 = b1.H;
                final Throwable t;
                b2 = b1.b(c1.a(t));
            }
            final Throwable t2;
            this.i(t2, b1.e(b2));
        }
    }
}
