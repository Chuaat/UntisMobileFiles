// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import java.util.ArrayList;
import com.untis.mobile.api.common.timetable.UMPeriod;
import java.util.List;
import java.io.Serializable;

public class UMTimetable implements Serializable
{
    public String displayableEndDate;
    public String displayableStartDate;
    public List<UMPeriod> periods;
    
    public UMTimetable() {
        this.periods = new ArrayList<UMPeriod>();
    }
}
