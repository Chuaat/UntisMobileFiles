// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.HashMap;
import com.untis.mobile.api.common.absence.UMAbsenceResult;
import java.util.Map;

public class CreateAbsencesResponse
{
    public Map<Long, UMAbsenceResult> resultPerStudent;
    
    public CreateAbsencesResponse() {
        this.resultPerStudent = new HashMap<Long, UMAbsenceResult>();
    }
}
