// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.k0;
import u1.b;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.engine.v;
import androidx.annotation.j0;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap;

public class a implements e<Bitmap, byte[]>
{
    private final Bitmap$CompressFormat a;
    private final int b;
    
    public a() {
        this(Bitmap$CompressFormat.JPEG, 100);
    }
    
    public a(@j0 final Bitmap$CompressFormat a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @k0
    @Override
    public v<byte[]> a(@j0 final v<Bitmap> v, @j0 final j j) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        v.get().compress(this.a, this.b, (OutputStream)byteArrayOutputStream);
        v.a();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
