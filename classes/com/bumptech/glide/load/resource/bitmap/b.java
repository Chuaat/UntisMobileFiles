// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import java.io.File;
import androidx.annotation.j0;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.m;

public class b implements m<BitmapDrawable>
{
    private final e a;
    private final m<Bitmap> b;
    
    public b(final e a, final m<Bitmap> b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    @Override
    public c b(@j0 final j j) {
        return this.b.b(j);
    }
    
    public boolean c(@j0 final v<BitmapDrawable> v, @j0 final File file, @j0 final j j) {
        return this.b.a(new g(v.get().getBitmap(), this.a), file, j);
    }
}
