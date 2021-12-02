// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.util.m;
import androidx.annotation.k0;
import com.bumptech.glide.util.k;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.r;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.v;

public class g implements v<Bitmap>, r
{
    private final Bitmap G;
    private final e H;
    
    public g(@j0 final Bitmap bitmap, @j0 final e e) {
        this.G = k.e(bitmap, "Bitmap must not be null");
        this.H = k.e(e, "BitmapPool must not be null");
    }
    
    @k0
    public static g d(@k0 final Bitmap bitmap, @j0 final e e) {
        if (bitmap == null) {
            return null;
        }
        return new g(bitmap, e);
    }
    
    @Override
    public void a() {
        this.H.d(this.G);
    }
    
    @Override
    public void b() {
        this.G.prepareToDraw();
    }
    
    @j0
    public Bitmap c() {
        return this.G;
    }
    
    @Override
    public int l0() {
        return m.h(this.G);
    }
    
    @j0
    @Override
    public Class<Bitmap> m0() {
        return Bitmap.class;
    }
}
