// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.builder;

import com.flask.colorpicker.g;
import com.flask.colorpicker.f;
import android.content.DialogInterface$OnClickListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.flask.colorpicker.i;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter$AllCaps;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.content.DialogInterface;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import com.flask.colorpicker.h;
import android.content.Context;
import android.widget.EditText;
import com.flask.colorpicker.slider.c;
import com.flask.colorpicker.e;
import android.widget.LinearLayout;
import androidx.appcompat.app.d;

public class b
{
    private d.a a;
    private LinearLayout b;
    private e c;
    private c d;
    private com.flask.colorpicker.slider.b e;
    private EditText f;
    private LinearLayout g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private Integer[] n;
    
    private b(final Context context) {
        this(context, 0);
    }
    
    private b(final Context context, int m) {
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = false;
        this.l = 1;
        this.m = 0;
        this.n = new Integer[] { null, null, null, null, null };
        this.m = e(context, com.flask.colorpicker.h.e.B0);
        final int e = e(context, com.flask.colorpicker.h.e.C0);
        this.a = new d.a(context, m);
        (this.b = new LinearLayout(context)).setOrientation(1);
        this.b.setGravity(1);
        final LinearLayout b = this.b;
        m = this.m;
        b.setPadding(m, e, m, m);
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, 0);
        linearLayout$LayoutParams.weight = 1.0f;
        final e c = new e(context);
        this.c = c;
        this.b.addView((View)c, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        this.a.M((View)this.b);
    }
    
    public static b B(final Context context) {
        return new b(context);
    }
    
    public static b C(final Context context, final int n) {
        return new b(context, n);
    }
    
    private static int e(final Context context, final int n) {
        return (int)(context.getResources().getDimension(n) + 0.5f);
    }
    
    private int f(final Integer[] array) {
        final Integer g = this.g(array);
        int intValue;
        if (g == null) {
            intValue = -1;
        }
        else {
            intValue = array[g];
        }
        return intValue;
    }
    
    private Integer g(final Integer[] array) {
        int i = 0;
        Integer n = 0;
        while (i < array.length) {
            if (array[i] == null) {
                return n;
            }
            n = ++i / 2;
        }
        return n;
    }
    
    private void l(final DialogInterface dialogInterface, final a a) {
        a.a(dialogInterface, this.c.getSelectedColor(), this.c.getAllColors());
    }
    
    public b A(final e.c c) {
        this.c.setRenderer(c.a(c));
        return this;
    }
    
    public b b() {
        this.h = false;
        this.i = true;
        return this;
    }
    
    public d c() {
        final Context b = this.a.b();
        final e c = this.c;
        final Integer[] n = this.n;
        c.k(n, this.g(n));
        if (this.h) {
            (this.d = new c(b)).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, e(b, com.flask.colorpicker.h.e.A0)));
            this.b.addView((View)this.d);
            this.c.setLightnessSlider(this.d);
            this.d.setColor(this.f(this.n));
        }
        if (this.i) {
            (this.e = new com.flask.colorpicker.slider.b(b)).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, e(b, com.flask.colorpicker.h.e.A0)));
            this.b.addView((View)this.e);
            this.c.setAlphaSlider(this.e);
            this.e.setColor(this.f(this.n));
        }
        if (this.j) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
            (this.f = (EditText)View.inflate(b, com.flask.colorpicker.h.i.S, (ViewGroup)null)).setFilters(new InputFilter[] { (InputFilter)new InputFilter$AllCaps() });
            this.f.setSingleLine();
            this.f.setVisibility(8);
            int n2;
            if (this.i) {
                n2 = 9;
            }
            else {
                n2 = 7;
            }
            this.f.setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(n2) });
            this.b.addView((View)this.f, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
            this.f.setText((CharSequence)com.flask.colorpicker.i.e(this.f(this.n), this.i));
            this.c.setColorEdit(this.f);
        }
        if (this.k) {
            (this.g = (LinearLayout)View.inflate(b, com.flask.colorpicker.h.i.A, (ViewGroup)null)).setVisibility(8);
            this.b.addView((View)this.g);
            if (this.n.length == 0) {
                ((ImageView)View.inflate(b, com.flask.colorpicker.h.i.B, (ViewGroup)null)).setImageDrawable((Drawable)new ColorDrawable(-1));
            }
            else {
                int n3 = 0;
                while (true) {
                    final Integer[] n4 = this.n;
                    if (n3 >= n4.length || n3 >= this.l) {
                        break;
                    }
                    if (n4[n3] == null) {
                        break;
                    }
                    final LinearLayout linearLayout = (LinearLayout)View.inflate(b, com.flask.colorpicker.h.i.B, (ViewGroup)null);
                    ((ImageView)linearLayout.findViewById(com.flask.colorpicker.h.g.Y)).setImageDrawable((Drawable)new ColorDrawable((int)this.n[n3]));
                    this.g.addView((View)linearLayout);
                    ++n3;
                }
            }
            this.g.setVisibility(0);
            this.c.i(this.g, this.g(this.n));
        }
        return this.a.a();
    }
    
    public b d(final int density) {
        this.c.setDensity(density);
        return this;
    }
    
    public b h(final int i) {
        this.n[0] = i;
        return this;
    }
    
    public b i(final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            final Integer[] n = this.n;
            if (i >= n.length) {
                break;
            }
            n[i] = array[i];
        }
        return this;
    }
    
    public b j() {
        this.h = true;
        this.i = false;
        return this;
    }
    
    public b k() {
        this.h = false;
        this.i = false;
        return this;
    }
    
    public b m(final int colorEditTextColor) {
        this.c.setColorEditTextColor(colorEditTextColor);
        return this;
    }
    
    public b n(final int n, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.a.r(n, dialogInterface$OnClickListener);
        return this;
    }
    
    public b o(final CharSequence charSequence, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        this.a.s(charSequence, dialogInterface$OnClickListener);
        return this;
    }
    
    public b p(final f f) {
        this.c.a(f);
        return this;
    }
    
    public b q(final g g) {
        this.c.b(g);
        return this;
    }
    
    public b r(final int l) throws IndexOutOfBoundsException {
        if (l >= 1 && l <= 5) {
            if ((this.l = l) > 1) {
                this.k = true;
            }
            return this;
        }
        throw new IndexOutOfBoundsException("Picker Can Only Support 1-5 Colors");
    }
    
    public b s(final int n, final a a) {
        this.a.B(n, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int n) {
                com.flask.colorpicker.builder.b.this.l(dialogInterface, a);
            }
        });
        return this;
    }
    
    public b t(final CharSequence charSequence, final a a) {
        this.a.C(charSequence, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public void onClick(final DialogInterface dialogInterface, final int n) {
                com.flask.colorpicker.builder.b.this.l(dialogInterface, a);
            }
        });
        return this;
    }
    
    public b u(final int n) {
        this.a.J(n);
        return this;
    }
    
    public b v(final String s) {
        this.a.K(s);
        return this;
    }
    
    public b w(final boolean i) {
        this.i = i;
        return this;
    }
    
    public b x(final boolean j) {
        this.j = j;
        return this;
    }
    
    public b y(final boolean k) {
        if (!(this.k = k)) {
            this.l = 1;
        }
        return this;
    }
    
    public b z(final boolean h) {
        this.h = h;
        return this;
    }
}
