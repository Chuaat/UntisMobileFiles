// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.functions.o;
import rx.j;
import rx.f;
import rx.functions.p;
import rx.functions.q;
import rx.functions.c;
import rx.internal.operators.s1;
import rx.g;
import rx.functions.b;

public enum h
{
    public static final h G;
    public static final f H;
    public static final q I;
    static final o J;
    public static final g K;
    static final e L;
    public static final rx.functions.b<Throwable> M;
    public static final rx.g.b<Boolean, Object> N;
    
    static {
        G = new h();
        H = new f();
        I = new q();
        J = new o();
        K = new g();
        L = new e();
        M = new c();
        N = new s1<Object>(s.b(), true);
    }
    
    public static <T, R> rx.functions.q<R, T, R> b(final rx.functions.c<R, ? super T> c) {
        return new a<T, R>(c);
    }
    
    public static rx.functions.p<rx.g<? extends rx.f<?>>, rx.g<?>> d(final rx.functions.p<? super rx.g<? extends Void>, ? extends rx.g<?>> p) {
        return new i(p);
    }
    
    public static <T, R> rx.functions.p<rx.g<T>, rx.g<R>> f(final rx.functions.p<? super rx.g<T>, ? extends rx.g<R>> p2, final rx.j j) {
        return new p<T, R>(p2, j);
    }
    
    public static <T> rx.functions.o<rx.observables.c<T>> g(final rx.g<T> g) {
        return new l<T>(g);
    }
    
    public static <T> rx.functions.o<rx.observables.c<T>> h(final rx.g<T> g, final int n) {
        return new j<T>(g, n);
    }
    
    public static <T> rx.functions.o<rx.observables.c<T>> i(final rx.g<T> g, final int n, final long n2, final TimeUnit timeUnit, final rx.j j) {
        return new m<T>(g, n, n2, timeUnit, j);
    }
    
    public static <T> rx.functions.o<rx.observables.c<T>> j(final rx.g<T> g, final long n, final TimeUnit timeUnit, final rx.j j) {
        return new k<T>(g, n, timeUnit, j);
    }
    
    public static rx.functions.p<rx.g<? extends rx.f<?>>, rx.g<?>> k(final rx.functions.p<? super rx.g<? extends Throwable>, ? extends rx.g<?>> p) {
        return new n(p);
    }
    
    public static rx.functions.p<Object, Boolean> l(final Object o) {
        return new b(o);
    }
    
    public static rx.functions.p<Object, Boolean> m(final Class<?> clazz) {
        return new d(clazz);
    }
    
    static final class a<T, R> implements q<R, T, R>
    {
        final rx.functions.c<R, ? super T> G;
        
        public a(final rx.functions.c<R, ? super T> g) {
            this.G = g;
        }
        
        @Override
        public R s(final R r, final T t) {
            this.G.s(r, (Object)t);
            return r;
        }
    }
    
    static final class b implements p<Object, Boolean>
    {
        final Object G;
        
        public b(final Object g) {
            this.G = g;
        }
        
        public Boolean a(final Object o) {
            final Object g = this.G;
            return o == g || (o != null && o.equals(g));
        }
    }
    
    static final class c implements b<Throwable>
    {
        public void a(final Throwable t) {
            throw new rx.exceptions.g(t);
        }
    }
    
    static final class d implements p<Object, Boolean>
    {
        final Class<?> G;
        
        public d(final Class<?> g) {
            this.G = g;
        }
        
        public Boolean a(final Object o) {
            return this.G.isInstance(o);
        }
    }
    
    static final class e implements p<rx.f<?>, Throwable>
    {
        public Throwable a(final rx.f<?> f) {
            return f.g();
        }
    }
    
    static final class f implements q<Object, Object, Boolean>
    {
        public Boolean a(final Object o, final Object obj) {
            return o == obj || (o != null && o.equals(obj));
        }
    }
    
    static final class g implements q<Integer, Object, Integer>
    {
        public Integer a(final Integer n, final Object o) {
            return n + 1;
        }
    }
    
    static final class h implements q<Long, Object, Long>
    {
        public Long a(final Long n, final Object o) {
            return n + 1L;
        }
    }
    
    static final class i implements p<rx.g<? extends rx.f<?>>, rx.g<?>>
    {
        final p<? super rx.g<? extends Void>, ? extends rx.g<?>> G;
        
        public i(final p<? super rx.g<? extends Void>, ? extends rx.g<?>> g) {
            this.G = g;
        }
        
        public rx.g<?> a(final rx.g<? extends rx.f<?>> g) {
            return (rx.g<?>)this.G.h((Object)g.k3((p<? super rx.f<?>, ?>)h.J));
        }
    }
    
    static final class j<T> implements o<rx.observables.c<T>>
    {
        private final rx.g<T> G;
        private final int H;
        
        j(final rx.g<T> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public rx.observables.c<T> a() {
            return this.G.D4(this.H);
        }
    }
    
    static final class k<T> implements o<rx.observables.c<T>>
    {
        private final TimeUnit G;
        private final rx.g<T> H;
        private final long I;
        private final rx.j J;
        
        k(final rx.g<T> h, final long i, final TimeUnit g, final rx.j j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public rx.observables.c<T> a() {
            return this.H.I4(this.I, this.G, this.J);
        }
    }
    
    static final class l<T> implements o<rx.observables.c<T>>
    {
        private final rx.g<T> G;
        
        l(final rx.g<T> g) {
            this.G = g;
        }
        
        public rx.observables.c<T> a() {
            return this.G.C4();
        }
    }
    
    static final class m<T> implements o<rx.observables.c<T>>
    {
        private final long G;
        private final TimeUnit H;
        private final rx.j I;
        private final int J;
        private final rx.g<T> K;
        
        m(final rx.g<T> k, final int j, final long g, final TimeUnit h, final rx.j i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        public rx.observables.c<T> a() {
            return this.K.F4(this.J, this.G, this.H, this.I);
        }
    }
    
    static final class n implements p<rx.g<? extends rx.f<?>>, rx.g<?>>
    {
        final p<? super rx.g<? extends Throwable>, ? extends rx.g<?>> G;
        
        public n(final p<? super rx.g<? extends Throwable>, ? extends rx.g<?>> g) {
            this.G = g;
        }
        
        public rx.g<?> a(final rx.g<? extends rx.f<?>> g) {
            return (rx.g<?>)this.G.h((Object)g.k3((p<? super rx.f<?>, ?>)h.L));
        }
    }
    
    static final class o implements p<Object, Void>
    {
        public Void a(final Object o) {
            return null;
        }
    }
    
    static final class p<T, R> implements rx.functions.p<rx.g<T>, rx.g<R>>
    {
        final rx.functions.p<? super rx.g<T>, ? extends rx.g<R>> G;
        final rx.j H;
        
        public p(final rx.functions.p<? super rx.g<T>, ? extends rx.g<R>> g, final rx.j h) {
            this.G = g;
            this.H = h;
        }
        
        public rx.g<R> a(final rx.g<T> g) {
            return ((rx.g)this.G.h(g)).Q3(this.H);
        }
    }
    
    static final class q implements p<List<? extends rx.g<?>>, rx.g<?>[]>
    {
        public rx.g<?>[] a(final List<? extends rx.g<?>> list) {
            return list.toArray(new rx.g[list.size()]);
        }
    }
}
