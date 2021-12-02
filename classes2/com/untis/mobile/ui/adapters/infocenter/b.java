// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.infocenter;

import androidx.core.content.d;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class b extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private a I;
    private boolean J;
    
    public b(@j0 final Context g, @j0 final a i, final boolean j) {
        this.G = g;
        this.H = LayoutInflater.from(g.getApplicationContext());
        this.I = i;
        this.J = j;
    }
    
    public a a(final int n) {
        return a.d(n);
    }
    
    public void b(@j0 final a i) {
        this.I = i;
        this.notifyDataSetInvalidated();
    }
    
    public int getCount() {
        return a.values().length;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int visibility, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final a a = this.a(visibility);
        visibility = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493254, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298289);
        final TextView textView = (TextView)inflate.findViewById(2131298291);
        final TextView textView2 = (TextView)inflate.findViewById(2131298290);
        if (this.I.equals(a)) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(d.i(this.G, 2131230873));
            imageView.setColorFilter(d.f(this.G, 2131099701));
        }
        else {
            imageView.setVisibility(4);
        }
        String text;
        if (this.J) {
            text = a.l(this.G);
        }
        else {
            text = a.k(this.G);
        }
        textView.setText((CharSequence)text);
        String text2;
        if (this.J) {
            text2 = a.j(this.G);
        }
        else {
            text2 = a.i(this.G);
        }
        textView2.setText((CharSequence)text2);
        if (com.untis.mobile.ui.adapters.infocenter.a.M.equals(a)) {
            visibility = 8;
        }
        textView2.setVisibility(visibility);
        return inflate;
    }
}
