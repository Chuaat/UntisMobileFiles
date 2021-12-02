// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load;

import java.io.InputStream;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.io.IOException;
import androidx.annotation.j0;
import java.nio.ByteBuffer;

public interface ImageHeaderParser
{
    public static final int a = -1;
    
    @j0
    ImageType a(@j0 final ByteBuffer p0) throws IOException;
    
    int b(@j0 final ByteBuffer p0, @j0 final b p1) throws IOException;
    
    @j0
    ImageType c(@j0 final InputStream p0) throws IOException;
    
    int d(@j0 final InputStream p0, @j0 final b p1) throws IOException;
    
    public enum ImageType
    {
        GIF(true), 
        JPEG(false), 
        PNG(false), 
        PNG_A(true), 
        RAW(false), 
        UNKNOWN(false), 
        WEBP(false), 
        WEBP_A(true);
        
        private final boolean G;
        
        private ImageType(final boolean g) {
            this.G = g;
        }
        
        public boolean hasAlpha() {
            return this.G;
        }
    }
}
