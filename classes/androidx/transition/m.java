// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.animation.TypeEvaluator;

class m implements TypeEvaluator<float[]>
{
    private float[] a;
    
    m(final float[] a) {
        this.a = a;
    }
    
    public float[] a(final float n, final float[] array, final float[] array2) {
        float[] a;
        if ((a = this.a) == null) {
            a = new float[array.length];
        }
        for (int i = 0; i < a.length; ++i) {
            final float n2 = array[i];
            a[i] = n2 + (array2[i] - n2) * n;
        }
        return a;
    }
}
