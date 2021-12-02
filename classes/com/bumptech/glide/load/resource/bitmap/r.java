// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import java.util.concurrent.locks.Lock;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.util.Log;
import androidx.annotation.k0;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.v;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.f;
import com.bumptech.glide.load.engine.bitmap_recycle.e;

final class r
{
    private static final String a = "DrawableToBitmap";
    private static final e b;
    
    static {
        b = new f() {
            @Override
            public void d(final Bitmap bitmap) {
            }
        };
    }
    
    private r() {
    }
    
    @k0
    static v<Bitmap> a(e b, Drawable current, int n, final int n2) {
        current = current.getCurrent();
        final boolean b2 = current instanceof BitmapDrawable;
        final int n3 = 0;
        Bitmap bitmap;
        if (b2) {
            bitmap = ((BitmapDrawable)current).getBitmap();
            n = n3;
        }
        else if (!(current instanceof Animatable)) {
            bitmap = b(b, current, n, n2);
            n = 1;
        }
        else {
            bitmap = null;
            n = n3;
        }
        if (n == 0) {
            b = r.b;
        }
        return g.d(bitmap, b);
    }
    
    @k0
    private static Bitmap b(final e e, final Drawable drawable, int intrinsicWidth, int intrinsicHeight) {
        if (intrinsicWidth == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w("DrawableToBitmap", sb.toString());
            }
            return null;
        }
        if (intrinsicHeight == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w("DrawableToBitmap", sb2.toString());
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        final Lock i = g0.i();
        i.lock();
        final Bitmap f = e.f(intrinsicWidth, intrinsicHeight, Bitmap$Config.ARGB_8888);
        try {
            final Canvas canvas = new Canvas(f);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            canvas.setBitmap((Bitmap)null);
            return f;
        }
        finally {
            i.unlock();
        }
    }
}
