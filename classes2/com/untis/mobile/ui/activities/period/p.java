// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period;

import android.view.View$OnClickListener;
import org.joda.time.c;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import java.util.Iterator;
import java.util.ArrayList;
import com.untis.mobile.ui.dialogs.ConfirmationDialog;
import android.view.View;
import com.untis.mobile.systemNotifications.d;
import com.untis.mobile.systemNotifications.b;
import com.untis.mobile.systemNotifications.a;
import java.util.List;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class p extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final FragmentManager H;
    @j0
    private final LayoutInflater I;
    @j0
    private List<a> J;
    private boolean K;
    private b L;
    
    public p(@j0 final com.untis.mobile.ui.activities.common.b g, @j0 final List<a> j) {
        this.K = false;
        this.G = (Context)g;
        this.H = ((androidx.fragment.app.d)g).getSupportFragmentManager();
        this.I = LayoutInflater.from(((Context)g).getApplicationContext());
        this.J = j;
        this.L = new d().a();
    }
    
    public p(@j0 final com.untis.mobile.ui.activities.common.b g, @j0 final List<a> j, final boolean k) {
        this.K = false;
        this.G = (Context)g;
        this.H = ((androidx.fragment.app.d)g).getSupportFragmentManager();
        this.I = LayoutInflater.from(((Context)g).getApplicationContext());
        this.J = j;
        this.K = k;
        this.L = new d().a();
    }
    
    public void d(@j0 final a a) {
        this.g(a.e());
        this.J.add(a);
        this.notifyDataSetChanged();
    }
    
    public a e(final int n) {
        return this.J.get(n);
    }
    
    public void g(final int n) {
        final ArrayList<a> j = new ArrayList<a>();
        for (final a a : this.J) {
            if (a.e() == n) {
                continue;
            }
            j.add(a);
        }
        this.J = j;
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final a e = this.e(n);
        final int n2 = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.I.inflate(2131493254, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298289);
        final TextView textView = (TextView)inflate.findViewById(2131298291);
        final TextView textView2 = (TextView)inflate.findViewById(2131298290);
        final ImageView imageView2 = (ImageView)inflate.findViewById(2131298281);
        final ImageView imageView3 = (ImageView)inflate.findViewById(2131298282);
        if (this.K) {
            n = 0;
        }
        else {
            n = 8;
        }
        imageView.setVisibility(n);
        if (this.K) {
            imageView.setImageDrawable(androidx.core.content.d.i(this.G, 2131230862));
        }
        textView.setText((CharSequence)e.i());
        Context context;
        if (!e.s()) {
            textView2.setText((CharSequence)this.G.getString(2131886568).replace("{0}", ((org.joda.time.base.a)new c(e.n())).g4("E, H:mm, dd.MM.yyyy")));
            context = this.G;
            n = 2131099705;
        }
        else {
            textView2.setText((CharSequence)this.G.getString(2131886584));
            context = this.G;
            n = 2131099683;
        }
        textView2.setTextColor(androidx.core.content.d.f(context, n));
        imageView2.setVisibility(0);
        imageView2.setImageDrawable(androidx.core.content.d.i(this.G, 2131230886));
        n = n2;
        if (this.K) {
            n = 8;
        }
        imageView3.setVisibility(n);
        imageView3.setImageDrawable(androidx.core.content.d.i(this.G, 2131230881));
        imageView3.setOnClickListener((View$OnClickListener)new o(this, e));
        return inflate;
    }
}
