// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import kotlinx.coroutines.selects.f;
import kotlin.j2;
import kotlinx.coroutines.q;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.internal.t;
import kotlin.jvm.internal.k0;
import kotlin.ranges.o;
import java.util.Iterator;
import kotlinx.coroutines.internal.e;
import n6.l;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001PB\u000f\u0012\u0006\u0010A\u001a\u000200¢\u0006\u0004\bO\u00104J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001e\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00028\u0000H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020!2\u0006\u0010 \u001a\u00028\u00002\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$H\u0014¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R$\u0010/\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010.R$\u00105\u001a\u0002002\u0006\u0010+\u001a\u0002008B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010>\u001a\u00060:j\u0002`;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0019\u0010A\u001a\u0002008\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010\u001a\u001a\u0004\b@\u00102R$\u0010D\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010.R\u0016\u0010F\u001a\u00020\u00068T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\bE\u0010)R\u0016\u0010J\u001a\u00020G8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR2\u0010N\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0Kj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f`L8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010M¨\u0006Q" }, d2 = { "Lkotlinx/coroutines/channels/g;", "E", "Lkotlinx/coroutines/channels/c;", "Lkotlinx/coroutines/channels/j;", "", "cause", "", "S", "(Ljava/lang/Throwable;)Z", "Lkotlin/j2;", "T", "()V", "Lkotlinx/coroutines/channels/g$a;", "addSub", "removeSub", "f0", "(Lkotlinx/coroutines/channels/g$a;Lkotlinx/coroutines/channels/g$a;)V", "", "V", "()J", "index", "X", "(J)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/h0;", "L", "()Lkotlinx/coroutines/channels/h0;", "I", "c", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "C", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "select", "D", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "w", "()Z", "isBufferAlwaysFull", "value", "Z", "c0", "(J)V", "head", "", "a0", "()I", "d0", "(I)V", "size", "", "K", "[Ljava/lang/Object;", "buffer", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "J", "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "M", "Y", "capacity", "b0", "e0", "tail", "x", "isBufferFull", "", "j", "()Ljava/lang/String;", "bufferDebugString", "", "Lkotlinx/coroutines/internal/SubscribersList;", "Ljava/util/List;", "subscribers", "<init>", "a", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class g<E> extends c<E> implements j<E>
{
    private final ReentrantLock J;
    private final Object[] K;
    private final List<a<E>> L;
    private final int M;
    private volatile /* synthetic */ long _head;
    private volatile /* synthetic */ int _size;
    private volatile /* synthetic */ long _tail;
    
    public g(final int n) {
        super(null);
        this.M = n;
        boolean b = true;
        if (n < 1) {
            b = false;
        }
        if (b) {
            this.J = new ReentrantLock();
            this.K = new Object[n];
            this._head = 0L;
            this._tail = 0L;
            this._size = 0;
            this.L = e.d();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ArrayBroadcastChannel capacity must be at least 1, but ");
        sb.append(n);
        sb.append(" was specified");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final boolean S(final Throwable t) {
        final boolean i = this.I(t);
        final Iterator<a<E>> iterator = this.L.iterator();
        while (iterator.hasNext()) {
            iterator.next().S(t);
        }
        return i;
    }
    
    private final void T() {
        final Iterator<a<E>> iterator = this.L.iterator();
        boolean b = false;
        boolean b2 = false;
        while (iterator.hasNext()) {
            if (iterator.next().o0()) {
                b = true;
            }
            b2 = true;
        }
        if (b || !b2) {
            g0(this, null, null, 3, null);
        }
    }
    
    private final long V() {
        final Iterator<a<E>> iterator = this.L.iterator();
        long v = Long.MAX_VALUE;
        while (iterator.hasNext()) {
            v = o.v(v, iterator.next().p0());
        }
        return v;
    }
    
    private final E X(final long n) {
        return (E)this.K[(int)(n % this.M)];
    }
    
    private final long Z() {
        return this._head;
    }
    
    private final int a0() {
        return this._size;
    }
    
    private final long b0() {
        return this._tail;
    }
    
    private final void c0(final long head) {
        this._head = head;
    }
    
    private final void d0(final int size) {
        this._size = size;
    }
    
    private final void e0(final long tail) {
        this._tail = tail;
    }
    
    private final void f0(a<E> a, a<E> a2) {
    Label_0000:
        while (true) {
            final ReentrantLock j = this.J;
            j.lock();
            Label_0061: {
                if (a != null) {
                    Label_0393: {
                        try {
                            a.s0(this.b0());
                            final boolean empty = this.L.isEmpty();
                            this.L.add(a);
                            if (!empty) {
                                j.unlock();
                                return;
                            }
                        }
                        finally {
                            break Label_0393;
                        }
                        break Label_0061;
                    }
                    j.unlock();
                }
            }
            if (a2 != null) {
                this.L.remove(a2);
                if (this.Z() != a2.p0()) {
                    j.unlock();
                    return;
                }
            }
            final long v = this.V();
            final long b0 = this.b0();
            long z = this.Z();
            final long v2 = o.v(v, b0);
            if (v2 <= z) {
                j.unlock();
                return;
            }
            int a3 = this.a0();
        Label_0151:
            while (z < v2) {
                final Object[] k = this.K;
                final int m = this.M;
                k[(int)(z % m)] = null;
                final int n = 0;
                final boolean b2 = a3 >= m;
                final long n2 = z + 1L;
                this.c0(n2);
                final int n3 = a3 - 1;
                this.d0(n3);
                z = n2;
                a3 = n3;
                if (b2) {
                    kotlinx.coroutines.internal.k0 m2;
                    kotlinx.coroutines.channels.k0 n4;
                    do {
                        n4 = this.N();
                        z = n2;
                        a3 = n3;
                        if (n4 == null) {
                            continue Label_0151;
                        }
                        if (n4 instanceof v) {
                            z = n2;
                            a3 = n3;
                            continue Label_0151;
                        }
                        k0.m((Object)n4);
                        m2 = n4.M0(null);
                    } while (m2 == null);
                    if (w0.b()) {
                        int n5 = n;
                        if (m2 == q.d) {
                            n5 = 1;
                        }
                        if (n5 == 0) {
                            throw new AssertionError();
                        }
                    }
                    this.K[(int)(b0 % this.M)] = n4.K0();
                    this.d0(n3 + 1);
                    this.e0(b0 + 1L);
                    final j2 a4 = j2.a;
                    j.unlock();
                    k0.m((Object)n4);
                    n4.J0();
                    this.T();
                    a = (a2 = null);
                    continue Label_0000;
                }
            }
            j.unlock();
        }
    }
    
    static /* synthetic */ void g0(final g g, a a, a a2, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            a2 = null;
        }
        g.f0(a, a2);
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
            final int a0 = this.a0();
            if (a0 >= this.M) {
                return kotlinx.coroutines.channels.b.f;
            }
            final long b0 = this.b0();
            this.K[(int)(b0 % this.M)] = e;
            this.d0(a0 + 1);
            this.e0(b0 + 1L);
            final j2 a2 = j2.a;
            j.unlock();
            this.T();
            return kotlinx.coroutines.channels.b.e;
        }
        finally {
            j.unlock();
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected Object D(final E e, @org.jetbrains.annotations.e final f<?> f) {
        final ReentrantLock j = this.J;
        j.lock();
        try {
            final v<?> n = this.n();
            if (n != null) {
                return n;
            }
            final int a0 = this.a0();
            if (a0 >= this.M) {
                return kotlinx.coroutines.channels.b.f;
            }
            if (!f.l()) {
                return kotlinx.coroutines.selects.g.d();
            }
            final long b0 = this.b0();
            this.K[(int)(b0 % this.M)] = e;
            this.d0(a0 + 1);
            this.e0(b0 + 1L);
            final j2 a2 = j2.a;
            j.unlock();
            this.T();
            return kotlinx.coroutines.channels.b.e;
        }
        finally {
            j.unlock();
        }
    }
    
    @Override
    public boolean I(@org.jetbrains.annotations.f final Throwable t) {
        if (!super.I(t)) {
            return false;
        }
        this.T();
        return true;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public h0<E> L() {
        final a<E> a = new a<E>(this);
        g0(this, a, null, 2, null);
        return a;
    }
    
    public final int Y() {
        return this.M;
    }
    
    @Override
    public void d(@org.jetbrains.annotations.f final CancellationException ex) {
        this.S(ex);
    }
    
    @org.jetbrains.annotations.e
    @Override
    protected String j() {
        final StringBuilder sb = new StringBuilder();
        sb.append("(buffer:capacity=");
        sb.append(this.K.length);
        sb.append(",size=");
        sb.append(this.a0());
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    protected boolean w() {
        return false;
    }
    
    @Override
    protected boolean x() {
        return this.a0() >= this.M;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u0016\u0010$\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0006R\u0016\u0010&\u001a\u00020\u00048T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u001a\u0010+\u001a\u00060'j\u0002`(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006." }, d2 = { "kotlinx/coroutines/channels/g$a", "E", "Lkotlinx/coroutines/channels/a;", "Lkotlinx/coroutines/channels/h0;", "", "q0", "()Z", "", "r0", "()Ljava/lang/Object;", "", "cause", "I", "(Ljava/lang/Throwable;)Z", "o0", "h0", "Lkotlinx/coroutines/selects/f;", "select", "i0", "(Lkotlinx/coroutines/selects/f;)Ljava/lang/Object;", "b0", "isBufferEmpty", "", "value", "p0", "()J", "s0", "(J)V", "subHead", "Lkotlinx/coroutines/channels/g;", "K", "Lkotlinx/coroutines/channels/g;", "broadcastChannel", "w", "isBufferAlwaysFull", "a0", "isBufferAlwaysEmpty", "x", "isBufferFull", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "J", "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "<init>", "(Lkotlinx/coroutines/channels/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class a<E> extends kotlinx.coroutines.channels.a<E> implements h0<E>
    {
        private final ReentrantLock J;
        private final g<E> K;
        private volatile /* synthetic */ long _subHead;
        
        public a(@org.jetbrains.annotations.e final g<E> k) {
            super(null);
            this.K = k;
            this.J = new ReentrantLock();
            this._subHead = 0L;
        }
        
        private final boolean q0() {
            return this.k() == null && (!this.b0() || this.K.k() != null);
        }
        
        private final Object r0() {
            final long p0 = this.p0();
            Object o = this.K.k();
            if (p0 >= ((g<Object>)this.K).b0()) {
                if (o == null) {
                    o = this.k();
                }
                if (o == null) {
                    o = b.g;
                }
                return o;
            }
            final Object p2 = ((g<Object>)this.K).X(p0);
            final v<?> k = this.k();
            if (k != null) {
                return k;
            }
            return p2;
        }
        
        @Override
        public boolean I(@org.jetbrains.annotations.f Throwable j) {
            final boolean i = super.I(j);
            if (i) {
                g.g0((g<Object>)this.K, null, this, 1, null);
                j = (Throwable)this.J;
                ((Lock)j).lock();
                try {
                    this.s0(((g<Object>)this.K).b0());
                    final j2 a = j2.a;
                }
                finally {
                    ((Lock)j).unlock();
                }
            }
            return i;
        }
        
        @Override
        protected boolean a0() {
            return false;
        }
        
        @Override
        protected boolean b0() {
            return this.p0() >= ((g<Object>)this.K).b0();
        }
        
        @org.jetbrains.annotations.f
        @Override
        protected Object h0() {
            Object j = this.J;
            ((Lock)j).lock();
            try {
                final Object r0 = this.r0();
                final boolean b = r0 instanceof v;
                final int n = 1;
                int n2 = 0;
                Label_0057: {
                    if (!b) {
                        if (r0 != kotlinx.coroutines.channels.b.g) {
                            this.s0(this.p0() + 1L);
                            n2 = 1;
                            break Label_0057;
                        }
                    }
                    n2 = 0;
                }
                ((Lock)j).unlock();
                if (!(r0 instanceof v)) {
                    j = null;
                }
                else {
                    j = r0;
                }
                j = j;
                if (j != null) {
                    this.I(((v)j).J);
                }
                if (this.o0()) {
                    n2 = n;
                }
                if (n2 != 0) {
                    g.g0((g<Object>)this.K, null, null, 3, null);
                }
                return r0;
            }
            finally {
                ((Lock)j).unlock();
            }
        }
        
        @org.jetbrains.annotations.f
        @Override
        protected Object i0(@org.jetbrains.annotations.e final kotlinx.coroutines.selects.f<?> f) {
            final ReentrantLock j = this.J;
            j.lock();
            try {
                final Object r0 = this.r0();
                final boolean b = r0 instanceof v;
                final int n = 1;
                int n2 = 0;
                Object d;
                if (b) {
                    d = r0;
                }
                else if (r0 == kotlinx.coroutines.channels.b.g) {
                    d = r0;
                }
                else if (!f.l()) {
                    d = g.d();
                }
                else {
                    this.s0(this.p0() + 1L);
                    n2 = 1;
                    d = r0;
                }
                j.unlock();
                Object o;
                if (!(d instanceof v)) {
                    o = null;
                }
                else {
                    o = d;
                }
                final v v = (v)o;
                if (v != null) {
                    this.I(v.J);
                }
                if (this.o0()) {
                    n2 = n;
                }
                if (n2 != 0) {
                    g.g0((g<Object>)this.K, null, null, 3, null);
                }
                return d;
            }
            finally {
                j.unlock();
            }
        }
        
        public final boolean o0() {
            boolean b = false;
            v v2;
            while (true) {
                final boolean q0 = this.q0();
                final v v = null;
                v2 = v;
                if (!q0) {
                    break;
                }
                if (!this.J.tryLock()) {
                    v2 = v;
                    break;
                }
                try {
                    final Object r0 = this.r0();
                    if (r0 == kotlinx.coroutines.channels.b.g) {
                        continue;
                    }
                    if (r0 instanceof v) {
                        final v v3 = (v)r0;
                    }
                    else {
                        final i0<v> j = this.J();
                        if (j != null) {
                            if (!(j instanceof v)) {
                                final kotlinx.coroutines.internal.k0 b2 = j.b0((v)r0, null);
                                if (b2 == null) {
                                    continue;
                                }
                                if (w0.b() && b2 != q.d) {
                                    throw new AssertionError();
                                }
                                this.s0(this.p0() + 1L);
                                this.J.unlock();
                                k0.m((Object)j);
                                j.A((v)r0);
                                b = true;
                                continue;
                            }
                        }
                    }
                    break;
                    continue;
                }
                finally {
                    this.J.unlock();
                }
                break;
            }
            if (v2 != null) {
                this.I(v2.J);
            }
            return b;
        }
        
        public final long p0() {
            return this._subHead;
        }
        
        public final void s0(final long subHead) {
            this._subHead = subHead;
        }
        
        @Override
        protected boolean w() {
            throw new IllegalStateException("Should not be used".toString());
        }
        
        @Override
        protected boolean x() {
            throw new IllegalStateException("Should not be used".toString());
        }
    }
}
