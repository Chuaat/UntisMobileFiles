// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.cardview.widget.CardView;
import com.google.android.material.tabs.TabLayout;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.Log;
import com.google.android.material.tabs.TabLayout$i;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import android.os.Bundle;
import androidx.annotation.j0;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.k0;
import com.google.android.material.tabs.TabLayout$f;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class InfoCenterClassTeacherFragment extends UmFragment implements TabLayout$f
{
    private static final String I = "profile_id";
    @k0
    private static ClassTeacherClassFragment J;
    private Profile G;
    private a H;
    
    @j0
    public static InfoCenterClassTeacherFragment r(@j0 final Profile profile) {
        final InfoCenterClassTeacherFragment infoCenterClassTeacherFragment = new InfoCenterClassTeacherFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("profile_id", profile.getUniqueId());
        infoCenterClassTeacherFragment.setArguments(arguments);
        return infoCenterClassTeacherFragment;
    }
    
    private void s(@j0 final Klasse klasse, final boolean b) {
        final a0 r = this.getActivity().getSupportFragmentManager().r();
        r.h(2131297528, (Fragment)(InfoCenterClassTeacherFragment.J = ClassTeacherClassFragment.v(this.G, klasse)), "ctcf_dolphinpower");
        r.r();
    }
    
    @j0
    private List<Klasse> t(final Collection<Long> collection) {
        final ArrayList<Klasse> list = new ArrayList<Klasse>();
        final Iterator<Long> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final Klasse n = this.H.N(iterator.next());
            if (n != null) {
                if (list.contains(n)) {
                    continue;
                }
                list.add(n);
            }
        }
        return list;
    }
    
    public void g(final TabLayout$i tabLayout$i) {
    }
    
    public void i(@j0 final TabLayout$i tabLayout$i) {
        if (tabLayout$i.m() != null && tabLayout$i.m() instanceof Klasse) {
            this.s((Klasse)tabLayout$i.m(), true);
            return;
        }
        Log.e("untis_log", "could not find valid class, please check code");
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("profile_id"));
        }
        this.H = this.G.getMasterDataService();
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131493074, viewGroup, false);
        final TabLayout tabLayout = (TabLayout)inflate.findViewById(2131297543);
        final CardView cardView = (CardView)inflate.findViewById(2131297541);
        final CardView cardView2 = (CardView)inflate.findViewById(2131297540);
        final List<Klasse> t = this.t(this.G.getUserClasses());
        if (!com.untis.mobile.utils.a.a(this.getContext()).I(this.G)) {
            ((HorizontalScrollView)tabLayout).setVisibility(8);
            ((FrameLayout)cardView).setVisibility(0);
            return inflate;
        }
        if (t.size() == 0) {
            ((HorizontalScrollView)tabLayout).setVisibility(8);
            ((FrameLayout)cardView2).setVisibility(0);
            return inflate;
        }
        final Iterator<Klasse> iterator = t.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Klasse klasse = iterator.next();
            final TabLayout$i d = tabLayout.D();
            d.D((CharSequence)klasse.getDisplayName());
            d.B((Object)klasse);
            tabLayout.e(d);
            if (n != 0) {
                this.s(klasse, false);
                n = 0;
            }
        }
        tabLayout.d((TabLayout$f)this);
        if (t.size() == 1) {
            ((HorizontalScrollView)tabLayout).setVisibility(8);
        }
        else {
            ((HorizontalScrollView)tabLayout).setVisibility(0);
        }
        return inflate;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("profile_id", this.G.getUniqueId());
    }
    
    public void p(final TabLayout$i tabLayout$i) {
    }
    
    public void u() {
        final ClassTeacherClassFragment j = InfoCenterClassTeacherFragment.J;
        if (j != null) {
            j.I();
        }
    }
}
