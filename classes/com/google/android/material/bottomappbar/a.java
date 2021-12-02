// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.bottomappbar;

import androidx.annotation.t;
import androidx.annotation.t0;
import androidx.annotation.j0;
import com.google.android.material.shape.q;
import com.google.android.material.shape.g;

public class a extends g implements Cloneable
{
    private static final int M = 90;
    private static final int N = 180;
    private static final int O = 270;
    private static final int P = 180;
    private static final float Q = 1.75f;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    
    public a(final float h, final float g, final float n) {
        this.L = -1.0f;
        this.H = h;
        this.G = g;
        this.m(n);
        this.K = 0.0f;
    }
    
    @Override
    public void b(final float n, float n2, float h, @j0 final q q) {
        final float i = this.I;
        if (i == 0.0f) {
            q.n(n, 0.0f);
            return;
        }
        final float n3 = (this.H * 2.0f + i) / 2.0f;
        final float n4 = h * this.G;
        final float n5 = n2 + this.K;
        n2 = this.J * h + (1.0f - h) * n3;
        if (n2 / n3 >= 1.0f) {
            q.n(n, 0.0f);
            return;
        }
        final float l = this.L;
        final float n6 = l * h;
        final boolean b = l == -1.0f || Math.abs(l * 2.0f - i) < 0.1f;
        if (!b) {
            h = 1.75f;
            n2 = 0.0f;
        }
        else {
            h = 0.0f;
        }
        final float n7 = n3 + n4;
        final float n8 = n2 + n4;
        final float n9 = (float)Math.sqrt(n7 * n7 - n8 * n8);
        final float n10 = n5 - n9;
        final float n11 = n5 + n9;
        final float n12 = (float)Math.toDegrees(Math.atan(n9 / n8));
        final float n13 = 90.0f - n12 + h;
        q.n(n10, 0.0f);
        final float n14 = n4 * 2.0f;
        q.a(n10 - n4, 0.0f, n10 + n4, n14, 270.0f, n12);
        float n15;
        float n16;
        float n17;
        float n18;
        if (b) {
            h = n5 - n3;
            n15 = -n3 - n2;
            n16 = n5 + n3;
            n2 = n3 - n2;
            n17 = 180.0f - n13;
            n18 = n13 * 2.0f - 180.0f;
        }
        else {
            final float h2 = this.H;
            n2 = n6 * 2.0f;
            h = n5 - n3;
            q.a(h, -(n6 + h2), h + (h2 + n2), h2 + n6, 180.0f - n13, (n13 * 2.0f - 180.0f) / 2.0f);
            n16 = n5 + n3;
            h = this.H;
            q.n(n16 - (h / 2.0f + n6), h + n6);
            final float h3 = this.H;
            h = n16 - (n2 + h3);
            n15 = -(n6 + h3);
            n2 = h3 + n6;
            n17 = 90.0f;
            n18 = n13 - 90.0f;
        }
        q.a(h, n15, n16, n2, n17, n18);
        q.a(n11 - n4, 0.0f, n11 + n4, n14, 270.0f - n12, n12);
        q.n(n, 0.0f);
    }
    
    float d() {
        return this.J;
    }
    
    public float f() {
        return this.L;
    }
    
    float g() {
        return this.H;
    }
    
    float i() {
        return this.G;
    }
    
    @t0({ t0.a.H })
    public float j() {
        return this.I;
    }
    
    @t0({ t0.a.H })
    public float l() {
        return this.K;
    }
    
    void m(@t(from = 0.0) final float j) {
        if (j >= 0.0f) {
            this.J = j;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }
    
    public void n(final float l) {
        this.L = l;
    }
    
    void q(final float h) {
        this.H = h;
    }
    
    void r(final float g) {
        this.G = g;
    }
    
    @t0({ t0.a.H })
    public void s(final float i) {
        this.I = i;
    }
    
    void t(final float k) {
        this.K = k;
    }
}
