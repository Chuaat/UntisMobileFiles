// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import androidx.annotation.j0;

public final class l extends g
{
    private final g a;
    private final float b;
    
    public l(@j0 final g a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    boolean a() {
        return this.a.a();
    }
    
    @Override
    public void b(final float n, final float n2, final float n3, @j0 final q q) {
        this.a.b(n, n2 - this.b, n3, q);
    }
}
