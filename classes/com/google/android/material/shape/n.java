// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import androidx.annotation.j0;

public class n extends e
{
    float a;
    
    public n() {
        this.a = -1.0f;
    }
    
    @Deprecated
    public n(final float a) {
        this.a = -1.0f;
        this.a = a;
    }
    
    @Override
    public void b(@j0 final q q, final float n, float n2, final float n3) {
        q.q(0.0f, n3 * n2, 180.0f, 180.0f - n);
        n2 *= n3 * 2.0f;
        q.a(0.0f, 0.0f, n2, n2, 180.0f, n);
    }
}
