// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.view.ViewParent;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.j0;
import android.view.ViewGroup;
import android.graphics.RectF;
import android.graphics.Matrix;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class c
{
    private static final ThreadLocal<Matrix> a;
    private static final ThreadLocal<RectF> b;
    
    static {
        a = new ThreadLocal<Matrix>();
        b = new ThreadLocal<RectF>();
    }
    
    public static void a(@j0 final ViewGroup viewGroup, @j0 final View view, @j0 final Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        c(viewGroup, view, rect);
    }
    
    private static void b(final ViewParent viewParent, @j0 final View view, @j0 final Matrix matrix) {
        final ViewParent parent = view.getParent();
        if (parent instanceof View && parent != viewParent) {
            final View view2 = (View)parent;
            b(viewParent, view2, matrix);
            matrix.preTranslate((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
        }
        matrix.preTranslate((float)view.getLeft(), (float)view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
    
    public static void c(@j0 final ViewGroup viewGroup, @j0 final View view, @j0 final Rect rect) {
        final ThreadLocal<Matrix> a = c.a;
        Matrix value = a.get();
        if (value == null) {
            value = new Matrix();
            a.set(value);
        }
        else {
            value.reset();
        }
        b((ViewParent)viewGroup, view, value);
        final ThreadLocal<RectF> b = c.b;
        RectF value2;
        if ((value2 = b.get()) == null) {
            value2 = new RectF();
            b.set(value2);
        }
        value2.set(rect);
        value.mapRect(value2);
        rect.set((int)(value2.left + 0.5f), (int)(value2.top + 0.5f), (int)(value2.right + 0.5f), (int)(value2.bottom + 0.5f));
    }
}
