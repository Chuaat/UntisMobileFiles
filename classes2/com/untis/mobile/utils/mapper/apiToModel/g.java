// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.apiToModel;

import androidx.annotation.k0;
import java.util.Iterator;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import java.util.List;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import com.untis.mobile.api.common.masterdata.UMExcuse;
import com.untis.mobile.utils.mapper.common.b;

public class g extends b<UMExcuse, Excuse>
{
    @j0
    private final List<ExcuseStatus> a;
    
    private g(@j0 final List<ExcuseStatus> a) {
        this.a = a;
    }
    
    @k0
    private ExcuseStatus i(final long n) {
        for (final ExcuseStatus excuseStatus : this.a) {
            if (excuseStatus.getId() == n) {
                return excuseStatus;
            }
        }
        return null;
    }
    
    @j0
    public static g k(@j0 final List<ExcuseStatus> list) {
        return new g(list);
    }
    
    @j0
    public Excuse j(@j0 final UMExcuse umExcuse) {
        return new Excuse(umExcuse.id, this.i(umExcuse.excuseStatusId), umExcuse.text, umExcuse.number, b.d(umExcuse.date));
    }
}
