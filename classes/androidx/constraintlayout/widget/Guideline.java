// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.view.ViewGroup$LayoutParams;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class Guideline extends View
{
    public Guideline(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public Guideline(final Context context, final AttributeSet set) {
        super(context, set);
        super.setVisibility(8);
    }
    
    public Guideline(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        super.setVisibility(8);
    }
    
    public Guideline(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n);
        super.setVisibility(8);
    }
    
    @SuppressLint({ "MissingSuperCall" })
    public void draw(final Canvas canvas) {
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setGuidelineBegin(final int a) {
        final ConstraintLayout.b layoutParams = (ConstraintLayout.b)this.getLayoutParams();
        layoutParams.a = a;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelineEnd(final int b) {
        final ConstraintLayout.b layoutParams = (ConstraintLayout.b)this.getLayoutParams();
        layoutParams.b = b;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelinePercent(final float c) {
        final ConstraintLayout.b layoutParams = (ConstraintLayout.b)this.getLayoutParams();
        layoutParams.c = c;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setVisibility(final int n) {
    }
}
