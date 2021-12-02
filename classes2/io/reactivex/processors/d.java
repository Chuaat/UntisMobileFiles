// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.processors;

import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.annotations.f;
import io.reactivex.l;
import y5.o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.annotations.h;
import io.reactivex.annotations.a;
import io.reactivex.annotations.b;

@b(io.reactivex.annotations.a.H)
@h("none")
public final class d<T> extends c<T>
{
    static final a[] T;
    static final a[] U;
    final AtomicInteger H;
    final AtomicReference<o7.d> I;
    final AtomicReference<a<T>[]> J;
    final AtomicBoolean K;
    final int L;
    final int M;
    final boolean N;
    volatile o<T> O;
    volatile boolean P;
    volatile Throwable Q;
    int R;
    int S;
    
    static {
        T = new a[0];
        U = new a[0];
    }
    
    d(final int l, final boolean n) {
        io.reactivex.internal.functions.b.h(l, "bufferSize");
        this.L = l;
        this.M = l - (l >> 2);
        this.H = new AtomicInteger();
        this.J = new AtomicReference<a<T>[]>(d.T);
        this.I = new AtomicReference<o7.d>();
        this.N = n;
        this.K = new AtomicBoolean();
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> d<T> V8() {
        return new d<T>(l.b0(), false);
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> d<T> W8(final int n) {
        return new d<T>(n, false);
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> d<T> X8(final int n, final boolean b) {
        return new d<T>(n, b);
    }
    
    @io.reactivex.annotations.d
    @f
    public static <T> d<T> Y8(final boolean b) {
        return new d<T>(l.b0(), b);
    }
    
    @Override
    public Throwable P8() {
        Throwable q;
        if (this.K.get()) {
            q = this.Q;
        }
        else {
            q = null;
        }
        return q;
    }
    
    @Override
    public boolean Q8() {
        return this.K.get() && this.Q == null;
    }
    
    @Override
    public boolean R8() {
        return this.J.get().length != 0;
    }
    
    @Override
    public boolean S8() {
        return this.K.get() && this.Q != null;
    }
    
    boolean U8(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.J.get();
            if (expectedValue == d.U) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.J.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    void Z8() {
        if (this.H.getAndIncrement() != 0) {
            return;
        }
        final AtomicReference<a<T>[]> j = this.J;
        int r = this.R;
        final int m = this.M;
        final int s = this.S;
        int n = 1;
        while (true) {
            final o<T> o = this.O;
            int n2 = r;
            Label_0617: {
                if (o != null) {
                    final a<T>[] array = j.get();
                    n2 = r;
                    if (array.length != 0) {
                        final int length = array.length;
                        long a = -1L;
                        long min;
                        for (int i = 0; i < length; ++i, a = min) {
                            final a<T> a2 = array[i];
                            final long value = a2.get();
                            min = a;
                            if (value >= 0L) {
                                if (a == -1L) {
                                    min = value - a2.I;
                                }
                                else {
                                    min = Math.min(a, value - a2.I);
                                }
                            }
                        }
                        long n3;
                        while (true) {
                            n3 = lcmp(a, 0L);
                            if (n3 <= 0) {
                                break;
                            }
                            final a<T>[] array2 = j.get();
                            if (array2 == d.U) {
                                o.clear();
                                return;
                            }
                            if (array != array2) {
                                continue Label_0506;
                            }
                            final boolean p = this.P;
                            T t = null;
                            boolean b = false;
                            try {
                                o.poll();
                            }
                            finally {
                                final Throwable q;
                                io.reactivex.exceptions.b.b(q);
                                io.reactivex.internal.subscriptions.j.b(this.I);
                                this.Q = q;
                                this.P = true;
                                t = null;
                                b = true;
                            }
                            final boolean b2 = t == null;
                            if (b && b2) {
                                final Throwable q2 = this.Q;
                                if (q2 != null) {
                                    final a[] array3 = j.getAndSet(d.U);
                                    for (int length2 = array3.length, k = 0; k < length2; ++k) {
                                        array3[k].b(q2);
                                    }
                                }
                                else {
                                    final a[] array4 = j.getAndSet(d.U);
                                    for (int length3 = array4.length, l = 0; l < length3; ++l) {
                                        array4[l].a();
                                    }
                                }
                                return;
                            }
                            if (b2) {
                                break;
                            }
                            for (int length4 = array.length, n4 = 0; n4 < length4; ++n4) {
                                array[n4].c(t);
                            }
                            final long n5 = --a;
                            if (s == 1) {
                                continue;
                            }
                            final int n6 = ++r;
                            a = n5;
                            if (n6 != m) {
                                continue;
                            }
                            this.I.get().v((long)m);
                            r = 0;
                            a = n5;
                        }
                        if (n3 == 0) {
                            final a<T>[] array5 = j.get();
                            final a[] u = d.U;
                            if (array5 == u) {
                                o.clear();
                                return;
                            }
                            if (array != array5) {
                                continue;
                            }
                            if (this.P && o.isEmpty()) {
                                final Throwable q3 = this.Q;
                                if (q3 != null) {
                                    final a[] array6 = j.getAndSet(u);
                                    for (int length5 = array6.length, n7 = 0; n7 < length5; ++n7) {
                                        array6[n7].b(q3);
                                    }
                                }
                                else {
                                    final a[] array7 = j.getAndSet(u);
                                    for (int length6 = array7.length, n8 = 0; n8 < length6; ++n8) {
                                        array7[n8].a();
                                    }
                                }
                                return;
                            }
                        }
                        n2 = r;
                        break Label_0617;
                        Label_0506: {
                            continue;
                        }
                    }
                }
            }
            final int addAndGet = this.H.addAndGet(-n);
            r = n2;
            if ((n = addAndGet) == 0) {
                return;
            }
        }
    }
    
    public boolean a9(final T t) {
        if (this.K.get()) {
            return false;
        }
        io.reactivex.internal.functions.b.g(t, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.S == 0 && this.O.offer(t)) {
            this.Z8();
            return true;
        }
        return false;
    }
    
    public void b(final Throwable q) {
        io.reactivex.internal.functions.b.g(q, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.K.compareAndSet(false, true)) {
            this.Q = q;
            this.P = true;
            this.Z8();
        }
        else {
            io.reactivex.plugins.a.Y(q);
        }
    }
    
    void b9(final a<T> a) {
        while (true) {
            final a<T>[] expectedValue = this.J.get();
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
                if (expectedValue[n2] == a) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
            if (n3 < 0) {
                break;
            }
            if (length == 1) {
                if (this.N) {
                    if (this.J.compareAndSet(expectedValue, d.U)) {
                        j.b(this.I);
                        this.K.set(true);
                        break;
                    }
                    continue;
                }
                else {
                    if (this.J.compareAndSet(expectedValue, d.T)) {
                        break;
                    }
                    continue;
                }
            }
            else {
                final a[] newValue = new a[length - 1];
                System.arraycopy(expectedValue, 0, newValue, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, newValue, n3, length - n3 - 1);
                if (this.J.compareAndSet(expectedValue, newValue)) {
                    break;
                }
                continue;
            }
        }
    }
    
    public void c9() {
        if (j.k(this.I, (o7.d)g.G)) {
            this.O = new io.reactivex.internal.queue.b<T>(this.L);
        }
    }
    
    public void d9() {
        if (j.k(this.I, (o7.d)g.G)) {
            this.O = new io.reactivex.internal.queue.c<T>(this.L);
        }
    }
    
    public void f() {
        if (this.K.compareAndSet(false, true)) {
            this.P = true;
            this.Z8();
        }
    }
    
    public void m(final T t) {
        if (this.K.get()) {
            return;
        }
        if (this.S == 0) {
            io.reactivex.internal.functions.b.g(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.O.offer(t)) {
                j.b(this.I);
                this.b(new io.reactivex.exceptions.c());
                return;
            }
        }
        this.Z8();
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        final a a = new a((o7.c<? super T>)c, (d<T>)this);
        c.z((o7.d)a);
        if (this.U8(a)) {
            if (a.get() == Long.MIN_VALUE) {
                this.b9(a);
            }
            else {
                this.Z8();
            }
        }
        else {
            if (this.K.get() || !this.N) {
                final Throwable q = this.Q;
                if (q != null) {
                    c.b(q);
                    return;
                }
            }
            c.f();
        }
    }
    
    public void z(final o7.d d) {
        if (j.k(this.I, d)) {
            if (d instanceof y5.l) {
                final y5.l l = (y5.l)d;
                final int e = l.E(3);
                if (e == 1) {
                    this.S = e;
                    this.O = (o<T>)l;
                    this.P = true;
                    this.Z8();
                    return;
                }
                if (e == 2) {
                    this.S = e;
                    this.O = (o<T>)l;
                    d.v((long)this.L);
                    return;
                }
            }
            this.O = new io.reactivex.internal.queue.b<T>(this.L);
            d.v((long)this.L);
        }
    }
    
    static final class a<T> extends AtomicLong implements o7.d
    {
        private static final long J = -363282618957264509L;
        final o7.c<? super T> G;
        final d<T> H;
        long I;
        
        a(final o7.c<? super T> g, final d<T> h) {
            this.G = g;
            this.H = h;
        }
        
        void a() {
            if (this.get() != Long.MIN_VALUE) {
                this.G.f();
            }
        }
        
        void b(final Throwable t) {
            if (this.get() != Long.MIN_VALUE) {
                this.G.b(t);
            }
        }
        
        void c(final T t) {
            if (this.get() != Long.MIN_VALUE) {
                ++this.I;
                this.G.m((Object)t);
            }
        }
        
        public void cancel() {
            if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.H.b9(this);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                long value;
                long newValue;
                do {
                    value = this.get();
                    if (value == Long.MIN_VALUE) {
                        return;
                    }
                    newValue = Long.MAX_VALUE;
                    if (value == Long.MAX_VALUE) {
                        return;
                    }
                    final long n2 = value + n;
                    if (n2 < 0L) {
                        continue;
                    }
                    newValue = n2;
                } while (!this.compareAndSet(value, newValue));
                this.H.Z8();
            }
        }
    }
}
