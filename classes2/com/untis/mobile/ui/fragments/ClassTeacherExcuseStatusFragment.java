// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.annotation.j0;
import android.view.View;
import android.widget.AdapterView;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class ClassTeacherExcuseStatusFragment extends UmFragment
{
    public static final String J = "ctesf_horsepower";
    private static final String K = "profile_id";
    private static final String L = "absence";
    private Profile G;
    private StudentAbsence H;
    private a I;
    
    @j0
    public static ClassTeacherExcuseStatusFragment s(@j0 final Profile profile, @j0 final StudentAbsence studentAbsence) {
        final ClassTeacherExcuseStatusFragment classTeacherExcuseStatusFragment = new ClassTeacherExcuseStatusFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("profile_id", profile.getUniqueId());
        arguments.putParcelable("absence", (Parcelable)studentAbsence);
        classTeacherExcuseStatusFragment.setArguments(arguments);
        return classTeacherExcuseStatusFragment;
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            this.G = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("profile_id"));
            this.H = (StudentAbsence)arguments.getParcelable("absence");
        }
        this.I = this.G.getMasterDataService();
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131493079, viewGroup, false);
        final ListView listView = (ListView)inflate.findViewById(2131297539);
        final k adapter = new k(this.getContext(), this.G, this.I.X(), this.H.getExcuse());
        listView.setAdapter((ListAdapter)adapter);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new q(this, adapter));
        return inflate;
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("profile_id", this.G.getUniqueId());
        bundle.putParcelable("absence", (Parcelable)this.H);
    }
}
