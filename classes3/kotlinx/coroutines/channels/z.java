// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.selects.g;
import kotlinx.coroutines.internal.c;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.q;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.w0;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010.\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010,j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`-¢\u0006\u0004\b/\u00100J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014J\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0014R\u0016\u0010\u0018\u001a\u00020\u000f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001b8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u000f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010$\u001a\u00060 j\u0002`!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u000f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u000f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0017¨\u00061" }, d2 = { "Lkotlinx/coroutines/channels/z;", "E", "Lkotlinx/coroutines/channels/a;", "", "element", "Lkotlinx/coroutines/internal/w0;", "o0", "C", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "D", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "h0", "i0", "", "wasClosed", "Lkotlin/j2;", "d0", "Lkotlinx/coroutines/channels/g0;", "receive", "X", "w", "()Z", "isBufferAlwaysFull", "x", "isBufferFull", "", "j", "()Ljava/lang/String;", "bufferDebugString", "isEmpty", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "J", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "b0", "isBufferEmpty", "K", "Ljava/lang/Object;", "value", "a0", "isBufferAlwaysEmpty", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class z<E> extends a<E>
{
    private final ReentrantLock J;
    private Object K;
    
    public z(@org.jetbrains.annotations.f final l<? super E, j2> l) {
        super(l);
        this.J = new ReentrantLock();
        this.K = kotlinx.coroutines.channels.b.d;
    }
    
    private final w0 o0(final Object k) {
        final Object i = this.K;
        final k0 d = kotlinx.coroutines.channels.b.d;
        w0 d2 = null;
        if (i != d) {
            final n6.l<E, j2> h = (n6.l<E, j2>)super.H;
            if (h != null) {
                d2 = c0.d(h, i, null, 2, null);
            }
        }
        this.K = k;
        return d2;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Object C(final E e) {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            final v<?> n = this.n();
            if (n != null) {
                return n;
            }
            Label_0159: {
                if (this.K == kotlinx.coroutines.channels.b.d) {
                    k0 b0;
                    i0<E> i;
                    do {
                        i = this.J();
                        if (i == null) {
                            break Label_0159;
                        }
                        if (i instanceof v) {
                            kotlin.jvm.internal.k0.m((Object)i);
                            return i;
                        }
                        kotlin.jvm.internal.k0.m((Object)i);
                        b0 = i.b0(e, null);
                    } while (b0 == null);
                    if (kotlinx.coroutines.w0.b() && b0 != q.d) {
                        throw new AssertionError();
                    }
                    final j2 a = j2.a;
                    j.unlock();
                    kotlin.jvm.internal.k0.m((Object)i);
                    i.A(e);
                    kotlin.jvm.internal.k0.m((Object)i);
                    return i.j();
                }
            }
            final w0 o0 = this.o0(e);
            if (o0 == null) {
                return kotlinx.coroutines.channels.b.e;
            }
            throw o0;
        }
        finally {
            j.unlock();
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Object D(final E e, @org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<?> f) {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            final v<?> n = this.n();
            if (n != null) {
                return n;
            }
            if (this.K == kotlinx.coroutines.channels.b.d) {
                while (true) {
                    final kotlinx.coroutines.channels.c.d<E> h = this.h(e);
                    final Object m = f.M(h);
                    if (m == null) {
                        final i0<E> i0 = h.o();
                        final j2 a = j2.a;
                        j.unlock();
                        kotlin.jvm.internal.k0.m((Object)i0);
                        i0.A(e);
                        kotlin.jvm.internal.k0.m((Object)i0);
                        return i0.j();
                    }
                    if (m == kotlinx.coroutines.channels.b.f) {
                        break;
                    }
                    if (m == kotlinx.coroutines.internal.c.b) {
                        continue;
                    }
                    if (m != kotlinx.coroutines.selects.g.d() && !(m instanceof v)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("performAtomicTrySelect(describeTryOffer) returned ");
                        sb.append(m);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    return m;
                }
            }
            if (!f.l()) {
                return kotlinx.coroutines.selects.g.d();
            }
            final w0 o0 = this.o0(e);
            if (o0 == null) {
                return kotlinx.coroutines.channels.b.e;
            }
            throw o0;
        }
        finally {
            j.unlock();
        }
    }
    
    @Override
    protected boolean X(@org.jetbrains.annotations.e final g0<? super E> g0) {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            return super.X(g0);
        }
        finally {
            j.unlock();
        }
    }
    
    @Override
    protected final boolean a0() {
        return false;
    }
    
    @Override
    protected final boolean b0() {
        return this.K == kotlinx.coroutines.channels.b.d;
    }
    
    @Override
    protected void d0(final boolean b) {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            final w0 o0 = this.o0(b.d);
            final j2 a = j2.a;
            j.unlock();
            super.d0(b);
            if (o0 == null) {
                return;
            }
            throw o0;
        }
        finally {
            j.unlock();
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object h0() {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            final Object k = this.K;
            final k0 d = kotlinx.coroutines.channels.b.d;
            if (k == d) {
                Object o = this.n();
                if (o == null) {
                    o = kotlinx.coroutines.channels.b.g;
                }
                return o;
            }
            this.K = d;
            final j2 a = j2.a;
            return k;
        }
        finally {
            j.unlock();
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object i0(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<?> f) {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            final Object k = this.K;
            final k0 d = kotlinx.coroutines.channels.b.d;
            if (k == d) {
                Object o = this.n();
                if (o == null) {
                    o = kotlinx.coroutines.channels.b.g;
                }
                return o;
            }
            if (!f.l()) {
                return kotlinx.coroutines.selects.g.d();
            }
            final Object i = this.K;
            this.K = d;
            final j2 a = j2.a;
            return i;
        }
        finally {
            j.unlock();
        }
    }
    
    @Override
    public boolean isEmpty() {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            return this.c0();
        }
        finally {
            j.unlock();
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected String j() {
        final StringBuilder sb = new StringBuilder();
        sb.append("(value=");
        sb.append(this.K);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    protected final boolean w() {
        return false;
    }
    
    @Override
    protected final boolean x() {
        return false;
    }
}
