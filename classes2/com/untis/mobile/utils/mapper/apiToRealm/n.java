// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import w4.e;
import com.untis.mobile.api.common.masterdata.UMRoom;
import com.untis.mobile.utils.mapper.common.b;

public class n extends b<UMRoom, e>
{
    @j0
    private static final n a;
    
    static {
        a = new n();
    }
    
    private n() {
    }
    
    @j0
    public static n j() {
        return n.a;
    }
    
    @k0
    public e i(@j0 final UMRoom umRoom) {
        return new e(umRoom.id, h0.f(umRoom.name), h0.f(umRoom.longName), b.a(umRoom.foreColor), b.a(umRoom.backColor), umRoom.active, umRoom.displayAllowed);
    }
}
