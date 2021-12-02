// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.k0;
import android.widget.TextView;
import java.util.Iterator;
import android.content.Context;
import java.util.Collection;
import android.widget.BaseAdapter;

class n extends BaseAdapter
{
    static final int L;
    final m G;
    final f<?> H;
    private Collection<Long> I;
    c J;
    final a K;
    
    static {
        L = u.v().getMaximum(4);
    }
    
    n(final m g, final f<?> h, final a k) {
        this.G = g;
        this.H = h;
        this.K = k;
        this.I = (Collection<Long>)h.A4();
    }
    
    private void e(final Context context) {
        if (this.J == null) {
            this.J = new c(context);
        }
    }
    
    private boolean h(final long n) {
        final Iterator<Long> iterator = this.H.A4().iterator();
        while (iterator.hasNext()) {
            if (u.a(n) == u.a(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    private void k(@k0 final TextView textView, final long n) {
        if (textView == null) {
            return;
        }
        b b;
        if (this.K.f().S3(n)) {
            textView.setEnabled(true);
            if (this.h(n)) {
                b = this.J.b;
            }
            else {
                final long timeInMillis = u.t().getTimeInMillis();
                final c j = this.J;
                if (timeInMillis == n) {
                    b = j.c;
                }
                else {
                    b = j.a;
                }
            }
        }
        else {
            textView.setEnabled(false);
            b = this.J.g;
        }
        b.f(textView);
    }
    
    private void l(final MaterialCalendarGridView materialCalendarGridView, final long n) {
        if (m.f(n).equals(this.G)) {
            this.k((TextView)materialCalendarGridView.getChildAt(materialCalendarGridView.b().a(this.G.j(n)) - materialCalendarGridView.getFirstVisiblePosition()), n);
        }
    }
    
    int a(final int n) {
        return this.b() + (n - 1);
    }
    
    int b() {
        return this.G.h();
    }
    
    @k0
    public Long c(final int n) {
        if (n >= this.G.h() && n <= this.i()) {
            return this.G.i(this.j(n));
        }
        return null;
    }
    
    @j0
    public TextView d(final int n, @k0 final View view, @j0 final ViewGroup viewGroup) {
        this.e(viewGroup.getContext());
        TextView textView = (TextView)view;
        if (view == null) {
            textView = (TextView)LayoutInflater.from(viewGroup.getContext()).inflate(o2.a.k.m0, viewGroup, false);
        }
        int i = n - this.b();
        Label_0186: {
            if (i >= 0) {
                final m g = this.G;
                if (i < g.K) {
                    ++i;
                    textView.setTag((Object)g);
                    textView.setText((CharSequence)String.format(textView.getResources().getConfiguration().locale, "%d", i));
                    final long j = this.G.i(i);
                    String contentDescription;
                    if (this.G.I == m.g().I) {
                        contentDescription = com.google.android.material.datepicker.g.g(j);
                    }
                    else {
                        contentDescription = com.google.android.material.datepicker.g.l(j);
                    }
                    textView.setContentDescription((CharSequence)contentDescription);
                    textView.setVisibility(0);
                    textView.setEnabled(true);
                    break Label_0186;
                }
            }
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        final Long c = this.c(n);
        if (c == null) {
            return textView;
        }
        this.k(textView, c);
        return textView;
    }
    
    boolean f(final int n) {
        return n % this.G.J == 0;
    }
    
    boolean g(final int n) {
        boolean b = true;
        if ((n + 1) % this.G.J != 0) {
            b = false;
        }
        return b;
    }
    
    public int getCount() {
        return this.G.K + this.b();
    }
    
    public long getItemId(final int n) {
        return n / this.G.J;
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    int i() {
        return this.G.h() + this.G.K - 1;
    }
    
    int j(final int n) {
        return n - this.G.h() + 1;
    }
    
    public void m(final MaterialCalendarGridView materialCalendarGridView) {
        final Iterator<Long> iterator = this.I.iterator();
        while (iterator.hasNext()) {
            this.l(materialCalendarGridView, iterator.next());
        }
        final f<?> h = this.H;
        if (h != null) {
            final Iterator<Long> iterator2 = h.A4().iterator();
            while (iterator2.hasNext()) {
                this.l(materialCalendarGridView, iterator2.next());
            }
            this.I = this.H.A4();
        }
    }
    
    boolean n(final int n) {
        return n >= this.b() && n <= this.i();
    }
}
