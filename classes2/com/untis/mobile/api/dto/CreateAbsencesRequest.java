// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import java.util.List;
import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;

public class CreateAbsencesRequest extends AuthenticatedRequest
{
    public long absenceReasonId;
    public String endDateTime;
    public long periodId;
    public String startDateTime;
    public CreateAbsenceStrategy strategy;
    public List<Long> studentIds;
    public String text;
    
    public CreateAbsencesRequest() {
        this.strategy = CreateAbsenceStrategy.WRITE;
    }
}
