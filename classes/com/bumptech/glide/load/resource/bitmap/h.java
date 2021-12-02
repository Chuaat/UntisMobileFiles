// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.b;
import com.bumptech.glide.util.m;
import com.bumptech.glide.load.engine.v;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.n;

public abstract class h implements n<Bitmap>
{
    @j0
    @Override
    public final v<Bitmap> b(@j0 final Context context, @j0 v<Bitmap> d, int height, final int i) {
        if (m.v(height, i)) {
            final e g = com.bumptech.glide.b.d(context).g();
            final Bitmap bitmap = d.get();
            int width;
            if ((width = height) == Integer.MIN_VALUE) {
                width = bitmap.getWidth();
            }
            if ((height = i) == Integer.MIN_VALUE) {
                height = bitmap.getHeight();
            }
            final Bitmap c = this.c(g, bitmap, width, height);
            if (!bitmap.equals(c)) {
                d = com.bumptech.glide.load.resource.bitmap.g.d(c, g);
            }
            return d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot apply transformation on width: ");
        sb.append(height);
        sb.append(" or height: ");
        sb.append(i);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
    
    protected abstract Bitmap c(@j0 final e p0, @j0 final Bitmap p1, final int p2, final int p3);
}
