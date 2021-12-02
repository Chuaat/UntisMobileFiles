// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.plugins.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.o;
import rx.d;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Queue;
import rx.g;
import rx.b;

public final class n implements j0
{
    final g<b> G;
    final int H;
    final boolean I;
    
    public n(final g<? extends b> g, final int h, final boolean i) {
        this.G = (g<b>)g;
        this.H = h;
        this.I = i;
    }
    
    public static Throwable b(final Queue<Throwable> queue) {
        final ArrayList<Throwable> list = new ArrayList<Throwable>();
        while (true) {
            final Throwable t = queue.poll();
            if (t == null) {
                break;
            }
            list.add(t);
        }
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (Throwable)list.get(0);
        }
        return new rx.exceptions.b(list);
    }
    
    public void a(final d d) {
        final a a = new a(d, this.H, this.I);
        d.a(a);
        this.G.R6(a);
    }
    
    static final class a extends n<b>
    {
        final d L;
        final rx.subscriptions.b M;
        final boolean N;
        volatile boolean O;
        final AtomicReference<Queue<Throwable>> P;
        final AtomicBoolean Q;
        final AtomicInteger R;
        
        public a(final d l, final int n, final boolean n2) {
            this.L = l;
            this.N = n2;
            this.M = new rx.subscriptions.b();
            this.R = new AtomicInteger(1);
            this.Q = new AtomicBoolean();
            this.P = new AtomicReference<Queue<Throwable>>();
            long n3;
            if (n == Integer.MAX_VALUE) {
                n3 = Long.MAX_VALUE;
            }
            else {
                n3 = n;
            }
            this.v(n3);
        }
        
        Queue<Throwable> A() {
            final Queue<Throwable> queue = this.P.get();
            if (queue != null) {
                return queue;
            }
            final ConcurrentLinkedQueue<Throwable> newValue = new ConcurrentLinkedQueue<Throwable>();
            if (this.P.compareAndSet(null, newValue)) {
                return newValue;
            }
            return this.P.get();
        }
        
        public void C(final b b) {
            if (this.O) {
                return;
            }
            this.R.getAndIncrement();
            b.G0(new d() {
                o G;
                boolean H;
                
                @Override
                public void a(final o g) {
                    this.G = g;
                    a.this.M.a(g);
                }
                
                @Override
                public void b(final Throwable t) {
                    if (this.H) {
                        rx.plugins.c.I(t);
                        return;
                    }
                    this.H = true;
                    a.this.M.e(this.G);
                    a.this.A().offer(t);
                    a.this.D();
                    final a i = a.this;
                    if (i.N && !i.O) {
                        n.this.v(1L);
                    }
                }
                
                @Override
                public void c() {
                    if (this.H) {
                        return;
                    }
                    this.H = true;
                    a.this.M.e(this.G);
                    a.this.D();
                    if (!a.this.O) {
                        n.this.v(1L);
                    }
                }
            });
        }
        
        void D() {
            Throwable t2 = null;
            Label_0134: {
                Throwable t;
                if (this.R.decrementAndGet() == 0) {
                    final Queue<Throwable> queue = this.P.get();
                    if (queue == null || queue.isEmpty()) {
                        this.L.c();
                        return;
                    }
                    t = (t2 = n.b(queue));
                    if (!this.Q.compareAndSet(false, true)) {
                        break Label_0134;
                    }
                }
                else {
                    if (this.N) {
                        return;
                    }
                    final Queue<Throwable> queue2 = this.P.get();
                    if (queue2 == null || queue2.isEmpty()) {
                        return;
                    }
                    t = (t2 = n.b(queue2));
                    if (!this.Q.compareAndSet(false, true)) {
                        break Label_0134;
                    }
                }
                this.L.b(t);
                return;
            }
            rx.plugins.c.I(t2);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.O) {
                rx.plugins.c.I(t);
                return;
            }
            this.A().offer(t);
            this.O = true;
            this.D();
        }
        
        @Override
        public void c() {
            if (this.O) {
                return;
            }
            this.O = true;
            this.D();
        }
    }
}
