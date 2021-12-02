// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.radiobutton;

import android.view.View;
import android.content.res.TypedArray;
import android.widget.CompoundButton;
import androidx.core.widget.d;
import com.google.android.material.resources.c;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.p;

public class a extends p
{
    private static final int L;
    private static final int[][] M;
    @k0
    private ColorStateList J;
    private boolean K;
    
    static {
        L = o2.a.n.wb;
        M = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
    }
    
    public a(@j0 final Context context) {
        this(context, null);
    }
    
    public a(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.Rb);
    }
    
    public a(@j0 Context context, @k0 final AttributeSet set, int fl) {
        final int l = a.L;
        super(com.google.android.material.theme.overlay.a.c(context, set, fl, l), set, fl);
        context = this.getContext();
        final TypedArray j = t.j(context, set, o2.a.o.El, fl, l, new int[0]);
        fl = o2.a.o.Fl;
        if (j.hasValue(fl)) {
            d.d((CompoundButton)this, c.a(context, j, fl));
        }
        this.K = j.getBoolean(o2.a.o.Gl, false);
        j.recycle();
    }
    
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.J == null) {
            final int d = s2.a.d((View)this, o2.a.c.z2);
            final int d2 = s2.a.d((View)this, o2.a.c.I2);
            final int d3 = s2.a.d((View)this, o2.a.c.P2);
            final int[][] m = a.M;
            final int[] array = new int[m.length];
            array[0] = s2.a.h(d3, d, 1.0f);
            array[1] = s2.a.h(d3, d2, 0.54f);
            array[2] = s2.a.h(d3, d2, 0.38f);
            array[3] = s2.a.h(d3, d2, 0.38f);
            this.J = new ColorStateList(m, array);
        }
        return this.J;
    }
    
    public boolean a() {
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
