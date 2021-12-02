// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.parentsday;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class UMPDayAppointment implements Serializable
{
    public boolean cancelled;
    public String endDateTime;
    public long id;
    public long roomId;
    public String startDateTime;
    public List<UMStudentSubjects> studentSubjects;
    public long teacherId;
    
    public UMPDayAppointment() {
        this.studentSubjects = new ArrayList<UMStudentSubjects>();
    }
    
    public static class UMStudentSubjects
    {
        public long studentId;
        public List<Long> subjectIds;
        
        public UMStudentSubjects() {
            this.subjectIds = new ArrayList<Long>();
        }
    }
}
