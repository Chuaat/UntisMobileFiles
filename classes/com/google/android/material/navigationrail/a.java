// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigationrail;

import android.view.View;
import android.view.View$MeasureSpec;
import androidx.annotation.e0;
import androidx.annotation.p;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
final class a extends com.google.android.material.navigation.a
{
    public a(@j0 final Context context) {
        super(context);
    }
    
    @p
    @Override
    protected int getItemDefaultMarginResId() {
        return o2.a.f.r5;
    }
    
    @e0
    @Override
    protected int getItemLayoutResId() {
        return o2.a.k.y0;
    }
    
    protected void onMeasure(int b, final int n) {
        super.onMeasure(b, n);
        if (View$MeasureSpec.getMode(n) == 0) {
            b = View$MeasureSpec.getSize(n);
            b = Math.max(this.getMeasuredHeight(), b);
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), View.resolveSizeAndState(b, n, 0));
        }
    }
}
