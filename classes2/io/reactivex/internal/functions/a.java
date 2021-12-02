// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.functions;

import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import x5.i;
import x5.h;
import x5.c;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import x5.e;
import io.reactivex.a0;
import java.util.concurrent.Future;
import java.util.Set;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import x5.n;
import x5.m;
import x5.l;
import x5.k;
import x5.j;
import o7.d;
import java.util.Comparator;
import java.util.concurrent.Callable;
import x5.r;
import x5.q;
import x5.g;
import x5.o;

public final class a
{
    static final x5.o<Object, Object> a;
    public static final Runnable b;
    public static final a c;
    static final x5.g<Object> d;
    public static final x5.g<Throwable> e;
    public static final x5.g<Throwable> f;
    public static final x5.q g;
    static final x5.r<Object> h;
    static final x5.r<Object> i;
    static final Callable<Object> j;
    static final Comparator<Object> k;
    public static final x5.g<o7.d> l;
    
    static {
        a = new x();
        b = new r();
        c = new o();
        d = new p();
        e = new t();
        f = new h0();
        g = new q();
        h = new m0();
        i = new u();
        j = new g0();
        k = new c0();
        l = new a0();
    }
    
    private a() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T1, T2, T3, T4, T5, R> x5.o<Object[], R> A(final x5.j<T1, T2, T3, T4, T5, R> j) {
        io.reactivex.internal.functions.b.g(j, "f is null");
        return new e<Object, Object, Object, Object, Object, R>(j);
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> x5.o<Object[], R> B(final x5.k<T1, T2, T3, T4, T5, T6, R> k) {
        io.reactivex.internal.functions.b.g(k, "f is null");
        return new f<Object, Object, Object, Object, Object, Object, R>(k);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> x5.o<Object[], R> C(final x5.l<T1, T2, T3, T4, T5, T6, T7, R> l) {
        io.reactivex.internal.functions.b.g(l, "f is null");
        return new g<Object, Object, Object, Object, Object, Object, Object, R>(l);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> x5.o<Object[], R> D(final x5.m<T1, T2, T3, T4, T5, T6, T7, T8, R> m) {
        io.reactivex.internal.functions.b.g(m, "f is null");
        return new h<Object, Object, Object, Object, Object, Object, Object, Object, R>(m);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> x5.o<Object[], R> E(final x5.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> n) {
        io.reactivex.internal.functions.b.g(n, "f is null");
        return new i<Object, Object, Object, Object, Object, Object, Object, Object, Object, R>(n);
    }
    
    public static <T, K> x5.b<Map<K, T>, T> F(final x5.o<? super T, ? extends K> o) {
        return new j0<K, T>(o);
    }
    
    public static <T, K, V> x5.b<Map<K, V>, T> G(final x5.o<? super T, ? extends K> o, final x5.o<? super T, ? extends V> o2) {
        return new k0<K, V, T>(o2, o);
    }
    
    public static <T, K, V> x5.b<Map<K, Collection<V>>, T> H(final x5.o<? super T, ? extends K> o, final x5.o<? super T, ? extends V> o2, final x5.o<? super K, ? extends Collection<? super V>> o3) {
        return new l0<K, V, T>(o3, o2, o);
    }
    
    public static <T> x5.g<T> a(final a a) {
        return new a<T>(a);
    }
    
    public static <T> x5.r<T> b() {
        return (x5.r<T>)io.reactivex.internal.functions.a.i;
    }
    
    public static <T> x5.r<T> c() {
        return (x5.r<T>)io.reactivex.internal.functions.a.h;
    }
    
    public static <T> x5.g<T> d(final int n) {
        return (x5.g<T>)new l(n);
    }
    
    public static <T, U> x5.o<T, U> e(final Class<U> clazz) {
        return new m<T, U>(clazz);
    }
    
    public static <T> Callable<List<T>> f(final int n) {
        return new j<T>(n);
    }
    
    public static <T> Callable<Set<T>> g() {
        return (Callable<Set<T>>)w.G;
    }
    
    public static <T> x5.g<T> h() {
        return (x5.g<T>)io.reactivex.internal.functions.a.d;
    }
    
    public static <T> x5.r<T> i(final T t) {
        return new s<T>(t);
    }
    
    public static a j(final Future<?> future) {
        return new v(future);
    }
    
    public static <T> x5.o<T, T> k() {
        return (x5.o<T, T>)io.reactivex.internal.functions.a.a;
    }
    
    public static <T, U> x5.r<T> l(final Class<U> clazz) {
        return new n<T, Object>(clazz);
    }
    
    public static <T> Callable<T> m(final T t) {
        return new y<Object, T>(t);
    }
    
    public static <T, U> x5.o<T, U> n(final U u) {
        return new y<T, U>(u);
    }
    
    public static <T> x5.o<List<T>, List<T>> o(final Comparator<? super T> comparator) {
        return new z<T>(comparator);
    }
    
    public static <T> Comparator<T> p() {
        return (Comparator<T>)b0.G;
    }
    
    public static <T> Comparator<T> q() {
        return (Comparator<T>)io.reactivex.internal.functions.a.k;
    }
    
    public static <T> a r(final x5.g<? super io.reactivex.a0<T>> g) {
        return new d0<Object>((x5.g<? super io.reactivex.a0<?>>)g);
    }
    
    public static <T> x5.g<Throwable> s(final x5.g<? super io.reactivex.a0<T>> g) {
        return new e0<Object>((x5.g<? super io.reactivex.a0<?>>)g);
    }
    
    public static <T> x5.g<T> t(final x5.g<? super io.reactivex.a0<T>> g) {
        return new f0<T>(g);
    }
    
    public static <T> Callable<T> u() {
        return (Callable<T>)io.reactivex.internal.functions.a.j;
    }
    
    public static <T> x5.r<T> v(final x5.e e) {
        return new k<T>(e);
    }
    
    public static <T> x5.o<T, io.reactivex.schedulers.d<T>> w(final TimeUnit timeUnit, final io.reactivex.j0 j0) {
        return new i0<T>(timeUnit, j0);
    }
    
    public static <T1, T2, R> x5.o<Object[], R> x(final x5.c<? super T1, ? super T2, ? extends R> c) {
        io.reactivex.internal.functions.b.g(c, "f is null");
        return new b<Object, Object, R>(c);
    }
    
    public static <T1, T2, T3, R> x5.o<Object[], R> y(final x5.h<T1, T2, T3, R> h) {
        io.reactivex.internal.functions.b.g(h, "f is null");
        return new c<Object, Object, Object, R>(h);
    }
    
    public static <T1, T2, T3, T4, R> x5.o<Object[], R> z(final x5.i<T1, T2, T3, T4, R> i) {
        io.reactivex.internal.functions.b.g(i, "f is null");
        return new d<Object, Object, Object, Object, R>(i);
    }
    
    static final class a<T> implements g<T>
    {
        final x5.a G;
        
        a(final x5.a g) {
            this.G = g;
        }
        
        @Override
        public void accept(final T t) throws Exception {
            this.G.run();
        }
    }
    
    static final class a0 implements g<o7.d>
    {
        public void a(final o7.d d) throws Exception {
            d.v(Long.MAX_VALUE);
        }
    }
    
    static final class b<T1, T2, R> implements o<Object[], R>
    {
        final x5.c<? super T1, ? super T2, ? extends R> G;
        
        b(final x5.c<? super T1, ? super T2, ? extends R> g) {
            this.G = g;
        }
        
        public R a(final Object[] array) throws Exception {
            if (array.length == 2) {
                return (R)this.G.b((Object)array[0], (Object)array[1]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Array of size 2 expected but got ");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    enum b0 implements Comparator<Object>
    {
        G;
        
        @Override
        public int compare(final Object o, final Object o2) {
            return ((Comparable)o).compareTo(o2);
        }
    }
    
    static final class c<T1, T2, T3, R> implements o<Object[], R>
    {
        final x5.h<T1, T2, T3, R> G;
        
        c(final x5.h<T1, T2, T3, R> g) {
            this.G = g;
        }
        
        public R a(final Object[] array) throws Exception {
            if (array.length == 3) {
                return this.G.a((T1)array[0], (T2)array[1], (T3)array[2]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Array of size 3 expected but got ");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static final class c0 implements Comparator<Object>
    {
        @Override
        public int compare(final Object o, final Object o2) {
            return ((Comparable)o).compareTo(o2);
        }
    }
    
    static final class d<T1, T2, T3, T4, R> implements o<Object[], R>
    {
        final x5.i<T1, T2, T3, T4, R> G;
        
        d(final x5.i<T1, T2, T3, T4, R> g) {
            this.G = g;
        }
        
        public R a(final Object[] array) throws Exception {
            if (array.length == 4) {
                return this.G.a((T1)array[0], (T2)array[1], (T3)array[2], (T4)array[3]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Array of size 4 expected but got ");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static final class d0<T> implements a
    {
        final x5.g<? super io.reactivex.a0<T>> G;
        
        d0(final x5.g<? super io.reactivex.a0<T>> g) {
            this.G = g;
        }
        
        @Override
        public void run() throws Exception {
            this.G.accept((Object)io.reactivex.a0.a());
        }
    }
    
    static final class e<T1, T2, T3, T4, T5, R> implements o<Object[], R>
    {
        private final x5.j<T1, T2, T3, T4, T5, R> G;
        
        e(final x5.j<T1, T2, T3, T4, T5, R> g) {
            this.G = g;
        }
        
        public R a(final Object[] array) throws Exception {
            if (array.length == 5) {
                return this.G.a((T1)array[0], (T2)array[1], (T3)array[2], (T4)array[3], (T5)array[4]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Array of size 5 expected but got ");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static final class e0<T> implements g<Throwable>
    {
        final g<? super io.reactivex.a0<T>> G;
        
        e0(final g<? super io.reactivex.a0<T>> g) {
            this.G = g;
        }
        
        public void a(final Throwable t) throws Exception {
            this.G.accept((Object)io.reactivex.a0.b(t));
        }
    }
    
    static final class f<T1, T2, T3, T4, T5, T6, R> implements o<Object[], R>
    {
        final x5.k<T1, T2, T3, T4, T5, T6, R> G;
        
        f(final x5.k<T1, T2, T3, T4, T5, T6, R> g) {
            this.G = g;
        }
        
        public R a(final Object[] array) throws Exception {
            if (array.length == 6) {
                return this.G.a((T1)array[0], (T2)array[1], (T3)array[2], (T4)array[3], (T5)array[4], (T6)array[5]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Array of size 6 expected but got ");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static final class f0<T> implements g<T>
    {
        final g<? super io.reactivex.a0<T>> G;
        
        f0(final g<? super io.reactivex.a0<T>> g) {
            this.G = g;
        }
        
        @Override
        public void accept(final T t) throws Exception {
            this.G.accept(io.reactivex.a0.c(t));
        }
    }
    
    static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements o<Object[], R>
    {
        final x5.l<T1, T2, T3, T4, T5, T6, T7, R> G;
        
        g(final x5.l<T1, T2, T3, T4, T5, T6, T7, R> g) {
            this.G = g;
        }
        
        public R a(final Object[] array) throws Exception {
            if (array.length == 7) {
                return this.G.a((T1)array[0], (T2)array[1], (T3)array[2], (T4)array[3], (T5)array[4], (T6)array[5], (T7)array[6]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Array of size 7 expected but got ");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static final class g0 implements Callable<Object>
    {
        @Override
        public Object call() {
            return null;
        }
    }
    
    static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements o<Object[], R>
    {
        final x5.m<T1, T2, T3, T4, T5, T6, T7, T8, R> G;
        
        h(final x5.m<T1, T2, T3, T4, T5, T6, T7, T8, R> g) {
            this.G = g;
        }
        
        public R a(final Object[] array) throws Exception {
            if (array.length == 8) {
                return this.G.a((T1)array[0], (T2)array[1], (T3)array[2], (T4)array[3], (T5)array[4], (T6)array[5], (T7)array[6], (T8)array[7]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Array of size 8 expected but got ");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static final class h0 implements g<Throwable>
    {
        public void a(final Throwable t) {
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.d(t));
        }
    }
    
    static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements o<Object[], R>
    {
        final x5.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> G;
        
        i(final x5.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> g) {
            this.G = g;
        }
        
        public R a(final Object[] array) throws Exception {
            if (array.length == 9) {
                return this.G.a((T1)array[0], (T2)array[1], (T3)array[2], (T4)array[3], (T5)array[4], (T6)array[5], (T7)array[6], (T8)array[7], (T9)array[8]);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Array of size 9 expected but got ");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    static final class i0<T> implements o<T, io.reactivex.schedulers.d<T>>
    {
        final TimeUnit G;
        final io.reactivex.j0 H;
        
        i0(final TimeUnit g, final io.reactivex.j0 h) {
            this.G = g;
            this.H = h;
        }
        
        public io.reactivex.schedulers.d<T> a(final T t) throws Exception {
            return new io.reactivex.schedulers.d<T>(t, this.H.d(this.G), this.G);
        }
    }
    
    static final class j<T> implements Callable<List<T>>
    {
        final int G;
        
        j(final int g) {
            this.G = g;
        }
        
        public List<T> a() throws Exception {
            return new ArrayList<T>(this.G);
        }
    }
    
    static final class j0<K, T> implements x5.b<Map<K, T>, T>
    {
        private final x5.o<? super T, ? extends K> a;
        
        j0(final x5.o<? super T, ? extends K> a) {
            this.a = a;
        }
        
        public void b(final Map<K, T> map, final T t) throws Exception {
            map.put((K)this.a.apply((Object)t), t);
        }
    }
    
    static final class k<T> implements r<T>
    {
        final x5.e G;
        
        k(final x5.e g) {
            this.G = g;
        }
        
        @Override
        public boolean a(final T t) throws Exception {
            return this.G.a() ^ true;
        }
    }
    
    static final class k0<K, V, T> implements x5.b<Map<K, V>, T>
    {
        private final x5.o<? super T, ? extends V> a;
        private final x5.o<? super T, ? extends K> b;
        
        k0(final x5.o<? super T, ? extends V> a, final x5.o<? super T, ? extends K> b) {
            this.a = a;
            this.b = b;
        }
        
        public void b(final Map<K, V> map, final T t) throws Exception {
            map.put((K)this.b.apply((Object)t), (V)this.a.apply((Object)t));
        }
    }
    
    public static class l implements g<o7.d>
    {
        final int G;
        
        l(final int g) {
            this.G = g;
        }
        
        public void a(final o7.d d) throws Exception {
            d.v((long)this.G);
        }
    }
    
    static final class l0<K, V, T> implements x5.b<Map<K, Collection<V>>, T>
    {
        private final x5.o<? super K, ? extends Collection<? super V>> a;
        private final x5.o<? super T, ? extends V> b;
        private final x5.o<? super T, ? extends K> c;
        
        l0(final x5.o<? super K, ? extends Collection<? super V>> a, final x5.o<? super T, ? extends V> b, final x5.o<? super T, ? extends K> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public void b(final Map<K, Collection<V>> map, final T t) throws Exception {
            final K apply = (K)this.c.apply((Object)t);
            Collection<V> collection;
            if ((collection = map.get(apply)) == null) {
                collection = (Collection<V>)this.a.apply((Object)apply);
                map.put(apply, collection);
            }
            collection.add((V)this.b.apply((Object)t));
        }
    }
    
    static final class m<T, U> implements o<T, U>
    {
        final Class<U> G;
        
        m(final Class<U> g) {
            this.G = g;
        }
        
        @Override
        public U apply(final T obj) throws Exception {
            return this.G.cast(obj);
        }
    }
    
    static final class m0 implements r<Object>
    {
        @Override
        public boolean a(final Object o) {
            return true;
        }
    }
    
    static final class n<T, U> implements r<T>
    {
        final Class<U> G;
        
        n(final Class<U> g) {
            this.G = g;
        }
        
        @Override
        public boolean a(final T t) throws Exception {
            return this.G.isInstance(t);
        }
    }
    
    static final class o implements a
    {
        @Override
        public void run() {
        }
        
        @Override
        public String toString() {
            return "EmptyAction";
        }
    }
    
    static final class p implements g<Object>
    {
        @Override
        public void accept(final Object o) {
        }
        
        @Override
        public String toString() {
            return "EmptyConsumer";
        }
    }
    
    static final class q implements x5.q
    {
        @Override
        public void a(final long n) {
        }
    }
    
    static final class r implements Runnable
    {
        @Override
        public void run() {
        }
        
        @Override
        public String toString() {
            return "EmptyRunnable";
        }
    }
    
    static final class s<T> implements r<T>
    {
        final T G;
        
        s(final T g) {
            this.G = g;
        }
        
        @Override
        public boolean a(final T t) throws Exception {
            return io.reactivex.internal.functions.b.c(t, this.G);
        }
    }
    
    static final class t implements g<Throwable>
    {
        public void a(final Throwable t) {
            io.reactivex.plugins.a.Y(t);
        }
    }
    
    static final class u implements r<Object>
    {
        @Override
        public boolean a(final Object o) {
            return false;
        }
    }
    
    static final class v implements a
    {
        final Future<?> G;
        
        v(final Future<?> g) {
            this.G = g;
        }
        
        @Override
        public void run() throws Exception {
            this.G.get();
        }
    }
    
    enum w implements Callable<Set<Object>>
    {
        G;
        
        public Set<Object> b() throws Exception {
            return new HashSet<Object>();
        }
    }
    
    static final class x implements o<Object, Object>
    {
        @Override
        public Object apply(final Object o) {
            return o;
        }
        
        @Override
        public String toString() {
            return "IdentityFunction";
        }
    }
    
    static final class y<T, U> implements Callable<U>, o<T, U>
    {
        final U G;
        
        y(final U g) {
            this.G = g;
        }
        
        @Override
        public U apply(final T t) throws Exception {
            return this.G;
        }
        
        @Override
        public U call() throws Exception {
            return this.G;
        }
    }
    
    static final class z<T> implements o<List<T>, List<T>>
    {
        final Comparator<? super T> G;
        
        z(final Comparator<? super T> g) {
            this.G = g;
        }
        
        public List<T> a(final List<T> list) {
            Collections.sort(list, this.G);
            return list;
        }
    }
}
