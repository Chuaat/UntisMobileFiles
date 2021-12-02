// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.tabs;

import android.graphics.RectF;
import androidx.annotation.j0;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.t;

class a extends b
{
    private static float e(@t(from = 0.0, to = 1.0) final float n) {
        return (float)(1.0 - Math.cos(n * 3.141592653589793 / 2.0));
    }
    
    private static float f(@t(from = 0.0, to = 1.0) final float n) {
        return (float)Math.sin(n * 3.141592653589793 / 2.0);
    }
    
    @Override
    void c(final TabLayout tabLayout, final View view, final View view2, float n, @j0 final Drawable drawable) {
        final RectF a = b.a(tabLayout, view);
        final RectF a2 = b.a(tabLayout, view2);
        float n2;
        if (a.left < a2.left) {
            n2 = e(n);
            n = f(n);
        }
        else {
            n2 = f(n);
            n = e(n);
        }
        drawable.setBounds(com.google.android.material.animation.a.c((int)a.left, (int)a2.left, n2), drawable.getBounds().top, com.google.android.material.animation.a.c((int)a.right, (int)a2.right, n), drawable.getBounds().bottom);
    }
}
