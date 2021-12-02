// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.prefill;

import androidx.annotation.k0;
import com.bumptech.glide.util.k;
import androidx.annotation.b1;
import android.graphics.Bitmap$Config;

public final class d
{
    @b1
    static final Bitmap$Config e;
    private final int a;
    private final int b;
    private final Bitmap$Config c;
    private final int d;
    
    static {
        e = Bitmap$Config.RGB_565;
    }
    
    d(final int a, final int b, final Bitmap$Config bitmap$Config, final int d) {
        this.c = k.e(bitmap$Config, "Config must not be null");
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    Bitmap$Config a() {
        return this.c;
    }
    
    int b() {
        return this.b;
    }
    
    int c() {
        return this.d;
    }
    
    int d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final d d = (d)o;
            b3 = b2;
            if (this.b == d.b) {
                b3 = b2;
                if (this.a == d.a) {
                    b3 = b2;
                    if (this.d == d.d) {
                        b3 = b2;
                        if (this.c == d.c) {
                            b3 = true;
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c.hashCode()) * 31 + this.d;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PreFillSize{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", weight=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
    
    public static class a
    {
        private final int a;
        private final int b;
        private Bitmap$Config c;
        private int d;
        
        public a(final int n) {
            this(n, n);
        }
        
        public a(final int a, final int b) {
            this.d = 1;
            if (a <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (b > 0) {
                this.a = a;
                this.b = b;
                return;
            }
            throw new IllegalArgumentException("Height must be > 0");
        }
        
        d a() {
            return new d(this.a, this.b, this.c, this.d);
        }
        
        Bitmap$Config b() {
            return this.c;
        }
        
        public a c(@k0 final Bitmap$Config c) {
            this.c = c;
            return this;
        }
        
        public a d(final int d) {
            if (d > 0) {
                this.d = d;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }
    }
}
