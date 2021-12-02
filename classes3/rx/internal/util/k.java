// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import java.util.Arrays;
import rx.functions.b;
import rx.internal.util.unsafe.p;

public final class k<T>
{
    private static final int f = -1640531527;
    final float a;
    int b;
    int c;
    int d;
    T[] e;
    
    public k() {
        this(16, 0.75f);
    }
    
    public k(final int n) {
        this(n, 0.75f);
    }
    
    public k(int b, final float a) {
        this.a = a;
        b = p.b(b);
        this.b = b - 1;
        this.d = (int)(a * b);
        this.e = (T[])new Object[b];
    }
    
    static int d(int n) {
        n *= -1640531527;
        return n ^ n >>> 16;
    }
    
    public boolean a(final T t) {
        final T[] e = this.e;
        final int b = this.b;
        final int n = d(t.hashCode()) & b;
        final T t2 = e[n];
        int n2 = n;
        Label_0084: {
            if (t2 != null) {
                n2 = n;
                if (t2.equals(t)) {
                    return false;
                }
                T t3;
                do {
                    n2 = (n2 + 1 & b);
                    t3 = e[n2];
                    if (t3 == null) {
                        break Label_0084;
                    }
                } while (!t3.equals(t));
                return false;
            }
        }
        e[n2] = t;
        if (++this.c >= this.d) {
            this.e();
        }
        return true;
    }
    
    public void b(final b<? super T> b) {
        if (this.c == 0) {
            return;
        }
        final T[] e = this.e;
        for (final T t : e) {
            if (t != null) {
                b.h(t);
            }
        }
        Arrays.fill(e, null);
        this.c = 0;
    }
    
    public boolean c() {
        return this.c == 0;
    }
    
    void e() {
        final T[] e = this.e;
        int length = e.length;
        final int n = length << 1;
        final int b = n - 1;
        final Object[] e2 = new Object[n];
        for (int i = this.c; i != 0; --i) {
            do {
                --length;
            } while (e[length] == null);
            int n3;
            final int n2 = n3 = (d(e[length].hashCode()) & b);
            if (e2[n2] != null) {
                int n4 = n2;
                int n5;
                do {
                    n5 = (n4 = (n4 + 1 & b));
                } while (e2[n5] != null);
                n3 = n5;
            }
            e2[n3] = e[length];
        }
        this.b = b;
        this.d = (int)(n * this.a);
        this.e = (T[])e2;
    }
    
    public boolean f(final T t) {
        final T[] e = this.e;
        final int b = this.b;
        final int n = d(t.hashCode()) & b;
        final T t2 = e[n];
        if (t2 == null) {
            return false;
        }
        int n2 = n;
        if (t2.equals(t)) {
            return this.g(n, e, b);
        }
        T t3;
        int n3;
        do {
            n3 = (n2 + 1 & b);
            t3 = e[n3];
            if (t3 == null) {
                return false;
            }
            n2 = n3;
        } while (!t3.equals(t));
        return this.g(n3, e, b);
    }
    
    boolean g(int n, final T[] array, final int n2) {
        --this.c;
    Block_1:
        while (true) {
            int n3 = n + 1;
            T t;
            while (true) {
                n3 &= n2;
                t = array[n3];
                if (t == null) {
                    break Block_1;
                }
                final int n4 = d(t.hashCode()) & n2;
                if (n <= n3) {
                    if (n >= n4) {
                        break;
                    }
                    if (n4 > n3) {
                        break;
                    }
                }
                else if (n >= n4 && n4 > n3) {
                    break;
                }
                ++n3;
            }
            array[n] = t;
            n = n3;
        }
        array[n] = null;
        return true;
    }
    
    public void h() {
        this.c = 0;
        this.e = (T[])new Object[0];
    }
    
    public T[] i() {
        return this.e;
    }
}
