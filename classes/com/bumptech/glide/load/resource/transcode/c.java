// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.k0;
import com.bumptech.glide.load.resource.bitmap.g;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.engine.v;
import androidx.annotation.j0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public final class c implements e<Drawable, byte[]>
{
    private final com.bumptech.glide.load.engine.bitmap_recycle.e a;
    private final e<Bitmap, byte[]> b;
    private final e<com.bumptech.glide.load.resource.gif.c, byte[]> c;
    
    public c(@j0 final com.bumptech.glide.load.engine.bitmap_recycle.e a, @j0 final e<Bitmap, byte[]> b, @j0 final e<com.bumptech.glide.load.resource.gif.c, byte[]> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    private static v<com.bumptech.glide.load.resource.gif.c> b(@j0 final v<Drawable> v) {
        return (v<com.bumptech.glide.load.resource.gif.c>)v;
    }
    
    @k0
    @Override
    public v<byte[]> a(@j0 final v<Drawable> v, @j0 final j j) {
        final Drawable drawable = v.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(g.d(((BitmapDrawable)drawable).getBitmap(), this.a), j);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.c) {
            return this.c.a(b(v), j);
        }
        return null;
    }
}
