// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import java.text.ParseException;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.k0;
import android.content.Context;
import java.util.Date;
import java.text.DateFormat;
import androidx.annotation.j0;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.internal.s;

abstract class e extends s
{
    private static final int M = 1000;
    @j0
    private final TextInputLayout G;
    private final DateFormat H;
    private final a I;
    private final String J;
    private final Runnable K;
    private Runnable L;
    
    e(final String s, final DateFormat h, @j0 final TextInputLayout g, final a i) {
        this.H = h;
        this.G = g;
        this.I = i;
        this.J = g.getContext().getString(o2.a.m.C0);
        this.K = new Runnable() {
            @Override
            public void run() {
                final TextInputLayout a = e.this.G;
                final DateFormat b = e.this.H;
                final Context context = a.getContext();
                final String string = context.getString(o2.a.m.x0);
                final String format = String.format(context.getString(o2.a.m.z0), s);
                final String format2 = String.format(context.getString(o2.a.m.y0), b.format(new Date(u.t().getTimeInMillis())));
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("\n");
                sb.append(format);
                sb.append("\n");
                sb.append(format2);
                a.setError(sb.toString());
                e.this.e();
            }
        };
    }
    
    private Runnable d(final long n) {
        return new Runnable() {
            @Override
            public void run() {
                e.this.G.setError(String.format(e.this.J, g.c(n)));
                e.this.e();
            }
        };
    }
    
    void e() {
    }
    
    abstract void f(@k0 final Long p0);
    
    public void g(final View view, final Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }
    
    @Override
    public void onTextChanged(@j0 final CharSequence charSequence, final int n, final int n2, final int n3) {
        this.G.removeCallbacks(this.K);
        this.G.removeCallbacks(this.L);
        this.G.setError(null);
        this.f(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            final Date parse = this.H.parse(charSequence.toString());
            this.G.setError(null);
            final long time = parse.getTime();
            if (this.I.f().S3(time) && this.I.l(time)) {
                this.f(parse.getTime());
                return;
            }
            final Runnable d = this.d(time);
            this.L = d;
            this.g((View)this.G, d);
        }
        catch (ParseException ex) {
            this.g((View)this.G, this.K);
        }
    }
}
