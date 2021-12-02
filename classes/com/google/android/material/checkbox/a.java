// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.checkbox;

import android.view.View;
import android.content.res.TypedArray;
import android.widget.CompoundButton;
import androidx.core.widget.d;
import com.google.android.material.resources.c;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.g;

public class a extends g
{
    private static final int L;
    private static final int[][] M;
    @k0
    private ColorStateList J;
    private boolean K;
    
    static {
        L = o2.a.n.vb;
        M = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
    }
    
    public a(final Context context) {
        this(context, null);
    }
    
    public a(final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.w1);
    }
    
    public a(Context context, @k0 final AttributeSet set, int cl) {
        final int l = a.L;
        super(com.google.android.material.theme.overlay.a.c(context, set, cl, l), set, cl);
        context = this.getContext();
        final TypedArray j = t.j(context, set, o2.a.o.Bl, cl, l, new int[0]);
        cl = o2.a.o.Cl;
        if (j.hasValue(cl)) {
            d.d((CompoundButton)this, c.a(context, j, cl));
        }
        this.K = j.getBoolean(o2.a.o.Dl, false);
        j.recycle();
    }
    
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.J == null) {
            final int[][] m = a.M;
            final int[] array = new int[m.length];
            final int d = s2.a.d((View)this, o2.a.c.z2);
            final int d2 = s2.a.d((View)this, o2.a.c.P2);
            final int d3 = s2.a.d((View)this, o2.a.c.I2);
            array[0] = s2.a.h(d2, d, 1.0f);
            array[1] = s2.a.h(d2, d3, 0.54f);
            array[2] = s2.a.h(d2, d3, 0.38f);
            array[3] = s2.a.h(d2, d3, 0.38f);
            this.J = new ColorStateList(m, array);
        }
        return this.J;
    }
    
    public boolean b() {
        return this.K;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.K && d.b((CompoundButton)this) == null) {
            this.setUseMaterialThemeColors(true);
        }
    }
    
    public void setUseMaterialThemeColors(final boolean k) {
        this.K = k;
        ColorStateList materialThemeColorsTintList;
        if (k) {
            materialThemeColorsTintList = this.getMaterialThemeColorsTintList();
        }
        else {
            materialThemeColorsTintList = null;
        }
        d.d((CompoundButton)this, materialThemeColorsTintList);
    }
}
