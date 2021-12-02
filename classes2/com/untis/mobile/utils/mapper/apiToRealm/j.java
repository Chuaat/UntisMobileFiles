// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import org.joda.time.base.g;
import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import w4.c;
import com.untis.mobile.api.common.masterdata.UMHoliday;
import com.untis.mobile.utils.mapper.common.b;

public class j extends b<UMHoliday, c>
{
    @j0
    private static final j a;
    
    static {
        a = new j();
    }
    
    private j() {
    }
    
    @j0
    public static j j() {
        return j.a;
    }
    
    @k0
    public c i(@j0 final UMHoliday umHoliday) {
        return new c(umHoliday.id, h0.f(umHoliday.name), h0.f(umHoliday.longName), ((g)b.d(umHoliday.startDate).F0()).n(), ((g)b.d(umHoliday.endDate).F0().S0(1).v0(1)).n());
    }
}
