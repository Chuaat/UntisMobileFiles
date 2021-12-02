// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.fragment.app.FragmentManager;
import com.untis.mobile.ui.fragments.timetableselection.RoomTimeTableSelectionPageFragment;
import java.util.List;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.fragment.app.r;

public class l extends r
{
    public static final int c = 2;
    public static final int d = 0;
    public static final int e = 1;
    @j0
    private final Profile a;
    @j0
    private List<RoomTimeTableSelectionPageFragment> b;
    
    public l(@j0 final FragmentManager fragmentManager, @j0 final Profile a) {
        super(fragmentManager, 1);
        this.b = new ArrayList<RoomTimeTableSelectionPageFragment>();
        this.a = a;
    }
    
    public void a(@j0 final String s) {
        for (final RoomTimeTableSelectionPageFragment roomTimeTableSelectionPageFragment : this.b) {
            if (roomTimeTableSelectionPageFragment == null) {
                continue;
            }
            roomTimeTableSelectionPageFragment.C(s);
        }
    }
    
    public int getCount() {
        return 2;
    }
    
    public Fragment getItem(final int n) {
        final RoomTimeTableSelectionPageFragment b = RoomTimeTableSelectionPageFragment.B(this.a, n);
        this.b.add(b);
        return b;
    }
}
