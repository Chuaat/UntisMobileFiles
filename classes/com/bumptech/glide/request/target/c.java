// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.widget.ImageView;
import android.graphics.Bitmap;

public class c extends j<Bitmap>
{
    public c(final ImageView imageView) {
        super(imageView);
    }
    
    @Deprecated
    public c(final ImageView imageView, final boolean b) {
        super(imageView, b);
    }
    
    protected void z(final Bitmap imageBitmap) {
        ((ImageView)super.H).setImageBitmap(imageBitmap);
    }
}
