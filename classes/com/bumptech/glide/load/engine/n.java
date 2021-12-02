// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.util.k;
import com.bumptech.glide.load.j;
import java.util.Map;
import com.bumptech.glide.load.g;

class n implements g
{
    private final Object c;
    private final int d;
    private final int e;
    private final Class<?> f;
    private final Class<?> g;
    private final g h;
    private final Map<Class<?>, com.bumptech.glide.load.n<?>> i;
    private final j j;
    private int k;
    
    n(final Object o, final g g, final int d, final int e, final Map<Class<?>, com.bumptech.glide.load.n<?>> map, final Class<?> clazz, final Class<?> clazz2, final j j) {
        this.c = com.bumptech.glide.util.k.d(o);
        this.h = com.bumptech.glide.util.k.e(g, "Signature must not be null");
        this.d = d;
        this.e = e;
        this.i = com.bumptech.glide.util.k.d(map);
        this.f = com.bumptech.glide.util.k.e(clazz, "Resource class must not be null");
        this.g = com.bumptech.glide.util.k.e(clazz2, "Transcode class must not be null");
        this.j = com.bumptech.glide.util.k.d(j);
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof n;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final n n = (n)o;
            b3 = b2;
            if (this.c.equals(n.c)) {
                b3 = b2;
                if (this.h.equals(n.h)) {
                    b3 = b2;
                    if (this.e == n.e) {
                        b3 = b2;
                        if (this.d == n.d) {
                            b3 = b2;
                            if (this.i.equals(n.i)) {
                                b3 = b2;
                                if (this.f.equals(n.f)) {
                                    b3 = b2;
                                    if (this.g.equals(n.g)) {
                                        b3 = b2;
                                        if (this.j.equals(n.j)) {
                                            b3 = true;
                                        }
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
        if (this.k == 0) {
            final int hashCode = this.c.hashCode();
            this.k = hashCode;
            final int k = hashCode * 31 + this.h.hashCode();
            this.k = k;
            final int i = k * 31 + this.d;
            this.k = i;
            final int j = i * 31 + this.e;
            this.k = j;
            final int l = j * 31 + this.i.hashCode();
            this.k = l;
            final int m = l * 31 + this.f.hashCode();
            this.k = m;
            final int k2 = m * 31 + this.g.hashCode();
            this.k = k2;
            this.k = k2 * 31 + this.j.hashCode();
        }
        return this.k;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EngineKey{model=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        sb.append(this.e);
        sb.append(", resourceClass=");
        sb.append(this.f);
        sb.append(", transcodeClass=");
        sb.append(this.g);
        sb.append(", signature=");
        sb.append(this.h);
        sb.append(", hashCode=");
        sb.append(this.k);
        sb.append(", transformations=");
        sb.append(this.i);
        sb.append(", options=");
        sb.append(this.j);
        sb.append('}');
        return sb.toString();
    }
}
