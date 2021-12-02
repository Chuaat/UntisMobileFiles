// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.m;
import java.nio.ByteBuffer;
import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.util.h;
import com.bumptech.glide.load.g;

final class x implements g
{
    private static final h<Class<?>, byte[]> k;
    private final b c;
    private final g d;
    private final g e;
    private final int f;
    private final int g;
    private final Class<?> h;
    private final j i;
    private final n<?> j;
    
    static {
        k = new h<Class<?>, byte[]>(50L);
    }
    
    x(final b c, final g d, final g e, final int f, final int g, final n<?> j, final Class<?> h, final j i) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    private byte[] c() {
        final h<Class<?>, byte[]> k = x.k;
        byte[] bytes;
        if ((bytes = k.k(this.h)) == null) {
            bytes = this.h.getName().getBytes(com.bumptech.glide.load.g.b);
            k.o(this.h, bytes);
        }
        return bytes;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        final byte[] array = this.c.c(8, byte[].class);
        ByteBuffer.wrap(array).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(array);
        final n<?> j = this.j;
        if (j != null) {
            j.a(messageDigest);
        }
        this.i.a(messageDigest);
        messageDigest.update(this.c());
        this.c.d(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof x;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final x x = (x)o;
            b3 = b2;
            if (this.g == x.g) {
                b3 = b2;
                if (this.f == x.f) {
                    b3 = b2;
                    if (m.d(this.j, x.j)) {
                        b3 = b2;
                        if (this.h.equals(x.h)) {
                            b3 = b2;
                            if (this.d.equals(x.d)) {
                                b3 = b2;
                                if (this.e.equals(x.e)) {
                                    b3 = b2;
                                    if (this.i.equals(x.i)) {
                                        b3 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        final int n = ((this.d.hashCode() * 31 + this.e.hashCode()) * 31 + this.f) * 31 + this.g;
        final n<?> j = this.j;
        int n2 = n;
        if (j != null) {
            n2 = n * 31 + j.hashCode();
        }
        return (n2 * 31 + this.h.hashCode()) * 31 + this.i.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(this.d);
        sb.append(", signature=");
        sb.append(this.e);
        sb.append(", width=");
        sb.append(this.f);
        sb.append(", height=");
        sb.append(this.g);
        sb.append(", decodedResourceClass=");
        sb.append(this.h);
        sb.append(", transformation='");
        sb.append(this.j);
        sb.append('\'');
        sb.append(", options=");
        sb.append(this.i);
        sb.append('}');
        return sb.toString();
    }
}
