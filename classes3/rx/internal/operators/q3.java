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
import rx.g;

public final class q3<T> implements g.b<T, T>
{
    final int G;
    
    public q3(final int g) {
        if (g >= 0) {
            this.G = g;
            return;
        }
        throw new IndexOutOfBoundsException("count cannot be negative");
    }
    
    public n<? super T> a(final n<? super T> n) {
        final b b = (b)new b<Object>((n<? super T>)n, this.G);
        n.r(b);
        n.s0(new i() {
            @Override
            public void v(final long n) {
                b.w(n);
            }
        });
        return (n<? super T>)b;
    }
    
    static final class b<T> extends n<T> implements p<Object, T>
    {
        final n<? super T> L;
        final AtomicLong M;
        final ArrayDeque<Object> N;
        final int O;
        
        public b(final n<? super T> l, final int o) {
            this.L = l;
            this.O = o;
            this.M = new AtomicLong();
            this.N = new ArrayDeque<Object>();
        }
        
        @Override
        public void b(final Throwable t) {
            this.N.clear();
            this.L.b(t);
        }
        
        @Override
        public void c() {
            rx.internal.operators.a.e(this.M, (Queue<Object>)this.N, (n<? super Object>)this.L, (p<? super Object, ?>)this);
        }
        
        @Override
        public T h(final Object o) {
            return x.e(o);
        }
        
        @Override
        public void m(final T t) {
            if (this.N.size() == this.O) {
                this.N.poll();
            }
            this.N.offer(x.j(t));
        }
        
        void w(final long n) {
            if (n > 0L) {
                rx.internal.operators.a.h(this.M, n, (Queue<Object>)this.N, (n<? super Object>)this.L, (p<? super Object, ?>)this);
            }
        }
    }
}
