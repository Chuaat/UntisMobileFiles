// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import androidx.annotation.j0;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

class o extends h<b>
{
    private final Context a;
    @j0
    private final com.google.android.material.datepicker.a b;
    private final f<?> c;
    private final MaterialCalendar.l d;
    private final int e;
    
    o(@j0 final Context a, final f<?> c, @j0 final com.google.android.material.datepicker.a b, final MaterialCalendar.l d) {
        final com.google.android.material.datepicker.m j = b.j();
        final com.google.android.material.datepicker.m g = b.g();
        final com.google.android.material.datepicker.m i = b.i();
        if (j.b(i) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (i.b(g) <= 0) {
            final int l = com.google.android.material.datepicker.n.L;
            final int h = MaterialCalendar.H(a);
            int h2;
            if (MaterialDatePicker.k0(a)) {
                h2 = MaterialCalendar.H(a);
            }
            else {
                h2 = 0;
            }
            this.a = a;
            this.e = l * h + h2;
            this.b = b;
            this.c = c;
            this.d = d;
            ((RecyclerView.h)this).setHasStableIds(true);
            return;
        }
        throw new IllegalArgumentException("currentPage cannot be after lastPage");
    }
    
    @Override
    public int getItemCount() {
        return this.b.h();
    }
    
    @Override
    public long getItemId(final int n) {
        return this.b.j().m(n).l();
    }
    
    @j0
    com.google.android.material.datepicker.m i(final int n) {
        return this.b.j().m(n);
    }
    
    @j0
    CharSequence j(final int n) {
        return this.i(n).k(this.a);
    }
    
    int k(@j0 final com.google.android.material.datepicker.m m) {
        return this.b.j().o(m);
    }
    
    public void l(@j0 final b b, final int n) {
        final com.google.android.material.datepicker.m m = this.b.j().m(n);
        b.a.setText((CharSequence)m.k(b.itemView.getContext()));
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView)b.b.findViewById(o2.a.h.K2);
        if (materialCalendarGridView.b() != null && m.equals(materialCalendarGridView.b().G)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.b().m(materialCalendarGridView);
        }
        else {
            final com.google.android.material.datepicker.n adapter = new com.google.android.material.datepicker.n(m, this.c, this.b);
            materialCalendarGridView.setNumColumns(m.J);
            materialCalendarGridView.setAdapter((ListAdapter)adapter);
        }
        materialCalendarGridView.setOnItemClickListener((AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
            public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                if (materialCalendarGridView.b().n(n)) {
                    o.this.d.a(materialCalendarGridView.b().c(n));
                }
            }
        });
    }
    
    @j0
    public b m(@j0 final ViewGroup viewGroup, final int n) {
        final LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(viewGroup.getContext()).inflate(o2.a.k.r0, viewGroup, false);
        if (MaterialDatePicker.k0(viewGroup.getContext())) {
            linearLayout.setLayoutParams((ViewGroup$LayoutParams)new RecyclerView.q(-1, this.e));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
    
    public static class b extends g0
    {
        final TextView a;
        final MaterialCalendarGridView b;
        
        b(@j0 final LinearLayout linearLayout, final boolean b) {
            super((View)linearLayout);
            final TextView a = (TextView)linearLayout.findViewById(o2.a.h.P2);
            androidx.core.view.j0.A1((View)(this.a = a), true);
            this.b = (MaterialCalendarGridView)linearLayout.findViewById(o2.a.h.K2);
            if (!b) {
                a.setVisibility(8);
            }
        }
    }
}
