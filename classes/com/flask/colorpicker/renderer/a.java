// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.renderer;

import java.util.ArrayList;
import java.util.List;

public abstract class a implements c
{
    protected b b;
    protected List<com.flask.colorpicker.c> c;
    
    public a() {
        this.c = new ArrayList<com.flask.colorpicker.c>();
    }
    
    @Override
    public void b(final b b) {
        this.b = b;
        this.c.clear();
    }
    
    @Override
    public b c() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }
    
    @Override
    public List<com.flask.colorpicker.c> d() {
        return this.c;
    }
    
    protected int e(final float n, final float n2) {
        return Math.max(1, (int)(3.063052912151454 / Math.asin(n2 / n) + 0.5));
    }
    
    protected int f() {
        return Math.round(this.b.e * 255.0f);
    }
}
