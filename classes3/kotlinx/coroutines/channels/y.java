// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import kotlin.j2;
import kotlinx.coroutines.w0;
import kotlin.jvm.internal.q1;
import n6.l;
import java.util.Objects;
import kotlin.collections.m;
import kotlin.coroutines.d;
import n6.p;
import kotlinx.coroutines.selects.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.internal.k0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.z1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 E*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004FG*-B\u0007¢\u0006\u0004\bC\u0010AB\u0011\b\u0016\u0012\u0006\u0010B\u001a\u00028\u0000¢\u0006\u0004\bC\u0010DJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0011\u001a\u00028\u00002(\u0010\u001c\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\u00020\u00052\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b*\u0010$J\u001f\u0010-\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u00020\"8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0015\u00108\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b6\u00107R(\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019098V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\"8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00104R\u0019\u0010B\u001a\u00028\u00008F@\u0006¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\b?\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H" }, d2 = { "Lkotlinx/coroutines/channels/y;", "E", "Lkotlinx/coroutines/channels/j;", "Lkotlinx/coroutines/channels/y$d;", "subscriber", "Lkotlin/j2;", "g", "(Lkotlinx/coroutines/channels/y$d;)V", "", "list", "f", "([Lkotlinx/coroutines/channels/y$d;Lkotlinx/coroutines/channels/y$d;)[Lkotlinx/coroutines/channels/y$d;", "n", "", "cause", "k", "(Ljava/lang/Throwable;)V", "element", "Lkotlinx/coroutines/channels/y$a;", "l", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/y$a;", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/l0;", "Lkotlin/coroutines/d;", "", "block", "m", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Ln6/p;)V", "Lkotlinx/coroutines/channels/h0;", "L", "()Lkotlinx/coroutines/channels/h0;", "", "I", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "K", "(Ln6/l;)V", "c", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d", "(Ljava/util/concurrent/CancellationException;)V", "U", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "offer", "(Ljava/lang/Object;)Z", "z", "()Z", "isFull", "j", "()Ljava/lang/Object;", "valueOrNull", "Lkotlinx/coroutines/selects/e;", "A", "()Lkotlinx/coroutines/selects/e;", "onSend", "W", "isClosedForSend", "h", "getValue$annotations", "()V", "value", "<init>", "(Ljava/lang/Object;)V", "M", "a", "b", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@z1
public final class y<E> implements j<E>
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater G;
    private static final /* synthetic */ AtomicIntegerFieldUpdater H;
    private static final /* synthetic */ AtomicReferenceFieldUpdater I;
    @Deprecated
    private static final a J;
    @Deprecated
    private static final k0 K;
    @Deprecated
    private static final c<Object> L;
    @e
    private static final b M;
    private volatile /* synthetic */ Object _state;
    private volatile /* synthetic */ int _updating;
    private volatile /* synthetic */ Object onCloseHandler;
    
    static {
        M = new b(null);
        J = new a(null);
        L = new c<Object>(K = new k0("UNDEFINED"), null);
        G = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_state");
        H = AtomicIntegerFieldUpdater.newUpdater(y.class, "_updating");
        I = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "onCloseHandler");
    }
    
    public y() {
        this._state = y.L;
        this._updating = 0;
        this.onCloseHandler = null;
    }
    
    public y(final E e) {
        this();
        y.G.lazySet(this, new c(e, null));
    }
    
    private final d<E>[] f(final d<E>[] array, final d<E> d) {
        if (array == null) {
            final d[] array2 = { null };
            for (int i = 0; i < 1; ++i) {
                array2[i] = d;
            }
            return (d<E>[])array2;
        }
        return (d<E>[])m.T2((Object[])array, (Object)d);
    }
    
    private final void g(final d<E> d) {
        Object state;
        Object a;
        d<E>[] b;
        do {
            state = this._state;
            if (state instanceof a) {
                return;
            }
            if (!(state instanceof c)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(state);
                throw new IllegalStateException(sb.toString().toString());
            }
            a = ((c)state).a;
            Objects.requireNonNull(state, "null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
            b = ((c)state).b;
            kotlin.jvm.internal.k0.m((Object)b);
        } while (!y.G.compareAndSet(this, state, new c(a, this.n((d<Object>[])b, (d<Object>)d))));
    }
    
    private final void k(final Throwable t) {
        final Object onCloseHandler = this.onCloseHandler;
        if (onCloseHandler != null) {
            final k0 i = kotlinx.coroutines.channels.b.i;
            if (onCloseHandler != i && y.I.compareAndSet(this, onCloseHandler, i)) {
                ((l)q1.q(onCloseHandler, 1)).invoke((Object)t);
            }
        }
    }
    
    private final a l(final E e) {
        if (!y.H.compareAndSet(this, 0, 1)) {
            return null;
        }
        Label_0014: {
            break Label_0014;
            try {
                Object state;
                do {
                    state = this._state;
                    if (state instanceof a) {
                        return (a)state;
                    }
                    if (!(state instanceof c)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state ");
                        sb.append(state);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    if (state != null) {
                        continue;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                } while (!y.G.compareAndSet(this, state, new c(e, (d<Object>[])((c)state).b)));
                final d<E>[] b = ((c)state).b;
                if (b != null) {
                    for (int length = b.length, i = 0; i < length; ++i) {
                        b[i].C((E)e);
                    }
                }
                return null;
            }
            finally {
                this._updating = 0;
            }
        }
    }
    
    private final <R> void m(final f<? super R> f, final E e, final p<? super l0<? super E>, ? super kotlin.coroutines.d<? super R>, ?> p3) {
        if (!f.l()) {
            return;
        }
        final a l = this.l(e);
        if (l != null) {
            f.J(l.a());
            return;
        }
        c7.b.d((n6.p<? super y, ? super kotlin.coroutines.d<? super Object>, ?>)p3, this, (kotlin.coroutines.d<? super Object>)f.w());
    }
    
    private final d<E>[] n(final d<E>[] array, final d<E> d) {
        final int length = array.length;
        final int ff = m.ff((Object[])array, (Object)d);
        if (w0.b() && ff < 0) {
            throw new AssertionError();
        }
        if (length == 1) {
            return null;
        }
        final d[] array2 = new d[length - 1];
        m.l1((Object[])array, (Object[])array2, 0, 0, ff, 6, (Object)null);
        m.l1((Object[])array, (Object[])array2, ff, ff + 1, 0, 8, (Object)null);
        return (d<E>[])array2;
    }
    
    @e
    @Override
    public kotlinx.coroutines.selects.e<E, l0<E>> A() {
        return (kotlinx.coroutines.selects.e<E, l0<E>>)new kotlinx.coroutines.selects.e<E, l0<? super E>>() {
            @Override
            public <R> void P(@org.jetbrains.annotations.e final f<? super R> f, final E e, @org.jetbrains.annotations.e final p<? super l0<? super E>, ? super kotlin.coroutines.d<? super R>, ?> p3) {
                y.this.m(f, e, p3);
            }
        };
    }
    
    @Override
    public boolean I(@org.jetbrains.annotations.f final Throwable t) {
        Object state;
        a j;
        int i;
        do {
            state = this._state;
            final boolean b = state instanceof a;
            i = 0;
            if (b) {
                return false;
            }
            if (!(state instanceof c)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(state);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (t == null) {
                j = y.J;
            }
            else {
                j = new a(t);
            }
        } while (!y.G.compareAndSet(this, state, j));
        Objects.requireNonNull(state, "null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
        final d<E>[] b2 = ((c)state).b;
        if (b2 != null) {
            while (i < b2.length) {
                b2[i].I(t);
                ++i;
            }
        }
        this.k(t);
        return true;
    }
    
    @Override
    public void K(@e final l<? super Throwable, j2> l) {
        final AtomicReferenceFieldUpdater i = y.I;
        if (i.compareAndSet(this, null, l)) {
            final Object state = this._state;
            if (state instanceof a && i.compareAndSet(this, l, kotlinx.coroutines.channels.b.i)) {
                l.invoke((Object)((a)state).a);
            }
            return;
        }
        final Object onCloseHandler = this.onCloseHandler;
        if (onCloseHandler == kotlinx.coroutines.channels.b.i) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another handler was already registered: ");
        sb.append(onCloseHandler);
        throw new IllegalStateException(sb.toString());
    }
    
    @e
    @Override
    public h0<E> L() {
        final d<E> d = new d<E>(this);
        Object state;
        Object a;
        do {
            state = this._state;
            if (state instanceof a) {
                d.I(((a)state).a);
                return d;
            }
            if (!(state instanceof c)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(state);
                throw new IllegalStateException(sb.toString().toString());
            }
            final c c = (c)state;
            final Object a2 = c.a;
            if (a2 != y.K) {
                d.C((E)a2);
            }
            a = c.a;
            Objects.requireNonNull(state, "null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
        } while (!y.G.compareAndSet(this, state, new c(a, (d<Object>[])this.f(((c)state).b, (d<E>)d))));
        return d;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object U(final E e, @e final kotlin.coroutines.d<? super j2> d) {
        final a l = this.l(e);
        if (l != null) {
            throw l.a();
        }
        if (kotlin.coroutines.intrinsics.b.h() == null) {
            return null;
        }
        return j2.a;
    }
    
    @Override
    public boolean W() {
        return this._state instanceof a;
    }
    
    @Override
    public void d(@org.jetbrains.annotations.f final CancellationException ex) {
        this.I(ex);
    }
    
    public final E h() {
        final Object state = this._state;
        if (state instanceof a) {
            throw ((a)state).b();
        }
        if (!(state instanceof c)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid state ");
            sb.append(state);
            throw new IllegalStateException(sb.toString().toString());
        }
        final Object a = ((c)state).a;
        if (a != y.K) {
            return (E)a;
        }
        throw new IllegalStateException("No value");
    }
    
    @org.jetbrains.annotations.f
    public final E j() {
        final Object state = this._state;
        final boolean b = state instanceof a;
        E e = null;
        if (!b) {
            if (!(state instanceof c)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(state);
                throw new IllegalStateException(sb.toString().toString());
            }
            final k0 k = y.K;
            final Object a = ((c)state).a;
            if (a != k) {
                e = (E)a;
            }
        }
        return e;
    }
    
    @Override
    public boolean offer(final E e) {
        final a l = this.l(e);
        if (l == null) {
            return true;
        }
        throw l.a();
    }
    
    @Override
    public boolean z() {
        return false;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\f" }, d2 = { "kotlinx/coroutines/channels/y$a", "", "", "b", "()Ljava/lang/Throwable;", "valueException", "a", "Ljava/lang/Throwable;", "closeCause", "sendException", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class a
    {
        @m6.d
        @org.jetbrains.annotations.f
        public final Throwable a;
        
        public a(@org.jetbrains.annotations.f final Throwable a) {
            this.a = a;
        }
        
        @e
        public final Throwable a() {
            Throwable a = this.a;
            if (a == null) {
                a = new x("Channel was closed");
            }
            return a;
        }
        
        @e
        public final Throwable b() {
            Throwable a = this.a;
            if (a == null) {
                a = new IllegalStateException("Channel was closed");
            }
            return a;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "kotlinx/coroutines/channels/y$b", "", "Lkotlinx/coroutines/channels/y$a;", "CLOSED", "Lkotlinx/coroutines/channels/y$a;", "Lkotlinx/coroutines/channels/y$c;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/y$c;", "Lkotlinx/coroutines/internal/k0;", "UNDEFINED", "Lkotlinx/coroutines/internal/k0;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class b
    {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0018\u00010\u00038\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r" }, d2 = { "kotlinx/coroutines/channels/y$c", "E", "", "", "Lkotlinx/coroutines/channels/y$d;", "b", "[Lkotlinx/coroutines/channels/y$d;", "subscribers", "a", "Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/y$d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class c<E>
    {
        @m6.d
        @org.jetbrains.annotations.f
        public final Object a;
        @m6.d
        @org.jetbrains.annotations.f
        public final d<E>[] b;
        
        public c(@org.jetbrains.annotations.f final Object a, @org.jetbrains.annotations.f final d<E>[] b) {
            this.a = a;
            this.b = b;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "kotlinx/coroutines/channels/y$d", "E", "Lkotlinx/coroutines/channels/z;", "Lkotlinx/coroutines/channels/h0;", "", "wasClosed", "Lkotlin/j2;", "d0", "element", "", "C", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/y;", "L", "Lkotlinx/coroutines/channels/y;", "broadcastChannel", "<init>", "(Lkotlinx/coroutines/channels/y;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class d<E> extends z<E> implements h0<E>
    {
        private final y<E> L;
        
        public d(@org.jetbrains.annotations.e final y<E> l) {
            super(null);
            this.L = l;
        }
        
        @org.jetbrains.annotations.e
        public Object C(final E e) {
            return super.C(e);
        }
        
        @Override
        protected void d0(final boolean b) {
            if (b) {
                ((y<Object>)this.L).g(this);
            }
        }
    }
}
