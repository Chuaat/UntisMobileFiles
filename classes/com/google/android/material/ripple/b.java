// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.ripple;

import android.util.Log;
import android.annotation.TargetApi;
import androidx.core.graphics.h;
import android.graphics.Color;
import androidx.annotation.l;
import androidx.annotation.j0;
import android.util.StateSet;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import androidx.annotation.b1;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b
{
    public static final boolean a;
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    @b1
    static final String l;
    @b1
    static final String m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";
    
    static {
        a = (Build$VERSION.SDK_INT >= 21);
        b = new int[] { 16842919 };
        c = new int[] { 16843623, 16842908 };
        d = new int[] { 16842908 };
        e = new int[] { 16843623 };
        f = new int[] { 16842913, 16842919 };
        g = new int[] { 16842913, 16843623, 16842908 };
        h = new int[] { 16842913, 16842908 };
        i = new int[] { 16842913, 16843623 };
        j = new int[] { 16842913 };
        k = new int[] { 16842910, 16842919 };
        l = b.class.getSimpleName();
    }
    
    private b() {
    }
    
    @j0
    public static ColorStateList a(@k0 final ColorStateList list) {
        if (com.google.android.material.ripple.b.a) {
            return new ColorStateList(new int[][] { com.google.android.material.ripple.b.j, StateSet.NOTHING }, new int[] { c(list, com.google.android.material.ripple.b.f), c(list, com.google.android.material.ripple.b.b) });
        }
        final int[] f = com.google.android.material.ripple.b.f;
        final int c = c(list, f);
        final int[] g = com.google.android.material.ripple.b.g;
        final int c2 = c(list, g);
        final int[] h = com.google.android.material.ripple.b.h;
        final int c3 = c(list, h);
        final int[] i = com.google.android.material.ripple.b.i;
        final int c4 = c(list, i);
        final int[] j = com.google.android.material.ripple.b.j;
        final int[] b = com.google.android.material.ripple.b.b;
        final int c5 = c(list, b);
        final int[] c6 = com.google.android.material.ripple.b.c;
        final int c7 = c(list, c6);
        final int[] d = com.google.android.material.ripple.b.d;
        final int c8 = c(list, d);
        final int[] e = com.google.android.material.ripple.b.e;
        return new ColorStateList(new int[][] { f, g, h, i, j, b, c6, d, e, StateSet.NOTHING }, new int[] { c, c2, c3, c4, 0, c5, c7, c8, c(list, e), 0 });
    }
    
    @TargetApi(21)
    @l
    private static int b(@l final int n) {
        return androidx.core.graphics.h.B(n, Math.min(Color.alpha(n) * 2, 255));
    }
    
    @l
    private static int c(@k0 final ColorStateList list, final int[] array) {
        int colorForState;
        if (list != null) {
            colorForState = list.getColorForState(array, list.getDefaultColor());
        }
        else {
            colorForState = 0;
        }
        int b = colorForState;
        if (com.google.android.material.ripple.b.a) {
            b = b(colorForState);
        }
        return b;
    }
    
    @j0
    public static ColorStateList d(@k0 final ColorStateList list) {
        if (list != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 22 && sdk_INT <= 27 && Color.alpha(list.getDefaultColor()) == 0 && Color.alpha(list.getColorForState(com.google.android.material.ripple.b.k, 0)) != 0) {
                Log.w(com.google.android.material.ripple.b.l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return list;
        }
        return ColorStateList.valueOf(0);
    }
    
    public static boolean e(@j0 final int[] array) {
        final int length = array.length;
        final boolean b = false;
        int i = 0;
        int n = 0;
        boolean b2 = false;
        while (i < length) {
            final int n2 = array[i];
            int n3 = 0;
            Label_0077: {
                if (n2 == 16842910) {
                    n3 = 1;
                }
                else {
                    if (n2 != 16842908) {
                        if (n2 != 16842919) {
                            n3 = n;
                            if (n2 != 16843623) {
                                break Label_0077;
                            }
                        }
                    }
                    b2 = true;
                    n3 = n;
                }
            }
            ++i;
            n = n3;
        }
        boolean b3 = b;
        if (n != 0) {
            b3 = b;
            if (b2) {
                b3 = true;
            }
        }
        return b3;
    }
}
