// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.appbar;

import androidx.annotation.l;
import androidx.annotation.p0;
import com.google.android.material.shape.k;
import androidx.core.graphics.drawable.c;
import com.google.android.material.internal.u;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import com.google.android.material.shape.j;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.util.Pair;
import android.widget.TextView;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import o2.a;
import androidx.annotation.k0;
import androidx.appcompat.widget.Toolbar;

public class MaterialToolbar extends Toolbar
{
    private static final int C0;
    private boolean A0;
    private boolean B0;
    @k0
    private Integer z0;
    
    static {
        C0 = a.n.Nc;
    }
    
    public MaterialToolbar(@j0 final Context context) {
        this(context, null);
    }
    
    public MaterialToolbar(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.sf);
    }
    
    public MaterialToolbar(@j0 Context context, @k0 final AttributeSet set, int wl) {
        final int c0 = MaterialToolbar.C0;
        super(com.google.android.material.theme.overlay.a.c(context, set, wl, c0), set, wl);
        context = this.getContext();
        final TypedArray j = t.j(context, set, a.o.Vl, wl, c0, new int[0]);
        wl = a.o.Wl;
        if (j.hasValue(wl)) {
            this.setNavigationIconTint(j.getColor(wl, -1));
        }
        this.A0 = j.getBoolean(a.o.Yl, false);
        this.B0 = j.getBoolean(a.o.Xl, false);
        j.recycle();
        this.T(context);
    }
    
    private Pair<Integer, Integer> S(@k0 final TextView textView, @k0 final TextView textView2) {
        final int measuredWidth = this.getMeasuredWidth();
        final int n = measuredWidth / 2;
        int paddingLeft = this.getPaddingLeft();
        int i = measuredWidth - this.getPaddingRight();
        int left;
        int n2;
        for (int j = 0; j < this.getChildCount(); ++j, i = left, paddingLeft = n2) {
            final View child = this.getChildAt(j);
            left = i;
            n2 = paddingLeft;
            if (child.getVisibility() != 8) {
                left = i;
                n2 = paddingLeft;
                if (child != textView) {
                    left = i;
                    n2 = paddingLeft;
                    if (child != textView2) {
                        int right = paddingLeft;
                        if (child.getRight() < n && child.getRight() > (right = paddingLeft)) {
                            right = child.getRight();
                        }
                        left = i;
                        n2 = right;
                        if (child.getLeft() > n) {
                            left = i;
                            n2 = right;
                            if (child.getLeft() < i) {
                                left = child.getLeft();
                                n2 = right;
                            }
                        }
                    }
                }
            }
        }
        return (Pair<Integer, Integer>)new Pair((Object)paddingLeft, (Object)i);
    }
    
    private void T(final Context context) {
        final Drawable background = this.getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        final j j = new j();
        int color;
        if (background != null) {
            color = ((ColorDrawable)background).getColor();
        }
        else {
            color = 0;
        }
        j.n0(ColorStateList.valueOf(color));
        j.Y(context);
        j.m0(androidx.core.view.j0.P((View)this));
        androidx.core.view.j0.G1((View)this, j);
    }
    
    private void W(final View view, final Pair<Integer, Integer> pair) {
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredWidth2 = view.getMeasuredWidth();
        final int n = measuredWidth / 2 - measuredWidth2 / 2;
        final int n2 = measuredWidth2 + n;
        final int max = Math.max(Math.max((int)pair.first - n, 0), Math.max(n2 - (int)pair.second, 0));
        int n3 = n;
        int n4 = n2;
        if (max > 0) {
            n3 = n + max;
            n4 = n2 - max;
            view.measure(View$MeasureSpec.makeMeasureSpec(n4 - n3, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(n3, view.getTop(), n4, view.getBottom());
    }
    
    private void X() {
        if (!this.A0 && !this.B0) {
            return;
        }
        final TextView g = u.g(this);
        final TextView e = u.e(this);
        if (g == null && e == null) {
            return;
        }
        final Pair<Integer, Integer> s = this.S(g, e);
        if (this.A0 && g != null) {
            this.W((View)g, s);
        }
        if (this.B0 && e != null) {
            this.W((View)e, s);
        }
    }
    
    @k0
    private Drawable Y(@k0 final Drawable drawable) {
        Drawable r = drawable;
        if (drawable != null) {
            r = drawable;
            if (this.z0 != null) {
                r = c.r(drawable);
                c.n(r, this.z0);
            }
        }
        return r;
    }
    
    public boolean U() {
        return this.B0;
    }
    
    public boolean V() {
        return this.A0;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e((View)this);
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.X();
    }
    
    @p0(21)
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        k.d((View)this, elevation);
    }
    
    @Override
    public void setNavigationIcon(@k0 final Drawable drawable) {
        super.setNavigationIcon(this.Y(drawable));
    }
    
    public void setNavigationIconTint(@l final int i) {
        this.z0 = i;
        final Drawable navigationIcon = this.getNavigationIcon();
        if (navigationIcon != null) {
            this.setNavigationIcon(navigationIcon);
        }
    }
    
    public void setSubtitleCentered(final boolean b0) {
        if (this.B0 != b0) {
            this.B0 = b0;
            this.requestLayout();
        }
    }
    
    public void setTitleCentered(final boolean a0) {
        if (this.A0 != a0) {
            this.A0 = a0;
            this.requestLayout();
        }
    }
}
