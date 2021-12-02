// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.ripple;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.annotation.l;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import androidx.annotation.j0;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import androidx.annotation.t0;
import androidx.core.graphics.drawable.i;
import com.google.android.material.shape.s;
import android.graphics.drawable.Drawable;

@t0({ t0.a.H })
public class a extends Drawable implements s, i
{
    private b G;
    
    private a(final b g) {
        this.G = g;
    }
    
    public a(final o o) {
        this(new b(new j(o)));
    }
    
    @j0
    public a a() {
        this.G = new b(this.G);
        return this;
    }
    
    public void draw(final Canvas canvas) {
        final b g = this.G;
        if (g.b) {
            g.a.draw(canvas);
        }
    }
    
    @k0
    public Drawable$ConstantState getConstantState() {
        return this.G;
    }
    
    public int getOpacity() {
        return this.G.a.getOpacity();
    }
    
    @j0
    public o getShapeAppearanceModel() {
        return this.G.a.getShapeAppearanceModel();
    }
    
    public boolean isStateful() {
        return true;
    }
    
    protected void onBoundsChange(@j0 final Rect bounds) {
        super.onBoundsChange(bounds);
        this.G.a.setBounds(bounds);
    }
    
    protected boolean onStateChange(@j0 final int[] state) {
        boolean onStateChange = super.onStateChange(state);
        final boolean setState = this.G.a.setState(state);
        final boolean b = true;
        if (setState) {
            onStateChange = true;
        }
        final boolean e = com.google.android.material.ripple.b.e(state);
        final b g = this.G;
        if (g.b != e) {
            g.b = e;
            onStateChange = b;
        }
        return onStateChange;
    }
    
    public void setAlpha(final int alpha) {
        this.G.a.setAlpha(alpha);
    }
    
    public void setColorFilter(@k0 final ColorFilter colorFilter) {
        this.G.a.setColorFilter(colorFilter);
    }
    
    public void setShapeAppearanceModel(@j0 final o shapeAppearanceModel) {
        this.G.a.setShapeAppearanceModel(shapeAppearanceModel);
    }
    
    public void setTint(@l final int tint) {
        this.G.a.setTint(tint);
    }
    
    public void setTintList(@k0 final ColorStateList tintList) {
        this.G.a.setTintList(tintList);
    }
    
    public void setTintMode(@k0 final PorterDuff$Mode tintMode) {
        this.G.a.setTintMode(tintMode);
    }
    
    static final class b extends Drawable$ConstantState
    {
        @j0
        j a;
        boolean b;
        
        public b(@j0 final b b) {
            this.a = (j)b.a.getConstantState().newDrawable();
            this.b = b.b;
        }
        
        public b(final j a) {
            this.a = a;
            this.b = false;
        }
        
        @j0
        public a a() {
            return new a(new b(this), null);
        }
        
        public int getChangingConfigurations() {
            return 0;
        }
    }
}
