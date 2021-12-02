// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigationrail;

import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.e0;
import androidx.annotation.t0;
import android.view.View$MeasureSpec;
import androidx.appcompat.widget.u0;
import com.google.android.material.internal.t;
import o2.a;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.k0;
import android.view.View;
import com.google.android.material.navigation.e;

public class c extends e
{
    static final int U = 49;
    static final int V = 7;
    private static final int W = 49;
    private final int S;
    @k0
    private View T;
    
    public c(@j0 final Context context) {
        this(context, null);
    }
    
    public c(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.Oa);
    }
    
    public c(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        this(context, set, n, a.n.ac);
    }
    
    public c(@j0 final Context context, @k0 final AttributeSet set, int u, final int n) {
        super(context, set, u, n);
        this.S = this.getResources().getDimensionPixelSize(a.f.t5);
        final u0 k = t.k(this.getContext(), set, a.o.Jn, u, n, new int[0]);
        u = k.u(a.o.Kn, 0);
        if (u != 0) {
            this.k(u);
        }
        this.setMenuGravity(k.o(a.o.Ln, 49));
        k.I();
    }
    
    private b getNavigationRailMenuView() {
        return (b)this.getMenuView();
    }
    
    private boolean n() {
        final View t = this.T;
        return t != null && t.getVisibility() != 8;
    }
    
    private int o(final int n) {
        final int suggestedMinimumWidth = this.getSuggestedMinimumWidth();
        int measureSpec = n;
        if (View$MeasureSpec.getMode(n) != 1073741824) {
            measureSpec = n;
            if (suggestedMinimumWidth > 0) {
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(n), suggestedMinimumWidth + (this.getPaddingLeft() + this.getPaddingRight())), 1073741824);
            }
        }
        return measureSpec;
    }
    
    @k0
    public View getHeaderView() {
        return this.T;
    }
    
    @Override
    public int getMaxItemCount() {
        return 7;
    }
    
    public int getMenuGravity() {
        return this.getNavigationRailMenuView().getMenuGravity();
    }
    
    public void k(@e0 final int n) {
        this.l(LayoutInflater.from(this.getContext()).inflate(n, (ViewGroup)this, false));
    }
    
    public void l(@j0 final View t) {
        this.p();
        this.T = t;
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-2, -2);
        frameLayout$LayoutParams.gravity = 49;
        frameLayout$LayoutParams.topMargin = this.S;
        this.addView(t, 0, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
    }
    
    @j0
    @t0({ t0.a.H })
    protected b m(@j0 final Context context) {
        return new b(context);
    }
    
    protected void onLayout(final boolean b, int s, int n, int top, final int n2) {
        super.onLayout(b, s, n, top, n2);
        final b navigationRailMenuView = this.getNavigationRailMenuView();
        final boolean n3 = this.n();
        s = 0;
        if (n3) {
            n = this.T.getBottom() + this.S;
            top = navigationRailMenuView.getTop();
            if (top < n) {
                s = n - top;
            }
        }
        else if (navigationRailMenuView.r()) {
            s = this.S;
        }
        if (s > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + s, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + s);
        }
    }
    
    protected void onMeasure(int o, int measureSpec) {
        o = this.o(o);
        super.onMeasure(o, measureSpec);
        if (this.n()) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.T.getMeasuredHeight() - this.S, Integer.MIN_VALUE);
            this.measureChild((View)this.getNavigationRailMenuView(), o, measureSpec);
        }
    }
    
    public void p() {
        final View t = this.T;
        if (t != null) {
            this.removeView(t);
            this.T = null;
        }
    }
    
    public void setMenuGravity(final int menuGravity) {
        this.getNavigationRailMenuView().setMenuGravity(menuGravity);
    }
}
