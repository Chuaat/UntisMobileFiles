// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker;

import android.graphics.Color;

public class c
{
    private float a;
    private float b;
    private float[] c;
    private float[] d;
    private int e;
    
    public c(final float n, final float n2, final float[] array) {
        this.c = new float[3];
        this.f(n, n2, array);
    }
    
    public int a() {
        return this.e;
    }
    
    public float[] b() {
        return this.c;
    }
    
    public float[] c(final float n) {
        if (this.d == null) {
            this.d = this.c.clone();
        }
        final float[] d = this.d;
        final float[] c = this.c;
        d[0] = c[0];
        d[1] = c[1];
        d[2] = n;
        return d;
    }
    
    public float d() {
        return this.a;
    }
    
    public float e() {
        return this.b;
    }
    
    public void f(final float a, final float b, final float[] array) {
        this.a = a;
        this.b = b;
        final float[] c = this.c;
        c[0] = array[0];
        c[1] = array[1];
        c[2] = array[2];
        this.e = Color.HSVToColor(c);
    }
    
    public double g(final float n, final float n2) {
        final double n3 = this.a - n;
        final double n4 = this.b - n2;
        return n3 * n3 + n4 * n4;
    }
}
