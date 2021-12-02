// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.signature;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.bumptech.glide.load.g;

public class d implements g
{
    @j0
    private final String c;
    private final long d;
    private final int e;
    
    public d(@k0 final String s, final long d, final int e) {
        String c = s;
        if (s == null) {
            c = "";
        }
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.d).putInt(this.e).array());
        messageDigest.update(this.c.getBytes(g.b));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final d d = (d)o;
            return this.d == d.d && this.e == d.e && this.c.equals(d.c);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.c.hashCode();
        final long d = this.d;
        return (hashCode * 31 + (int)(d ^ d >>> 32)) * 31 + this.e;
    }
}
