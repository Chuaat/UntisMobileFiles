// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.animation;

import android.graphics.PathMeasure;
import android.graphics.Path;
import android.view.animation.Interpolator;

class a implements Interpolator
{
    private static final float c = 0.002f;
    private final float[] a;
    private final float[] b;
    
    a(final float n, final float n2) {
        this(b(n, n2));
    }
    
    a(final float n, final float n2, final float n3, final float n4) {
        this(a(n, n2, n3, n4));
    }
    
    a(final Path path) {
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final float length = pathMeasure.getLength();
        final int n = (int)(length / 0.002f) + 1;
        this.a = new float[n];
        this.b = new float[n];
        final float[] array = new float[2];
        for (int i = 0; i < n; ++i) {
            pathMeasure.getPosTan(i * length / (n - 1), array, (float[])null);
            this.a[i] = array[0];
            this.b[i] = array[1];
        }
    }
    
    private static Path a(final float n, final float n2, final float n3, final float n4) {
        final Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(n, n2, n3, n4, 1.0f, 1.0f);
        return path;
    }
    
    private static Path b(final float n, final float n2) {
        final Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(n, n2, 1.0f, 1.0f);
        return path;
    }
    
    public float getInterpolation(float n) {
        if (n <= 0.0f) {
            return 0.0f;
        }
        if (n >= 1.0f) {
            return 1.0f;
        }
        int n2 = 0;
        int n3 = this.a.length - 1;
        while (n3 - n2 > 1) {
            final int n4 = (n2 + n3) / 2;
            if (n < this.a[n4]) {
                n3 = n4;
            }
            else {
                n2 = n4;
            }
        }
        final float[] a = this.a;
        final float n5 = a[n3] - a[n2];
        if (n5 == 0.0f) {
            return this.b[n2];
        }
        n = (n - a[n2]) / n5;
        final float[] b = this.b;
        final float n6 = b[n2];
        return n6 + n * (b[n3] - n6);
    }
}
