// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.snackbar;

import android.view.View$MeasureSpec;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.content.res.TypedArray;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.t0;
import android.widget.LinearLayout;

@t0({ t0.a.H })
public class SnackbarContentLayout extends LinearLayout implements a
{
    private TextView G;
    private Button H;
    private int I;
    private int J;
    
    public SnackbarContentLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public SnackbarContentLayout(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.Iq);
        this.I = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.Jq, -1);
        this.J = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.Qq, -1);
        obtainStyledAttributes.recycle();
    }
    
    private static void d(@j0 final View view, final int n, final int n2) {
        if (androidx.core.view.j0.X0(view)) {
            androidx.core.view.j0.b2(view, androidx.core.view.j0.j0(view), n, androidx.core.view.j0.i0(view), n2);
        }
        else {
            view.setPadding(view.getPaddingLeft(), n, view.getPaddingRight(), n2);
        }
    }
    
    private boolean e(final int orientation, final int n, final int n2) {
        final int orientation2 = this.getOrientation();
        final boolean b = true;
        boolean b2;
        if (orientation != orientation2) {
            this.setOrientation(orientation);
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (this.G.getPaddingTop() != n || this.G.getPaddingBottom() != n2) {
            d((View)this.G, n, n2);
            b2 = b;
        }
        return b2;
    }
    
    public void a(final int n, final int n2) {
        this.G.setAlpha(0.0f);
        final ViewPropertyAnimator alpha = this.G.animate().alpha(1.0f);
        final long n3 = n2;
        final ViewPropertyAnimator setDuration = alpha.setDuration(n3);
        final long n4 = n;
        setDuration.setStartDelay(n4).start();
        if (this.H.getVisibility() == 0) {
            this.H.setAlpha(0.0f);
            this.H.animate().alpha(1.0f).setDuration(n3).setStartDelay(n4).start();
        }
    }
    
    public void b(final int n, final int n2) {
        this.G.setAlpha(1.0f);
        final ViewPropertyAnimator alpha = this.G.animate().alpha(0.0f);
        final long n3 = n2;
        final ViewPropertyAnimator setDuration = alpha.setDuration(n3);
        final long n4 = n;
        setDuration.setStartDelay(n4).start();
        if (this.H.getVisibility() == 0) {
            this.H.setAlpha(1.0f);
            this.H.animate().alpha(0.0f).setDuration(n3).setStartDelay(n4).start();
        }
    }
    
    void c(final float n) {
        if (n != 1.0f) {
            this.H.setTextColor(s2.a.h(s2.a.d((View)this, o2.a.c.P2), this.H.getCurrentTextColor(), n));
        }
    }
    
    public Button getActionView() {
        return this.H;
    }
    
    public TextView getMessageView() {
        return this.G;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.G = (TextView)this.findViewById(o2.a.h.B4);
        this.H = (Button)this.findViewById(o2.a.h.A4);
    }
    
    protected void onMeasure(int lineCount, final int n) {
        super.onMeasure(lineCount, n);
        int measureSpec = lineCount;
        if (this.I > 0) {
            final int measuredWidth = this.getMeasuredWidth();
            final int i = this.I;
            measureSpec = lineCount;
            if (measuredWidth > i) {
                measureSpec = View$MeasureSpec.makeMeasureSpec(i, 1073741824);
                super.onMeasure(measureSpec, n);
            }
        }
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(o2.a.f.C1);
        int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(o2.a.f.B1);
        lineCount = this.G.getLayout().getLineCount();
        final int n2 = 0;
        if (lineCount > 1) {
            lineCount = 1;
        }
        else {
            lineCount = 0;
        }
        Label_0174: {
            if (lineCount != 0 && this.J > 0 && this.H.getMeasuredWidth() > this.J) {
                lineCount = n2;
                if (!this.e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    break Label_0174;
                }
            }
            else {
                if (lineCount != 0) {
                    dimensionPixelSize2 = dimensionPixelSize;
                }
                lineCount = n2;
                if (!this.e(0, dimensionPixelSize2, dimensionPixelSize2)) {
                    break Label_0174;
                }
            }
            lineCount = 1;
        }
        if (lineCount != 0) {
            super.onMeasure(measureSpec, n);
        }
    }
    
    public void setMaxInlineActionWidth(final int j) {
        this.J = j;
    }
}
