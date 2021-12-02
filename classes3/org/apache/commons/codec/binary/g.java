// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.util.Arrays;
import org.apache.commons.codec.f;
import org.apache.commons.codec.h;
import org.apache.commons.codec.a;
import org.apache.commons.codec.b;

public abstract class g implements b, org.apache.commons.codec.a
{
    static final int g = -1;
    public static final int h = 76;
    public static final int i = 64;
    private static final int j = 2;
    private static final int k = 8192;
    private static final int l = 2147483639;
    protected static final int m = 255;
    protected static final byte n = 61;
    @Deprecated
    protected final byte a;
    protected final byte b;
    private final int c;
    private final int d;
    protected final int e;
    private final int f;
    
    protected g(final int n, final int n2, final int n3, final int n4) {
        this(n, n2, n3, n4, (byte)61);
    }
    
    protected g(int c, final int d, final int n, final int f, final byte b) {
        this.a = 61;
        this.c = c;
        this.d = d;
        int e = 0;
        if (n > 0 && f > 0) {
            c = 1;
        }
        else {
            c = 0;
        }
        if (c != 0) {
            e = n / d * d;
        }
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    private static int h(final int n, final int n2) {
        return Integer.compare(n - Integer.MIN_VALUE, n2 - Integer.MIN_VALUE);
    }
    
    private static int j(int n) {
        if (n >= 0) {
            if (n <= 2147483639) {
                n = 2147483639;
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to allocate array size: ");
        sb.append((long)n & 0xFFFFFFFFL);
        throw new OutOfMemoryError(sb.toString());
    }
    
    protected static boolean x(final byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }
    
    private static byte[] z(final a a, final int n) {
        int n2;
        if (h(n2 = a.c.length * 2, n) < 0) {
            n2 = n;
        }
        int j = n2;
        if (h(n2, 2147483639) > 0) {
            j = j(n);
        }
        final byte[] c = new byte[j];
        final byte[] c2 = a.c;
        System.arraycopy(c2, 0, c, 0, c2.length);
        return a.c = c;
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o instanceof byte[]) {
            return this.e((byte[])o);
        }
        throw new h("Parameter supplied to Base-N encode is not a byte[]");
    }
    
    @Override
    public byte[] c(byte[] array) {
        if (array != null && array.length != 0) {
            final a a = new a();
            this.k(array, 0, array.length, a);
            this.k(array, 0, -1, a);
            final int d = a.d;
            array = new byte[d];
            this.y(array, 0, d, a);
            return array;
        }
        return array;
    }
    
    @Override
    public byte[] e(final byte[] array) {
        byte[] n = array;
        if (array != null) {
            if (array.length == 0) {
                n = array;
            }
            else {
                n = this.n(array, 0, array.length);
            }
        }
        return n;
    }
    
    @Override
    public Object f(final Object o) throws f {
        if (o instanceof byte[]) {
            return this.c((byte[])o);
        }
        if (o instanceof String) {
            return this.l((String)o);
        }
        throw new f("Parameter supplied to Base-N decode is not a byte[] or a String");
    }
    
    int g(final a a) {
        int n;
        if (a.c != null) {
            n = a.d - a.e;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    protected boolean i(final byte[] array) {
        if (array == null) {
            return false;
        }
        for (final byte b : array) {
            if (this.b == b || this.u(b)) {
                return true;
            }
        }
        return false;
    }
    
    abstract void k(final byte[] p0, final int p1, final int p2, final a p3);
    
    public byte[] l(final String s) {
        return this.c(org.apache.commons.codec.binary.m.k(s));
    }
    
    abstract void m(final byte[] p0, final int p1, final int p2, final a p3);
    
    public byte[] n(byte[] array, int n, final int n2) {
        if (array != null && array.length != 0) {
            final a a = new a();
            this.m(array, n, n2, a);
            this.m(array, n, -1, a);
            n = a.d - a.e;
            array = new byte[n];
            this.y(array, 0, n, a);
            return array;
        }
        return array;
    }
    
    public String o(final byte[] array) {
        return org.apache.commons.codec.binary.m.t(this.e(array));
    }
    
    public String p(final byte[] array) {
        return org.apache.commons.codec.binary.m.t(this.e(array));
    }
    
    protected byte[] q(final int n, final a a) {
        final byte[] c = a.c;
        if (c == null) {
            a.c = new byte[this.r()];
            a.d = 0;
            a.e = 0;
        }
        else {
            final int d = a.d;
            if (d + n - c.length > 0) {
                return z(a, d + n);
            }
        }
        return a.c;
    }
    
    protected int r() {
        return 8192;
    }
    
    public long s(final byte[] array) {
        final int length = array.length;
        final int c = this.c;
        final long n = (length + c - 1) / c * (long)this.d;
        final int e = this.e;
        long n2 = n;
        if (e > 0) {
            n2 = n + (e + n - 1L) / e * this.f;
        }
        return n2;
    }
    
    boolean t(final a a) {
        return a.c != null;
    }
    
    protected abstract boolean u(final byte p0);
    
    public boolean v(final String s) {
        return this.w(org.apache.commons.codec.binary.m.k(s), true);
    }
    
    public boolean w(final byte[] array, final boolean b) {
        for (final byte b2 : array) {
            if (!this.u(b2) && (!b || (b2 != this.b && !x(b2)))) {
                return false;
            }
        }
        return true;
    }
    
    int y(final byte[] array, int e, int min, final a a) {
        if (a.c != null) {
            min = Math.min(this.g(a), min);
            System.arraycopy(a.c, a.e, array, e, min);
            e = a.e + min;
            if ((a.e = e) >= a.d) {
                a.c = null;
            }
            return min;
        }
        if (a.f) {
            e = -1;
        }
        else {
            e = 0;
        }
        return e;
    }
    
    static class a
    {
        int a;
        long b;
        byte[] c;
        int d;
        int e;
        boolean f;
        int g;
        int h;
        
        @Override
        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", this.getClass().getSimpleName(), Arrays.toString(this.c), this.g, this.f, this.a, this.b, this.h, this.d, this.e);
        }
    }
}
