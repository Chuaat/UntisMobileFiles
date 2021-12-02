// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.help;

import android.graphics.Paint;
import androidx.annotation.j0;
import android.graphics.Canvas;
import java.io.Serializable;

public class g implements j, Serializable
{
    private float G;
    private float H;
    private float I;
    private float J;
    
    public g(final float g, final float h, final float i, final float j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public void a(@j0 final Canvas canvas, @j0 final Paint paint) {
        canvas.drawRect(this.G, this.H, this.I, this.J, paint);
        this.b(canvas);
    }
    
    void b(@j0 final Canvas canvas) {
    }
    
    public float c() {
        return this.J;
    }
    
    public float d() {
        return this.G;
    }
    
    public float e() {
        return this.I;
    }
    
    public float f() {
        return this.H;
    }
    
    public void g(final float j) {
        this.J = j;
    }
    
    public void h(final float g) {
        this.G = g;
    }
    
    public void i(final float i) {
        this.I = i;
    }
    
    public void j(final float h) {
        this.H = h;
    }
}
