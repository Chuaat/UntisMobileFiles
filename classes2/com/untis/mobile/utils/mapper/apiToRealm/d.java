// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import androidx.annotation.k0;
import androidx.annotation.j0;
import l4.c;
import com.untis.mobile.api.common.masterdata.UMEventReasonGroup;
import com.untis.mobile.utils.mapper.common.b;

public class d extends b<UMEventReasonGroup, c>
{
    public static final b<UMEventReasonGroup, c> a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    @k0
    public c i(@j0 final UMEventReasonGroup umEventReasonGroup) {
        final c c = new c();
        c.x8(umEventReasonGroup.id);
        c.z8(umEventReasonGroup.name);
        c.y8(umEventReasonGroup.longName);
        c.w8(umEventReasonGroup.active);
        return c;
    }
}
