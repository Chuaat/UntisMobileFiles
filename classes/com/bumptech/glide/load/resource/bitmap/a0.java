// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.k0;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import androidx.annotation.p0;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.l;

@p0(21)
public final class a0 implements l<ParcelFileDescriptor, Bitmap>
{
    private final q a;
    
    public a0(final q a) {
        this.a = a;
    }
    
    @k0
    public v<Bitmap> c(@j0 final ParcelFileDescriptor parcelFileDescriptor, final int n, final int n2, @j0 final j j) throws IOException {
        return this.a.d(parcelFileDescriptor, n, n2, j);
    }
    
    public boolean d(@j0 final ParcelFileDescriptor parcelFileDescriptor, @j0 final j j) {
        return this.a.o(parcelFileDescriptor);
    }
}
