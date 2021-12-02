// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import androidx.annotation.k0;
import android.view.View;
import android.graphics.drawable.Drawable;

public interface f<R>
{
    boolean a(final R p0, final a p1);
    
    public interface a
    {
        void d(final Drawable p0);
        
        View g();
        
        @k0
        Drawable i();
    }
}
