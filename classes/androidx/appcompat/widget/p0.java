// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.content.res.TypedArray;
import androidx.annotation.k0;
import androidx.core.graphics.h;
import android.graphics.Color;
import android.util.AttributeSet;
import android.content.res.ColorStateList;
import android.util.Log;
import c.a;
import android.content.Context;
import androidx.annotation.j0;
import android.view.View;
import android.util.TypedValue;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class p0
{
    private static final String a = "ThemeUtils";
    private static final ThreadLocal<TypedValue> b;
    static final int[] c;
    static final int[] d;
    static final int[] e;
    static final int[] f;
    static final int[] g;
    static final int[] h;
    static final int[] i;
    static final int[] j;
    private static final int[] k;
    
    static {
        b = new ThreadLocal<TypedValue>();
        c = new int[] { -16842910 };
        d = new int[] { 16842908 };
        e = new int[] { 16843518 };
        f = new int[] { 16842919 };
        g = new int[] { 16842912 };
        h = new int[] { 16842913 };
        i = new int[] { -16842919, -16842908 };
        j = new int[0];
        k = new int[1];
    }
    
    private p0() {
    }
    
    public static void a(@j0 final View view, @j0 Context obtainStyledAttributes) {
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(c.a.n.f1);
        try {
            if (!((TypedArray)obtainStyledAttributes).hasValue(c.a.n.t3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    @j0
    public static ColorStateList b(final int n, final int n2) {
        return new ColorStateList(new int[][] { p0.c, p0.j }, new int[] { n2, n });
    }
    
    public static int c(@j0 final Context context, final int n) {
        final ColorStateList f = f(context, n);
        if (f != null && f.isStateful()) {
            return f.getColorForState(p0.c, f.getDefaultColor());
        }
        final TypedValue g = g();
        context.getTheme().resolveAttribute(16842803, g, true);
        return e(context, n, g.getFloat());
    }
    
    public static int d(@j0 final Context context, int c) {
        final int[] k = p0.k;
        k[0] = c;
        final u0 f = u0.F(context, null, k);
        try {
            c = f.c(0, 0);
            return c;
        }
        finally {
            f.I();
        }
    }
    
    static int e(@j0 final Context context, int d, final float n) {
        d = d(context, d);
        return androidx.core.graphics.h.B(d, Math.round(Color.alpha(d) * n));
    }
    
    @k0
    public static ColorStateList f(@j0 Context f, final int n) {
        final int[] k = p0.k;
        k[0] = n;
        f = (Context)u0.F(f, null, k);
        try {
            return ((u0)f).d(0);
        }
        finally {
            ((u0)f).I();
        }
    }
    
    private static TypedValue g() {
        final ThreadLocal<TypedValue> b = p0.b;
        TypedValue value;
        if ((value = b.get()) == null) {
            value = new TypedValue();
            b.set(value);
        }
        return value;
    }
}
