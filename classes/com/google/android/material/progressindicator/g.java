// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import androidx.annotation.x0;
import androidx.annotation.f;
import o2.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.n0;

public final class g extends c
{
    @n0
    public int g;
    @n0
    public int h;
    public int i;
    
    public g(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.b2);
    }
    
    public g(@j0 final Context context, @k0 final AttributeSet set, @f final int n) {
        this(context, set, n, com.google.android.material.progressindicator.f.h0);
    }
    
    public g(@j0 final Context context, @k0 final AttributeSet set, @f final int n, @x0 final int n2) {
        super(context, set, n, n2);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(o2.a.f.D5);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(o2.a.f.y5);
        final TypedArray j = t.j(context, set, o2.a.o.i6, n, n2, new int[0]);
        this.g = Math.max(com.google.android.material.resources.c.c(context, j, o2.a.o.l6, dimensionPixelSize), super.a * 2);
        this.h = com.google.android.material.resources.c.c(context, j, o2.a.o.k6, dimensionPixelSize2);
        this.i = j.getInt(o2.a.o.j6, 0);
        j.recycle();
        this.e();
    }
    
    @Override
    void e() {
    }
}
