// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.ArrayList;
import com.untis.mobile.api.enumeration.ElementType;
import java.util.List;

public class GetTimetableRequest extends AuthenticatedRequest
{
    public String endDate;
    public long id;
    public long masterDataTimestamp;
    public String startDate;
    @Deprecated
    public long timetableTimestamp;
    public List<Long> timetableTimestamps;
    public ElementType type;
    
    public GetTimetableRequest() {
        this.timetableTimestamps = new ArrayList<Long>();
    }
}
