// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.switchmaterial;

import com.google.android.material.internal.b0;
import android.view.View;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.annotation.j0;
import u2.a;
import androidx.appcompat.widget.SwitchCompat;

public class SwitchMaterial extends SwitchCompat
{
    private static final int K0;
    private static final int[][] L0;
    @j0
    private final a G0;
    @k0
    private ColorStateList H0;
    @k0
    private ColorStateList I0;
    private boolean J0;
    
    static {
        K0 = o2.a.n.xb;
        L0 = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
    }
    
    public SwitchMaterial(@j0 final Context context) {
        this(context, null);
    }
    
    public SwitchMaterial(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.yd);
    }
    
    public SwitchMaterial(@j0 Context context, @k0 final AttributeSet set, final int n) {
        final int k0 = SwitchMaterial.K0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, k0), set, n);
        context = this.getContext();
        this.G0 = new a(context);
        final TypedArray j = t.j(context, set, o2.a.o.Ar, n, k0, new int[0]);
        this.J0 = j.getBoolean(o2.a.o.Br, false);
        j.recycle();
    }
    
    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.H0 == null) {
            final int d = s2.a.d((View)this, o2.a.c.P2);
            final int d2 = s2.a.d((View)this, o2.a.c.z2);
            float dimension = this.getResources().getDimension(o2.a.f.d6);
            if (this.G0.l()) {
                dimension += com.google.android.material.internal.b0.i((View)this);
            }
            final int e = this.G0.e(d, dimension);
            final int[][] l0 = SwitchMaterial.L0;
            final int[] array = new int[l0.length];
            array[0] = s2.a.h(d, d2, 1.0f);
            array[1] = e;
            array[2] = s2.a.h(d, d2, 0.38f);
            array[3] = e;
            this.H0 = new ColorStateList(l0, array);
        }
        return this.H0;
    }
    
    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.I0 == null) {
            final int[][] l0 = SwitchMaterial.L0;
            final int[] array = new int[l0.length];
            final int d = s2.a.d((View)this, o2.a.c.P2);
            final int d2 = s2.a.d((View)this, o2.a.c.z2);
            final int d3 = s2.a.d((View)this, o2.a.c.I2);
            array[0] = s2.a.h(d, d2, 0.54f);
            array[1] = s2.a.h(d, d3, 0.32f);
            array[2] = s2.a.h(d, d2, 0.12f);
            array[3] = s2.a.h(d, d3, 0.12f);
            this.I0 = new ColorStateList(l0, array);
        }
        return this.I0;
    }
    
    public boolean o() {
        return this.J0;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.J0 && this.getThumbTintList() == null) {
            this.setThumbTintList(this.getMaterialThemeColorsThumbTintList());
        }
        if (this.J0 && this.getTrackTintList() == null) {
            this.setTrackTintList(this.getMaterialThemeColorsTrackTintList());
        }
    }
    
    public void setUseMaterialThemeColors(final boolean j0) {
        this.J0 = j0;
        ColorStateList materialThemeColorsTrackTintList;
        if (j0) {
            this.setThumbTintList(this.getMaterialThemeColorsThumbTintList());
            materialThemeColorsTrackTintList = this.getMaterialThemeColorsTrackTintList();
        }
        else {
            materialThemeColorsTrackTintList = null;
            this.setThumbTintList(null);
        }
        this.setTrackTintList(materialThemeColorsTrackTintList);
    }
}
