// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import androidx.core.content.d;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class k extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final Profile I;
    @j0
    private List<ExcuseStatus> J;
    @k0
    private Excuse K;
    
    public k(@j0 final Context g, @j0 final Profile i, @j0 final List<ExcuseStatus> j, @k0 final Excuse k) {
        this.G = g;
        this.H = LayoutInflater.from(g.getApplicationContext());
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public ExcuseStatus a(final int n) {
        return this.J.get(n);
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int text, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final ExcuseStatus a = this.a(text);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493254, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298289);
        final TextView textView = (TextView)inflate.findViewById(2131298291);
        final TextView textView2 = (TextView)inflate.findViewById(2131298290);
        final Excuse k = this.K;
        final int n = 2131099701;
        if (k != null && k.getExcuseStatus() != null && this.K.getExcuseStatus().getId() == a.getId()) {
            imageView.setImageDrawable(d.i(this.G, 2131230873));
            imageView.setVisibility(0);
            imageView.setColorFilter(d.f(this.G, 2131099701));
        }
        else {
            imageView.setVisibility(4);
        }
        textView.setText((CharSequence)a.getDisplayName());
        if (a.getExcused()) {
            text = 2131886318;
        }
        else {
            text = 2131886335;
        }
        textView2.setText(text);
        final Context g = this.G;
        if (a.getExcused()) {
            text = n;
        }
        else {
            text = 2131099700;
        }
        textView2.setTextColor(d.f(g, text));
        return inflate;
    }
}
