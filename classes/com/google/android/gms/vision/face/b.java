// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face;

import com.google.android.gms.common.internal.b0;
import java.util.Arrays;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import android.graphics.PointF;

public class b
{
    public static final float n = -1.0f;
    private int a;
    private PointF b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private List<d> h;
    private final List<a> i;
    private float j;
    private float k;
    private float l;
    private final float m;
    
    public b(final int a, @RecentlyNonNull final PointF b, final float c, final float d, final float e, final float f, final float g, @RecentlyNonNull final d[] a2, @RecentlyNonNull final a[] a3, final float n, final float n2, final float n3, final float n4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = Arrays.asList(a2);
        this.i = Arrays.asList(a3);
        this.j = m(n);
        this.k = m(n2);
        this.l = m(n3);
        this.m = m(n4);
    }
    
    private static float m(final float n) {
        if (n >= 0.0f && n <= 1.0f) {
            return n;
        }
        return -1.0f;
    }
    
    @RecentlyNonNull
    public List<a> a() {
        return this.i;
    }
    
    @b0
    @f2.a
    public float b() {
        return this.g;
    }
    
    public float c() {
        return this.e;
    }
    
    public float d() {
        return this.f;
    }
    
    public float e() {
        return this.d;
    }
    
    public int f() {
        return this.a;
    }
    
    public float g() {
        return this.j;
    }
    
    public float h() {
        return this.k;
    }
    
    public float i() {
        return this.l;
    }
    
    @RecentlyNonNull
    public List<d> j() {
        return this.h;
    }
    
    @RecentlyNonNull
    public PointF k() {
        final PointF b = this.b;
        return new PointF(b.x - this.c / 2.0f, b.y - this.d / 2.0f);
    }
    
    public float l() {
        return this.c;
    }
}
