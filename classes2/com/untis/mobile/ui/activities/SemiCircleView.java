// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import androidx.core.content.d;
import android.annotation.TargetApi;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.j0;
import android.graphics.Paint;
import android.view.View;

public class SemiCircleView extends View
{
    private int G;
    private int H;
    private float I;
    @j0
    private Paint J;
    
    public SemiCircleView(final Context context) {
        super(context);
        this.a(context);
    }
    
    public SemiCircleView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context);
    }
    
    public SemiCircleView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context);
    }
    
    @TargetApi(21)
    public SemiCircleView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a(context);
    }
    
    private void a(@j0 final Context context) {
        this.G = d.f(context, 2131099984);
        this.H = d.f(context, 2131099972);
        this.I = context.getResources().getDimension(2131165365);
        this.J = new Paint(1);
    }
    
    private void setColor(final int n) {
        this.J.setColorFilter((ColorFilter)new PorterDuffColorFilter(n, PorterDuff$Mode.SRC_ATOP));
    }
    
    protected void onDraw(final Canvas canvas) {
        this.setColor(this.G);
        canvas.drawCircle(canvas.getWidth() * 0.5f, (float)canvas.getHeight(), canvas.getWidth() * 0.5f, this.J);
        this.setColor(this.H);
        canvas.drawCircle(canvas.getWidth() * 0.5f, (float)canvas.getHeight(), canvas.getWidth() * 0.5f - this.I * 2.0f, this.J);
    }
}
