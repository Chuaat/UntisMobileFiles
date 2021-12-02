// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import java.util.List;

public class CreateImmediateAbsenceResponse
{
    public List<UMStudentAbsence> absences;
    
    public CreateImmediateAbsenceResponse() {
        this.absences = new ArrayList<UMStudentAbsence>();
    }
}
