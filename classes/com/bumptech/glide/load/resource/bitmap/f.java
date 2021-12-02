// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;
import android.util.Log;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.v;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$Source;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import androidx.annotation.p0;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.a;

@p0(api = 28)
public final class f extends a<Bitmap>
{
    private static final String d = "BitmapImageDecoder";
    private final e c;
    
    public f() {
        this.c = new com.bumptech.glide.load.engine.bitmap_recycle.f();
    }
    
    @Override
    protected v<Bitmap> c(final ImageDecoder$Source imageDecoder$Source, final int i, final int j, final ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException {
        final Bitmap decodeBitmap = ImageDecoder.decodeBitmap(imageDecoder$Source, imageDecoder$OnHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(decodeBitmap.getWidth());
            sb.append("x");
            sb.append(decodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append("x");
            sb.append(j);
            sb.append("]");
            Log.v("BitmapImageDecoder", sb.toString());
        }
        return new g(decodeBitmap, this.c);
    }
}
