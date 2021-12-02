// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.i;
import rx.h;
import rx.exceptions.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ConcurrentLinkedQueue;
import rx.internal.util.d;
import rx.o;
import rx.n;
import java.util.Objects;
import rx.functions.a;
import rx.g;

public class v2<T> implements g.b<T, T>
{
    private final Long G;
    private final rx.functions.a H;
    private final rx.a.d I;
    
    v2() {
        this.G = null;
        this.H = null;
        this.I = rx.a.b;
    }
    
    public v2(final long n) {
        this(n, null, rx.a.b);
    }
    
    public v2(final long n, final rx.functions.a a) {
        this(n, a, rx.a.b);
    }
    
    public v2(final long l, final rx.functions.a h, final rx.a.d d) {
        if (l > 0L) {
            Objects.requireNonNull(d, "The BackpressureOverflow strategy must not be null");
            this.G = l;
            this.H = h;
            this.I = d;
            return;
        }
        throw new IllegalArgumentException("Buffer capacity must be > 0");
    }
    
    public static <T> v2<T> b() {
        return (v2<T>)b.a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final a<Object> a = new a<Object>((n<? super Object>)n, this.G, this.H, this.I);
        n.r(a);
        n.s0(a.x());
        return a;
    }
    
    static final class a<T> extends n<T> implements d.a
    {
        private final ConcurrentLinkedQueue<Object> L;
        private final AtomicLong M;
        private final n<? super T> N;
        private final AtomicBoolean O;
        private final d P;
        private final rx.functions.a Q;
        private final rx.a.d R;
        
        public a(final n<? super T> n, final Long n2, final rx.functions.a q, final rx.a.d r) {
            this.L = new ConcurrentLinkedQueue<Object>();
            this.O = new AtomicBoolean(false);
            this.N = n;
            AtomicLong m;
            if (n2 != null) {
                m = new AtomicLong(n2);
            }
            else {
                m = null;
            }
            this.M = m;
            this.Q = q;
            this.P = new d((d.a)this);
            this.R = r;
        }
        
        private boolean w() {
            if (this.M == null) {
                return true;
            }
            long value;
            do {
                value = this.M.get();
                if (value <= 0L) {
                    boolean b = false;
                    Label_0080: {
                        try {
                            if (this.R.a() && this.poll() != null) {
                                b = true;
                                break Label_0080;
                            }
                        }
                        catch (rx.exceptions.d d) {
                            if (this.O.compareAndSet(false, true)) {
                                this.i();
                                this.N.b(d);
                            }
                        }
                        b = false;
                    }
                    final rx.functions.a q = this.Q;
                    if (q != null) {
                        try {
                            q.call();
                        }
                        finally {
                            final Throwable t;
                            rx.exceptions.c.e(t);
                            this.P.f(t);
                            return false;
                        }
                    }
                    if (!b) {
                        return false;
                    }
                    continue;
                }
            } while (!this.M.compareAndSet(value, value - 1L));
            return true;
        }
        
        @Override
        public boolean accept(final Object o) {
            return x.a((h<? super Object>)this.N, o);
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.O.get()) {
                this.P.f(t);
            }
        }
        
        @Override
        public void c() {
            if (!this.O.get()) {
                this.P.e();
            }
        }
        
        @Override
        public void f() {
            this.v(Long.MAX_VALUE);
        }
        
        @Override
        public void m(final T t) {
            if (!this.w()) {
                return;
            }
            this.L.offer(x.j(t));
            this.P.a();
        }
        
        @Override
        public Object peek() {
            return this.L.peek();
        }
        
        @Override
        public Object poll() {
            final Object poll = this.L.poll();
            final AtomicLong m = this.M;
            if (m != null && poll != null) {
                m.incrementAndGet();
            }
            return poll;
        }
        
        @Override
        public void q(final Throwable t) {
            if (t != null) {
                this.N.b(t);
            }
            else {
                this.N.c();
            }
        }
        
        protected i x() {
            return this.P;
        }
    }
    
    static final class b
    {
        static final v2<?> a;
        
        static {
            a = new v2<Object>();
        }
    }
}
