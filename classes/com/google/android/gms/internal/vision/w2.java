// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class w2<E> extends l2<E>
{
    static final l2<Object> K;
    private final transient Object[] I;
    private final transient int J;
    
    static {
        K = new w2<Object>(new Object[0], 0);
    }
    
    w2(final Object[] i, final int j) {
        this.I = i;
        this.J = j;
    }
    
    @Override
    final int b(final Object[] array, final int n) {
        System.arraycopy(this.I, 0, array, n, this.J);
        return n + this.J;
    }
    
    @Override
    public final E get(final int n) {
        k1.a(n, this.J);
        return (E)this.I[n];
    }
    
    @Override
    final Object[] h() {
        return this.I;
    }
    
    @Override
    final int i() {
        return 0;
    }
    
    @Override
    final int k() {
        return this.J;
    }
    
    @Override
    final boolean m() {
        return false;
    }
    
    @Override
    public final int size() {
        return this.J;
    }
}
