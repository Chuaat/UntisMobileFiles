// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import org.joda.time.base.i;
import org.joda.time.base.g;
import com.untis.mobile.persistence.models.profile.Child;
import org.joda.time.l0;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.utils.u;
import com.untis.mobile.utils.settings.old.d;
import java.util.Iterator;
import androidx.fragment.app.a0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import com.untis.mobile.ui.activities.ownabsence.OwnAbsenceActivity;
import com.untis.mobile.ui.activities.common.b;
import com.untis.mobile.services.a;
import android.os.Bundle;
import java.util.ArrayList;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;
import org.joda.time.r;
import com.untis.mobile.ui.adapters.e;
import androidx.viewpager.widget.ViewPager;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class InfoCenterAbsencesFragment extends UmFragment
{
    private static final String M = "profile_id";
    private static final String N = "absences";
    private static final String O = "onlyunexcused";
    private static final String P = "interval_start";
    private static final String Q = "interval_end";
    private Profile G;
    private ViewPager H;
    private e I;
    private r J;
    private boolean K;
    @k0
    private List<StudentAbsence> L;
    
    public InfoCenterAbsencesFragment() {
        this.K = true;
    }
    
    @j0
    public static InfoCenterAbsencesFragment u(@j0 final Profile profile, @k0 final ArrayList<StudentAbsence> list) {
        final InfoCenterAbsencesFragment infoCenterAbsencesFragment = new InfoCenterAbsencesFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("profile_id", profile.getUniqueId());
        if (list != null) {
            arguments.putParcelableArrayList("absences", (ArrayList)list);
        }
        infoCenterAbsencesFragment.setArguments(arguments);
        return infoCenterAbsencesFragment;
    }
    
    private void w() {
        final FragmentManager fragmentManager = this.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        final a0 r = fragmentManager.r();
        final List g0 = fragmentManager.G0();
        if (g0 != null) {
            for (final Fragment fragment : g0) {
                if (fragment instanceof InfoCenterAbsenceChildFragment) {
                    r.C(fragment);
                }
            }
        }
        r.t();
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("profile_id"));
            this.L = (List<StudentAbsence>)arguments.getParcelableArrayList("absences");
            this.K = arguments.getBoolean("onlyunexcused", d.n(this.getContext()).l());
            this.J = new r(arguments.getLong("interval_start", ((g)u.l.j).n()), arguments.getLong("interval_end", ((g)u.l.k).n()));
        }
    }
    
    @k0
    public View onCreateView(final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        int visibility = 0;
        final View inflate = layoutInflater.inflate(2131493107, viewGroup, false);
        this.H = (ViewPager)inflate.findViewById(2131297701);
        final View viewById = inflate.findViewById(2131297698);
        viewById.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.fragments.r(this));
        if (!a.a.q(this.G)) {
            visibility = 8;
        }
        viewById.setVisibility(visibility);
        final e e = new e(this.getFragmentManager(), this.G, this.L, this.J, this.K);
        this.I = e;
        this.H.setAdapter((androidx.viewpager.widget.a)e);
        return inflate;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("profile_id", this.G.getUniqueId());
        bundle.putParcelableArrayList("absences", (ArrayList)this.L);
        bundle.putBoolean("onlyunexcused", this.K);
        bundle.putLong("interval_start", ((i)this.J).n());
        bundle.putLong("interval_end", ((i)this.J).I());
    }
    
    public void s(@k0 final List<StudentAbsence> l) {
        this.w();
        this.L = l;
        final e e = new e(this.getFragmentManager(), this.G, l, this.J, this.K);
        this.I = e;
        this.H.setAdapter((androidx.viewpager.widget.a)e);
        this.I.c(new r((l0)u.l.j, (l0)u.l.k));
    }
    
    public void t(@k0 final Child child) {
        final ViewPager h = this.H;
        if (h != null) {
            h.setCurrentItem(this.I.a(child), true);
        }
    }
}
