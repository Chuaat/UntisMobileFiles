// 
// Decompiled by Procyon v0.5.36
// 

package s2;

import androidx.annotation.t;
import android.view.View;
import android.util.TypedValue;
import com.google.android.material.resources.b;
import androidx.annotation.f;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.graphics.h;
import android.graphics.Color;
import androidx.annotation.b0;
import androidx.annotation.l;

public class a
{
    public static final float a = 1.0f;
    public static final float b = 0.54f;
    public static final float c = 0.38f;
    public static final float d = 0.32f;
    public static final float e = 0.12f;
    
    private a() {
    }
    
    @l
    public static int a(@l final int n, @b0(from = 0L, to = 255L) final int n2) {
        return h.B(n, Color.alpha(n) * n2 / 255);
    }
    
    @l
    public static int b(@j0 final Context context, @f final int n, @l final int n2) {
        final TypedValue a = com.google.android.material.resources.b.a(context, n);
        if (a != null) {
            return a.data;
        }
        return n2;
    }
    
    @l
    public static int c(final Context context, @f final int n, final String s) {
        return com.google.android.material.resources.b.g(context, n, s);
    }
    
    @l
    public static int d(@j0 final View view, @f final int n) {
        return com.google.android.material.resources.b.h(view, n);
    }
    
    @l
    public static int e(@j0 final View view, @f final int n, @l final int n2) {
        return b(view.getContext(), n, n2);
    }
    
    public static boolean f(@l final int n) {
        return n != 0 && h.m(n) > 0.5;
    }
    
    @l
    public static int g(@l final int n, @l final int n2) {
        return h.t(n2, n);
    }
    
    @l
    public static int h(@l final int n, @l final int n2, @t(from = 0.0, to = 1.0) final float n3) {
        return g(n, h.B(n2, Math.round(Color.alpha(n2) * n3)));
    }
    
    @l
    public static int i(@j0 final View view, @f final int n, @f final int n2) {
        return j(view, n, n2, 1.0f);
    }
    
    @l
    public static int j(@j0 final View view, @f final int n, @f final int n2, @t(from = 0.0, to = 1.0) final float n3) {
        return h(d(view, n), d(view, n2), n3);
    }
}
