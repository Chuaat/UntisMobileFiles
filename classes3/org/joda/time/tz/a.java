// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.tz;

import org.joda.time.i;

public class a extends i
{
    private static final long Q = 5472298452022250685L;
    private static final int R;
    private final i O;
    private final transient a[] P;
    
    static {
        Integer integer;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        }
        catch (SecurityException ex) {
            integer = null;
        }
        int n;
        if (integer == null) {
            n = 512;
        }
        else {
            int i = integer - 1;
            int n2 = 0;
            while (i > 0) {
                ++n2;
                i >>= 1;
            }
            n = 1 << n2;
        }
        R = n - 1;
    }
    
    private a(final i o) {
        super(o.q());
        this.P = new a[a.R + 1];
        this.O = o;
    }
    
    private a R(long h) {
        final long n = h & 0xFFFFFFFF00000000L;
        a a = new a(this.O, n);
        h = n;
        while (true) {
            final long n2 = h;
            h = this.O.H(n2);
            if (h == n2 || h > (0xFFFFFFFFL | n)) {
                break;
            }
            final a c = new a(this.O, h);
            a.c = c;
            a = c;
        }
        return a;
    }
    
    public static a S(final i i) {
        if (i instanceof a) {
            return (a)i;
        }
        return new a(i);
    }
    
    private a T(final long n) {
        final int n2 = (int)(n >> 32);
        final a[] p = this.P;
        final int n3 = a.R & n2;
        final a a = p[n3];
        if (a != null) {
            final a r = a;
            if ((int)(a.a >> 32) == n2) {
                return r;
            }
        }
        final a r = this.R(n);
        p[n3] = r;
        return r;
    }
    
    @Override
    public int D(final long n) {
        return this.T(n).c(n);
    }
    
    @Override
    public boolean E() {
        return this.O.E();
    }
    
    @Override
    public long H(final long n) {
        return this.O.H(n);
    }
    
    @Override
    public long J(final long n) {
        return this.O.J(n);
    }
    
    public i U() {
        return this.O;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof a && this.O.equals(((a)o).O));
    }
    
    @Override
    public int hashCode() {
        return this.O.hashCode();
    }
    
    @Override
    public String u(final long n) {
        return this.T(n).a(n);
    }
    
    @Override
    public int w(final long n) {
        return this.T(n).b(n);
    }
    
    private static final class a
    {
        public final long a;
        public final i b;
        a c;
        private String d;
        private int e;
        private int f;
        
        a(final i b, final long a) {
            this.e = Integer.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.a = a;
            this.b = b;
        }
        
        public String a(final long n) {
            final a c = this.c;
            if (c != null && n >= c.a) {
                return c.a(n);
            }
            if (this.d == null) {
                this.d = this.b.u(this.a);
            }
            return this.d;
        }
        
        public int b(final long n) {
            final a c = this.c;
            if (c != null && n >= c.a) {
                return c.b(n);
            }
            if (this.e == Integer.MIN_VALUE) {
                this.e = this.b.w(this.a);
            }
            return this.e;
        }
        
        public int c(final long n) {
            final a c = this.c;
            if (c != null && n >= c.a) {
                return c.c(n);
            }
            if (this.f == Integer.MIN_VALUE) {
                this.f = this.b.D(this.a);
            }
            return this.f;
        }
    }
}
