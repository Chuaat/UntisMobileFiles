// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import java.util.Iterator;
import androidx.fragment.app.Fragment;
import com.untis.mobile.ui.fragments.InfoCenterAbsenceChildFragment;
import java.util.Collection;
import java.util.ArrayList;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.persistence.models.profile.Child;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;

public class e extends r
{
    @j0
    private FragmentManager a;
    @j0
    private Profile b;
    @j0
    private final List<Child> c;
    @k0
    private List<StudentAbsence> d;
    private org.joda.time.r e;
    private boolean f;
    
    public e(@j0 final FragmentManager a, @j0 final Profile b, @k0 final List<StudentAbsence> d, @j0 final org.joda.time.r e, final boolean f) {
        super(a);
        final ArrayList<Child> c = new ArrayList<Child>();
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        Label_0153: {
            Child child;
            if (b.getEntityType().isParentRole()) {
                if (b.getUserChildren().size() > 0) {
                    c.addAll((Collection<?>)b.getUserChildren());
                }
                if (b.getUserChildren().size() != 0) {
                    break Label_0153;
                }
                child = new Child(b.getEntityId(), b.getUserDisplayName(), "", false);
            }
            else {
                if (!b.getEntityType().isStudentRole()) {
                    break Label_0153;
                }
                child = new Child(b.getEntityId(), b.getUserDisplayName(), "", false);
            }
            c.add(child);
        }
        if (!c.isEmpty()) {
            c.add(0, null);
        }
    }
    
    private List<InfoCenterAbsenceChildFragment> b() {
        final ArrayList<InfoCenterAbsenceChildFragment> list = new ArrayList<InfoCenterAbsenceChildFragment>();
        for (final Fragment fragment : this.a.G0()) {
            if (fragment instanceof InfoCenterAbsenceChildFragment) {
                list.add((InfoCenterAbsenceChildFragment)fragment);
            }
        }
        return list;
    }
    
    public int a(@k0 final Child child) {
        int index = this.c.indexOf(child);
        if (index < 0) {
            index = 0;
        }
        return index;
    }
    
    public void c(@j0 final org.joda.time.r e) {
        this.e = e;
        for (final InfoCenterAbsenceChildFragment infoCenterAbsenceChildFragment : this.b()) {
            if (infoCenterAbsenceChildFragment != null) {
                infoCenterAbsenceChildFragment.u(e);
            }
        }
    }
    
    public void d(final boolean f) {
        this.f = f;
        for (final InfoCenterAbsenceChildFragment infoCenterAbsenceChildFragment : this.b()) {
            if (infoCenterAbsenceChildFragment != null) {
                infoCenterAbsenceChildFragment.v(f);
            }
        }
    }
    
    public int getCount() {
        return this.c.size();
    }
    
    public Fragment getItem(final int n) {
        return InfoCenterAbsenceChildFragment.t(this.b, this.c.get(n), this.d, this.e, this.f);
    }
}
