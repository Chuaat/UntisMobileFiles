// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.timetable;

import com.untis.mobile.api.enumeration.UMOfficeHourRegistrationTimeSlotState;
import java.io.Serializable;

public class UMOfficeHourRegistrationTimeSlot implements Serializable
{
    public String endTime;
    public String startTime;
    public UMOfficeHourRegistrationTimeSlotState state;
}
