// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Comparator;
import java.io.Serializable;

public abstract class h8 implements Iterable<Byte>, Serializable
{
    public static final h8 H;
    private static final Comparator<h8> I;
    private static final g8 J;
    private int G;
    
    static {
        H = new e8(s9.c);
        final int a = s7.a;
        J = new g8(null);
        I = new z7();
    }
    
    h8() {
        this.G = 0;
    }
    
    static int o(final int n, final int n2, final int i) {
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
    
    public static h8 q(final byte[] array, final int n, final int n2) {
        o(n, n + n2, array.length);
        final byte[] array2 = new byte[n2];
        System.arraycopy(array, n, array2, 0, n2);
        return new e8(array2);
    }
    
    public static h8 r(final String s) {
        return new e8(s.getBytes(s9.a));
    }
    
    public abstract byte b(final int p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    abstract byte f(final int p0);
    
    public abstract int h();
    
    @Override
    public final int hashCode() {
        int g;
        if ((g = this.G) == 0) {
            final int h = this.h();
            if ((g = this.i(h, 0, h)) == 0) {
                g = 1;
            }
            this.G = g;
        }
        return g;
    }
    
    protected abstract int i(final int p0, final int p1, final int p2);
    
    public abstract h8 k(final int p0, final int p1);
    
    protected abstract String l(final Charset p0);
    
    abstract void m(final w7 p0) throws IOException;
    
    public abstract boolean n();
    
    protected final int p() {
        return this.G;
    }
    
    public final String t(final Charset charset) {
        String l;
        if (this.h() == 0) {
            l = "";
        }
        else {
            l = this.l(charset);
        }
        return l;
    }
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final int h = this.h();
        String s;
        if (this.h() <= 50) {
            s = tb.a(this);
        }
        else {
            s = String.valueOf(tb.a(this.k(0, 47))).concat("...");
        }
        return String.format(root, "<ByteString@%s size=%d contents=\"%s\">", hexString, h, s);
    }
}
