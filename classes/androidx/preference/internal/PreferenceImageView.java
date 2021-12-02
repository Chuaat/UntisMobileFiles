// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference.internal;

import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import androidx.preference.o;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import android.widget.ImageView;

@SuppressLint({ "AppCompatCustomView" })
@t0({ t0.a.I })
public class PreferenceImageView extends ImageView
{
    private int G;
    private int H;
    
    public PreferenceImageView(final Context context) {
        this(context, null);
    }
    
    public PreferenceImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PreferenceImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o.m.U7, n, 0);
        this.setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(o.m.Y7, Integer.MAX_VALUE));
        this.setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(o.m.X7, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
    
    public int getMaxHeight() {
        return this.H;
    }
    
    public int getMaxWidth() {
        return this.G;
    }
    
    protected void onMeasure(int measureSpec, final int n) {
        final int mode = View$MeasureSpec.getMode(measureSpec);
        int measureSpec2 = 0;
        Label_0063: {
            if (mode != Integer.MIN_VALUE) {
                measureSpec2 = measureSpec;
                if (mode != 0) {
                    break Label_0063;
                }
            }
            final int size = View$MeasureSpec.getSize(measureSpec);
            final int maxWidth = this.getMaxWidth();
            measureSpec2 = measureSpec;
            if (maxWidth != Integer.MAX_VALUE) {
                if (maxWidth >= size) {
                    measureSpec2 = measureSpec;
                    if (mode != 0) {
                        break Label_0063;
                    }
                }
                measureSpec2 = View$MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        final int mode2 = View$MeasureSpec.getMode(n);
        Label_0124: {
            if (mode2 != Integer.MIN_VALUE) {
                measureSpec = n;
                if (mode2 != 0) {
                    break Label_0124;
                }
            }
            final int size2 = View$MeasureSpec.getSize(n);
            final int maxHeight = this.getMaxHeight();
            measureSpec = n;
            if (maxHeight != Integer.MAX_VALUE) {
                if (maxHeight >= size2) {
                    measureSpec = n;
                    if (mode2 != 0) {
                        break Label_0124;
                    }
                }
                measureSpec = View$MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(measureSpec2, measureSpec);
    }
    
    public void setMaxHeight(final int h) {
        super.setMaxHeight(this.H = h);
    }
    
    public void setMaxWidth(final int g) {
        super.setMaxWidth(this.G = g);
    }
}
