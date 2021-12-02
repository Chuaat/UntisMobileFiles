// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToRealm;

import org.joda.time.base.g;
import com.untis.mobile.utils.h0;
import androidx.annotation.k0;
import androidx.annotation.j0;
import w4.i;
import com.untis.mobile.api.common.masterdata.UMTeacher;
import com.untis.mobile.utils.mapper.common.b;

public class o extends b<UMTeacher, i>
{
    @j0
    private static final o a;
    
    static {
        a = new o();
    }
    
    private o() {
    }
    
    @j0
    public static o j() {
        return o.a;
    }
    
    @k0
    public i i(@j0 final UMTeacher umTeacher) {
        return new i(umTeacher.id, h0.f(umTeacher.name), h0.f(umTeacher.firstName), h0.f(umTeacher.lastName), ((g)b.c(umTeacher.entryDate)).n(), ((g)b.c(umTeacher.exitDate)).n(), b.a(umTeacher.foreColor), b.a(umTeacher.backColor), umTeacher.active, umTeacher.displayAllowed);
    }
}
