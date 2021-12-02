// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Calendar;
import java.util.Locale;
import o2.a;
import androidx.annotation.j0;
import android.view.View;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;

class v extends h<b>
{
    private final MaterialCalendar<?> a;
    
    v(final MaterialCalendar<?> a) {
        this.a = a;
    }
    
    @j0
    private View$OnClickListener i(final int n) {
        return (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                v.this.a.L(v.this.a.E().e(com.google.android.material.datepicker.m.d(n, v.this.a.G().H)));
                v.this.a.M(MaterialCalendar.k.G);
            }
        };
    }
    
    @Override
    public int getItemCount() {
        return this.a.E().k();
    }
    
    int j(final int n) {
        return n - this.a.E().j().I;
    }
    
    int k(final int n) {
        return this.a.E().j().I + n;
    }
    
    public void l(@j0 final b b, int k) {
        k = this.k(k);
        final String string = b.a.getContext().getString(o2.a.m.B0);
        b.a.setText((CharSequence)String.format(Locale.getDefault(), "%d", k));
        b.a.setContentDescription((CharSequence)String.format(string, k));
        final c f = this.a.F();
        final Calendar t = com.google.android.material.datepicker.u.t();
        com.google.android.material.datepicker.b b2;
        if (t.get(1) == k) {
            b2 = f.f;
        }
        else {
            b2 = f.d;
        }
        final Iterator<Long> iterator = this.a.t().A4().iterator();
        while (iterator.hasNext()) {
            t.setTimeInMillis(iterator.next());
            if (t.get(1) == k) {
                b2 = f.e;
            }
        }
        b2.f(b.a);
        b.a.setOnClickListener(this.i(k));
    }
    
    @j0
    public b m(@j0 final ViewGroup viewGroup, final int n) {
        return new b((TextView)LayoutInflater.from(viewGroup.getContext()).inflate(o2.a.k.v0, viewGroup, false));
    }
    
    public static class b extends g0
    {
        final TextView a;
        
        b(final TextView a) {
            super((View)a);
            this.a = a;
        }
    }
}
