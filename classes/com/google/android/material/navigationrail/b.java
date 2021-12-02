// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigationrail;

import com.google.android.material.navigation.a;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import androidx.annotation.t0;
import com.google.android.material.navigation.c;

@t0({ t0.a.H })
public class b extends c
{
    private final FrameLayout$LayoutParams g0;
    
    public b(@j0 final Context context) {
        super(context);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        this.g0 = frameLayout$LayoutParams;
        frameLayout$LayoutParams.gravity = 49;
        this.setLayoutParams((ViewGroup$LayoutParams)frameLayout$LayoutParams);
    }
    
    private int s(final int n, int b, final int b2) {
        b /= Math.max(1, b2);
        return View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(n), b), 0);
    }
    
    private int t(final View view, final int n, final int n2) {
        if (view.getVisibility() != 8) {
            view.measure(n, n2);
            return view.getMeasuredHeight();
        }
        return 0;
    }
    
    private int u(final int n, int n2, int i, final View view) {
        this.s(n, n2, i);
        final int n3 = 0;
        if (view == null) {
            n2 = this.s(n, n2, i);
        }
        else {
            n2 = View$MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        final int childCount = this.getChildCount();
        int n4 = 0;
        View child;
        int n5;
        for (i = n3; i < childCount; ++i, n4 = n5) {
            child = this.getChildAt(i);
            n5 = n4;
            if (child != view) {
                n5 = n4 + this.t(child, n, n2);
            }
        }
        return n4;
    }
    
    private int v(final int n, int n2, int n3) {
        final View child = this.getChildAt(this.getSelectedItemPosition());
        int n5;
        if (child != null) {
            final int t = this.t(child, n, this.s(n, n2, n3));
            final int n4 = n2 - t;
            --n3;
            n2 = t;
            n5 = n4;
        }
        else {
            final int n6 = 0;
            n5 = n2;
            n2 = n6;
        }
        return n2 + this.u(n, n5, n3, child);
    }
    
    @j0
    @Override
    protected com.google.android.material.navigation.a f(@j0 final Context context) {
        return new com.google.android.material.navigationrail.a(context);
    }
    
    int getMenuGravity() {
        return this.g0.gravity;
    }
    
    protected void onLayout(final boolean b, final int n, int i, final int n2, int n3) {
        final int childCount = this.getChildCount();
        i = 0;
        n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n4 = n3;
            if (child.getVisibility() != 8) {
                n4 = child.getMeasuredHeight() + n3;
                child.layout(0, n3, n2 - n, n4);
            }
            ++i;
            n3 = n4;
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n2);
        final int size2 = this.getMenu().H().size();
        int n3;
        if (size2 > 1 && this.j(this.getLabelVisibilityMode(), size2)) {
            n3 = this.v(n, size, size2);
        }
        else {
            n3 = this.u(n, size, size2, null);
        }
        this.setMeasuredDimension(View.resolveSizeAndState(View$MeasureSpec.getSize(n), n, 0), View.resolveSizeAndState(n3, n2, 0));
    }
    
    boolean r() {
        return (this.g0.gravity & 0x70) == 0x30;
    }
    
    void setMenuGravity(final int gravity) {
        final FrameLayout$LayoutParams g0 = this.g0;
        if (g0.gravity != gravity) {
            g0.gravity = gravity;
            this.setLayoutParams((ViewGroup$LayoutParams)g0);
        }
    }
}
