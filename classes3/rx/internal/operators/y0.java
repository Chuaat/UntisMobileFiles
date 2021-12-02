// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.d;
import rx.n;
import rx.internal.util.atomic.e;
import rx.internal.util.unsafe.z;
import rx.internal.util.unsafe.n0;
import rx.i;
import java.util.Queue;
import rx.o;
import rx.h;
import rx.g;
import java.util.concurrent.atomic.AtomicInteger;

public final class y0<T> extends AtomicInteger implements g.a<T>, h<T>, o
{
    private static final long O = -3741892510772238743L;
    static final b<?>[] P;
    static final b<?>[] Q;
    final Queue<T> G;
    final int H;
    final boolean I;
    final a<T> J;
    volatile boolean K;
    Throwable L;
    volatile i M;
    volatile b<T>[] N;
    
    static {
        P = new b[0];
        Q = new b[0];
    }
    
    public y0(final int n, final boolean i) {
        if (n > 0) {
            this.H = n;
            this.I = i;
            Object g;
            if (n0.f()) {
                g = new rx.internal.util.unsafe.z<T>(n);
            }
            else {
                g = new e<T>(n);
            }
            this.G = (Queue<T>)g;
            this.N = (b<T>[])y0.P;
            this.J = new a<T>(this);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("prefetch > 0 required but it was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public void b(final Throwable l) {
        this.L = l;
        this.K = true;
        this.t();
    }
    
    @Override
    public void c() {
        this.K = true;
        this.t();
    }
    
    @Override
    public boolean g() {
        return this.J.g();
    }
    
    @Override
    public void i() {
        this.J.i();
    }
    
    @Override
    public void m(final T t) {
        if (!this.G.offer(t)) {
            this.J.i();
            this.L = new d("Queue full?!");
            this.K = true;
        }
        this.t();
    }
    
    boolean n(final b<T> b) {
        final b<T>[] n = this.N;
        final b<?>[] q = y0.Q;
        if (n == q) {
            return false;
        }
        synchronized (this) {
            final b<T>[] n2 = this.N;
            if (n2 == q) {
                return false;
            }
            final int length = n2.length;
            final b[] n3 = new b[length + 1];
            System.arraycopy(n2, 0, n3, 0, length);
            n3[length] = b;
            this.N = (b<T>[])n3;
            return true;
        }
    }
    
    public void q(final n<? super T> n) {
        final b<T> b = new b<T>(n, this);
        n.r(b);
        n.s0(b);
        if (this.n(b)) {
            if (b.g()) {
                this.v(b);
            }
            else {
                this.t();
            }
        }
        else {
            final Throwable l = this.L;
            if (l != null) {
                n.b(l);
            }
            else {
                n.c();
            }
        }
    }
    
    boolean r(final boolean b, final boolean b2) {
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        if (b) {
            if (this.I) {
                if (b2) {
                    final b<T>[] x = this.x();
                    final Throwable l = this.L;
                    if (l != null) {
                        while (i < x.length) {
                            x[i].G.b(l);
                            ++i;
                        }
                    }
                    else {
                        for (int length = x.length, j = n; j < length; ++j) {
                            x[j].G.c();
                        }
                    }
                    return true;
                }
            }
            else {
                final Throwable k = this.L;
                if (k != null) {
                    this.G.clear();
                    final b<T>[] x2 = this.x();
                    for (int length2 = x2.length, n4 = n2; n4 < length2; ++n4) {
                        x2[n4].G.b(k);
                    }
                    return true;
                }
                if (b2) {
                    final b<T>[] x3 = this.x();
                    for (int length3 = x3.length, n5 = n3; n5 < length3; ++n5) {
                        x3[n5].G.c();
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    void s0(final i m) {
        (this.M = m).v(this.H);
    }
    
    void t() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        final Queue<T> g = this.G;
        int addAndGet = 0;
        do {
            long min = Long.MAX_VALUE;
            final b<T>[] n = this.N;
            final int length = n.length;
            for (int length2 = n.length, i = 0; i < length2; ++i) {
                min = Math.min(min, n[i].get());
            }
            if (length != 0) {
                long n2 = 0L;
                long n3;
                while (true) {
                    n3 = lcmp(n2, min);
                    if (n3 == 0) {
                        break;
                    }
                    final boolean k = this.K;
                    final T poll = g.poll();
                    final boolean b = poll == null;
                    if (this.r(k, b)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    for (int length3 = n.length, j = 0; j < length3; ++j) {
                        n[j].G.m((Object)poll);
                    }
                    ++n2;
                }
                if (n3 == 0 && this.r(this.K, g.isEmpty())) {
                    return;
                }
                if (n2 == 0L) {
                    continue;
                }
                final i m = this.M;
                if (m != null) {
                    m.v(n2);
                }
                for (int length4 = n.length, l = 0; l < length4; ++l) {
                    rx.internal.operators.a.i(n[l], n2);
                }
            }
        } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
    }
    
    void v(final b<T> b) {
        final b<T>[] n = this.N;
        final b<?>[] q = y0.Q;
        if (n != q) {
            final b<?>[] p = y0.P;
            if (n != p) {
                synchronized (this) {
                    final b<T>[] n2 = this.N;
                    if (n2 == q || n2 == p) {
                        return;
                    }
                    final int n3 = -1;
                    final int length = n2.length;
                    int n4 = 0;
                    int n5;
                    while (true) {
                        n5 = n3;
                        if (n4 >= length) {
                            break;
                        }
                        if (n2[n4] == b) {
                            n5 = n4;
                            break;
                        }
                        ++n4;
                    }
                    if (n5 < 0) {
                        return;
                    }
                    b<?>[] p2;
                    if (length == 1) {
                        p2 = y0.P;
                    }
                    else {
                        p2 = (b<?>[])new b[length - 1];
                        System.arraycopy(n2, 0, p2, 0, n5);
                        System.arraycopy(n2, n5 + 1, p2, n5, length - n5 - 1);
                    }
                    this.N = (b<T>[])p2;
                }
            }
        }
    }
    
    public n<T> w() {
        return this.J;
    }
    
    b<T>[] x() {
        final b<T>[] n = this.N;
        final b<?>[] q = y0.Q;
        final b<T>[] array = n;
        if (n != q) {
            synchronized (this) {
                if (this.N != q) {
                    this.N = (b<T>[])q;
                }
            }
        }
        return array;
    }
    
    static final class a<T> extends n<T>
    {
        final y0<T> L;
        
        public a(final y0<T> l) {
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
        }
        
        @Override
        public void c() {
            this.L.c();
        }
        
        @Override
        public void m(final T t) {
            this.L.m(t);
        }
        
        @Override
        public void s0(final i i) {
            this.L.s0(i);
        }
    }
    
    static final class b<T> extends AtomicLong implements i, o
    {
        private static final long J = 960704844171597367L;
        final n<? super T> G;
        final y0<T> H;
        final AtomicBoolean I;
        
        public b(final n<? super T> g, final y0<T> h) {
            this.G = g;
            this.H = h;
            this.I = new AtomicBoolean();
        }
        
        @Override
        public boolean g() {
            return this.I.get();
        }
        
        @Override
        public void i() {
            if (this.I.compareAndSet(false, true)) {
                this.H.v(this);
            }
        }
        
        @Override
        public void v(final long lng) {
            final long n = lcmp(lng, 0L);
            if (n >= 0) {
                if (n != 0) {
                    rx.internal.operators.a.b(this, lng);
                    this.H.t();
                }
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("n >= 0 required but it was ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
