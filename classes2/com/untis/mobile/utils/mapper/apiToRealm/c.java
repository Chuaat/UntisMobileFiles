// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.api.common.masterdata.UMDepartment;
import com.untis.mobile.utils.mapper.common.b;

public class c extends b<UMDepartment, w4.b>
{
    @j0
    private static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    @j0
    public static c j() {
        return c.a;
    }
    
    @k0
    public w4.b i(@j0 final UMDepartment umDepartment) {
        return new w4.b(umDepartment.id, h0.f(umDepartment.name), h0.f(umDepartment.longName));
    }
}
