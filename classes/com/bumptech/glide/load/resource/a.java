// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource;

import android.annotation.SuppressLint;
import android.util.Size;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import android.os.Build$VERSION;
import android.util.Log;
import android.graphics.ImageDecoder$DecodeException;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.graphics.ImageDecoder$ImageInfo;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.b;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import androidx.annotation.k0;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import com.bumptech.glide.load.resource.bitmap.w;
import androidx.annotation.p0;
import android.graphics.ImageDecoder$Source;
import com.bumptech.glide.load.l;

@p0(api = 28)
public abstract class a<T> implements l<ImageDecoder$Source, T>
{
    private static final String b = "ImageDecoder";
    final w a;
    
    public a() {
        this.a = w.a();
    }
    
    protected abstract v<T> c(final ImageDecoder$Source p0, final int p1, final int p2, final ImageDecoder$OnHeaderDecodedListener p3) throws IOException;
    
    @k0
    public final v<T> d(@j0 final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, @j0 final j j) throws IOException {
        final b b = j.c(q.g);
        final p p4 = j.c(p.h);
        final i<Boolean> k = q.k;
        return this.c(imageDecoder$Source, n, n2, (ImageDecoder$OnHeaderDecodedListener)new ImageDecoder$OnHeaderDecodedListener() {
            final /* synthetic */ boolean c = j.c((i<Object>)k) != null && j.c(k);
            final /* synthetic */ k f = j.c(q.h);
            
            @SuppressLint({ "Override" })
            public void onHeaderDecoded(final ImageDecoder imageDecoder, final ImageDecoder$ImageInfo imageDecoder$ImageInfo, final ImageDecoder$Source imageDecoder$Source) {
                final w a = com.bumptech.glide.load.resource.a.this.a;
                final int a2 = n;
                final int b = n2;
                final boolean c = this.c;
                final boolean b2 = false;
                if (a.c(a2, b, c, false)) {
                    imageDecoder.setAllocator(3);
                }
                else {
                    imageDecoder.setAllocator(1);
                }
                if (b == com.bumptech.glide.load.b.H) {
                    imageDecoder.setMemorySizePolicy(0);
                }
                imageDecoder.setOnPartialImageListener((ImageDecoder$OnPartialImageListener)new ImageDecoder$OnPartialImageListener() {
                    public boolean onPartialImage(@j0 final ImageDecoder$DecodeException ex) {
                        return false;
                    }
                });
                final Size size = imageDecoder$ImageInfo.getSize();
                int n;
                if ((n = n) == Integer.MIN_VALUE) {
                    n = size.getWidth();
                }
                int n2;
                if ((n2 = n2) == Integer.MIN_VALUE) {
                    n2 = size.getHeight();
                }
                final float b3 = p4.b(size.getWidth(), size.getHeight(), n, n2);
                final int round = Math.round(size.getWidth() * b3);
                final int round2 = Math.round(size.getHeight() * b3);
                if (Log.isLoggable("ImageDecoder", 2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Resizing from [");
                    sb.append(size.getWidth());
                    sb.append("x");
                    sb.append(size.getHeight());
                    sb.append("] to [");
                    sb.append(round);
                    sb.append("x");
                    sb.append(round2);
                    sb.append("] scaleFactor: ");
                    sb.append(b3);
                    Log.v("ImageDecoder", sb.toString());
                }
                imageDecoder.setTargetSize(round, round2);
                final int sdk_INT = Build$VERSION.SDK_INT;
                ColorSpace$Named colorSpace$Named = null;
                Label_0379: {
                    if (sdk_INT >= 28) {
                        int n3 = b2 ? 1 : 0;
                        if (this.f == com.bumptech.glide.load.k.H) {
                            n3 = (b2 ? 1 : 0);
                            if (imageDecoder$ImageInfo.getColorSpace() != null) {
                                n3 = (b2 ? 1 : 0);
                                if (imageDecoder$ImageInfo.getColorSpace().isWideGamut()) {
                                    n3 = 1;
                                }
                            }
                        }
                        if (n3 != 0) {
                            colorSpace$Named = ColorSpace$Named.DISPLAY_P3;
                            break Label_0379;
                        }
                    }
                    else if (sdk_INT < 26) {
                        return;
                    }
                    colorSpace$Named = ColorSpace$Named.SRGB;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(colorSpace$Named));
            }
        });
    }
    
    public final boolean e(@j0 final ImageDecoder$Source imageDecoder$Source, @j0 final j j) {
        return true;
    }
}
