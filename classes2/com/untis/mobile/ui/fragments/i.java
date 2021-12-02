// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import androidx.core.content.d;
import com.untis.mobile.persistence.models.EntityType;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class i extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final Profile I;
    @j0
    private final List<Event> J;
    private a K;
    
    public i(@j0 final Context g, @j0 final Profile i, @j0 final List<Event> j) {
        this.G = g;
        this.H = LayoutInflater.from(g.getApplicationContext());
        this.I = i;
        this.J = j;
        this.K = i.getMasterDataService();
    }
    
    public Event a(final int n) {
        return this.J.get(n);
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int n, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final Event a = this.a(n);
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493255, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298285);
        final TextView textView = (TextView)inflate.findViewById(2131298288);
        final TextView textView2 = (TextView)inflate.findViewById(2131298287);
        final TextView textView3 = (TextView)inflate.findViewById(2131298284);
        final TextView textView4 = (TextView)inflate.findViewById(2131298286);
        final Context g = this.G;
        if (EntityType.STUDENT.equals(a.getEntityType())) {
            n = 2131230950;
        }
        else {
            n = 2131230876;
        }
        imageView.setImageDrawable(d.i(g, n));
        imageView.setVisibility(0);
        textView.setText((CharSequence)this.K.S(a.getEntityType(), a.getEntityId()));
        textView2.setText((CharSequence)((org.joda.time.base.a)a.getDateTime()).g4("H:mm"));
        textView3.setText((CharSequence)((org.joda.time.base.a)a.getDateTime()).g4("dd.MM.yyyy"));
        final EventReason eventReason = a.getEventReason();
        textView4.setVisibility(0);
        if (eventReason == null && a.getText().isEmpty()) {
            textView4.setVisibility(8);
        }
        else {
            String text;
            if (eventReason != null && a.getText().isEmpty()) {
                text = eventReason.getLongName();
            }
            else if (eventReason != null && !a.getText().isEmpty()) {
                text = String.format("(%s) %s", eventReason.getLongName(), a.getText());
            }
            else {
                text = a.getText();
            }
            textView4.setText((CharSequence)text);
        }
        return inflate;
    }
}
