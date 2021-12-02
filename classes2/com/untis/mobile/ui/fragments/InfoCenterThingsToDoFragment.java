// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import com.untis.mobile.persistence.models.profile.Child;
import androidx.viewpager.widget.a;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import androidx.fragment.app.a0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import java.util.ArrayList;
import androidx.annotation.j0;
import androidx.annotation.k0;
import com.untis.mobile.ui.adapters.j;
import java.util.List;
import com.untis.mobile.ui.adapters.i;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class InfoCenterThingsToDoFragment extends UmFragment
{
    private static final String L = "thingstodo";
    private static final String M = "profile";
    private Profile G;
    private View H;
    private ViewPager I;
    private i J;
    @k0
    private List<j.a> K;
    
    @j0
    public static InfoCenterThingsToDoFragment t(@j0 final Profile profile, @k0 final ArrayList<j.a> list) {
        final InfoCenterThingsToDoFragment infoCenterThingsToDoFragment = new InfoCenterThingsToDoFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("profile", profile.getUniqueId());
        if (list != null) {
            arguments.putParcelableArrayList("thingstodo", (ArrayList)list);
        }
        infoCenterThingsToDoFragment.setArguments(arguments);
        return infoCenterThingsToDoFragment;
    }
    
    private void u() {
        final FragmentManager childFragmentManager = this.getChildFragmentManager();
        final a0 r = childFragmentManager.r();
        for (final Fragment fragment : childFragmentManager.G0()) {
            if (fragment instanceof InfoCenterThingsToDoChildFragment) {
                r.C(fragment);
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
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("profile"));
            this.K = (List<j.a>)arguments.getParcelableArrayList("thingstodo");
        }
    }
    
    @k0
    public View onCreateView(final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131493110, viewGroup, false);
        this.H = inflate;
        this.I = (ViewPager)inflate.findViewById(2131297705);
        final i i = new i(this.getChildFragmentManager(), this.G, this.K);
        this.J = i;
        this.I.setAdapter((a)i);
        return this.H;
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("profile", this.G.getUniqueId());
        bundle.putParcelableArrayList("thingstodo", (ArrayList)this.K);
    }
    
    public void r(@k0 final Child child) {
        final ViewPager i = this.I;
        if (i != null) {
            i.setCurrentItem(this.J.a(child), true);
        }
    }
    
    public void s(@k0 final List<j.a> k) {
        this.u();
        this.K = k;
        final i i = new i(this.getChildFragmentManager(), this.G, this.K);
        this.J = i;
        this.I.setAdapter((a)i);
    }
    
    public void v() {
        this.J.c();
    }
}
