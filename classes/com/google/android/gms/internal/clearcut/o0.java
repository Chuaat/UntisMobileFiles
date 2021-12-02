// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class o0 extends m0
{
    private final byte[] e;
    private final boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    
    private o0(final byte[] e, final int n, final int n2, final boolean f) {
        super(null);
        this.k = Integer.MAX_VALUE;
        this.e = e;
        this.g = n2 + n;
        this.i = n;
        this.j = n;
        this.f = f;
    }
    
    @Override
    public final int c() {
        return this.i - this.j;
    }
    
    @Override
    public final int d(int g) throws r1 {
        if (g < 0) {
            throw new r1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        final int k = g + this.c();
        final int i = this.k;
        if (k <= i) {
            this.k = k;
            g = this.g + this.h;
            this.g = g;
            final int n = g - this.j;
            if (n > k) {
                final int h = n - k;
                this.h = h;
                this.g = g - h;
            }
            else {
                this.h = 0;
            }
            return i;
        }
        throw r1.a();
    }
}
