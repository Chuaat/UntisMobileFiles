// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import com.google.android.material.internal.b0;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.j0;

public class k
{
    private k() {
    }
    
    @j0
    static e a(final int n) {
        if (n == 0) {
            return new n();
        }
        if (n != 1) {
            return b();
        }
        return new f();
    }
    
    @j0
    static e b() {
        return new n();
    }
    
    @j0
    static g c() {
        return new g();
    }
    
    public static void d(@j0 final View view, final float n) {
        final Drawable background = view.getBackground();
        if (background instanceof j) {
            ((j)background).m0(n);
        }
    }
    
    public static void e(@j0 final View view) {
        final Drawable background = view.getBackground();
        if (background instanceof j) {
            f(view, (j)background);
        }
    }
    
    public static void f(@j0 final View view, @j0 final j j) {
        if (j.a0()) {
            j.r0(b0.i(view));
        }
    }
}
