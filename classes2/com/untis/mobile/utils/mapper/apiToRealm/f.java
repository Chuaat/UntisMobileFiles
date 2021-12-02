// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.api.common.masterdata.UMEventReason;
import com.untis.mobile.utils.mapper.common.b;

public class f extends b<UMEventReason, l4.b>
{
    public static final b<UMEventReason, l4.b> a;
    
    static {
        a = new f();
    }
    
    private f() {
    }
    
    @k0
    public l4.b i(@j0 final UMEventReason umEventReason) {
        final l4.b b = new l4.b();
        b.B8(umEventReason.id);
        b.D8(umEventReason.name);
        b.C8(umEventReason.longName);
        b.z8(umEventReason.elementType.getWuType());
        b.A8(umEventReason.groupId);
        b.y8(umEventReason.active);
        return b;
    }
}
