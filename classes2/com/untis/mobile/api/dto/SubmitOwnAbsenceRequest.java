// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.dto;

public class SubmitOwnAbsenceRequest extends AuthenticatedRequest
{
    public long absenceId;
    public long absenceReasonId;
    public String endDateTime;
    public String startDateTime;
    public long studentId;
    public String text;
}
