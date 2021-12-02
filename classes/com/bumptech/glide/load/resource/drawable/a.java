// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.drawable;

import androidx.core.content.res.g;
import androidx.core.content.d;
import android.content.res.Resources$NotFoundException;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.content.res.Resources$Theme;
import androidx.annotation.s;
import android.content.Context;

public final class a
{
    private static volatile boolean a = true;
    
    private a() {
    }
    
    public static Drawable a(final Context context, @s final int n, @k0 final Resources$Theme resources$Theme) {
        return c(context, context, n, resources$Theme);
    }
    
    public static Drawable b(final Context context, final Context context2, @s final int n) {
        return c(context, context2, n, null);
    }
    
    private static Drawable c(final Context context, final Context context2, @s final int n, @k0 Resources$Theme theme) {
        try {
            if (com.bumptech.glide.load.resource.drawable.a.a) {
                return e(context2, n, theme);
            }
        }
        catch (Resources$NotFoundException ex2) {}
        catch (IllegalStateException ex) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return d.i(context2, n);
            }
            throw ex;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            com.bumptech.glide.load.resource.drawable.a.a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, n, theme);
    }
    
    private static Drawable d(final Context context, @s final int n, @k0 final Resources$Theme resources$Theme) {
        return g.f(context.getResources(), n, resources$Theme);
    }
    
    private static Drawable e(final Context context, @s final int n, @k0 final Resources$Theme resources$Theme) {
        Object o = context;
        if (resources$Theme != null) {
            o = new androidx.appcompat.view.d(context, resources$Theme);
        }
        return androidx.appcompat.content.res.a.d((Context)o, n);
    }
}
