// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.io.IOException;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import android.os.ParcelFileDescriptor;
import android.annotation.TargetApi;
import android.util.Log;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.media.MediaMetadataRetriever;
import androidx.annotation.p0;
import android.content.res.AssetFileDescriptor;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.i;
import androidx.annotation.b1;
import android.graphics.Bitmap;
import com.bumptech.glide.load.l;

public class j0<T> implements l<T, Bitmap>
{
    private static final String d = "VideoDecoder";
    public static final long e = -1L;
    @b1
    static final int f = 2;
    public static final i<Long> g;
    public static final i<Integer> h;
    private static final e i;
    private final f<T> a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.e b;
    private final e c;
    
    static {
        g = com.bumptech.glide.load.i.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, (i.b<Long>)new i.b<Long>() {
            private final ByteBuffer a = ByteBuffer.allocate(8);
            
            public void b(@androidx.annotation.j0 final byte[] input, @androidx.annotation.j0 final Long n, @androidx.annotation.j0 final MessageDigest messageDigest) {
                messageDigest.update(input);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putLong(n).array());
                }
            }
        });
        h = com.bumptech.glide.load.i.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, (i.b<Integer>)new i.b<Integer>() {
            private final ByteBuffer a = ByteBuffer.allocate(4);
            
            public void b(@androidx.annotation.j0 final byte[] input, @androidx.annotation.j0 final Integer n, @androidx.annotation.j0 final MessageDigest messageDigest) {
                if (n == null) {
                    return;
                }
                messageDigest.update(input);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(n).array());
                }
            }
        });
        i = new e();
    }
    
    j0(final com.bumptech.glide.load.engine.bitmap_recycle.e e, final f<T> f) {
        this(e, f, j0.i);
    }
    
    @b1
    j0(final com.bumptech.glide.load.engine.bitmap_recycle.e b, final f<T> a, final e c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public static l<AssetFileDescriptor, Bitmap> c(final com.bumptech.glide.load.engine.bitmap_recycle.e e) {
        return new j0<AssetFileDescriptor>(e, (f<AssetFileDescriptor>)new c());
    }
    
    @p0(api = 23)
    public static l<ByteBuffer, Bitmap> d(final com.bumptech.glide.load.engine.bitmap_recycle.e e) {
        return new j0<ByteBuffer>(e, (f<ByteBuffer>)new d());
    }
    
    @k0
    private static Bitmap e(final MediaMetadataRetriever mediaMetadataRetriever, final long n, final int n2, final int n3, final int n4, final p p6) {
        Bitmap g;
        if (Build$VERSION.SDK_INT >= 27 && n3 != Integer.MIN_VALUE && n4 != Integer.MIN_VALUE && p6 != p.f) {
            g = g(mediaMetadataRetriever, n, n2, n3, n4, p6);
        }
        else {
            g = null;
        }
        Bitmap f = g;
        if (g == null) {
            f = f(mediaMetadataRetriever, n, n2);
        }
        return f;
    }
    
    private static Bitmap f(final MediaMetadataRetriever mediaMetadataRetriever, final long n, final int n2) {
        return mediaMetadataRetriever.getFrameAtTime(n, n2);
    }
    
    @TargetApi(27)
    private static Bitmap g(final MediaMetadataRetriever mediaMetadataRetriever, final long n, final int n2, final int n3, final int n4, final p p6) {
        try {
            final int int1 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            final int int2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            final int int3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            int n5 = 0;
            int n6 = 0;
            Label_0064: {
                if (int3 != 90) {
                    n5 = int1;
                    n6 = int2;
                    if (int3 != 270) {
                        break Label_0064;
                    }
                }
                n6 = int1;
                n5 = int2;
            }
            final float b = p6.b(n5, n6, n3, n4);
            return mediaMetadataRetriever.getScaledFrameAtTime(n, n2, Math.round(n5 * b), Math.round(b * n6));
        }
        finally {
            if (Log.isLoggable("VideoDecoder", 3)) {
                final Throwable t;
                Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", t);
            }
            return null;
        }
    }
    
    public static l<ParcelFileDescriptor, Bitmap> h(final com.bumptech.glide.load.engine.bitmap_recycle.e e) {
        return new j0<ParcelFileDescriptor>(e, (f<ParcelFileDescriptor>)new g());
    }
    
    @Override
    public boolean a(@androidx.annotation.j0 final T t, @androidx.annotation.j0 final j j) {
        return true;
    }
    
    @Override
    public v<Bitmap> b(@androidx.annotation.j0 final T t, final int n, final int n2, @androidx.annotation.j0 final j j) throws IOException {
        final long longValue = j.c(j0.g);
        if (longValue < 0L && longValue != -1L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
        Integer value;
        if ((value = j.c(j0.h)) == null) {
            value = 2;
        }
        p g;
        if ((g = j.c(p.h)) == null) {
            g = p.g;
        }
        final MediaMetadataRetriever a = this.c.a();
        try {
            try {
                this.a.a(a, t);
                final Bitmap e = e(a, longValue, value, n, n2, g);
                a.release();
                return com.bumptech.glide.load.resource.bitmap.g.d(e, this.b);
            }
            finally {}
        }
        catch (RuntimeException cause) {
            throw new IOException(cause);
        }
        a.release();
    }
    
    private static final class c implements f<AssetFileDescriptor>
    {
        public void b(final MediaMetadataRetriever mediaMetadataRetriever, final AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }
    
    @p0(23)
    static final class d implements f<ByteBuffer>
    {
        public void b(final MediaMetadataRetriever mediaMetadataRetriever, final ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource((MediaDataSource)new MediaDataSource() {
                public void close() {
                }
                
                public long getSize() {
                    return byteBuffer.limit();
                }
                
                public int readAt(final long n, final byte[] dst, final int offset, int min) {
                    if (n >= byteBuffer.limit()) {
                        return -1;
                    }
                    byteBuffer.position((int)n);
                    min = Math.min(min, byteBuffer.remaining());
                    byteBuffer.get(dst, offset, min);
                    return min;
                }
            });
        }
    }
    
    @b1
    static class e
    {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }
    
    @b1
    interface f<T>
    {
        void a(final MediaMetadataRetriever p0, final T p1);
    }
    
    static final class g implements f<ParcelFileDescriptor>
    {
        public void b(final MediaMetadataRetriever mediaMetadataRetriever, final ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }
}
