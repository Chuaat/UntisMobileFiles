// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.util.m;
import java.util.Queue;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.util.Log;
import android.graphics.Bitmap;
import com.bumptech.glide.load.n;
import android.graphics.Bitmap$Config;
import com.bumptech.glide.util.g;
import com.bumptech.glide.load.j;
import com.bumptech.glide.gifdecoder.d;
import androidx.annotation.b1;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
import android.content.Context;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.l;

public class a implements l<ByteBuffer, c>
{
    private static final String f = "BufferGifDecoder";
    private static final a g;
    private static final b h;
    private final Context a;
    private final List<ImageHeaderParser> b;
    private final b c;
    private final a d;
    private final com.bumptech.glide.load.resource.gif.b e;
    
    static {
        g = new a();
        h = new b();
    }
    
    public a(final Context context) {
        this(context, com.bumptech.glide.b.d(context).m().g(), com.bumptech.glide.b.d(context).g(), com.bumptech.glide.b.d(context).f());
    }
    
    public a(final Context context, final List<ImageHeaderParser> list, final e e, final com.bumptech.glide.load.engine.bitmap_recycle.b b) {
        this(context, list, e, b, com.bumptech.glide.load.resource.gif.a.h, com.bumptech.glide.load.resource.gif.a.g);
    }
    
    @b1
    a(final Context context, final List<ImageHeaderParser> b, final e e, final com.bumptech.glide.load.engine.bitmap_recycle.b b2, final b c, final a d) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.d = d;
        this.e = new com.bumptech.glide.load.resource.gif.b(e, b2);
        this.c = c;
    }
    
    @k0
    private com.bumptech.glide.load.resource.gif.e c(final ByteBuffer byteBuffer, final int n, final int n2, final d d, final j j) {
        final long b = com.bumptech.glide.util.g.b();
        try {
            final com.bumptech.glide.gifdecoder.c d2 = d.d();
            if (d2.b() <= 0 || d2.c() != 0) {
                return null;
            }
            Bitmap$Config bitmap$Config;
            if (j.c(i.a) == com.bumptech.glide.load.b.H) {
                bitmap$Config = Bitmap$Config.RGB_565;
            }
            else {
                bitmap$Config = Bitmap$Config.ARGB_8888;
            }
            final a a = this.d.a(this.e, d2, byteBuffer, e(d2, n, n2));
            a.o(bitmap$Config);
            a.k();
            final Bitmap i = a.j();
            if (i == null) {
                return null;
            }
            return new com.bumptech.glide.load.resource.gif.e(new c(this.a, a, (n<Bitmap>)com.bumptech.glide.load.resource.c.c(), n, n2, i));
        }
        finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Decoded GIF from stream in ");
                sb.append(com.bumptech.glide.util.g.a(b));
                Log.v("BufferGifDecoder", sb.toString());
            }
        }
    }
    
    private static int e(final com.bumptech.glide.gifdecoder.c c, final int i, final int j) {
        final int min = Math.min(c.a() / j, c.d() / i);
        int highestOneBit;
        if (min == 0) {
            highestOneBit = 0;
        }
        else {
            highestOneBit = Integer.highestOneBit(min);
        }
        final int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(j);
            sb.append("], actual dimens: [");
            sb.append(c.d());
            sb.append("x");
            sb.append(c.a());
            sb.append("]");
            Log.v("BufferGifDecoder", sb.toString());
        }
        return max;
    }
    
    public com.bumptech.glide.load.resource.gif.e d(@j0 final ByteBuffer byteBuffer, final int n, final int n2, @j0 final j j) {
        final d a = this.c.a(byteBuffer);
        try {
            return this.c(byteBuffer, n, n2, a, j);
        }
        finally {
            this.c.b(a);
        }
    }
    
    public boolean f(@j0 final ByteBuffer byteBuffer, @j0 final j j) throws IOException {
        return !j.c(i.b) && com.bumptech.glide.load.f.f(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
    
    @b1
    static class a
    {
        com.bumptech.glide.gifdecoder.a a(final com.bumptech.glide.gifdecoder.a.a a, final com.bumptech.glide.gifdecoder.c c, final ByteBuffer byteBuffer, final int n) {
            return new com.bumptech.glide.gifdecoder.f(a, c, byteBuffer, n);
        }
    }
    
    @b1
    static class b
    {
        private final Queue<d> a;
        
        b() {
            this.a = m.f(0);
        }
        
        d a(final ByteBuffer byteBuffer) {
            synchronized (this) {
                d d;
                if ((d = this.a.poll()) == null) {
                    d = new d();
                }
                return d.q(byteBuffer);
            }
        }
        
        void b(final d d) {
            synchronized (this) {
                d.a();
                this.a.offer(d);
            }
        }
    }
}
