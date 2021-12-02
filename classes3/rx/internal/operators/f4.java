// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.subjects.i;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.observers.f;
import rx.h;
import rx.o;
import rx.subscriptions.b;
import rx.n;
import rx.functions.p;
import rx.g;

public final class f4<T, U, V> implements g.b<g<T>, T>
{
    final g<? extends U> G;
    final p<? super U, ? extends g<? extends V>> H;
    
    public f4(final g<? extends U> g, final p<? super U, ? extends g<? extends V>> h) {
        this.G = g;
        this.H = h;
    }
    
    public n<? super T> a(final n<? super g<T>> n) {
        final rx.subscriptions.b b = new rx.subscriptions.b();
        n.r(b);
        final c c = new c(n, b);
        final n<U> n2 = new n<U>() {
            @Override
            public void b(final Throwable t) {
                c.b(t);
            }
            
            @Override
            public void c() {
                c.c();
            }
            
            @Override
            public void f() {
                this.v(Long.MAX_VALUE);
            }
            
            @Override
            public void m(final U u) {
                c.w(u);
            }
        };
        b.a(c);
        b.a(n2);
        this.G.R6(n2);
        return c;
    }
    
    static final class b<T>
    {
        final h<T> a;
        final g<T> b;
        
        public b(final h<T> h, final g<T> b) {
            this.a = new f<T>(h);
            this.b = b;
        }
    }
    
    final class c extends n<T>
    {
        final n<? super g<T>> L;
        final rx.subscriptions.b M;
        final Object N;
        final List<b<T>> O;
        boolean P;
        
        public c(final n<? super g<T>> n, final rx.subscriptions.b m) {
            this.L = new rx.observers.g<Object>(n);
            this.N = new Object();
            this.O = new LinkedList<b<T>>();
            this.M = m;
        }
        
        void A(final b<T> b) {
            synchronized (this.N) {
                if (this.P) {
                    return;
                }
                final Iterator<b<T>> iterator = this.O.iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        if (iterator.next() == b) {
                            final boolean b2 = true;
                            iterator.remove();
                            // monitorexit(this.N)
                            if (b2) {
                                b.a.c();
                            }
                            return;
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                Object o = this.N;
                synchronized (o) {
                    if (this.P) {
                        return;
                    }
                    this.P = true;
                    final ArrayList<b> list = (ArrayList<b>)new ArrayList<Object>(this.O);
                    this.O.clear();
                    // monitorexit(o)
                    o = list.iterator();
                    while (((Iterator)o).hasNext()) {
                        ((b)((Iterator<b>)o).next()).a.b(t);
                    }
                    this.L.b(t);
                }
            }
            finally {
                this.M.i();
            }
        }
        
        @Override
        public void c() {
            try {
                Object o = this.N;
                synchronized (o) {
                    if (this.P) {
                        return;
                    }
                    this.P = true;
                    final ArrayList<b> list = (ArrayList<b>)new ArrayList<Object>(this.O);
                    this.O.clear();
                    // monitorexit(o)
                    o = list.iterator();
                    while (((Iterator)o).hasNext()) {
                        ((b)((Iterator<b>)o).next()).a.c();
                    }
                    this.L.c();
                }
            }
            finally {
                this.M.i();
            }
        }
        
        @Override
        public void f() {
            this.v(Long.MAX_VALUE);
        }
        
        @Override
        public void m(final T t) {
            Object o = this.N;
            synchronized (o) {
                if (this.P) {
                    return;
                }
                final ArrayList<b> list = (ArrayList<b>)new ArrayList<Object>(this.O);
                // monitorexit(o)
                o = list.iterator();
                while (((Iterator)o).hasNext()) {
                    ((b)((Iterator<b>)o).next()).a.m((T)t);
                }
            }
        }
        
        void w(final U u) {
            final b<T> x = this.x();
            Object n = this.N;
            synchronized (n) {
                if (this.P) {
                    return;
                }
                this.O.add(x);
                // monitorexit(n)
                this.L.m(x.b);
                try {
                    final g g = (g)f4.this.H.h((Object)u);
                    n = new n<V>() {
                        boolean L = true;
                        
                        @Override
                        public void b(final Throwable t) {
                            c.this.b(t);
                        }
                        
                        @Override
                        public void c() {
                            if (this.L) {
                                this.L = false;
                                c.this.A(x);
                                c.this.M.e(this);
                            }
                        }
                        
                        @Override
                        public void m(final V v) {
                            this.c();
                        }
                    };
                    this.M.a((o)n);
                    g.R6((n)n);
                }
                finally {
                    final Throwable t;
                    this.b(t);
                }
            }
        }
        
        b<T> x() {
            final i<Object> g7 = i.G7();
            return (b<T>)new b((h<Object>)g7, (g<Object>)g7);
        }
    }
}
