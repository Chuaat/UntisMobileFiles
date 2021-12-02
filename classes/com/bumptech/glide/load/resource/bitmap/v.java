// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.util.m;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import java.nio.ByteBuffer;
import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.load.g;

public final class v extends h
{
    private static final String g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";
    private static final byte[] h;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    
    static {
        h = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(com.bumptech.glide.load.g.b);
    }
    
    public v(final float c, final float d, final float e, final float f) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        messageDigest.update(v.h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.c).putFloat(this.d).putFloat(this.e).putFloat(this.f).array());
    }
    
    @Override
    protected Bitmap c(@j0 final e e, @j0 final Bitmap bitmap, final int n, final int n2) {
        return g0.p(e, bitmap, this.c, this.d, this.e, this.f);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof v;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final v v = (v)o;
            b3 = b2;
            if (this.c == v.c) {
                b3 = b2;
                if (this.d == v.d) {
                    b3 = b2;
                    if (this.e == v.e) {
                        b3 = b2;
                        if (this.f == v.f) {
                            b3 = true;
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return m.m(this.f, m.m(this.e, m.m(this.d, m.o(-2013597734, m.l(this.c)))));
    }
}
