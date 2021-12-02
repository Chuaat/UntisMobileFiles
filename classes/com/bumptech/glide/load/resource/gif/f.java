// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.v;
import android.content.Context;
import androidx.annotation.j0;
import java.security.MessageDigest;
import com.bumptech.glide.util.k;
import android.graphics.Bitmap;
import com.bumptech.glide.load.n;

public class f implements n<c>
{
    private final n<Bitmap> c;
    
    public f(final n<Bitmap> n) {
        this.c = k.d(n);
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        this.c.a(messageDigest);
    }
    
    @j0
    @Override
    public v<c> b(@j0 final Context context, @j0 final v<c> v, final int n, final int n2) {
        final c c = v.get();
        final com.bumptech.glide.load.resource.bitmap.g g = new com.bumptech.glide.load.resource.bitmap.g(c.h(), com.bumptech.glide.b.d(context).g());
        final v<Bitmap> b = this.c.b(context, g, n, n2);
        if (!g.equals(b)) {
            g.a();
        }
        c.r(this.c, b.get());
        return v;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof f && this.c.equals(((f)o).c);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
}
