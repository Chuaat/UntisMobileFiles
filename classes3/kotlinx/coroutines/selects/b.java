// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.selects;

import kotlinx.coroutines.m2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.q;
import n6.p;
import kotlinx.coroutines.o0;
import java.util.concurrent.CancellationException;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.w0;
import kotlin.j2;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.internal.t;
import java.util.Objects;
import kotlinx.coroutines.l1;
import n6.l;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.k2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.y0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.d;
import kotlinx.coroutines.internal.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004Z6[\\B\u0015\u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bX\u0010YJ.\u0010\r\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001aH\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J5\u00106\u001a\u00020\u000b*\u0002042\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t05H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b6\u00107JG\u0010;\u001a\u00020\u000b\"\u0004\b\u0001\u00108*\b\u0012\u0004\u0012\u00028\u0001092\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0:H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b;\u0010<J[\u0010@\u001a\u00020\u000b\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u00108*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020>2\u0006\u0010?\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0:H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b@\u0010AJ8\u0010D\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020B2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t05H\u0016\u00f8\u0001\u0000¢\u0006\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020&8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010(R\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001e\u0010M\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010NR\u0016\u0010S\u001a\u00020P8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR(\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]" }, d2 = { "Lkotlinx/coroutines/selects/b;", "R", "Lkotlinx/coroutines/internal/r;", "Lkotlinx/coroutines/selects/a;", "Lkotlinx/coroutines/selects/f;", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/Function0;", "", "value", "Lkotlin/j2;", "block", "O0", "(Ln6/a;Ln6/a;)V", "H", "()V", "N0", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/b1;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "J", "(Ljava/lang/Throwable;)V", "Q0", "()Ljava/lang/Object;", "e", "R0", "Lkotlinx/coroutines/l1;", "handle", "d0", "(Lkotlinx/coroutines/l1;)V", "", "l", "()Z", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "i", "(Lkotlinx/coroutines/internal/t$d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/b;", "desc", "M", "(Lkotlinx/coroutines/internal/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "b", "(Lkotlinx/coroutines/selects/c;Ln6/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", "X", "(Lkotlinx/coroutines/selects/d;Ln6/p;)V", "P", "Lkotlinx/coroutines/selects/e;", "param", "n", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Ln6/p;)V", "", "timeMillis", "u", "(JLn6/l;)V", "s", "isSelected", "w", "()Lkotlin/coroutines/d;", "completion", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "Lkotlin/coroutines/d;", "uCont", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "P0", "()Lkotlinx/coroutines/l1;", "S0", "parentHandle", "<init>", "(Lkotlin/coroutines/d;)V", "a", "c", "d", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@y0
public final class b<R> extends r implements kotlinx.coroutines.selects.a<R>, f<R>, kotlin.coroutines.d<R>, kotlin.coroutines.jvm.internal.e
{
    static final /* synthetic */ AtomicReferenceFieldUpdater K;
    static final /* synthetic */ AtomicReferenceFieldUpdater L;
    private final kotlin.coroutines.d<R> J;
    private volatile /* synthetic */ Object _parentHandle;
    volatile /* synthetic */ Object _result;
    volatile /* synthetic */ Object _state;
    
    static {
        K = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");
        L = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_result");
    }
    
    public b(@org.jetbrains.annotations.e final kotlin.coroutines.d<? super R> j) {
        this.J = (kotlin.coroutines.d<R>)j;
        this._state = g.f();
        this._result = g.c();
        this._parentHandle = null;
    }
    
    private final void H() {
        final k2 k2 = (k2)this.getContext().get((g$c)kotlinx.coroutines.k2.t);
        if (k2 != null) {
            final l1 f = kotlinx.coroutines.k2.a.f(k2, true, false, (l)new d(), 2, null);
            this.S0(f);
            if (this.s()) {
                f.dispose();
            }
        }
    }
    
    private final void N0() {
        final l1 p0 = this.P0();
        if (p0 != null) {
            p0.dispose();
        }
        final Object u0 = this.u0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        for (t v0 = (t)u0; k0.g((Object)v0, (Object)this) ^ true; v0 = v0.v0()) {
            if (v0 instanceof b) {
                ((b)v0).J.dispose();
            }
        }
    }
    
    private final void O0(final n6.a<?> a, final n6.a<j2> a2) {
        if (w0.b()) {
            if (!this.s()) {
                throw new AssertionError();
            }
        }
        while (true) {
            final Object result = this._result;
            if (result == g.c()) {
                if (b.L.compareAndSet(this, g.c(), a.invoke())) {
                    return;
                }
                continue;
            }
            else {
                if (result != b.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (b.L.compareAndSet(this, b.h(), g.a())) {
                    a2.invoke();
                    return;
                }
                continue;
            }
        }
    }
    
    private final l1 P0() {
        return (l1)this._parentHandle;
    }
    
    private final void S0(final l1 parentHandle) {
        this._parentHandle = parentHandle;
    }
    
    @Override
    public void J(@org.jetbrains.annotations.e final Throwable t) {
        if (w0.b()) {
            if (!this.s()) {
                throw new AssertionError();
            }
        }
        while (true) {
            final Object result = this._result;
            if (result == g.c()) {
                final kotlin.coroutines.d<R> j = this.J;
                Throwable c;
                if (w0.e() && j instanceof kotlin.coroutines.jvm.internal.e) {
                    c = j0.c(t, (kotlin.coroutines.jvm.internal.e)j);
                }
                else {
                    c = t;
                }
                if (b.L.compareAndSet(this, g.c(), new d0(c, false, 2, null))) {
                    break;
                }
                continue;
            }
            else {
                if (result != b.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (b.L.compareAndSet(this, b.h(), g.a())) {
                    final kotlin.coroutines.d d = b.d((kotlin.coroutines.d)this.J);
                    final b1$a h = b1.H;
                    d.resumeWith(b1.b(c1.a(t)));
                    break;
                }
                continue;
            }
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object M(@org.jetbrains.annotations.e final kotlinx.coroutines.internal.b b) {
        return new a(this, b).c(null);
    }
    
    @y0
    @org.jetbrains.annotations.f
    public final Object Q0() {
        if (!this.s()) {
            this.H();
        }
        Object o;
        if ((o = this._result) == g.c()) {
            if (b.L.compareAndSet(this, g.c(), b.h())) {
                return b.h();
            }
            o = this._result;
        }
        if (o == g.a()) {
            throw new IllegalStateException("Already resumed");
        }
        if (!(o instanceof d0)) {
            return o;
        }
        throw ((d0)o).a;
    }
    
    @y0
    public final void R0(@org.jetbrains.annotations.e final Throwable t) {
        if (this.l()) {
            final b1$a h = b1.H;
            ((kotlin.coroutines.d)this).resumeWith(b1.b(c1.a(t)));
        }
        else if (!(t instanceof CancellationException)) {
            final Object q0 = this.Q0();
            if (q0 instanceof d0) {
                Throwable t2 = ((d0)q0).a;
                if (w0.e()) {
                    t2 = j0.t(t2);
                }
                Throwable t3;
                if (!w0.e()) {
                    t3 = t;
                }
                else {
                    t3 = j0.t(t);
                }
                if (t2 == t3) {
                    return;
                }
            }
            o0.b(this.getContext(), t);
        }
    }
    
    @Override
    public <Q> void X(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.d<? extends Q> d, @org.jetbrains.annotations.e final p<? super Q, ? super kotlin.coroutines.d<? super R>, ?> p2) {
        d.i((f<? super Object>)this, (n6.p<? super Q, ? super kotlin.coroutines.d<? super Object>, ?>)p2);
    }
    
    @Override
    public void b(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.c c, @org.jetbrains.annotations.e final l<? super kotlin.coroutines.d<? super R>, ?> l) {
        c.u((f<? super Object>)this, (n6.l<? super kotlin.coroutines.d<? super Object>, ?>)l);
    }
    
    @Override
    public void d0(@org.jetbrains.annotations.e final l1 l1) {
        final b b = new b(l1);
        if (!this.s()) {
            this.j0(b);
            if (!this.s()) {
                return;
            }
        }
        l1.dispose();
    }
    
    @org.jetbrains.annotations.f
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Object j;
        if (!((j = this.J) instanceof kotlin.coroutines.jvm.internal.e)) {
            j = null;
        }
        return (kotlin.coroutines.jvm.internal.e)j;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.coroutines.g getContext() {
        return this.J.getContext();
    }
    
    @org.jetbrains.annotations.f
    public StackTraceElement getStackTraceElement() {
        return null;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object i(@org.jetbrains.annotations.f final t.d d) {
        Object state = null;
        Label_0157: {
            while (true) {
                state = this._state;
                if (state == g.f()) {
                    if (d == null) {
                        if (!b.K.compareAndSet(this, g.f(), null)) {
                            continue;
                        }
                        break;
                    }
                    else {
                        final c c = new c(d);
                        if (!b.K.compareAndSet(this, g.f(), c)) {
                            continue;
                        }
                        final Object c2 = c.c(this);
                        if (c2 != null) {
                            return c2;
                        }
                        break;
                    }
                }
                else {
                    if (!(state instanceof kotlinx.coroutines.internal.d0)) {
                        break Label_0157;
                    }
                    if (d != null) {
                        final kotlinx.coroutines.internal.d<?> a = d.a();
                        if (a instanceof a && ((a)a).c == this) {
                            throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                        }
                        if (a.b((kotlinx.coroutines.internal.d0)state)) {
                            return kotlinx.coroutines.internal.c.b;
                        }
                    }
                    ((kotlinx.coroutines.internal.d0)state).c(this);
                }
            }
            this.N0();
            return q.d;
        }
        if (d == null) {
            return null;
        }
        if (state == d.c) {
            return q.d;
        }
        return null;
    }
    
    @Override
    public boolean l() {
        final Object i = this.i(null);
        boolean b;
        if (i == q.d) {
            b = true;
        }
        else {
            if (i != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected trySelectIdempotent result ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public <P, Q> void n(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.e<? super P, ? extends Q> e, final P p3, @org.jetbrains.annotations.e final p<? super Q, ? super kotlin.coroutines.d<? super R>, ?> p4) {
        e.P((f<? super Object>)this, p3, (n6.p<? super Q, ? super kotlin.coroutines.d<? super Object>, ?>)p4);
    }
    
    public void resumeWith(@org.jetbrains.annotations.e final Object o) {
        if (w0.b()) {
            if (!this.s()) {
                throw new AssertionError();
            }
        }
        while (true) {
            final Object result = this._result;
            if (result == g.c()) {
                if (b.L.compareAndSet(this, g.c(), kotlinx.coroutines.j0.d(o, null, 1, null))) {
                    break;
                }
                continue;
            }
            else {
                if (result != b.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (b.L.compareAndSet(this, b.h(), g.a())) {
                    kotlin.coroutines.d d;
                    Object o2;
                    if (b1.i(o)) {
                        final kotlin.coroutines.d<R> j = this.J;
                        final Throwable e = b1.e(o);
                        k0.m((Object)e);
                        final b1$a h = b1.H;
                        Throwable c = e;
                        if (w0.e()) {
                            if (!(j instanceof kotlin.coroutines.jvm.internal.e)) {
                                c = e;
                            }
                            else {
                                c = j0.c(e, (kotlin.coroutines.jvm.internal.e)j);
                            }
                        }
                        final Object b = b1.b(c1.a(c));
                        d = j;
                        o2 = b;
                    }
                    else {
                        final kotlin.coroutines.d<R> i = this.J;
                        o2 = o;
                        d = i;
                    }
                    d.resumeWith(o2);
                    break;
                }
                continue;
            }
        }
    }
    
    @Override
    public boolean s() {
        while (true) {
            final Object state = this._state;
            if (state == g.f()) {
                return false;
            }
            if (!(state instanceof kotlinx.coroutines.internal.d0)) {
                return true;
            }
            ((kotlinx.coroutines.internal.d0)state).c(this);
        }
    }
    
    @org.jetbrains.annotations.e
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SelectInstance(state=");
        sb.append(this._state);
        sb.append(", result=");
        sb.append(this._result);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public void u(final long n, @org.jetbrains.annotations.e final l<? super kotlin.coroutines.d<? super R>, ?> l) {
        if (n <= 0L) {
            if (this.l()) {
                c7.b.c((n6.l<? super kotlin.coroutines.d<? super Object>, ?>)l, this.w());
            }
            return;
        }
        this.d0(d1.d(this.getContext()).D(n, new Runnable() {
            final /* synthetic */ b G;
            
            @Override
            public final void run() {
                if (this.G.l()) {
                    c7.a.c((n6.l<? super kotlin.coroutines.d<? super Object>, ?>)l, this.G.w());
                }
            }
        }, this.getContext()));
    }
    
    @org.jetbrains.annotations.e
    @Override
    public kotlin.coroutines.d<R> w() {
        return (kotlin.coroutines.d<R>)this;
    }
    
    @Override
    public <P, Q> void x(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.e<? super P, ? extends Q> e, @org.jetbrains.annotations.e final p<? super Q, ? super kotlin.coroutines.d<? super R>, ?> p2) {
        kotlinx.coroutines.selects.a.a.a((kotlinx.coroutines.selects.a<? super Object>)this, (kotlinx.coroutines.selects.e<? super Object, ?>)e, (n6.p<? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)p2);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001c\u0010\u0012\u001a\u00020\r8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00138\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001c" }, d2 = { "kotlinx/coroutines/selects/b$a", "Lkotlinx/coroutines/internal/d;", "", "k", "Lkotlin/j2;", "l", "failure", "j", "affected", "i", "d", "", "toString", "", "b", "J", "g", "()J", "opSequence", "Lkotlinx/coroutines/selects/b;", "c", "Lkotlinx/coroutines/selects/b;", "impl", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/b;", "desc", "<init>", "(Lkotlinx/coroutines/selects/b;Lkotlinx/coroutines/internal/b;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class a extends kotlinx.coroutines.internal.d<Object>
    {
        private final long b;
        @m6.d
        @org.jetbrains.annotations.e
        public final b<?> c;
        @m6.d
        @org.jetbrains.annotations.e
        public final kotlinx.coroutines.internal.b d;
        
        public a(@org.jetbrains.annotations.e final b<?> c, @org.jetbrains.annotations.e final kotlinx.coroutines.internal.b d) {
            this.c = c;
            this.d = d;
            this.b = g.b().a();
            d.d(this);
        }
        
        private final void j(Object f) {
            final boolean b = f == null;
            if (b) {
                f = null;
            }
            else {
                f = g.f();
            }
            if (kotlinx.coroutines.selects.b.K.compareAndSet(this.c, this, f) && b) {
                ((b<Object>)this.c).N0();
            }
        }
        
        private final Object k() {
            final b<?> c = this.c;
            while (true) {
                final Object state = c._state;
                if (state == this) {
                    return null;
                }
                if (state instanceof d0) {
                    ((a)state).c(this.c);
                }
                else {
                    if (state != g.f()) {
                        return g.d();
                    }
                    if (kotlinx.coroutines.selects.b.K.compareAndSet(this.c, g.f(), this)) {
                        return null;
                    }
                    continue;
                }
            }
        }
        
        private final void l() {
            kotlinx.coroutines.selects.b.K.compareAndSet(this.c, this, g.f());
        }
        
        @Override
        public void d(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.f final Object o2) {
            this.j(o2);
            this.d.a(this, o2);
        }
        
        @Override
        public long g() {
            return this.b;
        }
        
        @org.jetbrains.annotations.f
        @Override
        public Object i(@org.jetbrains.annotations.f final Object o) {
            if (o == null) {
                final Object k = this.k();
                if (k != null) {
                    return k;
                }
            }
            try {
                return this.d.c(this);
            }
            finally {
                if (o == null) {
                    this.l();
                }
            }
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("AtomicSelectOp(sequence=");
            sb.append(this.g());
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "kotlinx/coroutines/selects/b$b", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/l1;", "J", "Lkotlinx/coroutines/l1;", "handle", "<init>", "(Lkotlinx/coroutines/l1;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class b extends t
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final l1 J;
        
        public b(@org.jetbrains.annotations.e final l1 j) {
            this.J = j;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u000e" }, d2 = { "kotlinx/coroutines/selects/b$c", "Lkotlinx/coroutines/internal/d0;", "", "affected", "c", "Lkotlinx/coroutines/internal/d;", "a", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "Lkotlinx/coroutines/internal/t$d;", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "<init>", "(Lkotlinx/coroutines/internal/t$d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class c extends d0
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final t.d a;
        
        public c(@org.jetbrains.annotations.e final t.d a) {
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public kotlinx.coroutines.internal.d<?> a() {
            return this.a.a();
        }
        
        @org.jetbrains.annotations.f
        @Override
        public Object c(@org.jetbrains.annotations.f Object obj) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            final b b = (b)obj;
            this.a.d();
            final Object e = this.a.a().e(null);
            if (e == null) {
                obj = this.a.c;
            }
            else {
                obj = g.f();
            }
            kotlinx.coroutines.selects.b.K.compareAndSet(b, this, obj);
            return e;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b" }, d2 = { "kotlinx/coroutines/selects/b$d", "Lkotlinx/coroutines/m2;", "", "cause", "Lkotlin/j2;", "J0", "<init>", "(Lkotlinx/coroutines/selects/b;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class d extends m2
    {
        public d() {
        }
        
        @Override
        public void J0(@org.jetbrains.annotations.f final Throwable t) {
            if (b.this.l()) {
                b.this.J(this.K0().w());
            }
        }
    }
}
