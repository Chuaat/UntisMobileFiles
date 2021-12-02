// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import android.widget.FrameLayout;
import org.joda.time.base.i;
import android.widget.ListAdapter;
import com.untis.mobile.ui.adapters.d;
import com.untis.mobile.ui.activities.common.b;
import com.untis.mobile.ui.adapters.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Parcelable;
import java.util.Collection;
import android.os.Bundle;
import androidx.annotation.j0;
import java.util.Iterator;
import java.util.ArrayList;
import org.joda.time.r;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class InfoCenterAbsenceChildFragment extends UmFragment
{
    private static final String P = "absences";
    private static final String Q = "child";
    private static final String R = "interval_start";
    private static final String S = "interval_end";
    private static final String T = "only_unexcused";
    private static final String U = "profile_id";
    @k0
    private Child G;
    private Profile H;
    private ListView I;
    private BaseAdapter J;
    private CardView K;
    private TextView L;
    @k0
    private List<StudentAbsence> M;
    private r N;
    private boolean O;
    
    @j0
    private List<StudentAbsence> r(@k0 final List<StudentAbsence> m) {
        if (this.M == null && (this.M = m) == null) {
            return new ArrayList<StudentAbsence>();
        }
        if (this.G == null) {
            return this.M;
        }
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        for (final StudentAbsence studentAbsence : this.M) {
            if (studentAbsence.getStudent().getId() == this.G.getId()) {
                list.add(studentAbsence);
            }
        }
        return list;
    }
    
    public static InfoCenterAbsenceChildFragment t(@j0 final Profile profile, @k0 final Child child, @k0 final List<StudentAbsence> c, @j0 final r r, final boolean b) {
        final InfoCenterAbsenceChildFragment infoCenterAbsenceChildFragment = new InfoCenterAbsenceChildFragment();
        final Bundle arguments = new Bundle();
        if (c != null) {
            arguments.putParcelableArrayList("absences", new ArrayList((Collection<? extends E>)c));
        }
        if (child != null) {
            arguments.putParcelable("child", (Parcelable)child);
        }
        arguments.putLong("interval_start", ((i)r).n());
        arguments.putLong("interval_end", ((i)r).I());
        arguments.putBoolean("only_unexcused", b);
        arguments.putString("profile_id", profile.getUniqueId());
        infoCenterAbsenceChildFragment.setArguments(arguments);
        return infoCenterAbsenceChildFragment;
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.M = (List<StudentAbsence>)arguments.getParcelableArrayList("absences");
            this.N = new r(arguments.getLong("interval_start"), arguments.getLong("interval_end"));
            this.O = arguments.getBoolean("only_unexcused");
            this.H = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("profile_id", ""));
            this.G = (Child)arguments.getParcelable("child");
        }
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131493108, viewGroup, false);
        this.I = (ListView)inflate.findViewById(2131297696);
        this.K = (CardView)inflate.findViewById(2131297700);
        this.L = (TextView)inflate.findViewById(2131297699);
        this.s(this.M);
        return inflate;
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("absences", (ArrayList)this.M);
        bundle.putLong("interval_start", ((i)this.N).n());
        bundle.putLong("interval_end", ((i)this.N).I());
        bundle.putBoolean("only_unexcused", this.O);
        bundle.putString("profile_id", this.H.getUniqueId());
        bundle.putParcelable("child", (Parcelable)this.G);
    }
    
    public void s(@k0 final List<StudentAbsence> list) {
        final List<StudentAbsence> r = this.r(list);
        this.M = r;
        BaseAdapter j;
        if (list == null) {
            j = new a(this.getContext(), 9);
        }
        else {
            j = new d((b)this.getActivity(), this.H, this.G, this.M, this.N, this.O);
        }
        this.J = j;
        this.I.setAdapter((ListAdapter)this.J);
        if (!com.untis.mobile.utils.a.a(this.getContext()).I(this.H)) {
            this.I.setVisibility(8);
        }
        else {
            if (list != null && r.isEmpty()) {
                this.I.setVisibility(8);
                ((FrameLayout)this.K).setVisibility(0);
                TextView textView;
                String text;
                if (this.G != null) {
                    textView = this.L;
                    final String string = this.getString(2131886320);
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.G.getFirstName());
                    sb.append(" ");
                    sb.append(this.G.getLastName());
                    text = string.replace("{0}", sb.toString());
                }
                else {
                    textView = this.L;
                    text = this.getString(2131886321);
                }
                textView.setText((CharSequence)text);
                return;
            }
            this.I.setVisibility(0);
        }
        ((FrameLayout)this.K).setVisibility(8);
    }
    
    public void u(@j0 final r n) {
        this.N = n;
        final BaseAdapter j = this.J;
        if (j != null && j instanceof d) {
            ((d)j).e(n);
        }
    }
    
    public void v(final boolean o) {
        this.O = o;
        final BaseAdapter j = this.J;
        if (j != null && j instanceof d) {
            ((d)j).f(o);
        }
    }
}
