// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import io.reactivex.internal.util.q;
import io.reactivex.internal.util.k;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import java.util.concurrent.TimeUnit;
import io.reactivex.j0;
import io.reactivex.b0;
import x5.o;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.g0;
import y5.g;
import io.reactivex.observables.a;

public final class r2<T> extends io.reactivex.observables.a<T> implements y5.g<T>, io.reactivex.internal.disposables.g
{
    static final b K;
    final g0<T> G;
    final AtomicReference<j<T>> H;
    final b<T> I;
    final g0<T> J;
    
    static {
        K = (b)new o();
    }
    
    private r2(final g0<T> j, final g0<T> g, final AtomicReference<j<T>> h, final b<T> i) {
        this.J = j;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public static <T> io.reactivex.observables.a<T> A8(final g0<? extends T> g0) {
        return z8((g0<T>)g0, r2.K);
    }
    
    public static <U, R> b0<R> B8(final Callable<? extends io.reactivex.observables.a<U>> callable, final x5.o<? super b0<U>, ? extends g0<R>> o) {
        return io.reactivex.plugins.a.R((b0<R>)new e((Callable<? extends io.reactivex.observables.a<Object>>)callable, (x5.o<? super b0<Object>, ? extends g0<Object>>)o));
    }
    
    public static <T> io.reactivex.observables.a<T> C8(final io.reactivex.observables.a<T> a, final j0 j0) {
        return io.reactivex.plugins.a.U(new g<T>(a, a.e4(j0)));
    }
    
    public static <T> io.reactivex.observables.a<T> w8(final g0<T> g0, final int n) {
        if (n == Integer.MAX_VALUE) {
            return A8((g0<? extends T>)g0);
        }
        return z8(g0, (b<T>)new i(n));
    }
    
    public static <T> io.reactivex.observables.a<T> x8(final g0<T> g0, final long n, final TimeUnit timeUnit, final j0 j0) {
        return y8(g0, n, timeUnit, j0, Integer.MAX_VALUE);
    }
    
    public static <T> io.reactivex.observables.a<T> y8(final g0<T> g0, final long n, final TimeUnit timeUnit, final j0 j0, final int n2) {
        return z8(g0, (b<T>)new l(n2, n, timeUnit, j0));
    }
    
    static <T> io.reactivex.observables.a<T> z8(final g0<T> g0, final b<T> b) {
        final AtomicReference<j<T>> atomicReference = (AtomicReference<j<T>>)new AtomicReference<j<Object>>();
        return io.reactivex.plugins.a.U(new r2<T>(new k<Object>((AtomicReference<j<Object>>)atomicReference, (b<Object>)b), (g0<Object>)g0, (AtomicReference<j<Object>>)atomicReference, (b<Object>)b));
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        this.J.c(i0);
    }
    
    @Override
    public void d(final io.reactivex.disposables.c c) {
        this.H.compareAndSet((j<T>)c, null);
    }
    
    @Override
    public void p8(final x5.g<? super io.reactivex.disposables.c> g) {
        j<T> expectedValue;
        j<T> newValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue != null) {
                newValue = expectedValue;
                if (!expectedValue.i()) {
                    break;
                }
            }
            newValue = new j<T>(this.I.call());
        } while (!this.H.compareAndSet(expectedValue, newValue));
        boolean b;
        if (!newValue.J.get() && newValue.J.compareAndSet(false, true)) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            g.accept(newValue);
            if (b) {
                this.G.c(newValue);
            }
        }
        finally {
            if (b) {
                newValue.J.compareAndSet(true, false);
            }
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            throw io.reactivex.internal.util.k.f(t);
        }
    }
    
    @Override
    public g0<T> source() {
        return this.G;
    }
    
    abstract static class a<T> extends AtomicReference<f> implements h<T>
    {
        private static final long I = 2346567790059478686L;
        f G;
        int H;
        
        a() {
            this.set(this.G = new f(null));
        }
        
        final void a(final f f) {
            this.G.set(f);
            this.G = f;
            ++this.H;
        }
        
        @Override
        public final void b() {
            this.a(new f(this.d(q.h())));
            this.q();
        }
        
        final void c(final Collection<? super T> collection) {
            f e = this.e();
            while (true) {
                e = (f)e.get();
                if (e == null) {
                    break;
                }
                final Object j = this.j(e.G);
                if (q.p(j)) {
                    break;
                }
                if (q.u(j)) {
                    break;
                }
                collection.add((Object)q.o(j));
            }
        }
        
        Object d(final Object o) {
            return o;
        }
        
        f e() {
            return this.get();
        }
        
        @Override
        public final void f(final T t) {
            this.a(new f(this.d(q.y(t))));
            this.p();
        }
        
        boolean g() {
            final Object g = this.G.G;
            return g != null && q.p(this.j(g));
        }
        
        boolean h() {
            final Object g = this.G.G;
            return g != null && q.u(this.j(g));
        }
        
        @Override
        public final void i(final Throwable t) {
            this.a(new f(this.d(q.j(t))));
            this.q();
        }
        
        Object j(final Object o) {
            return o;
        }
        
        final void k() {
            final f f = this.get().get();
            --this.H;
            this.n(f);
        }
        
        @Override
        public final void l(final d<T> d) {
            if (d.getAndIncrement() != 0) {
                return;
            }
            int addAndGet = 1;
            do {
                f e = null;
                Label_0010: {
                    if ((e = d.a()) == null) {
                        e = this.e();
                        d.I = e;
                    }
                }
                while (!d.i()) {
                    final f f = e.get();
                    if (f == null) {
                        d.I = e;
                        continue Label_0010;
                    }
                    if (q.b(this.j(f.G), (i0<? super Object>)d.H)) {
                        d.I = null;
                        return;
                    }
                    e = f;
                }
                d.I = null;
            } while ((addAndGet = d.addAndGet(-addAndGet)) != 0);
        }
        
        final void m(int i) {
            f f = this.get();
            while (i > 0) {
                f = (f)f.get();
                --i;
                --this.H;
            }
            this.n(f);
        }
        
        final void n(final f newValue) {
            this.set(newValue);
        }
        
        final void o() {
            final f f = this.get();
            if (f.G != null) {
                final f newValue = new f(null);
                newValue.lazySet(f.get());
                this.set(newValue);
            }
        }
        
        abstract void p();
        
        void q() {
            this.o();
        }
    }
    
    interface b<T>
    {
        h<T> call();
    }
    
    static final class c<R> implements x5.g<io.reactivex.disposables.c>
    {
        private final n4<R> G;
        
        c(final n4<R> g) {
            this.G = g;
        }
        
        public void a(final io.reactivex.disposables.c c) {
            this.G.a(c);
        }
    }
    
    static final class d<T> extends AtomicInteger implements c
    {
        private static final long K = 2728361546769921047L;
        final j<T> G;
        final i0<? super T> H;
        Object I;
        volatile boolean J;
        
        d(final j<T> g, final i0<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
         <U> U a() {
            return (U)this.I;
        }
        
        @Override
        public void dispose() {
            if (!this.J) {
                this.J = true;
                this.G.c(this);
                this.I = null;
            }
        }
        
        @Override
        public boolean i() {
            return this.J;
        }
    }
    
    static final class e<R, U> extends b0<R>
    {
        private final Callable<? extends io.reactivex.observables.a<U>> G;
        private final x5.o<? super b0<U>, ? extends g0<R>> H;
        
        e(final Callable<? extends io.reactivex.observables.a<U>> g, final x5.o<? super b0<U>, ? extends g0<R>> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        protected void L5(i0<? super R> n4) {
            try {
                final io.reactivex.observables.a<?> a = io.reactivex.internal.functions.b.g((io.reactivex.observables.a<?>)this.G.call(), "The connectableFactory returned a null ConnectableObservable");
                final g0 g0 = io.reactivex.internal.functions.b.g((g0)this.H.apply((Object)a), "The selector returned a null ObservableSource");
                n4 = new n4((i0<? super Object>)n4);
                g0.c(n4);
                a.p8(new c<Object>(n4));
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                io.reactivex.internal.disposables.e.l(t, n4);
            }
        }
    }
    
    static final class f extends AtomicReference<f>
    {
        private static final long H = 245354315435971818L;
        final Object G;
        
        f(final Object g) {
            this.G = g;
        }
    }
    
    static final class g<T> extends a<T>
    {
        private final a<T> G;
        private final b0<T> H;
        
        g(final a<T> g, final b0<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        protected void L5(final i0<? super T> i0) {
            this.H.c(i0);
        }
        
        @Override
        public void p8(final x5.g<? super io.reactivex.disposables.c> g) {
            this.G.p8(g);
        }
    }
    
    interface h<T>
    {
        void b();
        
        void f(final T p0);
        
        void i(final Throwable p0);
        
        void l(final d<T> p0);
    }
    
    static final class i<T> implements b<T>
    {
        private final int a;
        
        i(final int a) {
            this.a = a;
        }
        
        @Override
        public h<T> call() {
            return new n<T>(this.a);
        }
    }
    
    static final class j<T> extends AtomicReference<c> implements i0<T>, c
    {
        private static final long K = -533785617179540163L;
        static final d[] L;
        static final d[] M;
        final h<T> G;
        boolean H;
        final AtomicReference<d[]> I;
        final AtomicBoolean J;
        
        static {
            L = new d[0];
            M = new d[0];
        }
        
        j(final h<T> g) {
            this.G = g;
            this.I = new AtomicReference<d[]>(j.L);
            this.J = new AtomicBoolean();
        }
        
        boolean a(final d<T> d) {
            d[] expectedValue;
            d[] newValue;
            do {
                expectedValue = this.I.get();
                if (expectedValue == j.M) {
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new d[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = d;
            } while (!this.I.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.H) {
                this.H = true;
                this.G.i(t);
                this.e();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c(final d<T> obj) {
            d[] expectedValue;
            d[] l;
            do {
                expectedValue = this.I.get();
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
                    if (expectedValue[n2].equals(obj)) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    l = j.L;
                }
                else {
                    l = new d[length - 1];
                    System.arraycopy(expectedValue, 0, l, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, l, n3, length - n3 - 1);
                }
            } while (!this.I.compareAndSet(expectedValue, l));
        }
        
        void d() {
            final d[] array = this.I.get();
            for (int length = array.length, i = 0; i < length; ++i) {
                this.G.l(array[i]);
            }
        }
        
        @Override
        public void dispose() {
            this.I.set(j.M);
            io.reactivex.internal.disposables.d.b(this);
        }
        
        void e() {
            final d[] array = this.I.getAndSet(j.M);
            for (int length = array.length, i = 0; i < length; ++i) {
                this.G.l(array[i]);
            }
        }
        
        @Override
        public void f() {
            if (!this.H) {
                this.H = true;
                this.G.b();
                this.e();
            }
        }
        
        @Override
        public boolean i() {
            return this.I.get() == j.M;
        }
        
        @Override
        public void l(final c c) {
            if (io.reactivex.internal.disposables.d.j(this, c)) {
                this.d();
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.H) {
                this.G.f(t);
                this.d();
            }
        }
    }
    
    static final class k<T> implements g0<T>
    {
        private final AtomicReference<j<T>> G;
        private final b<T> H;
        
        k(final AtomicReference<j<T>> g, final b<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void c(final i0<? super T> i0) {
            j newValue;
            while ((newValue = this.G.get()) == null) {
                newValue = new j((h<T>)this.H.call());
                if (!this.G.compareAndSet(null, newValue)) {
                    continue;
                }
                break;
            }
            final d d = new d(newValue, i0);
            i0.l(d);
            newValue.a((d<T>)d);
            if (d.i()) {
                newValue.c((d<T>)d);
                return;
            }
            newValue.G.l((d<T>)d);
        }
    }
    
    static final class l<T> implements b<T>
    {
        private final int a;
        private final long b;
        private final TimeUnit c;
        private final j0 d;
        
        l(final int a, final long b, final TimeUnit c, final j0 d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public h<T> call() {
            return new m<T>(this.a, this.b, this.c, this.d);
        }
    }
    
    static final class m<T> extends a<T>
    {
        private static final long N = 3457957419649567404L;
        final j0 J;
        final long K;
        final TimeUnit L;
        final int M;
        
        m(final int m, final long k, final TimeUnit l, final j0 j) {
            this.J = j;
            this.M = m;
            this.K = k;
            this.L = l;
        }
        
        @Override
        Object d(final Object o) {
            return new io.reactivex.schedulers.d(o, this.J.d(this.L), this.L);
        }
        
        @Override
        f e() {
            final long d = this.J.d(this.L);
            final long k = this.K;
            f f = this.get();
            f f2;
            io.reactivex.schedulers.d d2;
            do {
                f2 = f;
                f = (f)f2.get();
                if (f == null) {
                    break;
                }
                d2 = (io.reactivex.schedulers.d)f.G;
                if (q.p(d2.d())) {
                    break;
                }
                if (q.u(d2.d())) {
                    break;
                }
            } while (d2.a() <= d - k);
            return f2;
        }
        
        @Override
        Object j(final Object o) {
            return ((io.reactivex.schedulers.d)o).d();
        }
        
        @Override
        void p() {
            final long d = this.J.d(this.L);
            final long k = this.K;
            f f = this.get();
            f f2 = f.get();
            int n = 0;
            while (f2 != null) {
                final int h = super.H;
                if (h > this.M) {
                    ++n;
                    super.H = h - 1;
                }
                else {
                    if (((io.reactivex.schedulers.d)f2.G).a() > d - k) {
                        break;
                    }
                    ++n;
                    --super.H;
                }
                final f f3 = f2.get();
                f = f2;
                f2 = f3;
            }
            if (n != 0) {
                this.n(f);
            }
        }
        
        @Override
        void q() {
            final long d = this.J.d(this.L);
            final long k = this.K;
            f f = this.get();
            f f2 = f.get();
            int n = 0;
            while (f2 != null && super.H > 1 && ((io.reactivex.schedulers.d)f2.G).a() <= d - k) {
                ++n;
                --super.H;
                final f f3 = f2.get();
                f = f2;
                f2 = f3;
            }
            if (n != 0) {
                this.n(f);
            }
        }
    }
    
    static final class n<T> extends a<T>
    {
        private static final long K = -5898283885385201806L;
        final int J;
        
        n(final int j) {
            this.J = j;
        }
        
        @Override
        void p() {
            if (super.H > this.J) {
                this.k();
            }
        }
    }
    
    static final class o implements b<Object>
    {
        @Override
        public h<Object> call() {
            return new p<Object>(16);
        }
    }
    
    static final class p<T> extends ArrayList<Object> implements h<T>
    {
        private static final long H = 7063189396499112664L;
        volatile int G;
        
        p(final int initialCapacity) {
            super(initialCapacity);
        }
        
        @Override
        public void b() {
            this.add(q.h());
            ++this.G;
        }
        
        @Override
        public void f(final T t) {
            this.add(q.y(t));
            ++this.G;
        }
        
        @Override
        public void i(final Throwable t) {
            this.add(q.j(t));
            ++this.G;
        }
        
        @Override
        public void l(final d<T> d) {
            if (d.getAndIncrement() != 0) {
                return;
            }
            final i0<? super T> h = (i0<? super T>)d.H;
            int addAndGet = 1;
            while (!d.i()) {
                final int g = this.G;
                final Integer n = d.a();
                int i;
                if (n != null) {
                    i = n;
                }
                else {
                    i = 0;
                }
                while (i < g) {
                    if (q.b(this.get(i), (i0<? super Object>)h)) {
                        return;
                    }
                    if (d.i()) {
                        return;
                    }
                    ++i;
                }
                d.I = i;
                if ((addAndGet = d.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
    }
}
