// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper;

import androidx.annotation.k0;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.LegacyRight;
import com.untis.mobile.utils.mapper.common.c;

public class a extends c<String, LegacyRight>
{
    public static final c<String, LegacyRight> a;
    
    static {
        a = new a();
    }
    
    @k0
    public LegacyRight k(@j0 final String s) {
        return LegacyRight.fromName(s);
    }
    
    public String l(@j0 final LegacyRight legacyRight) {
        return legacyRight.getName().toLowerCase();
    }
}
