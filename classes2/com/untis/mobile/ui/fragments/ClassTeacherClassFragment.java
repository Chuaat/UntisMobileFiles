// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.services.infocenter.w;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import org.joda.time.t;
import org.joda.time.n0;
import com.untis.mobile.utils.g0;
import java.util.Iterator;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import androidx.core.content.d;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.untis.mobile.utils.u0;
import android.util.Log;
import java.util.Collection;
import com.untis.mobile.services.classbook.b;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import java.util.ArrayList;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;
import com.untis.mobile.services.masterdata.a;
import android.widget.ProgressBar;
import android.view.View;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class ClassTeacherClassFragment extends UmFragment
{
    public static final String S = "ctcf_dolphinpower";
    private static final String T = "profile_id";
    private static final String U = "klassen_id";
    private Profile G;
    private Klasse H;
    private View I;
    private View J;
    private ProgressBar K;
    private View L;
    private View M;
    private View N;
    private View O;
    private a P;
    private com.untis.mobile.services.infocenter.a Q;
    @j0
    private List<StudentAbsence> R;
    
    public ClassTeacherClassFragment() {
        this.R = new ArrayList<StudentAbsence>();
    }
    
    @j0
    private String A(@j0 final List<Event> list) {
        if (list.size() == 0) {
            return this.getString(2131886211);
        }
        if (list.size() == 1) {
            return this.getString(2131886212);
        }
        return this.getString(2131886208).replace("{0}", String.valueOf(list.size()));
    }
    
    private void F(@j0 final View view, @j0 final List<StudentAbsence> list) {
        final View viewById = view.findViewById(2131297515);
        final TextView textView = (TextView)view.findViewById(2131297520);
        final TextView textView2 = (TextView)view.findViewById(2131297518);
        final TextView textView3 = (TextView)view.findViewById(2131297519);
        final ImageView imageView = (ImageView)view.findViewById(2131297516);
        int visibility;
        if (list.size() > 0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        imageView.setVisibility(visibility);
        if (list.size() > 0) {
            viewById.setOnClickListener((View$OnClickListener)new e(this, view, list));
        }
        textView.setText((CharSequence)this.x(list));
        textView.setTextColor(d.f(this.getContext(), 2131099697));
        textView.setBackground((Drawable)null);
        textView.setPadding(0, 0, 0, 0);
        textView2.setText((CharSequence)this.y(list));
        textView2.setTextColor(d.f(this.getContext(), 2131099695));
        textView2.setBackground((Drawable)null);
        textView2.setPadding(0, 0, 0, 0);
        textView3.setText((CharSequence)this.w(list));
        textView3.setTextColor(d.f(this.getContext(), 2131099695));
        textView3.setBackground((Drawable)null);
        textView3.setPadding(0, 0, 0, 0);
        if (textView2.getText().toString().isEmpty()) {
            textView2.setVisibility(8);
        }
    }
    
    private void G(@j0 final View view, @j0 final List<Event> list) {
        final View viewById = view.findViewById(2131297521);
        final TextView textView = (TextView)view.findViewById(2131297525);
        final TextView textView2 = (TextView)view.findViewById(2131297524);
        final ImageView imageView = (ImageView)view.findViewById(2131297522);
        int visibility;
        if (list.size() > 0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        imageView.setVisibility(visibility);
        if (list.size() > 0) {
            viewById.setOnClickListener((View$OnClickListener)new f(this, view, list));
        }
        textView.setText((CharSequence)this.A(list));
        textView.setTextColor(d.f(this.getContext(), 2131099697));
        textView.setBackground((Drawable)null);
        textView.setPadding(0, 0, 0, 0);
        textView2.setText((CharSequence)this.z(list));
        textView2.setTextColor(d.f(this.getContext(), 2131099695));
        textView2.setBackground((Drawable)null);
        textView2.setPadding(0, 0, 0, 0);
    }
    
    @j0
    public static ClassTeacherClassFragment v(@j0 final Profile profile, @j0 final Klasse klasse) {
        final ClassTeacherClassFragment classTeacherClassFragment = new ClassTeacherClassFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("profile_id", profile.getUniqueId());
        arguments.putLong("klassen_id", klasse.getId());
        classTeacherClassFragment.setArguments(arguments);
        return classTeacherClassFragment;
    }
    
    @j0
    private String w(final List<StudentAbsence> list) {
        final StringBuilder sb = new StringBuilder();
        for (final StudentAbsence studentAbsence : list) {
            if (sb.indexOf(studentAbsence.getStudent().getDisplayName()) > 0) {
                continue;
            }
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(studentAbsence.getStudent().getDisplayName());
        }
        return sb.toString();
    }
    
    @j0
    private String x(@j0 final List<StudentAbsence> list) {
        if (list.size() == 0) {
            return this.getString(2131886127);
        }
        if (list.size() == 1) {
            return this.getString(2131886329);
        }
        return this.getString(2131886337).replace("{0}", String.valueOf(list.size()));
    }
    
    @j0
    private String y(@j0 final List<StudentAbsence> list) {
        if (list.size() == 0) {
            return "";
        }
        int i = 0;
        final Iterator<StudentAbsence> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().getExcused()) {
                ++i;
            }
        }
        return this.getString(2131886338).replace("{0}", String.valueOf(i));
    }
    
    @j0
    private String z(final List<Event> list) {
        final StringBuilder sb = new StringBuilder();
        for (final Event event : list) {
            final String s = this.P.S(event.getEntityType(), event.getEntityId());
            if (s == null) {
                continue;
            }
            if (sb.indexOf(s) > 0) {
                continue;
            }
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(s);
        }
        return sb.toString();
    }
    
    public void H(@j0 final StudentAbsence studentAbsence) {
        final int index = this.R.indexOf(studentAbsence);
        if (index >= 0) {
            this.R.add(index, studentAbsence);
            this.R.remove(index + 1);
        }
        this.F(this.I, this.R);
    }
    
    public void I() {
        if (g0.a(this.getContext())) {
            this.K.setVisibility(0);
            final t g = com.untis.mobile.utils.settings.old.d.n(this.getContext()).i().g();
            final t n0 = com.untis.mobile.utils.time.a.b().n0(1);
            final Schoolyear m = this.P.M(com.untis.mobile.utils.time.a.b());
            t t = g;
            t t2 = n0;
            if (m != null) {
                t t3 = g;
                if (((org.joda.time.base.e)g).o((n0)m.getStart())) {
                    t3 = new t((Object)m.getStart());
                }
                t = t3;
                t2 = n0;
                if (((org.joda.time.base.e)n0).m((n0)m.getEnd())) {
                    t2 = new t((Object)m.getEnd());
                    t = t3;
                }
            }
            this.Q.t(this.H.getId(), t, t2).C5((rx.functions.b)new g(this), (rx.functions.b)new h(this));
        }
        else {
            this.L.setVisibility(8);
            this.M.setVisibility(8);
            this.N.setVisibility(8);
            this.O.setVisibility(8);
            this.J.setVisibility(0);
        }
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("profile_id"));
            this.G = l;
            this.P = l.getMasterDataService();
            this.Q = new w(this.G.getUniqueId());
            this.H = this.P.N(arguments.getLong("klassen_id"));
        }
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        (this.I = layoutInflater.inflate(2131493076, viewGroup, false)).setId(com.untis.mobile.ui.activities.views.h.a());
        this.J = this.I.findViewById(2131297526);
        this.K = (ProgressBar)this.I.findViewById(2131297527);
        this.L = this.I.findViewById(2131297521);
        this.M = this.I.findViewById(2131297523);
        this.N = this.I.findViewById(2131297515);
        this.O = this.I.findViewById(2131297517);
        this.I();
        return this.I;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("profile_id", this.G.getUniqueId());
        bundle.putLong("klassen_id", this.H.getId());
    }
}
