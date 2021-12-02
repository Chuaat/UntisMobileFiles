// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.slider;

import androidx.annotation.n;
import androidx.annotation.p;
import androidx.annotation.b0;
import android.content.res.ColorStateList;
import androidx.annotation.q;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import o2.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;

public class g extends c<g, a, b>
{
    public g(@j0 final Context context) {
        this(context, null);
    }
    
    public g(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.Jc);
    }
    
    public g(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842788 });
        if (obtainStyledAttributes.hasValue(0)) {
            this.setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
    }
    
    @Override
    protected boolean Y() {
        if (this.getActiveThumbIndex() != -1) {
            return true;
        }
        this.setActiveThumbIndex(0);
        return true;
    }
    
    public float getValue() {
        return this.getValues().get(0);
    }
    
    public void setValue(final float f) {
        this.setValues(f);
    }
    
    public interface a extends com.google.android.material.slider.a<g>
    {
    }
    
    public interface b extends com.google.android.material.slider.b<g>
    {
    }
}
