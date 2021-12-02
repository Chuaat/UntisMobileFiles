// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import androidx.annotation.RecentlyNonNull;
import android.util.SparseArray;
import android.graphics.Rect;
import java.util.List;
import android.graphics.Point;
import com.google.android.gms.internal.vision.i;

public class d implements c
{
    private i[] a;
    private Point[] b;
    private List<b> c;
    private String d;
    private Rect e;
    
    d(final SparseArray<i> sparseArray) {
        this.a = new i[sparseArray.size()];
        int n = 0;
        while (true) {
            final i[] a = this.a;
            if (n >= a.length) {
                break;
            }
            a[n] = (i)sparseArray.valueAt(n);
            ++n;
        }
    }
    
    @RecentlyNonNull
    @Override
    public Rect a() {
        if (this.e == null) {
            this.e = h.a(this);
        }
        return this.e;
    }
    
    @RecentlyNonNull
    @Override
    public String b() {
        final String d = this.d;
        if (d != null) {
            return d;
        }
        final HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        for (final i j : this.a) {
            int intValue;
            if (hashMap.containsKey(j.M)) {
                intValue = hashMap.get(j.M);
            }
            else {
                intValue = 0;
            }
            hashMap.put(j.M, intValue + 1);
        }
        final String d2 = Collections.max((Collection<? extends Map.Entry<String, V>>)hashMap.entrySet(), (Comparator<? super Map.Entry<String, V>>)new f(this)).getKey();
        this.d = d2;
        if (d2 == null || d2.isEmpty()) {
            this.d = "und";
        }
        return this.d;
    }
    
    @RecentlyNonNull
    @Override
    public Point[] c() {
        if (this.b == null) {
            if (this.a.length == 0) {
                this.b = new Point[0];
            }
            else {
                int max = Integer.MIN_VALUE;
                int max2 = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                int min2 = Integer.MAX_VALUE;
                int n = 0;
                i[] a;
                while (true) {
                    a = this.a;
                    if (n >= a.length) {
                        break;
                    }
                    final com.google.android.gms.internal.vision.c h = a[n].H;
                    final com.google.android.gms.internal.vision.c h2 = a[0].H;
                    final int n2 = -h2.G;
                    final int n3 = -h2.H;
                    final double sin = Math.sin(Math.toRadians(h2.K));
                    final double cos = Math.cos(Math.toRadians(h2.K));
                    final Point[] array = new Point[4];
                    (array[0] = new Point(h.G, h.H)).offset(n2, n3);
                    final int x = (int)(array[0].x * cos + array[0].y * sin);
                    final int y = (int)(-array[0].x * sin + array[0].y * cos);
                    array[0].x = x;
                    array[0].y = y;
                    array[1] = new Point(h.I + x, y);
                    array[2] = new Point(h.I + x, h.J + y);
                    array[3] = new Point(x, y + h.J);
                    for (int i = 0; i < 4; ++i) {
                        final Point point = array[i];
                        min = Math.min(min, point.x);
                        max = Math.max(max, point.x);
                        min2 = Math.min(min2, point.y);
                        max2 = Math.max(max2, point.y);
                    }
                    ++n;
                }
                final com.google.android.gms.internal.vision.c h3 = a[0].H;
                final int g = h3.G;
                final int h4 = h3.H;
                final double sin2 = Math.sin(Math.toRadians(h3.K));
                final double cos2 = Math.cos(Math.toRadians(h3.K));
                final Point[] b = new Point[4];
                final Point point2 = new Point(min, min2);
                final int n4 = 0;
                b[0] = point2;
                b[1] = new Point(max, min2);
                b[2] = new Point(max, max2);
                b[3] = new Point(min, max2);
                for (int j = n4; j < 4; ++j) {
                    final int x2 = (int)(b[j].x * cos2 - b[j].y * sin2);
                    final int y2 = (int)(b[j].x * sin2 + b[j].y * cos2);
                    b[j].x = x2;
                    b[j].y = y2;
                    b[j].offset(g, h4);
                }
                this.b = b;
            }
        }
        return this.b;
    }
    
    @RecentlyNonNull
    @Override
    public List<? extends c> getComponents() {
        final int length = this.a.length;
        int i = 0;
        if (length == 0) {
            return new ArrayList<c>(0);
        }
        if (this.c == null) {
            this.c = new ArrayList<b>(this.a.length);
            for (i[] a = this.a; i < a.length; ++i) {
                this.c.add(new b(a[i]));
            }
        }
        return this.c;
    }
    
    @RecentlyNonNull
    @Override
    public String getValue() {
        final i[] a = this.a;
        if (a.length == 0) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(a[0].K);
        for (int i = 1; i < this.a.length; ++i) {
            sb.append("\n");
            sb.append(this.a[i].K);
        }
        return sb.toString();
    }
}
