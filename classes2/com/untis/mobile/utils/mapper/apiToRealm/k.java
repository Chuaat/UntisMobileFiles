// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import org.joda.time.base.g;
import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import w4.d;
import com.untis.mobile.api.common.masterdata.UMKlasse;
import com.untis.mobile.utils.mapper.common.b;

public class k extends b<UMKlasse, d>
{
    @j0
    private static final k a;
    
    static {
        a = new k();
    }
    
    private k() {
    }
    
    @j0
    public static k j() {
        return k.a;
    }
    
    @k0
    public d i(@j0 final UMKlasse umKlasse) {
        return new d(umKlasse.id, h0.f(umKlasse.name), h0.f(umKlasse.longName), ((g)b.d(umKlasse.startDate).F0()).n(), ((g)b.d(umKlasse.endDate).F0().S0(1).v0(1)).n(), b.a(umKlasse.foreColor), b.a(umKlasse.backColor), umKlasse.active, umKlasse.displayable);
    }
}
