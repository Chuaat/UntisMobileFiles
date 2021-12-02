// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.load.g;

final class d implements g
{
    private final g c;
    private final g d;
    
    d(final g c, final g d) {
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        this.c.a(messageDigest);
        this.d.a(messageDigest);
    }
    
    g c() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final d d = (d)o;
            b3 = b2;
            if (this.c.equals(d.c)) {
                b3 = b2;
                if (this.d.equals(d.d)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode() * 31 + this.d.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DataCacheKey{sourceKey=");
        sb.append(this.c);
        sb.append(", signature=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
