// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.resources;

import android.view.View;
import o2.a;
import androidx.annotation.n0;
import androidx.annotation.p;
import androidx.annotation.k0;
import android.util.TypedValue;
import androidx.annotation.f;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b
{
    @k0
    public static TypedValue a(@j0 final Context context, @f final int n) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
    
    public static boolean b(@j0 final Context context, @f final int n, final boolean b) {
        final TypedValue a = a(context, n);
        boolean b2 = b;
        if (a != null) {
            b2 = b;
            if (a.type == 18) {
                b2 = (a.data != 0);
            }
        }
        return b2;
    }
    
    public static boolean c(@j0 final Context context, @f final int n, @j0 final String s) {
        return g(context, n, s) != 0;
    }
    
    @n0
    public static int d(@j0 final Context context, @f final int n, @p final int n2) {
        final TypedValue a = a(context, n);
        float n3;
        if (a != null && a.type == 5) {
            n3 = a.getDimension(context.getResources().getDisplayMetrics());
        }
        else {
            n3 = context.getResources().getDimension(n2);
        }
        return (int)n3;
    }
    
    public static int e(@j0 final Context context, @f int data, final int n) {
        final TypedValue a = a(context, data);
        data = n;
        if (a != null) {
            data = n;
            if (a.type == 16) {
                data = a.data;
            }
        }
        return data;
    }
    
    @n0
    public static int f(@j0 final Context context) {
        return d(context, a.c.ga, a.f.e5);
    }
    
    public static int g(@j0 final Context context, @f final int n, @j0 final String s) {
        final TypedValue a = a(context, n);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", s, context.getResources().getResourceName(n)));
    }
    
    public static int h(@j0 final View view, @f final int n) {
        return g(view.getContext(), n, view.getClass().getCanonicalName());
    }
}
