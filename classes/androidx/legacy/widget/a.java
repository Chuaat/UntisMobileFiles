// 
// Decompiled by Procyon v0.5.36
// 

package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View$MeasureSpec;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.view.View;

@Deprecated
public class a extends View
{
    @Deprecated
    public a(@j0 final Context context) {
        this(context, null);
    }
    
    @Deprecated
    public a(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    @Deprecated
    public a(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        if (this.getVisibility() == 0) {
            this.setVisibility(4);
        }
    }
    
    private static int a(int min, int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                min = size;
            }
        }
        else {
            min = Math.min(min, size);
        }
        return min;
    }
    
    @Deprecated
    @SuppressLint({ "MissingSuperCall" })
    public void draw(final Canvas canvas) {
    }
    
    @Deprecated
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(a(this.getSuggestedMinimumWidth(), n), a(this.getSuggestedMinimumHeight(), n2));
    }
}
