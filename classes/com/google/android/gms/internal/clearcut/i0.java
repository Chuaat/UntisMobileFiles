// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class i0
{
    private final p0 a;
    private final byte[] b;
    
    private i0(final int n) {
        final byte[] b = new byte[n];
        this.b = b;
        this.a = p0.S(b);
    }
    
    public final d0 a() {
        if (this.a.u() == 0) {
            return new k0(this.b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
    
    public final p0 b() {
        return this.a;
    }
}
