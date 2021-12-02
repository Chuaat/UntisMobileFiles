// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.functions.p;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import rx.o;

public final class g<E> implements o
{
    static final int K;
    private final a<E> G;
    private final b H;
    final AtomicInteger I;
    final AtomicInteger J;
    
    static {
        int n;
        if (l.b()) {
            n = 8;
        }
        else {
            n = 128;
        }
        final String property = System.getProperty("rx.indexed-ring-buffer.size");
        int int1 = n;
        if (property != null) {
            try {
                int1 = Integer.parseInt(property);
            }
            catch (NumberFormatException ex) {
                final PrintStream err = System.err;
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to set 'rx.indexed-ring-buffer.size' with value ");
                sb.append(property);
                sb.append(" => ");
                sb.append(ex.getMessage());
                err.println(sb.toString());
                int1 = n;
            }
        }
        K = int1;
    }
    
    g() {
        this.G = new a<E>();
        this.H = new b();
        this.I = new AtomicInteger();
        this.J = new AtomicInteger();
    }
    
    private int d(final p<? super E, Boolean> p3, int n, final int n2) {
        final int value = this.I.get();
        a<E> a = this.G;
        final int k = g.K;
        int i;
        if (n >= k) {
            a = this.e(n);
            final int n3 = n;
            final int n4 = n % k;
            n = n3;
            i = n4;
        }
        else {
            final int n5 = n;
            i = n;
            n = n5;
        }
        int n6 = 0;
    Label_0164:
        while (true) {
            n6 = n;
            if (a == null) {
                break;
            }
            while (i < g.K) {
                if ((n6 = n) >= value) {
                    break Label_0164;
                }
                if (n >= n2) {
                    n6 = n;
                    break Label_0164;
                }
                final E value2 = a.a.get(i);
                if (value2 != null) {
                    if (!p3.h(value2)) {
                        return n;
                    }
                }
                ++i;
                ++n;
            }
            a = a.b.get();
            i = 0;
        }
        return n6;
    }
    
    private a<E> e(int i) {
        final int k = g.K;
        if (i < k) {
            return this.G;
        }
        final int n = i / k;
        a<E> a = this.G;
        for (i = 0; i < n; ++i) {
            a = a.a();
        }
        return a;
    }
    
    private int h() {
        synchronized (this) {
            final int j = this.j();
            int andIncrement;
            if (j >= 0) {
                final int k = g.K;
                int n;
                if (j < k) {
                    n = this.H.a(j, -1);
                }
                else {
                    n = this.k(j).a(j % k, -1);
                }
                andIncrement = n;
                if (n == this.I.get()) {
                    this.I.getAndIncrement();
                    andIncrement = n;
                }
            }
            else {
                andIncrement = this.I.getAndIncrement();
            }
            return andIncrement;
        }
    }
    
    private int j() {
        synchronized (this) {
            AtomicInteger j;
            int value;
            int newValue;
            do {
                value = this.J.get();
                if (value <= 0) {
                    return -1;
                }
                j = this.J;
                newValue = value - 1;
            } while (!j.compareAndSet(value, newValue));
            return newValue;
        }
    }
    
    private b k(int i) {
        final int k = g.K;
        if (i < k) {
            return this.H;
        }
        final int n = i / k;
        b b = this.H;
        for (i = 0; i < n; ++i) {
            b = b.b();
        }
        return b;
    }
    
    public static <T> g<T> l() {
        return new g<T>();
    }
    
    private void m(final int n) {
        synchronized (this) {
            final int andIncrement = this.J.getAndIncrement();
            final int k = g.K;
            if (andIncrement < k) {
                this.H.c(andIncrement, n);
            }
            else {
                this.k(andIncrement).c(andIncrement % k, n);
            }
        }
    }
    
    public int a(final E e) {
        final int h = this.h();
        final int k = g.K;
        if (h < k) {
            this.G.a.set(h, e);
            return h;
        }
        this.e(h).a.set(h % k, e);
        return h;
    }
    
    public int b(final p<? super E, Boolean> p) {
        return this.c(p, 0);
    }
    
    public int c(final p<? super E, Boolean> p2, int d) {
        final int d2 = this.d(p2, d, this.I.get());
        if (d > 0 && d2 == this.I.get()) {
            d = this.d(p2, 0, d);
        }
        else if ((d = d2) == this.I.get()) {
            d = 0;
        }
        return d;
    }
    
    @Override
    public boolean g() {
        return false;
    }
    
    @Override
    public void i() {
        this.n();
    }
    
    public void n() {
        final int value = this.I.get();
        a<E> g = this.G;
        int n = 0;
    Label_0071:
        while (g != null) {
            for (int i = 0; i < rx.internal.util.g.K; ++i, ++n) {
                if (n >= value) {
                    break Label_0071;
                }
                g.a.set(i, null);
            }
            g = g.b.get();
        }
        this.I.set(0);
        this.J.set(0);
    }
    
    public E o(final int i) {
        final int k = g.K;
        E e;
        if (i < k) {
            e = this.G.a.getAndSet(i, null);
        }
        else {
            e = this.e(i).a.getAndSet(i % k, null);
        }
        this.m(i);
        return e;
    }
    
    static final class a<E>
    {
        final AtomicReferenceArray<E> a;
        final AtomicReference<a<E>> b;
        
        a() {
            this.a = new AtomicReferenceArray<E>(g.K);
            this.b = new AtomicReference<a<E>>();
        }
        
        a<E> a() {
            if (this.b.get() == null) {
                final a newValue = new a();
                if (this.b.compareAndSet(null, newValue)) {
                    return newValue;
                }
            }
            return this.b.get();
        }
    }
    
    static class b
    {
        private final AtomicIntegerArray a;
        private final AtomicReference<b> b;
        
        b() {
            this.a = new AtomicIntegerArray(g.K);
            this.b = new AtomicReference<b>();
        }
        
        public int a(final int i, final int newValue) {
            return this.a.getAndSet(i, newValue);
        }
        
        b b() {
            if (this.b.get() == null) {
                final b newValue = new b();
                if (this.b.compareAndSet(null, newValue)) {
                    return newValue;
                }
            }
            return this.b.get();
        }
        
        public void c(final int i, final int newValue) {
            this.a.set(i, newValue);
        }
    }
}
