// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.infocenter;

import androidx.fragment.app.Fragment;
import com.untis.mobile.persistence.models.profile.Child;
import java.util.Collection;
import com.untis.mobile.ui.activities.InfoCenterFilterActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.ui.adapters.j;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import java.util.ArrayList;
import com.untis.mobile.ui.fragments.InfoCenterClassTeacherFragment;
import com.untis.mobile.ui.fragments.InfoCenterThingsToDoFragment;
import com.untis.mobile.ui.fragments.InfoCenterAbsencesFragment;
import com.untis.mobile.ui.fragments.infocenter.officehours.OfficeHourPageFragment;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import com.untis.mobile.ui.activities.common.b;
import androidx.fragment.app.r;

public class d extends r
{
    @j0
    private final b a;
    @j0
    private Profile b;
    private OfficeHourPageFragment c;
    private InfoCenterAbsencesFragment d;
    private InfoCenterThingsToDoFragment e;
    private InfoCenterClassTeacherFragment f;
    @k0
    private ArrayList<OfficeHour> g;
    @k0
    private ArrayList<j.a> h;
    @k0
    private ArrayList<StudentAbsence> i;
    @j0
    private final List<c> j;
    
    public d(@j0 final b a, @j0 final FragmentManager fragmentManager, @j0 final Profile b, @j0 final List<c> j) {
        super(fragmentManager, 1);
        this.a = a;
        this.b = b;
        this.j = j;
    }
    
    @j0
    private c b(final int n) {
        return this.j.get(n);
    }
    
    @j0
    public InfoCenterFilterActivity.b a(int n) {
        n = d$a.a[this.b(n).ordinal()];
        if (n == 1) {
            return InfoCenterFilterActivity.b.H;
        }
        if (n == 2) {
            return InfoCenterFilterActivity.b.I;
        }
        if (n != 4) {
            return InfoCenterFilterActivity.b.J;
        }
        return InfoCenterFilterActivity.b.K;
    }
    
    public int c(@j0 final c c) {
        return this.j.indexOf(c);
    }
    
    public void d(@k0 final List<StudentAbsence> c) {
        if (c == null) {
            return;
        }
        this.i = new ArrayList<StudentAbsence>(c);
        final InfoCenterAbsencesFragment d = this.d;
        if (d != null) {
            d.s(c);
        }
    }
    
    public void e(@k0 final Child child) {
        final InfoCenterAbsencesFragment d = this.d;
        if (d != null) {
            d.t(child);
        }
        final InfoCenterThingsToDoFragment e = this.e;
        if (e != null) {
            e.r(child);
        }
    }
    
    public void f(@k0 final List<OfficeHour> c) {
        if (c == null) {
            return;
        }
        this.g = new ArrayList<OfficeHour>(c);
        final OfficeHourPageFragment c2 = this.c;
        if (c2 != null) {
            c2.v(c);
        }
    }
    
    public void g(@k0 final List<j.a> c) {
        if (c == null) {
            return;
        }
        this.h = new ArrayList<j.a>(c);
        final InfoCenterThingsToDoFragment e = this.e;
        if (e != null) {
            e.s(c);
        }
    }
    
    public int getCount() {
        return this.j.size();
    }
    
    public Fragment getItem(int n) {
        n = d$a.a[this.b(n).ordinal()];
        if (n == 1) {
            return this.c = OfficeHourPageFragment.A(this.b.getUniqueId(), this.g);
        }
        if (n == 2) {
            return this.d = InfoCenterAbsencesFragment.u(this.b, this.i);
        }
        if (n == 3) {
            return this.e = InfoCenterThingsToDoFragment.t(this.b, this.h);
        }
        if (n != 4) {
            return null;
        }
        return this.f = InfoCenterClassTeacherFragment.r(this.b);
    }
    
    public void h() {
        final InfoCenterThingsToDoFragment e = this.e;
        if (e != null) {
            e.v();
        }
    }
}
