// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.Serializable;

public abstract class d0 implements Serializable, Iterable<Byte>
{
    public static final d0 H;
    private static final h0 I;
    private int G;
    
    static {
        H = new k0(l1.c);
        h0 i;
        if (x.b()) {
            i = new l0(null);
        }
        else {
            i = new f0(null);
        }
        I = i;
    }
    
    d0() {
        this.G = 0;
    }
    
    static int m(final int n, final int n2, final int i) {
        final int n3 = n2 - n;
        if ((n | n2 | n3 | i - n2) >= 0) {
            return n3;
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(n);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (n2 < n) {
            final StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(n);
            sb2.append(", ");
            sb2.append(n2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(n2);
        sb3.append(" >= ");
        sb3.append(i);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
    
    public static d0 n(final byte[] array, final int n, final int n2) {
        return new k0(d0.I.a(array, n, n2));
    }
    
    public static d0 o(final String s) {
        return new k0(s.getBytes(l1.a));
    }
    
    static i0 q(final int n) {
        return new i0(n, null);
    }
    
    protected abstract int b(final int p0, final int p1, final int p2);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract d0 f(final int p0, final int p1);
    
    protected abstract String h(final Charset p0);
    
    @Override
    public final int hashCode() {
        int g;
        if ((g = this.G) == 0) {
            final int size = this.size();
            if ((g = this.b(size, 0, size)) == 0) {
                g = 1;
            }
            this.G = g;
        }
        return g;
    }
    
    abstract void i(final c0 p0) throws IOException;
    
    public abstract boolean k();
    
    protected final int l() {
        return this.G;
    }
    
    public abstract byte p(final int p0);
    
    public final String r() {
        final Charset a = l1.a;
        if (this.size() == 0) {
            return "";
        }
        return this.h(a);
    }
    
    public abstract int size();
    
    @Override
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }
}
