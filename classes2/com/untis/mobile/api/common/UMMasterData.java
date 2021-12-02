// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import java.util.ArrayList;
import com.untis.mobile.api.common.masterdata.UMTimeGrid;
import com.untis.mobile.api.common.masterdata.UMTeachingMethod;
import com.untis.mobile.api.common.masterdata.UMTeacher;
import com.untis.mobile.api.common.masterdata.UMSubject;
import com.untis.mobile.api.common.masterdata.UMSchoolyear;
import com.untis.mobile.api.common.masterdata.UMRoom;
import com.untis.mobile.api.common.masterdata.UMKlasse;
import com.untis.mobile.api.common.masterdata.UMHoliday;
import com.untis.mobile.api.common.masterdata.UMExcuseStatus;
import com.untis.mobile.api.common.masterdata.UMEventReason;
import com.untis.mobile.api.common.masterdata.UMEventReasonGroup;
import com.untis.mobile.api.common.masterdata.UMDuty;
import com.untis.mobile.api.common.masterdata.UMDepartment;
import com.untis.mobile.api.common.masterdata.UMAbsenceReason;
import java.util.List;
import java.io.Serializable;

public class UMMasterData implements Serializable
{
    public List<UMAbsenceReason> absenceReasons;
    public List<UMDepartment> departments;
    public List<UMDuty> duties;
    public List<UMEventReasonGroup> eventReasonGroups;
    public List<UMEventReason> eventReasons;
    public List<UMExcuseStatus> excuseStatuses;
    public List<UMHoliday> holidays;
    public List<UMKlasse> klassen;
    public List<UMRoom> rooms;
    public List<UMSchoolyear> schoolyears;
    public List<UMSubject> subjects;
    public List<UMTeacher> teachers;
    public List<UMTeachingMethod> teachingMethods;
    public UMTimeGrid timeGrid;
    public long timeStamp;
    
    public UMMasterData() {
        this.absenceReasons = new ArrayList<UMAbsenceReason>();
        this.departments = new ArrayList<UMDepartment>();
        this.duties = new ArrayList<UMDuty>();
        this.eventReasons = new ArrayList<UMEventReason>();
        this.eventReasonGroups = new ArrayList<UMEventReasonGroup>();
        this.excuseStatuses = new ArrayList<UMExcuseStatus>();
        this.holidays = new ArrayList<UMHoliday>();
        this.klassen = new ArrayList<UMKlasse>();
        this.rooms = new ArrayList<UMRoom>();
        this.subjects = new ArrayList<UMSubject>();
        this.teachers = new ArrayList<UMTeacher>();
        this.teachingMethods = new ArrayList<UMTeachingMethod>();
        this.schoolyears = new ArrayList<UMSchoolyear>();
    }
}
