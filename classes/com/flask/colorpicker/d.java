// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker;

import android.content.res.TypedArray;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface;
import com.flask.colorpicker.builder.a;
import com.flask.colorpicker.builder.b;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.j0;
import android.view.View;
import android.graphics.Color;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.preference.Preference;

public class d extends Preference
{
    protected boolean G;
    protected boolean H;
    protected int I;
    protected e.c J;
    protected int K;
    private String L;
    private String M;
    private String N;
    protected ImageView O;
    
    public d(final Context context) {
        super(context);
        this.I = 0;
    }
    
    public d(final Context context, final AttributeSet set) {
        super(context, set);
        this.I = 0;
        this.d(context, set);
    }
    
    public d(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.I = 0;
        this.d(context, set);
    }
    
    public static int b(int blue, final float n) {
        final int alpha = Color.alpha(blue);
        final int red = Color.red(blue);
        final int green = Color.green(blue);
        blue = Color.blue(blue);
        return Color.argb(alpha, Math.max((int)(red * n), 0), Math.max((int)(green * n), 0), Math.max((int)(blue * n), 0));
    }
    
    private void d(Context obtainStyledAttributes, final AttributeSet set) {
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(set, h.l.q3);
        try {
            this.G = ((TypedArray)obtainStyledAttributes).getBoolean(h.l.r3, false);
            this.H = ((TypedArray)obtainStyledAttributes).getBoolean(h.l.v3, false);
            this.K = ((TypedArray)obtainStyledAttributes).getInt(h.l.t3, 10);
            this.J = e.c.b(((TypedArray)obtainStyledAttributes).getInt(h.l.B3, 0));
            this.I = ((TypedArray)obtainStyledAttributes).getInt(h.l.u3, -1);
            final String string = ((TypedArray)obtainStyledAttributes).getString(h.l.A3);
            this.L = string;
            if (string == null) {
                this.L = "Choose color";
            }
            if ((this.M = ((TypedArray)obtainStyledAttributes).getString(h.l.x3)) == null) {
                this.M = "cancel";
            }
            if ((this.N = ((TypedArray)obtainStyledAttributes).getString(h.l.y3)) == null) {
                this.N = "ok";
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            this.setWidgetLayoutResource(h.i.C);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public void f(final int n) {
        if (this.callChangeListener((Object)n)) {
            this.persistInt(this.I = n);
            this.notifyChanged();
        }
    }
    
    protected void onBindView(@j0 final View view) {
        super.onBindView(view);
        final Resources resources = view.getContext().getResources();
        final ImageView o = (ImageView)view.findViewById(h.g.G);
        this.O = o;
        final Drawable drawable = o.getDrawable();
        GradientDrawable gradientDrawable;
        if (drawable != null && drawable instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable)drawable;
        }
        else {
            gradientDrawable = null;
        }
        GradientDrawable imageDrawable = gradientDrawable;
        if (gradientDrawable == null) {
            imageDrawable = new GradientDrawable();
            imageDrawable.setShape(1);
        }
        int color;
        if (this.isEnabled()) {
            color = this.I;
        }
        else {
            color = b(this.I, 0.5f);
        }
        imageDrawable.setColor(color);
        imageDrawable.setStroke((int)TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), b(color, 0.8f));
        this.O.setImageDrawable((Drawable)imageDrawable);
    }
    
    protected void onClick() {
        final b o = b.B(this.getContext()).v(this.L).h(this.I).A(this.J).d(this.K).t(this.N, new a() {
            @Override
            public void a(final DialogInterface dialogInterface, final int n, final Integer[] array) {
                d.this.f(n);
            }
        }).o(this.M, null);
        final boolean g = this.G;
        if (!g && !this.H) {
            o.k();
        }
        else if (!g) {
            o.j();
        }
        else if (!this.H) {
            o.b();
        }
        o.c().show();
    }
    
    protected void onSetInitialValue(final boolean b, final Object o) {
        int n;
        if (b) {
            n = this.getPersistedInt(0);
        }
        else {
            n = (int)o;
        }
        this.f(n);
    }
}
