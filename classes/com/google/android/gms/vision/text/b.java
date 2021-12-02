// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.text;

import com.google.android.gms.internal.vision.p;
import java.util.ArrayList;
import android.graphics.Point;
import androidx.annotation.RecentlyNonNull;
import android.graphics.Rect;
import java.util.List;
import com.google.android.gms.internal.vision.i;

public class b implements c
{
    private i a;
    private List<a> b;
    
    b(final i a) {
        this.a = a;
    }
    
    @RecentlyNonNull
    @Override
    public Rect a() {
        return h.a(this);
    }
    
    @RecentlyNonNull
    @Override
    public String b() {
        return this.a.M;
    }
    
    @RecentlyNonNull
    @Override
    public Point[] c() {
        return h.b(this.a.H);
    }
    
    public float d() {
        return this.a.H.K;
    }
    
    public boolean e() {
        return this.a.O;
    }
    
    @RecentlyNonNull
    @Override
    public List<? extends c> getComponents() {
        final int length = this.a.G.length;
        int i = 0;
        if (length == 0) {
            return new ArrayList<c>(0);
        }
        if (this.b == null) {
            this.b = new ArrayList<a>(this.a.G.length);
            for (p[] g = this.a.G; i < g.length; ++i) {
                this.b.add(new a(g[i]));
            }
        }
        return this.b;
    }
    
    @RecentlyNonNull
    @Override
    public String getValue() {
        return this.a.K;
    }
}
