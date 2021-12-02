// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import androidx.core.view.n;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.content.res.TypedArray;
import o2.a;
import android.annotation.TargetApi;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;
import android.view.ViewGroup;

@t0({ t0.a.H })
public class e extends ViewGroup
{
    private int G;
    private int H;
    private boolean I;
    private int J;
    
    public e(@j0 final Context context) {
        this(context, null);
    }
    
    public e(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public e(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.I = false;
        this.d(context, set);
    }
    
    @TargetApi(21)
    public e(@j0 final Context context, @k0 final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.I = false;
        this.d(context, set);
    }
    
    private static int a(final int b, final int n, final int a) {
        if (n == Integer.MIN_VALUE) {
            return Math.min(a, b);
        }
        if (n != 1073741824) {
            return a;
        }
        return b;
    }
    
    private void d(@j0 final Context context, @k0 final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, a.o.kf, 0, 0);
        this.G = obtainStyledAttributes.getDimensionPixelSize(a.o.qf, 0);
        this.H = obtainStyledAttributes.getDimensionPixelSize(a.o.of, 0);
        obtainStyledAttributes.recycle();
    }
    
    public int b(@j0 final View view) {
        final Object tag = view.getTag(a.h.a4);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return (int)tag;
    }
    
    public boolean c() {
        return this.I;
    }
    
    protected int getItemSpacing() {
        return this.H;
    }
    
    protected int getLineSpacing() {
        return this.G;
    }
    
    protected int getRowCount() {
        return this.J;
    }
    
    protected void onLayout(final boolean b, int n, int n2, int n3, int n4) {
        if (this.getChildCount() == 0) {
            this.J = 0;
            return;
        }
        this.J = 1;
        final boolean b2 = androidx.core.view.j0.X((View)this) == 1;
        if (b2) {
            n2 = this.getPaddingRight();
        }
        else {
            n2 = this.getPaddingLeft();
        }
        if (b2) {
            n4 = this.getPaddingLeft();
        }
        else {
            n4 = this.getPaddingRight();
        }
        int paddingTop = this.getPaddingTop();
        final int n5 = n3 - n - n4;
        n4 = n2;
        n3 = paddingTop;
        for (int i = 0; i < this.getChildCount(); ++i, n3 = n) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 8) {
                child.setTag(a.h.a4, (Object)(-1));
                n = n3;
            }
            else {
                final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
                int c;
                int b3;
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                    c = n.c(viewGroup$MarginLayoutParams);
                    b3 = n.b(viewGroup$MarginLayoutParams);
                }
                else {
                    b3 = 0;
                    c = 0;
                }
                final int measuredWidth = child.getMeasuredWidth();
                int n6 = n4;
                n = n3;
                if (!this.I) {
                    n6 = n4;
                    n = n3;
                    if (n4 + c + measuredWidth > n5) {
                        n = this.G + paddingTop;
                        ++this.J;
                        n6 = n2;
                    }
                }
                child.setTag(a.h.a4, (Object)(this.J - 1));
                n4 = n6 + c;
                final int n7 = child.getMeasuredWidth() + n4;
                paddingTop = child.getMeasuredHeight() + n;
                n3 = n7;
                if (b2) {
                    n4 = n5 - n7;
                    n3 = n5 - n6 - c;
                }
                child.layout(n4, n, n3, paddingTop);
                n4 = n6 + (c + b3 + child.getMeasuredWidth() + this.H);
            }
        }
    }
    
    protected void onMeasure(int paddingBottom, int paddingRight) {
        final int size = View$MeasureSpec.getSize(paddingBottom);
        final int mode = View$MeasureSpec.getMode(paddingBottom);
        final int size2 = View$MeasureSpec.getSize(paddingRight);
        final int mode2 = View$MeasureSpec.getMode(paddingRight);
        int n;
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            n = Integer.MAX_VALUE;
        }
        else {
            n = size;
        }
        int paddingLeft = this.getPaddingLeft();
        int paddingTop = this.getPaddingTop();
        final int paddingRight2 = this.getPaddingRight();
        int n2 = paddingTop;
        int i = 0;
        int n3 = 0;
        while (i < this.getChildCount()) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                this.measureChild(child, paddingBottom, paddingRight);
                final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
                int n4;
                int n5;
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                    n4 = viewGroup$MarginLayoutParams.leftMargin + 0;
                    n5 = viewGroup$MarginLayoutParams.rightMargin + 0;
                }
                else {
                    n4 = 0;
                    n5 = 0;
                }
                int n7;
                if (paddingLeft + n4 + child.getMeasuredWidth() > n - paddingRight2 && !this.c()) {
                    final int paddingLeft2 = this.getPaddingLeft();
                    final int n6 = this.G + paddingTop;
                    n7 = paddingLeft2;
                    n2 = n6;
                }
                else {
                    n7 = paddingLeft;
                }
                final int n8 = n7 + n4 + child.getMeasuredWidth();
                final int measuredHeight = child.getMeasuredHeight();
                int n9 = n3;
                if (n8 > n3) {
                    n9 = n8;
                }
                final int n10 = n7 + (n4 + n5 + child.getMeasuredWidth() + this.H);
                n3 = n9;
                if (i == this.getChildCount() - 1) {
                    n3 = n9 + n5;
                }
                paddingTop = n2 + measuredHeight;
                paddingLeft = n10;
            }
            ++i;
        }
        paddingRight = this.getPaddingRight();
        paddingBottom = this.getPaddingBottom();
        this.setMeasuredDimension(a(size, mode, n3 + paddingRight), a(size2, mode2, paddingTop + paddingBottom));
    }
    
    protected void setItemSpacing(final int h) {
        this.H = h;
    }
    
    protected void setLineSpacing(final int g) {
        this.G = g;
    }
    
    public void setSingleLine(final boolean i) {
        this.I = i;
    }
}
