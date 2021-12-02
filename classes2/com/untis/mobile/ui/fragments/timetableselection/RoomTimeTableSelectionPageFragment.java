// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.timetableselection;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.annotation.k0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import r5.c;
import r5.d;
import com.untis.mobile.utils.g0;
import android.view.View$OnClickListener;
import android.widget.AdapterView$OnItemClickListener;
import r5.b;
import android.widget.ListAdapter;
import java.util.List;
import android.widget.AdapterView;
import android.os.Bundle;
import androidx.annotation.j0;
import com.untis.mobile.utils.u0;
import com.untis.mobile.services.masterdata.a;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.untis.mobile.ui.adapters.timetableselection.g;
import android.widget.ListView;
import android.view.View;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class RoomTimeTableSelectionPageFragment extends UmFragment
{
    private static final String Q = "page";
    private static final String R = "profile_id";
    private Profile G;
    private int H;
    private View I;
    private ListView J;
    private g K;
    private CardView L;
    private TextView M;
    private ProgressBar N;
    private a O;
    private com.untis.mobile.services.booking.a P;
    
    public static RoomTimeTableSelectionPageFragment B(@j0 final Profile profile, final int n) {
        final RoomTimeTableSelectionPageFragment roomTimeTableSelectionPageFragment = new RoomTimeTableSelectionPageFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("profile_id", profile.getUniqueId());
        arguments.putInt("page", n);
        roomTimeTableSelectionPageFragment.setArguments(arguments);
        return roomTimeTableSelectionPageFragment;
    }
    
    private void v() {
        final g g = new g(this.getContext(), this.G, this.O.m(true));
        this.K = g;
        this.J.setAdapter((ListAdapter)g);
        this.J.setOnItemClickListener((AdapterView$OnItemClickListener)new b(this));
    }
    
    private void w() {
        if (!com.untis.mobile.utils.a.a(this.getContext()).I(this.G)) {
            this.I.setOnClickListener((View$OnClickListener)null);
            this.M.setText(2131886537);
            ((FrameLayout)this.L).setVisibility(0);
            return;
        }
        if (g0.a(this.getContext())) {
            this.N.setVisibility(0);
            this.P.c(com.untis.mobile.utils.time.a.a(), com.untis.mobile.utils.time.a.a().V0(15)).C5((rx.functions.b)new d(this), (rx.functions.b)new c(this));
        }
        else {
            ((FrameLayout)this.L).setVisibility(0);
        }
    }
    
    public void C(@j0 final String s) {
        final g k = this.K;
        if (k != null) {
            k.n(s);
        }
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        this.I = layoutInflater.inflate(2131493121, viewGroup, false);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("profile_id"));
            this.H = arguments.getInt("page");
        }
        if (this.G == null) {
            this.G = com.untis.mobile.services.profile.legacy.j0.G.n();
        }
        this.O = this.G.getMasterDataService();
        this.P = this.G.getBookingService();
        this.J = (ListView)this.I.findViewById(2131297777);
        this.L = (CardView)this.I.findViewById(2131297774);
        this.M = (TextView)this.I.findViewById(2131297773);
        this.N = (ProgressBar)this.I.findViewById(2131297775);
        final int h = this.H;
        if (h != 0) {
            if (h == 1) {
                this.w();
            }
        }
        else {
            this.v();
        }
        return this.I;
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("page", this.H);
        bundle.putString("profile_id", this.G.getUniqueId());
    }
}
