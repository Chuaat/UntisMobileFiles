// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlinx.coroutines.c4;
import kotlinx.coroutines.x0;
import kotlin.b1$a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p1;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.l0;
import kotlin.c1;
import kotlin.b1;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.k2;
import kotlin.j2;
import kotlinx.coroutines.s3;
import n6.l;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.o;
import kotlinx.coroutines.w0;
import kotlin.coroutines.g;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.m0;
import org.jetbrains.annotations.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlinx.coroutines.f1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010@\u001a\u00020=\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bM\u0010NJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JH\u0010%\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2%\b\b\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u001e\u0018\u00010!H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0013H\u0010¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0019H\u0086\b¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010 J\u001f\u00101\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00028\u0000H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105R\u001e\u00108\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0019\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8F@\u0006¢\u0006\u0006\u001a\u0004\b;\u0010\u0010R\u0016\u0010@\u001a\u00020=8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u00198\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010G\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bD\u0010B\u0012\u0004\bE\u0010FR\u0016\u0010/\u001a\u00020.8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O" }, d2 = { "Lkotlinx/coroutines/internal/j;", "T", "Lkotlinx/coroutines/f1;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/d;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/p;", "requester", "", "q", "(Lkotlinx/coroutines/p;)Z", "m", "()Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/o;", "continuation", "", "l", "(Lkotlinx/coroutines/o;)Ljava/lang/Throwable;", "cause", "r", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Lkotlin/b1;", "result", "Lkotlin/j2;", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "onCancellation", "s", "(Ljava/lang/Object;Ln6/l;)V", "takenState", "d", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "u", "(Ljava/lang/Object;)Z", "v", "Lkotlin/coroutines/g;", "context", "value", "n", "(Lkotlin/coroutines/g;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "M", "Lkotlin/coroutines/d;", "o", "reusableCancellableContinuation", "Lkotlinx/coroutines/m0;", "L", "Lkotlinx/coroutines/m0;", "dispatcher", "K", "Ljava/lang/Object;", "countOrElement", "J", "get_state$kotlinx_coroutines_core$annotations", "()V", "_state", "getContext", "()Lkotlin/coroutines/g;", "e", "()Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class j<T> extends f1<T> implements e, d<T>
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater N;
    @m6.d
    @f
    public Object J;
    @m6.d
    @org.jetbrains.annotations.e
    public final Object K;
    @m6.d
    @org.jetbrains.annotations.e
    public final m0 L;
    @m6.d
    @org.jetbrains.annotations.e
    public final d<T> M;
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    
    static {
        N = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
    }
    
    public j(@org.jetbrains.annotations.e final m0 l, @org.jetbrains.annotations.e final d<? super T> m) {
        super(-1);
        this.L = l;
        this.M = (d<T>)m;
        this.J = kotlinx.coroutines.internal.k.a();
        this.K = p0.b(this.getContext());
        this._reusableCancellableContinuation = null;
    }
    
    @Override
    public void d(@f final Object o, @org.jetbrains.annotations.e final Throwable t) {
        if (o instanceof e0) {
            ((e0)o).b.invoke((Object)t);
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public d<T> e() {
        return (d<T>)this;
    }
    
    @f
    public e getCallerFrame() {
        Object m;
        if (!((m = this.M) instanceof e)) {
            m = null;
        }
        return (e)m;
    }
    
    @org.jetbrains.annotations.e
    public g getContext() {
        return this.M.getContext();
    }
    
    @f
    public StackTraceElement getStackTraceElement() {
        return null;
    }
    
    @f
    @Override
    public Object j() {
        final Object j = this.J;
        if (w0.b() && j == kotlinx.coroutines.internal.k.a()) {
            throw new AssertionError();
        }
        this.J = kotlinx.coroutines.internal.k.a();
        return j;
    }
    
    @f
    public final Throwable l(@org.jetbrains.annotations.e final o<?> o) {
        k0 b;
        do {
            final Object reusableCancellableContinuation = this._reusableCancellableContinuation;
            b = kotlinx.coroutines.internal.k.b;
            if (reusableCancellableContinuation == b) {
                continue;
            }
            if (reusableCancellableContinuation == null) {
                return null;
            }
            if (!(reusableCancellableContinuation instanceof Throwable)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent state ");
                sb.append(reusableCancellableContinuation);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (j.N.compareAndSet(this, reusableCancellableContinuation, null)) {
                return (Throwable)reusableCancellableContinuation;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } while (!j.N.compareAndSet(this, b, o));
        return null;
    }
    
    @f
    public final p<T> m() {
        Object reusableCancellableContinuation;
        do {
            reusableCancellableContinuation = this._reusableCancellableContinuation;
            if (reusableCancellableContinuation == null) {
                this._reusableCancellableContinuation = kotlinx.coroutines.internal.k.b;
                return null;
            }
            if (reusableCancellableContinuation instanceof p) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Inconsistent state ");
            sb.append(reusableCancellableContinuation);
            throw new IllegalStateException(sb.toString().toString());
        } while (!j.N.compareAndSet(this, reusableCancellableContinuation, kotlinx.coroutines.internal.k.b));
        return (p<T>)reusableCancellableContinuation;
    }
    
    public final void n(@org.jetbrains.annotations.e final g g, final T j) {
        this.J = j;
        super.I = 1;
        this.L.J(g, this);
    }
    
    @f
    public final p<?> o() {
        Object reusableCancellableContinuation;
        if (!((reusableCancellableContinuation = this._reusableCancellableContinuation) instanceof p)) {
            reusableCancellableContinuation = null;
        }
        return (p<?>)reusableCancellableContinuation;
    }
    
    public final boolean q(@org.jetbrains.annotations.e final p<?> p) {
        final Object reusableCancellableContinuation = this._reusableCancellableContinuation;
        boolean b = false;
        if (reusableCancellableContinuation == null) {
            return false;
        }
        if (reusableCancellableContinuation instanceof p) {
            if (reusableCancellableContinuation == p) {
                b = true;
            }
            return b;
        }
        return true;
    }
    
    public final boolean r(@org.jetbrains.annotations.e final Throwable t) {
        while (true) {
            final Object reusableCancellableContinuation = this._reusableCancellableContinuation;
            final k0 b = kotlinx.coroutines.internal.k.b;
            if (kotlin.jvm.internal.k0.g(reusableCancellableContinuation, (Object)b)) {
                if (j.N.compareAndSet(this, b, t)) {
                    return true;
                }
                continue;
            }
            else {
                if (reusableCancellableContinuation instanceof Throwable) {
                    return true;
                }
                if (j.N.compareAndSet(this, reusableCancellableContinuation, null)) {
                    return false;
                }
                continue;
            }
        }
    }
    
    public void resumeWith(@org.jetbrains.annotations.e final Object o) {
        Object o2 = this.M.getContext();
        final Object d = j0.d(o, null, 1, null);
        if (this.L.K((g)o2)) {
            this.J = d;
            super.I = 0;
            this.L.H((g)o2, this);
            return;
        }
        w0.b();
        o2 = s3.b.b();
        if (((p1)o2).g0()) {
            this.J = d;
            super.I = 0;
            ((p1)o2).Z(this);
            return;
        }
        ((p1)o2).d0(true);
        final Throwable t2;
        try {
            final g context = this.getContext();
            final Object c = p0.c(context, this.K);
            try {
                this.M.resumeWith(o);
                final j2 a = j2.a;
                p0.a(context, c);
                while (((p1)o2).j0()) {}
            }
            finally {
                p0.a(context, c);
            }
        }
        finally {
            final j j = this;
            final Throwable t = t2;
            final Throwable t3 = null;
            j.i(t, t3);
        }
        try {
            final j j = this;
            final Throwable t = t2;
            final Throwable t3 = null;
            j.i(t, t3);
        }
        finally {
            ((p1)o2).M(true);
        }
    }
    
    public final void s(@org.jetbrains.annotations.e final Object o, @f l<? super Throwable, j2> f) {
        final Object c = j0.c(o, (l<? super Throwable, j2>)f);
        if (this.L.K(this.getContext())) {
            this.J = c;
            super.I = 1;
            this.L.H(this.getContext(), this);
            return;
        }
        w0.b();
        final p1 b = s3.b.b();
        if (b.g0()) {
            this.J = c;
            super.I = 1;
            b.Z(this);
            return;
        }
        b.d0(true);
        final Throwable t2;
        try {
            final k2 k2 = (k2)this.getContext().get((g$c)kotlinx.coroutines.k2.t);
            boolean b2;
            if (k2 != null && !k2.a()) {
                final CancellationException w = k2.w();
                this.d(c, w);
                final b1$a h = b1.H;
                ((d)this).resumeWith(b1.b(c1.a((Throwable)w)));
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (!b2) {
                final d<T> m = this.M;
                final Object i = this.K;
                final g context = m.getContext();
                final Object c2 = p0.c(context, i);
                if (c2 != p0.a) {
                    f = l0.f(m, context, c2);
                }
                else {
                    f = null;
                }
                try {
                    this.M.resumeWith(o);
                    final j2 a = j2.a;
                }
                finally {
                    h0.d(1);
                    if (f == null || ((c4)f).A1()) {
                        p0.a(context, c2);
                    }
                    h0.c(1);
                }
            }
            while (b.j0()) {}
            return;
        }
        finally {
            final j j = this;
            final Throwable t = t2;
            final Throwable t3 = null;
            j.i(t, t3);
        }
        try {
            final j j = this;
            final Throwable t = t2;
            final Throwable t3 = null;
            j.i(t, t3);
        }
        finally {
            h0.d(1);
            b.M(true);
            h0.c(1);
        }
    }
    
    @org.jetbrains.annotations.e
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.L);
        sb.append(", ");
        sb.append(x0.c(this.M));
        sb.append(']');
        return sb.toString();
    }
    
    public final boolean u(@f final Object o) {
        final k2 k2 = (k2)this.getContext().get((g$c)kotlinx.coroutines.k2.t);
        if (k2 != null && !k2.a()) {
            final CancellationException w = k2.w();
            this.d(o, w);
            final b1$a h = b1.H;
            ((d)this).resumeWith(b1.b(c1.a((Throwable)w)));
            return true;
        }
        return false;
    }
    
    public final void v(@org.jetbrains.annotations.e final Object o) {
        final d<T> m = this.M;
        final Object k = this.K;
        final g context = m.getContext();
        final Object c = p0.c(context, k);
        c4<?> f;
        if (c != p0.a) {
            f = l0.f(m, context, c);
        }
        else {
            f = null;
        }
        try {
            this.M.resumeWith(o);
            final j2 a = j2.a;
        }
        finally {
            h0.d(1);
            if (f == null || f.A1()) {
                p0.a(context, c);
            }
            h0.c(1);
        }
    }
}
