// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import y5.o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import io.reactivex.internal.util.k;
import io.reactivex.q;
import io.reactivex.disposables.c;
import x5.g;
import o7.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.l;
import y5.h;
import io.reactivex.flowables.a;

public final class r2<T> extends io.reactivex.flowables.a<T> implements h<T>
{
    static final long L = Long.MIN_VALUE;
    final l<T> H;
    final AtomicReference<c<T>> I;
    final int J;
    final o7.b<T> K;
    
    private r2(final o7.b<T> k, final l<T> h, final AtomicReference<c<T>> i, final int j) {
        this.K = k;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public static <T> io.reactivex.flowables.a<T> a9(final l<T> l, final int n) {
        final AtomicReference<c<T>> atomicReference = new AtomicReference<c<T>>();
        return io.reactivex.plugins.a.T(new r2<T>((o7.b<Object>)new a((AtomicReference<c<Object>>)atomicReference, n), (l<Object>)l, (AtomicReference<c<Object>>)atomicReference, n));
    }
    
    @Override
    public void T8(final g<? super io.reactivex.disposables.c> g) {
        c<T> expectedValue;
        c<T> newValue;
        do {
            expectedValue = this.I.get();
            if (expectedValue != null) {
                newValue = expectedValue;
                if (!expectedValue.i()) {
                    break;
                }
            }
            newValue = new c<T>(this.I, this.J);
        } while (!this.I.compareAndSet(expectedValue, newValue));
        final boolean value = newValue.J.get();
        boolean b = true;
        if (value || !newValue.J.compareAndSet(false, true)) {
            b = false;
        }
        try {
            g.accept(newValue);
            if (b) {
                this.H.m6(newValue);
            }
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            throw k.f(t);
        }
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        this.K.e((o7.c)c);
    }
    
    @Override
    public o7.b<T> source() {
        return (o7.b<T>)this.H;
    }
    
    static final class a<T> implements o7.b<T>
    {
        private final AtomicReference<c<T>> G;
        private final int H;
        
        a(final AtomicReference<c<T>> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public void e(final o7.c<? super T> c) {
            final b b = new b((o7.c<? super T>)c);
            c.z((d)b);
            q<T> q = null;
            while (true) {
                final c expectedValue = this.G.get();
                Label_0071: {
                    if (expectedValue != null) {
                        q = (q<T>)expectedValue;
                        if (!expectedValue.i()) {
                            break Label_0071;
                        }
                    }
                    q = new c((AtomicReference<c<Object>>)this.G, this.H);
                    if (!this.G.compareAndSet(expectedValue, (c<T>)q)) {
                        continue;
                    }
                }
                if (((c<T>)q).a(b)) {
                    break;
                }
            }
            if (b.get() == Long.MIN_VALUE) {
                ((c<T>)q).e(b);
            }
            else {
                b.H = (c<T>)q;
            }
            ((c)q).d();
        }
    }
    
    static final class b<T> extends AtomicLong implements d
    {
        private static final long J = -4453897557930727610L;
        final o7.c<? super T> G;
        volatile c<T> H;
        long I;
        
        b(final o7.c<? super T> g) {
            this.G = g;
        }
        
        public void cancel() {
            if (this.get() != Long.MIN_VALUE && this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                final c<T> h = this.H;
                if (h != null) {
                    h.e(this);
                    h.d();
                }
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.b(this, n);
                final c<T> h = this.H;
                if (h != null) {
                    h.d();
                }
            }
        }
    }
    
    static final class c<T> extends AtomicInteger implements q<T>, io.reactivex.disposables.c
    {
        private static final long O = -202316842419149694L;
        static final b[] P;
        static final b[] Q;
        final AtomicReference<c<T>> G;
        final int H;
        final AtomicReference<b<T>[]> I;
        final AtomicBoolean J;
        final AtomicReference<d> K;
        volatile Object L;
        int M;
        volatile o<T> N;
        
        static {
            P = new b[0];
            Q = new b[0];
        }
        
        c(final AtomicReference<c<T>> g, final int h) {
            this.K = new AtomicReference<d>();
            this.I = new AtomicReference<b<T>[]>(c.P);
            this.G = g;
            this.J = new AtomicBoolean();
            this.H = h;
        }
        
        boolean a(final b<T> b) {
            b[] expectedValue;
            b[] newValue;
            do {
                expectedValue = this.I.get();
                if (expectedValue == c.Q) {
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new b[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = b;
            } while (!this.I.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        public void b(final Throwable t) {
            if (this.L == null) {
                this.L = io.reactivex.internal.util.q.j(t);
                this.d();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        boolean c(final Object o, final boolean b) {
            final int n = 0;
            int i = 0;
            if (o != null) {
                if (!io.reactivex.internal.util.q.p(o)) {
                    final Throwable l = io.reactivex.internal.util.q.l(o);
                    this.G.compareAndSet(this, null);
                    final b[] array = this.I.getAndSet(c.Q);
                    if (array.length != 0) {
                        for (int length = array.length, j = n; j < length; ++j) {
                            array[j].G.b(l);
                        }
                    }
                    else {
                        io.reactivex.plugins.a.Y(l);
                    }
                    return true;
                }
                if (b) {
                    this.G.compareAndSet(this, null);
                    for (b[] array2 = this.I.getAndSet(c.Q); i < array2.length; ++i) {
                        array2[i].G.f();
                    }
                    return true;
                }
            }
            return false;
        }
        
        void d() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final AtomicReference<b<T>[]> i = this.I;
            b[] array = (b[])i.get();
            int n = 1;
            int addAndGet = 1;
        Label_0026:
            while (true) {
                final Object l = this.L;
                final o<T> n2 = this.N;
                boolean b = n2 == null || n2.isEmpty();
                if (this.c(l, b)) {
                    return;
                }
                int n3 = n;
                if (!b) {
                    final int length = array.length;
                    final int length2 = array.length;
                    int j = 0;
                    int n4 = 0;
                    long min = Long.MAX_VALUE;
                    while (j < length2) {
                        final b b2 = array[j];
                        final long value = b2.get();
                        if (value != Long.MIN_VALUE) {
                            min = Math.min(min, value - ((b)b2).I);
                        }
                        else {
                            ++n4;
                        }
                        ++j;
                    }
                    if (length == n4) {
                        final Object k = this.L;
                        Object m = null;
                        Object o = null;
                        try {
                            n2.poll();
                        }
                        finally {
                            final Throwable t;
                            io.reactivex.exceptions.b.b(t);
                            this.K.get().cancel();
                            m = io.reactivex.internal.util.q.j(t);
                            this.L = m;
                            o = null;
                        }
                        if (this.c(m, o == null)) {
                            return;
                        }
                        if (this.M != n) {
                            this.K.get().v(1L);
                            continue;
                        }
                        continue;
                    }
                    else {
                        int n5 = 0;
                        long n6;
                        while (true) {
                            n6 = n5;
                            if (n6 >= min) {
                                break;
                            }
                            final Object l2 = this.L;
                            Object j2 = null;
                            Object o2 = null;
                            try {
                                n2.poll();
                            }
                            finally {
                                final Throwable t2;
                                io.reactivex.exceptions.b.b(t2);
                                this.K.get().cancel();
                                j2 = io.reactivex.internal.util.q.j(t2);
                                this.L = j2;
                                o2 = null;
                            }
                            b = (o2 == null);
                            if (this.c(j2, b)) {
                                return;
                            }
                            if (b) {
                                break;
                            }
                            final Object o3 = io.reactivex.internal.util.q.o(o2);
                            final int length3 = array.length;
                            int n7 = 0;
                            boolean b3 = false;
                            while (n7 < length3) {
                                final b b4 = array[n7];
                                final long value2 = b4.get();
                                if (value2 != Long.MIN_VALUE) {
                                    if (value2 != Long.MAX_VALUE) {
                                        ++((b)b4).I;
                                    }
                                    ((b)b4).G.m(o3);
                                }
                                else {
                                    b3 = true;
                                }
                                ++n7;
                            }
                            ++n5;
                            final b[] array2 = (b[])i.get();
                            if (!b3 && array2 == array) {
                                continue;
                            }
                            if (n5 != 0 && this.M != 1) {
                                this.K.get().v((long)n5);
                            }
                            array = array2;
                            n = 1;
                            continue Label_0026;
                        }
                        if (n5 != 0 && this.M != 1) {
                            this.K.get().v(n6);
                        }
                        final boolean b5 = true;
                        n = 1;
                        n3 = (b5 ? 1 : 0);
                        if (min != 0L) {
                            n3 = (b5 ? 1 : 0);
                            if (!b) {
                                continue;
                            }
                        }
                    }
                }
                addAndGet = this.addAndGet(-addAndGet);
                if (addAndGet == 0) {
                    return;
                }
                array = (b[])i.get();
                n = n3;
            }
        }
        
        @Override
        public void dispose() {
            final b<T>[] value = this.I.get();
            final b[] q = c.Q;
            if (value != q && this.I.getAndSet(q) != q) {
                this.G.compareAndSet(this, null);
                j.b(this.K);
            }
        }
        
        void e(final b<T> obj) {
            b[] expectedValue;
            b[] p;
            do {
                expectedValue = this.I.get();
                final int length = expectedValue.length;
                if (length == 0) {
                    break;
                }
                final int n = -1;
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= length) {
                        break;
                    }
                    if (expectedValue[n2].equals((Object)obj)) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    p = c.P;
                }
                else {
                    p = new b[length - 1];
                    System.arraycopy(expectedValue, 0, p, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, p, n3, length - n3 - 1);
                }
            } while (!this.I.compareAndSet(expectedValue, p));
        }
        
        public void f() {
            if (this.L == null) {
                this.L = io.reactivex.internal.util.q.h();
                this.d();
            }
        }
        
        @Override
        public boolean i() {
            return this.I.get() == c.Q;
        }
        
        public void m(final T t) {
            if (this.M == 0 && !this.N.offer(t)) {
                this.b(new io.reactivex.exceptions.c("Prefetch queue is full?!"));
                return;
            }
            this.d();
        }
        
        @Override
        public void z(final d d) {
            if (j.k(this.K, d)) {
                if (d instanceof y5.l) {
                    final y5.l l = (y5.l)d;
                    final int e = l.E(7);
                    if (e == 1) {
                        this.M = e;
                        this.N = (o<T>)l;
                        this.L = io.reactivex.internal.util.q.h();
                        this.d();
                        return;
                    }
                    if (e == 2) {
                        this.M = e;
                        this.N = (o<T>)l;
                        d.v((long)this.H);
                        return;
                    }
                }
                this.N = new io.reactivex.internal.queue.b<T>(this.H);
                d.v((long)this.H);
            }
        }
    }
}
