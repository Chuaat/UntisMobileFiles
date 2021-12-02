// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.k0;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.k;
import androidx.annotation.j0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;

public class b implements e<Bitmap, BitmapDrawable>
{
    private final Resources a;
    
    public b(@j0 final Context context) {
        this(context.getResources());
    }
    
    public b(@j0 final Resources resources) {
        this.a = k.d(resources);
    }
    
    @Deprecated
    public b(@j0 final Resources resources, final com.bumptech.glide.load.engine.bitmap_recycle.e e) {
        this(resources);
    }
    
    @k0
    @Override
    public v<BitmapDrawable> a(@j0 final v<Bitmap> v, @j0 final j j) {
        return z.d(this.a, v);
    }
}
