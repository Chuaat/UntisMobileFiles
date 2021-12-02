// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class k8 extends m8
{
    private final byte[] c = c;
    private int d = 0;
    private int e;
    private int f = Integer.MAX_VALUE;
    
    public final int c(int n) throws u9 {
        final int f = this.f;
        this.f = 0;
        n = this.d + this.e;
        this.d = n;
        if (n > 0) {
            this.e = n;
            this.d = 0;
        }
        else {
            this.e = 0;
        }
        return f;
    }
}
