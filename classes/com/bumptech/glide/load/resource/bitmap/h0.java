// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.util.m;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import android.graphics.Bitmap;
import com.bumptech.glide.load.l;

public final class h0 implements l<Bitmap, Bitmap>
{
    public v<Bitmap> c(@j0 final Bitmap bitmap, final int n, final int n2, @j0 final j j) {
        return new a(bitmap);
    }
    
    public boolean d(@j0 final Bitmap bitmap, @j0 final j j) {
        return true;
    }
    
    private static final class a implements v<Bitmap>
    {
        private final Bitmap G;
        
        a(@j0 final Bitmap g) {
            this.G = g;
        }
        
        @Override
        public void a() {
        }
        
        @j0
        public Bitmap b() {
            return this.G;
        }
        
        @Override
        public int l0() {
            return m.h(this.G);
        }
        
        @j0
        @Override
        public Class<Bitmap> m0() {
            return Bitmap.class;
        }
    }
}
