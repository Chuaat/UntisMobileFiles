// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.subscriptions.f;
import rx.subscriptions.a;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.o;
import rx.j;

public final class n extends j
{
    public static final n a;
    
    static {
        a = new n();
    }
    
    private n() {
    }
    
    static int d(int n, final int n2) {
        if (n < n2) {
            n = -1;
        }
        else if (n == n2) {
            n = 0;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    @Override
    public j.a a() {
        return new a();
    }
    
    static final class a extends j.a implements o
    {
        final AtomicInteger G;
        final PriorityBlockingQueue<b> H;
        private final rx.subscriptions.a I;
        private final AtomicInteger J;
        
        a() {
            this.G = new AtomicInteger();
            this.H = new PriorityBlockingQueue<b>();
            this.I = new rx.subscriptions.a();
            this.J = new AtomicInteger();
        }
        
        private o m(final rx.functions.a a, final long l) {
            if (this.I.g()) {
                return f.e();
            }
            final b e = new b(a, l, this.G.incrementAndGet());
            this.H.add(e);
            if (this.J.getAndIncrement() == 0) {
                do {
                    final b b = this.H.poll();
                    if (b != null) {
                        b.G.call();
                    }
                } while (this.J.decrementAndGet() > 0);
                return f.e();
            }
            return f.a(new rx.functions.a() {
                @Override
                public void call() {
                    n.a.this.H.remove(e);
                }
            });
        }
        
        @Override
        public o c(final rx.functions.a a) {
            return this.m(a, ((j.a)this).b());
        }
        
        @Override
        public o d(final rx.functions.a a, long duration, final TimeUnit timeUnit) {
            duration = ((j.a)this).b() + timeUnit.toMillis(duration);
            return this.m(new m(a, this, duration), duration);
        }
        
        @Override
        public boolean g() {
            return this.I.g();
        }
        
        @Override
        public void i() {
            this.I.i();
        }
    }
    
    static final class b implements Comparable<b>
    {
        final rx.functions.a G;
        final Long H;
        final int I;
        
        b(final rx.functions.a g, final Long h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public int b(final b b) {
            final int compareTo = this.H.compareTo(b.H);
            if (compareTo == 0) {
                return n.d(this.I, b.I);
            }
            return compareTo;
        }
    }
}
