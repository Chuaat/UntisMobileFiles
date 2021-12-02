// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.selects.g;
import kotlinx.coroutines.internal.c;
import kotlinx.coroutines.q;
import kotlinx.coroutines.internal.t;
import kotlin.h0;
import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.w0;
import kotlin.collections.m;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020<\u0012 \u0010K\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010Ij\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`J¢\u0006\u0004\bL\u0010MJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001fH\u0014¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u001f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u001e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u001f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0016\u00104\u001a\u00020\u001f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b3\u0010)R\u001a\u00109\u001a\u000605j\u0002`68\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010)R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010)R\u0016\u0010B\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010&R\u0016\u0010F\u001a\u00020C8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u001f8D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\bG\u0010)¨\u0006N" }, d2 = { "Lkotlinx/coroutines/channels/i;", "E", "Lkotlinx/coroutines/channels/a;", "", "currentSize", "Lkotlinx/coroutines/internal/k0;", "q0", "(I)Lkotlinx/coroutines/internal/k0;", "element", "Lkotlin/j2;", "o0", "(ILjava/lang/Object;)V", "p0", "(I)V", "", "C", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "D", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/k0;", "send", "i", "(Lkotlinx/coroutines/channels/k0;)Ljava/lang/Object;", "h0", "()Ljava/lang/Object;", "i0", "(Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/g0;", "receive", "", "X", "(Lkotlinx/coroutines/channels/g0;)Z", "wasClosed", "d0", "(Z)V", "L", "I", "head", "x", "()Z", "isBufferFull", "l", "isClosedForReceive", "", "K", "[Ljava/lang/Object;", "buffer", "a0", "isBufferAlwaysEmpty", "w", "isBufferAlwaysFull", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "J", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "z", "isFull", "Lkotlinx/coroutines/channels/n;", "N", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "isEmpty", "M", "capacity", "", "j", "()Ljava/lang/String;", "bufferDebugString", "b0", "isBufferEmpty", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/n;Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public class i<E> extends a<E>
{
    private final ReentrantLock J;
    private Object[] K;
    private int L;
    private final int M;
    private final n N;
    private volatile /* synthetic */ int size;
    
    public i(final int i, @org.jetbrains.annotations.e final n n, @org.jetbrains.annotations.f final l<? super E, j2> l) {
        super(l);
        this.M = i;
        this.N = n;
        boolean b = true;
        if (i < 1) {
            b = false;
        }
        if (b) {
            this.J = new ReentrantLock();
            final Object[] k = new Object[Math.min(i, 8)];
            m.w2(k, (Object)kotlinx.coroutines.channels.b.d, 0, 0, 6, (Object)null);
            final j2 a = j2.a;
            this.K = k;
            this.size = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ArrayChannel capacity must be at least 1, but ");
        sb.append(i);
        sb.append(" was specified");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final void o0(final int n, final E e) {
        if (n < this.M) {
            this.p0(n);
            final Object[] k = this.K;
            k[(this.L + n) % k.length] = e;
        }
        else {
            if (w0.b() && this.N != n.H) {
                throw new AssertionError();
            }
            final Object[] i = this.K;
            final int l = this.L;
            i[l % i.length] = null;
            i[(n + l) % i.length] = e;
            this.L = (l + 1) % i.length;
        }
    }
    
    private final void p0(final int n) {
        final Object[] k = this.K;
        if (n >= k.length) {
            final int min = Math.min(k.length * 2, this.M);
            final Object[] i = new Object[min];
            for (int j = 0; j < n; ++j) {
                final Object[] l = this.K;
                i[j] = l[(this.L + j) % l.length];
            }
            m.n2(i, (Object)kotlinx.coroutines.channels.b.d, n, min);
            this.K = i;
            this.L = 0;
        }
    }
    
    private final k0 q0(int n) {
        final int m = this.M;
        k0 k0 = null;
        if (n < m) {
            this.size = n + 1;
            return null;
        }
        n = h.a[this.N.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new kotlin.h0();
                }
            }
            else {
                k0 = kotlinx.coroutines.channels.b.e;
            }
        }
        else {
            k0 = kotlinx.coroutines.channels.b.f;
        }
        return k0;
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Object C(final E e) {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            final int size = this.size;
            final v<?> n = this.n();
            if (n != null) {
                return n;
            }
            final k0 q0 = this.q0(size);
            if (q0 != null) {
                return q0;
            }
            Label_0203: {
                if (size == 0) {
                    k0 b0;
                    i0<E> i;
                    do {
                        i = this.J();
                        if (i == null) {
                            break Label_0203;
                        }
                        if (i instanceof v) {
                            this.size = size;
                            kotlin.jvm.internal.k0.m((Object)i);
                            return i;
                        }
                        kotlin.jvm.internal.k0.m((Object)i);
                        b0 = i.b0(e, null);
                    } while (b0 == null);
                    if (w0.b() && b0 != q.d) {
                        throw new AssertionError();
                    }
                    this.size = size;
                    final j2 a = j2.a;
                    j.unlock();
                    kotlin.jvm.internal.k0.m((Object)i);
                    i.A(e);
                    kotlin.jvm.internal.k0.m((Object)i);
                    return i.j();
                }
            }
            this.o0(size, e);
            return kotlinx.coroutines.channels.b.e;
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
            final int size = this.size;
            final v<?> n = this.n();
            if (n != null) {
                return n;
            }
            final k0 q0 = this.q0(size);
            if (q0 != null) {
                return q0;
            }
            if (size == 0) {
                while (true) {
                    final kotlinx.coroutines.channels.c.d<E> h = this.h(e);
                    final Object m = f.M(h);
                    if (m == null) {
                        this.size = size;
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
                    this.size = size;
                    return m;
                }
            }
            if (!f.l()) {
                this.size = size;
                return kotlinx.coroutines.selects.g.d();
            }
            this.o0(size, e);
            return kotlinx.coroutines.channels.b.e;
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
        return this.size == 0;
    }
    
    @Override
    protected void d0(final boolean b) {
        final n6.l<E, j2> h = (n6.l<E, j2>)super.H;
        final ReentrantLock j = this.J;
        j.lock();
        try {
            final int size = this.size;
            kotlinx.coroutines.internal.w0 w0 = null;
            kotlinx.coroutines.internal.w0 c;
            for (int i = 0; i < size; ++i, w0 = c) {
                final Object o = this.K[this.L];
                c = w0;
                if (h != null) {
                    c = w0;
                    if (o != b.d) {
                        c = c0.c((n6.l<? super k0, j2>)h, (k0)o, w0);
                    }
                }
                final Object[] k = this.K;
                final int l = this.L;
                k[l] = b.d;
                this.L = (l + 1) % k.length;
            }
            this.size = 0;
            final j2 a = j2.a;
            j.unlock();
            super.d0(b);
            if (w0 == null) {
                return;
            }
            throw w0;
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
            final int size = this.size;
            if (size == 0) {
                Object o = this.n();
                if (o == null) {
                    o = kotlinx.coroutines.channels.b.g;
                }
                return o;
            }
            final Object[] k = this.K;
            final int l = this.L;
            final Object o2 = k[l];
            kotlinx.coroutines.channels.k0 k2 = null;
            k[l] = null;
            this.size = size - 1;
            final k0 g = kotlinx.coroutines.channels.b.g;
            final int m = this.M;
            final boolean b = false;
            final int n = 0;
            k0 k3 = g;
            int n2 = b ? 1 : 0;
            if (size == m) {
                k2 = null;
                while (true) {
                    final kotlinx.coroutines.channels.k0 n3 = this.N();
                    if (n3 == null) {
                        n2 = (b ? 1 : 0);
                        k3 = g;
                        break;
                    }
                    kotlin.jvm.internal.k0.m((Object)n3);
                    final k0 m2 = n3.M0(null);
                    if (m2 != null) {
                        if (w0.b()) {
                            int n4 = n;
                            if (m2 == q.d) {
                                n4 = 1;
                            }
                            if (n4 == 0) {
                                throw new AssertionError();
                            }
                        }
                        kotlin.jvm.internal.k0.m((Object)n3);
                        final Object k4 = n3.K0();
                        k2 = n3;
                        n2 = 1;
                        k3 = (k0)k4;
                        break;
                    }
                    kotlin.jvm.internal.k0.m((Object)n3);
                    n3.N0();
                    k2 = n3;
                }
            }
            if (k3 != kotlinx.coroutines.channels.b.g && !(k3 instanceof v)) {
                this.size = size;
                final Object[] i = this.K;
                i[(this.L + size) % i.length] = k3;
            }
            this.L = (this.L + 1) % this.K.length;
            final j2 a = j2.a;
            j.unlock();
            if (n2 != 0) {
                kotlin.jvm.internal.k0.m((Object)k2);
                k2.J0();
            }
            return o2;
        }
        finally {
            j.unlock();
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    protected Object i(@org.jetbrains.annotations.e final kotlinx.coroutines.channels.k0 k0) {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            return super.i(k0);
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
            final int size = this.size;
            if (size == 0) {
                Object o = this.n();
                if (o == null) {
                    o = kotlinx.coroutines.channels.b.g;
                }
                return o;
            }
            final Object[] k = this.K;
            final int l = this.L;
            final Object o2 = k[l];
            kotlinx.coroutines.channels.k0 k2 = null;
            k[l] = null;
            this.size = size - 1;
            final k0 g = kotlinx.coroutines.channels.b.g;
            Object obj = null;
            boolean b = false;
            Label_0265: {
                Label_0258: {
                    if (size == this.M) {
                        while (true) {
                            final g<E> t = this.T();
                            obj = f.M(t);
                            if (obj == null) {
                                k2 = t.o();
                                kotlin.jvm.internal.k0.m((Object)k2);
                                obj = k2.K0();
                                break;
                            }
                            if (obj == kotlinx.coroutines.channels.b.g) {
                                break Label_0258;
                            }
                            if (obj == kotlinx.coroutines.internal.c.b) {
                                continue;
                            }
                            if (obj == kotlinx.coroutines.selects.g.d()) {
                                this.size = size;
                                this.K[this.L] = o2;
                                return obj;
                            }
                            if (obj instanceof v) {
                                k2 = (kotlinx.coroutines.channels.k0)obj;
                                break;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("performAtomicTrySelect(describeTryOffer) returned ");
                            sb.append(obj);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                        b = true;
                        break Label_0265;
                    }
                }
                b = false;
                obj = g;
            }
            if (obj != kotlinx.coroutines.channels.b.g && !(obj instanceof v)) {
                this.size = size;
                final Object[] i = this.K;
                i[(this.L + size) % i.length] = obj;
            }
            else if (!f.l()) {
                this.size = size;
                this.K[this.L] = o2;
                return kotlinx.coroutines.selects.g.d();
            }
            this.L = (this.L + 1) % this.K.length;
            final j2 a = j2.a;
            j.unlock();
            if (b) {
                kotlin.jvm.internal.k0.m((Object)k2);
                k2.J0();
            }
            return o2;
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
        sb.append("(buffer:capacity=");
        sb.append(this.M);
        sb.append(",size=");
        sb.append(this.size);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public boolean l() {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            return super.l();
        }
        finally {
            j.unlock();
        }
    }
    
    @Override
    protected final boolean w() {
        return false;
    }
    
    @Override
    protected final boolean x() {
        return this.size == this.M && this.N == n.G;
    }
    
    @Override
    public boolean z() {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            return this.y();
        }
        finally {
            j.unlock();
        }
    }
}
