// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class k2<E> extends s1<E>
{
    private final l2<E> I;
    
    k2(final l2<E> i, final int n) {
        super(i.size(), n);
        this.I = i;
    }
    
    @Override
    protected final E a(final int n) {
        return this.I.get(n);
    }
}
