// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import androidx.annotation.j0;

public class f extends e
{
    float a;
    
    public f() {
        this.a = -1.0f;
    }
    
    @Deprecated
    public f(final float a) {
        this.a = -1.0f;
        this.a = a;
    }
    
    @Override
    public void b(@j0 final q q, final float n, final float n2, final float n3) {
        q.q(0.0f, n3 * n2, 180.0f, 180.0f - n);
        final double sin = Math.sin(Math.toRadians(n));
        final double n4 = n3;
        final double n5 = n2;
        q.n((float)(sin * n4 * n5), (float)(Math.sin(Math.toRadians(90.0f - n)) * n4 * n5));
    }
}
