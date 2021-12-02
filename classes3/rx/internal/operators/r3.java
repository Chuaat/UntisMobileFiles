// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import rx.functions.p;
import rx.i;
import rx.o;
import rx.n;
import java.util.concurrent.TimeUnit;
import rx.j;
import rx.g;

public final class r3<T> implements g.b<T, T>
{
    final long G;
    final j H;
    final int I;
    
    public r3(final int i, final long duration, final TimeUnit timeUnit, final j h) {
        if (i >= 0) {
            this.G = timeUnit.toMillis(duration);
            this.H = h;
            this.I = i;
            return;
        }
        throw new IndexOutOfBoundsException("count could not be negative");
    }
    
    public r3(final long duration, final TimeUnit timeUnit, final j h) {
        this.G = timeUnit.toMillis(duration);
        this.H = h;
        this.I = -1;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final b b = (b)new b<Object>((n<? super T>)n, this.I, this.G, this.H);
        n.r(b);
        n.s0(new i() {
            @Override
            public void v(final long n) {
                b.x(n);
            }
        });
        return (n<? super T>)b;
    }
    
    static final class b<T> extends n<T> implements p<Object, T>
    {
        final n<? super T> L;
        final long M;
        final j N;
        final int O;
        final AtomicLong P;
        final ArrayDeque<Object> Q;
        final ArrayDeque<Long> R;
        
        public b(final n<? super T> l, final int o, final long m, final j n) {
            this.L = l;
            this.O = o;
            this.M = m;
            this.N = n;
            this.P = new AtomicLong();
            this.Q = new ArrayDeque<Object>();
            this.R = new ArrayDeque<Long>();
        }
        
        @Override
        public void b(final Throwable t) {
            this.Q.clear();
            this.R.clear();
            this.L.b(t);
        }
        
        @Override
        public void c() {
            this.w(this.N.b());
            this.R.clear();
            rx.internal.operators.a.e(this.P, (Queue<Object>)this.Q, (n<? super Object>)this.L, (p<? super Object, ?>)this);
        }
        
        @Override
        public T h(final Object o) {
            return x.e(o);
        }
        
        @Override
        public void m(final T t) {
            if (this.O != 0) {
                final long b = this.N.b();
                if (this.Q.size() == this.O) {
                    this.Q.poll();
                    this.R.poll();
                }
                this.w(b);
                this.Q.offer(x.j(t));
                this.R.offer(b);
            }
        }
        
        protected void w(final long n) {
            final long m = this.M;
            while (true) {
                final Long n2 = this.R.peek();
                if (n2 == null || n2 >= n - m) {
                    break;
                }
                this.Q.poll();
                this.R.poll();
            }
        }
        
        void x(final long n) {
            rx.internal.operators.a.h(this.P, n, (Queue<Object>)this.Q, (n<? super Object>)this.L, (p<? super Object, ?>)this);
        }
    }
}
