// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.widget.ProgressBar;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.RatingBar;

public class q extends RatingBar
{
    private final o G;
    
    public q(@j0 final Context context) {
        this(context, null);
    }
    
    public q(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.P2);
    }
    
    public q(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        p0.a((View)this, this.getContext());
        (this.G = new o((ProgressBar)this)).c(set, n);
    }
    
    protected void onMeasure(final int n, final int n2) {
        synchronized (this) {
            super.onMeasure(n, n2);
            final Bitmap b = this.G.b();
            if (b != null) {
                this.setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * this.getNumStars(), n, 0), this.getMeasuredHeight());
            }
        }
    }
}
