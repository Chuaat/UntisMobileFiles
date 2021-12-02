// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.timetable.UMOfficeHourRegistrationTimeSlot;
import com.untis.mobile.api.common.error.UMError;
import java.util.List;
import java.io.Serializable;

public class SubmitOfficeHourRegistrationResponse implements Serializable
{
    public List<UMError> errors;
    public List<UMOfficeHourRegistrationTimeSlot> timeSlots;
    
    public SubmitOfficeHourRegistrationResponse() {
        this.errors = new ArrayList<UMError>();
    }
}
