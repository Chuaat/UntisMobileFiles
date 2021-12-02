// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import androidx.annotation.j0;
import android.widget.ImageView;

public class k
{
    @j0
    public <Z> r<ImageView, Z> a(@j0 final ImageView imageView, @j0 final Class<Z> clazz) {
        if (Bitmap.class.equals(clazz)) {
            return (r<ImageView, Z>)new c(imageView);
        }
        if (Drawable.class.isAssignableFrom(clazz)) {
            return (r<ImageView, Z>)new g(imageView);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unhandled class: ");
        sb.append(clazz);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}
