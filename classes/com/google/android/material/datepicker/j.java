// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import java.util.Locale;
import o2.a;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import java.util.Calendar;
import android.widget.BaseAdapter;

class j extends BaseAdapter
{
    private static final int J = 4;
    private static final int K;
    @j0
    private final Calendar G;
    private final int H;
    private final int I;
    
    static {
        int k;
        if (Build$VERSION.SDK_INT >= 26) {
            k = 4;
        }
        else {
            k = 1;
        }
        K = k;
    }
    
    public j() {
        final Calendar v = u.v();
        this.G = v;
        this.H = v.getMaximum(7);
        this.I = v.getFirstDayOfWeek();
    }
    
    private int b(int n) {
        final int n2 = n + this.I;
        final int h = this.H;
        n = n2;
        if (n2 > h) {
            n = n2 - h;
        }
        return n;
    }
    
    @k0
    public Integer a(final int n) {
        if (n >= this.H) {
            return null;
        }
        return this.b(n);
    }
    
    public int getCount() {
        return this.H;
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    @SuppressLint({ "WrongConstant" })
    @k0
    public View getView(final int n, @k0 final View view, @j0 final ViewGroup viewGroup) {
        TextView textView = (TextView)view;
        if (view == null) {
            textView = (TextView)LayoutInflater.from(viewGroup.getContext()).inflate(a.k.n0, viewGroup, false);
        }
        this.G.set(7, this.b(n));
        textView.setText((CharSequence)this.G.getDisplayName(7, j.K, textView.getResources().getConfiguration().locale));
        textView.setContentDescription((CharSequence)String.format(viewGroup.getContext().getString(a.m.w0), this.G.getDisplayName(7, 2, Locale.getDefault())));
        return (View)textView;
    }
}
