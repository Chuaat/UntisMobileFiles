// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.api.common.masterdata.UMTeachingMethod;
import com.untis.mobile.utils.mapper.common.b;

public class p extends b<UMTeachingMethod, v4.b>
{
    @j0
    private static final p a;
    
    static {
        a = new p();
    }
    
    private p() {
    }
    
    @j0
    public static p j() {
        return p.a;
    }
    
    @k0
    public v4.b i(@j0 final UMTeachingMethod umTeachingMethod) {
        return new v4.b(umTeachingMethod.id, h0.f(umTeachingMethod.name), h0.f(umTeachingMethod.longName));
    }
}
