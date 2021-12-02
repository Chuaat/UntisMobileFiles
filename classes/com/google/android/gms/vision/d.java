// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision;

import f2.a;
import android.media.Image$Plane;
import androidx.annotation.RecentlyNonNull;
import android.graphics.Color;
import androidx.annotation.RecentlyNullable;
import android.graphics.Bitmap;
import androidx.annotation.p0;
import c6.h;
import java.nio.ByteBuffer;

public class d
{
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    private final b a;
    @h
    private ByteBuffer b;
    @h
    @p0(19)
    private c c;
    @h
    private Bitmap d;
    
    private d() {
        this.a = new b();
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    @RecentlyNullable
    public Bitmap a() {
        return this.d;
    }
    
    @RecentlyNullable
    public ByteBuffer b() {
        final Bitmap d = this.d;
        if (d == null) {
            return this.b;
        }
        if (d == null) {
            return null;
        }
        final int width = d.getWidth();
        final int height = this.d.getHeight();
        final int n = width * height;
        final int[] array = new int[n];
        this.d.getPixels(array, 0, width, 0, 0, width, height);
        final byte[] array2 = new byte[n];
        for (int i = 0; i < n; ++i) {
            array2[i] = (byte)(Color.red(array[i]) * 0.299f + Color.green(array[i]) * 0.587f + Color.blue(array[i]) * 0.114f);
        }
        return ByteBuffer.wrap(array2);
    }
    
    @RecentlyNonNull
    public b c() {
        return this.a;
    }
    
    @RecentlyNullable
    @p0(19)
    @f2.a
    public Image$Plane[] d() {
        final c c = this.c;
        if (c == null) {
            return null;
        }
        return c.a();
    }
    
    public static class a
    {
        private final d a;
        
        public a() {
            this.a = new d(null);
        }
        
        @RecentlyNonNull
        public d a() {
            if (this.a.b == null && this.a.d == null && this.a.c == null) {
                throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.a;
        }
        
        @RecentlyNonNull
        public a b(@RecentlyNonNull final Bitmap bitmap) {
            final int width = bitmap.getWidth();
            final int height = bitmap.getHeight();
            this.a.d = bitmap;
            final b c = this.a.c();
            c.a = width;
            c.b = height;
            return this;
        }
        
        @RecentlyNonNull
        public a c(final int n) {
            this.a.c().c = n;
            return this;
        }
        
        @RecentlyNonNull
        public a d(@RecentlyNonNull final ByteBuffer byteBuffer, final int n, final int n2, final int i) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (byteBuffer.capacity() < n * n2) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            if (i != 16 && i != 17 && i != 842094169) {
                final StringBuilder sb = new StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.b = byteBuffer;
            final b c = this.a.c();
            c.a = n;
            c.b = n2;
            c.f = i;
            return this;
        }
        
        @RecentlyNonNull
        @p0(19)
        @f2.a
        public a e(@RecentlyNonNull final Image$Plane[] array, final int n, final int n2, final int n3) {
            if (array == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (array.length != 3) {
                throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
            }
            if (array[0].getBuffer().capacity() >= n * n2) {
                this.a.c = new c(array);
                final b c = this.a.c();
                c.a = n;
                c.b = n2;
                c.f = n3;
                return this;
            }
            throw new IllegalArgumentException("Invalid image data size.");
        }
        
        @RecentlyNonNull
        public a f(final int n) {
            this.a.c().e = n;
            return this;
        }
        
        @RecentlyNonNull
        public a g(final long n) {
            this.a.c().d = n;
            return this;
        }
    }
    
    public static class b
    {
        private int a;
        private int b;
        private int c;
        private long d;
        private int e;
        private int f;
        
        public b() {
            this.f = -1;
        }
        
        public b(@RecentlyNonNull final b b) {
            this.f = -1;
            this.a = b.f();
            this.b = b.b();
            this.c = b.c();
            this.d = b.e();
            this.e = b.d();
            this.f = b.a();
        }
        
        public int a() {
            return this.f;
        }
        
        public int b() {
            return this.b;
        }
        
        public int c() {
            return this.c;
        }
        
        public int d() {
            return this.e;
        }
        
        public long e() {
            return this.d;
        }
        
        public int f() {
            return this.a;
        }
        
        public final void i() {
            if (this.e % 2 != 0) {
                final int a = this.a;
                this.a = this.b;
                this.b = a;
            }
            this.e = 0;
        }
    }
    
    private static final class c
    {
        private final Image$Plane[] a;
        
        c(final Image$Plane[] a) {
            this.a = a;
        }
        
        final Image$Plane[] a() {
            return this.a;
        }
    }
}
