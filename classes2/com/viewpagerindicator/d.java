// 
// Decompiled by Procyon v0.5.36
// 

package com.viewpagerindicator;

import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;

class d extends LinearLayout
{
    private static final int[] L;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private Drawable G;
    private int H;
    private int I;
    private int J;
    private int K;
    
    static {
        L = new int[] { 16843049, 16843561, 16843562 };
    }
    
    public d(final Context context, final int n) {
        super(context);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, d.L, n, 0);
        this.setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.K = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.J = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
    }
    
    private void a(final Canvas canvas) {
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child != null && child.getVisibility() != 8 && this.e(i)) {
                this.d(canvas, child.getLeft() - ((LinearLayout$LayoutParams)child.getLayoutParams()).leftMargin);
            }
        }
        if (this.e(childCount)) {
            final View child2 = this.getChildAt(childCount - 1);
            int right;
            if (child2 == null) {
                right = this.getWidth() - this.getPaddingRight() - this.H;
            }
            else {
                right = child2.getRight();
            }
            this.d(canvas, right);
        }
    }
    
    private void b(final Canvas canvas) {
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child != null && child.getVisibility() != 8 && this.e(i)) {
                this.c(canvas, child.getTop() - ((LinearLayout$LayoutParams)child.getLayoutParams()).topMargin);
            }
        }
        if (this.e(childCount)) {
            final View child2 = this.getChildAt(childCount - 1);
            int bottom;
            if (child2 == null) {
                bottom = this.getHeight() - this.getPaddingBottom() - this.I;
            }
            else {
                bottom = child2.getBottom();
            }
            this.c(canvas, bottom);
        }
    }
    
    private void c(final Canvas canvas, final int n) {
        this.G.setBounds(this.getPaddingLeft() + this.K, n, this.getWidth() - this.getPaddingRight() - this.K, this.I + n);
        this.G.draw(canvas);
    }
    
    private void d(final Canvas canvas, final int n) {
        this.G.setBounds(n, this.getPaddingTop() + this.K, this.H + n, this.getHeight() - this.getPaddingBottom() - this.K);
        this.G.draw(canvas);
    }
    
    private boolean e(int n) {
        boolean b2;
        final boolean b = b2 = false;
        if (n != 0) {
            if (n == this.getChildCount()) {
                b2 = b;
            }
            else {
                b2 = b;
                if ((this.J & 0x2) != 0x0) {
                    --n;
                    while (true) {
                        b2 = b;
                        if (n < 0) {
                            break;
                        }
                        if (this.getChildAt(n).getVisibility() != 8) {
                            b2 = true;
                            break;
                        }
                        --n;
                    }
                }
            }
        }
        return b2;
    }
    
    protected void measureChildWithMargins(final View view, final int n, final int n2, final int n3, final int n4) {
        final int indexOfChild = this.indexOfChild(view);
        final int orientation = this.getOrientation();
        final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)view.getLayoutParams();
        if (this.e(indexOfChild)) {
            if (orientation == 1) {
                linearLayout$LayoutParams.topMargin = this.I;
            }
            else {
                linearLayout$LayoutParams.leftMargin = this.H;
            }
        }
        final int childCount = this.getChildCount();
        if (indexOfChild == childCount - 1 && this.e(childCount)) {
            if (orientation == 1) {
                linearLayout$LayoutParams.bottomMargin = this.I;
            }
            else {
                linearLayout$LayoutParams.rightMargin = this.H;
            }
        }
        super.measureChildWithMargins(view, n, n2, n3, n4);
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.G != null) {
            if (this.getOrientation() == 1) {
                this.b(canvas);
            }
            else {
                this.a(canvas);
            }
        }
        super.onDraw(canvas);
    }
    
    public void setDividerDrawable(final Drawable g) {
        if (g == this.G) {
            return;
        }
        this.G = g;
        boolean willNotDraw = false;
        if (g != null) {
            this.H = g.getIntrinsicWidth();
            this.I = g.getIntrinsicHeight();
        }
        else {
            this.H = 0;
            this.I = 0;
        }
        if (g == null) {
            willNotDraw = true;
        }
        this.setWillNotDraw(willNotDraw);
        this.requestLayout();
    }
}
