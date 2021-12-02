// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import android.widget.TextView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.List;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class d extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final List<Klasse> I;
    
    public d(@j0 final Context g, @j0 final List<Klasse> i) {
        this.G = g;
        this.H = LayoutInflater.from(g);
        this.I = i;
    }
    
    public Klasse a(final int n) {
        return this.I.get(n);
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int visibility, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final Klasse a = this.a(visibility);
        visibility = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493253, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131298280);
        final TextView textView2 = (TextView)inflate.findViewById(2131298279);
        textView.setText((CharSequence)a.getName());
        textView2.setText((CharSequence)String.format("(%s)", a.getLongName()));
        if (a.getLongName().isEmpty()) {
            visibility = 8;
        }
        textView2.setVisibility(visibility);
        return inflate;
    }
}
