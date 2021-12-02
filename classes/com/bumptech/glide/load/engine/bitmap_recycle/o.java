// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.b1;
import java.util.Iterator;
import androidx.annotation.k0;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Arrays;
import android.os.Build$VERSION;
import java.util.NavigableMap;
import java.util.Map;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import androidx.annotation.p0;

@p0(19)
public class o implements l
{
    private static final int d = 8;
    private static final Bitmap$Config[] e;
    private static final Bitmap$Config[] f;
    private static final Bitmap$Config[] g;
    private static final Bitmap$Config[] h;
    private static final Bitmap$Config[] i;
    private final c a;
    private final h<b, Bitmap> b;
    private final Map<Bitmap$Config, NavigableMap<Integer, Integer>> c;
    
    static {
        Bitmap$Config[] array;
        final Bitmap$Config[] original = array = new Bitmap$Config[] { Bitmap$Config.ARGB_8888, null };
        if (Build$VERSION.SDK_INT >= 26) {
            array = Arrays.copyOf(original, 3);
            array[array.length - 1] = Bitmap$Config.RGBA_F16;
        }
        e = array;
        f = array;
        g = new Bitmap$Config[] { Bitmap$Config.RGB_565 };
        h = new Bitmap$Config[] { Bitmap$Config.ARGB_4444 };
        i = new Bitmap$Config[] { Bitmap$Config.ALPHA_8 };
    }
    
    public o() {
        this.a = new c();
        this.b = new h<b, Bitmap>();
        this.c = new HashMap<Bitmap$Config, NavigableMap<Integer, Integer>>();
    }
    
    private void e(final Integer obj, final Bitmap bitmap) {
        final NavigableMap<Integer, Integer> j = this.j(bitmap.getConfig());
        final Integer n = j.get(obj);
        if (n != null) {
            if (n == 1) {
                j.remove(obj);
            }
            else {
                j.put(obj, n - 1);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Tried to decrement empty size, size: ");
        sb.append(obj);
        sb.append(", removed: ");
        sb.append(this.c(bitmap));
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }
    
    private b g(final int i, final Bitmap$Config bitmap$Config) {
        final b e = this.a.e(i, bitmap$Config);
        final Bitmap$Config[] j = i(bitmap$Config);
        final int length = j.length;
        int n = 0;
        m e2;
        while (true) {
            e2 = e;
            if (n >= length) {
                break;
            }
            final Bitmap$Config bitmap$Config2 = j[n];
            final Integer n2 = this.j(bitmap$Config2).ceilingKey(i);
            if (n2 != null && n2 <= i * 8) {
                if (n2 == i) {
                    if (bitmap$Config2 == null) {
                        e2 = e;
                        if (bitmap$Config == null) {
                            break;
                        }
                    }
                    else {
                        e2 = e;
                        if (bitmap$Config2.equals((Object)bitmap$Config)) {
                            break;
                        }
                    }
                }
                this.a.c(e);
                e2 = this.a.e(n2, bitmap$Config2);
                break;
            }
            ++n;
        }
        return (b)e2;
    }
    
    static String h(final int i, final Bitmap$Config obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
    
    private static Bitmap$Config[] i(final Bitmap$Config bitmap$Config) {
        if (Build$VERSION.SDK_INT >= 26 && Bitmap$Config.RGBA_F16.equals((Object)bitmap$Config)) {
            return o.f;
        }
        final int n = o$a.a[bitmap$Config.ordinal()];
        if (n == 1) {
            return o.e;
        }
        if (n == 2) {
            return o.g;
        }
        if (n == 3) {
            return o.h;
        }
        if (n != 4) {
            return new Bitmap$Config[] { bitmap$Config };
        }
        return o.i;
    }
    
    private NavigableMap<Integer, Integer> j(final Bitmap$Config bitmap$Config) {
        NavigableMap<Integer, Integer> navigableMap;
        if ((navigableMap = this.c.get(bitmap$Config)) == null) {
            navigableMap = new TreeMap<Integer, Integer>();
            this.c.put(bitmap$Config, navigableMap);
        }
        return navigableMap;
    }
    
    @Override
    public String a(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return h(com.bumptech.glide.util.m.g(n, n2, bitmap$Config), bitmap$Config);
    }
    
    @Override
    public int b(final Bitmap bitmap) {
        return com.bumptech.glide.util.m.h(bitmap);
    }
    
    @Override
    public String c(final Bitmap bitmap) {
        return h(com.bumptech.glide.util.m.h(bitmap), bitmap.getConfig());
    }
    
    @Override
    public void d(final Bitmap bitmap) {
        final b e = this.a.e(com.bumptech.glide.util.m.h(bitmap), bitmap.getConfig());
        this.b.d(e, bitmap);
        final NavigableMap<Integer, Integer> j = this.j(bitmap.getConfig());
        final Integer n = j.get(e.b);
        final int b = e.b;
        int i = 1;
        if (n != null) {
            i = 1 + n;
        }
        j.put(b, i);
    }
    
    @k0
    @Override
    public Bitmap f(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final b g = this.g(com.bumptech.glide.util.m.g(n, n2, bitmap$Config), bitmap$Config);
        final Bitmap bitmap = this.b.a(g);
        if (bitmap != null) {
            this.e(g.b, bitmap);
            bitmap.reconfigure(n, n2, bitmap$Config);
        }
        return bitmap;
    }
    
    @k0
    @Override
    public Bitmap removeLast() {
        final Bitmap bitmap = this.b.f();
        if (bitmap != null) {
            this.e(com.bumptech.glide.util.m.h(bitmap), bitmap);
        }
        return bitmap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        for (final Map.Entry<Bitmap$Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
    
    @b1
    static final class b implements m
    {
        private final c a;
        int b;
        private Bitmap$Config c;
        
        public b(final c a) {
            this.a = a;
        }
        
        @b1
        b(final c c, final int n, final Bitmap$Config bitmap$Config) {
            this(c);
            this.b(n, bitmap$Config);
        }
        
        @Override
        public void a() {
            this.a.c(this);
        }
        
        public void b(final int b, final Bitmap$Config c) {
            this.b = b;
            this.c = c;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof b;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final b b4 = (b)o;
                b3 = b2;
                if (this.b == b4.b) {
                    b3 = b2;
                    if (com.bumptech.glide.util.m.d(this.c, b4.c)) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            final int b = this.b;
            final Bitmap$Config c = this.c;
            int hashCode;
            if (c != null) {
                hashCode = c.hashCode();
            }
            else {
                hashCode = 0;
            }
            return b * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            return o.h(this.b, this.c);
        }
    }
    
    @b1
    static class c extends d<b>
    {
        protected b d() {
            return new b(this);
        }
        
        public b e(final int n, final Bitmap$Config bitmap$Config) {
            final b b = this.b();
            b.b(n, bitmap$Config);
            return b;
        }
    }
}
