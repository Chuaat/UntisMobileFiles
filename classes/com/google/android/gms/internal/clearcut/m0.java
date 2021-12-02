// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

public abstract class m0
{
    private static volatile boolean d = true;
    private int a;
    private int b;
    private boolean c;
    
    private m0() {
        this.a = 100;
        this.b = Integer.MAX_VALUE;
        this.c = false;
    }
    
    public static long a(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    static m0 b(final byte[] array, final int n, final int n2, final boolean b) {
        final o0 o0 = new o0(array, 0, n2, false, null);
        try {
            o0.d(n2);
            return o0;
        }
        catch (r1 cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public static int e(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public abstract int c();
    
    public abstract int d(final int p0) throws r1;
}
