// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.help;

import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.ArrayList;
import androidx.fragment.app.FragmentManager;
import androidx.annotation.j0;
import java.util.List;
import androidx.fragment.app.r;

public class a extends r
{
    @j0
    private final List<b> a;
    
    public a(@j0 final FragmentManager fragmentManager, @j0 final List<b> list) {
        super(fragmentManager);
        (this.a = new ArrayList<b>()).addAll(list);
    }
    
    public int getCount() {
        return this.a.size();
    }
    
    public Fragment getItem(final int n) {
        final b b = this.a.get(n);
        final int count = this.getCount();
        boolean b2 = true;
        if (n != count - 1) {
            b2 = false;
        }
        return HelpPageFragment.v(b, b2);
    }
}
