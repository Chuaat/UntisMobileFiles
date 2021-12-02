// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.classreg;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class UMExam implements Serializable
{
    public long departmentId;
    public String endDateTime;
    public String examType;
    public long id;
    public List<UMInvigilator> invigilators;
    public List<Long> klasseIds;
    public String name;
    public List<Long> roomIds;
    public String startDateTime;
    public long subjectId;
    public List<Long> teacherIds;
    public String text;
    
    public UMExam() {
        this.klasseIds = new ArrayList<Long>();
        this.roomIds = new ArrayList<Long>();
        this.teacherIds = new ArrayList<Long>();
        this.invigilators = new ArrayList<UMInvigilator>();
    }
}
