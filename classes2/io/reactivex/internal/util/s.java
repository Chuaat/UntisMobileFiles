// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

public final class s<T>
{
    private static final int f = -1640531527;
    final float a;
    int b;
    int c;
    int d;
    T[] e;
    
    public s() {
        this(16, 0.75f);
    }
    
    public s(final int n) {
        this(n, 0.75f);
    }
    
    public s(int b, final float a) {
        this.a = a;
        b = t.b(b);
        this.b = b - 1;
        this.d = (int)(a * b);
        this.e = (T[])new Object[b];
    }
    
    static int c(int n) {
        n *= -1640531527;
        return n ^ n >>> 16;
    }
    
    public boolean a(final T t) {
        final T[] e = this.e;
        final int b = this.b;
        int n = c(t.hashCode()) & b;
        final T t2 = e[n];
        int n2 = n;
        Label_0084: {
            if (t2 != null) {
                if (t2.equals(t)) {
                    return false;
                }
                T t3;
                do {
                    n2 = (n + 1 & b);
                    t3 = e[n2];
                    if (t3 == null) {
                        break Label_0084;
                    }
                    n = n2;
                } while (!t3.equals(t));
                return false;
            }
        }
        e[n2] = t;
        if (++this.c >= this.d) {
            this.d();
        }
        return true;
    }
    
    public Object[] b() {
        return this.e;
    }
    
    void d() {
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
            int n2 = n3 = (c(e[length].hashCode()) & b);
            if (e2[n2] != null) {
                do {
                    n3 = (n2 = (n2 + 1 & b));
                } while (e2[n3] != null);
            }
            e2[n3] = e[length];
        }
        this.b = b;
        this.d = (int)(n * this.a);
        this.e = (T[])e2;
    }
    
    public boolean e(final T t) {
        final T[] e = this.e;
        final int b = this.b;
        final int n = c(t.hashCode()) & b;
        final T t2 = e[n];
        if (t2 == null) {
            return false;
        }
        int n2 = n;
        if (t2.equals(t)) {
            return this.f(n, e, b);
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
        return this.f(n3, e, b);
    }
    
    boolean f(int n, final T[] array, final int n2) {
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
                final int n4 = c(t.hashCode()) & n2;
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
    
    public int g() {
        return this.c;
    }
}
