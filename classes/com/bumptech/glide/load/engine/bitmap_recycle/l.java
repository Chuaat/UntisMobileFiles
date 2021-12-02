// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.k0;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

interface l
{
    String a(final int p0, final int p1, final Bitmap$Config p2);
    
    int b(final Bitmap p0);
    
    String c(final Bitmap p0);
    
    void d(final Bitmap p0);
    
    @k0
    Bitmap f(final int p0, final int p1, final Bitmap$Config p2);
    
    @k0
    Bitmap removeLast();
}
