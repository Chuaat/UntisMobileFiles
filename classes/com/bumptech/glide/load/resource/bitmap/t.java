// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import java.io.InputStream;
import java.io.IOException;
import com.bumptech.glide.util.a;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import androidx.annotation.j0;
import java.nio.ByteBuffer;
import androidx.annotation.p0;
import com.bumptech.glide.load.ImageHeaderParser;

@p0(27)
public final class t implements ImageHeaderParser
{
    @j0
    @Override
    public ImageType a(@j0 final ByteBuffer byteBuffer) {
        return ImageType.UNKNOWN;
    }
    
    @Override
    public int b(@j0 final ByteBuffer byteBuffer, @j0 final b b) throws IOException {
        return this.d(com.bumptech.glide.util.a.f(byteBuffer), b);
    }
    
    @j0
    @Override
    public ImageType c(@j0 final InputStream inputStream) {
        return ImageType.UNKNOWN;
    }
    
    @Override
    public int d(@j0 final InputStream inputStream, @j0 final b b) throws IOException {
        int l;
        if ((l = new androidx.exifinterface.media.a(inputStream).l("Orientation", 1)) == 0) {
            l = -1;
        }
        return l;
    }
}
