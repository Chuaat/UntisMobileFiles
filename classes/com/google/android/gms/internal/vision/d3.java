// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class d3 extends l2<Object>
{
    private final transient Object[] I;
    private final transient int J;
    private final transient int K;
    
    d3(final Object[] i, final int j, final int k) {
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    public final Object get(final int n) {
        k1.a(n, this.K);
        return this.I[n * 2 + this.J];
    }
    
    @Override
    final boolean m() {
        return true;
    }
    
    @Override
    public final int size() {
        return this.K;
    }
}
