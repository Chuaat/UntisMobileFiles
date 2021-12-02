// 
// Decompiled by Procyon v0.5.36
// 

package es.dmoral.toasty;

import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.NinePatchDrawable;
import androidx.annotation.l;
import android.os.Build$VERSION;
import android.view.View;
import androidx.appcompat.content.res.a;
import android.graphics.drawable.Drawable;
import androidx.annotation.s;
import androidx.annotation.n;
import androidx.annotation.j0;
import android.content.Context;

final class d
{
    private d() {
    }
    
    static int a(@j0 final Context context, @n final int n) {
        return androidx.core.content.d.f(context, n);
    }
    
    static Drawable b(@j0 final Context context, @s final int n) {
        return a.d(context, n);
    }
    
    static void c(@j0 final View view, final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        }
        else {
            view.setBackgroundDrawable(drawable);
        }
    }
    
    static Drawable d(@j0 final Context context, @l final int n) {
        return e(b(context, b.f.K0), n);
    }
    
    static Drawable e(@j0 final Drawable drawable, @l final int n) {
        drawable.setColorFilter(n, PorterDuff$Mode.SRC_IN);
        return drawable;
    }
}
