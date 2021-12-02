// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.resources;

import android.os.Handler;
import android.text.TextPaint;
import androidx.annotation.b1;
import android.content.res.Resources$NotFoundException;
import android.util.Log;
import androidx.core.content.res.g;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import o2.a;
import androidx.annotation.x0;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.u;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class d
{
    private static final String r = "TextAppearance";
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    @k0
    public final ColorStateList a;
    @k0
    public final ColorStateList b;
    @k0
    public final ColorStateList c;
    @k0
    public final ColorStateList d;
    @k0
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final float i;
    public final float j;
    public final float k;
    public final boolean l;
    public final float m;
    public float n;
    @u
    private final int o;
    private boolean p;
    private Typeface q;
    
    public d(@j0 final Context context, @x0 int ll) {
        this.p = false;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ll, o2.a.o.hs);
        this.n = obtainStyledAttributes.getDimension(o2.a.o.is, 0.0f);
        this.a = com.google.android.material.resources.c.a(context, obtainStyledAttributes, o2.a.o.ls);
        this.b = com.google.android.material.resources.c.a(context, obtainStyledAttributes, o2.a.o.ms);
        this.c = com.google.android.material.resources.c.a(context, obtainStyledAttributes, o2.a.o.ns);
        this.f = obtainStyledAttributes.getInt(o2.a.o.ks, 0);
        this.g = obtainStyledAttributes.getInt(o2.a.o.js, 1);
        final int e = com.google.android.material.resources.c.e(obtainStyledAttributes, o2.a.o.us, o2.a.o.ss);
        this.o = obtainStyledAttributes.getResourceId(e, 0);
        this.e = obtainStyledAttributes.getString(e);
        this.h = obtainStyledAttributes.getBoolean(o2.a.o.ws, false);
        this.d = com.google.android.material.resources.c.a(context, obtainStyledAttributes, o2.a.o.os);
        this.i = obtainStyledAttributes.getFloat(o2.a.o.ps, 0.0f);
        this.j = obtainStyledAttributes.getFloat(o2.a.o.qs, 0.0f);
        this.k = obtainStyledAttributes.getFloat(o2.a.o.rs, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build$VERSION.SDK_INT >= 21) {
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(ll, o2.a.o.Kl);
            ll = o2.a.o.Ll;
            this.l = obtainStyledAttributes2.hasValue(ll);
            this.m = obtainStyledAttributes2.getFloat(ll, 0.0f);
            obtainStyledAttributes2.recycle();
        }
        else {
            this.l = false;
            this.m = 0.0f;
        }
    }
    
    private void d() {
        if (this.q == null) {
            final String e = this.e;
            if (e != null) {
                this.q = Typeface.create(e, this.f);
            }
        }
        if (this.q == null) {
            final int g = this.g;
            Typeface q;
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        q = Typeface.DEFAULT;
                    }
                    else {
                        q = Typeface.MONOSPACE;
                    }
                }
                else {
                    q = Typeface.SERIF;
                }
            }
            else {
                q = Typeface.SANS_SERIF;
            }
            this.q = q;
            this.q = Typeface.create(this.q, this.f);
        }
    }
    
    private boolean i(final Context context) {
        final boolean b = com.google.android.material.resources.e.b();
        boolean b2 = true;
        if (b) {
            return true;
        }
        final int o = this.o;
        Typeface c;
        if (o != 0) {
            c = androidx.core.content.res.g.c(context, o);
        }
        else {
            c = null;
        }
        if (c == null) {
            b2 = false;
        }
        return b2;
    }
    
    public Typeface e() {
        this.d();
        return this.q;
    }
    
    @b1
    @j0
    public Typeface f(@j0 final Context context) {
        if (this.p) {
            return this.q;
        }
        if (context.isRestricted()) {
            goto Label_0088;
        }
        try {
            final Typeface i = androidx.core.content.res.g.i(context, this.o);
            this.q = i;
            if (i != null) {
                this.q = Typeface.create(i, this.f);
                goto Label_0088;
            }
            goto Label_0088;
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.e);
            Log.d("TextAppearance", sb.toString(), (Throwable)ex);
        }
        catch (UnsupportedOperationException | Resources$NotFoundException ex2) {
            goto Label_0088;
        }
    }
    
    public void g(@j0 final Context context, @j0 final TextPaint textPaint, @j0 final f f) {
        this.l(textPaint, this.e());
        this.h(context, new f() {
            @Override
            public void a(final int n) {
                f.a(n);
            }
            
            @Override
            public void b(@j0 final Typeface typeface, final boolean b) {
                com.google.android.material.resources.d.this.l(textPaint, typeface);
                f.b(typeface, b);
            }
        });
    }
    
    public void h(@j0 final Context context, @j0 final f f) {
        if (this.i(context)) {
            this.f(context);
        }
        else {
            this.d();
        }
        final int o = this.o;
        if (o == 0) {
            this.p = true;
        }
        if (this.p) {
            f.b(this.q, true);
            return;
        }
        try {
            androidx.core.content.res.g.k(context, o, (g.c)new g.c() {
                @Override
                public void d(final int n) {
                    d.this.p = true;
                    f.a(n);
                }
                
                @Override
                public void e(@j0 final Typeface typeface) {
                    final d b = d.this;
                    b.q = Typeface.create(typeface, b.f);
                    d.this.p = true;
                    f.b(d.this.q, false);
                }
            }, null);
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.e);
            Log.d("TextAppearance", sb.toString(), (Throwable)ex);
            this.p = true;
            f.a(-3);
        }
        catch (Resources$NotFoundException ex2) {
            this.p = true;
            f.a(1);
        }
    }
    
    public void j(@j0 final Context context, @j0 final TextPaint textPaint, @j0 final f f) {
        this.k(context, textPaint, f);
        final ColorStateList a = this.a;
        int colorForState;
        if (a != null) {
            colorForState = a.getColorForState(textPaint.drawableState, a.getDefaultColor());
        }
        else {
            colorForState = -16777216;
        }
        textPaint.setColor(colorForState);
        final float k = this.k;
        final float i = this.i;
        final float j = this.j;
        final ColorStateList d = this.d;
        int colorForState2;
        if (d != null) {
            colorForState2 = d.getColorForState(textPaint.drawableState, d.getDefaultColor());
        }
        else {
            colorForState2 = 0;
        }
        textPaint.setShadowLayer(k, i, j, colorForState2);
    }
    
    public void k(@j0 final Context context, @j0 final TextPaint textPaint, @j0 final f f) {
        if (this.i(context)) {
            this.l(textPaint, this.f(context));
        }
        else {
            this.g(context, textPaint, f);
        }
    }
    
    public void l(@j0 final TextPaint textPaint, @j0 final Typeface typeface) {
        textPaint.setTypeface(typeface);
        final int n = ~typeface.getStyle() & this.f;
        textPaint.setFakeBoldText((n & 0x1) != 0x0);
        float textSkewX;
        if ((n & 0x2) != 0x0) {
            textSkewX = -0.25f;
        }
        else {
            textSkewX = 0.0f;
        }
        textPaint.setTextSkewX(textSkewX);
        textPaint.setTextSize(this.n);
        if (Build$VERSION.SDK_INT >= 21 && this.l) {
            textPaint.setLetterSpacing(this.m);
        }
    }
}
