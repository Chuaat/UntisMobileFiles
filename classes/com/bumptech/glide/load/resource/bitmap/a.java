// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import com.bumptech.glide.util.k;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.l;

public class a<DataType> implements l<DataType, BitmapDrawable>
{
    private final l<DataType, Bitmap> a;
    private final Resources b;
    
    public a(final Context context, final l<DataType, Bitmap> l) {
        this(context.getResources(), l);
    }
    
    @Deprecated
    public a(final Resources resources, final e e, final l<DataType, Bitmap> l) {
        this(resources, l);
    }
    
    public a(@j0 final Resources resources, @j0 final l<DataType, Bitmap> l) {
        this.b = k.d(resources);
        this.a = k.d(l);
    }
    
    @Override
    public boolean a(@j0 final DataType dataType, @j0 final j j) throws IOException {
        return this.a.a(dataType, j);
    }
    
    @Override
    public v<BitmapDrawable> b(@j0 final DataType dataType, final int n, final int n2, @j0 final j j) throws IOException {
        return z.d(this.b, this.a.b(dataType, n, n2, j));
    }
}
