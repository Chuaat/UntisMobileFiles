// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import android.view.View$OnClickListener;
import com.untis.mobile.services.a;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.util.Log;
import com.untis.mobile.ui.activities.ownabsence.OwnAbsenceActivity;
import java.util.Iterator;
import org.joda.time.m0;
import org.joda.time.l0;
import android.view.View;
import java.util.ArrayList;
import android.content.Context;
import org.joda.time.r;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.persistence.models.profile.Profile;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import com.untis.mobile.ui.activities.common.b;
import android.widget.BaseAdapter;

public class d extends BaseAdapter
{
    @j0
    private b G;
    @j0
    private LayoutInflater H;
    @j0
    private Profile I;
    @k0
    private Child J;
    @j0
    private List<StudentAbsence> K;
    private r L;
    private boolean M;
    
    public d(@j0 final b g, @j0 final Profile i, @k0 final Child j, @k0 List<StudentAbsence> k, @j0 final r l, final boolean m) {
        this.G = g;
        this.H = LayoutInflater.from((Context)g);
        this.I = i;
        this.J = j;
        if (k == null) {
            k = new ArrayList<StudentAbsence>();
        }
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    private List<StudentAbsence> b() {
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        for (final StudentAbsence studentAbsence : this.K) {
            if ((!this.M || !studentAbsence.getExcused()) && ((org.joda.time.base.d)new r((l0)studentAbsence.getStart(), (l0)studentAbsence.getEnd())).F((m0)this.L)) {
                list.add(studentAbsence);
            }
        }
        return list;
    }
    
    @k0
    public StudentAbsence c(final int i) {
        try {
            return this.b().get(i);
        }
        catch (Exception ex) {
            Log.e("untis_log", String.format("error while InfoCenterAbsenceListAdapter.getItem(%d)", i), (Throwable)ex);
            return null;
        }
    }
    
    public void e(final r l) {
        this.L = l;
        this.notifyDataSetChanged();
    }
    
    public void f(final boolean m) {
        this.M = m;
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        return this.b().size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(int visibility, @k0 final View view, @k0 final ViewGroup viewGroup) {
        final StudentAbsence c = this.c(visibility);
        if (c == null) {
            return null;
        }
        final Child j = this.J;
        final int n = 1;
        final int n2 = 0;
        if (j == null) {
            visibility = 1;
        }
        else {
            visibility = 0;
        }
        View inflate = view;
        if (view == null) {
            inflate = this.H.inflate(2131493214, viewGroup, false);
        }
        final ImageView imageView = (ImageView)inflate.findViewById(2131298121);
        final TextView textView = (TextView)inflate.findViewById(2131298124);
        final TextView textView2 = (TextView)inflate.findViewById(2131298122);
        final TextView textView3 = (TextView)inflate.findViewById(2131298123);
        final ImageView imageView2 = (ImageView)inflate.findViewById(2131298120);
        final b g = this.G;
        int n3;
        if (c.getExcused()) {
            n3 = 2131099741;
        }
        else {
            n3 = 2131099726;
        }
        imageView.setColorFilter(androidx.core.content.d.f((Context)g, n3));
        textView.setText((CharSequence)c.getStudent().getDisplayName());
        if (visibility != 0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        textView.setVisibility(visibility);
        textView2.setText((CharSequence)com.untis.mobile.utils.time.b.c(c.getStart(), c.getEnd()));
        if (c.getAbsenceReason() != null) {
            visibility = 1;
        }
        else {
            visibility = 0;
        }
        int visibility2;
        if (visibility != 0) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        textView3.setVisibility(visibility2);
        if (visibility != 0) {
            textView3.setText((CharSequence)c.getAbsenceReason().getDisplayName());
        }
        if (c.getOwner() && a.a.q(this.I)) {
            visibility = n;
        }
        else {
            visibility = 0;
        }
        int visibility3;
        if (visibility != 0) {
            visibility3 = n2;
        }
        else {
            visibility3 = 8;
        }
        imageView2.setVisibility(visibility3);
        if (visibility != 0) {
            inflate.setOnClickListener((View$OnClickListener)new c(this, c));
        }
        return inflate;
    }
}
