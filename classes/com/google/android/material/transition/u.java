// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import android.os.Build$VERSION;
import android.util.TypedValue;
import androidx.transition.w;
import android.animation.TimeInterpolator;
import com.google.android.material.resources.b;
import android.content.Context;
import androidx.transition.g0;
import androidx.transition.l0;
import com.google.android.material.shape.a;
import androidx.annotation.t;
import android.view.ViewParent;
import androidx.annotation.y;
import android.view.View;
import androidx.annotation.k0;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import androidx.annotation.l;
import com.google.android.material.shape.m;
import com.google.android.material.shape.d;
import androidx.annotation.j0;
import com.google.android.material.shape.o;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.f;

class u
{
    static final int a = -1;
    @f
    static final int b = 0;
    private static final String c = "cubic-bezier";
    private static final String d = "path";
    private static final String e = "(";
    private static final String f = ")";
    private static final int g = 0;
    private static final int h = 1;
    private static final RectF i;
    
    static {
        i = new RectF();
    }
    
    private u() {
    }
    
    static void A(final Canvas canvas, final Rect rect, final float n, final float n2, final float n3, final int n4, final c c) {
        if (n4 <= 0) {
            return;
        }
        final int save = canvas.save();
        canvas.translate(n, n2);
        canvas.scale(n3, n3);
        if (n4 < 255) {
            z(canvas, rect, n4);
        }
        c.a(canvas);
        canvas.restoreToCount(save);
    }
    
    static o B(final o o, final o o2, final RectF rectF, final d d) {
        o o3;
        if (m(o, rectF)) {
            o3 = o;
        }
        else {
            o3 = o2;
        }
        return o3.v().L(d.a(o.r(), o2.r())).Q(d.a(o.t(), o2.t())).y(d.a(o.j(), o2.j())).D(d.a(o.l(), o2.l())).m();
    }
    
    static float a(@j0 final RectF rectF) {
        return rectF.width() * rectF.height();
    }
    
    static o b(final o o, final RectF rectF) {
        return o.y((o.c)new o.c() {
            @j0
            @Override
            public com.google.android.material.shape.d a(@j0 com.google.android.material.shape.d d) {
                if (!(d instanceof m)) {
                    d = new m(d.a(rectF) / rectF.height());
                }
                return d;
            }
        });
    }
    
