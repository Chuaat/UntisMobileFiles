// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.appbar;

import androidx.annotation.j0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

class d<V extends View> extends c<V>
{
    private com.google.android.material.appbar.e a;
    private int b;
    private int c;
    
    public d() {
        this.b = 0;
        this.c = 0;
    }
    
    public d(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
        this.c = 0;
    }
    
    public int G() {
        final com.google.android.material.appbar.e a = this.a;
        int d;
        if (a != null) {
            d = a.d();
        }
        else {
            d = 0;
        }
        return d;
    }
    
    public int H() {
        final com.google.android.material.appbar.e a = this.a;
        int e;
        if (a != null) {
            e = a.e();
        }
        else {
            e = 0;
        }
        return e;
    }
    
    public boolean I() {
        final com.google.android.material.appbar.e a = this.a;
        return a != null && a.f();
    }
    
    public boolean J() {
        final com.google.android.material.appbar.e a = this.a;
        return a != null && a.g();
    }
    
    protected void K(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, final int n) {
        coordinatorLayout.N(v, n);
    }
    
    public void L(final boolean b) {
        final com.google.android.material.appbar.e a = this.a;
        if (a != null) {
            a.i(b);
        }
    }
    
    public boolean M(final int c) {
        final com.google.android.material.appbar.e a = this.a;
        if (a != null) {
            return a.j(c);
        }
        this.c = c;
        return false;
    }
    
    public boolean N(final int b) {
        final com.google.android.material.appbar.e a = this.a;
        if (a != null) {
            return a.k(b);
        }
        this.b = b;
        return false;
    }
    
    public void O(final boolean b) {
        final com.google.android.material.appbar.e a = this.a;
        if (a != null) {
            a.l(b);
        }
    }
    
    @Override
    public boolean m(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, int n) {
        this.K(coordinatorLayout, v, n);
        if (this.a == null) {
            this.a = new com.google.android.material.appbar.e(v);
        }
        this.a.h();
        this.a.a();
        n = this.b;
        if (n != 0) {
            this.a.k(n);
            this.b = 0;
        }
        n = this.c;
        if (n != 0) {
            this.a.j(n);
            this.c = 0;
        }
        return true;
    }
}
