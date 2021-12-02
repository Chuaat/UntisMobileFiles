// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import io.reactivex.exceptions.b;
import java.util.Iterator;
import io.reactivex.internal.subscriptions.g;
import java.util.concurrent.Callable;
import o7.c;
import io.reactivex.l;
import x5.o;

public final class f1<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final o<? super T, ? extends Iterable<? extends R>> I;
    final int J;
    
    public f1(final l<T> l, final o<? super T, ? extends Iterable<? extends R>> i, final int j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    public void n6(final c<? super R> c) {
        final l<T> h = (l<T>)super.H;
        if (h instanceof Callable) {
            try {
                final Object call = ((Callable<Object>)h).call();
                if (call == null) {
                    g.b(c);
                    return;
                }
                try {
                    j1.P8((o7.c<? super Object>)c, (Iterator<?>)((Iterable)this.I.apply((Object)call)).iterator());
                    return;
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    g.d(t, c);
                    return;
                }
            }
            finally {
                final Throwable t2;
                b.b(t2);
                g.d(t2, c);
                return;
            }
        }
        h.m6(new a<Object, Object>(c, this.I, this.J));
    }
    
    static final class a<T, R> extends c<R> implements q<T>
    {
        private static final long U = -3096000382929934955L;
        final o7.c<? super R> H;
        final x5.o<? super T, ? extends Iterable<? extends R>> I;
        final int J;
        final int K;
        final AtomicLong L;
        d M;
        o<T> N;
        volatile boolean O;
        volatile boolean P;
        final AtomicReference<Throwable> Q;
        Iterator<? extends R> R;
        int S;
        int T;
        
        a(final o7.c<? super R> h, final x5.o<? super T, ? extends Iterable<? extends R>> i, final int j) {
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = j - (j >> 2);
            this.Q = new AtomicReference<Throwable>();
            this.L = new AtomicLong();
        }
        
        public int E(final int n) {
            if ((n & 0x1) != 0x0 && this.T == 1) {
                return 1;
            }
            return 0;
        }
        
        public void b(final Throwable t) {
            if (!this.O && io.reactivex.internal.util.k.a(this.Q, t)) {
                this.O = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final o7.c<? super R> h = this.H;
            final o<T> n = this.N;
            final boolean b = this.T != 1;
            Object o = this.R;
            int n2 = 1;
        Label_0164_Outer:
            while (true) {
                Object o2 = o;
                Throwable t2 = null;
            Label_0164:
                while (true) {
                    Label_0250: {
                        if (o != null) {
                            break Label_0250;
                        }
                        final boolean o3 = this.O;
                        while (true) {
                            try {
                                final T poll = n.poll();
                                if (this.g(o3, poll == null, h, n)) {
                                    return;
                                }
                                if (poll != null) {
                                    try {
                                        final Iterator iterator = ((Iterable)this.I.apply((Object)poll)).iterator();
                                        if (!iterator.hasNext()) {
                                            this.i(b);
                                            o = null;
                                            continue Label_0164_Outer;
                                        }
                                        this.R = (Iterator<? extends R>)iterator;
                                        break Label_0250;
                                    }
                                    finally {
                                        io.reactivex.exceptions.b.b((Throwable)o2);
                                    }
                                    this.M.cancel();
                                    io.reactivex.internal.util.k.a(this.Q, (Throwable)o2);
                                    o2 = io.reactivex.internal.util.k.c(this.Q);
                                    h.b((Throwable)o2);
                                    return;
                                }
                            }
                            finally {
                                final Throwable t;
                                io.reactivex.exceptions.b.b(t);
                                this.M.cancel();
                                io.reactivex.internal.util.k.a(this.Q, t);
                                o2 = io.reactivex.internal.util.k.c(this.Q);
                                this.R = null;
                                n.clear();
                                continue;
                            }
                            break;
                        }
                    }
                    if ((t2 = (Throwable)o2) != null) {
                        final long value = this.L.get();
                        long n3 = 0L;
                        long n4;
                        while (true) {
                            o = o2;
                            n4 = n3;
                            if (n3 == value) {
                                break;
                            }
                            if (this.g(this.O, false, h, n)) {
                                return;
                            }
                            try {
                                o = io.reactivex.internal.functions.b.g((Throwable)((Iterator<T>)o2).next(), "The iterator returned a null value");
                                h.m(o);
                                if (this.g(this.O, false, h, n)) {
                                    return;
                                }
                                ++n3;
                                try {
                                    if (!((Iterator)o2).hasNext()) {
                                        this.i(b);
                                        this.R = null;
                                        o = null;
                                        n4 = n3;
                                        break;
                                    }
                                    continue Label_0164_Outer;
                                }
                                finally {
                                    final Throwable t3;
                                    io.reactivex.exceptions.b.b(t3);
                                    this.R = null;
                                    this.M.cancel();
                                    io.reactivex.internal.util.k.a(this.Q, t3);
                                }
                            }
                            finally {
                                io.reactivex.exceptions.b.b((Throwable)o2);
                                this.R = null;
                                continue Label_0164;
                            }
                            break;
                        }
                        if (n4 == value && this.g(this.O, n.isEmpty() && o == null, h, n)) {
                            return;
                        }
                        if (n4 != 0L && value != Long.MAX_VALUE) {
                            this.L.addAndGet(-n4);
                        }
                        if ((t2 = (Throwable)o) == null) {
                            continue Label_0164_Outer;
                        }
                        break Label_0164;
                    }
                    break;
                }
                final int addAndGet = this.addAndGet(-n2);
                o = t2;
                if ((n2 = addAndGet) == 0) {
                    return;
                }
            }
        }
        
        public void cancel() {
            if (!this.P) {
                this.P = true;
                this.M.cancel();
                if (this.getAndIncrement() == 0) {
                    this.N.clear();
                }
            }
        }
        
        public void clear() {
            this.R = null;
            this.N.clear();
        }
        
        public void f() {
            if (this.O) {
                return;
            }
            this.O = true;
            this.c();
        }
        
        boolean g(final boolean b, final boolean b2, final o7.c<?> c, final o<?> o) {
            if (this.P) {
                this.R = null;
                o.clear();
                return true;
            }
            if (b) {
                if (this.Q.get() != null) {
                    final Throwable c2 = io.reactivex.internal.util.k.c(this.Q);
                    this.R = null;
                    o.clear();
                    c.b(c2);
                    return true;
                }
                if (b2) {
                    c.f();
                    return true;
                }
            }
            return false;
        }
        
        void i(final boolean b) {
            if (b) {
                final int s = this.S + 1;
                if (s == this.K) {
                    this.S = 0;
                    this.M.v((long)s);
                }
                else {
                    this.S = s;
                }
            }
        }
        
        public boolean isEmpty() {
            return this.R == null && this.N.isEmpty();
        }
        
        public void m(final T t) {
            if (this.O) {
                return;
            }
            if (this.T == 0 && !this.N.offer(t)) {
                this.b(new io.reactivex.exceptions.c("Queue is full?!"));
                return;
            }
            this.c();
        }
        
        @io.reactivex.annotations.g
        public R poll() throws Exception {
            Iterator<? extends R> r = this.R;
            Iterator<? extends R> iterator;
            while (true) {
                iterator = r;
                if (r != null) {
                    break;
                }
                final T poll = this.N.poll();
                if (poll == null) {
                    return null;
                }
                iterator = (Iterator<? extends R>)((Iterable)this.I.apply((Object)poll)).iterator();
                if (iterator.hasNext()) {
                    this.R = iterator;
                    break;
                }
                r = null;
            }
            final R g = io.reactivex.internal.functions.b.g((R)iterator.next(), "The iterator returned a null value");
            if (!iterator.hasNext()) {
                this.R = null;
            }
            return g;
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.L, n);
                this.c();
            }
        }
        
        @Override
        public void z(final d m) {
            if (j.o(this.M, m)) {
                this.M = m;
                if (m instanceof y5.l) {
                    final y5.l l = (y5.l)m;
                    final int e = l.E(3);
                    if (e == 1) {
                        this.T = e;
                        this.N = (o<T>)l;
                        this.O = true;
                        this.H.z((d)this);
                        return;
                    }
                    if (e == 2) {
                        this.T = e;
                        this.N = (o<T>)l;
                        this.H.z((d)this);
                        m.v((long)this.J);
                        return;
                    }
                }
                this.N = new io.reactivex.internal.queue.b<T>(this.J);
                this.H.z((d)this);
                m.v((long)this.J);
            }
        }
    }
}
