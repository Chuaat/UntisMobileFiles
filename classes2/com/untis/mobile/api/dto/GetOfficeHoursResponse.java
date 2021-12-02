// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.common.timetable.UMOfficeHour;
import java.util.List;
import java.io.Serializable;

public class GetOfficeHoursResponse implements Serializable
{
    public List<UMOfficeHour> officeHours;
    
    public GetOfficeHoursResponse() {
        this.officeHours = new ArrayList<UMOfficeHour>();
    }
}
