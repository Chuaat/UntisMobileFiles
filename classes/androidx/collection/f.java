// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

public final class f
{
    private int[] a;
    private int b;
    private int c;
    private int d;
    
    public f() {
        this(8);
    }
    
    public f(final int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            int n = i;
            if (Integer.bitCount(i) != 1) {
                n = Integer.highestOneBit(i - 1) << 1;
            }
            this.d = n - 1;
            this.a = new int[n];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
    
    private void d() {
        final int[] a = this.a;
        final int length = a.length;
        final int b = this.b;
        final int n = length - b;
        final int n2 = length << 1;
        if (n2 >= 0) {
            final int[] a2 = new int[n2];
            System.arraycopy(a, b, a2, 0, n);
            System.arraycopy(this.a, 0, a2, n, this.b);
            this.a = a2;
            this.b = 0;
            this.c = length;
            this.d = n2 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }
    
    public void a(final int n) {
        final int b = this.b - 1 & this.d;
        this.b = b;
        this.a[b] = n;
        if (b == this.c) {
            this.d();
        }
    }
    
    public void b(int c) {
        final int[] a = this.a;
        final int c2 = this.c;
        a[c2] = c;
        c = (this.d & c2 + 1);
        this.c = c;
        if (c == this.b) {
            this.d();
        }
    }
    
    public void c() {
        this.c = this.b;
    }
    
    public int e(final int n) {
        if (n >= 0 && n < this.m()) {
            return this.a[this.d & this.b + n];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public int f() {
        final int b = this.b;
        if (b != this.c) {
            return this.a[b];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public int g() {
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
    
    public int i() {
        final int b = this.b;
        if (b != this.c) {
            final int n = this.a[b];
            this.b = (b + 1 & this.d);
            return n;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public int j() {
        final int b = this.b;
        final int c = this.c;
        if (b != c) {
            final int c2 = this.d & c - 1;
            final int n = this.a[c2];
            this.c = c2;
            return n;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public void k(final int n) {
        if (n <= 0) {
            return;
        }
        if (n <= this.m()) {
            this.c = (this.d & this.c - n);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public void l(final int n) {
        if (n <= 0) {
            return;
        }
        if (n <= this.m()) {
            this.b = (this.d & this.b + n);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public int m() {
        return this.c - this.b & this.d;
    }
}
