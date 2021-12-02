// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import org.joda.time.t;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.realm.period.g;
import com.untis.mobile.persistence.realm.period.c;
import java.util.List;
import com.untis.mobile.utils.mapper.common.b;

public class a extends b<List<c>, List<g>>
{
    @j0
    private final EntityType a;
    private final long b;
    private final long c;
    @j0
    private t d;
    @j0
    private t e;
    
    private a(@j0 final EntityType a, final long b, final long c, @j0 final t d, @j0 final t e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @j0
    public static a j(@j0 final EntityType entityType, final long n, final long n2, @j0 final t t, @j0 final t t2) {
        return new a(entityType, n, n2, t, t2);
    }
    
    @j0
    public List<g> i(@j0 final List<c> list) {
        final ArrayList<g> list2 = new ArrayList<g>();
        final HashMap<Object, List<c>> hashMap = (HashMap<Object, List<c>>)new HashMap<Object, Object>();
        for (final c c : list) {
            final t h1 = new org.joda.time.c(c.E8()).h1();
            List<c> list3;
            if ((list3 = hashMap.get(h1)) == null) {
                list3 = new ArrayList<c>();
                hashMap.put(h1, list3);
            }
            list3.add(c);
        }
        for (final Map.Entry<t, List<c>> entry : hashMap.entrySet()) {
            list2.add(new g(g.P.a(this.a.getWebuntisId(), this.b, ((org.joda.time.base.a)entry.getKey().F0()).g4("yyyy-MM-dd")), this.a.getWebuntisId(), this.b, ((org.joda.time.base.g)entry.getKey().F0()).n(), com.untis.mobile.utils.mapper.common.b.h(entry.getValue()), this.c));
        }
        return list2;
    }
}
