// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import androidx.annotation.j0;

public final class i extends g
{
    private final float a;
    
    public i(final float n) {
        this.a = n - 0.001f;
    }
    
    @Override
    boolean a() {
        return true;
    }
    
    @Override
    public void b(float n, final float n2, float n3, @j0 final q q) {
        n3 = (float)(this.a * Math.sqrt(2.0) / 2.0);
        n = (float)Math.sqrt(Math.pow(this.a, 2.0) - Math.pow(n3, 2.0));
        q.p(n2 - n3, (float)(-(this.a * Math.sqrt(2.0) - this.a)) + n);
        q.n(n2, (float)(-(this.a * Math.sqrt(2.0) - this.a)));
        q.n(n2 + n3, (float)(-(this.a * Math.sqrt(2.0) - this.a)) + n);
    }
}
