// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.cache;

import android.util.DisplayMetrics;
import com.bumptech.glide.util.k;
import android.text.format.Formatter;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.app.ActivityManager;
import android.util.Log;
import android.content.Context;
import androidx.annotation.b1;

public final class l
{
    private static final String e = "MemorySizeCalculator";
    @b1
    static final int f = 4;
    private static final int g = 2;
    private final int a;
    private final int b;
    private final Context c;
    private final int d;
    
    l(final a a) {
        this.c = a.a;
        int h;
        if (e(a.b)) {
            h = a.h / 2;
        }
        else {
            h = a.h;
        }
        this.d = h;
        final int c = c(a.b, a.f, a.g);
        final float n = (float)(a.c.b() * a.c.a() * 4);
        final int round = Math.round(a.e * n);
        final int round2 = Math.round(n * a.d);
        final int n2 = c - h;
        final int n3 = round2 + round;
        if (n3 <= n2) {
            this.b = round2;
            this.a = round;
        }
        else {
            final float n4 = (float)n2;
            final float e = a.e;
            final float d = a.d;
            final float n5 = n4 / (e + d);
            this.b = Math.round(d * n5);
            this.a = Math.round(n5 * a.e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(this.f(this.b));
            sb.append(", pool size: ");
            sb.append(this.f(this.a));
            sb.append(", byte array size: ");
            sb.append(this.f(h));
            sb.append(", memory class limited? ");
            sb.append(n3 > c);
            sb.append(", max size: ");
            sb.append(this.f(c));
            sb.append(", memoryClass: ");
            sb.append(a.b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(a.b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
    
    private static int c(final ActivityManager activityManager, float n, final float n2) {
        final int memoryClass = activityManager.getMemoryClass();
        final boolean e = e(activityManager);
        final float n3 = (float)(memoryClass * 1024 * 1024);
        if (e) {
            n = n2;
        }
        return Math.round(n3 * n);
    }
    
    @TargetApi(19)
    static boolean e(final ActivityManager activityManager) {
        return Build$VERSION.SDK_INT < 19 || activityManager.isLowRamDevice();
    }
    
    private String f(final int n) {
        return Formatter.formatFileSize(this.c, (long)n);
    }
    
    public int a() {
        return this.d;
    }
    
    public int b() {
        return this.a;
    }
    
    public int d() {
        return this.b;
    }
    
    public static final class a
    {
        @b1
        static final int i = 2;
        static final int j;
        static final float k = 0.4f;
        static final float l = 0.33f;
        static final int m = 4194304;
        final Context a;
        ActivityManager b;
        c c;
        float d;
        float e;
        float f;
        float g;
        int h;
        
        static {
            int i;
            if (Build$VERSION.SDK_INT < 26) {
                i = 4;
            }
            else {
                i = 1;
            }
            j = i;
        }
        
        public a(final Context a) {
            this.d = 2.0f;
            this.e = (float)a.j;
            this.f = 0.4f;
            this.g = 0.33f;
            this.h = 4194304;
            this.a = a;
            this.b = (ActivityManager)a.getSystemService("activity");
            this.c = new b(a.getResources().getDisplayMetrics());
            if (Build$VERSION.SDK_INT >= 26 && com.bumptech.glide.load.engine.cache.l.e(this.b)) {
                this.e = 0.0f;
            }
        }
        
        public l a() {
            return new l(this);
        }
        
        @b1
        a b(final ActivityManager b) {
            this.b = b;
            return this;
        }
        
        public a c(final int h) {
            this.h = h;
            return this;
        }
        
        public a d(final float e) {
            com.bumptech.glide.util.k.a(e >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.e = e;
            return this;
        }
        
        public a e(final float g) {
            com.bumptech.glide.util.k.a(g >= 0.0f && g <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.g = g;
            return this;
        }
        
        public a f(final float f) {
            com.bumptech.glide.util.k.a(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f = f;
            return this;
        }
        
        public a g(final float d) {
            com.bumptech.glide.util.k.a(d >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.d = d;
            return this;
        }
        
        @b1
        a h(final c c) {
            this.c = c;
            return this;
        }
    }
    
    private static final class b implements c
    {
        private final DisplayMetrics a;
        
        b(final DisplayMetrics a) {
            this.a = a;
        }
        
        @Override
        public int a() {
            return this.a.heightPixels;
        }
        
        @Override
        public int b() {
            return this.a.widthPixels;
        }
    }
    
    interface c
    {
        int a();
        
        int b();
    }
}
