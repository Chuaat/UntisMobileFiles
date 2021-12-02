// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.List;

final class n2 extends l2<Object>
{
    private final transient int I;
    private final transient int J;
    private final /* synthetic */ l2 K;
    
    n2(final l2 k, final int i, final int j) {
        this.K = k;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final Object get(final int n) {
        k1.a(n, this.J);
        return this.K.get(n + this.I);
    }
    
    @Override
    final Object[] h() {
        return this.K.h();
    }
    
    @Override
    final int i() {
        return this.K.i() + this.I;
    }
    
    @Override
    final int k() {
        return this.K.i() + this.I + this.J;
    }
    
    @Override
    final boolean m() {
        return true;
    }
    
    @Override
    public final l2<Object> n(final int n, final int n2) {
        k1.e(n, n2, this.J);
        final l2 k = this.K;
        final int i = this.I;
        return (l2<Object>)k.subList(n + i, n2 + i);
    }
    
    @Override
    public final int size() {
        return this.J;
    }
}
