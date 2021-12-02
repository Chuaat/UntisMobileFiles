// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Locale;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Comparator;
import java.io.Serializable;

public abstract class f5 implements Serializable, Iterable<Byte>
{
    public static final f5 H;
    private static final l5 I;
    private static final Comparator<f5> J;
    private int G;
    
    static {
        H = new q5(t6.c);
        l5 i;
        if (u4.b()) {
            i = new p5(null);
        }
        else {
            i = new j5(null);
        }
        I = i;
        J = new h5();
    }
    
    f5() {
        this.G = 0;
    }
    
    public static f5 l(final String s) {
        return new q5(s.getBytes(t6.a));
    }
    
    static f5 m(final byte[] array) {
        return new q5(array);
    }
    
    public static f5 n(final byte[] array, final int n, final int n2) {
        v(n, n + n2, array.length);
        return new q5(f5.I.a(array, n, n2));
    }
    
    private static int t(final byte b) {
        return b & 0xFF;
    }
    
    static int v(final int n, final int n2, final int i) {
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
    
    static f5 w(final byte[] array, final int n, final int n2) {
        return new i5(array, n, n2);
    }
    
    static o5 z(final int n) {
        return new o5(n, null);
    }
    
    protected final int B() {
        return this.G;
    }
    
    public abstract boolean a();
    
    public abstract byte b(final int p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract int f();
    
    @Override
    public final int hashCode() {
        int g;
        if ((g = this.G) == 0) {
            final int f = this.f();
            if ((g = this.i(f, 0, f)) == 0) {
                g = 1;
            }
            this.G = g;
        }
        return g;
    }
    
    protected abstract int i(final int p0, final int p1, final int p2);
    
    public abstract f5 k(final int p0, final int p1);
    
    protected abstract String o(final Charset p0);
    
    abstract void p(final c5 p0) throws IOException;
    
    protected abstract void q(final byte[] p0, final int p1, final int p2, final int p3);
    
    abstract byte r(final int p0);
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final int f = this.f();
        String s;
        if (this.f() <= 50) {
            s = g9.a(this);
        }
        else {
            s = String.valueOf(g9.a(this.k(0, 47))).concat("...");
        }
        return String.format(root, "<ByteString@%s size=%d contents=\"%s\">", hexString, f, s);
    }
    
    public final String x() {
        final Charset a = t6.a;
        if (this.f() == 0) {
            return "";
        }
        return this.o(a);
    }
}
