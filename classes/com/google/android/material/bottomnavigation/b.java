// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.bottomnavigation;

import androidx.appcompat.view.menu.g;
import android.view.View$MeasureSpec;
import android.view.View;
import android.content.res.Resources;
import o2.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;
import com.google.android.material.navigation.c;

@t0({ t0.a.H })
public class b extends c
{
    private final int g0;
    private final int h0;
    private final int i0;
    private final int j0;
    private final int k0;
    private boolean l0;
    private int[] m0;
    
    public b(@j0 final Context context) {
        super(context);
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        final Resources resources = this.getResources();
        this.g0 = resources.getDimensionPixelSize(o2.a.f.V0);
        this.h0 = resources.getDimensionPixelSize(o2.a.f.W0);
        this.i0 = resources.getDimensionPixelSize(o2.a.f.P0);
        this.j0 = resources.getDimensionPixelSize(o2.a.f.Q0);
        this.k0 = resources.getDimensionPixelSize(o2.a.f.T0);
        this.m0 = new int[5];
    }
    
    @j0
    @Override
    protected com.google.android.material.navigation.a f(@j0 final Context context) {
        return new com.google.android.material.bottomnavigation.a(context);
    }
    
    protected void onLayout(final boolean b, final int n, int i, final int n2, int n3) {
        final int childCount = this.getChildCount();
        final int n4 = n3 - i;
        i = 0;
        n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                if (androidx.core.view.j0.X((View)this) == 1) {
                    final int n5 = n2 - n - n3;
                    child.layout(n5 - child.getMeasuredWidth(), 0, n5, n4);
                }
                else {
                    child.layout(n3, 0, child.getMeasuredWidth() + n3, n4);
                }
                n3 += child.getMeasuredWidth();
            }
            ++i;
        }
    }
    
    protected void onMeasure(int i, int a) {
        final g menu = this.getMenu();
        final int size = View$MeasureSpec.getSize(i);
        final int size2 = menu.H().size();
        final int childCount = this.getChildCount();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.k0, 1073741824);
        if (this.j(this.getLabelVisibilityMode(), size2) && this.r()) {
            final View child = this.getChildAt(this.getSelectedItemPosition());
            a = (i = this.j0);
            if (child.getVisibility() != 8) {
                child.measure(View$MeasureSpec.makeMeasureSpec(this.i0, Integer.MIN_VALUE), measureSpec);
                i = Math.max(a, child.getMeasuredWidth());
            }
            if (child.getVisibility() != 8) {
                a = 1;
            }
            else {
                a = 0;
            }
            a = size2 - a;
            final int min = Math.min(size - this.h0 * a, Math.min(i, this.i0));
            final int n = size - min;
            if (a == 0) {
                i = 1;
            }
            else {
                i = a;
            }
            final int min2 = Math.min(n / i, this.g0);
            a = n - a * min2;
            int[] m0;
            int n2;
            int n3;
            int[] m2;
            for (i = 0; i < childCount; ++i, a = n3) {
                if (this.getChildAt(i).getVisibility() != 8) {
                    m0 = this.m0;
                    if (i == this.getSelectedItemPosition()) {
                        n2 = min;
                    }
                    else {
                        n2 = min2;
                    }
                    m0[i] = n2;
                    n3 = a;
                    if (a > 0) {
                        m2 = this.m0;
                        ++m2[i];
                        n3 = a - 1;
                    }
                }
                else {
                    this.m0[i] = 0;
                    n3 = a;
                }
            }
        }
        else {
            if (size2 == 0) {
                i = 1;
            }
            else {
                i = size2;
            }
            final int min3 = Math.min(size / i, this.i0);
            a = size - size2 * min3;
            int[] m3;
            int n4;
            for (i = 0; i < childCount; ++i, a = n4) {
                if (this.getChildAt(i).getVisibility() != 8) {
                    m3 = this.m0;
                    m3[i] = min3;
                    if ((n4 = a) > 0) {
                        ++m3[i];
                        n4 = a - 1;
                    }
                }
                else {
                    this.m0[i] = 0;
                    n4 = a;
                }
            }
        }
        i = 0;
        a = 0;
        while (i < childCount) {
            final View child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8) {
                child2.measure(View$MeasureSpec.makeMeasureSpec(this.m0[i], 1073741824), measureSpec);
                child2.getLayoutParams().width = child2.getMeasuredWidth();
                a += child2.getMeasuredWidth();
            }
            ++i;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(a, View$MeasureSpec.makeMeasureSpec(a, 1073741824), 0), View.resolveSizeAndState(this.k0, measureSpec, 0));
    }
    
    public boolean r() {
        return this.l0;
    }
    
    public void setItemHorizontalTranslationEnabled(final boolean l0) {
        this.l0 = l0;
    }
}
