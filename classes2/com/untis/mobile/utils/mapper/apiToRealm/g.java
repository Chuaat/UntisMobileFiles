// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import com.untis.mobile.api.enumeration.ElementType;
import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.api.common.masterdata.UMEventReason;
import com.untis.mobile.utils.mapper.common.b;

public class g extends b<UMEventReason, l4.b>
{
    @j0
    private static final g a;
    
    static {
        a = new g();
    }
    
    private g() {
    }
    
    @j0
    public static g j() {
        return g.a;
    }
    
    @k0
    public l4.b i(@j0 final UMEventReason umEventReason) {
        final long id = umEventReason.id;
        final String f = h0.f(umEventReason.name);
        final String f2 = h0.f(umEventReason.longName);
        final ElementType elementType = umEventReason.elementType;
        int wuType;
        if (elementType != null) {
            wuType = elementType.getWuType();
        }
        else {
            wuType = 0;
        }
        return new l4.b(id, f, f2, wuType, umEventReason.groupId, umEventReason.active);
    }
}
