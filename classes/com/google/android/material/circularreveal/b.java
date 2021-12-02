// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.circularreveal;

import androidx.annotation.l;
import android.graphics.drawable.Drawable;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.j0;
import android.widget.FrameLayout;

public class b extends FrameLayout implements g
{
    @j0
    private final com.google.android.material.circularreveal.d G;
    
    public b(@j0 final Context context) {
        this(context, null);
    }
    
    public b(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.G = new com.google.android.material.circularreveal.d((a)this);
    }
    
    public void a() {
        this.G.a();
    }
    
    public void b() {
        this.G.b();
    }
    
    public void c(final Canvas canvas) {
        super.draw(canvas);
    }
    
    public boolean d() {
        return super.isOpaque();
    }
    
    @SuppressLint({ "MissingSuperCall" })
    public void draw(@j0 final Canvas canvas) {
        final com.google.android.material.circularreveal.d g = this.G;
        if (g != null) {
            g.c(canvas);
        }
        else {
            super.draw(canvas);
        }
    }
    
    @k0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.G.g();
    }
    
    public int getCircularRevealScrimColor() {
        return this.G.h();
    }
    
    @k0
    public e getRevealInfo() {
        return this.G.j();
    }
    
    public boolean isOpaque() {
        final com.google.android.material.circularreveal.d g = this.G;
        if (g != null) {
            return g.l();
        }
        return super.isOpaque();
    }
    
    public void setCircularRevealOverlayDrawable(@k0 final Drawable drawable) {
        this.G.m(drawable);
    }
    
    public void setCircularRevealScrimColor(@l final int n) {
        this.G.n(n);
    }
    
    public void setRevealInfo(@k0 final e e) {
        this.G.o(e);
    }
}
