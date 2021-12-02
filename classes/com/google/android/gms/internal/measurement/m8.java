// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public class m8
{
    private static volatile int a = 100;
    
    public static int a(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static long b(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
}
