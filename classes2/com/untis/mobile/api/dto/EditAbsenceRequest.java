// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;

public class EditAbsenceRequest extends AuthenticatedRequest
{
    public long absenceId;
    public long absenceReasonId;
    public String endDateTime;
    public long periodId;
    public String startDateTime;
    public CreateAbsenceStrategy strategy;
    public String text;
    
    public EditAbsenceRequest() {
        this.strategy = CreateAbsenceStrategy.WRITE;
    }
}
