// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import org.joda.time.base.g;
import j4.d;
import androidx.annotation.j0;
import io.realm.f0;
import j4.c;
import com.untis.mobile.api.common.masterdata.UMExcuse;
import com.untis.mobile.utils.mapper.common.b;

public class i extends b<UMExcuse, c>
{
    @j0
    private final f0 a;
    
    private i(@j0 final f0 a) {
        this.a = a;
    }
    
    @j0
    public static i j(@j0 final f0 f0) {
        return new i(f0);
    }
    
    @j0
    public c i(@j0 final UMExcuse umExcuse) {
        return new c(umExcuse.id, this.a.f3(d.class).I("id", umExcuse.excuseStatusId).d0(), umExcuse.text, umExcuse.number, ((g)b.d(umExcuse.date).F0()).n());
    }
}
