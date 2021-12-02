// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.b;
import android.content.Context;
import androidx.annotation.k0;
import com.bumptech.glide.util.k;
import androidx.annotation.j0;
import android.graphics.Bitmap;
import android.content.res.Resources;
import com.bumptech.glide.load.engine.r;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.v;

public final class z implements v<BitmapDrawable>, r
{
    private final Resources G;
    private final v<Bitmap> H;
    
    private z(@j0 final Resources resources, @j0 final v<Bitmap> v) {
        this.G = k.d(resources);
        this.H = k.d(v);
    }
    
    @k0
    public static v<BitmapDrawable> d(@j0 final Resources resources, @k0 final v<Bitmap> v) {
        if (v == null) {
            return null;
        }
        return new z(resources, v);
    }
    
    @Deprecated
    public static z e(final Context context, final Bitmap bitmap) {
        return (z)d(context.getResources(), g.d(bitmap, b.d(context).g()));
    }
    
    @Deprecated
    public static z f(final Resources resources, final e e, final Bitmap bitmap) {
        return (z)d(resources, g.d(bitmap, e));
    }
    
    @Override
    public void a() {
        this.H.a();
    }
    
    @Override
    public void b() {
        final v<Bitmap> h = this.H;
        if (h instanceof r) {
            ((r)h).b();
        }
    }
    
    @j0
    public BitmapDrawable c() {
        return new BitmapDrawable(this.G, (Bitmap)this.H.get());
    }
    
    @Override
    public int l0() {
        return this.H.l0();
    }
    
    @j0
    @Override
    public Class<BitmapDrawable> m0() {
        return BitmapDrawable.class;
    }
}
