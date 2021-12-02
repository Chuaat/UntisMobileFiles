// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.List;
import io.reactivex.k;
import x5.b;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import io.reactivex.b0;
import x5.g;
import x5.a;
import io.reactivex.i0;
import x5.c;
import io.reactivex.g0;
import x5.o;

public final class o1
{
    private o1() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T, U> x5.o<T, g0<U>> a(final x5.o<? super T, ? extends Iterable<? extends U>> o) {
        return new c<T, U>(o);
    }
    
    public static <T, U, R> x5.o<T, g0<R>> b(final x5.o<? super T, ? extends g0<? extends U>> o, final x5.c<? super T, ? super U, ? extends R> c) {
        return new e<T, R, Object>(c, o);
    }
    
    public static <T, U> x5.o<T, g0<T>> c(final x5.o<? super T, ? extends g0<U>> o) {
        return new f<T, Object>(o);
    }
    
    public static <T> x5.a d(final i0<T> i0) {
        return new h<Object>(i0);
    }
    
    public static <T> x5.g<Throwable> e(final i0<T> i0) {
        return new i<Object>(i0);
    }
    
    public static <T> x5.g<T> f(final i0<T> i0) {
        return new j<T>(i0);
    }
    
    public static <T> Callable<io.reactivex.observables.a<T>> g(final b0<T> b0) {
        return new k<T>(b0);
    }
    
    public static <T> Callable<io.reactivex.observables.a<T>> h(final b0<T> b0, final int n) {
        return new a<T>(b0, n);
    }
    
    public static <T> Callable<io.reactivex.observables.a<T>> i(final b0<T> b0, final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        return new b<T>(b0, n, n2, timeUnit, j0);
    }
    
    public static <T> Callable<io.reactivex.observables.a<T>> j(final b0<T> b0, final long n, final TimeUnit timeUnit, final j0 j0) {
        return new o<T>(b0, n, timeUnit, j0);
    }
    
    public static <T, R> x5.o<b0<T>, g0<R>> k(final x5.o<? super b0<T>, ? extends g0<R>> o, final j0 j0) {
        return new l<T, R>(o, j0);
    }
    
    public static <T, S> x5.c<S, io.reactivex.k<T>, S> l(final x5.b<S, io.reactivex.k<T>> b) {
        return new m<T, S>(b);
    }
    
    public static <T, S> x5.c<S, io.reactivex.k<T>, S> m(final x5.g<io.reactivex.k<T>> g) {
        return new n<T, S>(g);
    }
    
    public static <T, R> x5.o<List<g0<? extends T>>, g0<? extends R>> n(final x5.o<? super Object[], ? extends R> o) {
        return (x5.o<List<g0<? extends T>>, g0<? extends R>>)new p(o);
    }
    
    static final class a<T> implements Callable<io.reactivex.observables.a<T>>
    {
        private final b0<T> G;
        private final int H;
        
        a(final b0<T> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public io.reactivex.observables.a<T> a() {
            return this.G.I4(this.H);
        }
    }
    
    static final class b<T> implements Callable<io.reactivex.observables.a<T>>
    {
        private final b0<T> G;
        private final int H;
        private final long I;
        private final TimeUnit J;
        private final j0 K;
        
        b(final b0<T> g, final int h, final long i, final TimeUnit j, final j0 k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        public io.reactivex.observables.a<T> a() {
            return this.G.K4(this.H, this.I, this.J, this.K);
        }
    }
    
    static final class c<T, U> implements o<T, g0<U>>
    {
        private final o<? super T, ? extends Iterable<? extends U>> G;
        
        c(final o<? super T, ? extends Iterable<? extends U>> g) {
            this.G = g;
        }
        
        public g0<U> a(final T t) throws Exception {
            return new f1<U>(io.reactivex.internal.functions.b.g((Iterable<? extends U>)this.G.apply((Object)t), "The mapper returned a null Iterable"));
        }
    }
    
    static final class d<U, R, T> implements o<U, R>
    {
        private final x5.c<? super T, ? super U, ? extends R> G;
        private final T H;
        
        d(final x5.c<? super T, ? super U, ? extends R> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public R apply(final U u) throws Exception {
            return (R)this.G.b((Object)this.H, (Object)u);
        }
    }
    
    static final class e<T, R, U> implements o<T, g0<R>>
    {
        private final x5.c<? super T, ? super U, ? extends R> G;
        private final o<? super T, ? extends g0<? extends U>> H;
        
