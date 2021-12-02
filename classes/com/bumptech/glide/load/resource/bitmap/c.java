// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.j0;
import com.bumptech.glide.util.m;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.r;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.resource.drawable.b;

public class c extends b<BitmapDrawable> implements r
{
    private final e H;
    
    public c(final BitmapDrawable bitmapDrawable, final e h) {
        super((Drawable)bitmapDrawable);
        this.H = h;
    }
    
    @Override
    public void a() {
        this.H.d(((BitmapDrawable)super.G).getBitmap());
    }
    
    @Override
    public void b() {
        ((BitmapDrawable)super.G).getBitmap().prepareToDraw();
    }
    
    @Override
    public int l0() {
        return m.h(((BitmapDrawable)super.G).getBitmap());
    }
    
    @j0
    @Override
    public Class<BitmapDrawable> m0() {
        return BitmapDrawable.class;
    }
}
