// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import androidx.annotation.k0;
import android.widget.ImageView;

public abstract class q<T> extends j<T>
{
    public q(final ImageView imageView) {
        super(imageView);
    }
    
    @Deprecated
    public q(final ImageView imageView, final boolean b) {
        super(imageView, b);
    }
    
    @Override
    protected void x(@k0 final T t) {
        final ViewGroup$LayoutParams layoutParams = ((ImageView)super.H).getLayoutParams();
        Drawable z;
        final Drawable drawable = z = this.z(t);
        if (layoutParams != null) {
            z = drawable;
            if (layoutParams.width > 0) {
                z = drawable;
                if (layoutParams.height > 0) {
                    z = new com.bumptech.glide.request.target.i(drawable, layoutParams.width, layoutParams.height);
                }
            }
        }
        ((ImageView)super.H).setImageDrawable(z);
    }
    
    protected abstract Drawable z(final T p0);
}
