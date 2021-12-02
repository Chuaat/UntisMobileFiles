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

public final class q extends c
{
    public int g;
    public int h;
    boolean i;
    
    public q(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.X8);
    }
    
    public q(@j0 final Context context, @k0 final AttributeSet set, @f final int n) {
        this(context, set, n, p.h0);
    }
    
    public q(@j0 final Context context, @k0 final AttributeSet set, @f int h0, @x0 int x8) {
        super(context, set, h0, x8);
        final int[] zj = o2.a.o.Zj;
        x8 = o2.a.c.X8;
        h0 = p.h0;
        boolean i = false;
        final TypedArray j = t.j(context, set, zj, x8, h0, new int[0]);
        this.g = j.getInt(o2.a.o.ak, 1);
        this.h = j.getInt(o2.a.o.bk, 0);
        j.recycle();
        this.e();
        if (this.h == 1) {
            i = true;
        }
        this.i = i;
    }
    
    @Override
    void e() {
        if (this.g == 0) {
            if (super.b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (super.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
