// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import com.untis.mobile.persistence.models.EntityType;
import java.util.Collection;
import java.util.ArrayList;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.ui.fragments.InfoCenterThingsToDoChildFragment;
import com.untis.mobile.persistence.models.profile.Child;
import androidx.annotation.k0;
import java.util.List;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.fragment.app.r;

public class i extends r
{
    @j0
    private Profile a;
    @k0
    private List<j.a> b;
    @j0
    private final List<Child> c;
    private List<InfoCenterThingsToDoChildFragment> d;
    
    public i(@j0 final FragmentManager fragmentManager, @j0 final Profile a, @k0 final List<j.a> b) {
        super(fragmentManager, 1);
        final ArrayList<Child> c = new ArrayList<Child>();
        this.c = c;
        this.d = new ArrayList<InfoCenterThingsToDoChildFragment>();
        this.a = a;
        this.b = b;
        if (a.getEntityType().isParentRole()) {
            if (a.getUserChildren().size() > 0) {
                c.add(null);
            }
            if (a.getUserChildren().size() == 0) {
                c.add(new Child(a.getEntityId(), a.getUserDisplayName(), "", false));
            }
            c.addAll((Collection<?>)a.getUserChildren());
        }
        else if (a.hasAnyRole(EntityType.STUDENT)) {
            c.add(new Child(a.getEntityId(), a.getUserDisplayName(), "", false));
        }
        else {
            c.add(null);
        }
    }
    
    @k0
    public int a(@k0 final Child child) {
        int index = this.c.indexOf(child);
        if (index < 0) {
            index = 0;
        }
        return index;
    }
    
    public void b() {
        for (final InfoCenterThingsToDoChildFragment infoCenterThingsToDoChildFragment : this.d) {
            if (infoCenterThingsToDoChildFragment != null) {
                infoCenterThingsToDoChildFragment.t();
            }
        }
    }
    
    public void c() {
        for (final InfoCenterThingsToDoChildFragment infoCenterThingsToDoChildFragment : this.d) {
            if (infoCenterThingsToDoChildFragment == null) {
                continue;
            }
            infoCenterThingsToDoChildFragment.u();
        }
    }
    
    public int getCount() {
        return this.c.size();
    }
    
    public Fragment getItem(final int n) {
        final InfoCenterThingsToDoChildFragment a = InfoCenterThingsToDoChildFragment.P.a(this.a, this.c.get(n), this.b);
        this.d.add(a);
        return a;
    }
}
