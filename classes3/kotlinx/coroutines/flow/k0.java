// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlin.coroutines.g;
import kotlinx.coroutines.o2;
import kotlin.coroutines.g$c;
import kotlin.c1;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.f;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o;
import kotlinx.coroutines.r;
import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.p;
import kotlin.b1$a;
import kotlin.b1;
import java.util.Arrays;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.flow.internal.d;
import kotlin.j2;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.channels.n;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.t;
import kotlinx.coroutines.flow.internal.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\\B\u001f\u0012\u0006\u0010Z\u001a\u00020\u0016\u0012\u0006\u0010M\u001a\u00020\u0016\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\b_\u0010`J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0001\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J(\u0010!\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\fH\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010#\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u000eH\u0002J3\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010(0\u00142\u0014\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010(0\u0014H\u0002¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010\nJ\u001b\u00101\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u000eH\u0000¢\u0006\u0004\b4\u00105J%\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010(0\u00142\u0006\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010<\u001a\u00020\u0016H\u0014¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u00020\fH\u0016J&\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00162\u0006\u0010D\u001a\u00020CH\u0016R\u0016\u0010H\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u00105R\u0016\u0010I\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\rR\u0016\u0010K\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010=R\u0016\u0010L\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010M\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u0016\u0010N\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u00105R \u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010OR\u0016\u0010R\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u00105R\u0016\u0010U\u001a\u00020\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0016\u0010X\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010=R\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010YR\u0016\u0010Z\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010=R\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000[8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006a" }, d2 = { "Lkotlinx/coroutines/flow/k0;", "T", "Lkotlinx/coroutines/flow/internal/b;", "Lkotlinx/coroutines/flow/n0;", "Lkotlinx/coroutines/flow/e0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/t;", "value", "", "U", "(Ljava/lang/Object;)Z", "V", "Lkotlin/j2;", "J", "", "newHead", "G", "", "item", "L", "", "curBuffer", "", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "Lkotlinx/coroutines/flow/k0$a;", "emitter", "E", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "Y", "F", "slot", "X", "W", "index", "P", "Lkotlin/coroutines/d;", "resumesIn", "M", "([Lkotlin/coroutines/d;)[Lkotlin/coroutines/d;", "Lkotlinx/coroutines/flow/j;", "collector", "c", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "K", "a0", "()J", "oldIndex", "Z", "(J)[Lkotlin/coroutines/d;", "D", "(Lkotlinx/coroutines/flow/n0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "H", "size", "I", "(I)[Lkotlinx/coroutines/flow/n0;", "i", "Lkotlin/coroutines/g;", "context", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", "d", "Q", "queueEndIndex", "minCollectorIndex", "N", "bufferSize", "replayIndex", "bufferCapacity", "bufferEndIndex", "[Ljava/lang/Object;", "buffer", "O", "head", "S", "()I", "totalSize", "R", "replaySize", "queueSize", "Lkotlinx/coroutines/channels/n;", "replay", "", "a", "()Ljava/util/List;", "replayCache", "<init>", "(IILkotlinx/coroutines/channels/n;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class k0<T> extends b<n0> implements e0<T>, c<T>, t<T>
{
    private Object[] K;
    private long L;
    private long M;
    private int N;
    private int O;
    private final int P;
    private final int Q;
    private final n R;
    
    public k0(final int p3, final int q, @e final n r) {
        this.P = p3;
        this.Q = q;
        this.R = r;
    }
    
    private final void E(final a a) {
        synchronized (this) {
            if (a.H < this.O()) {
                return;
            }
            final Object[] k = this.K;
            kotlin.jvm.internal.k0.m((Object)k);
            if (m0.c(k, a.H) != a) {
                return;
            }
            m0.d(k, a.H, m0.a);
            this.F();
            final j2 a2 = j2.a;
        }
    }
    
    private final void F() {
        if (this.Q == 0 && this.O <= 1) {
            return;
        }
        final Object[] k = this.K;
        kotlin.jvm.internal.k0.m((Object)k);
        while (this.O > 0 && m0.c(k, this.O() + this.S() - 1L) == m0.a) {
            --this.O;
            m0.d(k, this.O() + this.S(), null);
        }
    }
    
    private final void G(final long n) {
        if (b.e((b<d>)this) != 0) {
            final d[] f = b.f((b<d>)this);
            if (f != null) {
                for (final d d : f) {
                    if (d != null) {
                        final n0 n2 = (n0)d;
                        final long a = n2.a;
                        if (a >= 0L && a < n) {
                            n2.a = n;
                        }
                    }
                }
            }
        }
        this.M = n;
    }
    
    private final void J() {
        final Object[] k = this.K;
        kotlin.jvm.internal.k0.m((Object)k);
        m0.d(k, this.O(), null);
        --this.N;
        final long l = this.O() + 1L;
        if (this.L < l) {
            this.L = l;
        }
        if (this.M < l) {
            this.G(l);
        }
        if (w0.b() && this.O() != l) {
            throw new AssertionError();
        }
    }
    
    private final void L(final Object o) {
        final int s = this.S();
        final Object[] k = this.K;
        Object[] array;
        if (k == null) {
            array = this.T(null, 0, 2);
        }
        else {
            array = k;
            if (s >= k.length) {
                array = this.T(k, s, k.length * 2);
            }
        }
        m0.d(array, this.O() + s, o);
    }
    
    private final kotlin.coroutines.d<j2>[] M(kotlin.coroutines.d<j2>[] original) {
        int length = original.length;
        kotlin.coroutines.d<j2>[] array;
        if (b.e((b<d>)this) == 0) {
            array = original;
        }
        else {
            final d[] f = b.f((b<d>)this);
            array = original;
            if (f != null) {
                final int length2 = f.length;
                int n = 0;
                while (true) {
                    array = original;
                    if (n >= length2) {
                        break;
                    }
                    final d d = f[n];
                    int n2 = length;
                    kotlin.coroutines.d<j2>[] array2 = original;
                    if (d != null) {
                        final n0 n3 = (n0)d;
                        final kotlin.coroutines.d<? super j2> b = n3.b;
                        n2 = length;
                        array2 = original;
                        if (b != null) {
                            if (this.W(n3) < 0L) {
                                n2 = length;
                                array2 = original;
                            }
                            else {
                                array2 = original;
                                if (length >= original.length) {
                                    final kotlin.coroutines.d<j2>[] copy = Arrays.copyOf(original, Math.max(2, original.length * 2));
                                    kotlin.jvm.internal.k0.o((Object)copy, "java.util.Arrays.copyOf(this, newSize)");
                                    array2 = copy;
                                }
                                array2[length] = (kotlin.coroutines.d<j2>)b;
                                n3.b = null;
                                n2 = length + 1;
                            }
                        }
                    }
                    ++n;
                    length = n2;
                    original = array2;
                }
            }
        }
        return array;
    }
    
    private final long N() {
        return this.O() + this.N;
    }
    
    private final long O() {
        return Math.min(this.M, this.L);
    }
    
    private final Object P(final long n) {
        final Object[] k = this.K;
        kotlin.jvm.internal.k0.m((Object)k);
        Object o2;
        final Object o = o2 = m0.c(k, n);
        if (o instanceof a) {
            o2 = ((a)o).I;
        }
        return o2;
    }
    
    private final long Q() {
        return this.O() + this.N + this.O;
    }
    
    private final int R() {
        return (int)(this.O() + this.N - this.L);
    }
    
    private final int S() {
        return this.N + this.O;
    }
    
    private final Object[] T(final Object[] array, final int n, int i) {
        final int n2 = 0;
        if (i <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        final Object[] k = new Object[i];
        this.K = k;
        if (array == null) {
            return k;
        }
        final long o = this.O();
        long n3;
        for (i = n2; i < n; ++i) {
            n3 = i + o;
            m0.d(k, n3, m0.c(array, n3));
        }
        return k;
    }
    
    private final boolean U(final T t) {
        if (this.q() == 0) {
            return this.V(t);
        }
        if (this.N >= this.Q && this.M <= this.L) {
            final int n = l0.a[this.R.ordinal()];
            if (n == 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
        }
        this.L(t);
        if (++this.N > this.Q) {
            this.J();
        }
        if (this.R() > this.P) {
            this.Y(this.L + 1L, this.M, this.N(), this.Q());
        }
        return true;
    }
    
    private final boolean V(final T t) {
        if (w0.b() && this.q() != 0) {
            throw new AssertionError();
        }
        if (this.P == 0) {
            return true;
        }
        this.L(t);
        if (++this.N > this.P) {
            this.J();
        }
        this.M = this.O() + this.N;
        return true;
    }
    
    private final long W(final n0 n0) {
        final long a = n0.a;
        if (a < this.N()) {
            return a;
        }
        if (this.Q > 0) {
            return -1L;
        }
        if (a > this.O()) {
            return -1L;
        }
        if (this.O == 0) {
            return -1L;
        }
        return a;
    }
    
    private final Object X(final n0 n0) {
        kotlin.coroutines.d<j2>[] array = kotlinx.coroutines.flow.internal.c.a;
        synchronized (this) {
            final long w = this.W(n0);
            kotlinx.coroutines.internal.k0 a;
            if (w < 0L) {
                a = m0.a;
            }
            else {
                final long a2 = n0.a;
                final Object p = this.P(w);
                n0.a = w + 1L;
                array = this.Z(a2);
                a = (kotlinx.coroutines.internal.k0)p;
            }
            // monitorexit(this)
            for (final kotlin.coroutines.d<j2> d : array) {
                if (d != null) {
                    final j2 a3 = j2.a;
                    final b1$a h = b1.H;
                    d.resumeWith(b1.b((Object)a3));
                }
            }
            return a;
        }
    }
    
    private final void Y(final long n, final long n2, final long n3, final long n4) {
        final long min = Math.min(n2, n);
        final boolean b = w0.b();
        final int n5 = 1;
        if (b && min < this.O()) {
            throw new AssertionError();
        }
        for (long o = this.O(); o < min; ++o) {
            final Object[] k = this.K;
            kotlin.jvm.internal.k0.m((Object)k);
            m0.d(k, o, null);
        }
        this.L = n;
        this.M = n2;
        this.N = (int)(n3 - min);
        this.O = (int)(n4 - n3);
        if (w0.b() && this.N < 0) {
            throw new AssertionError();
        }
        if (w0.b() && this.O < 0) {
            throw new AssertionError();
        }
        if (w0.b()) {
            int n6;
            if (this.L <= this.O() + this.N) {
                n6 = n5;
            }
            else {
                n6 = 0;
            }
            if (n6 == 0) {
                throw new AssertionError();
            }
        }
    }
    
    final /* synthetic */ Object D(final n0 n0, final kotlin.coroutines.d<? super j2> d) {
        final p<Object> p2 = new p<Object>(kotlin.coroutines.intrinsics.b.d((kotlin.coroutines.d)d), 1);
        p2.H();
        synchronized (this) {
            if (this.W(n0) < 0L) {
                n0.b = (kotlin.coroutines.d<? super j2>)p2;
                n0.b = (kotlin.coroutines.d<? super j2>)p2;
            }
            else {
                final j2 a = j2.a;
                final b1$a h = b1.H;
                ((kotlin.coroutines.d)p2).resumeWith(b1.b((Object)a));
            }
            final j2 a2 = j2.a;
            // monitorexit(this)
            final Object y = p2.y();
            if (y == kotlin.coroutines.intrinsics.b.h()) {
                h.c((kotlin.coroutines.d)d);
            }
            return y;
        }
    }
    
    @e
    protected n0 H() {
        return new n0();
    }
    
    @e
    protected n0[] I(final int n) {
        return new n0[n];
    }
    
    final /* synthetic */ Object K(final T t, final kotlin.coroutines.d<? super j2> d) {
        final p p2 = new p<Object>(kotlin.coroutines.intrinsics.b.d((kotlin.coroutines.d)d), 1);
        p2.H();
        final kotlin.coroutines.d<j2>[] a = kotlinx.coroutines.flow.internal.c.a;
        synchronized (this) {
            kotlin.coroutines.d[] array;
            l1 l1;
            if (this.U(t)) {
                final j2 a2 = j2.a;
                final b1$a h = b1.H;
                ((kotlin.coroutines.d)p2).resumeWith(b1.b((Object)a2));
                array = this.M(a);
                l1 = null;
            }
            else {
                l1 = new a(this, this.S() + this.O(), t, (kotlin.coroutines.d<? super j2>)p2);
                this.L(l1);
                A(this, y(this) + 1);
                array = a;
                if (w(this) == 0) {
                    array = this.M(a);
                }
            }
            // monitorexit(this)
            if (l1 != null) {
                r.a(p2, l1);
            }
            for (final kotlin.coroutines.d d2 : array) {
                if (d2 != null) {
                    final j2 a3 = j2.a;
                    final b1$a h2 = b1.H;
                    d2.resumeWith(b1.b((Object)a3));
                }
            }
            final Object y = p2.y();
            if (y == kotlin.coroutines.intrinsics.b.h()) {
                h.c((kotlin.coroutines.d)d);
            }
            return y;
        }
    }
    
    @e
    public final kotlin.coroutines.d<j2>[] Z(long n) {
        if (w0.b() && n < this.M) {
            throw new AssertionError();
        }
        if (n > this.M) {
            return kotlinx.coroutines.flow.internal.c.a;
        }
        final long o = this.O();
        long n2;
        n = (n2 = this.N + o);
        if (this.Q == 0) {
            n2 = n;
            if (this.O > 0) {
                n2 = n + 1L;
            }
        }
        if (b.e((b<d>)this) == 0) {
            n = n2;
        }
        else {
            final d[] f = b.f((b<d>)this);
            n = n2;
            if (f != null) {
                final int length = f.length;
                int n3 = 0;
                while (true) {
                    n = n2;
                    if (n3 >= length) {
                        break;
                    }
                    final d d = f[n3];
                    n = n2;
                    if (d != null) {
                        final long a = ((n0)d).a;
                        n = n2;
                        if (a >= 0L) {
                            n = n2;
                            if (a < n2) {
                                n = a;
                            }
                        }
                    }
                    ++n3;
                    n2 = n;
                }
            }
        }
        if (w0.b() && n < this.M) {
            throw new AssertionError();
        }
        if (n <= this.M) {
            return kotlinx.coroutines.flow.internal.c.a;
        }
        long n4 = this.N();
        int n5;
        if (this.q() > 0) {
            n5 = Math.min(this.O, this.Q - (int)(n4 - n));
        }
        else {
            n5 = this.O;
        }
        kotlin.coroutines.d[] a2 = kotlinx.coroutines.flow.internal.c.a;
        final long n6 = this.O + n4;
        long n11;
        if (n5 > 0) {
            a2 = new kotlin.coroutines.d[n5];
            final Object[] k = this.K;
            kotlin.jvm.internal.k0.m((Object)k);
            long n7 = n4;
            int n8 = 0;
            while (n4 < n6) {
                final Object c = m0.c(k, n4);
                final kotlinx.coroutines.internal.k0 a3 = m0.a;
                if (c != a3) {
                    Objects.requireNonNull(c, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    final a a4 = (a)c;
                    final int n9 = n8 + 1;
                    a2[n8] = a4.J;
                    m0.d(k, n4, a3);
                    m0.d(k, n7, a4.I);
                    ++n7;
                    if (n9 >= n5) {
                        break;
                    }
                    n8 = n9;
                }
                ++n4;
            }
            final long n10 = n;
            n = n7;
            n11 = n10;
        }
        else {
            n11 = n;
            n = n4;
        }
        final int b = (int)(n - o);
        long n12;
        if (this.q() == 0) {
            n12 = n;
        }
        else {
            n12 = n11;
        }
        long max;
        final long n13 = max = Math.max(this.L, n - Math.min(this.P, b));
        long n14 = n;
        if (this.Q == 0) {
            max = n13;
            n14 = n;
            if (n13 < n6) {
                final Object[] i = this.K;
                kotlin.jvm.internal.k0.m((Object)i);
                max = n13;
                n14 = n;
                if (kotlin.jvm.internal.k0.g(m0.c(i, n13), (Object)m0.a)) {
                    n14 = n + 1L;
                    max = n13 + 1L;
                }
            }
        }
        this.Y(max, n12, n14, n6);
        this.F();
        final boolean b2 = ((kotlin.coroutines.d<j2>[])a2).length == 0;
        kotlin.coroutines.d<j2>[] m = (kotlin.coroutines.d<j2>[])a2;
        if (true ^ b2) {
            m = this.M((kotlin.coroutines.d<j2>[])a2);
        }
        return m;
    }
    
    @e
    @Override
    public List<T> a() {
        synchronized (this) {
            final int r = this.R();
            if (r == 0) {
                return (List<T>)v.E();
            }
            final ArrayList list = new ArrayList<Object>(r);
            final Object[] k = this.K;
            kotlin.jvm.internal.k0.m((Object)k);
            for (int i = 0; i < r; ++i) {
                list.add(m0.c(k, this.L + i));
            }
            return (List<T>)list;
        }
    }
    
    public final long a0() {
        final long l = this.L;
        if (l < this.M) {
            this.M = l;
        }
        return l;
    }
    
    @f
    @Override
    public Object b(final T t, @e final kotlin.coroutines.d<? super j2> d) {
        if (this.j(t)) {
            return j2.a;
        }
        final Object k = this.K(t, d);
        if (k == kotlin.coroutines.intrinsics.b.h()) {
            return k;
        }
        return j2.a;
    }
    
    @f
    @Override
    public Object c(@e j<? super T> k, @e kotlin.coroutines.d<? super j2> o) {
        Object o2 = null;
        Label_0050: {
            if (o instanceof k0$b) {
                o2 = o;
                final int h = ((k0$b)o2).H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    ((k0$b)o2).H = h + Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            o2 = new kotlin.coroutines.jvm.internal.d(o) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ k0 I;
                Object J;
                Object K;
                Object L;
                Object M;
                
                @f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.c(null, (kotlin.coroutines.d<? super j2>)this);
                }
            };
        }
        Object g = ((k0$b)o2).G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = ((k0$b)o2).H;
        Object o7 = null;
    Label_0140:
        while (true) {
            Label_0338: {
                Label_0270: {
                    if (h3 == 0) {
                        break Label_0270;
                    }
                    while (true) {
                        if (h3 == 1) {
                            break Label_0220;
                        }
                        Label_0164: {
                            if (h3 == 2) {
                                break Label_0164;
                            }
                            Label_0153: {
                                if (h3 != 3) {
                                    break Label_0153;
                                }
                                Object o3 = ((k0$b)o2).M;
                                final Object o4 = ((k0$b)o2).L;
                                final j j = (j)((k0$b)o2).K;
                                final k0 k2 = (k0)((k0$b)o2).J;
                                o = o4;
                                k = k2;
                                try {
                                    c1.n(g);
                                    g = o2;
                                    k = o3;
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    Object i = ((k0$b)o2).L;
                                    final Object o5 = ((k0$b)o2).K;
                                    final k0 k3 = (k0)((k0$b)o2).J;
                                    o = i;
                                    k = k3;
                                    c1.n(g);
                                    break Label_0338;
                                    o3 = ((k0$b)o2).M;
                                    final n0 n0 = (n0)((k0$b)o2).L;
                                    final Object o6 = ((k0$b)o2).K;
                                    i = ((k0$b)o2).J;
                                    o = n0;
                                    k = i;
                                    c1.n(g);
                                    continue;
                                }
                                finally {
                                    o7 = k;
                                    k = o2;
                                    break Label_0140;
                                }
                            }
                        }
                        break;
                    }
                }
                c1.n(g);
                Object i = this.k();
                try {
                    if (k instanceof z0) {
                        final z0 z0 = (z0)k;
                        ((k0$b)o2).J = this;
                        ((k0$b)o2).K = k;
                        ((k0$b)o2).L = i;
                        ((k0$b)o2).H = 1;
                        if (z0.a((kotlin.coroutines.d)o2) == h2) {
                            return h2;
                        }
                    }
                    o7 = this;
                    Object o5 = k;
                    Object o6 = k = ((kotlin.coroutines.d)o2).getContext().get((g$c)k2.t);
                    o = o5;
                    Object o4 = i;
                    o5 = o2;
                    final Object o3 = k;
                    i = o7;
                    o6 = o;
                    o2 = o4;
                    do {
                        final Object x = ((k0)i).X((n0)o2);
                        if (x != m0.a) {
                            if (o3 != null) {
                                kotlinx.coroutines.o2.B((k2)o3);
                            }
                            ((k0$b)o5).J = i;
                            ((k0$b)o5).K = o6;
                            ((k0$b)o5).L = o2;
                            ((k0$b)o5).M = o3;
                            ((k0$b)o5).H = 3;
                            g = o5;
                            o4 = o2;
                            if (((j<kotlinx.coroutines.internal.k0>)o6).b((kotlinx.coroutines.internal.k0)x, (kotlin.coroutines.d<? super j2>)o5) == h2) {
                                return h2;
                            }
                            continue Label_0140;
                        }
                        else {
                            ((k0$b)o5).J = i;
                            ((k0$b)o5).K = o6;
                            ((k0$b)o5).L = o2;
                            ((k0$b)o5).M = o3;
                            ((k0$b)o5).H = 2;
                        }
                    } while (((k0)i).D((n0)o2, (kotlin.coroutines.d<? super j2>)o5) != h2);
                    return h2;
                }
                finally {
                    o7 = this;
                    o = i;
                }
            }
            break;
        }
        ((b<n0>)o7).p((n0)o);
        throw k;
    }
    
    @e
    @Override
    public i<T> d(@e final g g, final int n, @e final n n2) {
        return m0.e((j0<? extends T>)this, g, n, n2);
    }
    
    @Override
    public void i() {
        synchronized (this) {
            this.Y(this.N(), this.M, this.N(), this.Q());
            final j2 a = j2.a;
        }
    }
    
    @Override
    public boolean j(final T t) {
        final kotlin.coroutines.d<j2>[] a = kotlinx.coroutines.flow.internal.c.a;
        synchronized (this) {
            final boolean u = this.U(t);
            int i = 0;
            kotlin.coroutines.d<j2>[] m;
            boolean b;
            if (u) {
                m = this.M(a);
                b = true;
            }
            else {
                b = false;
                m = a;
            }
            // monitorexit(this)
            while (i < m.length) {
                final kotlin.coroutines.d<j2> d = m[i];
                if (d != null) {
                    final j2 a2 = j2.a;
                    final b1$a h = b1.H;
                    d.resumeWith(b1.b((Object)a2));
                }
                ++i;
            }
            return b;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "kotlinx/coroutines/flow/k0$a", "Lkotlinx/coroutines/l1;", "Lkotlin/j2;", "dispose", "", "H", "J", "index", "Lkotlinx/coroutines/flow/k0;", "G", "Lkotlinx/coroutines/flow/k0;", "flow", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d;", "cont", "", "I", "Ljava/lang/Object;", "value", "<init>", "(Lkotlinx/coroutines/flow/k0;JLjava/lang/Object;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class a implements l1
    {
        @m6.d
        @e
        public final k0<?> G;
        @m6.d
        public long H;
        @m6.d
        @f
        public final Object I;
        @m6.d
        @e
        public final kotlin.coroutines.d<j2> J;
        
        public a(@e final k0<?> g, final long h, @f final Object i, @e final kotlin.coroutines.d<? super j2> j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = (kotlin.coroutines.d<j2>)j;
        }
        
        @Override
        public void dispose() {
            ((k0<Object>)this.G).E(this);
        }
    }
}
