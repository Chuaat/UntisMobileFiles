// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.d;
import java.util.List;
import x5.g;
import io.reactivex.k;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.flowables.a;
import java.util.concurrent.Callable;
import io.reactivex.l;
import x5.c;
import o7.b;
import x5.o;

public final class s1
{
    private s1() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T, U> x5.o<T, o7.b<U>> a(final x5.o<? super T, ? extends Iterable<? extends U>> o) {
        return new c<T, U>(o);
    }
    
    public static <T, U, R> x5.o<T, o7.b<R>> b(final x5.o<? super T, ? extends o7.b<? extends U>> o, final x5.c<? super T, ? super U, ? extends R> c) {
        return new e<T, R, Object>(c, o);
    }
    
    public static <T, U> x5.o<T, o7.b<T>> c(final x5.o<? super T, ? extends o7.b<U>> o) {
        return new f<T, Object>(o);
    }
    
    public static <T> Callable<io.reactivex.flowables.a<T>> d(final io.reactivex.l<T> l) {
        return new g<T>(l);
    }
    
    public static <T> Callable<io.reactivex.flowables.a<T>> e(final io.reactivex.l<T> l, final int n) {
        return new a<T>(l, n);
    }
    
    public static <T> Callable<io.reactivex.flowables.a<T>> f(final io.reactivex.l<T> l, final int n, final long n2, final TimeUnit timeUnit, final j0 j0) {
        return new b<T>(l, n, n2, timeUnit, j0);
    }
    
    public static <T> Callable<io.reactivex.flowables.a<T>> g(final io.reactivex.l<T> l, final long n, final TimeUnit timeUnit, final j0 j0) {
        return new o<T>(l, n, timeUnit, j0);
    }
    
    public static <T, R> x5.o<io.reactivex.l<T>, o7.b<R>> h(final x5.o<? super io.reactivex.l<T>, ? extends o7.b<R>> o, final j0 j0) {
        return new h<T, R>(o, j0);
    }
    
    public static <T, S> x5.c<S, io.reactivex.k<T>, S> i(final x5.b<S, io.reactivex.k<T>> b) {
        return new j<T, S>(b);
    }
    
    public static <T, S> x5.c<S, io.reactivex.k<T>, S> j(final x5.g<io.reactivex.k<T>> g) {
        return new k<T, S>(g);
    }
    
    public static <T> x5.a k(final o7.c<T> c) {
        return new l<Object>(c);
    }
    
    public static <T> x5.g<Throwable> l(final o7.c<T> c) {
        return new m<Object>(c);
    }
    
    public static <T> x5.g<T> m(final o7.c<T> c) {
        return new n<T>(c);
    }
    
    public static <T, R> x5.o<List<o7.b<? extends T>>, o7.b<? extends R>> n(final x5.o<? super Object[], ? extends R> o) {
        return (x5.o<List<o7.b<? extends T>>, o7.b<? extends R>>)new p(o);
    }
    
    static final class a<T> implements Callable<io.reactivex.flowables.a<T>>
    {
        private final io.reactivex.l<T> G;
        private final int H;
        
        a(final io.reactivex.l<T> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public io.reactivex.flowables.a<T> a() {
            return this.G.j5(this.H);
        }
    }
    
    static final class b<T> implements Callable<io.reactivex.flowables.a<T>>
    {
        private final io.reactivex.l<T> G;
        private final int H;
        private final long I;
        private final TimeUnit J;
        private final j0 K;
        
        b(final io.reactivex.l<T> g, final int h, final long i, final TimeUnit j, final j0 k) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        public io.reactivex.flowables.a<T> a() {
            return this.G.l5(this.H, this.I, this.J, this.K);
        }
    }
    
    static final class c<T, U> implements o<T, o7.b<U>>
    {
        private final o<? super T, ? extends Iterable<? extends U>> G;
        
        c(final o<? super T, ? extends Iterable<? extends U>> g) {
            this.G = g;
        }
        
