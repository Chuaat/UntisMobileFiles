// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import y5.a;
import o7.c;
import org.reactivestreams.Subscriber;
import io.reactivex.j0;
import io.reactivex.parallel.b;

public final class o<T> extends io.reactivex.parallel.b<T>
{
    final io.reactivex.parallel.b<? extends T> a;
    final j0 b;
    final int c;
    
    public o(final io.reactivex.parallel.b<? extends T> a, final j0 b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super T>[] array) {
        if (!this.U((o7.c[])array)) {
            return;
        }
        final int length = array.length;
        final o7.c[] array2 = new o7.c[length];
        final j0 b = this.b;
        if (b instanceof io.reactivex.internal.schedulers.o) {
            ((io.reactivex.internal.schedulers.o)b).a(length, (io.reactivex.internal.schedulers.o.a)new b((o7.c[])array, array2));
        }
        else {
            for (int i = 0; i < length; ++i) {
                this.V(i, (o7.c[])array, array2, this.b.c());
            }
        }
        this.a.Q(array2);
    }
    
    void V(final int n, final Subscriber<? super T>[] array, final Subscriber<T>[] array2, final j0.c c) {
        final Subscriber<? super T> subscriber = array[n];
        final io.reactivex.internal.queue.b<Object> b = new io.reactivex.internal.queue.b<Object>(this.c);
        if (subscriber instanceof y5.a) {
            array2[n] = (Subscriber<T>)new c((y5.a<? super Object>)subscriber, this.c, b, c);
        }
        else {
            array2[n] = (Subscriber<T>)new d((o7.c<? super Object>)subscriber, this.c, b, c);
        }
    }
    
    abstract static class a<T> extends AtomicInteger implements q<T>, o7.d, Runnable
    {
        private static final long Q = 9222303586456402150L;
        final int G;
        final int H;
        final io.reactivex.internal.queue.b<T> I;
        final j0.c J;
        o7.d K;
        volatile boolean L;
        Throwable M;
        final AtomicLong N;
        volatile boolean O;
        int P;
        
        a(final int g, final io.reactivex.internal.queue.b<T> i, final j0.c j) {
            this.N = new AtomicLong();
            this.G = g;
            this.I = i;
            this.H = g - (g >> 2);
            this.J = j;
        }
        
        final void a() {
            if (this.getAndIncrement() == 0) {
                this.J.b(this);
            }
        }
        
        public final void b(final Throwable m) {
            if (this.L) {
                io.reactivex.plugins.a.Y(m);
                return;
            }
            this.M = m;
            this.L = true;
            this.a();
        }
        
        public final void cancel() {
            if (!this.O) {
                this.O = true;
                this.K.cancel();
                this.J.dispose();
                if (this.getAndIncrement() == 0) {
                    this.I.clear();
                }
            }
        }
        
        public final void f() {
            if (this.L) {
                return;
            }
            this.L = true;
            this.a();
        }
        
        public final void m(final T t) {
            if (this.L) {
                return;
            }
            if (!this.I.offer(t)) {
                this.K.cancel();
                this.b(new io.reactivex.exceptions.c("Queue is full?!"));
                return;
            }
            this.a();
        }
        
