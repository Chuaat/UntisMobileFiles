// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.animation;

import androidx.annotation.j0;
import android.graphics.Matrix;
import android.animation.TypeEvaluator;

public class g implements TypeEvaluator<Matrix>
{
    private final float[] a;
    private final float[] b;
    private final Matrix c;
    
    public g() {
        this.a = new float[9];
        this.b = new float[9];
        this.c = new Matrix();
    }
    
    @j0
    public Matrix a(final float n, @j0 final Matrix matrix, @j0 final Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; ++i) {
            final float[] b = this.b;
            final float n2 = b[i];
            final float[] a = this.a;
            b[i] = a[i] + (n2 - a[i]) * n;
        }
        this.c.setValues(this.b);
        return this.c;
    }
}
