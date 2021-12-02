// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.i;
import rx.subscriptions.f;
import rx.functions.a;
import rx.n;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import rx.g;

public final class y<T> implements a<T>
{
    final Iterable<? extends g<? extends T>> G;
    
    private y(final Iterable<? extends g<? extends T>> g) {
        this.G = g;
    }
    
    public static <T> a<T> a(final Iterable<? extends g<? extends T>> iterable) {
        return new y<T>(iterable);
    }
    
    public static <T> a<T> b(final g<? extends T> g, final g<? extends T> g2) {
        final ArrayList<g<? extends T>> list = new ArrayList<g<? extends T>>();
        list.add(g);
        list.add(g2);
        return (a<T>)a((Iterable<? extends g<?>>)list);
    }
    
    public static <T> a<T> c(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3) {
        final ArrayList<g<? extends T>> list = new ArrayList<g<? extends T>>();
        list.add(g);
        list.add(g2);
        list.add(g3);
        return (a<T>)a((Iterable<? extends g<?>>)list);
    }
    
    public static <T> a<T> d(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4) {
        final ArrayList<g<? extends T>> list = new ArrayList<g<? extends T>>();
        list.add(g);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        return (a<T>)a((Iterable<? extends g<?>>)list);
    }
    
    public static <T> a<T> e(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5) {
        final ArrayList<g<? extends T>> list = new ArrayList<g<? extends T>>();
        list.add(g);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);
        return (a<T>)a((Iterable<? extends g<?>>)list);
    }
    
    public static <T> a<T> f(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6) {
        final ArrayList<g<? extends T>> list = new ArrayList<g<? extends T>>();
        list.add(g);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);
        list.add(g6);
        return (a<T>)a((Iterable<? extends g<?>>)list);
    }
    
    public static <T> a<T> g(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7) {
        final ArrayList<g<? extends T>> list = new ArrayList<g<? extends T>>();
        list.add(g);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);
        list.add(g6);
        list.add(g7);
        return (a<T>)a((Iterable<? extends g<?>>)list);
    }
    
    public static <T> a<T> i(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8) {
        final ArrayList<g<? extends T>> list = new ArrayList<g<? extends T>>();
        list.add(g);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);
        list.add(g6);
        list.add(g7);
        list.add(g8);
        return (a<T>)a((Iterable<? extends g<?>>)list);
    }
    
    public static <T> a<T> m(final g<? extends T> g, final g<? extends T> g2, final g<? extends T> g3, final g<? extends T> g4, final g<? extends T> g5, final g<? extends T> g6, final g<? extends T> g7, final g<? extends T> g8, final g<? extends T> g9) {
        final ArrayList<g<? extends T>> list = new ArrayList<g<? extends T>>();
        list.add(g);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);
        list.add(g6);
        list.add(g7);
        list.add(g8);
        list.add(g9);
        return (a<T>)a((Iterable<? extends g<?>>)list);
    }
    
    static <T> void q(final Collection<c<T>> collection) {
        if (!collection.isEmpty()) {
            final Iterator<c<T>> iterator = collection.iterator();
            while (iterator.hasNext()) {
                iterator.next().i();
            }
            collection.clear();
        }
    }
    
    public void n(final n<? super T> n) {
        final d<c> d = new d<c>();
        n.r(f.a(new rx.functions.a() {
            @Override
            public void call() {
                final c c = (c)d.get();
                if (c != null) {
                    c.i();
                }
                y.q(d.G);
            }
        }));
        for (final g g : this.G) {
            if (n.g()) {
                break;
            }
            final c c = new c(0L, (n<? super Object>)n, (d<Object>)d);
            d.G.add((c<c>)c);
            final c c2 = d.get();
            if (c2 != null) {
                d.b(c2);
                return;
            }
            g.R6(c);
        }
        if (n.g()) {
            q((Collection<c<T>>)d.G);
        }
        n.s0(new i() {
            @Override
            public void v(final long n) {
                final c c = (c)d.get();
                if (c != null) {
                    c.A(n);
                }
                else {
                    for (final c<Object> c2 : d.G) {
                        if (!c2.g()) {
                            final Object value = d.get();
                            c2.A(n);
                            if (value == c2) {
                                break;
                            }
                            continue;
                        }
                    }
                }
            }
        });
    }
    
    static final class c<T> extends n<T>
    {
        private final n<? super T> L;
        private final d<T> M;
        private boolean N;
        
        c(final long n, final n<? super T> l, final d<T> m) {
            this.L = l;
            this.M = m;
            this.v(n);
        }
        
        private void A(final long n) {
            this.v(n);
        }
        
        private boolean x() {
            if (this.N) {
                return true;
            }
            if (this.M.get() == this) {
                return this.N = true;
            }
            if (this.M.compareAndSet(null, (c<T>)this)) {
                this.M.b(this);
                return this.N = true;
            }
            this.M.a();
            return false;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.x()) {
                this.L.b(t);
            }
        }
        
        @Override
        public void c() {
            if (this.x()) {
                this.L.c();
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.x()) {
                this.L.m((Object)t);
            }
        }
    }
    
    static final class d<T> extends AtomicReference<c<T>>
    {
        final Collection<c<T>> G;
        
        d() {
            this.G = new ConcurrentLinkedQueue<c<T>>();
        }
        
        public void a() {
            final c c = this.get();
            if (c != null) {
                this.b(c);
            }
        }
        
        public void b(final c<T> c) {
            for (final c<T> c2 : this.G) {
                if (c2 != c) {
                    c2.i();
                }
            }
            this.G.clear();
        }
    }
}
