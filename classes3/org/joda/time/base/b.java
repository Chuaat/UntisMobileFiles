// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.format.i;
import org.joda.time.d0;
import org.joda.time.k;
import org.joda.time.k0;

public abstract class b implements k0
{
    protected b() {
    }
    
    @Override
    public k H() {
        return new k(this.n());
    }
    
    @Override
    public boolean P1(final k0 k0) {
        k0 i = k0;
        if (k0 == null) {
            i = k.I;
        }
        return this.b(i) < 0;
    }
    
    public int b(final k0 k0) {
        final long n = lcmp(this.n(), k0.n());
        if (n < 0) {
            return -1;
        }
        if (n > 0) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof k0)) {
            return false;
        }
        if (this.n() != ((k0)o).n()) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final long n = this.n();
        return (int)(n ^ n >>> 32);
    }
    
    @Override
    public boolean l3(final k0 k0) {
        k0 i = k0;
        if (k0 == null) {
            i = k.I;
        }
        return this.b(i) == 0;
    }
    
    @Override
    public boolean l4(final k0 k0) {
        k0 i = k0;
        if (k0 == null) {
            i = k.I;
        }
        return this.b(i) > 0;
    }
    
    @Override
    public d0 r() {
        return new d0(this.n());
    }
    
    @ToString
    @Override
    public String toString() {
        final long n = this.n();
        final StringBuffer sb = new StringBuffer();
        sb.append("PT");
        final boolean b = n < 0L;
        i.h(sb, n);
        while (true) {
            final int length = sb.length();
            int n2;
            if (b) {
                n2 = 7;
            }
            else {
                n2 = 6;
            }
            final int n3 = 3;
            if (length >= n2) {
                break;
            }
            int offset;
            if (b) {
                offset = n3;
            }
            else {
                offset = 2;
            }
            sb.insert(offset, "0");
        }
        final long n4 = n / 1000L;
        final int n5 = sb.length() - 3;
        if (n4 * 1000L == n) {
            sb.setLength(n5);
        }
        else {
            sb.insert(n5, ".");
        }
        sb.append('S');
        return sb.toString();
    }
}
