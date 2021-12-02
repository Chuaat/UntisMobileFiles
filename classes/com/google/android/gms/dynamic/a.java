// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Intent;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.g0;
import androidx.annotation.RecentlyNonNull;
import android.widget.FrameLayout;
import java.util.LinkedList;
import androidx.annotation.k0;
import android.os.Bundle;

@a
public abstract class a<T extends e>
{
    private T a;
    @k0
    private Bundle b;
    private LinkedList<a> c;
    private final g<T> d;
    
    @a
    public a() {
        this.d = (g<T>)new k(this);
    }
    
    @a
    public static void o(@RecentlyNonNull final FrameLayout frameLayout) {
        final com.google.android.gms.common.g y = com.google.android.gms.common.g.y();
        final Context context = frameLayout.getContext();
        final int j = y.j(context);
        final String g = g0.g(context, j);
        final String i = g0.i(context, j);
        final LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        frameLayout.addView((View)linearLayout);
        final TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        textView.setText((CharSequence)g);
        linearLayout.addView((View)textView);
        final Intent e = y.e(context, j, null);
        if (e != null) {
            final Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
            button.setText((CharSequence)i);
            linearLayout.addView((View)button);
            button.setOnClickListener((View$OnClickListener)new o(context, e));
        }
    }
    
    private final void s(final int n) {
        while (!this.c.isEmpty() && this.c.getLast().b() >= n) {
            this.c.removeLast();
        }
    }
    
    private final void t(@k0 final Bundle bundle, final a e) {
        final e a = this.a;
        if (a != null) {
            e.a(a);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList<a>();
        }
        this.c.add(e);
        if (bundle != null) {
            final Bundle b = this.b;
            if (b == null) {
                this.b = (Bundle)bundle.clone();
            }
            else {
                b.putAll(bundle);
            }
        }
        this.a(this.d);
    }
    
    @a
    protected abstract void a(@RecentlyNonNull final g<T> p0);
    
    @RecentlyNonNull
    @a
    public T b() {
        return this.a;
    }
    
    @a
    protected void c(@RecentlyNonNull final FrameLayout frameLayout) {
        o(frameLayout);
    }
    
    @a
    public void d(@RecentlyNonNull final Bundle bundle) {
        this.t(bundle, (a)new m(this, bundle));
    }
    
    @RecentlyNonNull
    @a
    public View e(@RecentlyNonNull final LayoutInflater layoutInflater, @RecentlyNonNull final ViewGroup viewGroup, @RecentlyNonNull final Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.t(bundle, (a)new l(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            this.c(frameLayout);
        }
        return (View)frameLayout;
    }
    
    @a
    public void f() {
        final e a = this.a;
        if (a != null) {
            a.onDestroy();
            return;
        }
        this.s(1);
    }
    
    @a
    public void g() {
        final e a = this.a;
        if (a != null) {
            a.h();
            return;
        }
        this.s(2);
    }
    
    @a
    public void h(@RecentlyNonNull final Activity activity, @RecentlyNonNull final Bundle bundle, @RecentlyNonNull final Bundle bundle2) {
        this.t(bundle2, (a)new j(this, activity, bundle, bundle2));
    }
    
    @a
    public void i() {
        final e a = this.a;
        if (a != null) {
            a.onLowMemory();
        }
    }
    
    @a
    public void j() {
        final e a = this.a;
        if (a != null) {
            a.d();
            return;
        }
        this.s(5);
    }
    
    @a
    public void k() {
        this.t(null, (a)new p(this));
    }
    
    @a
    public void l(@RecentlyNonNull final Bundle bundle) {
        final e a = this.a;
        if (a != null) {
            a.e(bundle);
            return;
        }
        final Bundle b = this.b;
        if (b != null) {
            bundle.putAll(b);
        }
    }
    
    @a
    public void m() {
        this.t(null, (a)new n(this));
    }
    
    @a
    public void n() {
        final e a = this.a;
        if (a != null) {
            a.a();
            return;
        }
        this.s(4);
    }
    
    private interface a
    {
        void a(final e p0);
        
        int b();
    }
}
