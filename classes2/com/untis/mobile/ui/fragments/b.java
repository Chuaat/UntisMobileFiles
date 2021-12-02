// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import org.joda.time.base.c;
import androidx.core.content.d;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import androidx.annotation.k0;
import android.view.View;
import java.util.Comparator;
import java.util.Collections;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import com.untis.mobile.utils.comparator.a;
import org.joda.time.l0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
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
    private final Profile I;
    @j0
    private final List<StudentAbsence> J;
    
    public b(@j0 final Context g, @j0 final Profile i, @j0 final List<StudentAbsence> j) {
        this.G = g;
        this.H = LayoutInflater.from(g.getApplicationContext());
        this.I = i;
        this.d(this.J = j);
    }
    
    private void d(@j0 final List<StudentAbsence> list) {
        Collections.sort((List<Object>)list, com.untis.mobile.ui.fragments.a.G);
    }
    
    public StudentAbsence b(final int n) {
        return this.J.get(n);
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int visibility, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final StudentAbsence b = this.b(visibility);
        final int n = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493169, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131297908);
        final TextView textView = (TextView)inflate.findViewById(2131297912);
        final TextView textView2 = (TextView)inflate.findViewById(2131297909);
        final TextView textView3 = (TextView)inflate.findViewById(2131297911);
        final TextView textView4 = (TextView)inflate.findViewById(2131297907);
        final TextView textView5 = (TextView)inflate.findViewById(2131297910);
        final ImageView imageView2 = (ImageView)inflate.findViewById(2131297906);
        imageView.setVisibility(8);
        textView.setText((CharSequence)b.getStudent().getDisplayName());
        final Excuse excuse = b.getExcuse();
        visibility = 2131099700;
        if (excuse == null) {
            textView2.setVisibility(0);
            textView2.setText(2131886324);
            textView2.setTextColor(d.f(this.G, 2131099700));
        }
        else if (b.getExcuse().getExcuseStatus() != null && com.untis.mobile.services.a.a.s(this.I)) {
            textView2.setVisibility(0);
            final Context g = this.G;
            if (b.getExcuse().getExcuseStatus().getExcused()) {
                visibility = 2131099701;
            }
            textView2.setTextColor(d.f(g, visibility));
            textView2.setText((CharSequence)b.getExcuse().getExcuseStatus().getDisplayName());
        }
        else {
            textView2.setVisibility(8);
        }
        textView3.setText((CharSequence)com.untis.mobile.utils.time.b.f(b.getStart().j1(), b.getEnd().j1()));
        textView4.setText((CharSequence)com.untis.mobile.utils.time.b.e(b.getStart().h1(), b.getEnd().h1()));
        textView5.setVisibility(0);
        Label_0446: {
            String text;
            if (b.getAbsenceReason() != null && !b.getText().isEmpty()) {
                text = String.format("(%s) - %s", b.getAbsenceReason().getDisplayName(), b.getText());
            }
            else if (b.getAbsenceReason() == null && !b.getText().isEmpty()) {
                text = b.getText();
            }
            else {
                if (b.getAbsenceReason() == null && b.getText().isEmpty()) {
                    textView5.setVisibility(8);
                    break Label_0446;
                }
                text = b.getAbsenceReason().getDisplayName();
            }
            textView5.setText((CharSequence)text);
        }
        if (com.untis.mobile.services.a.a.w(this.I)) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        imageView2.setVisibility(visibility);
        return inflate;
    }
}
