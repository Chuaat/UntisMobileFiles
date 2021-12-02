// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.resources;

import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.u0;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import androidx.appcompat.content.res.a;
import android.content.res.ColorStateList;
import androidx.annotation.y0;
import android.content.res.TypedArray;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class c
{
    private static final float a = 1.3f;
    private static final float b = 2.0f;
    
    private c() {
    }
    
    @k0
    public static ColorStateList a(@j0 final Context context, @j0 final TypedArray typedArray, @y0 final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList c = androidx.appcompat.content.res.a.c(context, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        if (Build$VERSION.SDK_INT <= 15) {
            final int color = typedArray.getColor(n, -1);
            if (color != -1) {
                return ColorStateList.valueOf(color);
            }
        }
        return typedArray.getColorStateList(n);
    }
    
    @k0
    public static ColorStateList b(@j0 final Context context, @j0 final u0 u0, @y0 final int n) {
        if (u0.C(n)) {
            final int u2 = u0.u(n, 0);
            if (u2 != 0) {
                final ColorStateList c = androidx.appcompat.content.res.a.c(context, u2);
                if (c != null) {
                    return c;
                }
            }
        }
        if (Build$VERSION.SDK_INT <= 15) {
            final int c2 = u0.c(n, -1);
            if (c2 != -1) {
                return ColorStateList.valueOf(c2);
            }
        }
        return u0.d(n);
    }
    
    public static int c(@j0 final Context context, @j0 final TypedArray typedArray, @y0 int dimensionPixelSize, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(dimensionPixelSize, typedValue) && typedValue.type == 2) {
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { typedValue.data });
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, n);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(dimensionPixelSize, n);
    }
    
    @k0
    public static Drawable d(@j0 final Context context, @j0 final TypedArray typedArray, @y0 final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final Drawable d = androidx.appcompat.content.res.a.d(context, resourceId);
                if (d != null) {
                    return d;
                }
            }
        }
        return typedArray.getDrawable(n);
    }
    
    @y0
    static int e(@j0 final TypedArray typedArray, @y0 final int n, @y0 final int n2) {
        if (typedArray.hasValue(n)) {
            return n;
        }
        return n2;
    }
    
    @k0
    public static d f(@j0 final Context context, @j0 final TypedArray typedArray, @y0 int resourceId) {
        if (typedArray.hasValue(resourceId)) {
            resourceId = typedArray.getResourceId(resourceId, 0);
            if (resourceId != 0) {
                return new d(context, resourceId);
            }
        }
        return null;
    }
    
    public static boolean g(@j0 final Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
    
    public static boolean h(@j0 final Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
