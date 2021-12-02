// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.api.common.masterdata.UMAbsenceReason;

public class b extends com.untis.mobile.utils.mapper.common.b<UMAbsenceReason, j4.b>
{
    @j0
    private static final b a;
    
    static {
        a = new b();
    }
    
    private b() {
    }
    
    @j0
    public static b j() {
        return b.a;
    }
    
    @k0
    public j4.b i(@j0 final UMAbsenceReason umAbsenceReason) {
        return new j4.b(umAbsenceReason.id, h0.f(umAbsenceReason.name), h0.f(umAbsenceReason.longName), umAbsenceReason.active);
    }
}
