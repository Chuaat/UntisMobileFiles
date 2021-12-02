// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.core.view.j0;
import android.view.View;

public class d0 extends g1
{
    private float d;
    private int e;
    
    public d0() {
        this.d = 3.0f;
        this.e = 80;
    }
    
    private int h(final View view, int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int e = this.e;
        final int n9 = 0;
        final int n10 = 1;
        boolean b = true;
        int n11 = 0;
        Label_0090: {
            Label_0047: {
                if (e == 8388611) {
                    if (j0.X(view) != 1) {
                        b = false;
                    }
                    if (!b) {
                        break Label_0047;
                    }
                }
                else {
                    if ((n11 = e) != 8388613) {
                        break Label_0090;
                    }
                    int n12;
                    if (j0.X(view) == 1) {
                        n12 = n10;
                    }
                    else {
                        n12 = 0;
                    }
                    if (n12 != 0) {
                        break Label_0047;
                    }
                }
                n11 = 5;
                break Label_0090;
            }
            n11 = 3;
        }
        if (n11 != 3) {
            if (n11 != 5) {
                if (n11 != 48) {
                    if (n11 != 80) {
                        n = n9;
                    }
                    else {
                        n = n2 - n6 + Math.abs(n3 - n);
                    }
                }
                else {
                    n = n8 - n2 + Math.abs(n3 - n);
                }
            }
            else {
                n = n - n5 + Math.abs(n4 - n2);
            }
        }
        else {
            n = n7 - n + Math.abs(n4 - n2);
        }
        return n;
    }
    
    private int i(final ViewGroup viewGroup) {
        final int e = this.e;
        if (e != 3 && e != 5 && e != 8388611 && e != 8388613) {
            return viewGroup.getHeight();
        }
        return viewGroup.getWidth();
    }
    
    @Override
    public long c(final ViewGroup viewGroup, final g0 g0, n0 n0, final n0 n2) {
        if (n0 == null && n2 == null) {
            return 0L;
        }
        final Rect o = g0.O();
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
        final int[] array = new int[2];
        viewGroup.getLocationOnScreen(array);
        final int n4 = array[0] + Math.round(viewGroup.getTranslationX());
        final int n5 = array[1] + Math.round(viewGroup.getTranslationY());
        final int n6 = n4 + viewGroup.getWidth();
        final int n7 = n5 + viewGroup.getHeight();
        int centerX;
        int centerY;
        if (o != null) {
            centerX = o.centerX();
            centerY = o.centerY();
        }
        else {
            centerX = (n4 + n6) / 2;
            centerY = (n5 + n7) / 2;
        }
        final float n8 = this.h((View)viewGroup, f, g2, centerX, centerY, n4, n5, n6, n7) / (float)this.i(viewGroup);
        long n9;
        if ((n9 = g0.N()) < 0L) {
            n9 = 300L;
        }
        return Math.round(n9 * n3 / this.d * n8);
    }
    
    public void j(final float d) {
        if (d != 0.0f) {
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
    
    public void k(final int e) {
        this.e = e;
    }
}
