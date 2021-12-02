// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import java.util.List;

final class o extends p
{
    final transient int I;
    final transient int J;
    final /* synthetic */ p K;
    
    o(final p k, final int i, final int j) {
        this.K = k;
        this.I = i;
        this.J = j;
    }
    
    @Override
    final int f() {
        return this.K.h() + this.I + this.J;
    }
    
    @Override
    public final Object get(final int n) {
        j.a(n, this.J, "index");
        return this.K.get(n + this.I);
    }
    
    @Override
    final int h() {
        return this.K.h() + this.I;
    }
    
    @Override
    final Object[] k() {
        return this.K.k();
    }
    
    @Override
    public final p l(final int n, final int n2) {
        j.c(n, n2, this.J);
        final p k = this.K;
        final int i = this.I;
        return k.l(n + i, n2 + i);
    }
    
    @Override
    public final int size() {
        return this.J;
    }
}
