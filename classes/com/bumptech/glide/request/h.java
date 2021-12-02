// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request;

import androidx.annotation.t;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.b;
import android.graphics.drawable.Drawable;
import androidx.annotation.s;
import android.graphics.Bitmap$CompressFormat;
import com.bumptech.glide.load.resource.bitmap.p;
import android.graphics.Bitmap;
import com.bumptech.glide.load.n;
import androidx.annotation.b0;
import androidx.annotation.j;
import androidx.annotation.j0;
import androidx.annotation.k0;

public class h extends a<h>
{
    @k0
    private static h B0;
    @k0
    private static h C0;
    @k0
    private static h D0;
    @k0
    private static h E0;
    @k0
    private static h F0;
    @k0
    private static h G0;
    @k0
    private static h H0;
    @k0
    private static h I0;
    
    @j0
    @j
    public static h A1(final boolean b) {
        if (b) {
            if (h.B0 == null) {
                h.B0 = new h().O0(true).b();
            }
            return h.B0;
        }
        if (h.C0 == null) {
            h.C0 = new h().O0(false).b();
        }
        return h.C0;
    }
    
    @j0
    @j
    public static h B1(@b0(from = 0L) final int n) {
        return new h().Q0(n);
    }
    
    @j0
    @j
    public static h a1(@j0 final n<Bitmap> n) {
        return new h().R0(n);
    }
    
    @j0
    @j
    public static h b1() {
        if (h.F0 == null) {
            h.F0 = new h().c().b();
        }
        return h.F0;
    }
    
    @j0
    @j
    public static h c1() {
        if (h.E0 == null) {
            h.E0 = new h().f().b();
        }
        return h.E0;
    }
    
    @j0
    @j
    public static h d1() {
        if (h.G0 == null) {
            h.G0 = new h().r().b();
        }
        return h.G0;
    }
    
    @j0
    @j
    public static h e1(@j0 final Class<?> clazz) {
        return new h().u(clazz);
    }
    
    @j0
    @j
    public static h f1(@j0 final com.bumptech.glide.load.engine.j j) {
        return new h().w(j);
    }
    
    @j0
    @j
    public static h h1(@j0 final p p) {
        return new h().z(p);
    }
    
    @j0
    @j
    public static h i1(@j0 final Bitmap$CompressFormat bitmap$CompressFormat) {
        return new h().A(bitmap$CompressFormat);
    }
    
    @j0
    @j
    public static h j1(@b0(from = 0L, to = 100L) final int n) {
        return new h().B(n);
    }
    
    @j0
    @j
    public static h k1(@s final int n) {
        return new h().C(n);
    }
    
    @j0
    @j
    public static h l1(@k0 final Drawable drawable) {
        return new h().D(drawable);
    }
    
    @j0
    @j
    public static h m1() {
        if (h.D0 == null) {
            h.D0 = new h().H().b();
        }
        return h.D0;
    }
    
    @j0
    @j
    public static h n1(@j0 final b b) {
        return new h().I(b);
    }
    
    @j0
    @j
    public static h o1(@b0(from = 0L) final long n) {
        return new h().J(n);
    }
    
    @j0
    @j
    public static h p1() {
        if (h.I0 == null) {
            h.I0 = new h().x().b();
        }
        return h.I0;
    }
    
    @j0
    @j
    public static h r1() {
        if (h.H0 == null) {
            h.H0 = new h().y().b();
        }
        return h.H0;
    }
    
    @j0
    @j
    public static <T> h s1(@j0 final i<T> i, @j0 final T t) {
        return new h().L0(i, t);
    }
    
    @j0
    @j
    public static h t1(final int n) {
        return u1(n, n);
    }
    
    @j0
    @j
    public static h u1(final int n, final int n2) {
        return new h().D0(n, n2);
    }
    
    @j0
    @j
    public static h v1(@s final int n) {
        return new h().E0(n);
    }
    
    @j0
    @j
    public static h w1(@k0 final Drawable drawable) {
        return new h().F0(drawable);
    }
    
    @j0
    @j
    public static h x1(@j0 final com.bumptech.glide.h h) {
        return new h().G0(h);
    }
    
    @j0
    @j
    public static h y1(@j0 final g g) {
        return new h().M0(g);
    }
    
    @j0
    @j
    public static h z1(@t(from = 0.0, to = 1.0) final float n) {
        return new h().N0(n);
    }
}