        public final void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.N, n);
                this.a();
            }
        }
    }
    
    final class b implements o.a
    {
        final Subscriber<? super T>[] a;
        final Subscriber<T>[] b;
        
        b(final Subscriber<? super T>[] a, final Subscriber<T>[] b) {
            this.a = (o7.c[])a;
            this.b = (o7.c[])b;
        }
        
        @Override
        public void a(final int n, final j0.c c) {
            o.this.V(n, this.a, this.b, c);
        }
    }
    
    static final class c<T> extends a<T>
    {
        private static final long S = 1075119423897941642L;
        final y5.a<? super T> R;
        
        c(final y5.a<? super T> r, final int n, final io.reactivex.internal.queue.b<T> b, final j0.c c) {
            super(n, b, c);
            this.R = r;
        }
        
        public void run() {
            int p = super.P;
            final io.reactivex.internal.queue.b<T> i = (io.reactivex.internal.queue.b<T>)super.I;
            final y5.a<? super T> r = this.R;
            final int h = super.H;
            int addAndGet = 1;
        Label_0134:
            while (true) {
            Label_0094:
                while (true) {
                    Throwable j = null;
                    Block_13: {
                        Block_11: {
                            while (true) {
                                final long value = super.N.get();
                                long n = 0L;
                                long n2;
                                while (true) {
                                    n2 = lcmp(n, value);
                                    if (n2 == 0) {
                                        break;
                                    }
                                    if (super.O) {
                                        i.clear();
                                        return;
                                    }
                                    final boolean l = super.L;
                                    if (l) {
                                        final Throwable m = super.M;
                                        if (m != null) {
                                            i.clear();
                                            ((o7.c)r).b(m);
                                            break Label_0094;
                                        }
                                    }
                                    final T poll = i.poll();
                                    final boolean b = poll == null;
                                    if (l && b) {
                                        break Label_0134;
                                    }
                                    if (b) {
                                        break;
                                    }
                                    long n3 = n;
                                    if (r.B(poll)) {
                                        n3 = n + 1L;
                                    }
                                    final int n4 = ++p;
                                    n = n3;
                                    if (n4 != h) {
                                        continue;
                                    }
                                    super.K.v((long)n4);
                                    p = 0;
                                    n = n3;
                                }
                                if (n2 == 0) {
                                    if (super.O) {
                                        break Block_11;
                                    }
                                    if (super.L) {
                                        j = super.M;
                                        if (j != null) {
                                            break Block_13;
                                        }
                                        if (i.isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if (n != 0L && value != Long.MAX_VALUE) {
                                    super.N.addAndGet(-n);
                                }
                                final int value2 = this.get();
                                if (value2 != addAndGet) {
                                    addAndGet = value2;
                                    continue;
                                }
                                super.P = p;
                                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                                    return;
                                }
                                continue;
                                super.J.dispose();
                                return;
                            }
                            ((o7.c)r).f();
                            continue Label_0094;
                        }
                        i.clear();
                        return;
                    }
                    i.clear();
                    ((o7.c)r).b(j);
                    continue Label_0094;
                }
                continue Label_0134;
            }
        }
        
        @Override
        public void z(final o7.d k) {
            if (j.o(super.K, k)) {
                super.K = k;
                this.R.z((o7.d)this);
                k.v((long)super.G);
            }
        }
    }
    
    static final class d<T> extends a<T>
    {
        private static final long S = 1075119423897941642L;
        final o7.c<? super T> R;
        
        d(final o7.c<? super T> r, final int n, final io.reactivex.internal.queue.b<T> b, final j0.c c) {
            super(n, b, c);
            this.R = r;
        }
        
        public void run() {
            int p = super.P;
            final io.reactivex.internal.queue.b<T> i = (io.reactivex.internal.queue.b<T>)super.I;
            final o7.c<? super T> r = this.R;
            final int h = super.H;
            int addAndGet = 1;
        Label_0134:
            while (true) {
            Label_0094:
                while (true) {
                    Throwable j = null;
                    Block_12: {
                        Block_10: {
                            while (true) {
                                final long value = super.N.get();
                                long n = 0L;
                                long n2;
                                while (true) {
                                    n2 = lcmp(n, value);
                                    if (n2 == 0) {
                                        break;
                                    }
                                    if (super.O) {
                                        i.clear();
                                        return;
                                    }
                                    final boolean l = super.L;
                                    if (l) {
                                        final Throwable m = super.M;
                                        if (m != null) {
                                            i.clear();
                                            r.b(m);
                                            break Label_0094;
                                        }
                                    }
                                    final T poll = i.poll();
                                    final boolean b = poll == null;
                                    if (l && b) {
                                        break Label_0134;
                                    }
                                    if (b) {
                                        break;
                                    }
                                    r.m((Object)poll);
                                    final long n3 = n + 1L;
                                    final int n4 = ++p;
                                    n = n3;
                                    if (n4 != h) {
                                        continue;
                                    }
                                    super.K.v((long)n4);
                                    p = 0;
                                    n = n3;
                                }
                                if (n2 == 0) {
                                    if (super.O) {
                                        break Block_10;
                                    }
                                    if (super.L) {
                                        j = super.M;
                                        if (j != null) {
                                            break Block_12;
                                        }
                                        if (i.isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if (n != 0L && value != Long.MAX_VALUE) {
                                    super.N.addAndGet(-n);
                                }
                                final int value2 = this.get();
                                if (value2 != addAndGet) {
                                    addAndGet = value2;
                                    continue;
                                }
                                super.P = p;
                                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                                    return;
                                }
                                continue;
                                super.J.dispose();
                                return;
                            }
                            r.f();
                            continue Label_0094;
                        }
                        i.clear();
                        return;
                    }
                    i.clear();
                    r.b(j);
                    continue Label_0094;
                }
                continue Label_0134;
            }
        }
        
        @Override
        public void z(final o7.d k) {
            if (j.o(super.K, k)) {
                super.K = k;
                this.R.z((o7.d)this);
                k.v((long)super.G);
            }
        }
    }
}
