// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.absence;

import java.util.ArrayList;
import java.util.List;

public class UMAbsenceResult
{
    public List<UMStudentAbsence> absences;
    public List<UMStudentAttendance> attendances;
    public List<UMStudentAbsence> conflicts;
    public boolean separateSaveAllowed;
    
    public UMAbsenceResult() {
        this.absences = new ArrayList<UMStudentAbsence>();
        this.conflicts = new ArrayList<UMStudentAbsence>();
        this.attendances = new ArrayList<UMStudentAttendance>();
    }
}
