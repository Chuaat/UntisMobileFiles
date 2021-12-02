// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.parallel;

import io.reactivex.internal.operators.parallel.e;
import x5.r;
import x5.q;
import org.reactivestreams.Subscriber;
import io.reactivex.internal.operators.parallel.p;
import io.reactivex.internal.util.w;
import java.util.List;
import java.util.Comparator;
import io.reactivex.internal.operators.parallel.i;
import io.reactivex.j0;
import io.reactivex.internal.operators.parallel.m;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.parallel.n;
import x5.c;
import io.reactivex.internal.operators.parallel.k;
import io.reactivex.internal.operators.parallel.j;
import x5.o;
import io.reactivex.l;
import io.reactivex.internal.operators.parallel.g;
import org.reactivestreams.Publisher;
import io.reactivex.annotations.d;
import io.reactivex.plugins.a;
import io.reactivex.internal.operators.parallel.h;
import io.reactivex.annotations.f;

public abstract class b<T>
{
    @d
    @f
    public static <T> b<T> A(@f final o7.b<? extends T> b, final int n, final int n2) {
        io.reactivex.internal.functions.b.g(b, "source");
        io.reactivex.internal.functions.b.h(n, "parallelism");
        io.reactivex.internal.functions.b.h(n2, "prefetch");
        return a.V(new h<T>(b, n, n2));
    }
    
