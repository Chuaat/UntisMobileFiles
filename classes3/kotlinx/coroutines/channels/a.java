// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.u;
import kotlin.b1$a;
import kotlinx.coroutines.internal.c0;
import kotlin.b1;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.q;
import java.util.ArrayList;
import kotlinx.coroutines.w0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.x0;
import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.t;
import kotlin.c1;
import java.util.Objects;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.selects.g;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.l1;
import kotlin.coroutines.d;
import n6.p;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007]^-0_`aB)\u0012 \u0010Z\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0014\u0018\u00010Xj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`Y¢\u0006\u0004\b[\u0010\\J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J\u001b\u0010\n\u001a\u0004\u0018\u00018\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJT\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0001\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2$\u0010\u0013\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0011H\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016JZ\u0010\u0018\u001a\u00020\u0014\"\u0004\b\u0001\u0010\f* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JT\u0010\u001a\u001a\u00020\u0006\"\u0004\b\u0001\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0013\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u00142\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0014J\u0016\u0010 \u001a\u0004\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010!\u001a\u00028\u0000H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00028\u0001\"\u0004\b\u0001\u0010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0014J\u0015\u0010&\u001a\u0004\u0018\u00018\u0000H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010\"J\"\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b)\u0010*J\u0012\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0007J\u0016\u00100\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/J\u0019\u00101\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0006H\u0014J/\u0010:\u001a\u00020\u00142\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\n\u00109\u001a\u0006\u0012\u0002\b\u000308H\u0014\u00f8\u0001\u0000\u00f8\u0001\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0086\u0002J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0004J\u0010\u0010A\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010@H\u0014J\b\u0010B\u001a\u00020\u0014H\u0014J\b\u0010C\u001a\u00020\u0014H\u0014R\u0016\u0010F\u001a\u00020\u00068$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u00068D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u001b\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000I8F@\u0006¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0019\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000I8F@\u0006¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0016\u0010O\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010ER\u0016\u0010Q\u001a\u00020\u00068D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\bP\u0010ER\"\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0I8F@\u0006\u00f8\u0001\u0000¢\u0006\u0006\u001a\u0004\bR\u0010KR\u0016\u0010U\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010ER\u0016\u0010W\u001a\u00020\u00068$@$X¤\u0004¢\u0006\u0006\u001a\u0004\bV\u0010E\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006b" }, d2 = { "Lkotlinx/coroutines/channels/a;", "E", "Lkotlinx/coroutines/channels/c;", "Lkotlinx/coroutines/channels/o;", "Lkotlinx/coroutines/channels/g0;", "receive", "", "V", "", "result", "j0", "(Ljava/lang/Object;)Ljava/lang/Object;", "R", "Lkotlinx/coroutines/selects/f;", "select", "", "receiveMode", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "Lkotlin/j2;", "l0", "(Lkotlinx/coroutines/selects/f;ILn6/p;)V", "value", "n0", "(Ln6/p;Lkotlinx/coroutines/selects/f;ILjava/lang/Object;)V", "Y", "(Lkotlinx/coroutines/selects/f;Ln6/p;I)Z", "Lkotlinx/coroutines/o;", "cont", "m0", "h0", "i0", "B", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "k0", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "X", "v", "Lkotlinx/coroutines/channels/r0;", "O", "poll", "()Ljava/lang/Object;", "", "cause", "c", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d", "S", "(Ljava/lang/Throwable;)Z", "wasClosed", "d0", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/channels/k0;", "list", "Lkotlinx/coroutines/channels/v;", "closed", "e0", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/v;)V", "Lkotlinx/coroutines/channels/q;", "iterator", "Lkotlinx/coroutines/channels/a$g;", "T", "Lkotlinx/coroutines/channels/i0;", "J", "g0", "f0", "a0", "()Z", "isBufferAlwaysEmpty", "c0", "isEmptyImpl", "Lkotlinx/coroutines/selects/d;", "p", "()Lkotlinx/coroutines/selects/d;", "onReceiveOrNull", "m", "onReceive", "isEmpty", "Z", "hasReceiveOrClosed", "M", "onReceiveOrClosed", "l", "isClosedForReceive", "b0", "isBufferEmpty", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Ln6/l;)V", "a", "b", "e", "f", "g", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public abstract class a<E> extends kotlinx.coroutines.channels.c<E> implements o<E>
{
    public a(@org.jetbrains.annotations.f final l<? super E, j2> l) {
        super(l);
    }
    
    private final boolean V(final g0<? super E> g0) {
        final boolean x = this.X(g0);
        if (x) {
            this.g0();
        }
        return x;
    }
    
    private final <R> boolean Y(final kotlinx.coroutines.selects.f<? super R> f, final p<Object, ? super kotlin.coroutines.d<? super R>, ?> p3, final int n) {
        final e<Object, Object> e = new e<Object, Object>((a<Object>)this, (kotlinx.coroutines.selects.f<? super Object>)f, p3, n);
        final boolean v = this.V((g0<? super E>)e);
        if (v) {
            f.d0(e);
        }
        return v;
    }
    
    private final E j0(final Object o) {
        if (!(o instanceof v)) {
            return (E)o;
        }
        final Throwable j = ((v)o).J;
        if (j == null) {
            return null;
        }
        throw j0.p(j);
    }
    
    private final <R> void l0(final kotlinx.coroutines.selects.f<? super R> f, final int n, final p<Object, ? super kotlin.coroutines.d<? super R>, ?> p3) {
        while (!f.s()) {
            if (this.c0()) {
                if (this.Y((kotlinx.coroutines.selects.f<? super Object>)f, (n6.p<Object, ? super kotlin.coroutines.d<? super Object>, ?>)p3, n)) {
                    return;
                }
                continue;
            }
            else {
                final Object i0 = this.i0(f);
                if (i0 == kotlinx.coroutines.selects.g.d()) {
                    return;
                }
                if (i0 == kotlinx.coroutines.channels.b.g) {
                    continue;
                }
                if (i0 == kotlinx.coroutines.internal.c.b) {
                    continue;
                }
                this.n0((n6.p<Object, ? super kotlin.coroutines.d<? super Object>, ?>)p3, (kotlinx.coroutines.selects.f<? super Object>)f, n, i0);
            }
        }
    }
    
    private final void m0(final kotlinx.coroutines.o<?> o, final g0<?> g0) {
        o.t((l<? super Throwable, j2>)new f(g0));
    }
    
    private final <R> void n0(final p<Object, ? super kotlin.coroutines.d<? super R>, ?> p4, final kotlinx.coroutines.selects.f<? super R> f, final int n, final Object o) {
        final boolean b = o instanceof v;
        r0<Object> a = null;
        Label_0071: {
            Object o2;
            if (b) {
                if (n == 0) {
                    throw j0.p(((v)o).Q0());
                }
                if (n != 1) {
                    if (n != 2) {
                        return;
                    }
                    if (!f.l()) {
                        return;
                    }
                    final r0.b b2 = r0.b;
                    o2 = new r0.a(((v)o).J);
                }
                else {
                    final v v = (v)o;
                    if (v.J != null) {
                        throw j0.p(v.Q0());
                    }
                    if (!f.l()) {
                        return;
                    }
                    a = null;
                    break Label_0071;
                }
            }
            else {
                if (n != 2) {
                    c7.b.d((n6.p<? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)p4, o, (kotlin.coroutines.d<? super Object>)f.w());
                    return;
                }
                final r0.b b3 = r0.b;
                o2 = o;
                if (b) {
                    o2 = new r0.a(((v)o).J);
                }
            }
            a = r0.a(r0.b(o2));
        }
        c7.b.d((n6.p<? super r0<Object>, ? super kotlin.coroutines.d<? super Object>, ?>)p4, a, (kotlin.coroutines.d<? super Object>)f.w());
    }
    
    @org.jetbrains.annotations.f
    @Override
    public final Object B(@org.jetbrains.annotations.e final kotlin.coroutines.d<? super E> d) {
        final Object h0 = this.h0();
        if (h0 != kotlinx.coroutines.channels.b.g && !(h0 instanceof v)) {
            return h0;
        }
        return this.k0(0, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected i0<E> J() {
        final i0<E> j = super.J();
        if (j != null && !(j instanceof v)) {
            this.f0();
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public final kotlinx.coroutines.selects.d<r0<E>> M() {
        return (kotlinx.coroutines.selects.d<r0<E>>)new kotlinx.coroutines.selects.d<r0<? extends E>>() {
            final /* synthetic */ a G;
            
            @Override
            public <R> void i(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> f, @org.jetbrains.annotations.e final p<? super r0<? extends E>, ? super d<? super R>, ?> obj) {
                final a g = this.G;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
                g.l0(f, 2, obj);
            }
        };
    }
    
    @org.jetbrains.annotations.f
    @Override
    public final Object O(@org.jetbrains.annotations.e final kotlin.coroutines.d<? super r0<? extends E>> d) {
        Object o = null;
        Label_0049: {
            if (d instanceof a$l) {
                final kotlin.coroutines.jvm.internal.d d2 = (a$l)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    o = d2;
                    break Label_0049;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ a I;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                    this.G = o;
                    this.H |= Integer.MIN_VALUE;
                    o = this.I.O((kotlin.coroutines.d<? super r0<? extends E>>)this);
                    if (o == kotlin.coroutines.intrinsics.b.h()) {
                        return o;
                    }
                    return r0.a(o);
                }
            };
        }
        final Object g = ((a$l)o).G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = ((a$l)o).H;
        Object k0;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(g);
            k0 = g;
        }
        else {
            c1.n(g);
            final Object h4 = this.h0();
            if (h4 != kotlinx.coroutines.channels.b.g) {
                Object o2;
                if (h4 instanceof v) {
                    final r0.b b = r0.b;
                    o2 = r0.b(new r0.a(((v)h4).J));
                }
                else {
                    final r0.b b2 = r0.b;
                    o2 = r0.b(h4);
                }
                return o2;
            }
            ((a$l)o).H = 1;
            if ((k0 = this.k0(2, (kotlin.coroutines.d<? super Object>)o)) == h2) {
                return h2;
            }
        }
        return ((r0)k0).n();
    }
    
    public final boolean S(@org.jetbrains.annotations.f final Throwable t) {
        final boolean i = this.I(t);
        this.d0(i);
        return i;
    }
    
    @org.jetbrains.annotations.e
    protected final g<E> T() {
        return new g<E>(this.o());
    }
    
    protected boolean X(@org.jetbrains.annotations.e final g0<? super E> g0) {
        final boolean a0 = this.a0();
        final boolean b = false;
        if (!a0) {
            final r o = this.o();
            final t.c c = new t.c() {
                final /* synthetic */ a e;
                
                @org.jetbrains.annotations.f
                public Object k(@e final t t) {
                    Object a;
                    if (this.e.b0()) {
                        a = null;
                    }
                    else {
                        a = s.a();
                    }
                    return a;
                }
            };
            while (true) {
                final t w0 = o.w0();
                if (!(w0 instanceof k0 ^ true)) {
                    break;
                }
                final int h0 = w0.H0(g0, o, (t.c)c);
                if (h0 == 1) {
                    return true;
                }
                final boolean b2 = b;
                if (h0 != 2) {
                    continue;
                }
                return b2;
            }
            return b;
        }
        final r o2 = this.o();
        t w2;
        do {
            w2 = o2.w0();
            if (!(w2 instanceof k0 ^ true)) {
                return b;
            }
        } while (!w2.n0(g0, o2));
        return true;
    }
    
    protected final boolean Z() {
        return this.o().v0() instanceof i0;
    }
    
    protected abstract boolean a0();
    
    protected abstract boolean b0();
    
    protected final boolean c0() {
        return !(this.o().v0() instanceof k0) && this.b0();
    }
    
    @Override
    public final void d(@org.jetbrains.annotations.f CancellationException ex) {
        if (this.l()) {
            return;
        }
        if (ex == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(x0.a(this));
            sb.append(" was cancelled");
            ex = new CancellationException(sb.toString());
        }
        this.S(ex);
    }
    
    protected void d0(final boolean b) {
        final v<?> n = this.n();
        if (n == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object o = kotlinx.coroutines.internal.o.c(null, 1, null);
        while (true) {
            final t w0 = n.w0();
            if (w0 instanceof r) {
                this.e0(o, n);
                return;
            }
            if (kotlinx.coroutines.w0.b() && !(w0 instanceof k0)) {
                throw new AssertionError();
            }
            if (!w0.C0()) {
                w0.x0();
            }
            else {
                o = kotlinx.coroutines.internal.o.h(o, (k0)w0);
            }
        }
    }
    
    protected void e0(@org.jetbrains.annotations.e final Object o, @org.jetbrains.annotations.e final v<?> v) {
        if (o != null) {
            if (!(o instanceof ArrayList)) {
                ((k0)o).L0(v);
            }
            else {
                final ArrayList list = (ArrayList)o;
                for (int i = list.size() - 1; i >= 0; --i) {
                    list.get(i).L0(v);
                }
            }
        }
    }
    
    protected void f0() {
    }
    
    protected void g0() {
    }
    
    @org.jetbrains.annotations.f
    protected Object h0() {
        while (true) {
            final k0 n = this.N();
            if (n == null) {
                return kotlinx.coroutines.channels.b.g;
            }
            final kotlinx.coroutines.internal.k0 m0 = n.M0(null);
            if (m0 != null) {
                if (w0.b() && m0 != q.d) {
                    throw new AssertionError();
                }
                n.J0();
                return n.K0();
            }
            else {
                n.N0();
            }
        }
    }
    
    @org.jetbrains.annotations.f
    protected Object i0(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<?> f) {
        final g<E> t = this.T();
        final Object m = f.M(t);
        if (m != null) {
            return m;
        }
        t.o().J0();
        return t.o().K0();
    }
    
    @Override
    public boolean isEmpty() {
        return this.c0();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public final kotlinx.coroutines.channels.q<E> iterator() {
        return new a<E>(this);
    }
    
    final /* synthetic */  <R> Object k0(final int n, final kotlin.coroutines.d<? super R> d) {
        final kotlinx.coroutines.p<Object> b = kotlinx.coroutines.r.b((kotlin.coroutines.d<? super Object>)kotlin.coroutines.intrinsics.b.d((kotlin.coroutines.d)d));
        t t;
        if (super.H == null) {
            Objects.requireNonNull(b, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
            t = new b<Object>(b, n);
        }
        else {
            Objects.requireNonNull(b, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
            t = new c<Object>(b, n, (n6.l<? super Object, j2>)super.H);
        }
        while (true) {
            while (!this.V((g0)t)) {
                final Object h0 = this.h0();
                if (h0 instanceof v) {
                    ((b)t).L0((v<?>)h0);
                }
                else {
                    if (h0 == kotlinx.coroutines.channels.b.g) {
                        continue;
                    }
                    b.Z(((b<kotlinx.coroutines.internal.k0>)t).M0((kotlinx.coroutines.internal.k0)h0), ((g0<kotlinx.coroutines.internal.k0>)t).K0((kotlinx.coroutines.internal.k0)h0));
                }
                final Object y = b.y();
                if (y == kotlin.coroutines.intrinsics.b.h()) {
                    h.c((kotlin.coroutines.d)d);
                }
                return y;
            }
            this.m0(b, (g0)t);
            continue;
        }
    }
    
    @Override
    public boolean l() {
        return this.k() != null && this.b0();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public final kotlinx.coroutines.selects.d<E> m() {
        return new kotlinx.coroutines.selects.d<E>() {
            final /* synthetic */ a G;
            
            @Override
            public <R> void i(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> f, @org.jetbrains.annotations.e final p<? super E, ? super d<? super R>, ?> obj) {
                final a g = this.G;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
                g.l0(f, 0, obj);
            }
        };
    }
    
    @org.jetbrains.annotations.e
    @Override
    public final kotlinx.coroutines.selects.d<E> p() {
        return new kotlinx.coroutines.selects.d<E>() {
            final /* synthetic */ a G;
            
            @Override
            public <R> void i(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> f, @org.jetbrains.annotations.e final p<? super E, ? super d<? super R>, ?> obj) {
                final a g = this.G;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
                g.l0(f, 1, obj);
            }
        };
    }
    
    @org.jetbrains.annotations.f
    @Override
    public final E poll() {
        final Object h0 = this.h0();
        E j0;
        if (h0 == kotlinx.coroutines.channels.b.g) {
            j0 = null;
        }
        else {
            j0 = this.j0(h0);
        }
        return j0;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public final Object v(@org.jetbrains.annotations.e final kotlin.coroutines.d<? super E> d) {
        final Object h0 = this.h0();
        if (h0 != kotlinx.coroutines.channels.b.g && !(h0 instanceof v)) {
            return h0;
        }
        return this.k0(1, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H\u0096B\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016" }, d2 = { "kotlinx/coroutines/channels/a$a", "E", "Lkotlinx/coroutines/channels/q;", "", "result", "", "d", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "e", "next", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/a;", "b", "Lkotlinx/coroutines/channels/a;", "channel", "Ljava/lang/Object;", "c", "f", "(Ljava/lang/Object;)V", "<init>", "(Lkotlinx/coroutines/channels/a;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class a<E> implements q<E>
    {
        @org.jetbrains.annotations.f
        private Object a;
        @m6.d
        @org.jetbrains.annotations.e
        public final kotlinx.coroutines.channels.a<E> b;
        
        public a(@org.jetbrains.annotations.e final kotlinx.coroutines.channels.a<E> b) {
            this.b = b;
            this.a = kotlinx.coroutines.channels.b.g;
        }
        
        private final boolean d(final Object o) {
            if (!(o instanceof v)) {
                return true;
            }
            final v v = (v)o;
            if (v.J == null) {
                return false;
            }
            throw j0.p(v.Q0());
        }
        
        @org.jetbrains.annotations.f
        @Override
        public Object a(@org.jetbrains.annotations.e final kotlin.coroutines.d<? super Boolean> d) {
            final Object a = this.a;
            final kotlinx.coroutines.internal.k0 g = kotlinx.coroutines.channels.b.g;
            Object o;
            if (a != g) {
                o = a;
            }
            else {
                final Object h0 = this.b.h0();
                if ((this.a = h0) == g) {
                    return this.e(d);
                }
                o = h0;
            }
            return kotlin.coroutines.jvm.internal.b.a(this.d(o));
        }
        
        @org.jetbrains.annotations.f
        public final Object c() {
            return this.a;
        }
        
        final /* synthetic */ Object e(final kotlin.coroutines.d<? super Boolean> d) {
            final kotlinx.coroutines.p<Object> b = kotlinx.coroutines.r.b((kotlin.coroutines.d<? super Object>)kotlin.coroutines.intrinsics.b.d((kotlin.coroutines.d)d));
            final d d2 = new d((a)this, b);
            while (true) {
                while (!((kotlinx.coroutines.channels.a<Object>)this.b).V(d2)) {
                    final Object h0 = this.b.h0();
                    this.f(h0);
                    if (h0 instanceof v) {
                        final v v = (v)h0;
                        Object o;
                        if (v.J == null) {
                            o = kotlin.coroutines.jvm.internal.b.a(false);
                            final b1$a h2 = b1.H;
                        }
                        else {
                            final Throwable q0 = v.Q0();
                            final b1$a h3 = b1.H;
                            o = c1.a(q0);
                        }
                        ((kotlin.coroutines.d)b).resumeWith(b1.b(o));
                    }
                    else {
                        if (h0 == kotlinx.coroutines.channels.b.g) {
                            continue;
                        }
                        final Boolean a = kotlin.coroutines.jvm.internal.b.a(true);
                        final n6.l<E, j2> h4 = this.b.H;
                        l<? super Throwable, j2> a2;
                        if (h4 != null) {
                            a2 = c0.a((n6.l<? super kotlinx.coroutines.internal.k0, j2>)h4, (kotlinx.coroutines.internal.k0)h0, ((kotlin.coroutines.d)b).getContext());
                        }
                        else {
                            a2 = null;
                        }
                        b.Z(a, a2);
                    }
                    final Object y = b.y();
                    if (y == kotlin.coroutines.intrinsics.b.h()) {
                        h.c((kotlin.coroutines.d)d);
                    }
                    return y;
                }
                ((kotlinx.coroutines.channels.a<Object>)this.b).m0(b, d2);
                continue;
            }
        }
        
        public final void f(@org.jetbrains.annotations.f final Object a) {
            this.a = a;
        }
        
        @Override
        public E next() {
            final Object a = this.a;
            if (a instanceof v) {
                throw j0.p(((v)a).Q0());
            }
            final kotlinx.coroutines.internal.k0 g = kotlinx.coroutines.channels.b.g;
            if (a != g) {
                this.a = g;
                return (E)a;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e" }, d2 = { "kotlinx/coroutines/channels/a$b", "E", "Lkotlinx/coroutines/channels/g0;", "value", "", "M0", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "Lkotlinx/coroutines/internal/k0;", "b0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/t$d;)Lkotlinx/coroutines/internal/k0;", "Lkotlin/j2;", "A", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/v;", "closed", "L0", "", "toString", "Lkotlinx/coroutines/o;", "J", "Lkotlinx/coroutines/o;", "cont", "", "K", "I", "receiveMode", "<init>", "(Lkotlinx/coroutines/o;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static class b<E> extends g0<E>
    {
        @m6.d
        @e
        public final kotlinx.coroutines.o<Object> J;
        @m6.d
        public final int K;
        
        public b(@e final kotlinx.coroutines.o<Object> j, final int k) {
            this.J = j;
            this.K = k;
        }
        
        @Override
        public void A(final E e) {
            this.J.f0(q.d);
        }
        
        @Override
        public void L0(@e final v<?> v) {
            final int k = this.K;
            if (k == 1 && v.J == null) {
                final kotlinx.coroutines.o<Object> j = this.J;
                final b1$a h = b1.H;
                ((d)j).resumeWith(b1.b((Object)null));
            }
            else {
                Object o;
                Object a2;
                if (k == 2) {
                    final kotlinx.coroutines.o<Object> i = this.J;
                    final r0.b b = r0.b;
                    final r0<Object> a = r0.a(r0.b(new r0.a(v.J)));
                    final b1$a h2 = b1.H;
                    o = i;
                    a2 = a;
                }
                else {
                    final kotlinx.coroutines.o<Object> l = this.J;
                    final Throwable q0 = v.Q0();
                    final b1$a h3 = b1.H;
                    a2 = c1.a(q0);
                    o = l;
                }
                ((d)o).resumeWith(b1.b(a2));
            }
        }
        
        @org.jetbrains.annotations.f
        public final Object M0(E a) {
            if (this.K == 2) {
                final r0.b b = r0.b;
                a = (E)r0.a(r0.b(a));
            }
            return a;
        }
        
        @org.jetbrains.annotations.f
        @Override
        public kotlinx.coroutines.internal.k0 b0(final E e, @org.jetbrains.annotations.f final t.d d) {
            final kotlinx.coroutines.o<Object> j = this.J;
            final Object m0 = this.M0(e);
            t.a c;
            if (d != null) {
                c = d.c;
            }
            else {
                c = null;
            }
            final Object s = j.S(m0, c, this.K0(e));
            if (s == null) {
                return null;
            }
            if (w0.b() && s != q.d) {
                throw new AssertionError();
            }
            if (d != null) {
                d.d();
            }
            return q.d;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ReceiveElement@");
            sb.append(x0.b(this));
            sb.append("[receiveMode=");
            sb.append(this.K);
            sb.append(']');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0012" }, d2 = { "kotlinx/coroutines/channels/a$c", "E", "Lkotlinx/coroutines/channels/a$b;", "value", "Lkotlin/Function1;", "", "Lkotlin/j2;", "K0", "(Ljava/lang/Object;)Ln6/l;", "Lkotlinx/coroutines/o;", "", "cont", "", "receiveMode", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlinx/coroutines/o;ILn6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class c<E> extends b<E>
    {
        @m6.d
        @e
        public final l<E, j2> L;
        
        public c(@e final kotlinx.coroutines.o<Object> o, final int n, @e final l<? super E, j2> l) {
            super(o, n);
            this.L = (l<E, j2>)l;
        }
        
        @org.jetbrains.annotations.f
        @Override
        public l<Throwable, j2> K0(final E e) {
            return c0.a(this.L, e, ((d)super.J).getContext());
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "kotlinx/coroutines/channels/a$d", "E", "Lkotlinx/coroutines/channels/g0;", "value", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "Lkotlinx/coroutines/internal/k0;", "b0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/t$d;)Lkotlinx/coroutines/internal/k0;", "Lkotlin/j2;", "A", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/v;", "closed", "L0", "Lkotlin/Function1;", "", "K0", "(Ljava/lang/Object;)Ln6/l;", "", "toString", "Lkotlinx/coroutines/o;", "", "K", "Lkotlinx/coroutines/o;", "cont", "Lkotlinx/coroutines/channels/a$a;", "J", "Lkotlinx/coroutines/channels/a$a;", "iterator", "<init>", "(Lkotlinx/coroutines/channels/a$a;Lkotlinx/coroutines/o;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static class d<E> extends g0<E>
    {
        @m6.d
        @e
        public final a<E> J;
        @m6.d
        @e
        public final kotlinx.coroutines.o<Boolean> K;
        
        public d(@e final a<E> j, @e final kotlinx.coroutines.o<? super Boolean> k) {
            this.J = j;
            this.K = (kotlinx.coroutines.o<Boolean>)k;
        }
        
        @Override
        public void A(final E e) {
            this.J.f(e);
            this.K.f0(q.d);
        }
        
        @org.jetbrains.annotations.f
        @Override
        public l<Throwable, j2> K0(final E e) {
            final n6.l<E, j2> h = this.J.b.H;
            l<Throwable, j2> a;
            if (h != null) {
                a = c0.a(h, e, ((kotlin.coroutines.d)this.K).getContext());
            }
            else {
                a = null;
            }
            return a;
        }
        
        @Override
        public void L0(@e final v<?> v) {
            Object o;
            if (v.J == null) {
                o = kotlinx.coroutines.o.a.b(this.K, Boolean.FALSE, null, 2, null);
            }
            else {
                o = this.K.D(v.Q0());
            }
            if (o != null) {
                this.J.f(v);
                this.K.f0(o);
            }
        }
        
        @org.jetbrains.annotations.f
        @Override
        public kotlinx.coroutines.internal.k0 b0(final E e, @org.jetbrains.annotations.f final t.d d) {
            final kotlinx.coroutines.o<Boolean> k = this.K;
            final Boolean true = Boolean.TRUE;
            t.a c;
            if (d != null) {
                c = d.c;
            }
            else {
                c = null;
            }
            final Object s = k.S(true, c, this.K0(e));
            if (s == null) {
                return null;
            }
            if (w0.b() && s != q.d) {
                throw new AssertionError();
            }
            if (d != null) {
                d.d();
            }
            return q.d;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ReceiveHasNext@");
            sb.append(x0.b(this));
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00020 \u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012$\u0010'\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&\u0012\u0006\u0012\u0004\u0018\u00010%0$\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010)J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00020 8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*" }, d2 = { "kotlinx/coroutines/channels/a$e", "R", "E", "Lkotlinx/coroutines/channels/g0;", "Lkotlinx/coroutines/l1;", "value", "Lkotlinx/coroutines/internal/t$d;", "otherOp", "Lkotlinx/coroutines/internal/k0;", "b0", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/t$d;)Lkotlinx/coroutines/internal/k0;", "Lkotlin/j2;", "A", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/v;", "closed", "L0", "dispose", "Lkotlin/Function1;", "", "K0", "(Ljava/lang/Object;)Ln6/l;", "", "toString", "", "M", "I", "receiveMode", "Lkotlinx/coroutines/selects/f;", "K", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlinx/coroutines/channels/a;", "J", "Lkotlinx/coroutines/channels/a;", "channel", "Lkotlin/Function2;", "", "Lkotlin/coroutines/d;", "block", "<init>", "(Lkotlinx/coroutines/channels/a;Lkotlinx/coroutines/selects/f;Ln6/p;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class e<R, E> extends g0<E> implements l1
    {
        @m6.d
        @org.jetbrains.annotations.e
        public final a<E> J;
        @m6.d
        @org.jetbrains.annotations.e
        public final kotlinx.coroutines.selects.f<R> K;
        @m6.d
        @org.jetbrains.annotations.e
        public final p<Object, d<? super R>, Object> L;
        @m6.d
        public final int M;
        
        public e(@org.jetbrains.annotations.e final a<E> j, @org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<? super R> k, @org.jetbrains.annotations.e final p<Object, ? super d<? super R>, ?> l, final int m) {
            this.J = j;
            this.K = (kotlinx.coroutines.selects.f<R>)k;
            this.L = (p<Object, d<? super R>, Object>)l;
            this.M = m;
        }
        
        @Override
        public void A(final E e) {
            final p<Object, d<? super R>, Object> l = this.L;
            Object a;
            if (this.M == 2) {
                final r0.b b = r0.b;
                a = r0.a(r0.b(e));
            }
            else {
                a = e;
            }
            c7.a.d((n6.p<? super r0, ? super d<? super Object>, ?>)l, (r0)a, (d<? super Object>)this.K.w(), (l<? super Throwable, j2>)this.K0(e));
        }
        
        @org.jetbrains.annotations.f
        @Override
        public l<Throwable, j2> K0(final E e) {
            final n6.l<E, j2> h = this.J.H;
            l<Throwable, j2> a;
            if (h != null) {
                a = c0.a(h, e, this.K.w().getContext());
            }
            else {
                a = null;
            }
            return a;
        }
        
        @Override
        public void L0(@org.jetbrains.annotations.e final v<?> v) {
            if (!this.K.l()) {
                return;
            }
            final int m = this.M;
            if (m != 0) {
                if (m != 1) {
                    if (m != 2) {
                        return;
                    }
                    final p<Object, d<? super R>, Object> l = this.L;
                    final r0.b b = r0.b;
                    a.e(l, r0.a(r0.b(new r0.a(v.J))), this.K.w(), null, 4, null);
                    return;
                }
                else if (v.J == null) {
                    a.e(this.L, null, this.K.w(), null, 4, null);
                    return;
                }
            }
            this.K.J(v.Q0());
        }
        
        @org.jetbrains.annotations.f
        @Override
        public kotlinx.coroutines.internal.k0 b0(final E e, @org.jetbrains.annotations.f final t.d d) {
            return (kotlinx.coroutines.internal.k0)this.K.i(d);
        }
        
        @Override
        public void dispose() {
            if (this.C0()) {
                this.J.f0();
            }
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ReceiveSelect@");
            sb.append(x0.b(this));
            sb.append('[');
            sb.append(this.K);
            sb.append(",receiveMode=");
            sb.append(this.M);
            sb.append(']');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "kotlinx/coroutines/channels/a$f", "Lkotlinx/coroutines/e;", "", "cause", "Lkotlin/j2;", "a", "", "toString", "Lkotlinx/coroutines/channels/g0;", "G", "Lkotlinx/coroutines/channels/g0;", "receive", "<init>", "(Lkotlinx/coroutines/channels/a;Lkotlinx/coroutines/channels/g0;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class f extends kotlinx.coroutines.e
    {
        private final g0<?> G;
        
        public f(final g0<?> g) {
            this.G = g;
        }
        
        @Override
        public void a(@org.jetbrains.annotations.f final Throwable t) {
            if (this.G.C0()) {
                a.this.f0();
            }
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("RemoveReceiveOnCancel[");
            sb.append(this.G);
            sb.append(']');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013" }, d2 = { "kotlinx/coroutines/channels/a$g", "E", "Lkotlinx/coroutines/internal/t$e;", "Lkotlinx/coroutines/channels/k0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/t;", "affected", "", "e", "Lkotlinx/coroutines/internal/t$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "Lkotlin/j2;", "k", "Lkotlinx/coroutines/internal/r;", "queue", "<init>", "(Lkotlinx/coroutines/internal/r;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    protected static final class g<E> extends t.e<k0>
    {
        public g(@e final r r) {
            super(r);
        }
        
        @org.jetbrains.annotations.f
        @Override
        protected Object e(@e t g) {
            if (!(g instanceof v)) {
                if (!(g instanceof k0)) {
                    g = (t)b.g;
                }
                else {
                    g = null;
                }
            }
            return g;
        }
        
        @org.jetbrains.annotations.f
        @Override
        public Object j(@e final t.d d) {
            final t a = d.a;
            Objects.requireNonNull(a, "null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
            final kotlinx.coroutines.internal.k0 m0 = ((k0)a).M0(d);
            if (m0 == null) {
                return kotlinx.coroutines.internal.u.a;
            }
            final Object b = kotlinx.coroutines.internal.c.b;
            if (m0 == b) {
                return b;
            }
            if (w0.b() && m0 != q.d) {
                throw new AssertionError();
            }
            return null;
        }
        
        @Override
        public void k(@e final t obj) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
            ((k0)obj).N0();
        }
    }
}
