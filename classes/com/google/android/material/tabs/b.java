// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.tabs;

import com.google.android.material.animation.a;
import android.graphics.drawable.Drawable;
import androidx.annotation.t;
import com.google.android.material.internal.b0;
import androidx.annotation.j0;
import android.graphics.RectF;
import androidx.annotation.k0;
import android.view.View;
import androidx.annotation.q;

class b
{
    @q(unit = 0)
    private static final int a = 24;
    
    static RectF a(final TabLayout tabLayout, @k0 final View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.C() && view instanceof TabLayout.n) {
            return b((TabLayout.n)view, 24);
        }
        return new RectF((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom());
    }
    
    static RectF b(@j0 final TabLayout.n n, @q(unit = 0) int n2) {
        final int contentWidth = n.getContentWidth();
        final int contentHeight = n.getContentHeight();
        final int n3 = (int)b0.e(n.getContext(), n2);
        n2 = contentWidth;
        if (contentWidth < n3) {
            n2 = n3;
        }
        final int n4 = (n.getLeft() + n.getRight()) / 2;
        final int n5 = (n.getTop() + n.getBottom()) / 2;
        n2 /= 2;
        return new RectF((float)(n4 - n2), (float)(n5 - contentHeight / 2), (float)(n2 + n4), (float)(n5 + n4 / 2));
    }
    
    void c(final TabLayout tabLayout, final View view, final View view2, @t(from = 0.0, to = 1.0) final float n, @j0 final Drawable drawable) {
        final RectF a = a(tabLayout, view);
        final RectF a2 = a(tabLayout, view2);
        drawable.setBounds(com.google.android.material.animation.a.c((int)a.left, (int)a2.left, n), drawable.getBounds().top, com.google.android.material.animation.a.c((int)a.right, (int)a2.right, n), drawable.getBounds().bottom);
    }
    
    void d(final TabLayout tabLayout, final View view, @j0 final Drawable drawable) {
        final RectF a = a(tabLayout, view);
        drawable.setBounds((int)a.left, drawable.getBounds().top, (int)a.right, drawable.getBounds().bottom);
    }
}
