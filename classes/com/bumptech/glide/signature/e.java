// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.signature;

import java.security.MessageDigest;
import com.bumptech.glide.util.k;
import androidx.annotation.j0;
import com.bumptech.glide.load.g;

public final class e implements g
{
    private final Object c;
    
    public e(@j0 final Object o) {
        this.c = k.d(o);
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        messageDigest.update(this.c.toString().getBytes(g.b));
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof e && this.c.equals(((e)o).c);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ObjectKey{object=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
