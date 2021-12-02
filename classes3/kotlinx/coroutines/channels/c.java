// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.u;
import c7.a;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.internal.s;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.q;
import kotlin.jvm.internal.q1;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlin.m;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.internal.c0;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.t;
import java.util.Objects;
import kotlinx.coroutines.selects.g;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.l1;
import n6.p;
import org.jetbrains.annotations.f;
import m6.d;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.internal.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004efghB)\u0012 \u0010c\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u000106j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`b¢\u0006\u0004\bd\u0010:J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\u0018\u001a\u00020\n\"\u0004\b\u0001\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0003\u001a\u00028\u00002(\u0010\u0017\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0004¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010$2\u0006\u0010\u0003\u001a\u00028\u0000H\u0004¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u000e\u0012\u0002\b\u00030'j\u0006\u0012\u0002\b\u0003`(2\u0006\u0010\u0003\u001a\u00028\u0000H\u0004¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0000H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b0\u0010,J\u0019\u00102\u001a\u0004\u0018\u00010\u00162\u0006\u00101\u001a\u00020!H\u0014¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020-2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b4\u00105J)\u00109\u001a\u00020\n2\u0018\u00108\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\n06j\u0002`7H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020;H\u0014¢\u0006\u0004\b\u0001\u0010<J\u0017\u0010=\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$H\u0014¢\u0006\u0004\b=\u0010>J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u0010\u0003\u001a\u00028\u0000H\u0004¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020B8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010DR\u001c\u0010K\u001a\u00020G8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b%\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020-8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR%\u0010R\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020O8F@\u0006¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0013\u0010T\u001a\u00020-8F@\u0006¢\u0006\u0006\u001a\u0004\bS\u0010MR\u0016\u0010V\u001a\u00020-8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010MR\u0016\u0010X\u001a\u00020-8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bW\u0010MR\u0016\u0010Z\u001a\u00020-8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\bY\u0010MR\u001c\u0010]\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001c\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0016\u0010a\u001a\u00020B8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b`\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i" }, d2 = { "Lkotlinx/coroutines/channels/c;", "E", "Lkotlinx/coroutines/channels/l0;", "element", "Lkotlinx/coroutines/channels/v;", "closed", "", "s", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/v;)Ljava/lang/Throwable;", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "t", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lkotlinx/coroutines/channels/v;)V", "cause", "u", "(Ljava/lang/Throwable;)V", "r", "(Lkotlinx/coroutines/channels/v;)V", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "", "block", "F", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Ln6/p;)V", "", "f", "()I", "C", "(Ljava/lang/Object;)Ljava/lang/Object;", "D", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/k0;", "N", "()Lkotlinx/coroutines/channels/k0;", "Lkotlinx/coroutines/channels/i0;", "G", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/i0;", "Lkotlinx/coroutines/internal/t$b;", "Lkotlinx/coroutines/internal/AddLastDesc;", "g", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/t$b;", "U", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "H", "send", "i", "(Lkotlinx/coroutines/channels/k0;)Ljava/lang/Object;", "I", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "K", "(Ln6/l;)V", "Lkotlinx/coroutines/internal/t;", "(Lkotlinx/coroutines/internal/t;)V", "J", "()Lkotlinx/coroutines/channels/i0;", "Lkotlinx/coroutines/channels/c$d;", "h", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/c$d;", "", "toString", "()Ljava/lang/String;", "q", "queueDebugStateString", "Lkotlinx/coroutines/internal/r;", "Lkotlinx/coroutines/internal/r;", "o", "()Lkotlinx/coroutines/internal/r;", "queue", "w", "()Z", "isBufferAlwaysFull", "Lkotlinx/coroutines/selects/e;", "A", "()Lkotlinx/coroutines/selects/e;", "onSend", "W", "isClosedForSend", "z", "isFull", "x", "isBufferFull", "y", "isFullImpl", "k", "()Lkotlinx/coroutines/channels/v;", "closedForReceive", "n", "closedForSend", "j", "bufferDebugString", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class c<E> implements l0<E>
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater I;
    @e
    private final r G;
    @m6.d
    @f
    protected final l<E, j2> H;
    private volatile /* synthetic */ Object onCloseHandler;
    
    static {
        I = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    }
    
    public c(@f final l<? super E, j2> h) {
        this.H = (l<E, j2>)h;
        this.G = new r();
        this.onCloseHandler = null;
    }
    
    private final <R> void F(final kotlinx.coroutines.selects.f<? super R> f, final E e, final p<? super l0<? super E>, ? super kotlin.coroutines.d<? super R>, ?> p3) {
        while (!f.s()) {
            if (this.y()) {
                final c c = new c(e, this, f, p3);
                final Object i = this.i(c);
                if (i == null) {
                    f.d0(c);
                    return;
                }
                if (i instanceof v) {
                    throw j0.p(this.s(e, (v<?>)i));
                }
                if (i != kotlinx.coroutines.channels.b.h) {
                    if (!(i instanceof g0)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("enqueueSend returned ");
                        sb.append(i);
                        sb.append(' ');
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
            }
            final Object d = this.D(e, f);
            if (d == g.d()) {
                return;
            }
            if (d == kotlinx.coroutines.channels.b.f) {
                continue;
            }
            if (d == c.b) {
                continue;
            }
            if (d == kotlinx.coroutines.channels.b.e) {
                c7.b.d((n6.p<? super c, ? super kotlin.coroutines.d<? super Object>, ?>)p3, this, f.w());
                return;
            }
            if (d instanceof v) {
                throw j0.p(this.s(e, (v<?>)d));
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("offerSelectInternal returned ");
            sb2.append(d);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }
    
    private final int f() {
        final r g = this.G;
        final Object u0 = g.u0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        t v0 = (t)u0;
        int n = 0;
        while (kotlin.jvm.internal.k0.g((Object)v0, (Object)g) ^ true) {
            int n2 = n;
            if (v0 instanceof t) {
                n2 = n + 1;
            }
            v0 = v0.v0();
            n = n2;
        }
        return n;
    }
    
    private final String q() {
        final t v0 = this.G.v0();
        if (v0 == this.G) {
            return "EmptyQueue";
        }
        String str;
        if (v0 instanceof v) {
            str = v0.toString();
        }
        else if (v0 instanceof g0) {
            str = "ReceiveQueued";
        }
        else if (v0 instanceof k0) {
            str = "SendQueued";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("UNEXPECTED:");
            sb.append(v0);
            str = sb.toString();
        }
        final t w0 = this.G.w0();
        String str2 = str;
        if (w0 != v0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(",queueSize=");
            sb2.append(this.f());
            str2 = sb2.toString();
            if (w0 instanceof v) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(",closedForSend=");
                sb3.append(w0);
                str2 = sb3.toString();
            }
        }
        return str2;
    }
    
    private final void r(final v<?> v) {
        Object o = kotlinx.coroutines.internal.o.c(null, 1, null);
        while (true) {
            t w0;
            if (!((w0 = v.w0()) instanceof g0)) {
                w0 = null;
            }
            final g0 g0 = (g0)w0;
            if (g0 == null) {
                break;
            }
            if (!g0.C0()) {
                g0.x0();
            }
            else {
                o = kotlinx.coroutines.internal.o.h(o, g0);
            }
        }
        if (o != null) {
            if (!(o instanceof ArrayList)) {
                ((g0)o).L0(v);
            }
            else {
                final ArrayList<g0> list = (ArrayList<g0>)o;
                for (int i = list.size() - 1; i >= 0; --i) {
                    list.get(i).L0(v);
                }
            }
        }
        this.E(v);
    }
    
    private final Throwable s(final E e, final v<?> v) {
        this.r(v);
        final l<E, j2> h = this.H;
        if (h != null) {
            final w0 d = c0.d(h, e, null, 2, null);
            if (d != null) {
                m.a((Throwable)d, v.R0());
                throw d;
            }
        }
        return v.R0();
    }
    
    private final void t(final kotlin.coroutines.d<?> d, final E e, final v<?> v) {
        this.r(v);
        final Throwable r0 = v.R0();
        final l<E, j2> h = this.H;
        while (true) {
            Label_0060: {
                if (h == null) {
                    break Label_0060;
                }
                final w0 d2 = c0.d(h, e, null, 2, null);
                if (d2 == null) {
                    break Label_0060;
                }
                m.a((Throwable)d2, r0);
                final b1$a h2 = b1.H;
                final Object o = c1.a((Throwable)d2);
                d.resumeWith(b1.b(o));
                return;
            }
            final b1$a h3 = b1.H;
            final Object o = c1.a(r0);
            continue;
        }
    }
    
    private final void u(final Throwable t) {
        final Object onCloseHandler = this.onCloseHandler;
        if (onCloseHandler != null) {
            final kotlinx.coroutines.internal.k0 i = kotlinx.coroutines.channels.b.i;
            if (onCloseHandler != i && c.I.compareAndSet(this, onCloseHandler, i)) {
                ((l)q1.q(onCloseHandler, 1)).invoke((Object)t);
            }
        }
    }
    
    @e
    @Override
    public final kotlinx.coroutines.selects.e<E, l0<E>> A() {
        return (kotlinx.coroutines.selects.e<E, l0<E>>)new kotlinx.coroutines.selects.e<E, l0<? super E>>() {
            @Override
            public <R> void P(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> f, final E e, @org.jetbrains.annotations.e final p<? super l0<? super E>, ? super kotlin.coroutines.d<? super R>, ?> p3) {
                c.this.F(f, e, p3);
            }
        };
    }
    
    @e
    protected Object C(final E e) {
        kotlinx.coroutines.internal.k0 b0;
        i0<E> j;
        do {
            j = this.J();
            if (j == null) {
                return kotlinx.coroutines.channels.b.f;
            }
            b0 = j.b0(e, null);
        } while (b0 == null);
        if (kotlinx.coroutines.w0.b() && b0 != q.d) {
            throw new AssertionError();
        }
        j.A(e);
        return j.j();
    }
    
    @e
    protected Object D(final E e, @e final kotlinx.coroutines.selects.f<?> f) {
        final d<E> h = this.h(e);
        final Object m = f.M(h);
        if (m != null) {
            return m;
        }
        final i0<E> i0 = h.o();
        i0.A(e);
        return i0.j();
    }
    
    protected void E(@e final t t) {
    }
    
    @f
    protected final i0<?> G(final E e) {
        final r g = this.G;
        t w0;
        do {
            w0 = g.w0();
            if (w0 instanceof i0) {
                return (i0<?>)w0;
            }
        } while (!w0.n0(new a<Object>(e), g));
        return null;
    }
    
    final /* synthetic */ Object H(final E e, final kotlin.coroutines.d<? super j2> d) {
        final kotlinx.coroutines.p<Object> b = (kotlinx.coroutines.p<Object>)kotlinx.coroutines.r.b((kotlin.coroutines.d<?>)kotlin.coroutines.intrinsics.b.d((kotlin.coroutines.d)d));
        while (true) {
            if (this.y()) {
                m0 m0;
                if (this.H == null) {
                    m0 = new m0<Object>(e, b);
                }
                else {
                    m0 = new n0<Object>(e, b, (n6.l<? super Object, j2>)this.H);
                }
                final Object i = this.i(m0);
                if (i == null) {
                    kotlinx.coroutines.r.c(b, m0);
                    break;
                }
                if (i instanceof v) {
                    this.t((kotlin.coroutines.d)b, e, (v)i);
                    break;
                }
                if (i != kotlinx.coroutines.channels.b.h) {
                    if (!(i instanceof g0)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("enqueueSend returned ");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
            }
            final Object c = this.C(e);
            if (c == kotlinx.coroutines.channels.b.e) {
                final j2 a = j2.a;
                final b1$a h = b1.H;
                ((kotlin.coroutines.d)b).resumeWith(b1.b((Object)a));
                break;
            }
            if (c == kotlinx.coroutines.channels.b.f) {
                continue;
            }
            if (c instanceof v) {
                this.t((kotlin.coroutines.d)b, e, (v)c);
                break;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("offerInternal returned ");
            sb2.append(c);
            throw new IllegalStateException(sb2.toString().toString());
        }
        final Object y = b.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((kotlin.coroutines.d)d);
        }
        return y;
    }
    
    @Override
    public boolean I(@f final Throwable t) {
        v<?> v = new v<Object>(t);
        final r g = this.G;
        t w0;
        boolean b2;
        do {
            w0 = g.w0();
            final boolean b = w0 instanceof v;
            b2 = true;
            if (!(b ^ true)) {
                b2 = false;
                break;
            }
        } while (!w0.n0(v, g));
        if (!b2) {
            final t w2 = this.G.w0();
            Objects.requireNonNull(w2, "null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
            v = (v<?>)w2;
        }
        this.r(v);
        if (b2) {
            this.u(t);
        }
        return b2;
    }
    
    @f
    protected i0<E> J() {
        final r g = this.G;
        t t;
        while (true) {
            final Object u0 = g.u0();
            Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            t = (t)u0;
            if (t == g || !(t instanceof i0)) {
                t = null;
                break;
            }
            if (((i0)t) instanceof v && !t.z0()) {
                break;
            }
            final t f0 = t.F0();
            if (f0 == null) {
                break;
            }
            f0.y0();
        }
        return (i0<E>)t;
    }
    
    @Override
    public void K(@e final l<? super Throwable, j2> l) {
        final AtomicReferenceFieldUpdater i = c.I;
        if (i.compareAndSet(this, null, l)) {
            final v<?> n = this.n();
            if (n != null && i.compareAndSet(this, l, kotlinx.coroutines.channels.b.i)) {
                l.invoke((Object)n.J);
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
    
    @f
    protected final k0 N() {
        final r g = this.G;
        t t;
        while (true) {
            final Object u0 = g.u0();
            Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            t = (t)u0;
            if (t == g || !(t instanceof k0)) {
                t = null;
                break;
            }
            if (((k0)t) instanceof v && !t.z0()) {
                break;
            }
            final t f0 = t.F0();
            if (f0 == null) {
                break;
            }
            f0.y0();
        }
        return (k0)t;
    }
    
    @f
    @Override
    public final Object U(final E e, @e final kotlin.coroutines.d<? super j2> d) {
        if (this.C(e) == kotlinx.coroutines.channels.b.e) {
            return j2.a;
        }
        final Object h = this.H(e, d);
        if (h == kotlin.coroutines.intrinsics.b.h()) {
            return h;
        }
        return j2.a;
    }
    
    @Override
    public final boolean W() {
        return this.n() != null;
    }
    
    @e
    protected final t.b<?> g(final E e) {
        return new b<Object>(this.G, e);
    }
    
    @e
    protected final d<E> h(final E e) {
        return new d<E>(e, this.G);
    }
    
    @f
    protected Object i(@e final k0 k0) {
        if (this.w()) {
            final r g = this.G;
            t w0;
            do {
                w0 = g.w0();
                if (w0 instanceof i0) {
                    return w0;
                }
            } while (!w0.n0(k0, g));
        }
        else {
            final r g2 = this.G;
            final t.c c = new t.c() {
                final /* synthetic */ c e;
                
                @f
                public Object k(@org.jetbrains.annotations.e final t t) {
                    Object a;
                    if (this.e.x()) {
                        a = null;
                    }
                    else {
                        a = s.a();
                    }
                    return a;
                }
            };
            boolean b;
            while (true) {
                final t w2 = g2.w0();
                if (w2 instanceof i0) {
                    return w2;
                }
                final int h0 = w2.H0(k0, g2, (t.c)c);
                b = true;
                if (h0 == 1) {
                    break;
                }
                if (h0 != 2) {
                    continue;
                }
                b = false;
                break;
            }
            if (!b) {
                return kotlinx.coroutines.channels.b.h;
            }
        }
        return null;
    }
    
    @e
    protected String j() {
        return "";
    }
    
    @f
    protected final v<?> k() {
        t v0 = this.G.v0();
        final boolean b = v0 instanceof v;
        final v<?> v2 = null;
        if (!b) {
            v0 = null;
        }
        final v<?> v3 = (v<?>)v0;
        v<?> v4 = v2;
        if (v3 != null) {
            this.r(v3);
            v4 = v3;
        }
        return v4;
    }
    
    @f
    protected final v<?> n() {
        t w0 = this.G.w0();
        final boolean b = w0 instanceof v;
        final v<?> v = null;
        if (!b) {
            w0 = null;
        }
        final v<?> v2 = (v<?>)w0;
        v<?> v3 = v;
        if (v2 != null) {
            this.r(v2);
            v3 = v2;
        }
        return v3;
    }
    
    @e
    protected final r o() {
        return this.G;
    }
    
    @Override
    public final boolean offer(final E e) {
        final Object c = this.C(e);
        if (c == kotlinx.coroutines.channels.b.e) {
            return true;
        }
        if (c == kotlinx.coroutines.channels.b.f) {
            final v<?> n = this.n();
            if (n == null) {
                return false;
            }
            throw j0.p(this.s(e, n));
        }
        else {
            if (c instanceof v) {
                throw j0.p(this.s(e, (v<?>)c));
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("offerInternal returned ");
            sb.append(c);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x0.a(this));
        sb.append('@');
        sb.append(x0.b(this));
        sb.append('{');
        sb.append(this.q());
        sb.append('}');
        sb.append(this.j());
        return sb.toString();
    }
    
    protected abstract boolean w();
    
    protected abstract boolean x();
    
    protected final boolean y() {
        return !(this.G.v0() instanceof i0) && this.x();
    }
    
    @Override
    public boolean z() {
        return this.y();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0010\u001a\u00028\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017" }, d2 = { "kotlinx/coroutines/channels/c$a", "E", "Lkotlinx/coroutines/channels/k0;", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "Lkotlinx/coroutines/internal/k0;", "M0", "Lkotlin/j2;", "J0", "Lkotlinx/coroutines/channels/v;", "closed", "L0", "", "toString", "J", "Ljava/lang/Object;", "element", "", "K0", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a<E> extends k0
    {
        @d
        public final E J;
        
        public a(final E j) {
            this.J = j;
        }
        
        @Override
        public void J0() {
        }
        
        @f
        @Override
        public Object K0() {
            return this.J;
        }
        
        @Override
        public void L0(@org.jetbrains.annotations.e final v<?> v) {
            if (!kotlinx.coroutines.w0.b()) {
                return;
            }
            throw new AssertionError();
        }
        
        @f
        @Override
        public kotlinx.coroutines.internal.k0 M0(@f final t.d d) {
            final kotlinx.coroutines.internal.k0 d2 = q.d;
            if (d != null) {
                d.d();
            }
            return d2;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SendBuffered@");
            sb.append(x0.b(this));
            sb.append('(');
            sb.append(this.J);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000e" }, d2 = { "kotlinx/coroutines/channels/c$b", "E", "Lkotlinx/coroutines/internal/t$b;", "Lkotlinx/coroutines/channels/c$a;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lkotlinx/coroutines/internal/t;", "affected", "", "e", "Lkotlinx/coroutines/internal/r;", "queue", "element", "<init>", "(Lkotlinx/coroutines/internal/r;Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static class b<E> extends t.b<a<? extends E>>
    {
        public b(@org.jetbrains.annotations.e final r r, final E e) {
            super(r, (a<? extends E>)new a(e));
        }
        
        @f
        @Override
        protected Object e(@org.jetbrains.annotations.e t f) {
            if (!(f instanceof v)) {
                if (f instanceof i0) {
                    f = (t)kotlinx.coroutines.channels.b.f;
                }
                else {
                    f = null;
                }
            }
            return f;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BX\u0012\u0006\u0010\u001a\u001a\u00028\u0001\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\u0012(\u0010#\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u00028\u00018\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&" }, d2 = { "kotlinx/coroutines/channels/c$c", "E", "R", "Lkotlinx/coroutines/channels/k0;", "Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "Lkotlinx/coroutines/internal/k0;", "M0", "Lkotlin/j2;", "J0", "dispose", "Lkotlinx/coroutines/channels/v;", "closed", "L0", "N0", "", "toString", "Lkotlinx/coroutines/channels/c;", "K", "Lkotlinx/coroutines/channels/c;", "channel", "J", "Ljava/lang/Object;", "K0", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/selects/f;", "L", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/l0;", "Lkotlin/coroutines/d;", "", "block", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/c;Lkotlinx/coroutines/selects/f;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class c<E, R> extends k0 implements l1
    {
        private final E J;
        @d
        @org.jetbrains.annotations.e
        public final kotlinx.coroutines.channels.c<E> K;
        @d
        @org.jetbrains.annotations.e
        public final kotlinx.coroutines.selects.f<R> L;
        @d
        @org.jetbrains.annotations.e
        public final p<l0<? super E>, kotlin.coroutines.d<? super R>, Object> M;
        
        public c(final E j, @org.jetbrains.annotations.e final kotlinx.coroutines.channels.c<E> k, @org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> l, @org.jetbrains.annotations.e final p<? super l0<? super E>, ? super kotlin.coroutines.d<? super R>, ?> m) {
            this.J = j;
            this.K = k;
            this.L = (kotlinx.coroutines.selects.f<R>)l;
            this.M = (p<l0<? super E>, kotlin.coroutines.d<? super R>, Object>)m;
        }
        
        @Override
        public void J0() {
            a.e(this.M, this.K, this.L.w(), null, 4, null);
        }
        
        @Override
        public E K0() {
            return this.J;
        }
        
        @Override
        public void L0(@org.jetbrains.annotations.e final v<?> v) {
            if (this.L.l()) {
                this.L.J(v.R0());
            }
        }
        
        @f
        @Override
        public kotlinx.coroutines.internal.k0 M0(@f final t.d d) {
            return (kotlinx.coroutines.internal.k0)this.L.i(d);
        }
        
        @Override
        public void N0() {
            final n6.l<E, j2> h = this.K.H;
            if (h != null) {
                c0.b((n6.l<? super Object, j2>)h, this.K0(), this.L.w().getContext());
            }
        }
        
        @Override
        public void dispose() {
            if (!this.C0()) {
                return;
            }
            this.N0();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SendSelect@");
            sb.append(x0.b(this));
            sb.append('(');
            sb.append(this.K0());
            sb.append(")[");
            sb.append(this.K);
            sb.append(", ");
            sb.append(this.L);
            sb.append(']');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0016\u0010\u000e\u001a\u00028\u00018\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0013" }, d2 = { "kotlinx/coroutines/channels/c$d", "E", "Lkotlinx/coroutines/internal/t$e;", "Lkotlinx/coroutines/channels/i0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/t;", "affected", "", "e", "Lkotlinx/coroutines/internal/t$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Ljava/lang/Object;", "element", "Lkotlinx/coroutines/internal/r;", "queue", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/r;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    protected static final class d<E> extends e<i0<? super E>>
    {
        @m6.d
        public final E e;
        
        public d(final E e, @org.jetbrains.annotations.e final r r) {
            super(r);
            this.e = e;
        }
        
        @f
        @Override
        protected Object e(@org.jetbrains.annotations.e t f) {
            if (!(f instanceof v)) {
                if (!(f instanceof i0)) {
                    f = (t)b.f;
                }
                else {
                    f = null;
                }
            }
            return f;
        }
        
        @f
        @Override
        public Object j(@org.jetbrains.annotations.e final t.d d) {
            final t a = d.a;
            Objects.requireNonNull(a, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveOrClosed<E>");
            final kotlinx.coroutines.internal.k0 b0 = ((i0<E>)a).b0(this.e, d);
            if (b0 == null) {
                return u.a;
            }
            final Object b2 = c.b;
            if (b0 == b2) {
                return b2;
            }
            if (kotlinx.coroutines.w0.b() && b0 != q.d) {
                throw new AssertionError();
            }
            return null;
        }
    }
}
