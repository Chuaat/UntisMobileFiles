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

public class d0 extends h
{
    private static final String d = "com.bumptech.glide.load.resource.bitmap.Rotate";
    private static final byte[] e;
    private final int c;
    
    static {
        e = "com.bumptech.glide.load.resource.bitmap.Rotate".getBytes(g.b);
    }
    
    public d0(final int c) {
        this.c = c;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        messageDigest.update(d0.e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }
    
    @Override
    protected Bitmap c(@j0 final e e, @j0 final Bitmap bitmap, final int n, final int n2) {
        return g0.n(bitmap, this.c);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d0;
        boolean b2 = false;
        if (b) {
            final d0 d0 = (d0)o;
            b2 = b2;
            if (this.c == d0.c) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return m.o(-950519196, m.n(this.c));
    }
}
