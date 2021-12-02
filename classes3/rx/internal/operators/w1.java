// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import rx.h;
import rx.exceptions.c;
import java.util.Collection;
import java.util.LinkedList;
import rx.subscriptions.b;
import rx.o;
import rx.n;
import rx.functions.p;
import java.util.List;
import rx.g;

public final class w1<T, TOpening, TClosing> implements g.b<List<T>, T>
{
    final g<? extends TOpening> G;
    final p<? super TOpening, ? extends g<? extends TClosing>> H;
    
    public w1(final g<? extends TOpening> g, final p<? super TOpening, ? extends g<? extends TClosing>> h) {
        this.G = g;
        this.H = h;
    }
    
    public n<? super T> a(final n<? super List<T>> n) {
        final b b = new b(new rx.observers.g<Object>(n));
        final n<TOpening> n2 = new n<TOpening>() {
            @Override
            public void b(final Throwable t) {
                b.b(t);
            }
            
            @Override
            public void c() {
                b.c();
            }
            
            @Override
            public void m(final TOpening tOpening) {
                b.x(tOpening);
            }
        };
        n.r(n2);
        n.r(b);
        this.G.R6(n2);
        return b;
    }
    
    final class b extends n<T>
    {
        final n<? super List<T>> L;
        final List<List<T>> M;
        boolean N;
        final rx.subscriptions.b O;
        
        public b(final n<? super List<T>> l) {
            this.L = l;
            this.M = new LinkedList<List<T>>();
            this.r(this.O = new rx.subscriptions.b());
        }
        
        @Override
        public void b(final Throwable t) {
            synchronized (this) {
                if (this.N) {
                    return;
                }
                this.N = true;
                this.M.clear();
                // monitorexit(this)
                this.L.b(t);
                this.i();
            }
        }
        
        @Override
        public void c() {
            try {
                synchronized (this) {
                    if (this.N) {
                        return;
                    }
                    this.N = true;
                    final LinkedList<List<?>> list = new LinkedList<List<?>>(this.M);
                    this.M.clear();
                    // monitorexit(this)
                    final Iterator<Object> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        this.L.m((Object)iterator.next());
                    }
                    this.L.c();
                    this.i();
                }
            }
            finally {
                final Throwable t;
                rx.exceptions.c.f(t, this.L);
            }
        }
        
        @Override
        public void m(final T t) {
            synchronized (this) {
                final Iterator<List<T>> iterator = this.M.iterator();
                while (iterator.hasNext()) {
                    iterator.next().add(t);
                }
            }
        }
        
        void w(final List<T> list) {
            synchronized (this) {
                if (this.N) {
                    return;
                }
                final Iterator<List<T>> iterator = this.M.iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        if (iterator.next() == list) {
                            final boolean b = true;
                            iterator.remove();
                            // monitorexit(this)
                            if (b) {
                                this.L.m(list);
                            }
                            return;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
        
        void x(final TOpening tOpening) {
            final ArrayList<T> list = new ArrayList<T>();
            synchronized (this) {
                if (this.N) {
                    return;
                }
                this.M.add(list);
                // monitorexit(this)
                try {
                    final g g = (g)w1.this.H.h((Object)tOpening);
                    final n<TClosing> n = new n<TClosing>() {
                        @Override
                        public void b(final Throwable t) {
                            b.this.b(t);
                        }
                        
                        @Override
                        public void c() {
                            b.this.O.e(this);
                            b.this.w(list);
                        }
                        
                        @Override
                        public void m(final TClosing tClosing) {
                            b.this.O.e(this);
                            b.this.w(list);
                        }
                    };
                    this.O.a(n);
                    g.R6(n);
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.f(t, this);
                }
            }
        }
    }
}
