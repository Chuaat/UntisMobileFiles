// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.timetable;

import java.util.ArrayList;
import com.untis.mobile.api.common.classreg.UMSeatingPlan;
import com.untis.mobile.api.common.classreg.UMPrioritizedAttendance;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import com.untis.mobile.api.common.classreg.UMStudentExemption;
import com.untis.mobile.api.common.classreg.UMClassRole;
import com.untis.mobile.api.common.classreg.UMClassRegEvent;
import com.untis.mobile.api.common.messenger.UMMessengerChannel;
import com.untis.mobile.api.enumeration.UMPeriodRight;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import java.util.List;
import java.io.Serializable;

public class UMPeriodData implements Serializable
{
    public boolean absenceChecked;
    public List<UMStudentAbsence> absences;
    public List<UMPeriodRight> can;
    public UMMessengerChannel channel;
    public List<UMClassRegEvent> classRegEvents;
    public List<UMClassRole> classRoles;
    public List<UMStudentExemption> exemptions;
    public List<UMHomeWork> homeWorks;
    public List<UMPrioritizedAttendance> prioritizedAttendances;
    public UMSeatingPlan seatingPlan;
    public List<Long> studentIds;
    public UMPeriodText text;
    public UMLessonTopic topic;
    public long ttId;
    
    public UMPeriodData() {
        this.can = new ArrayList<UMPeriodRight>();
    }
}
