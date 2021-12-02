// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.help;

import android.graphics.Paint;
import androidx.annotation.j0;
import android.graphics.Canvas;
import java.io.Serializable;

public class f implements j, Serializable
{
    private float G;
    private float H;
    private float I;
    
    public f(final float g, final float h, final float i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public void a(@j0 final Canvas canvas, @j0 final Paint paint) {
        canvas.drawCircle(this.G, this.H, this.I, paint);
    }
    
    public float b() {
        return this.I;
    }
    
    public float c() {
        return this.G;
    }
    
    public float d() {
        return this.H;
    }
    
    public void e(final float i) {
        this.I = i;
    }
    
    public void f(final float g) {
        this.G = g;
    }
    
    public void g(final float h) {
        this.H = h;
    }
}
