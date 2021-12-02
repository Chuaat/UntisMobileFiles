// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.n0;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import o2.a;

public final class f extends b<g>
{
    public static final int h0;
    public static final int i0 = 0;
    public static final int j0 = 1;
    
    static {
        h0 = o2.a.n.qb;
    }
    
    public f(@j0 final Context context) {
        this(context, null);
    }
    
    public f(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.b2);
    }
    
    public f(@j0 final Context context, @k0 final AttributeSet set, @androidx.annotation.f final int n) {
        super(context, set, n, f.h0);
        this.u();
    }
    
    private void u() {
        this.setIndeterminateDrawable(l.x(this.getContext(), (g)super.G));
        this.setProgressDrawable(h.z(this.getContext(), (g)super.G));
    }
    
    public int getIndicatorDirection() {
        return ((g)super.G).i;
    }
    
    @n0
    public int getIndicatorInset() {
        return ((g)super.G).h;
    }
    
    @n0
    public int getIndicatorSize() {
        return ((g)super.G).g;
    }
    
    public void setIndicatorDirection(final int i) {
        ((g)super.G).i = i;
        this.invalidate();
    }
    
    public void setIndicatorInset(@n0 final int h) {
        final c g = super.G;
        if (((g)g).h != h) {
            ((g)g).h = h;
            this.invalidate();
        }
    }
    
    public void setIndicatorSize(@n0 int max) {
        max = Math.max(max, this.getTrackThickness() * 2);
        final c g = super.G;
        if (((g)g).g != max) {
            ((g)g).g = max;
            ((g)g).e();
            this.invalidate();
        }
    }
    
    @Override
    public void setTrackThickness(final int trackThickness) {
        super.setTrackThickness(trackThickness);
        ((g)super.G).e();
    }
    
    g t(@j0 final Context context, @j0 final AttributeSet set) {
        return new g(context, set);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface a {
    }
}
