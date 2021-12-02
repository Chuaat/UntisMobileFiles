// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public class j extends g1
{
    private float d;
    
    public j() {
        this.d = 3.0f;
    }
    
    private static float h(float n, float n2, final float n3, final float n4) {
        n = n3 - n;
        n2 = n4 - n2;
        return (float)Math.sqrt(n * n + n2 * n2);
    }
    
    @Override
    public long c(final ViewGroup viewGroup, final g0 g0, n0 n0, final n0 n2) {
        if (n0 == null && n2 == null) {
            return 0L;
        }
        int n3;
        if (n2 != null && this.e(n0) != 0) {
            n0 = n2;
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        final int f = this.f(n0);
        final int g2 = this.g(n0);
        final Rect o = g0.O();
        int n4;
        int n5;
        if (o != null) {
            n4 = o.centerX();
            n5 = o.centerY();
        }
        else {
            final int[] array = new int[2];
            viewGroup.getLocationOnScreen(array);
            n4 = Math.round(array[0] + viewGroup.getWidth() / 2 + viewGroup.getTranslationX());
            n5 = Math.round(array[1] + viewGroup.getHeight() / 2 + viewGroup.getTranslationY());
        }
        final float n6 = h((float)f, (float)g2, (float)n4, (float)n5) / h(0.0f, 0.0f, (float)viewGroup.getWidth(), (float)viewGroup.getHeight());
        long n7;
        if ((n7 = g0.N()) < 0L) {
            n7 = 300L;
        }
        return Math.round(n7 * n3 / this.d * n6);
    }
    
    public void i(final float d) {
        if (d != 0.0f) {
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}
