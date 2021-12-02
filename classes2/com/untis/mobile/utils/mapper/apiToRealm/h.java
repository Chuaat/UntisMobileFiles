// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import j4.d;
import com.untis.mobile.api.common.masterdata.UMExcuseStatus;
import com.untis.mobile.utils.mapper.common.b;

public class h extends b<UMExcuseStatus, d>
{
    @j0
    private static final h a;
    
    static {
        a = new h();
    }
    
    private h() {
    }
    
    @j0
    public static h j() {
        return h.a;
    }
    
    @k0
    public d i(@j0 final UMExcuseStatus umExcuseStatus) {
        return new d(umExcuseStatus.id, h0.f(umExcuseStatus.name), h0.f(umExcuseStatus.longName), umExcuseStatus.excused);
    }
}
