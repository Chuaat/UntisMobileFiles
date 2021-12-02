// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import com.untis.mobile.api.common.UMPerson;
import java.util.Set;
import com.untis.mobile.api.common.timetable.UMPeriodData;
import java.util.Map;
import java.io.Serializable;

public class GetPeriodDataResponse implements Serializable
{
    public Map<Long, UMPeriodData> dataByTTId;
    public Set<UMPerson> referencedStudents;
}
