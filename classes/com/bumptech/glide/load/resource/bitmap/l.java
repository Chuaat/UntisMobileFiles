// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.load.g;

public class l extends h
{
    private static final String c = "com.bumptech.glide.load.resource.bitmap.CenterCrop";
    private static final byte[] d;
    
    static {
        d = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(g.b);
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        messageDigest.update(l.d);
    }
    
    @Override
    protected Bitmap c(@j0 final e e, @j0 final Bitmap bitmap, final int n, final int n2) {
        return g0.b(e, bitmap, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof l;
    }
    
    @Override
    public int hashCode() {
        return -599754482;
    }
}
