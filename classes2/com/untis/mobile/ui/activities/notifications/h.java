// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.notifications;

import java.util.Collection;
import java.util.Iterator;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import com.untis.mobile.services.infocenter.w;
import java.util.ArrayList;
import com.untis.mobile.services.messages.e;
import java.util.List;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.k0;

public class h implements d
{
    @k0
    private static h G;
    
    static {
        h.G = new h();
    }
    
    private h() {
    }
    
    @j0
    private List<a> a(@j0 final Profile profile) {
        final e e = new e(profile.getUniqueId());
        final ArrayList<a> list = new ArrayList<a>();
        list.add(new a(profile, e.l(false), e.l(true).isEmpty() ^ true));
        return list;
    }
    
    @j0
    private List<g> b(@j0 final Profile profile) {
        final w w = new w(profile.getUniqueId());
        final ArrayList<g> list = new ArrayList<g>();
        final ArrayList<OfficeHour> list2 = new ArrayList<OfficeHour>();
        for (final OfficeHour officeHour : w.h(com.untis.mobile.utils.time.a.a())) {
            if (officeHour.getRegistered()) {
                list2.add(officeHour);
            }
        }
        list.add(new g(profile, list2));
        return list;
    }
    
    @j0
    public static d c() {
        return h.G;
    }
    
    @j0
    @Override
    public List<b> A(@j0 final Profile profile) {
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<b>();
        list.addAll(this.a(profile));
        final List<g> b = this.b(profile);
        if (com.untis.mobile.services.a.a.f(profile) && b.size() > 0) {
            list.addAll(b);
        }
        return (List<b>)list;
    }
}
