// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.badge;

import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.b1;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.material.internal.k;
import android.content.Context;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.material.internal.u;
import androidx.annotation.y;
import androidx.appcompat.widget.Toolbar;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.widget.FrameLayout;
import android.view.View;
import androidx.annotation.j0;
import android.os.Build$VERSION;

@c
public class b
{
    public static final boolean a;
    private static final String b = "BadgeUtils";
    
    static {
        a = (Build$VERSION.SDK_INT < 18);
    }
    
    private b() {
    }
    
    public static void a(@j0 final a a, @j0 final View view) {
        b(a, view, null);
    }
    
    public static void b(@j0 final a foreground, @j0 final View view, @k0 final FrameLayout frameLayout) {
        j(foreground, view, frameLayout);
        if (foreground.p() != null) {
            foreground.p().setForeground((Drawable)foreground);
        }
        else {
            if (com.google.android.material.badge.b.a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add((Drawable)foreground);
        }
    }
    
    public static void c(@j0 final a a, @j0 final Toolbar toolbar, @y final int n) {
        d(a, toolbar, n, null);
    }
    
    public static void d(@j0 final a a, @j0 final Toolbar toolbar, @y final int n, @k0 final FrameLayout frameLayout) {
        toolbar.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final ActionMenuItemView a = u.a(toolbar, n);
                if (a != null) {
                    com.google.android.material.badge.b.k(a, toolbar.getResources());
                    com.google.android.material.badge.b.b(a, (View)a, frameLayout);
                }
            }
        });
    }
    
    @j0
    public static SparseArray<a> e(final Context context, @j0 final k k) {
        final SparseArray sparseArray = new SparseArray(k.size());
        for (int i = 0; i < k.size(); ++i) {
            final int key = k.keyAt(i);
            final a.c c = (a.c)k.valueAt(i);
            if (c == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(key, (Object)com.google.android.material.badge.a.g(context, c));
        }
        return (SparseArray<a>)sparseArray;
    }
    
    @j0
    public static k f(@j0 final SparseArray<a> sparseArray) {
        final k k = new k();
        for (int i = 0; i < sparseArray.size(); ++i) {
            final int key = sparseArray.keyAt(i);
            final a a = (a)sparseArray.valueAt(i);
            if (a == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            k.put(key, (Object)a.t());
        }
        return k;
    }
    
    public static void g(@k0 final a a, @j0 final View view) {
        if (a == null) {
            return;
        }
        if (!com.google.android.material.badge.b.a && a.p() == null) {
            view.getOverlay().remove((Drawable)a);
        }
        else {
            a.p().setForeground((Drawable)null);
        }
    }
    
    public static void h(@k0 final a a, @j0 final Toolbar toolbar, @y final int i) {
        if (a == null) {
            return;
        }
        final ActionMenuItemView a2 = u.a(toolbar, i);
        if (a2 != null) {
            i(a);
            g(a, (View)a2);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Trying to remove badge from a null menuItemView: ");
            sb.append(i);
            Log.w("BadgeUtils", sb.toString());
        }
    }
    
    @b1
    static void i(final a a) {
        a.z(0);
        a.A(0);
    }
    
    public static void j(@j0 final a a, @j0 final View view, @k0 final FrameLayout frameLayout) {
        final Rect bounds = new Rect();
        view.getDrawingRect(bounds);
        a.setBounds(bounds);
        a.S(view, frameLayout);
    }
    
    @b1
    static void k(final a a, final Resources resources) {
        a.z(resources.getDimensionPixelOffset(a.f.R2));
        a.A(resources.getDimensionPixelOffset(a.f.S2));
    }
    
    public static void l(@j0 final Rect rect, final float n, final float n2, final float n3, final float n4) {
        rect.set((int)(n - n3), (int)(n2 - n4), (int)(n + n3), (int)(n2 + n4));
    }
}
