// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import org.joda.time.base.g;
import io.realm.l0;
import com.untis.mobile.utils.h0;
import androidx.annotation.j0;
import u4.a;
import com.untis.mobile.api.common.parentsday.UMPDay;
import com.untis.mobile.utils.mapper.common.b;

public class l extends b<UMPDay, a>
{
    @j0
    private static final l a;
    
    static {
        a = new l();
    }
    
    private l() {
    }
    
    @j0
    public static l j() {
        return l.a;
    }
    
    @j0
    public a i(@j0 final UMPDay umpDay) {
        return new a(umpDay.id, h0.f(umpDay.name), ((g)b.c(umpDay.startDateTime)).n(), ((g)b.c(umpDay.endDateTime)).n(), new l0<u4.b>());
    }
}
