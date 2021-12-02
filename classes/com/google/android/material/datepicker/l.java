// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.view.View$OnTouchListener;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.material.dialog.c;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import com.google.android.material.shape.j;
import com.google.android.material.resources.b;
import androidx.annotation.k0;
import android.app.DatePickerDialog$OnDateSetListener;
import android.content.Context;
import o2.a;
import android.graphics.Rect;
import androidx.annotation.j0;
import android.graphics.drawable.Drawable;
import androidx.annotation.x0;
import androidx.annotation.f;
import androidx.annotation.t0;
import android.app.DatePickerDialog;

@t0({ t0.a.H, t0.a.K })
public class l extends DatePickerDialog
{
    @f
    private static final int I = 16843612;
    @x0
    private static final int J;
    @j0
    private final Drawable G;
    @j0
    private final Rect H;
    
    static {
        J = a.n.B3;
    }
    
    public l(@j0 final Context context) {
        this(context, 0);
    }
    
    public l(@j0 final Context context, final int n) {
        this(context, n, null, -1, -1, -1);
    }
    
    public l(@j0 final Context context, int g, @k0 final DatePickerDialog$OnDateSetListener datePickerDialog$OnDateSetListener, int j, final int n, final int n2) {
        super(context, g, datePickerDialog$OnDateSetListener, j, n, n2);
        final Context context2 = this.getContext();
        g = b.g(this.getContext(), a.c.P2, this.getClass().getCanonicalName());
        j = l.J;
        final j i = new j(context2, null, 16843612, j);
        if (Build$VERSION.SDK_INT < 21) {
            g = 0;
        }
        i.n0(ColorStateList.valueOf(g));
        final Rect a = c.a(context2, 16843612, j);
        this.H = a;
        this.G = (Drawable)c.b(i, a);
    }
    
    public l(@j0 final Context context, @k0 final DatePickerDialog$OnDateSetListener datePickerDialog$OnDateSetListener, final int n, final int n2, final int n3) {
        this(context, 0, datePickerDialog$OnDateSetListener, n, n2, n3);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.getWindow().setBackgroundDrawable(this.G);
        this.getWindow().getDecorView().setOnTouchListener((View$OnTouchListener)new com.google.android.material.dialog.a((Dialog)this, this.H));
    }
}
