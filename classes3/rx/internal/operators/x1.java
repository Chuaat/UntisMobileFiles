// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import rx.functions.a;
import rx.h;
import rx.exceptions.c;
import java.util.ArrayList;
import rx.o;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import java.util.List;
import rx.g;

public final class x1<T> implements g.b<List<T>, T>
{
    final long G;
    final long H;
    final TimeUnit I;
    final int J;
    final j K;
    
    public x1(final long g, final long h, final TimeUnit i, final int j, final j k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public n<? super T> a(final n<? super List<T>> n) {
        final j.a a = this.K.a();
        final rx.observers.g<Object> g = new rx.observers.g<Object>((n<? super Object>)n);
        if (this.G == this.H) {
            final a a2 = new a(g, a);
            a2.r(a);
            n.r(a2);
            a2.x();
            return a2;
        }
        final b b = new b(g, a);
        b.r(a);
        n.r(b);
        b.A();
        b.x();
        return b;
    }
    
    final class a extends n<T>
    {
        final n<? super List<T>> L;
        final j.a M;
        List<T> N;
        boolean O;
        
        public a(final n<? super List<T>> l, final j.a m) {
            this.L = l;
            this.M = m;
            this.N = new ArrayList<T>();
        }
        
        @Override
        public void b(final Throwable t) {
            synchronized (this) {
                if (this.O) {
                    return;
                }
                this.O = true;
                this.N = null;
                // monitorexit(this)
                this.L.b(t);
                this.i();
            }
        }
        
        @Override
        public void c() {
            try {
                this.M.i();
                synchronized (this) {
                    if (this.O) {
                        return;
                    }
                    this.O = true;
                    final List<T> n = this.N;
                    this.N = null;
                    // monitorexit(this)
                    this.L.m(n);
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
                if (this.O) {
                    return;
                }
                this.N.add(t);
                Object n;
                if (this.N.size() == x1.this.J) {
                    n = this.N;
                    this.N = new ArrayList<T>();
                }
                else {
                    n = null;
                }
                // monitorexit(this)
                if (n != null) {
                    this.L.m((Object)n);
                }
            }
        }
        
        void w() {
            synchronized (this) {
                if (this.O) {
                    return;
                }
                final List<T> n = this.N;
                this.N = new ArrayList<T>();
                // monitorexit(this)
                try {
                    this.L.m(n);
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.f(t, this);
                }
            }
        }
        
        void x() {
            final j.a m = this.M;
            final rx.functions.a a = new rx.functions.a() {
                @Override
                public void call() {
                    x1.a.this.w();
                }
            };
            final x1 p = x1.this;
            final long g = p.G;
            m.e(a, g, g, p.I);
        }
    }
    
    final class b extends n<T>
    {
        final n<? super List<T>> L;
        final j.a M;
        final List<List<T>> N;
        boolean O;
        
        public b(final n<? super List<T>> l, final j.a m) {
            this.L = l;
            this.M = m;
            this.N = new LinkedList<List<T>>();
        }
        
        void A() {
            final ArrayList<T> list = new ArrayList<T>();
            synchronized (this) {
                if (this.O) {
                    return;
                }
                this.N.add(list);
                // monitorexit(this)
                final j.a m = this.M;
                final rx.functions.a a = new rx.functions.a() {
                    @Override
                    public void call() {
                        b.this.w(list);
                    }
                };
                final x1 p = x1.this;
                m.d(a, p.G, p.I);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            synchronized (this) {
                if (this.O) {
                    return;
                }
                this.O = true;
                this.N.clear();
                // monitorexit(this)
                this.L.b(t);
                this.i();
            }
        }
        
        @Override
        public void c() {
            try {
                synchronized (this) {
                    if (this.O) {
                        return;
                    }
                    this.O = true;
                    final LinkedList<List<?>> list = new LinkedList<List<?>>(this.N);
                    this.N.clear();
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
                if (this.O) {
                    return;
                }
                final Iterator<List<T>> iterator = this.N.iterator();
                List<List<T>> list = null;
                while (iterator.hasNext()) {
                    final List<T> list2 = iterator.next();
                    list2.add(t);
                    if (list2.size() == x1.this.J) {
                        iterator.remove();
                        List<List<T>> list3;
                        if ((list3 = list) == null) {
                            list3 = new LinkedList<List<T>>();
                        }
                        list3.add(list2);
                        list = list3;
                    }
                }
                // monitorexit(this)
                if (list != null) {
                    final Iterator<List<T>> iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        this.L.m(iterator2.next());
                    }
                }
            }
        }
        
        void w(final List<T> list) {
            synchronized (this) {
                if (this.O) {
                    return;
                }
                final Iterator<List<T>> iterator = this.N.iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        if (iterator.next() == list) {
                            iterator.remove();
                            final boolean b = true;
                            // monitorexit(this)
                            if (b) {
                                try {
                                    this.L.m(list);
                                }
                                finally {
                                    final Throwable t;
                                    rx.exceptions.c.f(t, this);
                                }
                            }
                            return;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
        
        void x() {
            final j.a m = this.M;
            final rx.functions.a a = new rx.functions.a() {
                @Override
                public void call() {
                    b.this.A();
                }
            };
            final x1 p = x1.this;
            final long h = p.H;
            m.e(a, h, h, p.I);
        }
    }
}
