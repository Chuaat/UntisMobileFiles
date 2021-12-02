// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.theme.overlay;

import androidx.appcompat.view.d;
import androidx.annotation.f;
import androidx.annotation.k0;
import androidx.annotation.x0;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;

public class a
{
    private static final int[] a;
    private static final int[] b;
    
    static {
        a = new int[] { 16842752, o2.a.c.Je };
        b = new int[] { o2.a.c.O9 };
    }
    
    private a() {
    }
    
    @x0
    private static int a(@j0 final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, com.google.android.material.theme.overlay.a.a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        final int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        return resourceId;
    }
    
    @x0
    private static int b(@j0 final Context context, @k0 final AttributeSet set, @f int resourceId, @x0 final int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, com.google.android.material.theme.overlay.a.b, resourceId, n);
        resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
    
    @j0
    public static Context c(@j0 final Context context, @k0 final AttributeSet set, @f int a, @x0 int b) {
        b = b(context, set, a, b);
        if (context instanceof d && ((d)context).c() == b) {
            a = 1;
        }
        else {
            a = 0;
        }
        if (b != 0 && a == 0) {
            final d d = new d(context, b);
            a = a(context, set);
            if (a != 0) {
                ((Context)d).getTheme().applyStyle(a, true);
            }
            return (Context)d;
        }
        return context;
    }
}
