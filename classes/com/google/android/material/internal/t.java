// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.appcompat.widget.u0;
import androidx.annotation.k0;
import androidx.annotation.y0;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.annotation.x0;
import androidx.annotation.f;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import o2.a;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class t
{
    private static final int[] a;
    private static final String b = "Theme.AppCompat";
    private static final int[] c;
    private static final String d = "Theme.MaterialComponents";
    
    static {
        a = new int[] { o2.a.c.J2 };
        c = new int[] { o2.a.c.M2 };
    }
    
    private t() {
    }
    
    public static void a(@j0 final Context context) {
        e(context, t.a, "Theme.AppCompat");
    }
    
    private static void b(@j0 final Context context, final AttributeSet set, @f final int n, @x0 final int n2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.Ot, n, n2);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(o2.a.o.Qt, false);
        obtainStyledAttributes.recycle();
        if (boolean1) {
            final TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(o2.a.c.Z6, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }
    
    public static void c(@j0 final Context context) {
        e(context, t.c, "Theme.MaterialComponents");
    }
    
    private static void d(@j0 final Context context, final AttributeSet set, @j0 @y0 final int[] array, @f final int n, @x0 final int n2, @k0 @y0 final int... array2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.Ot, n, n2);
        final int rt = o2.a.o.Rt;
        boolean g = false;
        if (!obtainStyledAttributes.getBoolean(rt, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (array2 != null && array2.length != 0) {
            g = g(context, set, array, n, n2, array2);
        }
        else if (obtainStyledAttributes.getResourceId(o2.a.o.Pt, -1) != -1) {
            g = true;
        }
        obtainStyledAttributes.recycle();
        if (g) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }
    
    private static void e(@j0 final Context context, @j0 final int[] array, final String str) {
        if (i(context, array)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The style on this component requires your app theme to be ");
        sb.append(str);
        sb.append(" (or a descendant).");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static boolean f(@j0 final Context context) {
        return i(context, t.a);
    }
    
    private static boolean g(@j0 final Context context, final AttributeSet set, @j0 @y0 final int[] array, @f int i, @x0 int length, @j0 @y0 final int... array2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, array, i, length);
        for (length = array2.length, i = 0; i < length; ++i) {
            if (obtainStyledAttributes.getResourceId(array2[i], -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }
    
    public static boolean h(@j0 final Context context) {
        return i(context, t.c);
    }
    
    private static boolean i(@j0 final Context context, @j0 final int[] array) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(array);
        for (int i = 0; i < array.length; ++i) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }
    
    @j0
    public static TypedArray j(@j0 final Context context, final AttributeSet set, @j0 @y0 final int[] array, @f final int n, @x0 final int n2, @y0 final int... array2) {
        b(context, set, n, n2);
        d(context, set, array, n, n2, array2);
        return context.obtainStyledAttributes(set, array, n, n2);
    }
    
    public static u0 k(@j0 final Context context, final AttributeSet set, @j0 @y0 final int[] array, @f final int n, @x0 final int n2, @y0 final int... array2) {
        b(context, set, n, n2);
        d(context, set, array, n, n2, array2);
        return u0.G(context, set, array, n, n2);
    }
}
