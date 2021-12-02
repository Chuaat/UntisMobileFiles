// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import com.untis.mobile.api.common.timetable.UMOfficeHourRegistrationTimeSlot;
import java.util.List;
import java.io.Serializable;

public class GetOfficeHourRegistrationsResponse implements Serializable
{
    public String teacherText;
    public List<UMOfficeHourRegistrationTimeSlot> timeSlots;
    public String userText;
}
