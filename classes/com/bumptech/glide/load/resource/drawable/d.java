// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.drawable;

import androidx.annotation.j0;
import com.bumptech.glide.load.engine.v;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;

final class d extends b<Drawable>
{
    private d(final Drawable drawable) {
        super(drawable);
    }
    
    @k0
    static v<Drawable> d(@k0 final Drawable drawable) {
        d d;
        if (drawable != null) {
            d = new d(drawable);
        }
        else {
            d = null;
        }
        return d;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public int l0() {
        return Math.max(1, super.G.getIntrinsicWidth() * super.G.getIntrinsicHeight() * 4);
    }
    
    @j0
    @Override
    public Class<Drawable> m0() {
        return (Class<Drawable>)super.G.getClass();
    }
}
