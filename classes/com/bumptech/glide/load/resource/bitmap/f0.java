// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.util.i;
import com.bumptech.glide.util.d;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import android.graphics.Bitmap;
import java.io.InputStream;
import com.bumptech.glide.load.l;

public class f0 implements l<InputStream, Bitmap>
{
    private final q a;
    private final b b;
    
    public f0(final q a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public v<Bitmap> c(@j0 InputStream inputStream, final int n, final int n2, @j0 final j j) throws IOException {
        boolean b;
        if (inputStream instanceof b0) {
            inputStream = inputStream;
            b = false;
        }
        else {
            inputStream = new b0(inputStream, this.b);
            b = true;
        }
        final d c = d.c(inputStream);
        final i i = new i(c);
        final a a = new a((b0)inputStream, c);
        try {
            return this.a.g(i, n, n2, j, (q.b)a);
        }
        finally {
            c.release();
            if (b) {
                ((b0)inputStream).release();
            }
        }
    }
    
    public boolean d(@j0 final InputStream inputStream, @j0 final j j) {
        return this.a.p(inputStream);
    }
    
    static class a implements b
    {
        private final b0 a;
        private final d b;
        
        a(final b0 a, final d b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void a(final e e, final Bitmap bitmap) throws IOException {
            final IOException b = this.b.b();
            if (b != null) {
                if (bitmap != null) {
                    e.d(bitmap);
                }
                throw b;
            }
        }
        
        @Override
        public void b() {
            this.a.b();
        }
    }
}
