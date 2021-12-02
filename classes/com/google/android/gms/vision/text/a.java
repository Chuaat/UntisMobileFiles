// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.text;

import java.util.ArrayList;
import java.util.List;
import android.graphics.Point;
import androidx.annotation.RecentlyNonNull;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.p;

public class a implements c
{
    private p a;
    
    a(final p a) {
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
        return this.a.L;
    }
    
    @RecentlyNonNull
    @Override
    public Point[] c() {
        return h.b(this.a.H);
    }
    
    @RecentlyNonNull
    @Override
    public List<? extends c> getComponents() {
        return new ArrayList<c>();
    }
    
    @RecentlyNonNull
    @Override
    public String getValue() {
        return this.a.J;
    }
}