    static Shader c(@l final int n) {
        return (Shader)new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, n, n, Shader$TileMode.CLAMP);
    }
    
    @j0
    static <T> T d(@k0 T t, @j0 final T t2) {
        if (t == null) {
            t = t2;
        }
        return t;
    }
    
    static View e(View view, @y final int n) {
        final String resourceName = view.getResources().getResourceName(n);
        while (view != null) {
            if (view.getId() == n) {
                return view;
            }
            final ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View)parent;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(resourceName);
        sb.append(" is not a valid ancestor");
        throw new IllegalArgumentException(sb.toString());
    }
    
    static View f(final View view, @y final int n) {
        final View viewById = view.findViewById(n);
        if (viewById != null) {
            return viewById;
        }
        return e(view, n);
    }
    
    private static float g(final String[] array, final int n) {
        final float float1 = Float.parseFloat(array[n]);
        if (float1 >= 0.0f && float1 <= 1.0f) {
            return float1;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Motion easing control point value must be between 0 and 1; instead got: ");
        sb.append(float1);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static String h(final String s, final String s2) {
        return s.substring(s2.length() + 1, s.length() - 1);
    }
    
    static RectF i(final View view) {
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        final int n = array[0];
        final int n2 = array[1];
        return new RectF((float)n, (float)n2, (float)(view.getWidth() + n), (float)(view.getHeight() + n2));
    }
    
    static RectF j(final View view) {
        return new RectF((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom());
    }
    
    static Rect k(final View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
    
    private static boolean l(final String s, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        return s.startsWith(sb.toString()) && s.endsWith(")");
    }
    
    private static boolean m(final o o, final RectF rectF) {
        return o.r().a(rectF) != 0.0f || o.t().a(rectF) != 0.0f || o.l().a(rectF) != 0.0f || o.j().a(rectF) != 0.0f;
    }
    
    static float n(final float n, final float n2, final float n3) {
        return n + n3 * (n2 - n);
    }
    
    static float o(final float n, final float n2, @t(from = 0.0, to = 1.0) final float n3, @t(from = 0.0, to = 1.0) final float n4, @t(from = 0.0, to = 1.0) final float n5) {
        return p(n, n2, n3, n4, n5, false);
    }
    
    static float p(final float n, final float n2, @t(from = 0.0, to = 1.0) final float n3, @t(from = 0.0, to = 1.0) final float n4, @t(from = 0.0) final float n5, final boolean b) {
        if (b && (n5 < 0.0f || n5 > 1.0f)) {
            return n(n, n2, n5);
        }
        if (n5 < n3) {
            return n;
        }
        if (n5 > n4) {
            return n2;
        }
        return n(n, n2, (n5 - n3) / (n4 - n3));
    }
    
    static int q(final int n, final int n2, @t(from = 0.0, to = 1.0) final float n3, @t(from = 0.0, to = 1.0) final float n4, @t(from = 0.0, to = 1.0) final float n5) {
        if (n5 < n3) {
            return n;
        }
        if (n5 > n4) {
            return n2;
        }
        return (int)n((float)n, (float)n2, (n5 - n3) / (n4 - n3));
    }
    
    static o r(final o o, final o o2, final RectF rectF, final RectF rectF2, @t(from = 0.0, to = 1.0) final float n, @t(from = 0.0, to = 1.0) final float n2, @t(from = 0.0, to = 1.0) final float n3) {
        if (n3 < n) {
            return o;
        }
        if (n3 > n2) {
            return o2;
        }
        return B(o, o2, rectF, (d)new d() {
            @j0
            @Override
            public com.google.android.material.shape.d a(@j0 final com.google.android.material.shape.d d, @j0 final com.google.android.material.shape.d d2) {
                return new a(u.o(d.a(rectF), d2.a(rectF2), n, n2, n3));
            }
        });
    }
    
    static void s(final l0 l0, @k0 final g0 g0) {
        if (g0 != null) {
            l0.N0(g0);
        }
    }
    
    static boolean t(final g0 g0, final Context context, @f int e) {
        if (e != 0 && g0.N() == -1L) {
            e = com.google.android.material.resources.b.e(context, e, -1);
            if (e != -1) {
                g0.y0(e);
                return true;
            }
        }
        return false;
    }
    
    static boolean u(final g0 g0, final Context context, @f final int n, final TimeInterpolator timeInterpolator) {
        if (n != 0 && g0.Q() == null) {
            g0.A0(x(context, n, timeInterpolator));
            return true;
        }
        return false;
    }
    
    static boolean v(final g0 g0, final Context context, @f final int n) {
        if (n != 0) {
            final w y = y(context, n);
            if (y != null) {
                g0.C0(y);
                return true;
            }
        }
        return false;
    }
    
    static void w(final l0 l0, @k0 final g0 g0) {
        if (g0 != null) {
            l0.X0(g0);
        }
    }
    
    static TimeInterpolator x(final Context context, @f final int n, @j0 final TimeInterpolator timeInterpolator) {
        final TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(n, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        final String value = String.valueOf(typedValue.string);
        if (l(value, "cubic-bezier")) {
            final String[] split = h(value, "cubic-bezier").split(",");
            if (split.length == 4) {
                return (TimeInterpolator)androidx.core.view.animation.b.b(g(split, 0), g(split, 1), g(split, 2), g(split, 3));
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            sb.append(split.length);
            throw new IllegalArgumentException(sb.toString());
        }
        else {
            if (l(value, "path")) {
                return (TimeInterpolator)androidx.core.view.animation.b.c(androidx.core.graphics.o.e(h(value, "path")));
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid motion easing type: ");
            sb2.append(value);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
    
    @k0
    static w y(final Context context, @f int i) {
        final TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        i = typedValue.type;
        if (i == 16) {
            i = typedValue.data;
            if (i == 0) {
                return null;
            }
            if (i == 1) {
                return new k();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid motion path type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        else {
            if (i == 3) {
                return new androidx.transition.y(androidx.core.graphics.o.e(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }
    
    private static int z(final Canvas canvas, final Rect rect, final int n) {
        final RectF i = u.i;
        i.set(rect);
        if (Build$VERSION.SDK_INT >= 21) {
            return canvas.saveLayerAlpha(i, n);
        }
        return canvas.saveLayerAlpha(i.left, i.top, i.right, i.bottom, n, 31);
    }
    
    interface c
    {
        void a(final Canvas p0);
    }
    
    interface d
    {
        @j0
        com.google.android.material.shape.d a(@j0 final com.google.android.material.shape.d p0, @j0 final com.google.android.material.shape.d p1);
    }
}
