// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import androidx.annotation.k0;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;

public class g extends j<Drawable>
{
    public g(final ImageView imageView) {
        super(imageView);
    }
    
    @Deprecated
    public g(final ImageView imageView, final boolean b) {
        super(imageView, b);
    }
    
    protected void z(@k0 final Drawable imageDrawable) {
        ((ImageView)super.H).setImageDrawable(imageDrawable);
    }
}
