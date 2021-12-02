// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import l4.c;
import com.untis.mobile.api.common.masterdata.UMEventReasonGroup;
import com.untis.mobile.utils.mapper.common.b;

public class e extends b<UMEventReasonGroup, c>
{
    @j0
    private static final e a;
    
    static {
        a = new e();
    }
    
    private e() {
    }
    
    @j0
    public static e j() {
        return e.a;
    }
    
    @k0
    public c i(@j0 final UMEventReasonGroup umEventReasonGroup) {
        return new c(umEventReasonGroup.id, h0.f(umEventReasonGroup.name), h0.f(umEventReasonGroup.longName), umEventReasonGroup.active);
    }
}
