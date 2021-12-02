// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.HashSet;
import java.util.ArrayList;
import com.untis.mobile.api.common.masterdata.UMStudent;
import java.util.Set;
import com.untis.mobile.api.common.classreg.UMClassRegEvent;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import java.util.List;
import java.io.Serializable;

public class GetClassregDataResponse implements Serializable
{
    public List<UMStudentAbsence> absences;
    public List<UMClassRegEvent> classRegEvents;
    public Set<UMStudent> referencedStudents;
    
    public GetClassregDataResponse() {
        this.absences = new ArrayList<UMStudentAbsence>();
        this.classRegEvents = new ArrayList<UMClassRegEvent>();
        this.referencedStudents = new HashSet<UMStudent>();
    }
}
