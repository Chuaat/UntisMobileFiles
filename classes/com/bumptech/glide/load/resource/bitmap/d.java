// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.k;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.n;

@Deprecated
public class d implements n<BitmapDrawable>
{
    private final n<Drawable> c;
    
    public d(final n<Bitmap> n) {
        this.c = k.d(new s(n, false));
    }
    
    private static v<BitmapDrawable> c(final v<Drawable> v) {
        if (v.get() instanceof BitmapDrawable) {
            return (v<BitmapDrawable>)v;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: ");
        sb.append(v.get());
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static v<Drawable> d(final v<BitmapDrawable> v) {
        return (v<Drawable>)v;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        this.c.a(messageDigest);
    }
    
    @j0
    @Override
    public v<BitmapDrawable> b(@j0 final Context context, @j0 final v<BitmapDrawable> v, final int n, final int n2) {
        return c(this.c.b(context, d(v), n, n2));
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof d && this.c.equals(((d)o).c);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
}
