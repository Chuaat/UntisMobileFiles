// 
// Decompiled by Procyon v0.5.36
// 

package org.apmem.tools.layouts;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

class b
{
    private int a;
    private boolean b;
    private float c;
    private int d;
    private int e;
    
    public b(final Context context, AttributeSet obtainStyledAttributes) {
        this.a = 0;
        this.b = false;
        this.c = 0.0f;
        this.d = 51;
        this.e = 0;
        obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, org.apmem.tools.layouts.d.c.a);
        try {
            this.i(((TypedArray)obtainStyledAttributes).getInteger(org.apmem.tools.layouts.d.c.c, 0));
            this.f(((TypedArray)obtainStyledAttributes).getBoolean(org.apmem.tools.layouts.d.c.d, false));
            this.j(((TypedArray)obtainStyledAttributes).getFloat(org.apmem.tools.layouts.d.c.h, 0.0f));
            this.g(((TypedArray)obtainStyledAttributes).getInteger(org.apmem.tools.layouts.d.c.b, 0));
            this.h(((TypedArray)obtainStyledAttributes).getInteger(org.apmem.tools.layouts.d.c.f, 0));
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public int a() {
        return this.d;
    }
    
    public int b() {
        return this.e;
    }
    
    public int c() {
        return this.a;
    }
    
    public float d() {
        return this.c;
    }
    
    public boolean e() {
        return this.b;
    }
    
    public void f(final boolean b) {
        this.b = b;
    }
    
    public void g(final int d) {
        this.d = d;
    }
    
    public void h(int e) {
        if (e != 1) {
            e = 0;
        }
        this.e = e;
    }
    
    public void i(int a) {
        if (a != 1) {
            a = 0;
        }
        this.a = a;
    }
    
    public void j(final float b) {
        this.c = Math.max(0.0f, b);
    }
}
