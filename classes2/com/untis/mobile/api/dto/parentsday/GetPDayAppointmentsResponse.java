// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto.parentsday;

import java.util.HashSet;
import java.util.HashMap;
import com.untis.mobile.api.common.masterdata.UMStudent;
import com.untis.mobile.api.common.parentsday.UMPDay;
import java.util.Set;
import com.untis.mobile.api.common.parentsday.UMPDayAppointment;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

public class GetPDayAppointmentsResponse implements Serializable
{
    public Map<Long, List<UMPDayAppointment>> appointments;
    public Set<UMPDay> referencedPDays;
    public Set<UMStudent> referencedStudents;
    
    public GetPDayAppointmentsResponse() {
        this.appointments = new HashMap<Long, List<UMPDayAppointment>>();
        this.referencedPDays = new HashSet<UMPDay>();
        this.referencedStudents = new HashSet<UMStudent>();
    }
}
