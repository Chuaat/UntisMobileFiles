// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.subscribers.v;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.d;
import java.util.Collection;
import io.reactivex.internal.util.k;
import io.reactivex.q;
import io.reactivex.disposables.c;
import x5.o;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import o7.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.l;
import java.util.concurrent.Callable;
import io.reactivex.internal.disposables.g;
import y5.h;
import io.reactivex.flowables.a;

public final class d3<T> extends io.reactivex.flowables.a<T> implements y5.h<T>, io.reactivex.internal.disposables.g
{
    static final Callable L;
    final io.reactivex.l<T> H;
    final AtomicReference<j<T>> I;
    final Callable<? extends g<T>> J;
    final o7.b<T> K;
    
    static {
        L = new c();
    }
    
    private d3(final o7.b<T> k, final io.reactivex.l<T> h, final AtomicReference<j<T>> i, final Callable<? extends g<T>> j) {
        this.K = k;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public static <T> io.reactivex.flowables.a<T> a9(final io.reactivex.l<T> l, final int n) {
        if (n == Integer.MAX_VALUE) {
            return e9((io.reactivex.l<? extends T>)l);
        }
        return d9(l, (Callable<? extends g<T>>)new h(n));
    }
    
    public static <T> io.reactivex.flowables.a<T> b9(final io.reactivex.l<T> l, final long n, final TimeUnit timeUnit, final j0 j0) {
        return c9(l, n, timeUnit, j0, Integer.MAX_VALUE);
    }
    
    public static <T> io.reactivex.flowables.a<T> c9(final io.reactivex.l<T> l, final long n, final TimeUnit timeUnit, final j0 j0, final int n2) {
        return d9(l, (Callable<? extends g<T>>)new k(n2, n, timeUnit, j0));
    }
    
    static <T> io.reactivex.flowables.a<T> d9(final io.reactivex.l<T> l, final Callable<? extends g<T>> callable) {
        final AtomicReference<j<T>> atomicReference = new AtomicReference<j<T>>();
        return io.reactivex.plugins.a.T(new d3<T>((o7.b<Object>)new i((AtomicReference<j<Object>>)atomicReference, (Callable<? extends g<Object>>)callable), (io.reactivex.l<Object>)l, (AtomicReference<j<Object>>)atomicReference, (Callable<? extends g<Object>>)callable));
    }
    
    public static <T> io.reactivex.flowables.a<T> e9(final io.reactivex.l<? extends T> l) {
        return d9((io.reactivex.l<T>)l, d3.L);
    }
    
    public static <U, R> io.reactivex.l<R> f9(final Callable<? extends io.reactivex.flowables.a<U>> callable, final o<? super io.reactivex.l<U>, ? extends o7.b<R>> o) {
        return (io.reactivex.l<R>)new e((Callable<? extends io.reactivex.flowables.a<Object>>)callable, (o<? super io.reactivex.l<Object>, ? extends o7.b<Object>>)o);
    }
    
    public static <T> io.reactivex.flowables.a<T> g9(final io.reactivex.flowables.a<T> a, final j0 j0) {
        return io.reactivex.plugins.a.T(new b<T>(a, a.o4(j0)));
    }
    
    @Override
    public void T8(final x5.g<? super io.reactivex.disposables.c> g) {
        while (true) {
            final j<T> expectedValue = this.I.get();
            Label_0061: {
                if (expectedValue != null) {
                    final j<T> newValue = expectedValue;
                    if (!expectedValue.i()) {
                        break Label_0061;
                    }
                }
                try {
                    final j<T> newValue = new j<T>((g<T>)this.J.call());
                    if (!this.I.compareAndSet(expectedValue, newValue)) {
                        continue;
                    }
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
                            this.H.m6(newValue);
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
                finally {
                    io.reactivex.exceptions.b.b((Throwable)g);
                    throw io.reactivex.internal.util.k.f((Throwable)g);
                }
            }
        }
    }
    
    @Override
    public void d(final io.reactivex.disposables.c c) {
        this.I.compareAndSet((j<T>)c, null);
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        this.K.e((o7.c)c);
    }
    
    @Override
    public o7.b<T> source() {
        return (o7.b<T>)this.H;
    }
    
    static class a<T> extends AtomicReference<f> implements g<T>
    {
        private static final long J = 2346567790059478686L;
        f G;
        int H;
        long I;
        
        a() {
            this.set(this.G = new f(null, 0L));
        }
        
        final void a(final f f) {
            this.G.set(f);
            this.G = f;
            ++this.H;
        }
        
        @Override
        public final void b() {
            final Object d = this.d(io.reactivex.internal.util.q.h());
            final long i = this.I + 1L;
            this.I = i;
            this.a(new f(d, i));
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
                if (io.reactivex.internal.util.q.p(j)) {
                    break;
                }
                if (io.reactivex.internal.util.q.u(j)) {
                    break;
                }
                collection.add((Object)io.reactivex.internal.util.q.o(j));
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
            final Object d = this.d(io.reactivex.internal.util.q.y(t));
            final long i = this.I + 1L;
            this.I = i;
            this.a(new f(d, i));
            this.p();
        }
        
        boolean g() {
            final Object g = this.G.G;
            return g != null && io.reactivex.internal.util.q.p(this.j(g));
        }
        
        boolean h() {
            final Object g = this.G.G;
            return g != null && io.reactivex.internal.util.q.u(this.j(g));
        }
        
        @Override
        public final void i(final Throwable t) {
            final Object d = this.d(io.reactivex.internal.util.q.j(t));
            final long i = this.I + 1L;
            this.I = i;
            this.a(new f(d, i));
            this.q();
        }
        
        Object j(final Object o) {
            return o;
        }
        
        final void k() {
            final f f = this.get().get();
            if (f != null) {
                --this.H;
                this.n(f);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }
        
        @Override
        public final void l(final d<T> d) {
            synchronized (d) {
                if (d.K) {
                    d.L = true;
                    return;
                }
                d.K = true;
                // monitorexit(d)
                while (!d.i()) {
                    long value = d.get();
                    final boolean b = value == Long.MAX_VALUE;
                    Object o;
                    if ((o = d.a()) == null) {
                        o = this.e();
                        d.I = o;
                        d.a(d.J, ((f)o).H);
                    }
                    long n = 0L;
                    while (value != 0L) {
                        final f f = ((AtomicReference<f>)o).get();
                        if (f != null) {
                            o = this.j(f.G);
                            try {
                                if (io.reactivex.internal.util.q.d(o, (o7.c<? super Object>)d.H)) {
                                    d.I = null;
                                    return;
                                }
                                ++n;
                                --value;
                                if (d.i()) {
                                    d.I = null;
                                    return;
                                }
                                o = f;
                                continue;
                            }
                            finally {
                                final Throwable t;
                                io.reactivex.exceptions.b.b(t);
                                d.I = null;
                                d.dispose();
                                if (!io.reactivex.internal.util.q.u(o) && !io.reactivex.internal.util.q.p(o)) {
                                    d.H.b(t);
                                }
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    if (n != 0L) {
                        d.I = o;
                        if (!b) {
                            d.b(n);
                        }
                    }
                    synchronized (d) {
                        if (!d.L) {
                            d.K = false;
                            return;
                        }
                        d.L = false;
                        continue;
                    }
                }
                d.I = null;
            }
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
                final f newValue = new f(null, 0L);
                newValue.lazySet(f.get());
                this.set(newValue);
            }
        }
        
        void p() {
        }
        
        void q() {
            this.o();
        }
    }
    
    static final class b<T> extends a<T>
    {
        private final a<T> H;
        private final l<T> I;
        
        b(final a<T> h, final l<T> i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void T8(final x5.g<? super io.reactivex.disposables.c> g) {
            this.H.T8(g);
        }
        
        @Override
        protected void n6(final o7.c<? super T> c) {
            this.I.e(c);
        }
    }
    
    static final class c implements Callable<Object>
    {
        @Override
        public Object call() {
            return new n(16);
        }
    }
    
    static final class d<T> extends AtomicLong implements o7.d, c
    {
        private static final long M = -4453897557930727610L;
        static final long N = Long.MIN_VALUE;
        final j<T> G;
        final o7.c<? super T> H;
        Object I;
        final AtomicLong J;
        boolean K;
        boolean L;
        
        d(final j<T> g, final o7.c<? super T> h) {
            this.G = g;
            this.H = h;
            this.J = new AtomicLong();
        }
        
         <U> U a() {
            return (U)this.I;
        }
        
        public long b(final long n) {
            return io.reactivex.internal.util.d.f(this, n);
        }
        
        public void cancel() {
            this.dispose();
        }
        
        public void dispose() {
            if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.G.d(this);
                this.G.c();
                this.I = null;
            }
        }
        
        public boolean i() {
            return this.get() == Long.MIN_VALUE;
        }
        
        public void v(final long n) {
            if (io.reactivex.internal.subscriptions.j.m(n) && io.reactivex.internal.util.d.b(this, n) != Long.MIN_VALUE) {
                io.reactivex.internal.util.d.a(this.J, n);
                this.G.c();
                this.G.G.l(this);
            }
        }
    }
    
    static final class e<R, U> extends l<R>
    {
        private final Callable<? extends io.reactivex.flowables.a<U>> H;
        private final o<? super l<U>, ? extends o7.b<R>> I;
        
        e(final Callable<? extends io.reactivex.flowables.a<U>> h, final o<? super l<U>, ? extends o7.b<R>> i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        protected void n6(o7.c<? super R> v) {
            try {
                final io.reactivex.flowables.a<?> a = io.reactivex.internal.functions.b.g((io.reactivex.flowables.a<?>)this.H.call(), "The connectableFactory returned null");
                try {
                    final o7.b b = io.reactivex.internal.functions.b.g((o7.b)this.I.apply((Object)a), "The selector returned a null Publisher");
                    v = new v<Object>((o7.c<? super Object>)v);
                    b.e((o7.c)v);
                    a.T8(new a((v<R>)v));
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.internal.subscriptions.g.d(t, (o7.c<?>)v);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                io.reactivex.internal.subscriptions.g.d(t2, (o7.c<?>)v);
            }
        }
        
        final class a implements x5.g<io.reactivex.disposables.c>
        {
            private final v<R> G;
            
            a(final v<R> g) {
                this.G = g;
            }
            
            public void a(final io.reactivex.disposables.c c) {
                this.G.a(c);
            }
        }
    }
    
    static final class f extends AtomicReference<f>
    {
        private static final long I = 245354315435971818L;
        final Object G;
        final long H;
        
        f(final Object g, final long h) {
            this.G = g;
            this.H = h;
        }
    }
    
    interface g<T>
    {
        void b();
        
        void f(final T p0);
        
        void i(final Throwable p0);
        
        void l(final d<T> p0);
    }
    
    static final class h<T> implements Callable<g<T>>
    {
        private final int G;
        
        h(final int g) {
            this.G = g;
        }
        
        public g<T> a() {
            return new m<T>(this.G);
        }
    }
    
    static final class i<T> implements o7.b<T>
    {
        private final AtomicReference<j<T>> G;
        private final Callable<? extends g<T>> H;
        
        i(final AtomicReference<j<T>> g, final Callable<? extends g<T>> h) {
            this.G = g;
            this.H = h;
        }
        
        public void e(final o7.c<? super T> c) {
            j j;
            while ((j = this.G.get()) == null) {
                try {
                    if (!this.G.compareAndSet(null, (j<T>)new j((g<Object>)this.H.call()))) {
                        continue;
                    }
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)j);
                    io.reactivex.internal.subscriptions.g.d((Throwable)j, c);
                    return;
                }
                break;
            }
            final d d = new d(j, (o7.c<? super Object>)c);
            c.z((o7.d)d);
            j.a((d<Object>)d);
            if (d.i()) {
                j.d((d<Object>)d);
                return;
            }
            j.c();
            j.G.l((d<T>)d);
        }
    }
    
    static final class j<T> extends AtomicReference<o7.d> implements q<T>, c
    {
        private static final long N = 7224554242710036740L;
        static final d[] O;
        static final d[] P;
        final g<T> G;
        boolean H;
        final AtomicReference<d<T>[]> I;
        final AtomicBoolean J;
        final AtomicInteger K;
        long L;
        long M;
        
        static {
            O = new d[0];
            P = new d[0];
        }
        
        j(final g<T> g) {
            this.G = g;
            this.K = new AtomicInteger();
            this.I = new AtomicReference<d<T>[]>(j.O);
            this.J = new AtomicBoolean();
        }
        
        boolean a(final d<T> obj) {
            Objects.requireNonNull(obj);
            d[] expectedValue;
            d[] newValue;
            do {
                expectedValue = this.I.get();
                if (expectedValue == j.P) {
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new d[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = obj;
            } while (!this.I.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        public void b(final Throwable t) {
            if (!this.H) {
                this.H = true;
                this.G.i(t);
                final d[] array = this.I.getAndSet(j.P);
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.G.l(array[i]);
                }
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            if (this.K.getAndIncrement() != 0) {
                return;
            }
            int addAndGet = 1;
            while (!this.i()) {
                final d[] array = this.I.get();
                final long l = this.L;
                final int length = array.length;
                int i = 0;
                long max = l;
                while (i < length) {
                    max = Math.max(max, array[i].J.get());
                    ++i;
                }
                final long m = this.M;
                final o7.d d = this.get();
                final long n = max - l;
                Label_0199: {
                    long n2;
                    if (n != 0L) {
                        this.L = max;
                        if (d == null) {
                            long j;
                            if ((j = m + n) < 0L) {
                                j = Long.MAX_VALUE;
                            }
                            this.M = j;
                            break Label_0199;
                        }
                        if (m == 0L) {
                            d.v(n);
                            break Label_0199;
                        }
                        this.M = 0L;
                        n2 = m + n;
                    }
                    else {
                        if (m == 0L || d == null) {
                            break Label_0199;
                        }
                        this.M = 0L;
                        n2 = m;
                    }
                    d.v(n2);
                }
                if ((addAndGet = this.K.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        void d(final d<T> obj) {
            d[] expectedValue;
            d[] o;
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
                    if (expectedValue[n2].equals((Object)obj)) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    o = j.O;
                }
                else {
                    o = new d[length - 1];
                    System.arraycopy(expectedValue, 0, o, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, o, n3, length - n3 - 1);
                }
            } while (!this.I.compareAndSet(expectedValue, o));
        }
        
        @Override
        public void dispose() {
            this.I.set(j.P);
            io.reactivex.internal.subscriptions.j.b(this);
        }
        
        public void f() {
            if (!this.H) {
                this.H = true;
                this.G.b();
                final d[] array = this.I.getAndSet(j.P);
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.G.l(array[i]);
                }
            }
        }
        
        @Override
        public boolean i() {
            return this.I.get() == j.P;
        }
        
        public void m(final T t) {
            if (!this.H) {
                this.G.f(t);
                final d[] array = this.I.get();
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.G.l(array[i]);
                }
            }
        }
        
        @Override
        public void z(final o7.d d) {
            if (io.reactivex.internal.subscriptions.j.k(this, d)) {
                this.c();
                final d[] array = this.I.get();
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.G.l(array[i]);
                }
            }
        }
    }
    
    static final class k<T> implements Callable<g<T>>
    {
        private final int G;
        private final long H;
        private final TimeUnit I;
        private final j0 J;
        
        k(final int g, final long h, final TimeUnit i, final j0 j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public g<T> a() {
            return new l<T>(this.G, this.H, this.I, this.J);
        }
    }
    
    static final class l<T> extends d3.a<T>
    {
        private static final long O = 3457957419649567404L;
        final j0 K;
        final long L;
        final TimeUnit M;
        final int N;
        
        l(final int n, final long l, final TimeUnit m, final j0 k) {
            this.K = k;
            this.N = n;
            this.L = l;
            this.M = m;
        }
        
        @Override
        Object d(final Object o) {
            return new io.reactivex.schedulers.d(o, this.K.d(this.M), this.M);
        }
        
        @Override
        f e() {
            final long d = this.K.d(this.M);
            final long l = this.L;
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
                if (io.reactivex.internal.util.q.p(d2.d())) {
                    break;
                }
                if (io.reactivex.internal.util.q.u(d2.d())) {
                    break;
                }
            } while (d2.a() <= d - l);
            return f2;
        }
        
        @Override
        Object j(final Object o) {
            return ((io.reactivex.schedulers.d)o).d();
        }
        
        @Override
        void p() {
            final long d = this.K.d(this.M);
            final long l = this.L;
            f f = this.get();
            f f2 = f.get();
            int n = 0;
            while (f2 != null) {
                final int h = super.H;
                if (h > this.N) {
                    ++n;
                    super.H = h - 1;
                }
                else {
                    if (((io.reactivex.schedulers.d)f2.G).a() > d - l) {
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
            final long d = this.K.d(this.M);
            final long l = this.L;
            f f = this.get();
            f f2 = f.get();
            int n = 0;
            while (f2 != null && super.H > 1 && ((io.reactivex.schedulers.d)f2.G).a() <= d - l) {
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
    
    static final class m<T> extends d3.a<T>
    {
        private static final long L = -5898283885385201806L;
        final int K;
        
        m(final int k) {
            this.K = k;
        }
        
        @Override
        void p() {
            if (super.H > this.K) {
                this.k();
            }
        }
    }
    
    static final class n<T> extends ArrayList<Object> implements g<T>
    {
        private static final long H = 7063189396499112664L;
        volatile int G;
        
        n(final int initialCapacity) {
            super(initialCapacity);
        }
        
        @Override
        public void b() {
            this.add(io.reactivex.internal.util.q.h());
            ++this.G;
        }
        
        @Override
        public void f(final T t) {
            this.add(io.reactivex.internal.util.q.y(t));
            ++this.G;
        }
        
        @Override
        public void i(final Throwable t) {
            this.add(io.reactivex.internal.util.q.j(t));
            ++this.G;
        }
        
        @Override
        public void l(final d<T> d) {
            synchronized (d) {
                if (d.K) {
                    d.L = true;
                    return;
                }
                d.K = true;
                // monitorexit(d)
                final o7.c<? super T> h = (o7.c<? super T>)d.H;
                while (!d.i()) {
                    final int g = this.G;
                    final Integer n = d.a();
                    int intValue;
                    if (n != null) {
                        intValue = n;
                    }
                    else {
                        intValue = 0;
                    }
                    long value;
                    final long n2 = value = d.get();
                    long n3 = 0L;
                    while (value != 0L && intValue < g) {
                        final Object value2 = this.get(intValue);
                        try {
                            if (io.reactivex.internal.util.q.d(value2, (o7.c<? super Object>)h)) {
                                return;
                            }
                            if (d.i()) {
                                return;
                            }
                            ++intValue;
                            --value;
                            ++n3;
                            continue;
                        }
                        finally {
                            final Throwable t;
                            io.reactivex.exceptions.b.b(t);
                            d.dispose();
                            if (!io.reactivex.internal.util.q.u(value2) && !io.reactivex.internal.util.q.p(value2)) {
                                h.b(t);
                            }
                            return;
                        }
                        break;
                    }
                    if (n3 != 0L) {
                        d.I = intValue;
                        if (n2 != Long.MAX_VALUE) {
                            d.b(n3);
                        }
                    }
                    synchronized (d) {
                        if (!d.L) {
                            d.K = false;
                            return;
                        }
                        d.L = false;
                        continue;
                    }
                }
            }
        }
    }
}
