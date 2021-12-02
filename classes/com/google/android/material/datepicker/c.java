// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import o2.a;
import android.content.Context;
import android.graphics.Paint;
import androidx.annotation.j0;

final class c
{
    @j0
    final b a;
    @j0
    final b b;
    @j0
    final b c;
    @j0
    final b d;
    @j0
    final b e;
    @j0
    final b f;
    @j0
    final b g;
    @j0
    final Paint h;
    
    c(@j0 final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.g(context, o2.a.c.I9, MaterialCalendar.class.getCanonicalName()), o2.a.o.Sk);
        this.a = com.google.android.material.datepicker.b.a(context, obtainStyledAttributes.getResourceId(o2.a.o.Wk, 0));
        this.g = com.google.android.material.datepicker.b.a(context, obtainStyledAttributes.getResourceId(o2.a.o.Uk, 0));
        this.b = com.google.android.material.datepicker.b.a(context, obtainStyledAttributes.getResourceId(o2.a.o.Vk, 0));
        this.c = com.google.android.material.datepicker.b.a(context, obtainStyledAttributes.getResourceId(o2.a.o.Xk, 0));
        final ColorStateList a = com.google.android.material.resources.c.a(context, obtainStyledAttributes, o2.a.o.Zk);
        this.d = com.google.android.material.datepicker.b.a(context, obtainStyledAttributes.getResourceId(o2.a.o.bl, 0));
        this.e = com.google.android.material.datepicker.b.a(context, obtainStyledAttributes.getResourceId(o2.a.o.al, 0));
        this.f = com.google.android.material.datepicker.b.a(context, obtainStyledAttributes.getResourceId(o2.a.o.cl, 0));
        (this.h = new Paint()).setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
