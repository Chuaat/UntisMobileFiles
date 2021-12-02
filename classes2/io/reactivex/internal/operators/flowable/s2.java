// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.util.v;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.q;
import o7.c;
import o7.b;
import io.reactivex.l;
import x5.o;

public final class s2<T, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final o<? super l<T>, ? extends o7.b<? extends R>> I;
    final int J;
    final boolean K;
    
    public s2(final l<T> l, final o<? super l<T>, ? extends o7.b<? extends R>> i, final int j, final boolean k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final o7.c<? super R> c) {
        final a<Object> a = new a<Object>(this.J, this.K);
        try {
            io.reactivex.internal.functions.b.g((o7.b)this.I.apply((Object)a), "selector returned a null Publisher").e((o7.c)new c((o7.c<? super Object>)c, (a<?>)a));
            super.H.m6(a);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            g.d(t, c);
        }
    }
    
    static final class a<T> extends l<T> implements q<T>, io.reactivex.disposables.c
    {
        static final b[] S;
        static final b[] T;
        final AtomicInteger H;
        final AtomicReference<b<T>[]> I;
        final int J;
        final int K;
        final boolean L;
        final AtomicReference<d> M;
        volatile y5.o<T> N;
        int O;
        volatile boolean P;
        Throwable Q;
        int R;
        
        static {
            S = new b[0];
            T = new b[0];
        }
        
        a(final int j, final boolean l) {
            this.J = j;
            this.K = j - (j >> 2);
            this.L = l;
            this.H = new AtomicInteger();
            this.M = new AtomicReference<d>();
            this.I = new AtomicReference<b<T>[]>(a.S);
        }
        
        boolean P8(final b<T> b) {
            b[] expectedValue;
            b[] newValue;
            do {
                expectedValue = this.I.get();
                if (expectedValue == a.T) {
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new b[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = b;
            } while (!this.I.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        void Q8() {
            for (final b b : this.I.getAndSet(a.T)) {
                if (b.get() != Long.MIN_VALUE) {
                    b.G.f();
                }
            }
        }
        
        void R8() {
            if (this.H.getAndIncrement() != 0) {
                return;
            }
            Object n = this.N;
            int i = this.R;
            final int k = this.K;
            final boolean b = this.O != 1;
            Object j = this.I;
            Object o = ((AtomicReference<b[]>)j).get();
            int addAndGet = 1;
            while (true) {
                int length = ((y5.o<Object>)o).length;
                Object q = null;
                Label_0682: {
                    Throwable t;
                    if (n != null && length != 0) {
                        final int length2 = ((y5.o<Object>)o).length;
                        long n2 = Long.MAX_VALUE;
                        int n4;
                        long n5;
                        for (int l = 0; l < length2; ++l, length = n4, n2 = n5) {
                            q = o[l];
                            final long n3 = ((AtomicLong)q).get() - ((b)q).I;
                            if (n3 != Long.MIN_VALUE) {
                                n4 = length;
                                n5 = n2;
                                if (n2 > n3) {
                                    n5 = n3;
                                    n4 = length;
                                }
                            }
                            else {
                                n4 = length - 1;
                                n5 = n2;
                            }
                        }
                        int n6 = i;
                        if (length == 0) {
                            n2 = 0L;
                            n6 = i;
                        }
                        long n7;
                        while (true) {
                            n7 = lcmp(n2, 0L);
                            if (n7 == 0) {
                                break;
                            }
                            if (this.i()) {
                                ((y5.o)n).clear();
                                return;
                            }
                            final boolean p = this.P;
                            if (p && !this.L) {
                                q = this.Q;
                                if (q != null) {
                                    this.S8((Throwable)q);
                                    return;
                                }
                            }
                            try {
                                final Object poll = ((y5.o<Object>)n).poll();
                                if (poll == null) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                if (p && i != 0) {
                                    final Throwable q2 = this.Q;
                                    if (q2 != null) {
                                        this.S8(q2);
                                    }
                                    else {
                                        this.Q8();
                                    }
                                    return;
                                }
                                if (i == 0) {
                                    final int length3 = ((b)o).length;
                                    i = 0;
                                    n7 = 0;
                                    while (i < length3) {
                                        q = o[i];
                                        final long value = ((AtomicLong)q).get();
                                        if (value != Long.MIN_VALUE) {
                                            if (value != Long.MAX_VALUE) {
                                                ++((b)q).I;
                                            }
                                            ((b)q).G.m(poll);
                                        }
                                        else {
                                            n7 = 1;
                                        }
                                        ++i;
                                    }
                                    --n2;
                                    i = n6;
                                    if (b) {
                                        i = ++n6;
                                        if (n6 == k) {
                                            this.M.get().v((long)k);
                                            i = 0;
                                        }
                                    }
                                    q = ((AtomicReference<b>)j).get();
                                    if (n7 == 0 && q == o) {
                                        n6 = i;
                                        continue;
                                    }
                                    o = q;
                                    q = n;
                                    n = j;
                                    break Label_0682;
                                }
                            }
                            finally {
                                io.reactivex.exceptions.b.b((Throwable)j);
                                io.reactivex.internal.subscriptions.j.b(this.M);
                                this.S8((Throwable)j);
                                return;
                            }
                            break;
                        }
                        i = n6;
                        t = (Throwable)j;
                        if (n7 == 0) {
                            if (this.i()) {
                                ((y5.o)n).clear();
                                return;
                            }
                            final boolean p2 = this.P;
                            if (p2 && !this.L) {
                                final Throwable q3 = this.Q;
                                if (q3 != null) {
                                    this.S8(q3);
                                    return;
                                }
                            }
                            i = n6;
                            t = (Throwable)j;
                            if (p2) {
                                i = n6;
                                t = (Throwable)j;
                                if (((y5.o)n).isEmpty()) {
                                    final Throwable q4 = this.Q;
                                    if (q4 != null) {
                                        this.S8(q4);
                                    }
                                    else {
                                        this.Q8();
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    else {
                        t = (Throwable)j;
                    }
                    this.R = i;
                    addAndGet = this.H.addAndGet(-addAndGet);
                    if (addAndGet == 0) {
                        return;
                    }
                    Object n8;
                    if ((n8 = n) == null) {
                        n8 = this.N;
                    }
                    final b[] array = ((AtomicReference<b[]>)t).get();
                    n = t;
                    o = array;
                    q = n8;
                }
                j = n;
                n = q;
            }
        }
        
        void S8(final Throwable t) {
            for (final b b : this.I.getAndSet(a.T)) {
                if (b.get() != Long.MIN_VALUE) {
                    b.G.b(t);
                }
            }
        }
        
        void T8(final b<T> b) {
            b[] expectedValue;
            b[] s;
            do {
                expectedValue = this.I.get();
                final int length = expectedValue.length;
                if (length == 0) {
                    return;
                }
                final int n = -1;
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= length) {
                        break;
                    }
                    if (expectedValue[n2] == b) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    s = a.S;
                }
                else {
                    s = new b[length - 1];
                    System.arraycopy(expectedValue, 0, s, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, s, n3, length - n3 - 1);
                }
            } while (!this.I.compareAndSet(expectedValue, s));
        }
        
        public void b(final Throwable q) {
            if (this.P) {
                io.reactivex.plugins.a.Y(q);
                return;
            }
            this.Q = q;
            this.P = true;
            this.R8();
        }
        
        @Override
        public void dispose() {
            j.b(this.M);
            if (this.H.getAndIncrement() == 0) {
                final y5.o<T> n = this.N;
                if (n != null) {
                    n.clear();
                }
            }
        }
        
        public void f() {
            if (!this.P) {
                this.P = true;
                this.R8();
            }
        }
        
        @Override
        public boolean i() {
            return this.M.get() == j.G;
        }
        
        public void m(final T t) {
            if (this.P) {
                return;
            }
            if (this.O == 0 && !this.N.offer(t)) {
                this.M.get().cancel();
                this.b(new io.reactivex.exceptions.c());
                return;
            }
            this.R8();
        }
        
        @Override
        protected void n6(final c<? super T> c) {
            final b b = new b((c<? super T>)c, (a<T>)this);
            c.z((d)b);
            if (this.P8(b)) {
                if (b.a()) {
                    this.T8(b);
                    return;
                }
                this.R8();
            }
            else {
                final Throwable q = this.Q;
                if (q != null) {
                    c.b(q);
                }
                else {
                    c.f();
                }
            }
        }
        
        @Override
        public void z(final d d) {
            if (j.k(this.M, d)) {
                if (d instanceof y5.l) {
                    final y5.l l = (y5.l)d;
                    final int e = l.E(3);
                    if (e == 1) {
                        this.O = e;
                        this.N = (y5.o<T>)l;
                        this.P = true;
                        this.R8();
                        return;
                    }
                    if (e == 2) {
                        this.O = e;
                        this.N = (y5.o<T>)l;
                        v.j(d, this.J);
                        return;
                    }
                }
                this.N = v.c(this.J);
                v.j(d, this.J);
            }
        }
    }
    
    static final class b<T> extends AtomicLong implements d
    {
        private static final long J = 8664815189257569791L;
        final o7.c<? super T> G;
        final a<T> H;
        long I;
        
        b(final o7.c<? super T> g, final a<T> h) {
            this.G = g;
            this.H = h;
        }
        
        public boolean a() {
            return this.get() == Long.MIN_VALUE;
        }
        
        public void cancel() {
            if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.H.T8(this);
                this.H.R8();
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.b(this, n);
                this.H.R8();
            }
        }
    }
    
    static final class c<R> implements q<R>, d
    {
        final o7.c<? super R> G;
        final a<?> H;
        d I;
        
        c(final o7.c<? super R> g, final a<?> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
            this.H.dispose();
        }
        
        public void cancel() {
            this.I.cancel();
            this.H.dispose();
        }
        
        public void f() {
            this.G.f();
            this.H.dispose();
        }
        
        public void m(final R r) {
            this.G.m((Object)r);
        }
        
        public void v(final long n) {
            this.I.v(n);
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
            }
        }
    }
}
