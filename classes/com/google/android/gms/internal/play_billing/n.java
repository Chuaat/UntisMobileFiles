// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

final class n<E> extends l<E>
{
    private final p<E> I;
    
    n(final p<E> i, final int n) {
        super(i.size(), n);
        this.I = i;
    }
    
    @Override
    protected final E a(final int n) {
        return this.I.get(n);
    }
}
