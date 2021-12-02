// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.j0;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public class f implements e
{
    @Override
    public void a(final int n) {
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public void c(final float n) {
    }
    
    @Override
    public void d(final Bitmap bitmap) {
        bitmap.recycle();
    }
    
    @Override
    public long e() {
        return 0L;
    }
    
    @j0
    @Override
    public Bitmap f(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return Bitmap.createBitmap(n, n2, bitmap$Config);
    }
    
    @j0
    @Override
    public Bitmap g(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return this.f(n, n2, bitmap$Config);
    }
}