        public o7.b<U> a(final T t) throws Exception {
            return (o7.b<U>)new j1(io.reactivex.internal.functions.b.g((Iterable<? extends U>)this.G.apply((Object)t), "The mapper returned a null Iterable"));
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
    
    static final class e<T, R, U> implements o<T, o7.b<R>>
    {
        private final x5.c<? super T, ? super U, ? extends R> G;
        private final o<? super T, ? extends o7.b<? extends U>> H;
        
        e(final x5.c<? super T, ? super U, ? extends R> g, final o<? super T, ? extends o7.b<? extends U>> h) {
            this.G = g;
            this.H = h;
        }
        
        public o7.b<R> a(final T t) throws Exception {
            return (o7.b<R>)new d2((o7.b<Object>)io.reactivex.internal.functions.b.g((o7.b)this.H.apply((Object)t), "The mapper returned a null Publisher"), new d<Object, Object, Object>((x5.c<?, ? super Object, ?>)this.G, t));
        }
    }
    
    static final class f<T, U> implements o<T, o7.b<T>>
    {
        final o<? super T, ? extends o7.b<U>> G;
        
        f(final o<? super T, ? extends o7.b<U>> g) {
            this.G = g;
        }
        
        public o7.b<T> a(final T t) throws Exception {
            return (o7.b<T>)new e4<Object>(io.reactivex.internal.functions.b.g((o7.b<Object>)this.G.apply((Object)t), "The itemDelay returned a null Publisher"), 1L).N3((o<? super Object, ? extends T>)io.reactivex.internal.functions.a.n((R)t)).D1(t);
        }
    }
    
    static final class g<T> implements Callable<io.reactivex.flowables.a<T>>
    {
        private final io.reactivex.l<T> G;
        
        g(final io.reactivex.l<T> g) {
            this.G = g;
        }
        
        public io.reactivex.flowables.a<T> a() {
            return this.G.i5();
        }
    }
    
    static final class h<T, R> implements o<io.reactivex.l<T>, o7.b<R>>
    {
        private final o<? super io.reactivex.l<T>, ? extends o7.b<R>> G;
        private final j0 H;
        
        h(final o<? super io.reactivex.l<T>, ? extends o7.b<R>> g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        public o7.b<R> a(final io.reactivex.l<T> l) throws Exception {
            return (o7.b<R>)l.b3((o7.b<?>)io.reactivex.internal.functions.b.g((o7.b)this.G.apply(l), "The selector returned a null Publisher")).o4(this.H);
        }
    }
    
    public enum i implements g<o7.d>
    {
        G;
        
        public void b(final o7.d d) throws Exception {
            d.v(Long.MAX_VALUE);
        }
    }
    
    static final class j<T, S> implements c<S, io.reactivex.k<T>, S>
    {
        final x5.b<S, io.reactivex.k<T>> G;
        
        j(final x5.b<S, io.reactivex.k<T>> g) {
            this.G = g;
        }
        
        public S a(final S n, final io.reactivex.k<T> k) throws Exception {
            this.G.a(n, k);
            return n;
        }
    }
    
    static final class k<T, S> implements c<S, io.reactivex.k<T>, S>
    {
        final x5.g<io.reactivex.k<T>> G;
        
        k(final x5.g<io.reactivex.k<T>> g) {
            this.G = g;
        }
        
        public S a(final S n, final io.reactivex.k<T> k) throws Exception {
            this.G.accept(k);
            return n;
        }
    }
    
    static final class l<T> implements x5.a
    {
        final o7.c<T> G;
        
        l(final o7.c<T> g) {
            this.G = g;
        }
        
        @Override
        public void run() throws Exception {
            this.G.f();
        }
    }
    
    static final class m<T> implements g<Throwable>
    {
        final o7.c<T> G;
        
        m(final o7.c<T> g) {
            this.G = g;
        }
        
        public void a(final Throwable t) throws Exception {
            this.G.b(t);
        }
    }
    
    static final class n<T> implements g<T>
    {
        final o7.c<T> G;
        
        n(final o7.c<T> g) {
            this.G = g;
        }
        
        @Override
        public void accept(final T t) throws Exception {
            this.G.m((Object)t);
        }
    }
    
    static final class o<T> implements Callable<io.reactivex.flowables.a<T>>
    {
        private final io.reactivex.l<T> G;
        private final long H;
        private final TimeUnit I;
        private final j0 J;
        
        o(final io.reactivex.l<T> g, final long h, final TimeUnit i, final j0 j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public io.reactivex.flowables.a<T> a() {
            return this.G.o5(this.H, this.I, this.J);
        }
    }
    
    static final class p<T, R> implements o<List<o7.b<? extends T>>, o7.b<? extends R>>
    {
        private final o<? super Object[], ? extends R> G;
        
        p(final o<? super Object[], ? extends R> g) {
            this.G = g;
        }
        
        public o7.b<? extends R> a(final List<o7.b<? extends T>> list) {
            return (o7.b<? extends R>)io.reactivex.l.K8((Iterable<? extends o7.b<?>>)list, (o<? super Object[], ?>)this.G, false, io.reactivex.l.b0());
        }
    }
}
