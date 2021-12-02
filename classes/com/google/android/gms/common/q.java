// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.content.res.TypedArray;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.h;
import com.google.android.gms.common.internal.c1;
import android.util.Log;
import com.google.android.gms.common.internal.a1;
import e2.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class q extends FrameLayout implements View$OnClickListener
{
    @RecentlyNonNull
    public static final int K = 0;
    @RecentlyNonNull
    public static final int L = 1;
    @RecentlyNonNull
    public static final int M = 2;
    @RecentlyNonNull
    public static final int N = 0;
    @RecentlyNonNull
    public static final int O = 1;
    @RecentlyNonNull
    public static final int P = 2;
    private int G;
    private int H;
    private View I;
    @k0
    private View$OnClickListener J;
    
    public q(@RecentlyNonNull final Context context) {
        this(context, null);
    }
    
    public q(@RecentlyNonNull final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public q(@RecentlyNonNull Context obtainStyledAttributes, @k0 final AttributeSet set, @RecentlyNonNull final int n) {
        super(obtainStyledAttributes, set, n);
        this.J = null;
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, e2.a.f.e, 0, 0);
        try {
            this.G = ((TypedArray)obtainStyledAttributes).getInt(e2.a.f.f, 0);
            this.H = ((TypedArray)obtainStyledAttributes).getInt(e2.a.f.g, 2);
            ((TypedArray)obtainStyledAttributes).recycle();
            this.a(this.G, this.H);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final void a(@RecentlyNonNull int g, @RecentlyNonNull int h) {
        this.G = g;
        this.H = h;
        final Context context = this.getContext();
        final View i = this.I;
        if (i != null) {
            this.removeView(i);
        }
        try {
            this.I = a1.c(context, this.G, this.H);
        }
        catch (h.a a) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            g = this.G;
            h = this.H;
            final c1 j = new c1(context);
            j.b(context.getResources(), g, h);
            this.I = (View)j;
        }
        this.addView(this.I);
        this.I.setEnabled(this.isEnabled());
        this.I.setOnClickListener((View$OnClickListener)this);
    }
    
    @Deprecated
    public final void b(@RecentlyNonNull final int n, @RecentlyNonNull final int n2, @RecentlyNonNull final Scope[] array) {
        this.a(n, n2);
    }
    
    public final void onClick(@RecentlyNonNull final View view) {
        final View$OnClickListener j = this.J;
        if (j != null && view == this.I) {
            j.onClick((View)this);
        }
    }
    
    public final void setColorScheme(@RecentlyNonNull final int n) {
        this.a(this.G, n);
    }
    
    public final void setEnabled(@RecentlyNonNull final boolean b) {
        super.setEnabled(b);
        this.I.setEnabled(b);
    }
    
    public final void setOnClickListener(@k0 final View$OnClickListener j) {
        this.J = j;
        final View i = this.I;
        if (i != null) {
            i.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    @Deprecated
    public final void setScopes(@RecentlyNonNull final Scope[] array) {
        this.a(this.G, this.H);
    }
    
    public final void setSize(@RecentlyNonNull final int n) {
        this.a(n, this.H);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }
}
