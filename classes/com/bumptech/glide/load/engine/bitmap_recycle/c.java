// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.b1;
import com.bumptech.glide.util.m;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

class c implements l
{
    private final b a;
    private final h<a, Bitmap> b;
    
    c() {
        this.a = new b();
        this.b = new h<a, Bitmap>();
    }
    
    static String e(final int i, final int j, final Bitmap$Config obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("x");
        sb.append(j);
        sb.append("], ");
        sb.append(obj);
        return sb.toString();
    }
    
    private static String g(final Bitmap bitmap) {
        return e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }
    
    @Override
    public String a(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return e(n, n2, bitmap$Config);
    }
    
    @Override
    public int b(final Bitmap bitmap) {
        return m.h(bitmap);
    }
    
    @Override
    public String c(final Bitmap bitmap) {
        return g(bitmap);
    }
    
    @Override
    public void d(final Bitmap bitmap) {
        this.b.d(this.a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }
    
    @Override
    public Bitmap f(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return this.b.a(this.a.e(n, n2, bitmap$Config));
    }
    
    @Override
    public Bitmap removeLast() {
        return this.b.f();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AttributeStrategy:\n  ");
        sb.append(this.b);
        return sb.toString();
    }
    
    @b1
    static class a implements m
    {
        private final b a;
        private int b;
        private int c;
        private Bitmap$Config d;
        
        public a(final b a) {
            this.a = a;
        }
        
        @Override
        public void a() {
            this.a.c(this);
        }
        
        public void b(final int b, final int c, final Bitmap$Config d) {
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof a;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final a a = (a)o;
                b3 = b2;
                if (this.b == a.b) {
                    b3 = b2;
                    if (this.c == a.c) {
                        b3 = b2;
                        if (this.d == a.d) {
                            b3 = true;
                        }
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            final int b = this.b;
            final int c = this.c;
            final Bitmap$Config d = this.d;
            int hashCode;
            if (d != null) {
                hashCode = d.hashCode();
            }
            else {
                hashCode = 0;
            }
            return (b * 31 + c) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            return com.bumptech.glide.load.engine.bitmap_recycle.c.e(this.b, this.c, this.d);
        }
    }
    
    @b1
    static class b extends d<a>
    {
        protected a d() {
            return new a(this);
        }
        
        a e(final int n, final int n2, final Bitmap$Config bitmap$Config) {
            final a a = this.b();
            a.b(n, n2, bitmap$Config);
            return a;
        }
    }
}
