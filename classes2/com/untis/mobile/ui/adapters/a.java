// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class a extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    private final int I;
    
    public a(@j0 final Context g, final int i) {
        this.G = g;
        this.H = LayoutInflater.from(g.getApplicationContext());
        this.I = i;
    }
    
    public int getCount() {
        return this.I;
    }
    
    public Object getItem(final int n) {
        return null;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493201, viewGroup, false);
        }
        return inflate;
    }
}