        e(final x5.c<? super T, ? super U, ? extends R> g, final o<? super T, ? extends g0<? extends U>> h) {
            this.G = g;
            this.H = h;
        }
        
        public g0<R> a(final T t) throws Exception {
            return (g0<R>)new w1((g0<Object>)io.reactivex.internal.functions.b.g((g0<T>)this.H.apply((Object)t), "The mapper returned a null ObservableSource"), new d<Object, Object, Object>((x5.c<?, ? super Object, ?>)this.G, t));
        }
    }
    
    static final class f<T, U> implements o<T, g0<T>>
    {
        final o<? super T, ? extends g0<U>> G;
        
        f(final o<? super T, ? extends g0<U>> g) {
            this.G = g;
        }
        
        public g0<T> a(final T t) throws Exception {
            return new n3(io.reactivex.internal.functions.b.g((g0<Object>)this.G.apply((Object)t), "The itemDelay returned a null ObservableSource"), 1L).D3((o<? super Object, ? extends T>)io.reactivex.internal.functions.a.n((R)t)).y1(t);
        }
    }
    
    enum g implements o<Object, Object>
    {
        G;
        
        @Override
        public Object apply(final Object o) throws Exception {
            return 0;
        }
    }
    
    static final class h<T> implements a
    {
        final i0<T> G;
        
        h(final i0<T> g) {
            this.G = g;
        }
        
        @Override
        public void run() throws Exception {
            this.G.f();
        }
    }
    
    static final class i<T> implements g<Throwable>
    {
        final i0<T> G;
        
        i(final i0<T> g) {
            this.G = g;
        }
        
        public void a(final Throwable t) throws Exception {
            this.G.b(t);
        }
    }
    
    static final class j<T> implements g<T>
    {
        final i0<T> G;
        
        j(final i0<T> g) {
            this.G = g;
        }
        
        @Override
        public void accept(final T t) throws Exception {
            this.G.m(t);
        }
    }
    
    static final class k<T> implements Callable<io.reactivex.observables.a<T>>
    {
        private final b0<T> G;
        
        k(final b0<T> g) {
            this.G = g;
        }
        
        public io.reactivex.observables.a<T> a() {
            return this.G.H4();
        }
    }
    
    static final class l<T, R> implements o<b0<T>, g0<R>>
    {
        private final o<? super b0<T>, ? extends g0<R>> G;
        private final j0 H;
        
        l(final o<? super b0<T>, ? extends g0<R>> g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        public g0<R> a(final b0<T> b0) throws Exception {
            return (g0<R>)b0.S7((g0<Object>)io.reactivex.internal.functions.b.g((g0<T>)this.G.apply(b0), "The selector returned a null ObservableSource")).e4(this.H);
        }
    }
    
    static final class m<T, S> implements c<S, io.reactivex.k<T>, S>
    {
        final x5.b<S, io.reactivex.k<T>> G;
        
        m(final x5.b<S, io.reactivex.k<T>> g) {
            this.G = g;
        }
        
        public S a(final S n, final io.reactivex.k<T> k) throws Exception {
            this.G.a(n, k);
            return n;
        }
    }
    
    static final class n<T, S> implements c<S, io.reactivex.k<T>, S>
    {
        final x5.g<io.reactivex.k<T>> G;
        
        n(final x5.g<io.reactivex.k<T>> g) {
            this.G = g;
        }
        
        public S a(final S n, final io.reactivex.k<T> k) throws Exception {
            this.G.accept(k);
            return n;
        }
    }
    
    static final class o<T> implements Callable<io.reactivex.observables.a<T>>
    {
        private final b0<T> G;
        private final long H;
        private final TimeUnit I;
        private final j0 J;
        
        o(final b0<T> g, final long h, final TimeUnit i, final j0 j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public io.reactivex.observables.a<T> a() {
            return this.G.N4(this.H, this.I, this.J);
        }
    }
    
    static final class p<T, R> implements o<List<g0<? extends T>>, g0<? extends R>>
    {
        private final o<? super Object[], ? extends R> G;
        
        p(final o<? super Object[], ? extends R> g) {
            this.G = g;
        }
        
        public g0<? extends R> a(final List<g0<? extends T>> list) {
            return (g0<? extends R>)b0.g8((Iterable<? extends g0<?>>)list, (o<? super Object[], ?>)this.G, false, b0.X());
        }
    }
}
