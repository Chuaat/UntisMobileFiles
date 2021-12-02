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
import com.bumptech.glide.util.k;
import com.bumptech.glide.load.g;

public final class e0 extends h
{
    private static final String d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";
    private static final byte[] e;
    private final int c;
    
    static {
        e = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(g.b);
    }
    
    public e0(final int c) {
        k.a(c > 0, "roundingRadius must be greater than 0.");
        this.c = c;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        messageDigest.update(e0.e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }
    
    @Override
    protected Bitmap c(@j0 final e e, @j0 final Bitmap bitmap, final int n, final int n2) {
        return g0.q(e, bitmap, this.c);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof e0;
        boolean b2 = false;
        if (b) {
            final e0 e0 = (e0)o;
            b2 = b2;
            if (this.c == e0.c) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return m.o(-569625254, m.n(this.c));
    }
}
