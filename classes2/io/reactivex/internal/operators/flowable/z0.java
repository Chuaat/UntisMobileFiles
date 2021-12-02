// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicLong;
import y5.n;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import o7.b;
import x5.o;

public final class z0<T, U> extends io.reactivex.internal.operators.flowable.a<T, U>
{
    final o<? super T, ? extends o7.b<? extends U>> I;
    final boolean J;
    final int K;
    final int L;
    
    public z0(final l<T> l, final o<? super T, ? extends o7.b<? extends U>> i, final boolean j, final int k, final int m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    public static <T, U> q<T> P8(final c<? super U> c, final o<? super T, ? extends o7.b<? extends U>> o, final boolean b, final int n, final int n2) {
        return new b<T, Object>(c, o, b, n, n2);
    }
    
    @Override
    protected void n6(final c<? super U> c) {
        if (j3.b((o7.b<Object>)super.H, (o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.I)) {
            return;
        }
        super.H.m6(P8((o7.c<? super Object>)c, (o<? super T, ? extends o7.b<?>>)this.I, this.J, this.K, this.L));
    }
    
    static final class a<T, U> extends AtomicReference<d> implements q<U>, c
    {
        private static final long O = -4606175640614850599L;
        final long G;
        final b<T, U> H;
        final int I;
        final int J;
        volatile boolean K;
        volatile y5.o<U> L;
        long M;
        int N;
        
        a(final b<T, U> h, final long g) {
            this.G = g;
            this.H = h;
            final int k = h.K;
            this.J = k;
            this.I = k >> 2;
        }
        
        void a(long m) {
            if (this.N != 1) {
                m += this.M;
                if (m >= this.I) {
                    this.M = 0L;
                    this.get().v(m);
                }
                else {
                    this.M = m;
                }
            }
        }
        
        public void b(final Throwable t) {
            this.lazySet((d)j.G);
            this.H.k(this, t);
        }
        
        @Override
        public void dispose() {
            j.b(this);
        }
        
        public void f() {
            this.K = true;
            this.H.g();
        }
        
        @Override
        public boolean i() {
            return this.get() == j.G;
        }
        
        public void m(final U u) {
            if (this.N != 2) {
                this.H.n(u, this);
            }
            else {
                this.H.g();
            }
        }
        
        @Override
        public void z(final d d) {
            if (j.k(this, d)) {
                if (d instanceof y5.l) {
                    final y5.l l = (y5.l)d;
                    final int e = l.E(7);
                    if (e == 1) {
                        this.N = e;
                        this.L = (y5.o<U>)l;
                        this.K = true;
                        this.H.g();
                        return;
                    }
                    if (e == 2) {
                        this.N = e;
                        this.L = (y5.o<U>)l;
                    }
                }
                d.v((long)this.J);
            }
        }
    }
    
    static final class b<T, U> extends AtomicInteger implements q<T>, d
    {
        private static final long X = -2117620485640801370L;
        static final a<?, ?>[] Y;
        static final a<?, ?>[] Z;
        final c<? super U> G;
        final o<? super T, ? extends o7.b<? extends U>> H;
        final boolean I;
        final int J;
        final int K;
        volatile n<U> L;
        volatile boolean M;
        final io.reactivex.internal.util.c N;
        volatile boolean O;
        final AtomicReference<a<?, ?>[]> P;
        final AtomicLong Q;
        d R;
        long S;
        long T;
        int U;
        int V;
        final int W;
        
        static {
            Y = new a[0];
            Z = new a[0];
        }
        
        b(final c<? super U> g, final o<? super T, ? extends o7.b<? extends U>> h, final boolean i, final int j, final int k) {
            this.N = new io.reactivex.internal.util.c();
            final AtomicReference<a<?, ?>[]> p5 = new AtomicReference<a<?, ?>[]>();
            this.P = p5;
            this.Q = new AtomicLong();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
            this.W = Math.max(1, j >> 1);
            p5.lazySet(b.Y);
        }
        
        boolean a(final a<T, U> a) {
            a[] expectedValue;
            a[] newValue;
            do {
                expectedValue = this.P.get();
                if (expectedValue == b.Z) {
                    a.dispose();
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new a[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = a;
            } while (!this.P.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        public void b(final Throwable t) {
            if (this.M) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            if (this.N.a(t)) {
                this.M = true;
                this.g();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        boolean c() {
            if (this.O) {
                this.d();
                return true;
            }
            if (!this.I && this.N.get() != null) {
                this.d();
                final Throwable c = this.N.c();
                if (c != k.a) {
                    this.G.b(c);
                }
                return true;
            }
            return false;
        }
        
        public void cancel() {
            if (!this.O) {
                this.O = true;
                this.R.cancel();
                this.e();
                if (this.getAndIncrement() == 0) {
                    final n<U> l = this.L;
                    if (l != null) {
                        l.clear();
                    }
                }
            }
        }
        
        void d() {
            final n<U> l = this.L;
            if (l != null) {
                l.clear();
            }
        }
        
        void e() {
            final a[] array = this.P.get();
            final a<?, ?>[] z = b.Z;
            if (array != z) {
                final a[] array2 = this.P.getAndSet(z);
                if (array2 != z) {
                    for (int length = array2.length, i = 0; i < length; ++i) {
                        array2[i].dispose();
                    }
                    final Throwable c = this.N.c();
                    if (c != null && c != k.a) {
                        io.reactivex.plugins.a.Y(c);
                    }
                }
            }
        }
        
        public void f() {
            if (this.M) {
                return;
            }
            this.M = true;
            this.g();
        }
        
        void g() {
            if (this.getAndIncrement() == 0) {
                this.h();
            }
        }
        
        void h() {
            final c<? super U> g = this.G;
            int addAndGet = 1;
            while (!this.c()) {
                final n<U> l = this.L;
                long n = this.Q.get();
                final boolean b = n == Long.MAX_VALUE;
                long n2 = 0L;
                long n3 = n;
                long n4 = n2;
                if (l != null) {
                    while (true) {
                        long n5 = 0L;
                        Object poll = null;
                        while (n != 0L) {
                            poll = l.poll();
                            if (this.c()) {
                                return;
                            }
                            if (poll == null) {
                                break;
                            }
                            g.m(poll);
                            ++n2;
                            ++n5;
                            --n;
                        }
                        if (n5 != 0L) {
                            if (b) {
                                n = Long.MAX_VALUE;
                            }
                            else {
                                n = this.Q.addAndGet(-n5);
                            }
                        }
                        n3 = n;
                        n4 = n2;
                        if (n == 0L) {
                            break;
                        }
                        if (poll == null) {
                            n3 = n;
                            n4 = n2;
                            break;
                        }
                    }
                }
                final boolean m = this.M;
                final n<U> i = this.L;
                final a[] array = this.P.get();
                final int length = array.length;
                if (m && (i == null || i.isEmpty()) && length == 0) {
                    final Throwable c = this.N.c();
                    if (c != k.a) {
                        if (c == null) {
                            g.f();
                        }
                        else {
                            g.b(c);
                        }
                    }
                    return;
                }
                long n8;
                int n9;
                if (length != 0) {
                    final long t = this.T;
                    final int u = this.U;
                    int u2 = 0;
                    Label_0412: {
                        if (length > u) {
                            u2 = u;
                            if (array[u].G == t) {
                                break Label_0412;
                            }
                        }
                        if (length <= (u2 = u)) {
                            u2 = 0;
                        }
                        for (int n6 = 0; n6 < length && array[u2].G != t; ++n6) {
                            if (++u2 == length) {
                                u2 = 0;
                            }
                        }
                        this.U = u2;
                        this.T = array[u2].G;
                    }
                    final int n7 = 0;
                    int j = 0;
                    n8 = n4;
                    long addAndGet2 = n3;
                    int u3 = u2;
                    n9 = n7;
                Label_0815:
                    while (j < length) {
                        if (this.c()) {
                            return;
                        }
                        final a a = array[u3];
                        final Throwable t2 = null;
                        while (!this.c()) {
                            final y5.o<U> k = a.L;
                            int n12 = 0;
                            int n13 = 0;
                            long n14 = 0L;
                            Label_0798: {
                                long n10;
                                if (k == null) {
                                    n10 = addAndGet2;
                                }
                                else {
                                    long n11 = 0L;
                                    while (addAndGet2 != 0L) {
                                        try {
                                            final U poll2 = k.poll();
                                            if (poll2 != null) {
                                                g.m((Object)poll2);
                                                if (this.c()) {
                                                    return;
                                                }
                                                --addAndGet2;
                                                ++n11;
                                                continue;
                                            }
                                        }
                                        finally {
                                            io.reactivex.exceptions.b.b(t2);
                                            a.dispose();
                                            this.N.a(t2);
                                            if (!this.I) {
                                                this.R.cancel();
                                            }
                                            if (this.c()) {
                                                return;
                                            }
                                            this.l(a);
                                            n12 = j + 1;
                                            n13 = 1;
                                            n14 = n8;
                                            break Label_0798;
                                        }
                                        break;
                                    }
                                    long n15;
                                    if (n11 != 0L) {
                                        if (!b) {
                                            addAndGet2 = this.Q.addAndGet(-n11);
                                        }
                                        else {
                                            addAndGet2 = Long.MAX_VALUE;
                                        }
                                        a.a(n11);
                                        n15 = 0L;
                                    }
                                    else {
                                        n15 = 0L;
                                    }
                                    n10 = addAndGet2;
                                    if (addAndGet2 != n15) {
                                        if (t2 != null) {
                                            continue;
                                        }
                                        n10 = addAndGet2;
                                    }
                                }
                                final boolean k2 = a.K;
                                final y5.o<U> l2 = a.L;
                                if (k2 && (l2 == null || l2.isEmpty())) {
                                    this.l(a);
                                    if (this.c()) {
                                        return;
                                    }
                                    ++n8;
                                    n9 = 1;
                                }
                                if (n10 == 0L) {
                                    break Label_0815;
                                }
                                final int n16 = u3 + 1;
                                n13 = n9;
                                u3 = n16;
                                n12 = j;
                                addAndGet2 = n10;
                                n14 = n8;
                                if (n16 == length) {
                                    u3 = 0;
                                    n14 = n8;
                                    addAndGet2 = n10;
                                    n12 = j;
                                    n13 = n9;
                                }
                            }
                            j = n12 + 1;
                            n9 = n13;
                            n8 = n14;
                            continue Label_0815;
                        }
                        return;
                    }
                    this.U = u3;
                    this.T = array[u3].G;
                }
                else {
                    n8 = n4;
                    n9 = 0;
                }
                if (n8 != 0L && !this.O) {
                    this.R.v(n8);
                }
                if (n9 != 0) {
                    continue;
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        y5.o<U> i(final a<T, U> a) {
            Object l;
            if ((l = a.L) == null) {
                l = new io.reactivex.internal.queue.b<Object>(this.K);
                a.L = (y5.o<U>)l;
            }
            return (y5.o<U>)l;
        }
        
        y5.o<U> j() {
            n<U> l;
            if ((l = this.L) == null) {
                if (this.J == Integer.MAX_VALUE) {
                    l = new io.reactivex.internal.queue.c<U>(this.K);
                }
                else {
                    l = new io.reactivex.internal.queue.b<U>(this.J);
                }
                this.L = l;
            }
            return l;
        }
        
        void k(final a<T, U> a, final Throwable t) {
            if (this.N.a(t)) {
                a.K = true;
                if (!this.I) {
                    this.R.cancel();
                    final a[] array = this.P.getAndSet(b.Z);
                    for (int length = array.length, i = 0; i < length; ++i) {
                        array[i].dispose();
                    }
                }
                this.g();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void l(final a<T, U> a) {
            a[] expectedValue;
            a<?, ?>[] y;
            do {
                expectedValue = this.P.get();
                final int length = expectedValue.length;
                if (length == 0) {
                    return;
                }
                final int n = -1;
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= length) {
                        break;
                    }
                    if (expectedValue[n2] == a) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    y = b.Y;
                }
                else {
                    y = (a<?, ?>[])new a[length - 1];
                    System.arraycopy(expectedValue, 0, y, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, y, n3, length - n3 - 1);
                }
            } while (!this.P.compareAndSet(expectedValue, y));
        }
        
        public void m(final T t) {
            if (this.M) {
                return;
            }
            try {
                final o7.b b = io.reactivex.internal.functions.b.g((o7.b)this.H.apply((Object)t), "The mapper returned a null Publisher");
                if (b instanceof Callable) {
                    try {
                        final Object call = ((Callable<Object>)b).call();
                        if (call != null) {
                            this.o((U)call);
                            return;
                        }
                        if (this.J == Integer.MAX_VALUE || this.O) {
                            return;
                        }
                        final int v = this.V + 1;
                        this.V = v;
                        final int w = this.W;
                        if (v == w) {
                            this.V = 0;
                            this.R.v((long)w);
                        }
                        return;
                    }
                    finally {
                        final Throwable t2;
                        io.reactivex.exceptions.b.b(t2);
                        this.N.a(t2);
                        this.g();
                        return;
                    }
                }
                final long s = this.S;
                this.S = 1L + s;
                final a a = new a((b<Object, Object>)this, s);
                if (this.a((a<T, U>)a)) {
                    b.e((c)a);
                }
            }
            finally {
                final Throwable t3;
                io.reactivex.exceptions.b.b(t3);
                this.R.cancel();
                this.b(t3);
            }
        }
        
        void n(final U u, final a<T, U> a) {
            Label_0204: {
                io.reactivex.exceptions.c c = null;
                Label_0123: {
                    if (this.get() == 0 && this.compareAndSet(0, 1)) {
                        final long value = this.Q.get();
                        final y5.o<U> l = a.L;
                        if (value != 0L && (l == null || l.isEmpty())) {
                            this.G.m((Object)u);
                            if (value != Long.MAX_VALUE) {
                                this.Q.decrementAndGet();
                            }
                            a.a(1L);
                        }
                        else {
                            y5.o<U> i;
                            if ((i = l) == null) {
                                i = this.i(a);
                            }
                            if (!i.offer(u)) {
                                c = new io.reactivex.exceptions.c("Inner queue full?!");
                                break Label_0123;
                            }
                        }
                        if (this.decrementAndGet() == 0) {
                            return;
                        }
                        break Label_0204;
                    }
                    else {
                        y5.o<U> j;
                        if ((j = a.L) == null) {
                            j = new io.reactivex.internal.queue.b<U>(this.K);
                            a.L = j;
                        }
                        if (!j.offer(u)) {
                            c = new io.reactivex.exceptions.c("Inner queue full?!");
                        }
                        else {
                            if (this.getAndIncrement() != 0) {
                                return;
                            }
                            break Label_0204;
                        }
                    }
                }
                this.b(c);
                return;
            }
            this.h();
        }
        
        void o(final U u) {
            Label_0226: {
                IllegalStateException ex = null;
                Label_0177: {
                    if (this.get() == 0 && this.compareAndSet(0, 1)) {
                        final long value = this.Q.get();
                        final n<U> l = this.L;
                        if (value != 0L && (l == null || l.isEmpty())) {
                            this.G.m((Object)u);
                            if (value != Long.MAX_VALUE) {
                                this.Q.decrementAndGet();
                            }
                            if (this.J != Integer.MAX_VALUE && !this.O) {
                                final int v = this.V + 1;
                                this.V = v;
                                final int w = this.W;
                                if (v == w) {
                                    this.V = 0;
                                    this.R.v((long)w);
                                }
                            }
                        }
                        else {
                            y5.o<U> j;
                            if ((j = l) == null) {
                                j = this.j();
                            }
                            if (!j.offer(u)) {
                                ex = new IllegalStateException("Scalar queue full?!");
                                break Label_0177;
                            }
                        }
                        if (this.decrementAndGet() == 0) {
                            return;
                        }
                        break Label_0226;
                    }
                    else if (!this.j().offer(u)) {
                        ex = new IllegalStateException("Scalar queue full?!");
                    }
                    else {
                        if (this.getAndIncrement() != 0) {
                            return;
                        }
                        break Label_0226;
                    }
                }
                this.b(ex);
                return;
            }
            this.h();
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.Q, n);
                this.g();
            }
        }
        
        @Override
        public void z(final d r) {
            if (j.o(this.R, r)) {
                this.R = r;
                this.G.z((d)this);
                if (!this.O) {
                    final int j = this.J;
                    long n;
                    if (j == Integer.MAX_VALUE) {
                        n = Long.MAX_VALUE;
                    }
                    else {
                        n = j;
                    }
                    r.v(n);
                }
            }
        }
    }
}
