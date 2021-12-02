// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class o5
{
    private final v5 a;
    private final byte[] b;
    
    private o5(final int n) {
        final byte[] b = new byte[n];
        this.b = b;
        this.a = v5.f(b);
    }
    
    public final f5 a() {
        this.a.N();
        return new q5(this.b);
    }
    
    public final v5 b() {
        return this.a;
    }
}
