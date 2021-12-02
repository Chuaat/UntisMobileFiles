// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import androidx.annotation.j0;
import java.io.IOException;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.resource.bitmap.b0;
import java.io.InputStream;

public final class k implements e<InputStream>
{
    private static final int b = 5242880;
    private final b0 a;
    
    public k(final InputStream inputStream, final b b) {
        (this.a = new b0(inputStream, b)).mark(5242880);
    }
    
    @Override
    public void b() {
        this.a.release();
    }
    
    public void c() {
        this.a.b();
    }
    
    @j0
    public InputStream d() throws IOException {
        this.a.reset();
        return this.a;
    }
    
    public static final class a implements e.a<InputStream>
    {
        private final b a;
        
        public a(final b a) {
            this.a = a;
        }
        
        @j0
        @Override
        public Class<InputStream> a() {
            return InputStream.class;
        }
        
        @j0
        public e<InputStream> c(final InputStream inputStream) {
            return new k(inputStream, this.a);
        }
    }
}
