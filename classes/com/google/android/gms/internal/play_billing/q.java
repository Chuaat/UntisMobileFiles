// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

final class q<E> extends p<E>
{
    static final p<Object> J;
    final transient Object[] I;
    
    static {
        J = new q<Object>(new Object[0], 0);
    }
    
    q(final Object[] i, final int n) {
        this.I = i;
    }
    
    @Override
    final int b(final Object[] array, final int n) {
        System.arraycopy(this.I, 0, array, 0, 0);
        return 0;
    }
    
    @Override
    final int f() {
        return 0;
    }
    
    @Override
    public final E get(final int n) {
        j.a(n, 0, "index");
        return (E)this.I[n];
    }
    
    @Override
    final int h() {
        return 0;
    }
    
    @Override
    final Object[] k() {
        return this.I;
    }
    
    @Override
    public final int size() {
        return 0;
    }
}
