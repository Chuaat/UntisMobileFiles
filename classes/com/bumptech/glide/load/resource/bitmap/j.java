// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.util.a;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import androidx.annotation.j0;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.l;

public class j implements l<ByteBuffer, Bitmap>
{
    private final q a;
    
    public j(final q a) {
        this.a = a;
    }
    
    public v<Bitmap> c(@j0 final ByteBuffer byteBuffer, final int n, final int n2, @j0 final com.bumptech.glide.load.j j) throws IOException {
        return this.a.f(com.bumptech.glide.util.a.f(byteBuffer), n, n2, j);
    }
    
    public boolean d(@j0 final ByteBuffer byteBuffer, @j0 final com.bumptech.glide.load.j j) {
        return this.a.q(byteBuffer);
    }
}
