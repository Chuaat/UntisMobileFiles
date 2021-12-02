// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.b1;
import androidx.annotation.k0;
import android.graphics.Bitmap$Config;
import com.bumptech.glide.util.m;
import java.util.NavigableMap;
import android.graphics.Bitmap;
import androidx.annotation.p0;

@p0(19)
final class p implements l
{
    private static final int d = 8;
    private final b a;
    private final h<a, Bitmap> b;
    private final NavigableMap<Integer, Integer> c;
    
    p() {
        this.a = new b();
        this.b = new h<a, Bitmap>();
        this.c = new n<Integer, Integer>();
    }
    
    private void e(final Integer n) {
        final Integer n2 = this.c.get(n);
        if (n2 == 1) {
            this.c.remove(n);
        }
        else {
            this.c.put(n, n2 - 1);
        }
    }
    
    static String g(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
    
    private static String h(final Bitmap bitmap) {
        return g(m.h(bitmap));
    }
    
    @Override
    public String a(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return g(m.g(n, n2, bitmap$Config));
    }
    
    @Override
    public int b(final Bitmap bitmap) {
        return m.h(bitmap);
    }
    
    @Override
    public String c(final Bitmap bitmap) {
        return h(bitmap);
    }
    
    @Override
    public void d(final Bitmap bitmap) {
        final a e = this.a.e(m.h(bitmap));
        this.b.d(e, bitmap);
        final Integer n = this.c.get(e.b);
        final NavigableMap<Integer, Integer> c = this.c;
        final int b = e.b;
        int i = 1;
        if (n != null) {
            i = 1 + n;
        }
        c.put(b, i);
    }
    
    @k0
    @Override
    public Bitmap f(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final int g = m.g(n, n2, bitmap$Config);
        final a e = this.a.e(g);
        final Integer n3 = this.c.ceilingKey(g);
        com.bumptech.glide.load.engine.bitmap_recycle.m e2 = e;
        if (n3 != null) {
            e2 = e;
            if (n3 != g) {
                e2 = e;
                if (n3 <= g * 8) {
                    this.a.c(e);
                    e2 = this.a.e(n3);
                }
            }
        }
        final Bitmap bitmap = this.b.a((a)e2);
        if (bitmap != null) {
            bitmap.reconfigure(n, n2, bitmap$Config);
            this.e(n3);
        }
        return bitmap;
    }
    
    @k0
    @Override
    public Bitmap removeLast() {
        final Bitmap bitmap = this.b.f();
        if (bitmap != null) {
            this.e(m.h(bitmap));
        }
        return bitmap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SizeStrategy:\n  ");
        sb.append(this.b);
        sb.append("\n  SortedSizes");
        sb.append(this.c);
        return sb.toString();
    }
    
    @b1
    static final class a implements m
    {
        private final b a;
        int b;
        
        a(final b a) {
            this.a = a;
        }
        
        @Override
        public void a() {
            this.a.c(this);
        }
        
        public void b(final int b) {
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof a;
            boolean b2 = false;
            if (b) {
                final a a = (a)o;
                b2 = b2;
                if (this.b == a.b) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public int hashCode() {
            return this.b;
        }
        
        @Override
        public String toString() {
            return p.g(this.b);
        }
    }
    
    @b1
    static class b extends d<a>
    {
        protected a d() {
            return new a(this);
        }
        
        public a e(final int n) {
            final a a = super.b();
            a.b(n);
            return a;
        }
    }
}
