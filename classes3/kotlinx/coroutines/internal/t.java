// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlinx.coroutines.w0;
import kotlin.jvm.internal.k0;
import n6.l;
import kotlin.y0;
import org.jetbrains.annotations.f;
import n6.a;
import org.jetbrains.annotations.e;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.f2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0005JKLMNB\u0007¢\u0006\u0004\bI\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b\u001f\u0010 J4\u0010#\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020*2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010)\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0001¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b4\u00100J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000505¢\u0006\u0004\b6\u00107J.\u00108\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0014¢\u0006\u0004\b:\u00100J'\u0010<\u001a\u00020\n2\n\u0010;\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\u00138V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0017\u0010D\u001a\u00060\u0000j\u0002`\u00058F@\u0006¢\u0006\u0006\u001a\u0004\bC\u00100R\u0017\u0010F\u001a\u00060\u0000j\u0002`\u00058F@\u0006¢\u0006\u0006\u001a\u0004\bE\u00100R\u0013\u0010\t\u001a\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006O" }, d2 = { "Lkotlinx/coroutines/internal/t;", "", "Lkotlinx/coroutines/internal/f0;", "G0", "()Lkotlinx/coroutines/internal/f0;", "Lkotlinx/coroutines/internal/Node;", "current", "s0", "(Lkotlinx/coroutines/internal/t;)Lkotlinx/coroutines/internal/t;", "next", "Lkotlin/j2;", "t0", "(Lkotlinx/coroutines/internal/t;)V", "Lkotlinx/coroutines/internal/d0;", "op", "p0", "(Lkotlinx/coroutines/internal/d0;)Lkotlinx/coroutines/internal/t;", "node", "Lkotlin/Function0;", "", "condition", "Lkotlinx/coroutines/internal/t$c;", "A0", "(Lkotlinx/coroutines/internal/t;Ln6/a;)Lkotlinx/coroutines/internal/t$c;", "o0", "(Lkotlinx/coroutines/internal/t;)Z", "j0", "T", "Lkotlinx/coroutines/internal/t$b;", "q0", "(Lkotlinx/coroutines/internal/t;)Lkotlinx/coroutines/internal/t$b;", "k0", "(Lkotlinx/coroutines/internal/t;Ln6/a;)Z", "Lkotlin/Function1;", "predicate", "l0", "(Lkotlinx/coroutines/internal/t;Ln6/l;)Z", "m0", "(Lkotlinx/coroutines/internal/t;Ln6/l;Ln6/a;)Z", "n0", "(Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t;)Z", "condAdd", "", "H0", "(Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t$c;)I", "C0", "()Z", "F0", "()Lkotlinx/coroutines/internal/t;", "x0", "()V", "y0", "E0", "Lkotlinx/coroutines/internal/t$e;", "r0", "()Lkotlinx/coroutines/internal/t$e;", "D0", "(Ln6/l;)Ljava/lang/Object;", "B0", "prev", "I0", "(Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t;)V", "", "toString", "()Ljava/lang/String;", "z0", "isRemoved", "w0", "prevNode", "v0", "nextNode", "u0", "()Ljava/lang/Object;", "<init>", "a", "b", "c", "d", "e", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public class t
{
    static final /* synthetic */ AtomicReferenceFieldUpdater G;
    static final /* synthetic */ AtomicReferenceFieldUpdater H;
    private static final /* synthetic */ AtomicReferenceFieldUpdater I;
    volatile /* synthetic */ Object _next;
    volatile /* synthetic */ Object _prev;
    private volatile /* synthetic */ Object _removedRef;
    
    static {
        G = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_next");
        H = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_prev");
        I = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_removedRef");
    }
    
    public t() {
        this._next = this;
        this._prev = this;
        this._removedRef = null;
    }
    
    private final f0 G0() {
        f0 f0 = (f0)this._removedRef;
        if (f0 == null) {
            f0 = new f0(this);
            t.I.lazySet(this, f0);
        }
        return f0;
    }
    
    private final t p0(final d0 d0) {
    Label_0000:
        while (true) {
            while (true) {
                t t2;
                final t t = t2 = (t)this._prev;
                while (true) {
                    t t3 = null;
                    while (true) {
                        final Object next = t2._next;
                        if (next == this) {
                            if (t == t2) {
                                return t2;
                            }
                            if (!kotlinx.coroutines.internal.t.H.compareAndSet(this, t, t2)) {
                                continue Label_0000;
                            }
                            return t2;
                        }
                        else {
                            if (this.z0()) {
                                return null;
                            }
                            if (next == d0) {
                                return t2;
                            }
                            if (next instanceof d0) {
                                if (d0 != null && d0.b((d0)next)) {
                                    return null;
                                }
                                ((d0)next).c(t2);
                                continue Label_0000;
                            }
                            else if (next instanceof f0) {
                                if (t3 != null) {
                                    if (!kotlinx.coroutines.internal.t.G.compareAndSet(t3, t2, ((f0)next).a)) {
                                        continue Label_0000;
                                    }
                                    t2 = t3;
                                    break;
                                }
                                else {
                                    t2 = (t)t2._prev;
                                }
                            }
                            else {
                                Objects.requireNonNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                                final t t4 = (t)next;
                                t3 = t2;
                                t2 = t4;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    private final t s0(t t) {
        while (t.z0()) {
            t = (t)t._prev;
        }
        return t;
    }
    
    private final void t0(final t t) {
        t t2;
        do {
            t2 = (t)t._prev;
            if (this.u0() != t) {
                return;
            }
        } while (!t.H.compareAndSet(t, t2, this));
        if (this.z0()) {
            t.p0(null);
        }
    }
    
    @y0
    @org.jetbrains.annotations.e
    public final c A0(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final n6.a<Boolean> a) {
        return (c)new c() {
            final /* synthetic */ n6.a d;
            
            @f
            public Object k(@org.jetbrains.annotations.e final t t) {
                Object a;
                if (this.d.invoke()) {
                    a = null;
                }
                else {
                    a = s.a();
                }
                return a;
            }
        };
    }
    
    @f
    protected t B0() {
        Object u0 = this.u0();
        final boolean b = u0 instanceof f0;
        final t t = null;
        if (!b) {
            u0 = null;
        }
        final f0 f0 = (f0)u0;
        t a = t;
        if (f0 != null) {
            a = f0.a;
        }
        return a;
    }
    
    public boolean C0() {
        return this.F0() == null;
    }
    
    @f
    public final t E0() {
        while (true) {
            final Object u0 = this.u0();
            Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            final t t = (t)u0;
            if (t == this) {
                return null;
            }
            if (t.C0()) {
                return t;
            }
            t.x0();
        }
    }
    
    @y0
    @f
    public final t F0() {
        Object u0;
        t t;
        do {
            u0 = this.u0();
            if (u0 instanceof f0) {
                return ((f0)u0).a;
            }
            if (u0 == this) {
                return (t)u0;
            }
            Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            t = (t)u0;
        } while (!kotlinx.coroutines.internal.t.G.compareAndSet(this, u0, t.G0()));
        t.p0(null);
        return null;
    }
    
    @y0
    public final int H0(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final t b, @org.jetbrains.annotations.e final c c) {
        t.H.lazySet(t, this);
        final AtomicReferenceFieldUpdater g = t.G;
        g.lazySet(t, b);
        c.b = b;
        if (!g.compareAndSet(this, b, c)) {
            return 0;
        }
        int n;
        if (c.c(this) == null) {
            n = 1;
        }
        else {
            n = 2;
        }
        return n;
    }
    
    public final void I0(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final t t2) {
        final boolean b = w0.b();
        final int n = 1;
        if (b && t != this._prev) {
            throw new AssertionError();
        }
        if (w0.b()) {
            int n2;
            if (t2 == this._next) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 == 0) {
                throw new AssertionError();
            }
        }
    }
    
    public final void j0(@org.jetbrains.annotations.e final t t) {
        while (!this.w0().n0(t, this)) {}
    }
    
    public final boolean k0(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final n6.a<Boolean> a) {
        final c c = new c() {
            final /* synthetic */ n6.a d;
            
            @f
            public Object k(@org.jetbrains.annotations.e final t t) {
                Object a;
                if (this.d.invoke()) {
                    a = null;
                }
                else {
                    a = s.a();
                }
                return a;
            }
        };
        while (true) {
            final int h0 = this.w0().H0(t, this, (c)c);
            if (h0 == 1) {
                return true;
            }
            if (h0 != 2) {
                continue;
            }
            return false;
        }
    }
    
    public final boolean l0(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final l<? super t, Boolean> l) {
        t w0;
        do {
            w0 = this.w0();
            if (!(boolean)l.invoke((Object)w0)) {
                return false;
            }
        } while (!w0.n0(t, this));
        return true;
    }
    
    public final boolean m0(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final l<? super t, Boolean> l, @org.jetbrains.annotations.e final n6.a<Boolean> a) {
        final c c = new c() {
            final /* synthetic */ n6.a d;
            
            @f
            public Object k(@org.jetbrains.annotations.e final t t) {
                Object a;
                if (a.invoke()) {
                    a = null;
                }
                else {
                    a = s.a();
                }
                return a;
            }
        };
        while (true) {
            final t w0 = this.w0();
            if (!(boolean)l.invoke((Object)w0)) {
                return false;
            }
            final int h0 = w0.H0(t, this, (c)c);
            if (h0 == 1) {
                return true;
            }
            if (h0 != 2) {
                continue;
            }
            return false;
        }
    }
    
    @y0
    public final boolean n0(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final t t2) {
        t.H.lazySet(t, this);
        final AtomicReferenceFieldUpdater g = t.G;
        g.lazySet(t, t2);
        if (!g.compareAndSet(this, t2, t)) {
            return false;
        }
        t.t0(t2);
        return true;
    }
    
    public final boolean o0(@org.jetbrains.annotations.e final t t) {
        t.H.lazySet(t, this);
        t.G.lazySet(t, this);
        while (this.u0() == this) {
            if (t.G.compareAndSet(this, this, t)) {
                t.t0(this);
                return true;
            }
        }
        return false;
    }
    
    @org.jetbrains.annotations.e
    public final <T extends t> b<T> q0(@org.jetbrains.annotations.e final T t) {
        return new b<T>(this, t);
    }
    
    @org.jetbrains.annotations.e
    public final e<t> r0() {
        return new e<t>(this);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
    
    @org.jetbrains.annotations.e
    public final Object u0() {
        Object next;
        while (true) {
            next = this._next;
            if (!(next instanceof d0)) {
                break;
            }
            ((d0)next).c(this);
        }
        return next;
    }
    
    @org.jetbrains.annotations.e
    public final t v0() {
        return s.h(this.u0());
    }
    
    @org.jetbrains.annotations.e
    public final t w0() {
        t t = this.p0(null);
        if (t == null) {
            t = this.s0((t)this._prev);
        }
        return t;
    }
    
    public final void x0() {
        final Object u0 = this.u0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        ((f0)u0).a.p0(null);
    }
    
    @y0
    public final void y0() {
        t a = this;
        while (true) {
            final Object u0 = a.u0();
            if (!(u0 instanceof f0)) {
                break;
            }
            a = ((f0)u0).a;
        }
        a.p0(null);
    }
    
    public boolean z0() {
        return this.u0() instanceof f0;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001e\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 " }, d2 = { "kotlinx/coroutines/internal/t$a", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/d0;", "op", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/internal/Node;", "m", "affected", "", "e", "next", "", "l", "Lkotlin/j2;", "f", "n", "Lkotlinx/coroutines/internal/t$d;", "prepareOp", "g", "j", "k", "Lkotlinx/coroutines/internal/d;", "c", "failure", "a", "h", "()Lkotlinx/coroutines/internal/t;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public abstract static class a extends b
    {
        @Override
        public final void a(@org.jetbrains.annotations.e final kotlinx.coroutines.internal.d<?> d, @f Object n) {
            final boolean b = n == null;
            final t h = this.h();
            if (h != null) {
                final t i = this.i();
                if (i != null) {
                    if (b) {
                        n = this.n(h, i);
                    }
                    else {
                        n = i;
                    }
                    if (t.G.compareAndSet(h, d, n) && b) {
                        this.f(h, i);
                    }
                    return;
                }
                if (w0.b() && !(b ^ true)) {
                    throw new AssertionError();
                }
            }
            else if (w0.b() && !(b ^ true)) {
                throw new AssertionError();
            }
        }
        
        @f
        @Override
        public final Object c(@org.jetbrains.annotations.e final kotlinx.coroutines.internal.d<?> d) {
            while (true) {
                final t m = this.m(d);
                if (m == null) {
                    break;
                }
                final Object next = m._next;
                if (next == d) {
                    return null;
                }
                if (d.h()) {
                    return null;
                }
                if (next instanceof d0) {
                    final kotlinx.coroutines.internal.d<?> d2 = (kotlinx.coroutines.internal.d<?>)next;
                    if (d.b(d2)) {
                        return kotlinx.coroutines.internal.c.b;
                    }
                    d2.c(m);
                }
                else {
                    final Object e = this.e(m);
                    if (e != null) {
                        return e;
                    }
                    if (this.l(m, next)) {
                        continue;
                    }
                    Objects.requireNonNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    final d d3 = new d(m, (t)next, this);
                    if (t.G.compareAndSet(m, next, d3)) {
                        try {
                            final Object c = d3.c(m);
                            if (c == u.a) {
                                continue;
                            }
                            if (w0.b() && c != null) {
                                throw new AssertionError();
                            }
                            return null;
                        }
                        finally {
                            t.G.compareAndSet(m, d3, next);
                        }
                        break;
                    }
                    continue;
                }
            }
            return kotlinx.coroutines.internal.c.b;
        }
        
        @f
        protected Object e(@org.jetbrains.annotations.e final t t) {
            return null;
        }
        
        protected abstract void f(@org.jetbrains.annotations.e final t p0, @org.jetbrains.annotations.e final t p1);
        
        public abstract void g(@org.jetbrains.annotations.e final d p0);
        
        @f
        protected abstract t h();
        
        @f
        protected abstract t i();
        
        @f
        public Object j(@org.jetbrains.annotations.e final d d) {
            this.g(d);
            return null;
        }
        
        public void k(@org.jetbrains.annotations.e final t t) {
        }
        
        protected boolean l(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final Object o) {
            return false;
        }
        
        @f
        protected t m(@org.jetbrains.annotations.e final d0 d0) {
            final t h = this.h();
            k0.m((Object)h);
            return h;
        }
        
        @org.jetbrains.annotations.e
        public abstract Object n(@org.jetbrains.annotations.e final t p0, @org.jetbrains.annotations.e final t p1);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00060\u0001j\u0002`\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00028\u00008\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010!\u001a\u00060\u0001j\u0002`\u00028D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006#" }, d2 = { "kotlinx/coroutines/internal/t$b", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlinx/coroutines/internal/t$a;", "Lkotlinx/coroutines/internal/d0;", "op", "m", "(Lkotlinx/coroutines/internal/d0;)Lkotlinx/coroutines/internal/t;", "affected", "", "next", "", "l", "(Lkotlinx/coroutines/internal/t;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/t$d;", "prepareOp", "Lkotlin/j2;", "g", "(Lkotlinx/coroutines/internal/t$d;)V", "n", "(Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t;)V", "b", "Lkotlinx/coroutines/internal/t;", "queue", "h", "()Lkotlinx/coroutines/internal/t;", "affectedNode", "c", "node", "i", "originalNext", "<init>", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static class b<T extends t> extends a
    {
        private static final /* synthetic */ AtomicReferenceFieldUpdater d;
        private volatile /* synthetic */ Object _affectedNode;
        @m6.d
        @org.jetbrains.annotations.e
        public final t b;
        @m6.d
        @org.jetbrains.annotations.e
        public final T c;
        
        static {
            d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");
        }
        
        public b(@org.jetbrains.annotations.e final t b, @org.jetbrains.annotations.e final T c) {
            this.b = b;
            this.c = c;
            if (w0.b() && (c._next != c || c._prev != c)) {
                throw new AssertionError();
            }
            this._affectedNode = null;
        }
        
        @Override
        protected void f(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final t t2) {
            this.c.t0(this.b);
        }
        
        @Override
        public void g(@org.jetbrains.annotations.e final d d) {
            t.b.d.compareAndSet(this, null, d.a);
        }
        
        @f
        @Override
        protected final t h() {
            return (t)this._affectedNode;
        }
        
        @org.jetbrains.annotations.e
        @Override
        protected final t i() {
            return this.b;
        }
        
        @Override
        protected boolean l(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final Object o) {
            return o != this.b;
        }
        
        @f
        @Override
        protected final t m(@org.jetbrains.annotations.e final d0 d0) {
            return this.b.p0(d0);
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Object n(@org.jetbrains.annotations.e t c, @org.jetbrains.annotations.e t c2) {
            c2 = this.c;
            t.H.compareAndSet(c2, c2, c);
            c = this.c;
            t.G.compareAndSet(c, c, this.b);
            return this.c;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001a\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010" }, d2 = { "kotlinx/coroutines/internal/t$c", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lkotlin/j2;", "j", "c", "Lkotlinx/coroutines/internal/t;", "newNode", "b", "oldNext", "<init>", "(Lkotlinx/coroutines/internal/t;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    @y0
    public abstract static class c extends d<t>
    {
        @m6.d
        @f
        public t b;
        @m6.d
        @org.jetbrains.annotations.e
        public final t c;
        
        public c(@org.jetbrains.annotations.e final t c) {
            this.c = c;
        }
        
        public void j(@org.jetbrains.annotations.e t b, @f final Object o) {
            final boolean b2 = o == null;
            t t;
            if (b2) {
                t = this.c;
            }
            else {
                t = this.b;
            }
            if (t != null && kotlinx.coroutines.internal.t.G.compareAndSet(b, this, t) && b2) {
                final t c = this.c;
                b = this.b;
                k0.m((Object)b);
                c.t0(b);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\r\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00060\tj\u0002`\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0017" }, d2 = { "kotlinx/coroutines/internal/t$d", "Lkotlinx/coroutines/internal/d0;", "", "affected", "c", "Lkotlin/j2;", "d", "", "toString", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/internal/Node;", "b", "Lkotlinx/coroutines/internal/t;", "next", "a", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "Lkotlinx/coroutines/internal/t$a;", "Lkotlinx/coroutines/internal/t$a;", "desc", "<init>", "(Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t$a;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class d extends d0
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final t a;
        @m6.d
        @org.jetbrains.annotations.e
        public final t b;
        @m6.d
        @org.jetbrains.annotations.e
        public final a c;
        
        public d(@org.jetbrains.annotations.e final t a, @org.jetbrains.annotations.e final t b, @org.jetbrains.annotations.e final a c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public kotlinx.coroutines.internal.d<?> a() {
            return this.c.b();
        }
        
        @f
        @Override
        public Object c(@f Object obj) {
            if (w0.b() && obj != this.a) {
                throw new AssertionError();
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            final t t = (t)obj;
            final Object j = this.c.j(this);
            obj = u.a;
            if (j == obj) {
                final t b = this.b;
                if (kotlinx.coroutines.internal.t.G.compareAndSet(t, this, b.G0())) {
                    this.c.k(t);
                    b.p0(null);
                }
                return obj;
            }
            if (j != null) {
                obj = this.a().e(j);
            }
            else {
                obj = this.a().f();
            }
            if (obj == kotlinx.coroutines.internal.c.a) {
                obj = this.a();
            }
            else if (obj == null) {
                obj = this.c.n(t, this.b);
            }
            else {
                obj = this.b;
            }
            kotlinx.coroutines.internal.t.G.compareAndSet(t, this, obj);
            return null;
        }
        
        public final void d() {
            this.c.g(this);
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("PrepareOp(op=");
            sb.append(this.a());
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001f\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00060\u0005j\u0002`\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0019\u0010&\u001a\u00028\u00008F@\u0006¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006)" }, d2 = { "kotlinx/coroutines/internal/t$e", "T", "Lkotlinx/coroutines/internal/t$a;", "Lkotlinx/coroutines/internal/d0;", "op", "Lkotlinx/coroutines/internal/t;", "Lkotlinx/coroutines/internal/Node;", "m", "(Lkotlinx/coroutines/internal/d0;)Lkotlinx/coroutines/internal/t;", "affected", "", "e", "(Lkotlinx/coroutines/internal/t;)Ljava/lang/Object;", "next", "", "l", "(Lkotlinx/coroutines/internal/t;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/t$d;", "prepareOp", "Lkotlin/j2;", "g", "(Lkotlinx/coroutines/internal/t$d;)V", "n", "(Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/internal/t;Lkotlinx/coroutines/internal/t;)V", "i", "()Lkotlinx/coroutines/internal/t;", "originalNext", "b", "Lkotlinx/coroutines/internal/t;", "queue", "h", "affectedNode", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "<init>", "(Lkotlinx/coroutines/internal/t;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static class e<T> extends a
    {
        private static final /* synthetic */ AtomicReferenceFieldUpdater c;
        private static final /* synthetic */ AtomicReferenceFieldUpdater d;
        private volatile /* synthetic */ Object _affectedNode;
        private volatile /* synthetic */ Object _originalNext;
        @m6.d
        @org.jetbrains.annotations.e
        public final t b;
        
        static {
            c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_affectedNode");
            d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");
        }
        
        public e(@org.jetbrains.annotations.e final t b) {
            this.b = b;
            this._affectedNode = null;
            this._originalNext = null;
        }
        
        @f
        @Override
        protected Object e(@org.jetbrains.annotations.e final t t) {
            Object d;
            if (t == this.b) {
                d = s.d();
            }
            else {
                d = null;
            }
            return d;
        }
        
        @Override
        protected final void f(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final t t2) {
            t2.p0(null);
        }
        
        @Override
        public void g(@org.jetbrains.annotations.e final d d) {
            e.c.compareAndSet(this, null, d.a);
            e.d.compareAndSet(this, null, d.b);
        }
        
        @f
        @Override
        protected final t h() {
            return (t)this._affectedNode;
        }
        
        @f
        @Override
        protected final t i() {
            return (t)this._originalNext;
        }
        
        @Override
        protected final boolean l(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final Object o) {
            if (!(o instanceof f0)) {
                return false;
            }
            ((f0)o).a.y0();
            return true;
        }
        
        @f
        @Override
        protected final t m(@org.jetbrains.annotations.e final d0 d0) {
            final t b = this.b;
            while (true) {
                final Object next = b._next;
                if (!(next instanceof d0)) {
                    Objects.requireNonNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    return (t)next;
                }
                final d0 d2 = (d0)next;
                if (d0.b(d2)) {
                    return null;
                }
                d2.c(this.b);
            }
        }
        
        @org.jetbrains.annotations.e
        @Override
        public final Object n(@org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final t t2) {
            return t2.G0();
        }
        
        public final T o() {
            final t h = this.h();
            k0.m((Object)h);
            return (T)h;
        }
    }
}
