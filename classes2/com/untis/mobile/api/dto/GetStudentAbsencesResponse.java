// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import java.util.List;
import java.io.Serializable;

public class GetStudentAbsencesResponse implements Serializable
{
    public List<UMStudentAbsence> absences;
    
    public GetStudentAbsencesResponse() {
        this.absences = new ArrayList<UMStudentAbsence>();
    }
}
