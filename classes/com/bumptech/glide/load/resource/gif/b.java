// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.j0;
import android.graphics.Bitmap$Config;
import androidx.annotation.k0;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.gifdecoder.a;

public final class b implements a
{
    private final e a;
    @k0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b b;
    
    public b(final e e) {
        this(e, null);
    }
    
    public b(final e a, @k0 final com.bumptech.glide.load.engine.bitmap_recycle.b b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    @Override
    public Bitmap a(final int n, final int n2, @j0 final Bitmap$Config bitmap$Config) {
        return this.a.g(n, n2, bitmap$Config);
    }
    
    @j0
    @Override
    public int[] b(final int n) {
        final com.bumptech.glide.load.engine.bitmap_recycle.b b = this.b;
        if (b == null) {
            return new int[n];
        }
        return b.f(n, int[].class);
    }
    
    @Override
    public void c(@j0 final Bitmap bitmap) {
        this.a.d(bitmap);
    }
    
    @Override
    public void d(@j0 final byte[] array) {
        final com.bumptech.glide.load.engine.bitmap_recycle.b b = this.b;
        if (b == null) {
            return;
        }
        b.d(array);
    }
    
    @j0
    @Override
    public byte[] e(final int n) {
        final com.bumptech.glide.load.engine.bitmap_recycle.b b = this.b;
        if (b == null) {
            return new byte[n];
        }
        return b.f(n, byte[].class);
    }
    
    @Override
    public void f(@j0 final int[] array) {
        final com.bumptech.glide.load.engine.bitmap_recycle.b b = this.b;
        if (b == null) {
            return;
        }
        b.d(array);
    }
}
