// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.functions.a;
import rx.n;
import rx.h;
import rx.subjects.f;

public final class g<T> extends f<T, T>
{
    static final h J;
    final c<T> H;
    private boolean I;
    
    static {
        J = new h() {
            @Override
            public void b(final Throwable t) {
            }
            
            @Override
            public void c() {
            }
            
            @Override
            public void m(final Object o) {
            }
        };
    }
    
    private g(final c<T> h) {
        super(new b((c)h));
        this.H = h;
    }
    
    public static <T> g<T> G7() {
        return new g<T>(new c<T>());
    }
    
    private void H7(Object poll) {
        synchronized (this.H.G) {
            this.H.I.add(poll);
            if (this.H.get() != null) {
                final c<T> h = this.H;
                if (!h.H) {
                    this.I = true;
                    h.H = true;
                }
            }
            // monitorexit(this.H.G)
            if (this.I) {
                while (true) {
                    poll = this.H.I.poll();
                    if (poll == null) {
                        break;
                    }
                    x.a(this.H.get(), poll);
                }
            }
        }
    }
    
    @Override
    public boolean E7() {
        synchronized (this.H.G) {
            return this.H.get() != null;
        }
    }
    
    @Override
    public void b(final Throwable t) {
        if (this.I) {
            this.H.get().b(t);
        }
        else {
            this.H7(x.c(t));
        }
    }
    
    @Override
    public void c() {
        if (this.I) {
            this.H.get().c();
        }
        else {
            this.H7(x.b());
        }
    }
    
    @Override
    public void m(final T t) {
        if (this.I) {
            this.H.get().m((Object)t);
        }
        else {
            this.H7(x.j(t));
        }
    }
    
    static final class b<T> implements a<T>
    {
        final c<T> G;
        
        public b(final c<T> g) {
            this.G = g;
        }
        
        public void a(n<? super T> o) {
            if (this.G.a(null, (h<? super T>)o)) {
                ((n)o).r(rx.subscriptions.f.a(new rx.functions.a() {
                    @Override
                    public void call() {
                        b.this.G.set(g.J);
                    }
                }));
                o = this.G.G;
                synchronized (o) {
                    final c<T> g = this.G;
                    final boolean h = g.H;
                    boolean b = true;
                    if (!h) {
                        g.H = true;
                    }
                    else {
                        b = false;
                    }
                    // monitorexit(o)
                    if (!b) {
                        return;
                    }
                    while (true) {
                        o = this.G.I.poll();
                        if (o != null) {
                            x.a(this.G.get(), o);
                        }
                        else {
                            synchronized (this.G.G) {
                                if (this.G.I.isEmpty()) {
                                    this.G.H = false;
                                    return;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            ((h)o).b(new IllegalStateException("Only one subscriber allowed!"));
        }
    }
    
    static final class c<T> extends AtomicReference<h<? super T>>
    {
        private static final long J = 8026705089538090368L;
        final Object G;
        boolean H;
        final ConcurrentLinkedQueue<Object> I;
        
        c() {
            this.G = new Object();
            this.I = new ConcurrentLinkedQueue<Object>();
        }
        
        boolean a(final h<? super T> expectedValue, final h<? super T> newValue) {
            return this.compareAndSet(expectedValue, newValue);
        }
    }
}
