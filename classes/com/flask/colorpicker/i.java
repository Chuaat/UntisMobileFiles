// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker;

import android.graphics.Color;

public class i
{
    public static int a(final float n, final int n2) {
        return b(n) << 24 | (n2 & 0xFFFFFF);
    }
    
    public static int b(final float n) {
        return Math.round(n * 255.0f);
    }
    
    public static int c(final int n, final float n2) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        array[2] = n2;
        return Color.HSVToColor(array);
    }
    
    public static float d(final int n) {
        return Color.alpha(n) / 255.0f;
    }
    
    public static String e(final int n, final boolean b) {
        int n2;
        if (b) {
            n2 = -1;
        }
        else {
            n2 = 16777215;
        }
        String format;
        if (b) {
            format = "#%08X";
        }
        else {
            format = "#%06X";
        }
        return String.format(format, n & n2).toUpperCase();
    }
    
    public static float f(final int n) {
        final float[] array = new float[3];
        Color.colorToHSV(n, array);
        return array[2];
    }
}
