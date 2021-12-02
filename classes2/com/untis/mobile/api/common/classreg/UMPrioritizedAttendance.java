// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.classreg;

import java.util.ArrayList;
import java.util.List;
import com.untis.mobile.api.enumeration.UMActivityType;
import java.io.Serializable;

public class UMPrioritizedAttendance implements Serializable
{
    public UMActivityType activityType;
    public String endDateTime;
    public List<Long> klassenIds;
    public long periodId;
    public List<Long> roomIds;
    public String startDateTime;
    public long studentId;
    public long subjectId;
    public List<Long> teacherIds;
    
    public UMPrioritizedAttendance() {
        this.klassenIds = new ArrayList<Long>();
        this.roomIds = new ArrayList<Long>();
        this.teacherIds = new ArrayList<Long>();
    }
}
