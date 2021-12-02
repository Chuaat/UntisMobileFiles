// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.os.Build$VERSION;
import com.bumptech.glide.load.i;

public abstract class p
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final i<p> h;
    static final boolean i;
    
    static {
        a = new a();
        b = new b();
        c = new e();
        d = new c();
        final p g2 = e = new d();
        f = new f();
        g = g2;
        h = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", g2);
        i = (Build$VERSION.SDK_INT >= 19);
    }
    
    public abstract g a(final int p0, final int p1, final int p2, final int p3);
    
    public abstract float b(final int p0, final int p1, final int p2, final int p3);
    
    private static class a extends p
    {
        a() {
        }
        
        @Override
        public g a(final int n, final int n2, final int n3, final int n4) {
            return p.g.H;
        }
        
        @Override
        public float b(int min, final int n, final int n2, final int n3) {
            min = Math.min(n / n3, min / n2);
            float n4 = 1.0f;
            if (min != 0) {
                n4 = 1.0f / Integer.highestOneBit(min);
            }
            return n4;
        }
    }
    
    private static class b extends p
    {
        b() {
        }
        
        @Override
        public g a(final int n, final int n2, final int n3, final int n4) {
            return p.g.G;
        }
        
        @Override
        public float b(int n, int b, int i, final int n2) {
            i = (int)Math.ceil(Math.max(b / (float)n2, n / (float)i));
            b = Integer.highestOneBit(i);
            n = 1;
            b = Math.max(1, b);
            if (b >= i) {
                n = 0;
            }
            return 1.0f / (b << n);
        }
    }
    
    private static class c extends p
    {
        c() {
        }
        
        @Override
        public g a(final int n, final int n2, final int n3, final int n4) {
            g g;
            if (this.b(n, n2, n3, n4) == 1.0f) {
                g = p.g.H;
            }
            else {
                g = p.c.a(n, n2, n3, n4);
            }
            return g;
        }
        
        @Override
        public float b(final int n, final int n2, final int n3, final int n4) {
            return Math.min(1.0f, p.c.b(n, n2, n3, n4));
        }
    }
    
    private static class d extends p
    {
        d() {
        }
        
        @Override
        public g a(final int n, final int n2, final int n3, final int n4) {
            return p.g.H;
        }
        
        @Override
        public float b(final int n, final int n2, final int n3, final int n4) {
            return Math.max(n3 / (float)n, n4 / (float)n2);
        }
    }
    
    private static class e extends p
    {
        e() {
        }
        
        @Override
        public g a(final int n, final int n2, final int n3, final int n4) {
            if (p.i) {
                return p.g.H;
            }
            return p.g.G;
        }
        
        @Override
        public float b(int max, final int n, final int n2, final int n3) {
            if (p.i) {
                return Math.min(n2 / (float)max, n3 / (float)n);
            }
            max = Math.max(n / n3, max / n2);
            float n4 = 1.0f;
            if (max != 0) {
                n4 = 1.0f / Integer.highestOneBit(max);
            }
            return n4;
        }
    }
    
    private static class f extends p
    {
        f() {
        }
        
        @Override
        public g a(final int n, final int n2, final int n3, final int n4) {
            return p.g.H;
        }
        
        @Override
        public float b(final int n, final int n2, final int n3, final int n4) {
            return 1.0f;
        }
    }
    
    public enum g
    {
        G, 
        H;
    }
}
