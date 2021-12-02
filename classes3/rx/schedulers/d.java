// 
// Decompiled by Procyon v0.5.36
// 

package rx.schedulers;

import rx.subscriptions.f;
import rx.o;
import rx.subscriptions.a;
import rx.internal.schedulers.i;
import java.util.concurrent.TimeUnit;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import rx.j;

public class d extends j
{
    static long c;
    final Queue<c> a;
    long b;
    
    public d() {
        this.a = new PriorityQueue<c>(11, (Comparator<? super c>)new a());
    }
    
    private void j(final long b) {
        while (!this.a.isEmpty()) {
            final c c = this.a.peek();
            final long a = c.a;
            if (a > b) {
                break;
            }
            long b2 = a;
            if (a == 0L) {
                b2 = this.b;
            }
            this.b = b2;
            this.a.remove();
            if (c.c.g()) {
                continue;
            }
            c.b.call();
        }
        this.b = b;
    }
    
    @Override
    public j.a a() {
        return new b();
    }
    
    @Override
    public long b() {
        return TimeUnit.NANOSECONDS.toMillis(this.b);
    }
    
    public void d(final long duration, final TimeUnit timeUnit) {
        this.e(this.b + timeUnit.toNanos(duration), TimeUnit.NANOSECONDS);
    }
    
    public void e(final long duration, final TimeUnit timeUnit) {
        this.j(timeUnit.toNanos(duration));
    }
    
    public void h() {
        this.j(this.b);
    }
    
    static final class a implements Comparator<c>
    {
        public int a(final c c, final c c2) {
            final long a = c.a;
            final long a2 = c2.a;
            final int n = 1;
            int n2 = 1;
            if (a == a2) {
                if (c.d < c2.d) {
                    n2 = -1;
                }
                else if (c.d <= c2.d) {
                    n2 = 0;
                }
                return n2;
            }
            int n3;
            if (a < a2) {
                n3 = -1;
            }
            else if (a > a2) {
                n3 = n;
            }
            else {
                n3 = 0;
            }
            return n3;
        }
    }
    
    final class b extends j.a implements i.b
    {
        private final a G;
        
        b() {
            this.G = new a();
        }
        
        @Override
        public long a() {
            return d.this.b;
        }
        
        @Override
        public long b() {
            return d.this.b();
        }
        
        @Override
        public o c(final rx.functions.a a) {
            final c c = new c(this, 0L, a);
            d.this.a.add(c);
            return f.a(new rx.functions.a() {
                @Override
                public void call() {
                    d.this.a.remove(c);
                }
            });
        }
        
        @Override
        public o d(final rx.functions.a a, final long duration, final TimeUnit timeUnit) {
            final c c = new c(this, d.this.b + timeUnit.toNanos(duration), a);
            d.this.a.add(c);
            return f.a(new rx.functions.a() {
                @Override
                public void call() {
                    d.this.a.remove(c);
                }
            });
        }
        
        @Override
        public o e(final rx.functions.a a, final long n, final long n2, final TimeUnit timeUnit) {
            return i.a(this, a, n, n2, timeUnit, (i.b)this);
        }
        
        @Override
        public boolean g() {
            return this.G.g();
        }
        
        @Override
        public void i() {
            this.G.i();
        }
    }
    
    static final class c
    {
        final long a;
        final rx.functions.a b;
        final j.a c;
        private final long d;
        
        c(final j.a c, final long a, final rx.functions.a b) {
            final long c2 = d.c;
            d.c = 1L + c2;
            this.d = c2;
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", this.a, this.b.toString());
        }
    }
}
