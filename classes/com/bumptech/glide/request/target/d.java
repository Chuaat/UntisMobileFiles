// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.Bitmap;

public class d extends q<Bitmap>
{
    public d(final ImageView imageView) {
        super(imageView);
    }
    
    @Deprecated
    public d(final ImageView imageView, final boolean b) {
        super(imageView, b);
    }
    
    protected Drawable A(final Bitmap bitmap) {
        return (Drawable)new BitmapDrawable(((ImageView)super.H).getResources(), bitmap);
    }
}
