// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.l;

public final class h implements l<a, Bitmap>
{
    private final e a;
    
    public h(final e a) {
        this.a = a;
    }
    
    public v<Bitmap> c(@j0 final a a, final int n, final int n2, @j0 final j j) {
        return g.d(a.j(), this.a);
    }
    
    public boolean d(@j0 final a a, @j0 final j j) {
        return true;
    }
}
