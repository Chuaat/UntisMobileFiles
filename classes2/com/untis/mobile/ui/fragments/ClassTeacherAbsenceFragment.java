// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import java.util.Iterator;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Collection;
import androidx.annotation.k0;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.annotation.j0;
import android.widget.AdapterView;
import android.view.View;
import java.util.ArrayList;
import com.untis.mobile.services.classbook.a;
import android.widget.ListView;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class ClassTeacherAbsenceFragment extends UmFragment
{
    public static final String L = "ctaf_goldfishpoop";
    private static final String M = "karotte";
    private static final String N = "radischen";
    private Profile G;
    private final List<StudentAbsence> H;
    private ListView I;
    private b J;
    private a K;
    
    public ClassTeacherAbsenceFragment() {
        this.H = new ArrayList<StudentAbsence>();
    }
    
    @j0
    public static ClassTeacherAbsenceFragment s(@j0 final Profile profile, @j0 final List<StudentAbsence> list) {
        final ClassTeacherAbsenceFragment classTeacherAbsenceFragment = new ClassTeacherAbsenceFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("karotte", profile.getUniqueId());
        arguments.putLongArray("radischen", v(list));
        classTeacherAbsenceFragment.setArguments(arguments);
        return classTeacherAbsenceFragment;
    }
    
    @j0
    private List<StudentAbsence> u(@j0 final String s, @k0 final long[] array) {
        if (array != null && array.length != 0) {
            final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
            for (int length = array.length, i = 0; i < length; ++i) {
                final StudentAbsence z = this.K.Z(array[i]);
                if (z != null) {
                    list.add(z);
                }
            }
            return list;
        }
        return new ArrayList<StudentAbsence>();
    }
    
    @j0
    private static long[] v(@j0 final List<StudentAbsence> list) {
        final long[] array = new long[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array[i] = list.get(i).getId();
        }
        return array;
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("karotte", ""));
            this.G = l;
            this.K = l.getClassBookService();
            final Profile g = this.G;
            if (g != null) {
                this.H.addAll(this.u(g.getUniqueId(), arguments.getLongArray("radischen")));
            }
        }
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131493075, viewGroup, false);
        inflate.setId(2131298713);
        this.I = (ListView)inflate.findViewById(2131297514);
        final b b = new b(this.getContext(), this.G, this.H);
        this.J = b;
        this.I.setAdapter((ListAdapter)b);
        this.I.setOnItemClickListener((AdapterView$OnItemClickListener)new c(this, inflate));
        return inflate;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("karotte", this.G.getUniqueId());
        bundle.putLongArray("radischen", v(this.H));
    }
    
    public void w(@j0 final StudentAbsence studentAbsence) {
        final Iterator<StudentAbsence> iterator = this.H.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == studentAbsence.getId()) {
                iterator.remove();
                break;
            }
        }
        this.H.add(studentAbsence);
        final b b = new b(this.getContext(), this.G, this.H);
        this.J = b;
        this.I.setAdapter((ListAdapter)b);
    }
}
