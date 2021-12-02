// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.d;
import androidx.annotation.k0;
import com.bumptech.glide.request.transition.f;
import androidx.annotation.j0;
import com.bumptech.glide.manager.i;

public interface p<R> extends i
{
    public static final int d = Integer.MIN_VALUE;
    
    void b(@j0 final o p0);
    
    void c(@j0 final R p0, @k0 final f<? super R> p1);
    
    void e(@k0 final d p0);
    
    void h(@k0 final Drawable p0);
    
    void k(@k0 final Drawable p0);
    
    @k0
    d o();
    
    void p(@k0 final Drawable p0);
    
    void r(@j0 final o p0);
}
