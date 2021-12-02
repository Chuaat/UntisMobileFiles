// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.dialog;

import android.widget.AdapterView$OnItemSelectedListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import androidx.annotation.s;
import android.view.Window;
import android.view.View$OnTouchListener;
import android.app.Dialog;
import androidx.annotation.n0;
import android.view.View;
import androidx.annotation.e;
import android.widget.ListAdapter;
import androidx.annotation.w0;
import android.content.DialogInterface$OnClickListener;
import android.database.Cursor;
import android.content.DialogInterface$OnKeyListener;
import android.content.res.Resources$Theme;
import android.util.TypedValue;
import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.google.android.material.shape.j;
import android.content.Context;
import o2.a;
import androidx.annotation.q;
import androidx.annotation.j0;
import android.graphics.Rect;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import androidx.annotation.x0;
import androidx.annotation.f;
import androidx.appcompat.app.d;

public class b extends a
{
    @androidx.annotation.f
    private static final int e;
    @x0
    private static final int f;
    @androidx.annotation.f
    private static final int g;
    @k0
    private Drawable c;
    @j0
    @q
    private final Rect d;
    
    static {
        e = o2.a.c.L;
        f = o2.a.n.y3;
        g = o2.a.c.q9;
    }
    
    public b(@j0 final Context context) {
        this(context, 0);
    }
    
    public b(@j0 final Context context, int e) {
        super(P(context), S(context, e));
        final Context b = ((d.a)this).b();
        final Resources$Theme theme = b.getTheme();
        e = com.google.android.material.dialog.b.e;
        final int f = com.google.android.material.dialog.b.f;
        this.d = com.google.android.material.dialog.c.a(b, e, f);
        final int c = s2.a.c(b, o2.a.c.P2, this.getClass().getCanonicalName());
        final j c2 = new j(b, null, e, f);
        c2.Y(b);
        c2.n0(ColorStateList.valueOf(c));
        if (Build$VERSION.SDK_INT >= 28) {
            final TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            final float dimension = typedValue.getDimension(((d.a)this).b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c2.j0(dimension);
            }
        }
        this.c = c2;
    }
    
    private static Context P(@j0 Context c) {
        final int r = R(c);
        c = com.google.android.material.theme.overlay.a.c(c, null, b.e, b.f);
        if (r == 0) {
            return c;
        }
        return (Context)new androidx.appcompat.view.d(c, r);
    }
    
    private static int R(@j0 final Context context) {
        final TypedValue a = com.google.android.material.resources.b.a(context, b.g);
        if (a == null) {
            return 0;
        }
        return a.data;
    }
    
    private static int S(@j0 final Context context, final int n) {
        int r = n;
        if (n == 0) {
            r = R(context);
        }
        return r;
    }
    
    @j0
    public b A0(@k0 final Cursor cursor, final int n, @j0 final String s, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.G(cursor, n, s, dialogInterface$OnClickListener);
    }
    
    @j0
    public b B0(@k0 final ListAdapter listAdapter, final int n, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.H(listAdapter, n, dialogInterface$OnClickListener);
    }
    
    @j0
    public b C0(@k0 final CharSequence[] array, final int n, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.I(array, n, dialogInterface$OnClickListener);
    }
    
    @j0
    public b D0(@w0 final int n) {
        return (b)super.J(n);
    }
    
    @j0
    public b E0(@k0 final CharSequence charSequence) {
        return (b)super.K(charSequence);
    }
    
    @j0
    public b F0(final int n) {
        return (b)super.L(n);
    }
    
    @j0
    public b G0(@k0 final View view) {
        return (b)super.M(view);
    }
    
    @k0
    public Drawable Q() {
        return this.c;
    }
    
    @j0
    public b T(@k0 final ListAdapter listAdapter, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.c(listAdapter, dialogInterface$OnClickListener);
    }
    
    @j0
    public b U(@k0 final Drawable c) {
        this.c = c;
        return this;
    }
    
    @j0
    public b V(@n0 final int bottom) {
        this.d.bottom = bottom;
        return this;
    }
    
    @j0
    public b W(@n0 final int n) {
        if (Build$VERSION.SDK_INT >= 17 && ((d.a)this).b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.d.left = n;
        }
        else {
            this.d.right = n;
        }
        return this;
    }
    
    @j0
    public b X(@n0 final int n) {
        if (Build$VERSION.SDK_INT >= 17 && ((d.a)this).b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.d.right = n;
        }
        else {
            this.d.left = n;
        }
        return this;
    }
    
