// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import com.bumptech.glide.load.resource.drawable.e;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bumptech.glide.load.l;

public class c0 implements l<Uri, Bitmap>
{
    private final e a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e b;
    
    public c0(final e a, final com.bumptech.glide.load.engine.bitmap_recycle.e b) {
        this.a = a;
        this.b = b;
    }
    
    @k0
    public v<Bitmap> c(@j0 final Uri uri, final int n, final int n2, @j0 final j j) {
        final v<Drawable> c = this.a.c(uri, n, n2, j);
        if (c == null) {
            return null;
        }
        return r.a(this.b, c.get(), n, n2);
    }
    
    public boolean d(@j0 final Uri uri, @j0 final j j) {
        return "android.resource".equals(uri.getScheme());
    }
}
