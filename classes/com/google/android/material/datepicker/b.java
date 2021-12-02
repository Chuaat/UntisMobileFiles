// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.view.View;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import com.google.android.material.shape.j;
import android.widget.TextView;
import android.content.res.TypedArray;
import com.google.android.material.resources.c;
import o2.a;
import androidx.annotation.x0;
import android.content.Context;
import androidx.core.util.n;
import com.google.android.material.shape.o;
import android.content.res.ColorStateList;
import androidx.annotation.j0;
import android.graphics.Rect;

final class b
{
    @j0
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final o f;
    
    private b(final ColorStateList c, final ColorStateList b, final ColorStateList d, final int e, final o f, @j0 final Rect a) {
        n.d(a.left);
        n.d(a.top);
        n.d(a.right);
        n.d(a.bottom);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @j0
    static b a(@j0 final Context context, @x0 int dimensionPixelSize) {
        n.b(dimensionPixelSize != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(dimensionPixelSize, a.o.dl);
        final Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(a.o.el, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.gl, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.fl, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.hl, 0));
        final ColorStateList a = c.a(context, obtainStyledAttributes, o2.a.o.il);
        final ColorStateList a2 = c.a(context, obtainStyledAttributes, o2.a.o.nl);
        final ColorStateList a3 = c.a(context, obtainStyledAttributes, o2.a.o.ll);
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.ml, 0);
        final o m = o.b(context, obtainStyledAttributes.getResourceId(o2.a.o.jl, 0), obtainStyledAttributes.getResourceId(o2.a.o.kl, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a, a2, a3, dimensionPixelSize, m, rect);
    }
    
    int b() {
        return this.a.bottom;
    }
    
    int c() {
        return this.a.left;
    }
    
    int d() {
        return this.a.right;
    }
    
    int e() {
        return this.a.top;
    }
    
    void f(@j0 final TextView textView) {
        Object o = new j();
        final j j = new j();
        ((j)o).setShapeAppearanceModel(this.f);
        j.setShapeAppearanceModel(this.f);
        ((j)o).n0(this.c);
        ((j)o).D0((float)this.e, this.d);
        textView.setTextColor(this.b);
        if (Build$VERSION.SDK_INT >= 21) {
            o = new RippleDrawable(this.b.withAlpha(30), (Drawable)o, (Drawable)j);
        }
        final Rect a = this.a;
        androidx.core.view.j0.G1((View)textView, (Drawable)new InsetDrawable((Drawable)o, a.left, a.top, a.right, a.bottom));
    }
}
