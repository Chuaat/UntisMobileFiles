// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.infocenter.officehours;

import java.util.Collections;
import android.widget.ListAdapter;
import android.widget.AdapterView$OnItemClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.services.infocenter.w;
import rx.functions.b;
import q5.c;
import com.untis.mobile.utils.settings.old.d;
import android.content.Intent;
import android.util.Log;
import java.util.Collection;
import androidx.fragment.app.Fragment;
import com.untis.mobile.ui.activities.officehour.OfficeHourRegistrationActivity;
import com.untis.mobile.utils.g0;
import com.untis.mobile.ui.adapters.k;
import java.util.List;
import android.widget.AdapterView;
import android.os.Bundle;
import androidx.annotation.k0;
import com.untis.mobile.services.infocenter.a;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import java.util.ArrayList;
import android.widget.ListView;
import android.view.View;
import android.widget.BaseAdapter;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class OfficeHourPageFragment extends UmFragment
{
    private static final String N = "thingsYouShouldNotEatAtHome";
    private static final String O = "oleeeeeeee";
    private Profile G;
    private BaseAdapter H;
    private View I;
    private ListView J;
    @j0
    private final ArrayList<OfficeHour> K;
    private boolean L;
    private a M;
    
    public OfficeHourPageFragment() {
        this.K = new ArrayList<OfficeHour>();
        this.L = false;
    }
    
    @j0
    public static OfficeHourPageFragment A(final String s, @k0 final ArrayList<OfficeHour> list) {
        final OfficeHourPageFragment officeHourPageFragment = new OfficeHourPageFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("oleeeeeeee", s);
        if (list != null) {
            arguments.putParcelableArrayList("thingsYouShouldNotEatAtHome", (ArrayList)list);
        }
        officeHourPageFragment.setArguments(arguments);
        return officeHourPageFragment;
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 800) {
            super.onActivityResult(n, n2, intent);
        }
        else if (b) {
            final BaseAdapter h = this.H;
            if (h != null && h instanceof k) {
                this.M.z(d.n(this.getContext()).j()).C5((b)new c(this), (b)q5.d.G);
            }
        }
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            final ArrayList parcelableArrayList = arguments.getParcelableArrayList("thingsYouShouldNotEatAtHome");
            if (parcelableArrayList != null) {
                this.K.addAll(parcelableArrayList);
                this.L = true;
            }
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("oleeeeeeee", ""));
        }
        this.M = new w(this.G.getUniqueId());
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131493111, viewGroup, false);
        this.I = inflate;
        this.J = (ListView)inflate.findViewById(2131297722);
        if (this.K.isEmpty() && !this.L) {
            this.H = new com.untis.mobile.ui.adapters.a(this.getContext(), 9);
        }
        else {
            final com.untis.mobile.ui.activities.common.b b = (com.untis.mobile.ui.activities.common.b)this.getActivity();
            if (b != null) {
                this.H = new k(b, this.K);
                this.J.setOnItemClickListener((AdapterView$OnItemClickListener)new q5.a(this));
                this.J.setEmptyView(this.I.findViewById(2131297721));
            }
        }
        this.J.setAdapter((ListAdapter)this.H);
        return this.I;
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("thingsYouShouldNotEatAtHome", (ArrayList)this.K);
        bundle.putString("oleeeeeeee", this.G.getUniqueId());
    }
    
    public void v(@j0 final List<OfficeHour> c) {
        this.K.clear();
        this.K.addAll(c);
        Collections.sort(this.K);
        final k k = new k((com.untis.mobile.ui.activities.common.b)this.getActivity(), c);
        this.H = k;
        this.J.setAdapter((ListAdapter)k);
        this.J.setOnItemClickListener((AdapterView$OnItemClickListener)new q5.b(this));
        this.J.setEmptyView(this.I.findViewById(2131297721));
    }
}
