// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import androidx.annotation.j0;

public class t extends g
{
    private final float a;
    private final boolean b;
    
    public t(final float a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void b(final float n, final float n2, final float n3, @j0 final q q) {
        q.n(n2 - this.a * n3, 0.0f);
        float a;
        if (this.b) {
            a = this.a;
        }
        else {
            a = -this.a;
        }
        q.n(n2, a * n3);
        q.n(n2 + this.a * n3, 0.0f);
        q.n(n, 0.0f);
    }
}