    @j0
    public b Y(@n0 final int top) {
        this.d.top = top;
        return this;
    }
    
    @j0
    public b Z(final boolean b) {
        return (b)super.d(b);
    }
    
    @j0
    @Override
    public d a() {
        final d a = super.a();
        final Window window = a.getWindow();
        final View decorView = window.getDecorView();
        final Drawable c = this.c;
        if (c instanceof j) {
            ((j)c).m0(androidx.core.view.j0.P(decorView));
        }
        window.setBackgroundDrawable((Drawable)com.google.android.material.dialog.c.b(this.c, this.d));
        decorView.setOnTouchListener((View$OnTouchListener)new com.google.android.material.dialog.a(a, this.d));
        return a;
    }
    
    @j0
    public b a0(@k0 final Cursor cursor, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener, @j0 final String s) {
        return (b)super.e(cursor, dialogInterface$OnClickListener, s);
    }
    
    @j0
    public b b0(@k0 final View view) {
        return (b)super.f(view);
    }
    
    @j0
    public b c0(@s final int n) {
        return (b)super.g(n);
    }
    
    @j0
    public b d0(@k0 final Drawable drawable) {
        return (b)super.h(drawable);
    }
    
    @j0
    public b e0(@androidx.annotation.f final int n) {
        return (b)super.i(n);
    }
    
    @j0
    public b f0(@e final int n, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.k(n, dialogInterface$OnClickListener);
    }
    
    @j0
    public b g0(@k0 final CharSequence[] array, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.l(array, dialogInterface$OnClickListener);
    }
    
    @j0
    public b h0(@w0 final int n) {
        return (b)super.m(n);
    }
    
    @j0
    public b i0(@k0 final CharSequence charSequence) {
        return (b)super.n(charSequence);
    }
    
    @j0
    public b j0(@e final int n, @k0 final boolean[] array, @k0 final DialogInterface$OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener) {
        return (b)super.o(n, array, dialogInterface$OnMultiChoiceClickListener);
    }
    
    @j0
    public b k0(@k0 final Cursor cursor, @j0 final String s, @j0 final String s2, @k0 final DialogInterface$OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener) {
        return (b)super.p(cursor, s, s2, dialogInterface$OnMultiChoiceClickListener);
    }
    
    @j0
    public b l0(@k0 final CharSequence[] array, @k0 final boolean[] array2, @k0 final DialogInterface$OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener) {
        return (b)super.q(array, array2, dialogInterface$OnMultiChoiceClickListener);
    }
    
    @j0
    public b m0(@w0 final int n, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.r(n, dialogInterface$OnClickListener);
    }
    
    @j0
    public b n0(@k0 final CharSequence charSequence, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.s(charSequence, dialogInterface$OnClickListener);
    }
    
    @j0
    public b o0(@k0 final Drawable drawable) {
        return (b)super.t(drawable);
    }
    
    @j0
    public b p0(@w0 final int n, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.u(n, dialogInterface$OnClickListener);
    }
    
    @j0
    public b q0(@k0 final CharSequence charSequence, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.v(charSequence, dialogInterface$OnClickListener);
    }
    
    @j0
    public b r0(@k0 final Drawable drawable) {
        return (b)super.w(drawable);
    }
    
    @j0
    public b s0(@k0 final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return (b)super.x(dialogInterface$OnCancelListener);
    }
    
    @j0
    public b t0(@k0 final DialogInterface$OnDismissListener dialogInterface$OnDismissListener) {
        return (b)super.y(dialogInterface$OnDismissListener);
    }
    
    @j0
    public b u0(@k0 final AdapterView$OnItemSelectedListener adapterView$OnItemSelectedListener) {
        return (b)super.z(adapterView$OnItemSelectedListener);
    }
    
    @j0
    public b v0(@k0 final DialogInterface$OnKeyListener dialogInterface$OnKeyListener) {
        return (b)super.A(dialogInterface$OnKeyListener);
    }
    
    @j0
    public b w0(@w0 final int n, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.B(n, dialogInterface$OnClickListener);
    }
    
    @j0
    public b x0(@k0 final CharSequence charSequence, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.C(charSequence, dialogInterface$OnClickListener);
    }
    
    @j0
    public b y0(@k0 final Drawable drawable) {
        return (b)super.D(drawable);
    }
    
    @j0
    public b z0(@e final int n, final int n2, @k0 final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return (b)super.F(n, n2, dialogInterface$OnClickListener);
    }
}
