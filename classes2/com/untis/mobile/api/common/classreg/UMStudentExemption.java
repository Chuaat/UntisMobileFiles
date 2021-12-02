// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.classreg;

import com.untis.mobile.api.enumeration.WeekDay;
import java.io.Serializable;

public class UMStudentExemption implements Serializable
{
    public String endDate;
    public String endTime;
    public String exemptionReason;
    public long id;
    public String startDate;
    public String startTime;
    public long studentId;
    public String subjectGroup;
    public long subjectId;
    public String text;
    public WeekDay weekDay;
}
