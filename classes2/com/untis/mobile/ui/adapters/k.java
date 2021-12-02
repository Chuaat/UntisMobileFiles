// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import org.joda.time.base.a;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import java.util.Collections;
import java.util.Collection;
import androidx.core.content.d;
import android.content.Context;
import com.untis.mobile.utils.g0;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import java.util.List;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import com.untis.mobile.ui.activities.common.b;
import android.widget.BaseAdapter;

public class k extends BaseAdapter
{
    @j0
    private final b G;
    @j0
    private final LayoutInflater H;
    @j0
    private final List<OfficeHour> I;
    private boolean J;
    private int K;
    private int L;
    
    public k(@j0 final b g, @j0 final List<OfficeHour> list) {
        final ArrayList<Object> i = new ArrayList<Object>();
        this.I = (List<OfficeHour>)i;
        this.J = true;
        this.G = g;
        this.J = g0.a((Context)g);
        this.K = d.f((Context)g, 2131099686);
        this.L = d.f((Context)g, 2131099677);
        this.H = LayoutInflater.from(((Activity)g).getApplicationContext());
        i.addAll(list);
        this.c();
    }
    
    private void c() {
        Collections.sort(this.I);
    }
    
    public OfficeHour a(final int n) {
        return this.I.get(n);
    }
    
    public void b(@j0 final List<OfficeHour> list) {
        this.I.clear();
        this.I.addAll(list);
        this.c();
        this.notifyDataSetInvalidated();
    }
    
    public int getCount() {
        return this.I.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    @j0
    public View getView(int n, @k0 View inflate, @k0 final ViewGroup viewGroup) {
        final OfficeHour a = this.a(n);
        if (inflate == null) {
            inflate = this.H.inflate(2131493233, viewGroup, false);
        }
        OfficeHour officeHour;
        if ((officeHour = a) == null) {
            officeHour = new OfficeHour();
            Log.e("untis_log", "officeHour is null");
        }
        final TextView textView = (TextView)inflate.findViewById(2131298222);
        final TextView textView2 = (TextView)inflate.findViewById(2131298224);
        final TextView textView3 = (TextView)inflate.findViewById(2131298223);
        final TextView textView4 = (TextView)inflate.findViewById(2131298218);
        final TextView textView5 = (TextView)inflate.findViewById(2131298216);
        final TextView textView6 = (TextView)inflate.findViewById(2131298215);
        final TextView textView7 = (TextView)inflate.findViewById(2131298217);
        final ImageView imageView = (ImageView)inflate.findViewById(2131298214);
        final ImageView imageView2 = (ImageView)inflate.findViewById(2131298213);
        textView.setText((CharSequence)officeHour.getDisplayNameTeacher());
        if (officeHour.getId() <= 0L) {
            textView2.setVisibility(8);
            textView3.setText(2131886248);
        }
        else {
            textView2.setVisibility(0);
            textView2.setText((CharSequence)String.format("%s - %s", ((a)officeHour.getStart()).g4("H:mm"), ((a)officeHour.getEnd()).g4("H:mm")));
            textView3.setText((CharSequence)((a)officeHour.getStart()).g4("E, dd.MM.yyyy"));
        }
        if (officeHour.getDisplayNameRooms().isEmpty()) {
            n = 8;
        }
        else {
            n = 0;
        }
        textView4.setVisibility(n);
        textView4.setText((CharSequence)officeHour.getDisplayNameRooms());
        if (officeHour.getPhone().isEmpty()) {
            n = 8;
        }
        else {
            n = 0;
        }
        textView5.setVisibility(n);
        textView5.setText((CharSequence)officeHour.getPhone());
        if (officeHour.getEmail().isEmpty()) {
            n = 8;
        }
        else {
            n = 0;
        }
        textView6.setVisibility(n);
        textView6.setText((CharSequence)officeHour.getEmail());
        if (officeHour.getRegistrationPossible()) {
            n = 0;
        }
        else {
            n = 8;
        }
        imageView2.setVisibility(n);
        if (!this.J) {
            n = this.K;
        }
        else {
            n = this.L;
        }
        imageView2.setColorFilter(n);
        if (officeHour.getRegistered()) {
            n = 0;
        }
        else {
            n = 8;
        }
        textView7.setVisibility(n);
        textView7.setText(2131886249);
        final b g = this.G;
        if (officeHour.getRegistered()) {
            n = 2131099701;
        }
        else {
            n = 2131099684;
        }
        imageView.setColorFilter(d.f((Context)g, n));
        return inflate;
    }
}
