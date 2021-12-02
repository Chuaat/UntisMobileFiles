// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.dialog;

import android.graphics.drawable.InsetDrawable;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import com.google.android.material.internal.t;
import o2.a;
import android.graphics.Rect;
import androidx.annotation.f;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class c
{
    private c() {
    }
    
    @j0
    public static Rect a(@j0 final Context context, @f int dimensionPixelSize, int n) {
        final TypedArray j = t.j(context, null, a.o.fk, dimensionPixelSize, n, new int[0]);
        final int dimensionPixelSize2 = j.getDimensionPixelSize(a.o.ik, context.getResources().getDimensionPixelSize(a.f.J2));
        final int dimensionPixelSize3 = j.getDimensionPixelSize(a.o.jk, context.getResources().getDimensionPixelSize(a.f.K2));
        dimensionPixelSize = j.getDimensionPixelSize(a.o.hk, context.getResources().getDimensionPixelSize(a.f.I2));
        final int dimensionPixelSize4 = j.getDimensionPixelSize(a.o.gk, context.getResources().getDimensionPixelSize(a.f.H2));
        j.recycle();
        int n2 = dimensionPixelSize;
        n = dimensionPixelSize2;
        if (Build$VERSION.SDK_INT >= 17) {
            n2 = dimensionPixelSize;
            n = dimensionPixelSize2;
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                n = dimensionPixelSize;
                n2 = dimensionPixelSize2;
            }
        }
        return new Rect(n, dimensionPixelSize3, n2, dimensionPixelSize4);
    }
    
    @j0
    public static InsetDrawable b(@k0 final Drawable drawable, @j0 final Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
