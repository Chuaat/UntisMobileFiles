// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;
import android.widget.LinearLayout;

@t0({ t0.a.I })
public class ButtonBarLayout extends LinearLayout
{
    private static final int J = 16;
    private boolean G;
    private int H;
    private int I;
    
    public ButtonBarLayout(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.H = -1;
        this.I = 0;
        final int[] d3 = a.n.D3;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, d3);
        androidx.core.view.j0.x1((View)this, context, d3, set, obtainStyledAttributes, 0, 0);
        this.G = obtainStyledAttributes.getBoolean(a.n.E3, true);
        obtainStyledAttributes.recycle();
    }
    
    private int a(int i) {
        while (i < this.getChildCount()) {
            if (this.getChildAt(i).getVisibility() == 0) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    private boolean b() {
        final int orientation = this.getOrientation();
        boolean b = true;
        if (orientation != 1) {
            b = false;
        }
        return b;
    }
    
    private void setStacked(final boolean orientation) {
        this.setOrientation((int)(orientation ? 1 : 0));
        int gravity;
        if ((orientation ? 1 : 0) != 0) {
            gravity = 8388613;
        }
        else {
            gravity = 80;
        }
        this.setGravity(gravity);
        final View viewById = this.findViewById(a.h.k1);
        if (viewById != null) {
            int visibility;
            if ((orientation ? 1 : 0) != 0) {
                visibility = 8;
            }
            else {
                visibility = 4;
            }
            viewById.setVisibility(visibility);
        }
        for (int i = this.getChildCount() - 2; i >= 0; --i) {
            this.bringChildToFront(this.getChildAt(i));
        }
    }
    
    public int getMinimumHeight() {
        return Math.max(this.I, super.getMinimumHeight());
    }
    
    protected void onMeasure(int minimumHeight, int n) {
        final int size = View$MeasureSpec.getSize(minimumHeight);
        final boolean g = this.G;
        final int n2 = 0;
        if (g) {
            if (size > this.H && this.b()) {
                this.setStacked(false);
            }
            this.H = size;
        }
        int measureSpec;
        boolean b;
        if (!this.b() && View$MeasureSpec.getMode(minimumHeight) == 1073741824) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            b = true;
        }
        else {
            measureSpec = minimumHeight;
            b = false;
        }
        super.onMeasure(measureSpec, n);
        boolean b2 = b;
        if (this.G) {
            b2 = b;
            if (!this.b()) {
                final boolean b3 = (this.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000;
                b2 = b;
                if (b3) {
                    this.setStacked(true);
                    b2 = true;
                }
            }
        }
        if (b2) {
            super.onMeasure(minimumHeight, n);
        }
        final int a = this.a(0);
        minimumHeight = n2;
        if (a >= 0) {
            final View child = this.getChildAt(a);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
            n = this.getPaddingTop() + child.getMeasuredHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin + 0;
            if (this.b()) {
                final int a2 = this.a(a + 1);
                minimumHeight = n;
                if (a2 >= 0) {
                    minimumHeight = n + (this.getChildAt(a2).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0f));
                }
            }
            else {
                minimumHeight = n + this.getPaddingBottom();
            }
        }
        if (androidx.core.view.j0.c0((View)this) != minimumHeight) {
            this.setMinimumHeight(minimumHeight);
        }
    }
    
    public void setAllowStacking(final boolean g) {
        if (this.G != g) {
            this.G = g;
            if (!g && this.getOrientation() == 1) {
                this.setStacked(false);
            }
            this.requestLayout();
        }
    }
}
