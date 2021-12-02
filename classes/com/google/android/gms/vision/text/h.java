// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;

final class h
{
    static Rect a(final c c) {
        final Point[] c2 = c.c();
        final int length = c2.length;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (final Point point : c2) {
            min = Math.min(min, point.x);
            max = Math.max(max, point.x);
            min2 = Math.min(min2, point.y);
            max2 = Math.max(max2, point.y);
        }
        return new Rect(min, min2, max, max2);
    }
    
    static Point[] b(final com.google.android.gms.internal.vision.c c) {
        final Point[] array = new Point[4];
        final double sin = Math.sin(Math.toRadians(c.K));
        final double cos = Math.cos(Math.toRadians(c.K));
        array[0] = new Point(c.G, c.H);
        final double n = c.G;
        final int i = c.I;
        array[1] = new Point((int)(n + i * cos), (int)(c.H + i * sin));
        final double n2 = array[1].x;
        final int j = c.J;
        array[2] = new Point((int)(n2 - j * sin), (int)(array[1].y + j * cos));
        array[3] = new Point(array[0].x + (array[2].x - array[1].x), array[0].y + (array[2].y - array[1].y));
        return array;
    }
}
