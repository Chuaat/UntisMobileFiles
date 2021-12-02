// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

public final class k3 extends j3
{
    public static int a(final int a, final int n, int n2) {
        if (n <= 1073741823) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            return Math.min(Math.max(a, n), 1073741823);
        }
        throw new IllegalArgumentException(m1.c("min (%s) must be less than or equal to max (%s)", n, 1073741823));
    }
}
