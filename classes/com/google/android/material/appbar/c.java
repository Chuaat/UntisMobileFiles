// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.appbar;

import android.view.View$MeasureSpec;
import q.a;
import androidx.annotation.k0;
import java.util.List;
import androidx.core.view.x0;
import androidx.core.view.i;
import androidx.annotation.j0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;

abstract class c extends d<View>
{
    final Rect d;
    final Rect e;
    private int f;
    private int g;
    
    public c() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
    
    public c(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
    
    private static int V(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 8388659;
        }
        return n2;
    }
    
    @Override
    protected void K(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, int q) {
        final View p3 = this.P(coordinatorLayout.w(view));
        if (p3 != null) {
            final g g = (g)view.getLayoutParams();
            final Rect d = this.d;
            d.set(coordinatorLayout.getPaddingLeft() + g.leftMargin, p3.getBottom() + g.topMargin, coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight() - g.rightMargin, coordinatorLayout.getHeight() + p3.getBottom() - coordinatorLayout.getPaddingBottom() - g.bottomMargin);
            final x0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && androidx.core.view.j0.S((View)coordinatorLayout) && !androidx.core.view.j0.S(view)) {
                d.left += lastWindowInsets.p();
                d.right -= lastWindowInsets.q();
            }
            final Rect e = this.e;
            androidx.core.view.i.b(V(g.c), view.getMeasuredWidth(), view.getMeasuredHeight(), d, e, q);
            q = this.Q(p3);
            view.layout(e.left, e.top - q, e.right, e.bottom - q);
            q = e.top - p3.getBottom();
        }
        else {
            super.K(coordinatorLayout, view, q);
            q = 0;
        }
        this.f = q;
    }
    
    @k0
    abstract View P(final List<View> p0);
    
    final int Q(final View view) {
        final int g = this.g;
        int c = 0;
        if (g != 0) {
            final float r = this.R(view);
            final int g2 = this.g;
            c = q.a.c((int)(r * g2), 0, g2);
        }
        return c;
    }
    
    float R(final View view) {
        return 1.0f;
    }
    
    public final int S() {
        return this.g;
    }
    
    int T(@j0 final View view) {
        return view.getMeasuredHeight();
    }
    
    final int U() {
        return this.f;
    }
    
    public final void W(final int g) {
        this.g = g;
    }
    
    protected boolean X() {
        return false;
    }
    
    @Override
    public boolean n(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, final int n, final int n2, int height, final int n3) {
        final int height2 = view.getLayoutParams().height;
        if (height2 == -1 || height2 == -2) {
            final View p6 = this.P(coordinatorLayout.w(view));
            if (p6 != null) {
                final int size = View$MeasureSpec.getSize(height);
                if (size > 0) {
                    height = size;
                    if (androidx.core.view.j0.S(p6)) {
                        final x0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                        height = size;
                        if (lastWindowInsets != null) {
                            height = size + (lastWindowInsets.r() + lastWindowInsets.o());
                        }
                    }
                }
                else {
                    height = coordinatorLayout.getHeight();
                }
                height += this.T(p6);
                final int measuredHeight = p6.getMeasuredHeight();
                if (this.X()) {
                    view.setTranslationY((float)(-measuredHeight));
                }
                else {
                    height -= measuredHeight;
                }
                int n4;
                if (height2 == -1) {
                    n4 = 1073741824;
                }
                else {
                    n4 = Integer.MIN_VALUE;
                }
                coordinatorLayout.O(view, n, n2, View$MeasureSpec.makeMeasureSpec(height, n4), n3);
                return true;
            }
        }
        return false;
    }
}
