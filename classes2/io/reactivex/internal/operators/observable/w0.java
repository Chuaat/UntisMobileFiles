// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import io.reactivex.exceptions.b;
import io.reactivex.internal.util.k;
import java.util.ArrayDeque;
import java.util.Queue;
import y5.n;
import java.util.concurrent.atomic.AtomicInteger;
import y5.j;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;

public final class w0<T, U> extends io.reactivex.internal.operators.observable.a<T, U>
{
    final o<? super T, ? extends g0<? extends U>> H;
    final boolean I;
    final int J;
    final int K;
    
    public w0(final g0<T> g0, final o<? super T, ? extends g0<? extends U>> h, final boolean i, final int j, final int k) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void L5(final i0<? super U> i0) {
        if (x2.b((g0<T>)super.G, (i0<? super Object>)i0, (o<? super T, ? extends g0<?>>)this.H)) {
            return;
        }
        super.G.c(new b<Object, Object>(i0, this.H, this.I, this.J, this.K));
    }
    
    static final class a<T, U> extends AtomicReference<c> implements i0<U>
    {
        private static final long L = -4606175640614850599L;
        final long G;
        final b<T, U> H;
        volatile boolean I;
        volatile y5.o<U> J;
        int K;
        
        a(final b<T, U> h, final long g) {
            this.G = g;
            this.H = h;
        }
        
        public void a() {
            d.b(this);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.H.N.a(t)) {
                final b<T, U> h = this.H;
                if (!h.I) {
                    h.d();
                }
                this.I = true;
                this.H.e();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void f() {
            this.I = true;
            this.H.e();
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c) && c instanceof j) {
                final j j = (j)c;
                final int e = j.E(7);
                if (e == 1) {
                    this.K = e;
                    this.J = (y5.o<U>)j;
                    this.I = true;
                    this.H.e();
                    return;
                }
                if (e == 2) {
                    this.K = e;
                    this.J = (y5.o<U>)j;
                }
            }
        }
        
