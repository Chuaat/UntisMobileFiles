// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.load.g;

public class n extends h
{
    private static final int c = 1;
    private static final String d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
    private static final byte[] e;
    
    static {
        e = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(g.b);
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        messageDigest.update(n.e);
    }
    
    @Override
    protected Bitmap c(@j0 final e e, @j0 final Bitmap bitmap, final int n, final int n2) {
        return g0.d(e, bitmap, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof n;
    }
    
    @Override
    public int hashCode() {
        return 1101716364;
    }
}
