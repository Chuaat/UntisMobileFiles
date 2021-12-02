// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.notifications;

import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import java.util.List;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class c extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final List<b> I;
    
    public c(@j0 final Context g, @j0 final List<b> i) {
        this.G = g;
        this.H = LayoutInflater.from(g.getApplicationContext());
        this.I = i;
    }
    
    public b a(final int n) {
        return this.I.get(n);
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final b a = this.a(n);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493232, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298210);
        final TextView textView = (TextView)inflate.findViewById(2131298212);
        final TextView textView2 = (TextView)inflate.findViewById(2131298211);
        imageView.setImageDrawable(a.a(this.G));
        textView.setText((CharSequence)a.d(this.G));
        textView2.setText((CharSequence)a.b(this.G));
        return inflate;
    }
}
