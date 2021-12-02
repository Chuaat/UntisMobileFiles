// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.b;
import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.load.engine.v;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.n;

public class s implements n<Drawable>
{
    private final n<Bitmap> c;
    private final boolean d;
    
    public s(final n<Bitmap> c, final boolean d) {
        this.c = c;
        this.d = d;
    }
    
    private v<Drawable> d(final Context context, final v<Bitmap> v) {
        return (v<Drawable>)z.d(context.getResources(), v);
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        this.c.a(messageDigest);
    }
    
    @j0
    @Override
    public v<Drawable> b(@j0 final Context context, @j0 final v<Drawable> v, final int n, final int n2) {
        final e g = com.bumptech.glide.b.d(context).g();
        final Drawable obj = v.get();
        final v<Bitmap> a = r.a(g, obj, n, n2);
        if (a == null) {
            if (!this.d) {
                return v;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(obj);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
        else {
            final v<Bitmap> b = this.c.b(context, a, n, n2);
            if (b.equals(a)) {
                b.a();
                return v;
            }
            return this.d(context, b);
        }
    }
    
    public n<BitmapDrawable> c() {
        return (n<BitmapDrawable>)this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof s && this.c.equals(((s)o).c);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
}