    @d
    @f
    public static <T> b<T> B(@f final Publisher<T>... array) {
        if (array.length != 0) {
            return a.V(new g<T>((o7.b[])array));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }
    
    @d
    public static <T> b<T> y(@f final o7.b<? extends T> b) {
        return A(b, Runtime.getRuntime().availableProcessors(), l.b0());
    }
    
    @d
    public static <T> b<T> z(@f final o7.b<? extends T> b, final int n) {
        return A(b, n, l.b0());
    }
    
    @d
    @f
    public final <R> b<R> C(@f final o<? super T, ? extends R> o) {
        io.reactivex.internal.functions.b.g(o, "mapper");
        return a.V((b<R>)new j((b<Object>)this, (o<? super Object, ?>)o));
    }
    
    @d
    @f
    public final <R> b<R> D(@f final o<? super T, ? extends R> o, @f final io.reactivex.parallel.a a) {
        io.reactivex.internal.functions.b.g(o, "mapper");
        io.reactivex.internal.functions.b.g(a, "errorHandler is null");
        return a.V((b<R>)new k((b<Object>)this, (o<? super Object, ?>)o, a));
    }
    
    @d
    @f
    public final <R> b<R> E(@f final o<? super T, ? extends R> o, @f final c<? super Long, ? super Throwable, io.reactivex.parallel.a> c) {
        io.reactivex.internal.functions.b.g(o, "mapper");
        io.reactivex.internal.functions.b.g(c, "errorHandler is null");
        return a.V((b<R>)new k((b<Object>)this, (o<? super Object, ?>)o, c));
    }
    
    public abstract int F();
    
    @d
    @f
    public final l<T> G(@f final c<T, T, T> c) {
        io.reactivex.internal.functions.b.g(c, "reducer");
        return a.P(new n<T>((b<? extends T>)this, c));
    }
    
    @d
    @f
    public final <R> b<R> H(@f final Callable<R> callable, @f final c<R, ? super T, R> c) {
        io.reactivex.internal.functions.b.g(callable, "initialSupplier");
        io.reactivex.internal.functions.b.g(c, "reducer");
        return a.V((b<R>)new m(this, (Callable<Object>)callable, (c<Object, ? super Object, Object>)c));
    }
    
    @d
    @f
    public final b<T> I(@f final j0 j0) {
        return this.J(j0, l.b0());
    }
    
    @d
    @f
    public final b<T> J(@f final j0 j0, final int n) {
        io.reactivex.internal.functions.b.g(j0, "scheduler");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return a.V(new io.reactivex.internal.operators.parallel.o<T>((b<? extends T>)this, j0, n));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @io.reactivex.annotations.h("none")
    public final l<T> K() {
        return this.L(l.b0());
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @io.reactivex.annotations.h("none")
    @f
    public final l<T> L(final int n) {
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return a.P(new i<T>((b<? extends T>)this, n, false));
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @io.reactivex.annotations.h("none")
    @f
    public final l<T> M() {
        return this.N(l.b0());
    }
    
    @io.reactivex.annotations.b(io.reactivex.annotations.a.H)
    @d
    @io.reactivex.annotations.h("none")
    @f
    public final l<T> N(final int n) {
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return a.P(new i<T>((b<? extends T>)this, n, true));
    }
    
    @d
    @f
    public final l<T> O(@f final Comparator<? super T> comparator) {
        return this.P(comparator, 16);
    }
    
    @d
    @f
    public final l<T> P(@f final Comparator<? super T> comparator, final int n) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        io.reactivex.internal.functions.b.h(n, "capacityHint");
        return a.P(new p<T>((b<List<T>>)this.H(io.reactivex.internal.functions.a.f(n / this.F() + 1), io.reactivex.internal.util.o.f()).C((o<? super List<Object>, ? extends List<List<Object>>>)new w((Comparator<? super Object>)comparator)), comparator));
    }
    
    public abstract void Q(@f final Subscriber<? super T>[] p0);
    
    @d
    @f
    public final <U> U R(@f final o<? super b<T>, U> o) {
        try {
            return io.reactivex.internal.functions.b.g(o, "converter is null").apply(this);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            throw io.reactivex.internal.util.k.f(t);
        }
    }
    
    @d
    @f
    public final l<List<T>> S(@f final Comparator<? super T> comparator) {
        return this.T(comparator, 16);
    }
    
    @d
    @f
    public final l<List<T>> T(@f final Comparator<? super T> comparator, final int n) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        io.reactivex.internal.functions.b.h(n, "capacityHint");
        return a.P((l<List<T>>)this.H(io.reactivex.internal.functions.a.f(n / this.F() + 1), io.reactivex.internal.util.o.f()).C((o<? super List<Object>, ? extends T>)new w((Comparator<? super Object>)comparator)).G((c<T, T, T>)new io.reactivex.internal.util.p((Comparator<? super Object>)comparator)));
    }
    
    protected final boolean U(@f final Subscriber<?>[] array) {
        final int f = this.F();
        if (array.length != f) {
            final StringBuilder sb = new StringBuilder();
            sb.append("parallelism = ");
            sb.append(f);
            sb.append(", subscribers = ");
            sb.append(array.length);
            final IllegalArgumentException ex = new IllegalArgumentException(sb.toString());
            for (int length = array.length, i = 0; i < length; ++i) {
                io.reactivex.internal.subscriptions.g.d(ex, (o7.c<?>)array[i]);
            }
            return false;
        }
        return true;
    }
    
    @d
    @f
    public final <R> R a(@f final io.reactivex.parallel.c<T, R> c) {
        return io.reactivex.internal.functions.b.g(c, "converter is null").a(this);
    }
    
    @d
    @f
    public final <C> b<C> b(@f final Callable<? extends C> callable, @f final x5.b<? super C, ? super T> b) {
        io.reactivex.internal.functions.b.g(callable, "collectionSupplier is null");
        io.reactivex.internal.functions.b.g(b, "collector is null");
        return a.V((b<C>)new io.reactivex.internal.operators.parallel.a(this, callable, (x5.b<? super Object, ? super Object>)b));
    }
    
    @d
    @f
    public final <U> b<U> c(@f final io.reactivex.parallel.d<T, U> d) {
        return a.V(io.reactivex.internal.functions.b.g(d, "composer is null").a(this));
    }
    
    @d
    @f
    public final <R> b<R> d(@f final o<? super T, ? extends o7.b<? extends R>> o) {
        return this.e(o, 2);
    }
    
    @d
    @f
    public final <R> b<R> e(@f final o<? super T, ? extends o7.b<? extends R>> o, final int n) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        return a.V((b<R>)new io.reactivex.internal.operators.parallel.b((b<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, n, io.reactivex.internal.util.j.G));
    }
    
    @d
    @f
    public final <R> b<R> f(@f final o<? super T, ? extends o7.b<? extends R>> o, final int n, final boolean b) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "prefetch");
        io.reactivex.internal.util.j j;
        if (b) {
            j = io.reactivex.internal.util.j.I;
        }
        else {
            j = io.reactivex.internal.util.j.H;
        }
        return a.V((b<R>)new io.reactivex.internal.operators.parallel.b((b<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, n, j));
    }
    
    @d
    @f
    public final <R> b<R> g(@f final o<? super T, ? extends o7.b<? extends R>> o, final boolean b) {
        return this.f(o, 2, b);
    }
    
    @d
    @f
    public final b<T> h(@f final x5.g<? super T> g) {
        io.reactivex.internal.functions.b.g(g, "onAfterNext is null");
        final x5.g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return a.V(new io.reactivex.internal.operators.parallel.l<T>((b<Object>)this, (x5.g<? super Object>)h, (x5.g<? super Object>)g, h2, c, c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, c));
    }
    
    @d
    @f
    public final b<T> i(@f final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onAfterTerminate is null");
        final x5.g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h3 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return a.V(new io.reactivex.internal.operators.parallel.l<T>((b<Object>)this, (x5.g<? super Object>)h, h2, h3, c, a, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, c));
    }
    
    @d
    @f
    public final b<T> j(@f final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onCancel is null");
        final x5.g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h3 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return a.V(new io.reactivex.internal.operators.parallel.l<T>((b<Object>)this, (x5.g<? super Object>)h, h2, h3, c, c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, a));
    }
    
    @d
    @f
    public final b<T> k(@f final x5.a a) {
        io.reactivex.internal.functions.b.g(a, "onComplete is null");
        final x5.g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h3 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return a.V(new io.reactivex.internal.operators.parallel.l<T>((b<Object>)this, (x5.g<? super Object>)h, h2, h3, a, c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, c));
    }
    
    @d
    @f
    public final b<T> l(@f final x5.g<Throwable> g) {
        io.reactivex.internal.functions.b.g(g, "onError is null");
        final x5.g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return a.V(new io.reactivex.internal.operators.parallel.l<T>((b<Object>)this, (x5.g<? super Object>)h, h2, g, c, c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, c));
    }
    
    @d
    @f
    public final b<T> m(@f final x5.g<? super T> g) {
        io.reactivex.internal.functions.b.g(g, "onNext is null");
        final x5.g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h2 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return a.V(new io.reactivex.internal.operators.parallel.l<T>((b<Object>)this, (x5.g<? super Object>)g, (x5.g<? super Object>)h, h2, c, c, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.g, c));
    }
    
    @d
    @f
    public final b<T> n(@f final x5.g<? super T> g, @f final io.reactivex.parallel.a a) {
        io.reactivex.internal.functions.b.g(g, "onNext is null");
        io.reactivex.internal.functions.b.g(a, "errorHandler is null");
        return a.V(new io.reactivex.internal.operators.parallel.c<T>(this, g, a));
    }
    
    @d
    @f
    public final b<T> o(@f final x5.g<? super T> g, @f final c<? super Long, ? super Throwable, io.reactivex.parallel.a> c) {
        io.reactivex.internal.functions.b.g(g, "onNext is null");
        io.reactivex.internal.functions.b.g(c, "errorHandler is null");
        return a.V(new io.reactivex.internal.operators.parallel.c<T>(this, g, c));
    }
    
    @d
    @f
    public final b<T> p(@f final q q) {
        io.reactivex.internal.functions.b.g(q, "onRequest is null");
        final x5.g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h3 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return a.V(new io.reactivex.internal.operators.parallel.l<T>((b<Object>)this, (x5.g<? super Object>)h, h2, h3, c, c, io.reactivex.internal.functions.a.h(), q, c));
    }
    
    @d
    @f
    public final b<T> q(@f final x5.g<? super o7.d> g) {
        io.reactivex.internal.functions.b.g(g, "onSubscribe is null");
        final x5.g<? super T> h = io.reactivex.internal.functions.a.h();
        final x5.g<? super Object> h2 = io.reactivex.internal.functions.a.h();
        final x5.g<? super Throwable> h3 = io.reactivex.internal.functions.a.h();
        final x5.a c = io.reactivex.internal.functions.a.c;
        return a.V(new io.reactivex.internal.operators.parallel.l<T>((b<Object>)this, (x5.g<? super Object>)h, h2, h3, c, c, g, io.reactivex.internal.functions.a.g, c));
    }
    
    @d
    public final b<T> r(@f final r<? super T> r) {
        io.reactivex.internal.functions.b.g(r, "predicate");
        return a.V(new io.reactivex.internal.operators.parallel.d<T>(this, r));
    }
    
    @d
    public final b<T> s(@f final r<? super T> r, @f final io.reactivex.parallel.a a) {
        io.reactivex.internal.functions.b.g(r, "predicate");
        io.reactivex.internal.functions.b.g(a, "errorHandler is null");
        return a.V(new e<T>(this, r, a));
    }
    
    @d
    public final b<T> t(@f final r<? super T> r, @f final c<? super Long, ? super Throwable, io.reactivex.parallel.a> c) {
        io.reactivex.internal.functions.b.g(r, "predicate");
        io.reactivex.internal.functions.b.g(c, "errorHandler is null");
        return a.V(new e<T>(this, r, c));
    }
    
    @d
    @f
    public final <R> b<R> u(@f final o<? super T, ? extends o7.b<? extends R>> o) {
        return this.x(o, false, Integer.MAX_VALUE, l.b0());
    }
    
    @d
    @f
    public final <R> b<R> v(@f final o<? super T, ? extends o7.b<? extends R>> o, final boolean b) {
        return this.x(o, b, Integer.MAX_VALUE, l.b0());
    }
    
    @d
    @f
    public final <R> b<R> w(@f final o<? super T, ? extends o7.b<? extends R>> o, final boolean b, final int n) {
        return this.x(o, b, n, l.b0());
    }
    
    @d
    @f
    public final <R> b<R> x(@f final o<? super T, ? extends o7.b<? extends R>> o, final boolean b, final int n, final int n2) {
        io.reactivex.internal.functions.b.g(o, "mapper is null");
        io.reactivex.internal.functions.b.h(n, "maxConcurrency");
        io.reactivex.internal.functions.b.h(n2, "prefetch");
        return a.V((b<R>)new io.reactivex.internal.operators.parallel.f((b<Object>)this, (o<? super Object, ? extends o7.b<?>>)o, b, n, n2));
    }
}
