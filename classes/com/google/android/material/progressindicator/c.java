// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import o2.a;
import androidx.annotation.x0;
import androidx.annotation.f;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.l;
import androidx.annotation.j0;
import androidx.annotation.n0;

public abstract class c
{
    @n0
    public int a;
    @n0
    public int b;
    @j0
    public int[] c;
    @l
    public int d;
    public int e;
    public int f;
    
    protected c(@j0 final Context context, @k0 final AttributeSet set, @f final int n, @x0 final int n2) {
        this.c = new int[0];
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(o2.a.f.J5);
        final TypedArray j = t.j(context, set, o2.a.o.c4, n, n2, new int[0]);
        this.a = com.google.android.material.resources.c.c(context, j, o2.a.o.l4, dimensionPixelSize);
        this.b = Math.min(com.google.android.material.resources.c.c(context, j, o2.a.o.k4, 0), this.a / 2);
        this.e = j.getInt(o2.a.o.h4, 0);
        this.f = j.getInt(o2.a.o.e4, 0);
        this.c(context, j);
        this.d(context, j);
        j.recycle();
    }
    
    private void c(@j0 final Context context, @j0 final TypedArray typedArray) {
        final int f4 = o2.a.o.f4;
        if (!typedArray.hasValue(f4)) {
            this.c = new int[] { s2.a.b(context, o2.a.c.J2, -1) };
            return;
        }
        if (typedArray.peekValue(f4).type != 1) {
            this.c = new int[] { typedArray.getColor(f4, -1) };
            return;
        }
        final int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(f4, -1));
        this.c = intArray;
        if (intArray.length != 0) {
            return;
        }
        throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
    }
    
    private void d(@j0 final Context context, @j0 final TypedArray typedArray) {
        final int j4 = o2.a.o.j4;
        int d;
        if (typedArray.hasValue(j4)) {
            d = typedArray.getColor(j4, -1);
        }
        else {
            this.d = this.c[0];
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 16842803 });
            final float float1 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            d = s2.a.a(this.d, (int)(float1 * 255.0f));
        }
        this.d = d;
    }
    
    public boolean a() {
        return this.f != 0;
    }
    
    public boolean b() {
        return this.e != 0;
    }
    
    abstract void e();
}
