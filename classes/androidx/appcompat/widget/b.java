// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.ColorFilter;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.graphics.Outline;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

class b extends Drawable
{
    final ActionBarContainer a;
    
    public b(final ActionBarContainer a) {
        this.a = a;
    }
    
    public void draw(final Canvas canvas) {
        final ActionBarContainer a = this.a;
        if (a.N) {
            final Drawable m = a.M;
            if (m != null) {
                m.draw(canvas);
            }
        }
        else {
            final Drawable k = a.K;
            if (k != null) {
                k.draw(canvas);
            }
            final ActionBarContainer a2 = this.a;
            final Drawable l = a2.L;
            if (l != null && a2.O) {
                l.draw(canvas);
            }
        }
    }
    
    public int getOpacity() {
        return 0;
    }
    
    @p0(21)
    public void getOutline(@j0 final Outline outline) {
        final ActionBarContainer a = this.a;
        Drawable drawable;
        if (a.N) {
            drawable = a.M;
            if (drawable == null) {
                return;
            }
        }
        else {
            drawable = a.K;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
}
