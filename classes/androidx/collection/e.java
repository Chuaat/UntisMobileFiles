// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

public final class e<E>
{
    private E[] a;
    private int b;
    private int c;
    private int d;
    
    public e() {
        this(8);
    }
    
    public e(final int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            int n = i;
            if (Integer.bitCount(i) != 1) {
                n = Integer.highestOneBit(i - 1) << 1;
            }
            this.d = n - 1;
            this.a = (E[])new Object[n];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
    
    private void d() {
        final E[] a = this.a;
        final int length = a.length;
        final int b = this.b;
        final int n = length - b;
        final int n2 = length << 1;
        if (n2 >= 0) {
            final Object[] a2 = new Object[n2];
            System.arraycopy(a, b, a2, 0, n);
            System.arraycopy(this.a, 0, a2, n, this.b);
            this.a = (E[])a2;
            this.b = 0;
            this.c = length;
            this.d = n2 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }
    
    public void a(final E e) {
        final int b = this.b - 1 & this.d;
        this.b = b;
        this.a[b] = e;
        if (b == this.c) {
            this.d();
        }
    }
    
    public void b(final E e) {
        final E[] a = this.a;
        final int c = this.c;
        a[c] = e;
        final int c2 = this.d & c + 1;
        this.c = c2;
        if (c2 == this.b) {
            this.d();
        }
    }
    
    public void c() {
        this.l(this.m());
    }
    
    public E e(final int n) {
        if (n >= 0 && n < this.m()) {
            return this.a[this.d & this.b + n];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public E f() {
        final int b = this.b;
        if (b != this.c) {
            return this.a[b];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public E g() {
        final int b = this.b;
        final int c = this.c;
        if (b != c) {
            return this.a[c - 1 & this.d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public boolean h() {
        return this.b == this.c;
    }
    
    public E i() {
        final int b = this.b;
        if (b != this.c) {
            final E[] a = this.a;
            final E e = a[b];
            a[b] = null;
            this.b = (b + 1 & this.d);
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public E j() {
        final int b = this.b;
        final int c = this.c;
        if (b != c) {
            final int c2 = this.d & c - 1;
            final E[] a = this.a;
            final E e = a[c2];
            a[c2] = null;
            this.c = c2;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public void k(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= this.m()) {
            int n = 0;
            final int c = this.c;
            if (i < c) {
                n = c - i;
            }
            int n2 = n;
            int c2;
            while (true) {
                c2 = this.c;
                if (n2 >= c2) {
                    break;
                }
                this.a[n2] = null;
                ++n2;
            }
            final int n3 = c2 - n;
            i -= n3;
            this.c = c2 - n3;
            if (i > 0) {
                final int length = this.a.length;
                this.c = length;
                int c3;
                for (c3 = (i = length - i); i < this.c; ++i) {
                    this.a[i] = null;
                }
                this.c = c3;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public void l(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= this.m()) {
            final int length = this.a.length;
            final int b = this.b;
            int n = length;
            int j = b;
            if (i < length - b) {
                n = b + i;
                j = b;
            }
            while (j < n) {
                this.a[j] = null;
                ++j;
            }
            final int b2 = this.b;
            final int n2 = n - b2;
            final int b3 = i - n2;
            this.b = (this.d & b2 + n2);
            if (b3 > 0) {
                for (i = 0; i < b3; ++i) {
                    this.a[i] = null;
                }
                this.b = b3;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public int m() {
        return this.c - this.b & this.d;
    }
}
