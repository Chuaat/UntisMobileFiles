// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;

public abstract class s5
{
    int a;
    int b;
    private int c;
    t5 d;
    private boolean e;
    
    private s5() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
    
    public static long b(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    static s5 c(final byte[] array, final int n, final int n2, final boolean b) {
        final u5 u5 = new u5(array, 0, n2, false, null);
        try {
            u5.h(n2);
            return u5;
        }
        catch (y6 cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public static int k(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public abstract boolean A() throws IOException;
    
    public abstract int B();
    
    public abstract int a() throws IOException;
    
    public abstract void d(final int p0) throws y6;
    
    public abstract double e() throws IOException;
    
    public abstract boolean f(final int p0) throws IOException;
    
    public abstract float g() throws IOException;
    
    public abstract int h(final int p0) throws y6;
    
    public abstract long i() throws IOException;
    
    public abstract void j(final int p0);
    
    public abstract long l() throws IOException;
    
    public abstract int m() throws IOException;
    
    public abstract long n() throws IOException;
    
    public abstract int o() throws IOException;
    
    public abstract boolean p() throws IOException;
    
    public abstract String q() throws IOException;
    
    public abstract String r() throws IOException;
    
    public abstract f5 s() throws IOException;
    
    public abstract int t() throws IOException;
    
    public abstract int u() throws IOException;
    
    public abstract int v() throws IOException;
    
    public abstract long w() throws IOException;
    
    public abstract int x() throws IOException;
    
    public abstract long y() throws IOException;
    
    abstract long z() throws IOException;
}