        @Override
        public void m(final U u) {
            if (this.K == 0) {
                this.H.k(u, this);
            }
            else {
                this.H.e();
            }
        }
    }
    
    static final class b<T, U> extends AtomicInteger implements c, i0<T>
    {
        private static final long W = -2117620485640801370L;
        static final a<?, ?>[] X;
        static final a<?, ?>[] Y;
        final i0<? super U> G;
        final o<? super T, ? extends g0<? extends U>> H;
        final boolean I;
        final int J;
        final int K;
        volatile n<U> L;
        volatile boolean M;
        final io.reactivex.internal.util.c N;
        volatile boolean O;
        final AtomicReference<a<?, ?>[]> P;
        c Q;
        long R;
        long S;
        int T;
        Queue<g0<? extends U>> U;
        int V;
        
        static {
            X = new a[0];
            Y = new a[0];
        }
        
        b(final i0<? super U> g, final o<? super T, ? extends g0<? extends U>> h, final boolean i, final int n, final int k) {
            this.N = new io.reactivex.internal.util.c();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = n;
            this.K = k;
            if (n != Integer.MAX_VALUE) {
                this.U = new ArrayDeque<g0<? extends U>>(n);
            }
            this.P = new AtomicReference<a<?, ?>[]>(b.X);
        }
        
        boolean a(final a<T, U> a) {
            a[] expectedValue;
            a[] newValue;
            do {
                expectedValue = this.P.get();
                if (expectedValue == b.Y) {
                    a.a();
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new a[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = a;
            } while (!this.P.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.M) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            if (this.N.a(t)) {
                this.M = true;
                this.e();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        boolean c() {
            if (this.O) {
                return true;
            }
            final Throwable t = this.N.get();
            if (!this.I && t != null) {
                this.d();
                final Throwable c = this.N.c();
                if (c != k.a) {
                    this.G.b(c);
                }
                return true;
            }
            return false;
        }
        
        boolean d() {
            this.Q.dispose();
            final a[] array = this.P.get();
            final a<?, ?>[] y = b.Y;
            int i = 0;
            if (array != y) {
                final a[] array2 = this.P.getAndSet(y);
                if (array2 != y) {
                    while (i < array2.length) {
                        array2[i].a();
                        ++i;
                    }
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public void dispose() {
            if (!this.O) {
                this.O = true;
                if (this.d()) {
                    final Throwable c = this.N.c();
                    if (c != null && c != k.a) {
                        io.reactivex.plugins.a.Y(c);
                    }
                }
            }
        }
        
        void e() {
            if (this.getAndIncrement() == 0) {
                this.g();
            }
        }
        
        @Override
        public void f() {
            if (this.M) {
                return;
            }
            this.M = true;
            this.e();
        }
        
        void g() {
            final i0<? super U> g = this.G;
            int addAndGet = 1;
            while (!this.c()) {
                final n<U> l = this.L;
                Label_0059: {
                    if (l != null) {
                        while (!this.c()) {
                            final U poll = l.poll();
                            if (poll == null) {
                                break Label_0059;
                            }
                            g.m(poll);
                        }
                        return;
                    }
                }
                final boolean m = this.M;
                final n<U> i = this.L;
                final a[] array = this.P.get();
                final int length = array.length;
                int n = this.J;
                final int n2 = 0;
                Label_0129: {
                    if (n != Integer.MAX_VALUE) {
                        synchronized (this) {
                            n = this.U.size();
                            break Label_0129;
                        }
                    }
                    n = 0;
                }
                if (m && (i == null || i.isEmpty()) && length == 0 && n == 0) {
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
                int j = n2;
                if (length != 0) {
                    final long s = this.S;
                    final int t = this.T;
                    int n3 = 0;
                    Label_0328: {
                        if (length > t) {
                            n3 = t;
                            if (array[t].G == s) {
                                break Label_0328;
                            }
                        }
                        if (length <= (n3 = t)) {
                            n3 = 0;
                        }
                        for (int n4 = 0; n4 < length && array[n3].G != s; ++n4) {
                            if (++n3 == length) {
                                n3 = 0;
                            }
                        }
                        this.T = n3;
                        this.S = array[n3].G;
                    }
                    int k = 0;
                    int n5 = 0;
                    while (k < length) {
                        if (this.c()) {
                            return;
                        }
                        final a a = array[n3];
                        final y5.o<U> j2 = a.J;
                        Label_0554: {
                            Label_0551: {
                                Label_0467: {
                                    if (j2 != null) {
                                        try {
                                            do {
                                                final U poll2 = j2.poll();
                                                if (poll2 == null) {
                                                    break Label_0467;
                                                }
                                                g.m((U)poll2);
                                            } while (!this.c());
                                            return;
                                        }
                                        finally {
                                            final Throwable t2;
                                            io.reactivex.exceptions.b.b(t2);
                                            a.a();
                                            this.N.a(t2);
                                            if (this.c()) {
                                                return;
                                            }
                                            this.h(a);
                                            final int n6 = n5 + 1;
                                            final int n7 = n3 + 1;
                                            n5 = n6;
                                            if ((n3 = n7) == length) {
                                                n5 = n6;
                                                break Label_0551;
                                            }
                                            break Label_0554;
                                        }
                                    }
                                }
                                final boolean i2 = a.I;
                                final y5.o<U> j3 = a.J;
                                int n8 = n5;
                                Label_0526: {
                                    if (i2) {
                                        if (j3 != null) {
                                            n8 = n5;
                                            if (!j3.isEmpty()) {
                                                break Label_0526;
                                            }
                                        }
                                        this.h(a);
                                        if (this.c()) {
                                            return;
                                        }
                                        n8 = n5 + 1;
                                    }
                                }
                                final int n9 = n3 + 1;
                                n5 = n8;
                                if ((n3 = n9) != length) {
                                    break Label_0554;
                                }
                                n5 = n8;
                            }
                            n3 = 0;
                        }
                        ++k;
                    }
                    this.T = n3;
                    this.S = array[n3].G;
                    j = n5;
                }
                Label_0656: {
                    if (j != 0) {
                        if (this.J != Integer.MAX_VALUE) {
                            while (j != 0) {
                                synchronized (this) {
                                    final g0<? extends U> g2 = this.U.poll();
                                    if (g2 == null) {
                                        --this.V;
                                    }
                                    // monitorexit(this)
                                    else {
                                        // monitorexit(this)
                                        this.j(g2);
                                    }
                                    --j;
                                    continue;
                                }
                                break Label_0656;
                            }
                            continue;
                        }
                        continue;
                    }
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        void h(final a<T, U> a) {
            a[] expectedValue;
            a<?, ?>[] x;
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
                    x = b.X;
                }
                else {
                    x = (a<?, ?>[])new a[length - 1];
                    System.arraycopy(expectedValue, 0, x, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, x, n3, length - n3 - 1);
                }
            } while (!this.P.compareAndSet(expectedValue, x));
        }
        
        @Override
        public boolean i() {
            return this.O;
        }
        
        void j(final g0<? extends U> g0) {
            while (g0 instanceof Callable) {
                if (this.n((Callable<? extends U>)g0) && this.J != Integer.MAX_VALUE) {
                    boolean b = false;
                    synchronized (this) {
                        if (this.U.poll() == null) {
                            --this.V;
                            b = true;
                        }
                        // monitorexit(this)
                        if (b) {
                            this.e();
                            return;
                        }
                        continue;
                    }
                    break;
                }
                return;
            }
            final long r = this.R;
            this.R = 1L + r;
            final a a = new a<Object, Object>((b<Object, Object>)this, r);
            if (this.a((a<T, U>)a)) {
                g0.c((i0<? super Object>)a);
            }
        }
        
        void k(final U u, final a<T, U> a) {
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                this.G.m((Object)u);
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            else {
                Object j;
                if ((j = a.J) == null) {
                    j = new io.reactivex.internal.queue.c<Object>(this.K);
                    a.J = (y5.o<U>)j;
                }
                ((y5.o<U>)j).offer((U)u);
                if (this.getAndIncrement() != 0) {
                    return;
                }
            }
            this.g();
        }
        
        @Override
        public void l(final c q) {
            if (d.l(this.Q, q)) {
                this.Q = q;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.M) {
                return;
            }
            try {
                final g0<?> g0 = io.reactivex.internal.functions.b.g((g0<?>)this.H.apply((Object)t), "The mapper returned a null ObservableSource");
                if (this.J != Integer.MAX_VALUE) {
                    synchronized (this) {
                        final int v = this.V;
                        if (v == this.J) {
                            this.U.offer((g0<? extends U>)g0);
                            return;
                        }
                        this.V = v + 1;
                    }
                }
                this.j((g0<? extends U>)g0);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.Q.dispose();
                this.b(t2);
            }
        }
        
        boolean n(final Callable<? extends U> callable) {
            try {
                final U call = (U)callable.call();
                if (call == null) {
                    return true;
                }
                if (this.get() == 0 && this.compareAndSet(0, 1)) {
                    this.G.m((Object)call);
                    if (this.decrementAndGet() == 0) {
                        return true;
                    }
                }
                else {
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
                    if (!l.offer(call)) {
                        this.b(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (this.getAndIncrement() != 0) {
                        return false;
                    }
                }
                this.g();
                return true;
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.N.a(t);
                this.e();
                return true;
            }
        }
    }
}
