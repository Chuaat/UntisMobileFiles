// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.animation.ObjectAnimator;
import android.view.View;
import android.graphics.drawable.Drawable;
import androidx.annotation.f;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import o2.a;

public final class p extends com.google.android.material.progressindicator.b<q>
{
    public static final int h0;
    public static final int i0 = 0;
    public static final int j0 = 1;
    public static final int k0 = 0;
    public static final int l0 = 1;
    public static final int m0 = 2;
    public static final int n0 = 3;
    
    static {
        h0 = o2.a.n.Cb;
    }
    
    public p(@j0 final Context context) {
        this(context, null);
    }
    
    public p(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.X8);
    }
    
    public p(@j0 final Context context, @k0 final AttributeSet set, @androidx.annotation.f final int n) {
        super(context, set, n, p.h0);
        this.u();
    }
    
    private void u() {
        this.setIndeterminateDrawable(l.y(this.getContext(), (q)super.G));
        this.setProgressDrawable(h.A(this.getContext(), (q)super.G));
    }
    
    public int getIndeterminateAnimationType() {
        return ((q)super.G).g;
    }
    
    public int getIndicatorDirection() {
        return ((q)super.G).h;
    }
    
    protected void onLayout(final boolean b, int h, final int n, final int n2, final int n3) {
        super.onLayout(b, h, n, n2, n3);
        final c g = super.G;
        final q q = (q)g;
        h = ((q)g).h;
        boolean i;
        final boolean b2 = i = true;
        Label_0098: {
            if (h != 1) {
                if (androidx.core.view.j0.X((View)this) == 1) {
                    i = b2;
                    if (((q)super.G).h == 2) {
                        break Label_0098;
                    }
                }
                i = (androidx.core.view.j0.X((View)this) == 0 && ((q)super.G).h == 3 && b2);
            }
        }
        q.i = i;
    }
    
    protected void onSizeChanged(int n, int n2, final int n3, final int n4) {
        n -= this.getPaddingLeft() + this.getPaddingRight();
        n2 -= this.getPaddingTop() + this.getPaddingBottom();
        final l<q> indeterminateDrawable = this.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, n, n2);
        }
        final h<q> progressDrawable = this.getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, n, n2);
        }
    }
    
    @Override
    public void p(final int n, final boolean b) {
        final c g = super.G;
        if (g != null && ((q)g).g == 0 && this.isIndeterminate()) {
            return;
        }
        super.p(n, b);
    }
    
    public void setIndeterminateAnimationType(final int g) {
        if (((q)super.G).g == g) {
            return;
        }
        if (this.s() && this.isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        final c g2 = super.G;
        ((q)g2).g = g;
        ((q)g2).e();
        l<q> l;
        k<ObjectAnimator> k;
        if (g == 0) {
            l = this.getIndeterminateDrawable();
            k = new n((q)super.G);
        }
        else {
            l = this.getIndeterminateDrawable();
            k = new o(this.getContext(), (q)super.G);
        }
        l.B(k);
        this.invalidate();
    }
    
    @Override
    public void setIndicatorColor(@j0 final int... indicatorColor) {
        super.setIndicatorColor(indicatorColor);
        ((q)super.G).e();
    }
    
    public void setIndicatorDirection(final int h) {
        final c g = super.G;
        ((q)g).h = h;
        final q q = (q)g;
        boolean i;
        final boolean b = i = true;
        Label_0074: {
            if (h != 1) {
                if (androidx.core.view.j0.X((View)this) == 1) {
                    i = b;
                    if (((q)super.G).h == 2) {
                        break Label_0074;
                    }
                }
                i = (androidx.core.view.j0.X((View)this) == 0 && h == 3 && b);
            }
        }
        q.i = i;
        this.invalidate();
    }
    
    @Override
    public void setTrackCornerRadius(final int trackCornerRadius) {
        super.setTrackCornerRadius(trackCornerRadius);
        ((q)super.G).e();
        this.invalidate();
    }
    
    q t(@j0 final Context context, @j0 final AttributeSet set) {
        return new q(context, set);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface a {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface b {
    }
}
