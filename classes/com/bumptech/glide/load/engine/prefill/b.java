// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap$Config;
import androidx.annotation.b1;
import java.util.Map;
import java.util.HashMap;
import com.bumptech.glide.util.m;
import android.os.Looper;
import android.os.Handler;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;

public final class b
{
    private final j a;
    private final e b;
    private final com.bumptech.glide.load.b c;
    private final Handler d;
    private a e;
    
    public b(final j a, final e b, final com.bumptech.glide.load.b c) {
        this.d = new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static int b(final d d) {
        return m.g(d.d(), d.b(), d.a());
    }
    
    @b1
    c a(final d... array) {
        final long e = this.a.e();
        final long d = this.a.d();
        final long e2 = this.b.e();
        final int length = array.length;
        final int n = 0;
        int i = 0;
        int n2 = 0;
        while (i < length) {
            n2 += array[i].c();
            ++i;
        }
        final float n3 = (e - d + e2) / (float)n2;
        final HashMap<d, Integer> hashMap = new HashMap<d, Integer>();
        for (int length2 = array.length, j = n; j < length2; ++j) {
            final d d2 = array[j];
            hashMap.put(d2, Math.round(d2.c() * n3) / b(d2));
        }
        return new c(hashMap);
    }
    
    public void c(final d.a... array) {
        final a e = this.e;
        if (e != null) {
            e.b();
        }
        final d[] array2 = new d[array.length];
        for (int i = 0; i < array.length; ++i) {
            final d.a a = array[i];
            if (a.b() == null) {
                Bitmap$Config bitmap$Config;
                if (this.c == com.bumptech.glide.load.b.G) {
                    bitmap$Config = Bitmap$Config.ARGB_8888;
                }
                else {
                    bitmap$Config = Bitmap$Config.RGB_565;
                }
                a.c(bitmap$Config);
            }
            array2[i] = a.a();
        }
        final a e2 = new a(this.b, this.a, this.a(array2));
        this.e = e2;
        this.d.post((Runnable)e2);
    }
}
