// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.m;
import androidx.annotation.p0;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.f;
import java.io.InputStream;
import java.util.List;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.ImageHeaderParser;
import androidx.annotation.k0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import java.io.IOException;

interface x
{
    int a() throws IOException;
    
    @k0
    Bitmap b(final BitmapFactory$Options p0) throws IOException;
    
    void c();
    
    ImageHeaderParser.ImageType d() throws IOException;
    
    public static final class a implements x
    {
        private final k a;
        private final com.bumptech.glide.load.engine.bitmap_recycle.b b;
        private final List<ImageHeaderParser> c;
        
        a(final InputStream inputStream, final List<ImageHeaderParser> list, final com.bumptech.glide.load.engine.bitmap_recycle.b b) {
            this.b = com.bumptech.glide.util.k.d(b);
            this.c = com.bumptech.glide.util.k.d(list);
            this.a = new k(inputStream, b);
        }
        
        @Override
        public int a() throws IOException {
            return f.b(this.c, this.a.d(), this.b);
        }
        
        @k0
        @Override
        public Bitmap b(final BitmapFactory$Options bitmapFactory$Options) throws IOException {
            return BitmapFactory.decodeStream(this.a.d(), (Rect)null, bitmapFactory$Options);
        }
        
        @Override
        public void c() {
            this.a.c();
        }
        
        @Override
        public ImageHeaderParser.ImageType d() throws IOException {
            return f.e(this.c, this.a.d(), this.b);
        }
    }
    
    @p0(21)
    public static final class b implements x
    {
        private final com.bumptech.glide.load.engine.bitmap_recycle.b a;
        private final List<ImageHeaderParser> b;
        private final m c;
        
        b(final ParcelFileDescriptor parcelFileDescriptor, final List<ImageHeaderParser> list, final com.bumptech.glide.load.engine.bitmap_recycle.b b) {
            this.a = com.bumptech.glide.util.k.d(b);
            this.b = com.bumptech.glide.util.k.d(list);
            this.c = new m(parcelFileDescriptor);
        }
        
        @Override
        public int a() throws IOException {
            return f.a(this.b, this.c, this.a);
        }
        
        @k0
        @Override
        public Bitmap b(final BitmapFactory$Options bitmapFactory$Options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.d().getFileDescriptor(), (Rect)null, bitmapFactory$Options);
        }
        
        @Override
        public void c() {
        }
        
        @Override
        public ImageHeaderParser.ImageType d() throws IOException {
            return f.d(this.b, this.c, this.a);
        }
    }
}
