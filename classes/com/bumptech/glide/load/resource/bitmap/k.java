// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import androidx.annotation.k0;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import androidx.annotation.p0;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.l;

@p0(api = 28)
public final class k implements l<ByteBuffer, Bitmap>
{
    private final f a;
    
    public k() {
        this.a = new f();
    }
    
    @k0
    public v<Bitmap> c(@j0 final ByteBuffer byteBuffer, final int n, final int n2, @j0 final j j) throws IOException {
        return this.a.d(ImageDecoder.createSource(byteBuffer), n, n2, j);
    }
    
    public boolean d(@j0 final ByteBuffer byteBuffer, @j0 final j j) throws IOException {
        return true;
    }
}
